package edu.teamrocket.stock.Item;

public class Ask implements Ofter{

    private String size;
    private Integer ask;
    public Ask (String size, int ask) {

        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size(){
        return this.size;
    }
    @Override
    public int value(){
        return this.ask;
    }
    @Override
    public int compareTo(Ofter ask){
        return Integer.compare(this.ask, ask.value());
    }
    @Override
    public String toString(){
        return "\t\t" + this.size() + "\t" + this.value() + "\n";
    }
}