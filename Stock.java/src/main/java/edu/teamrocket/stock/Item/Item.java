package edu.teamrocket.stock.Item;
import java.util.List;

public interface Item {

    int getBid();
    int getAsk();
    int getSale();
    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
    list<Offer> offers();
}



