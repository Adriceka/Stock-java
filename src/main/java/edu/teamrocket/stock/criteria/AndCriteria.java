package edu.teamrocket.stock.criteria;
import edu.teamrocket.stock.item.Item;
import edu.teamrocket.stock.item.Offer;
import java.util.List;
import java.util.stream.Collectors;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstCriteriaOffers = criteria.checkCriteria(item);
        List<Offer> secondCriteriaOffers = otherCriteria.checkCriteria(item);
        
        return firstCriteriaOffers.stream()
                .filter(secondCriteriaOffers::contains)
                .collect(Collectors.toList());
    }
}