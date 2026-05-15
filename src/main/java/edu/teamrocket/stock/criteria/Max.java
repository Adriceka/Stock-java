package edu.teamrocket.stock.criteria;
import edu.teamrocket.stock.item.Item;
import edu.teamrocket.stock.item.Offer;
import java.util.List;
import java.util.Collections;

public class Max implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstList = criteria.checkCriteria(item);
        List<Offer> secondList = otherCriteria.checkCriteria(item);

        return firstList.stream()
                .filter(secondList::contains)
                .max(Offer::compareTo)
                .map(Collections::singletonList)
                .orElse(Collections.emptyList());
    }
}