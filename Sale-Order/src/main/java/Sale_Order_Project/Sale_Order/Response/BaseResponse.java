package Sale_Order_Project.Sale_Order.Response;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {

    private int code;
    private String msg;
    private T data;

}
