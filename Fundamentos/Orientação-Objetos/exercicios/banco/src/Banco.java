public class Banco {
    private double saldo = 0;
    private double chequeEspecial = 0;
    private double usoChequeEspecial = 0;
    private boolean taxaCobrada = false;

    // Construtor contendo as regras de negocio
    /*
     * A conta bancária deve ter um limite de cheque especial somado ao saldo da
     * conta;
     * O o valor do cheque especial é definido no momento da criação da conta, de
     * acordo com o valor depositado na conta em sua criação;
     * Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque
     * especial deve ser de R$50,00
     * Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor
     * depositado;
     */

    public Banco(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500)
            this.chequeEspecial = 50.0;
        else
            this.chequeEspecial = depositoInicial * 0.5;
    }

    public void consultarSaldo() {
        System.out.printf("O saldo atual é : R$%.2f\n", saldo);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Limite do cheque especial: R$%.2f%n", chequeEspecial);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso.%n", valor);
            verificarTaxaChequeEspecial();
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacarDinheiro(double saldo) {
        this.saldo -= saldo;
        System.out.println("Dinheiro sacado");
    }

    public void pagarBoleto(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.printf("Boleto de R$%.2f pago com sucesso.%n", valor);
            atualizarUsoChequeEspecial();
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto.");
        }
    }

    public void usandoChequeEspecial() {
        if (saldo < 0) {
            System.out.println("A conta está utilizando o cheque especial.");
        } else {
            System.out.println("A conta NÃO está utilizando o cheque especial.");
        }
    }

    private void atualizarUsoChequeEspecial() {
        if (saldo < 0) {
            double valorUsado = Math.abs(saldo);
            if (valorUsado > usoChequeEspecial) {
                usoChequeEspecial = valorUsado;
                taxaCobrada = false; // nova dívida, taxa ainda não foi cobrada
            }
        }
    }

    // Cobra a taxa de 20% quando saldo volta ao positivo
    private void verificarTaxaChequeEspecial() {
        if (saldo > 0 && usoChequeEspecial > 0 && !taxaCobrada) {
            double taxa = usoChequeEspecial * 0.2;
            saldo -= taxa;
            System.out.printf("Taxa de R$%.2f cobrada pelo uso do cheque especial.%n", taxa);
            usoChequeEspecial = 0;
            taxaCobrada = true;
        }
    }

}