package Sale_Order_Project.Sale_Order.Service;


import Sale_Order_Project.Sale_Order.Models.Dummy;
import Sale_Order_Project.Sale_Order.Models.Temp;
import Sale_Order_Project.Sale_Order.Repository.DummyRepository;
import Sale_Order_Project.Sale_Order.Repository.TempRepository;
import Sale_Order_Project.Sale_Order.Request.AddDummyRequest;
import Sale_Order_Project.Sale_Order.Request.AddTempRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DummyServiceImpl implements DummyService{

    @Autowired
    private DummyRepository dummyRepository;

    @Autowired
    private TempRepository tempRepository;

    @Override
    public Dummy add(AddDummyRequest addDummyRequest){
        /*
        private String name;
        List<Temp> tempList;
         */
        Dummy dummy = Dummy.builder().name(addDummyRequest.getName())
                .build();

        dummyRepository.save(dummy);

        List<AddTempRequest> addTempRequestList = addDummyRequest.getAddTempRequestList();

        for(AddTempRequest tempRequest : addTempRequestList){
            Temp temp = Temp.builder().ref(tempRequest.getRef())
                    .dummy(dummy)
                    .build();
            tempRepository.save(temp);
        }

        return dummy;
    }
}
