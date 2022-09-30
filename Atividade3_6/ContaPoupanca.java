public class ContaPoupanca extends ContaBancaria {
    /**
     * deve estar em porcentagem, por exemplo:
     * 3% = 0.03
     */
    private Double taxaDeOperacao;

    public ContaPoupanca(Integer id, Double saldo, Double taxaDeOperacao) {
        super(id, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    public void depositar(Double quantia) {
        Double taxa = quantia * this.taxaDeOperacao;
        Double quantiaTotal = quantia + taxa;

        this.saldo += quantiaTotal;

        System.out.printf("Depósito de R$ %d realizado.\n", quantia);
        System.out.printf("Quantia adicionada pela taxa de operação: R$ %d\n", taxa);
        System.out.printf("Quantia total depositada na conta: R$ %d", quantiaTotal);
        System.out.printf("Saldo atual: R$ %d\n", this.saldo);
    }

    public void sacar(Double quantia) {
        Double taxa = quantia * this.taxaDeOperacao;
        Double quantiaTotal = quantia + taxa;

        if (this.saldo - quantia >= 0) {
            this.saldo -= quantiaTotal;
            System.out.printf("Saque de R$ %d realizado.\n", quantia);
            System.out.printf("Quantia adicionada pela taxa de operação: R$ %d\n", taxa);
            System.out.printf("Quantia total retirada da conta: R$ %d", quantiaTotal);
            System.out.printf("Saldo atual: R$ %d\n", this.saldo);
        } else {
            System.out.printf("Saldo insuficiente. Saldo atual: %d", this.saldo);
        }
    }
}
