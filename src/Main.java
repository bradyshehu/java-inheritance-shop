import org.lessons.java.shop.Prodotto;
import org.lessons.java.shop.Smartphone;
import org.lessons.java.shop.Televisore;
import org.lessons.java.shop.Cuffie;

public class Main {
    public static void main(String[] args) {
        Prodotto portafoglio = new Prodotto("Portafoglio", "Versace", 250, 22);
        Smartphone iphone14 = new Smartphone("Iphone 14", "Apple", 799.99f, 22, "NVJSIDBHUWYSB", 516);
        Televisore lg15 = new Televisore("LG15", "LG", 399.99f, 10, 19, 32, false);
        Cuffie hammerhead = new Cuffie("Hammerhead", "Razer", 79.99f, 22, "nero", true);

        System.out.println(portafoglio.getCode());
        System.out.println(iphone14.getCode());
        System.out.println(lg15.getCode());
        System.out.println(hammerhead.getCode());
        System.out.println(String.format("Il codice del tuo telefono é: %d.", iphone14.getCode()));

        lg15.setIsSmartTV(true);

        System.out.println(String.format("Il nome delle tue cuffie é: %s", hammerhead.getName()));
        hammerhead.setName("rz156");
        System.out.println(String.format("Il nome delle tue cuffie é: %s", hammerhead.getName()));
        
        System.out.println( lg15.getIsSmarTV() ? String.format("La televisione %s é una Smart TV", lg15.getName()) : String.format("La televisione %s non é una Smart TV", lg15.getName()));
    }
}
