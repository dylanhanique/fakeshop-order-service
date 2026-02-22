package fr.dylanhanique.orderservice.dto;

import fr.dylanhanique.orderservice.model.Status;

import java.util.List;

public record OrderResponse(
    Long id,
    Status status,
    List<OrderItemResponse> items
) {
}
