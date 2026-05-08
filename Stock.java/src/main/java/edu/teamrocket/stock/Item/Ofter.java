package edu.teamrocket.stock.Item;

public interface Ofter extends Comparable<Ofter>{
    String size();
    int value();
    @Override
    int compareTo(Ofter ofter);
}