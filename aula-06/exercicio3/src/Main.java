import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Contato, String> listaTelefonica = new TreeMap<Contato, String >();

        listaTelefonica.put(new Contato("Jorel", "Sul"), "994256788");
        listaTelefonica.put(new Contato("Lucas", "Norte"), "9924556788");
        listaTelefonica.put(new Contato("Leo", "Norte"), "9924556788");
        listaTelefonica.put(new Contato("Amanda", "Norte"), "9924556788");
        listaTelefonica.put(new Contato("Gustavo", "Sul"), "994221234");


        imprimirContatos(listaTelefonica);
        System.out.println("===========================");
        imprimirPorLocalidade(listaTelefonica);
    }

    public static void imprimirContatos(TreeMap<Contato, String > lista){
        lista.forEach((k, v)->{
            System.out.printf("%s : %s \n", k.getNome(),  v);
        });
    }

    public static void imprimirPorLocalidade(TreeMap<Contato, String> lista){
        TreeMap<Contato, String> ordenada = new TreeMap<Contato, String>();
        lista.forEach((k, v) -> {
            k.setModoDeListagem(1);
            ordenada.put(k, v);
            //copia todos os valores da lista original para a nova, mudando o parametro de ordenacao dos objetos Conta dentro dela
        });
        ordenada.forEach((k,v)->{
            System.out.printf("%s -> %s : %s \n", k.getLocal(), k.getNome(), v);
        });
    }
}
