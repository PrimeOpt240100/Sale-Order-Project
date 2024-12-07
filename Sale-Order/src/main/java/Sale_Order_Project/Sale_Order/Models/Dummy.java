package Sale_Order_Project.Sale_Order.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="dummy")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dummy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dummyId;

    private String name;


}
