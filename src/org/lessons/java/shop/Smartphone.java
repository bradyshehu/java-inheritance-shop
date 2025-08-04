package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    private String imeiCode;
    private int memory;

    public Smartphone(String name, String brand, float price, int iva, boolean hasFidelity, String imeiCode, int memory) {
        super(name, brand, price, iva, hasFidelity);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }
    public Smartphone(String name, String brand, float price, int iva, String imeiCode, int memory) {
        super(name, brand, price, iva);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }

    // GETTER 

    public String getImeiCode () {
        return this.imeiCode;
    }

    public int getMemory () {
        return this.memory;
    }
    // SETTER 
    public void setImeiCode (String newImeiCode) {
        if (newImeiCode.equals(this.imeiCode) || newImeiCode.length() == 0) {
            System.out.println("C'é un errore nel nuovo codice IMEI inserito");
        }
        else {
            this.imeiCode = newImeiCode;
        }
    }
        public void setMemory(int newMemory){
        if( newMemory == this.memory || newMemory <= 0){
            System.out.println("C'é un errore nella nuova memoria inserita");
        }
        else{
            this.memory = newMemory;
        }
    } 


    @Override
    public String toString() {
        return String.format("%s \n Codice IMEI: %s \n Memoria in GB %d", super.toString(), this.getImeiCode(), this.getMemory());
    }

    @Override
    public float getFullPrice() {
        if (this.getFidelity()){ 
            if (this.memory < 32) {
                return this.getPrice() + (this.getPrice() * this.getIva()/100) - (this.getPrice() * 5/100);
            }
        else return super.getFullPrice();
        }
        else return super.getFullPrice();
    }
}
