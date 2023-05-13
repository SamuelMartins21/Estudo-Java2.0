import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        // ela recebe parâmetros e tbm devolve
        // Interface Function <T, R>
        // T = o que é recebido   R = o que é retornado

        List<String> nomes = List.of("Samuel" , "raissa");
        List<Integer> integers = map(nomes, (String s) -> s.length());
        System.out.println(integers);

    }

    private static <T, R> List<R> map(List<T> lista, Function<T, R> function){
        List<R> resultado = new ArrayList<>();
        for(T t : lista){
            R r = function.apply(t);
            resultado.add(r);
        }
        return resultado;
    }
}
