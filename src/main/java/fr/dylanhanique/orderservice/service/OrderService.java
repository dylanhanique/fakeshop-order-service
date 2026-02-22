package fr.dylanhanique.orderservice.service;

import fr.dylanhanique.orderservice.dto.CreateOrder;
import fr.dylanhanique.orderservice.dto.OrderResponse;
import fr.dylanhanique.orderservice.mapping.OrderMapping;
import fr.dylanhanique.orderservice.model.Order;
import fr.dylanhanique.orderservice.model.Status;
import fr.dylanhanique.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderResponse findById(Long id) throws NoSuchElementException {
        return OrderMapping.toResponse(orderRepository.findById(id).orElseThrow());
    }

    public OrderResponse create(CreateOrder createOrderDto) {
        Order order = OrderMapping.fromCreateOrderToEntity(createOrderDto);
        order.setStatus(Status.ORDERED);

        orderRepository.save(order);

        return findById(order.getId());
    }

}
