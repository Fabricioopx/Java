public class ContaCorrente extends ContaBancaria {
    private Double limite;

    public ContaCorrente(Integer id, Double saldo, Double limite) {
        super(id, saldo);
        this.limite = limite;
    }
    
    public void depositar(Double quantia) {
        System.out.printf("Depósito de R$ %d realizado. ", quantia);
        this.saldo += quantia;
        System.out.printf("Saldo atual: %d\n", this.saldo);
    }

    public void sacar(Double quantia) {
        if (quantia > this.saldo + this.limite) {
            System.out.printf("Limite atingido. A quantia máxima que você pode sacar é %d\n", (this.limite - (Math.abs(this.saldo))));
            return;
        }
        this.saldo -= quantia;
    }
}
