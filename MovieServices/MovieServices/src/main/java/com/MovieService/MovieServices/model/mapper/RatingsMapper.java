package com.MovieService.MovieServices.model.mapper;

import com.MovieService.MovieServices.dto.RatingsRequestDTO;
import com.MovieService.MovieServices.dto.RatingsResponseDTO;
import com.MovieService.MovieServices.model.Ratings;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MovieServiceMapper.class})
public interface RatingsMapper {
    RatingsMapper INSTANCE = Mappers.getMapper(RatingsMapper.class);
    Ratings toEntity(RatingsRequestDTO dto);
    RatingsResponseDTO toDTO(Ratings entity);
    List<RatingsResponseDTO> toDTOList(List<Ratings> entities);
}