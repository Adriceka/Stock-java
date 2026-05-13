package edu.teamrocket.stock.Item;

public interface Offer extends Comparable<Offer>{
    String size();
    int value();
    @Override
    int compareTo(Offer offer);
}