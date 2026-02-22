package fr.dylanhanique.orderservice.mapping;

import fr.dylanhanique.orderservice.dto.CreateOrder;
import fr.dylanhanique.orderservice.dto.OrderResponse;
import fr.dylanhanique.orderservice.model.Order;

public class OrderMapping {

    public static OrderResponse toResponse(Order order) {
        return new OrderResponse(
                order.getId(),
                order.getStatus(),
                order.getItems().stream().map(OrderItemMapping::toResponse).toList());
    }

    public static Order fromCreateOrderToEntity(CreateOrder createOrder) {
        Order order = new Order();
        order.setItems(
                createOrder.items()
                        .stream()
                        .map(item -> OrderItemMapping.fromCreateOrderItemToEntity(item, order))
                        .toList()
        );

        return order;
    }

}
