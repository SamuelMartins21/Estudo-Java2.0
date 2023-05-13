package Model;

public class AnimeModel {
    private String nome;
    private int episodios;
    
    public AnimeModel(String nome, int episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    @Override
    public String toString() {
        return "AnimeModel [nome=" + nome + ", episodios=" + episodios + "]";
    }

}
