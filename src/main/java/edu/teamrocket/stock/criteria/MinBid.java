package edu.teamrocket.stock.criteria;

import edu.teamrocket.stock.item.Item;
import edu.teamrocket.stock.item.Offer;
import edu.teamrocket.stock.item.Bid;
import java.util.List;
import java.util.Collections;

public class MinBid implements Criteria {
    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Bid)
                .min(Offer::compareTo)
                .map(Collections::singletonList)
                .orElse(Collections.emptyList());
    }
}