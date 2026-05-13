package edu.teamrocket.stock.item;

import java.util.List;

public class Sneaker  implements Item{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

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

    @Override
    public List<Offer> offers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'offers'");
    }

}