package fr.dylanhanique.orderservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record CreateOrder (
        @Schema(description = "Order items list", example = "[" +
                    "{ \"productId\": 1, \"name\": \"Item one\", \"priceAtPurchase\": 15.95, \"quantity\": 1 }," +
                    "{ \"productId\": 2, \"name\": \"Item two\", \"priceAtPurchase\": 9.95, \"quantity\": 2 }" +
                "]"
        )
        List<CreateOrderItem> items
) {
}
