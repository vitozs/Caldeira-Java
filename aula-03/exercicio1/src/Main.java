import conta.ContaBancaria;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {


        ContaBancaria conta1 = new ContaBancaria("Jorge", 13342354, "Itau", "Lami" );
        ContaBancaria conta2 = new ContaBancaria("Carlos", 2242354, "Banrisul", "Belem" );

        conta1.deposito(4000, conta1);
        conta1.transferencia(conta2, 220);
        conta1.verificarHistorico();
        conta2.verificarHistorico();
        conta1.fecharConta();
        conta1.deposito(4000, conta2);
    }
}
