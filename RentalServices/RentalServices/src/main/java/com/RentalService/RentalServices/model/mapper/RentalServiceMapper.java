package com.RentalService.RentalServices.model.mapper;
import com.RentalService.RentalServices.dto.RentalServiceRequestDTO;
import com.RentalService.RentalServices.dto.RentalServiceResponseDTO;
import com.RentalService.RentalServices.model.RentalService;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class RentalServiceMapper {
    public RentalServiceResponseDTO toRentalServiceResponseDTO(RentalService rentalService) {
        if (rentalService == null) {
            return null;
        }
        RentalServiceResponseDTO dto = new RentalServiceResponseDTO();
        dto.setId(rentalService.getId());
        dto.setName(rentalService.getName());
        dto.setDescription(rentalService.getDescription());
        dto.setPricePerDay(rentalService.getPricePerDay());
        return dto;
    }
    public List<RentalServiceResponseDTO> toRentalServiceResponseDTOs(List<RentalService> rentalServices) {
        return rentalServices.stream()
                .map(this::toRentalServiceResponseDTO)
                .collect(Collectors.toList());
    }
    public RentalService toRentalService(RentalServiceRequestDTO rentalServiceRequestDTO) {
        if (rentalServiceRequestDTO == null) {
            return null;
        }
        RentalService rentalService = new RentalService();
        rentalService.setName(rentalServiceRequestDTO.getName());
        rentalService.setDescription(rentalServiceRequestDTO.getDescription());
        rentalService.setPricePerDay(rentalServiceRequestDTO.getPricePerDay());
        return rentalService;
    }
}
