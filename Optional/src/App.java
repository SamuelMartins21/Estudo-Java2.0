import java.util.Optional;

public class App {
    public static void main(String[] args) {
        ContaoDAO contaoDAO = new ContaoDAO();
        Optional<Contato> contatoOptional = contaoDAO.buscarPorNome("samuel");

        contatoOptional.ifPresent(c -> System.out.println("contato achado"));
    }
}
 