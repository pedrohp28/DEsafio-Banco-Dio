
public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente ) {

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

        if (valor < saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {

        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {

        if (valor < saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
