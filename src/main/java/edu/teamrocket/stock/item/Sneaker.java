package edu.teamrocket.stock.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker  implements Item{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers = new ArrayList<>();

    public Sneaker(String style, String name){
        this.style = style;
        this.name = name;
    }

    public Object getStyle(){
        return this.style;
    }

    public Object getName(){
        return this.name;
    }

    @Override
    public int getSale(){
        return this.sale;
    }

    @Override
    public void setSale(int sale){
        this.sale = sale;
    }

    @Override
    public int getAsk(){
        return this.ask;
    }

    @Override
    public void setAsk(int ask){
        this.ask = ask;
    }

    @Override
    public int getBid(){
        return this.bid;
    }

    @Override
    public void setBid(int bid){
        this.bid = bid;
    }
    
    public void add(Offer offer) {
        this.offers.add(offer);
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return this.getName() + "\n \t \t" + this.getStyle();
    }


}