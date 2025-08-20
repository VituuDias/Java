package sistema;

public class Atendente {
    private String nome;
    private String email;
    private String senha;
    private int valorCaixa;
    private final boolean is_admin = false;

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

    public int getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(int valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public boolean getIs_admin() {
        return is_admin;
    }

}
