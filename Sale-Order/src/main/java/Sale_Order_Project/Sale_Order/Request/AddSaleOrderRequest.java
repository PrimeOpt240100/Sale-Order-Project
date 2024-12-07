package Sale_Order_Project.Sale_Order.Request;

import Sale_Order_Project.Sale_Order.Enum.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSaleOrderRequest {
    private String createdBy;
    private String updatedBy;
    private AddSaleOrderItemRequest addSaleOrderItemRequest;
}
