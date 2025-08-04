package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    private String color;
    private boolean isWireless;

    public Cuffie ( String name, String brand, float price, int iva, String color, boolean isWireless){
        super(name, brand, price, iva);
        this.color = color;
        this.isWireless = isWireless;
    }
    public Cuffie ( String name, String brand, float price, int iva, boolean hasFidelity, String color, boolean isWireless){
        super(name, brand, price, iva, hasFidelity);
        this.color = color;
        this.isWireless = isWireless;
    }

    // GETTER

    public String getColor () {
        return this.color;
    }
    public boolean getIsWireless () {
        return isWireless;
    }

    // SETTER

    public void setColor (String newColor) {
        if(newColor.equals(this.color) || newColor.length() == 0){
            System.out.println("Il colore inserito non é valido");
        }
        else {
            this.color = newColor;
        }
    }
    public void setIsWireless (boolean newValue) {
        if (newValue == isWireless) {
            System.out.println("Le cuffie sono giá di questo tipo.");
        }
        else {
            this.isWireless = newValue;
        }
    }

        @Override
    public String toString() {
        return String.format("%s \n Colore cuffie: %s \n Sono bluetooth? %s", super.toString(), this.color, this.isWireless);
    }
        @Override
    public float getFullPrice() {

        if (this.getFidelity()){ 
            if (!this.isWireless) {
                return this.getPrice() + (this.getPrice() * this.getIva()/100) - (this.getPrice() * 7/100);
            }
            else return super.getFullPrice();
        }
        else return super.getFullPrice();
    }

}
