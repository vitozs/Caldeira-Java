package arquivo;

public class Arquivo {
    private String nome;
    private int folhas;

    public Arquivo(String nome, int folhas) {
        this.nome = nome;
        this.folhas = folhas;
    }

    public String getNome() {
        return nome;
    }

    public int getFolhas() {
        return folhas;
    }
}
