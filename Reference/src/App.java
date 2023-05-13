import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<>();
        lista.add("Samuel");
        lista.add("Raíssa");
        lista.add("Camila");
        lista.add("Larissa");


        Comparator<String> compareString = Comparator.comparing(String :: toString);
        lista.sort(compareString);
        System.out.println(lista.toString());

        //Supplier<Contato> fabricaDeContato = Contato::new; //Fabrica de contato uma espécie de fabrica de construtor //Supplier não recebe parâmetro
        //fabricaDeContato.get();
        
        Function <String , Contato> fabricaDeContato = Contato::new; //Dado um tipo "String" ele retorna outro "Contato"
        Contato contato = fabricaDeContato.apply("samuel"); //Aceita parâmetros adicionando com o metodo apply
        System.out.println(contato.getNome());

        BiFunction<String, Integer, Aluno> fabricaDeAluno = Aluno::new;// Aceita dois parâmetros
        Aluno aluno = fabricaDeAluno.apply("Raíssa", 20);
        System.out.print(aluno.getNome());
        System.out.println(" = " + aluno.getIdade()+ " anos");
    }
}
