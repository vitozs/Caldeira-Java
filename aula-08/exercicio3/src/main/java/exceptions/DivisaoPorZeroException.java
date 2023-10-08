package exceptions;

public class DivisaoPorZeroException extends RuntimeException{
    public DivisaoPorZeroException(){
        super("Divisao por zero nao e permitida!!!");
    }

}
