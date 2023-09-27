import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> lista = new LinkedHashMap<String, Double>();

        lista.put("Cerveja", 2.6);
        lista.put("Chocolate", 4.99);
        lista.put("Refri", 7.8);
        lista.put("Sorvete", 24.5);

        lista.forEach((k , v) -> {
            System.out.printf("%s -> R$%.2f \n", k, v);
        });
    }
}
