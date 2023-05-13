import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //MAPA NÃO HERDA DE COLLECTION
        //NÃO PERMITE ELEMENTOS DUPLICADOS
        Map<String, Double> mapa = new HashMap<>(); //Não garante ordem
        mapa.put("C1", (double) 50);
        mapa.put("C2", (double) 60);
        mapa.put("C3", (double) 70);

        Set<String> chavStrings = mapa.keySet(); //mostra todas as chaves
        System.out.println(chavStrings);

        for(Map.Entry<String, Double> formapa : mapa.entrySet()){ 
            System.out.println(formapa); //Metodo lambda para mostrar todos do mapa
        }

    }
}
