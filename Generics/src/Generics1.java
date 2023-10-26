import java.util.ArrayList;
import java.util.List;

public class Generics1 {
    public static void main(String[] args) throws Exception {
        List <String> lista = new ArrayList<>();
        lista.add("oi");
        lista.add(12); //Não permitido pois essa lista recebe apenas Strings

        
    }
}
