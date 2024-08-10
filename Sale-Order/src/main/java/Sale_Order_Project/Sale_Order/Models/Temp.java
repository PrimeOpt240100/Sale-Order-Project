package Sale_Order_Project.Sale_Order.Models;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="temp")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Temp {

    private int tempId;
    private String ref;

}
