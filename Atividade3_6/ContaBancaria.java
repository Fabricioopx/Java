public abstract class ContaBancaria {
    public Integer id;
    public Double saldo;

    public ContaBancaria(Integer id, Double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public abstract void sacar(Double quantia);
    public abstract void depositar(Double quantia);
}

