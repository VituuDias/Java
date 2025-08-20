import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();


            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();


            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + " cm.");

            //Exceções que podem dar ao errar os valores de entrada de idade e altura --> java.util.InputMismatchException

            scanner.close();
        }
        catch(InputMismatchException e){
            System.err.println("Os numeros idaede e altura precisam ser numéricos");
        }
    }
}


//Hierarquia de Erros
//Exceção checadas ou não
//Se o compilador exige o tratamento da exceção antes de executar o código, 
//ela é uma exceção checada. Se o tratamento não for exigido e o erro puder ocorrer apenas em tempo de execução, 
//ela é uma exceção não checada.

//Classe Exception -> Classe mãe para todas as exceções checadas.
//Classe RuntimeException -> Classe base para todas as não checadas.