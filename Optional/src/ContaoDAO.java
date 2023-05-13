import java.util.Optional;

public class ContaoDAO {
    
    public Optional<Contato> buscarPorNome(String nome){
        return Optional.ofNullable(new Contato("samuel"));
    }
}
