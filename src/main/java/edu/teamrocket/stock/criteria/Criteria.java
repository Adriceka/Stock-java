package edu.teamrocket.stock.criteria;
import edu.teamrocket.stock.item.Item;
import edu.teamrocket.stock.item.Offer;
import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}