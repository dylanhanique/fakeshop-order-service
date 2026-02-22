package fr.dylanhanique.orderservice.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
        Long id,
        Long productId,
        String name,
        BigDecimal priceAtPurchase,
        int quantity
) {
}
