import org.lessons.java.shop.Prodotto;
import org.lessons.java.shop.Smartphone;

public class Main {
    public static void main(String[] args) {
        Prodotto portafoglio = new Prodotto("Portafoglio", "Versace", 250, 22);
        Smartphone iphone14 = new Smartphone("Iphone 14", "Apple", 799.99f, 22, "NVJSIDBHUWYSB", 516);

        System.out.println(portafoglio.getCode());
        System.out.println(iphone14.getCode());
        System.out.println(String.format("Il codice del tuo telefono é:%d.", iphone14.getCode()));
    }
}
