package com.MovieService.MovieServices.service;


import com.MovieService.MovieServices.dto.RatingsRequestDTO;
import com.MovieService.MovieServices.dto.RatingsResponseDTO;
import com.MovieService.MovieServices.model.mapper.RatingsMapper;
import com.MovieService.MovieServices.repository.RatingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
@RequiredArgsConstructor
public class Ratingslmpl implements RatingsService {
    private final RatingsRepository ratingsRepository;
    private final RatingsMapper ratingsMapper;

    @Override
    public RatingsResponseDTO createRating(RatingsRequestDTO requestDTO) {
        var ratingEntity = ratingsMapper.toEntity(requestDTO);
        var savedRating = ratingsRepository.save(ratingEntity);
        return ratingsMapper.toDTO(savedRating);
    }

    @Override
    public RatingsResponseDTO getRatingById(Long id) {
        var ratingEntity = ratingsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rating not found"));
        return ratingsMapper.toDTO(ratingEntity);
    }

    @Override
    public List<RatingsResponseDTO> getAllRatings() {
        var ratings = ratingsRepository.findAll();
        return ratingsMapper.toDTOList(ratings);
    }

    @Override
    public RatingsResponseDTO updateRating(Long id, RatingsRequestDTO requestDTO) {
        var existingRating = ratingsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rating not found"));
        var updatedRating = ratingsMapper.toEntity(requestDTO);
        updatedRating.setId(existingRating.getId());
        var savedRating = ratingsRepository.save(updatedRating);
        return ratingsMapper.toDTO(savedRating);
    }

    @Override
    public boolean deleteRating(Long id) {
        if (!ratingsRepository.existsById(id)) {
            throw new RuntimeException("Rating not found");
        }
        ratingsRepository.deleteById(id);
        return true;
    }
}