package edu.teamrocket.stock.criteria;

import edu.teamrocket.stock.item.Item;
import edu.teamrocket.stock.item.Offer;
import edu.teamrocket.stock.item.Ask;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria {
    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Ask)
                .sorted(Comparator.comparingInt(Offer::value))
                .collect(Collectors.toList());
    }
}