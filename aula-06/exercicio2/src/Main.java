import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<String, Integer>();

        pessoas.put("Ed", 32);
        pessoas.put("Jersom", 12);
        pessoas.put("Dorivaldo", 2);
        pessoas.put("Dorivaldo", 46);
        pessoas.put("Germania", 50);

        getIdade("Jersom", pessoas);
        getTerceiraIdade(pessoas);
    }

    public static void getIdade(String nome, HashMap<String, Integer> lista){
        if(lista.containsKey(nome)){
            System.out.println(lista.get(nome) + " anos");
        }else{
            System.out.println("Nao tem ninguem com esse nome na lista");
        }
    }

    public static void getTerceiraIdade(HashMap<String, Integer> lista){
        lista.forEach((k, v) -> {
            if(v >= 45 && v <= 59){
                System.out.println(k + " " + v + " anos");
            }
        });
    }
}
