package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    Random rand = new Random();

    private int code;
    private String name;
    private String brand;
    private float price;
    private int iva;
    private boolean hasFidelity;

    public Prodotto (String name, String brand, float price, int iva, boolean hasFidelity){
        this.code = rand.nextInt(99999);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
        this.hasFidelity = hasFidelity;
    }
    public Prodotto (String name, String brand, float price, int iva){
        this.code = rand.nextInt(99999);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
        this.hasFidelity = false;
    }

    // GETTER 


    public int getCode () {
        return this.code;
    }

    public String getName () {
        return this.name;
    }

    public String getBrand () {
        return this.brand;
    }

    public float getPrice () {
        return price;
    }
    public boolean getFidelity () {
        return hasFidelity;
    }

    // public String getPrice () {
    //     return String.format("Il prezzo é di: %.2f euro", price);
    // }   HO DEI DUBBI SUL FATTO CHE VADA BENE

    public int getIva () {
        return iva;
    }

    // SETTER

    public void setName (String newName) {
        if (newName.equals(this.name) || newName.length() == 0) {
            System.out.println("C'é un errore nel nuovo nome inserito");
        }
        else {
            this.name = newName;
        }
    }
    public void setBrand (String newBrand) {
        if (newBrand.equals(this.brand) || newBrand.length() == 0) {
            System.out.println("C'é un errore nel nuovo brand inserito");
        }
        else {
            this.brand = newBrand;
        }
    }
    public void setPrice(float newPrice){
        if( newPrice == this.price || newPrice <= 0){
            System.out.println("C'é un errore nel nuovo prezzo inserito");
        }
        else{
            this.price = newPrice;
        }
    } 
    public void setIva(int newIva){
        if( newIva == this.iva || newIva <= 0){
            System.out.println("C'é un errore nella nuova iva inserita");
        }
        else{
            this.iva = newIva;
        }
    } 

    public float getFullPrice(){
        if (hasFidelity){
            return (price + (price * iva/100) - (price * 2/100)); 
        }
        else {
            return price + (price * iva/100);
        }

        
    };
    @Override
    public String toString() {
        return String.format("Nome: %s \n Brand: %s \n Prezzo: %.2f \n Iva: %d", this.name, this.brand, this.price, this.iva);
    }
}
