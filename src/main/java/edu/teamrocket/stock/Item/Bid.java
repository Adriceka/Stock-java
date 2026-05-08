package edu.teamrocket.stock.Item;

public class Bid implements Ofter{

    private String size;
    private Integer bid;
    public Bid (String size, int bid) {

        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size(){
        return this.size;
    }
    @Override
    public int value(){
        return this.bid;
    }
    @Override
    public int compareTo(Ofter bid){
        return Integer.compare(this.bid, bid.value());
    }
    @Override
    public String toString(){
        return "\t\t" + this.size() + "\t" + this.value();
    }
}