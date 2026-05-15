package edu.teamrocket.stock.criteria;

import edu.teamrocket.stock.item.Item;
import edu.teamrocket.stock.item.Offer;
import edu.teamrocket.stock.item.Bid;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {
    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Bid)
                .sorted(Comparator.comparingInt(Offer::value).reversed())
                .collect(Collectors.toList());
    }
}