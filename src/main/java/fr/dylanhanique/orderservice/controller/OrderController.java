package fr.dylanhanique.orderservice.controller;

import fr.dylanhanique.orderservice.dto.CreateOrder;
import fr.dylanhanique.orderservice.dto.OrderResponse;
import fr.dylanhanique.orderservice.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@Tag(name="Orders", description = "CRUD operations for order entities")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @Operation(summary = "Create a new order")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Order created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request")
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public OrderResponse create(@Valid @RequestBody CreateOrder createOrder) {
        return orderService.create(createOrder);
    }

    @Operation(
            summary = "Retrieve an order by his id",
            parameters = {
                    @Parameter(
                            name = "id",
                            description = "Order id",
                            example = "1"
                    )
            }
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Order retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Order not found")
    })
    @GetMapping("/{id}")
    public OrderResponse findById(@PathVariable Long id) {
        return orderService.findById(id);
    }

}
