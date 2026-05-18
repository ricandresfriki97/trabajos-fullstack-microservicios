package com.MovieService.MovieServices.model.mapper;
import com.MovieService.MovieServices.dto.MovieServiceRequestDTO;
import com.MovieService.MovieServices.dto.MovieServiceResponseDTO;
import com.MovieService.MovieServices.model.MovieService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieServiceMapper {
    MovieServiceMapper INSTANCE = Mappers.getMapper(MovieServiceMapper.class);

    MovieService toEntity(MovieServiceRequestDTO dto);
    MovieServiceResponseDTO toDTO(MovieService entity);
    List<MovieServiceResponseDTO> toDTOList(List<MovieService> entities);
}