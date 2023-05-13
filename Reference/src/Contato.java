public class Contato {
    
    private String nome;
    
    public Contato(String nome){
        this.nome = nome;
        System.out.println("Criando Contato");
    }

    public String getNome(){
        return this.nome;
    }
}
