package Sale_Order_Project.Sale_Order.Service;

import Sale_Order_Project.Sale_Order.Models.Dummy;
import Sale_Order_Project.Sale_Order.Request.AddDummyRequest;

public interface DummyService {

    public Dummy add(AddDummyRequest addDummyRequest);

}
