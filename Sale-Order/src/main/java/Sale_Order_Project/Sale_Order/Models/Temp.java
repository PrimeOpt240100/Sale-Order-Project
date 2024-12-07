package Sale_Order_Project.Sale_Order.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="temp")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Temp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tempId;

    private String ref;

    @JoinColumn(name = "dummy_id")
    @ManyToOne
    private Dummy dummy;


}
