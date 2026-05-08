package edu.teamrocket.stock.Item;

public class Sale implements Ofter{

    private String size;
    private Integer sale;
    public Sale (String size, int sale) {

        this.size = size;
        this.sale = sale;
    }

    @Override
    public String size(){
        return this.size;
    }
    @Override
    public int value(){
        return this.sale;
    }

    @Override
    public int compareTo(Ofter sale){
        return Integer.compare(this.sale, sale.value());
    }
    @Override
    public String toString(){
        return "\t\t" + this.size() + "\t" + this.value() + "\n";
    }
}