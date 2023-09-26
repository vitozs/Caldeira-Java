import livro.Livro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Livro> pilhaLivro = new Stack<Livro>();
        HashSet<String> categorias = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);

        pilhaLivro.push(new Livro("Jango", "Açao"));
        pilhaLivro.push(new Livro("Era do gelo", "Comedia"));
        pilhaLivro.push(new Livro("Tinkerbel", "Aventura"));
        pilhaLivro.push(new Livro("Bela e fera", "Drama"));
        pilhaLivro.push(new Livro("Bela e fera 2", "Drama"));

        getCategorias(pilhaLivro, categorias);

        while (true){
            System.out.println("1- Imprimir todos");
            System.out.println("2- Imprimir por categoria");
            System.out.println("3- Apagar todos");
            int opt = scanner.nextInt();

            if(opt == 1){
                for(Livro livro : pilhaLivro){
                    System.out.println("Nome: " + livro.getTitulo() + " Categoria: " + livro.getCategoria());
                }
            }else if(opt == 2){
               for (String categoria : categorias){
                   System.out.println("================");
                   System.out.println(categoria);
                   System.out.println("================");
                   for (Livro livro : pilhaLivro){
                       if(Objects.equals(categoria, livro.getCategoria())){
                           System.out.println("Titulo: " + livro.getTitulo() + " Categoria: " + livro.getCategoria());
                       }
                   }
               }
            }else if(opt == 3){
                while(!pilhaLivro.isEmpty()){
                    pilhaLivro.pop();
                }
                System.out.println("Livros removidos!!!!");
            }
        }



    }

    public static void getCategorias(Stack<Livro> livros, HashSet<String> categorias){
        for(Livro livro : livros ){
            categorias.add(livro.getCategoria());
        }
    }
}
