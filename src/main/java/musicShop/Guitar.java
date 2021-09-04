package musicShop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private String model;
    private int numberOfStrings;
    private double costPrice;
    private double listPrice;

    public Guitar(String model, String colour, int numberOfStrings, double costPrice, double listPrice) {
        super(colour, "String");
        this.numberOfStrings = numberOfStrings;
        this.model = model;
        this.costPrice = costPrice;
        this.listPrice = listPrice;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
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
