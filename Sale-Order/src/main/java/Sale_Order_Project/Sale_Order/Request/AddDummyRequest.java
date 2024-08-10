package Sale_Order_Project.Sale_Order.Request;

import Sale_Order_Project.Sale_Order.Models.Temp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddDummyRequest {

    private String name;

    List<Temp> tempList;
}
