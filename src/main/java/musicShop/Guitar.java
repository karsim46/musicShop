package musicShop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private String model;
    private int numberOfStrings;
    private int costPrice;
    private int listPrice;

    public Guitar(String model, String colour, int numberOfStrings, int costPrice, int listPrice) {
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

    public int getCostPrice() {
        return this.costPrice;
    }

    public int getListPrice() {
        return this.listPrice;
    }

    public String play() {
        return "Instrument noises";
    }

    public int calculateMarkup() {
        return this.listPrice - this.costPrice;
    }

}
