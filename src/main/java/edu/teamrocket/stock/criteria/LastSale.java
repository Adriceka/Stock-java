package edu.teamrocket.stock.criteria;
import edu.teamrocket.stock.item.Item;
import edu.teamrocket.stock.item.Offer;

import java.util.List;

public class LastSale implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Criteria sales = new Sales();
        List<Offer> salesList = sales.checkCriteria(sneaker);

        return salesList.isEmpty()? 
                List.of()
                 : List.of(salesList.get(salesList.size() -1));
    }
}