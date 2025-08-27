package OrdenacaoDePessoas;

public class Main {

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Vitor", 24, 1.83);
        ordenacaoPessoas.adicionarPessoa("Mariana", 23, 1.63);
        ordenacaoPessoas.adicionarPessoa("See", 30, 1.68);
        ordenacaoPessoas.adicionarPessoa("List", 12, 1.53);
        ordenacaoPessoas.adicionarPessoa("Num", 65, 2.10);
        ordenacaoPessoas.adicionarPessoa("Pla", 45, 1.43);

        System.out.println("Por altura");
        ordenacaoPessoas.ordenarPorAltura();
        System.out.println("================");
        System.out.println("Por idade");
        ordenacaoPessoas.ordenarPorIdade();


    }

}
