package fr.dylanhanique.orderservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private Long productId;

    @NotBlank
    @Size(min = 4, max = 64)
    @Column(nullable = false)
    private String name;

    @NotNull
    @Min(1)
    @Max(1000)
    @Column(name = "price_at_purchase", nullable = false)
    private BigDecimal priceAtPurchase;

    @NotNull
    @Min(1)
    @Max(1000)
    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Order order;

    public OrderItem(Long productId, String name, BigDecimal priceAtPurchase, int quantity, Order order) {
        this.productId = productId;
        this.name = name;
        this.priceAtPurchase = priceAtPurchase;
        this.quantity = quantity;
        this.order = order;
    }

}
