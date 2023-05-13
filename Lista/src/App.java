import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
            List<String> lista = new ArrayList<>();
            lista.add("Samuel");
            lista.add("Raíssa");
            lista.add("Camila");

        boolean existSamuel = lista.contains("Samuel");
        boolean existsSandra = lista.contains("Sandra");//Metodo verifica se existe

        System.out.println(existSamuel); 
        System.out.println(existsSandra);

        //Comparator<String> comparator = (o1, o2) -> o1.toString().compareTo(o2.toString()); //Expressão lambda para criar um comparator em classes que não tem comparator implementado 

        //lista.sort(comparator); Deixa a Lista de forma Ordenada

        lista.sort(Comparator.naturalOrder()); //Metodo para classe que já tem comparator implementado    
        System.out.println(lista);

    }
}
