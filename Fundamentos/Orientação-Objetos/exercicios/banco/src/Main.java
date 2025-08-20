import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do depósito inicial: R$");
            double depositoInicial = scanner.nextDouble();
            Banco banco = new Banco(depositoInicial);
            
            int opcao;
            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Consultar cheque especial");
                System.out.println("3. Depositar dinheiro");
                System.out.println("4. Sacar dinheiro");
                System.out.println("5. Pagar boleto");
                System.out.println("6. Verificar uso do cheque especial");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> banco.consultarSaldo();
                    case 2 -> banco.consultarChequeEspecial();
                    case 3 -> {
                        System.out.print("Digite o valor a depositar: R$");
                        double valorDeposito = scanner.nextDouble();
                        banco.depositar(valorDeposito);
                    }
                    case 4 -> {
                        System.out.print("Digite o valor a sacar: R$");
                        double valorSaque = scanner.nextDouble();
                        banco.sacarDinheiro(valorSaque);
                    }
                    case 5 -> {
                        System.out.print("Digite o valor do boleto: R$");
                        double valorBoleto = scanner.nextDouble();
                        banco.pagarBoleto(valorBoleto);
                    }
                    case 6 -> banco.usandoChequeEspecial();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
        }
    }
}