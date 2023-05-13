import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<>();
        lista.add("Samuel");
        lista.add("Raíssa");
        lista.add("Camila");

        Comparator<String> comparator = Comparator.comparing(t -> t.toString()); // Fabrica de comparador com os parâmetros que eu pedir "Comparator.comparing"
        lista.sort(comparator);
        
        System.out.println(comparator);
    }
}
