package org.lessons.java.shop;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Prodotto[] carrello = new Prodotto[0];
        
        
        
        boolean isShopping = true;
        String userChoice;
        
        // SCELTA UTENTE
        while (isShopping){
            String isContinuing;

            System.out.println("Inserisci i dati del prodotto che vuoi acquistare: ");

            System.out.println("Nome prodotto: ");
                String name = sc.nextLine();
            System.out.println("Brand prodotto: ");
                String brand = sc.nextLine();

            System.out.println("Prezzo prodotto: ");
                float price = sc.nextFloat();
                sc.nextLine();

            System.out.println("Iva prodotto: ");
                int iva = sc.nextInt();
                sc.nextLine();

            System.out.println("Inserisci la categoria del prodotto (smartphone, televisione, cuffie o altro): ");
            userChoice = sc.nextLine();
            
            // SMARTPHONE
            Prodotto[] newCarrello = new Prodotto[carrello.length + 1];
            
            switch (userChoice) {
                case "smartphone":
                    for(int i = 0; i < carrello.length ;i++ ){
                        newCarrello[i] = carrello[i];
                    }

                    System.out.println("Codice imei telefono: ");
                    String imei = sc.nextLine();
                    System.out.println("Memoria in gb telefono: ");
                    int memory = sc.nextInt();
                    sc.nextLine();


                    Smartphone telefono = new Smartphone(name, brand, price, iva, imei, memory);


                    newCarrello[newCarrello.length - 1] = telefono;
                    carrello = newCarrello;
                    
                    System.out.println("Vuoi continuare con i tuoi acquisti? (y/n)");
                    isContinuing = sc.nextLine();
                    if (isContinuing.equals("n")){
                        isShopping = false;
                    }

                break;
                case "televisione": 

                    for(int i = 0; i < carrello.length ;i++ ){
                        newCarrello[i] = carrello[i];
                    }



                    System.out.println("Altezza televisione: ");
                    int height = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Larghezza televisione: ");
                    int width = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Smart TV: ");
                    boolean isSmartTV = sc.nextBoolean();
                    sc.nextLine();


                    Televisore tv = new Televisore(name, brand, price, iva, height, width, isSmartTV);

                    newCarrello[newCarrello.length - 1] = tv;
                    carrello = newCarrello;


                    System.out.println("Vuoi continuare con i tuoi acquisti? (y/n)");
                    isContinuing = sc.nextLine();
                    if (isContinuing.equals("n")){
                        isShopping = false;
                    }
                break;
                case "cuffie": 

                    for(int i = 0; i < carrello.length ;i++ ){
                        newCarrello[i] = carrello[i];
                    }

                
                    System.out.println("Colore cuffie: ");
                    String color = sc.nextLine();
                    System.out.println("Cuffie wireless: ");
                    boolean isWireless = sc.nextBoolean();
                    sc.nextLine();

                    Cuffie cuffie = new Cuffie(name, brand, price, iva, color, isWireless);
                    newCarrello[newCarrello.length - 1] = cuffie;
                    carrello = newCarrello;

                    System.out.println("Vuoi continuare con i tuoi acquisti? (y/n)");
                    isContinuing = sc.nextLine();
                    if (isContinuing.equals("n")){
                        isShopping = false;
                    }
                break;
                
                default:
                
                    for(int i = 0; i < carrello.length ;i++ ){
                        newCarrello[i] = carrello[i];
                    }
                    
                    Prodotto prodotto = new Prodotto(name, brand, price, iva);
                    newCarrello[newCarrello.length - 1] = prodotto;
                    carrello = newCarrello;
                    
                    System.out.println("Vuoi continuare con i tuoi acquisti? (y/n)");
                    isContinuing = sc.nextLine();
                    if (isContinuing.equals("n")){
                        isShopping = false;
                    }
                break;
                }           
            }
            sc.close();
            if (!isShopping){ 
                    System.out.println("Il tuo carrello:");
                    if (carrello.length > 0){
                        for(int i = 0; i < carrello.length;i++ ){
                            System.out.println(String.format("------------------------ \n%s\n ------------------------", carrello[i]));
                        }
                    }
                    else {
                        System.out.println("É vuoto.");
                    }
                    System.out.println("Arrivederci!");
                    
            }
    }
}
