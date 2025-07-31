package org.lessons.java.shop;

public class Televisore extends Prodotto {

    private int height;
    private int width;
    private boolean isSmartTV;

    public Televisore ( String name, String brand, float price, int iva, int height, int width, boolean isSmartTV) {
        super(name, brand, price, iva);
        this.height = height;
        this.width = width;
        this.isSmartTV = isSmartTV;
    }

    // GETTER
    
    public String getDimension() {
        return String.format("%dX%d", this.height, this.width);
    } 
    public boolean getIsSmarTV() {
        return isSmartTV;
    }

    // SETTER
    public void setHeight(int newHeight){
        if( newHeight == this.height || newHeight <= 0){
            System.out.println("C'é un errore nella nuova altezza inserita");
        }
        else{
            this.height = newHeight;
        }
    } 
    public void setWidth(int newWidth){
        if( newWidth == this.width || newWidth <= 0){
            System.out.println("C'é un errore nella nuova larghezza inserita");
        }
        else{
            this.width = newWidth;
        }
    } 
    public void setIsSmartTV (boolean newValue) {
        if( newValue == isSmartTV){
            System.out.println("La televisione é giá di questo tipo.");
        } 
        else {
            this.isSmartTV = newValue;
        }
    }
}
