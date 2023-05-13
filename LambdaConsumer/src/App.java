import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        List<String> nomes = List.of("samuel", "raissa", "samira");
        forEach(nomes, (String s) -> System.out.println(s));

    }
    //              C O N S U M E R
        //Executa uma operação e não retorna nada

        private static <T> void forEach(List<T> lista, Consumer<T> consumer){
            for (T t : lista){
                consumer.accept(t);
            }
        }
        
}
