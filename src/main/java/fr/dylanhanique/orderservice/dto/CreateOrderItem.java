package fr.dylanhanique.orderservice.dto;

import java.math.BigDecimal;

public record CreateOrderItem(
    Long productId,
    String name,
    BigDecimal priceAtPurchase,
    int quantity
) {
}
