public class Testador {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente(1, 4000.0, 600.0);
        ContaPoupanca poupanca = new ContaPoupanca(1, 3200.0, 0.03);

        corrente.depositar(650.0);
        corrente.sacar(875.5);

        poupanca.depositar(600.5);
        poupanca.sacar(860.99);

    }
}
