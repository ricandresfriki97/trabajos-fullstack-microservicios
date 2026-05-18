package com.PaymentService.PaymentServices.model.mapper;
import com.PaymentService.PaymentServices.dto.PaymentServiceRequestDTO;
import com.PaymentService.PaymentServices.dto.PaymentServiceResponseDTO;
import com.PaymentService.PaymentServices.model.PaymentService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring", uses = {PaymentMapper.class })
public interface PaymentServiceMapper {
    PaymentServiceMapper INSTANCE = Mappers.getMapper(PaymentServiceMapper.class);
    PaymentService toEntity(PaymentServiceRequestDTO dto);
    PaymentServiceResponseDTO toDTO(PaymentService entity);
    List<PaymentServiceResponseDTO> toDTOList(List<PaymentService> entities);
}