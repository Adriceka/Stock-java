package edu.teamrocket.stock.criteria;
import edu.teamrocket.stock.item.Item;
import edu.teamrocket.stock.item.Offer;
import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria {
    private String size;

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer.size().equals(this.size))
                .collect(Collectors.toList());
    }
}