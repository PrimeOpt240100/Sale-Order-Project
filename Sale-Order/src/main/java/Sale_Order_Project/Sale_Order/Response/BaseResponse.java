package Sale_Order_Project.Sale_Order.Response;

import lombok.*;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {

    private int code;
    private String msg;
    private T data;

}
