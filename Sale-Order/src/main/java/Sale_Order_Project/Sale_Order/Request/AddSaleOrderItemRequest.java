package Sale_Order_Project.Sale_Order.Request;

import Sale_Order_Project.Sale_Order.Enum.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSaleOrderItemRequest {
    private int qty;
    private int baseprice;
    private Type sku;
    private String createdBy;
    private String updatedBy;
}

