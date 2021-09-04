package musicShop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    private String model;
    private String colour ;
    private double costPrice;
    private double listPrice;

    public Piano(String model, String colour, double costPrice, double listPrice) {
        super(colour, "Keyboard");
        this.colour = colour;
        this.model = model;
        this.costPrice = costPrice;
        this.listPrice = listPrice;
    }

    public String getModel() {
        return this.model;
    }



    public double getCostPrice() {
        return this.costPrice;
    }

    public double getListPrice() {
        return this.listPrice;
    }

    public String play() {
        return "Instrument noises";
    }

    public double calculateMarkup() {
        return this.listPrice - this.costPrice;
    }

}
