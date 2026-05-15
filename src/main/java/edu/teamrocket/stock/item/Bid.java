package edu.teamrocket.stock.item;

public class Bid implements Offer{

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
    public int compareTo(Offer bid){
        return Integer.compare(this.bid, bid.value());
    }
    @Override
    public String toString(){
        return "\t\t" + this.size() + "\t" + this.value();
    }
}