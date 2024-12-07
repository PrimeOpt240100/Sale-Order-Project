package Sale_Order_Project.Sale_Order.Models;

import Sale_Order_Project.Sale_Order.Enum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="saleOrder")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrder {
    /*
    id, order_no, status, created_at, created_by, updated_at, updated_by
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private int orderNo;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column(updatable = false)
    private String createdBy;

    @CreationTimestamp
    @Column(name="created_at",updatable = false)
    private LocalDateTime createdAt;

    private String updatedBy;

    @UpdateTimestamp
    @Column(name="updated_at",updatable = true)
    private LocalDateTime updatedAt;
}
