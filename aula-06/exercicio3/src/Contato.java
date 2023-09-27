public class Contato implements Comparable<Contato>{
    private Integer id;
    private String nome;
    private String local;
    public int modoDeListagem = 0;

    public void setModoDeListagem(int modoDeListagem) {
        this.modoDeListagem = modoDeListagem;
    }

    public Contato(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.id = (int) (Math.random() * 10);
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public int getId() {
        return id;
    }

    //Implementa o metodo compareTo da interface Comparable, pois TreeMap utiliza essa interface para verificar se os itens sao iguais.
    @Override
    public int compareTo(Contato o) {
        if(modoDeListagem == 0){
            return (nome + id).compareTo(o.nome + id);
        } else{
            return (local+ nome + id).compareTo(o.local + o.nome + o.id);
        } //Muda o parametro de ordenacao para o local ou pelo nome, dependendo da funcao que escolher
    }
    //Acessa o objeto Integer e compara ele com o id do contato. Esse 'e o parametro que define se o objeto 'e unico
}
