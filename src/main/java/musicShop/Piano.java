package musicShop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    private String model;
    private String colour ;
    private int costPrice;
    private int listPrice;

    public Piano(String model, String colour, int costPrice, int listPrice) {
        super(colour, "Keyboard");
        this.colour = colour;
        this.model = model;
        this.costPrice = costPrice;
        this.listPrice = listPrice;
    }

    public String getModel() {
        return this.model;
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
