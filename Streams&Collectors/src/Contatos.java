public class Contatos {
    private String cidade;
    private int Idade;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public Contatos(String cidade, int idade) {
        this.cidade = cidade;
        Idade = idade;
    }

    @Override
    public String toString() {
        return "Contatos [cidade=" + cidade + ", Idade=" + Idade + "]";
    }

    
    
}
