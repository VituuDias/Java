import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, por favor digite as informações a seguir: ");
        System.out.print("Por favor digite o número da conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Número da agência: ");
        agencia = sc.nextLine();
        System.out.print("Seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.print("Seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + ", já está disponivel para saque.");

        sc.close();

    }
}
