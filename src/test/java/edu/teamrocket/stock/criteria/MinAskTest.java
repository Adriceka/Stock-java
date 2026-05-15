package edu.teamrocket.stock.criteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.List;


import edu.teamrocket.stock.item.Ask;
import edu.teamrocket.stock.item.Bid;
import edu.teamrocket.stock.item.Offer;
import edu.teamrocket.stock.item.Sneaker;

public class MinAskTest {
    
    @Test
    public void checkCriteria_bids_aks_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria minAsk = new MinAsk();
        sneaker.setAsk(minAsk.checkCriteria(sneaker).get(0).value());
        assertEquals(288, sneaker.getAsk());
    }

    @Test
    public void checkCriteria_no_bids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Criteria minAsk = new MinAsk();
        List<Offer> minimum = minAsk.checkCriteria(sneaker);
        sneaker.setBid(minimum.isEmpty()? 0 : minimum.get(0).value());
        assertEquals(0, sneaker.getAsk());
    }
}