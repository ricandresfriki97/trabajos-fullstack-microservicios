package com.PaymentService.PaymentServices.model.mapper;
import com.PaymentService.PaymentServices.dto.PaymentRequestDTO;
import com.PaymentService.PaymentServices.dto.PaymentResponseDTO;
import com.PaymentService.PaymentServices.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;


@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);
    Payment toEntity(PaymentRequestDTO dto);
    PaymentResponseDTO toDTO(Payment entity);
    List<PaymentResponseDTO> toDTOList(List<Payment> entities);
}