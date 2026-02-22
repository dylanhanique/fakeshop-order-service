package fr.dylanhanique.orderservice.mapping;

import fr.dylanhanique.orderservice.dto.CreateOrderItem;
import fr.dylanhanique.orderservice.dto.OrderItemResponse;
import fr.dylanhanique.orderservice.model.Order;
import fr.dylanhanique.orderservice.model.OrderItem;

public class OrderItemMapping {

    public static OrderItemResponse toResponse(OrderItem orderItem) {
        return new OrderItemResponse(
                orderItem.getId(),
                orderItem.getProductId(),
                orderItem.getName(),
                orderItem.getPriceAtPurchase(),
                orderItem.getQuantity()
        );
    }

    public static OrderItem fromCreateOrderItemToEntity(CreateOrderItem createOrderItem, Order order) {
        return new OrderItem(
                createOrderItem.productId(),
                createOrderItem.name(),
                createOrderItem.priceAtPurchase(),
                createOrderItem.quantity(),
                order
        );
    }

}
