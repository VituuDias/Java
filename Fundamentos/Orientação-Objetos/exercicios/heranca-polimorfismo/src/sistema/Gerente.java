package sistema;

public class Gerente {
    private String nome;
    private String email;
    private String senha;
    private final boolean is_admin = true;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getIs_admin() {
        return is_admin;
    }

    // Gerar relatório financeiro, Consultar vendas,
    // Realizar login, Realizar logff, alterar dados, alterar senha
    public void gerarRelatorioFinanceiro() {

    }

    public void consultarVendas() {

    }

    public void login() {
        System.out.println("Login realizado");
    }

    public void logoff() {
        System.out.println("Logout realizado");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        nome = novoNome;
        email = novoEmail;
    }

    public void alterarSenha(String novaSenha) {
        senha = novaSenha;
    }

}
