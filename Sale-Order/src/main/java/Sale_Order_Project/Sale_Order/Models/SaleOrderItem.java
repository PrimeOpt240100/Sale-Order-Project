package Sale_Order_Project.Sale_Order.Models;

import Sale_Order_Project.Sale_Order.Enum.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="saleOrderItem")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrderItem {
    /*
    id, sale_order_id, order_item_no, qty, sku, amount, cgst, sgst, tax, created_at, created_by, updated_at,
    updated_by
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemId;
    private int orderItemNo;
    private int qty;
    private int amount;

    @Enumerated(value= EnumType.STRING)
    private Type sku;

    private int cgst;
    private int sgst;
    private int tax;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    private String createdBy;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private String updatedBy;

    @JoinColumn(name = "orderId")
    @ManyToOne
    private SaleOrder saleOrder;

}
