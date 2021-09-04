package musicShop;

import Behaviours.ISell;

public class MusicAccessories implements ISell {
    String name;
    double costPrice;
    double listPrice;

    public MusicAccessories(String name, double costPrice, double listPrice){
        this.name = name;
        this.costPrice = costPrice;
        this.listPrice = listPrice;

    }
    public String getName(){
        return this.name;
    }

    public double getCostPrice(){
        return this.costPrice;
    }

    public double getListPrice(){
        return this.listPrice;
    }
    public double calculateMarkup() {
        return this.listPrice - this.costPrice;
    }






}
