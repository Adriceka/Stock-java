package edu.teamrocket.stock.item;
import java.util.List;

public interface Item {

    int getBid();
    int getAsk();
    int getSale();
    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
    List<Offer> offers();
}



