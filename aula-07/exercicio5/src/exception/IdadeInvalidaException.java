package exception;

public class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException(String erro){
        super(erro);
    }
}
