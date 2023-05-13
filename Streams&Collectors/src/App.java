import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
       List <Contatos> contatos = Arrays.asList(new Contatos("fortaleza", 18 ),
       new Contatos("salvador",20),
       new Contatos("Rio de Janeiro", 10000),
       new Contatos("bahia", 20)); 

       contatos.stream()
       .filter(contato -> contato.getCidade()
       .equalsIgnoreCase("fortaleza")).forEach(System.out::print);; //metodo que filtra
       //Não tem feito colateral

       /*List<Contatos> filtro = contatos.stream()
       .filter(contato -> contato.getCidade()
       .equalsIgnoreCase("Salvador")).collect(Collectors.toList()); */

       //System.out.println(filtro);

       //MAIORIA DAS FUNÇÕES DE STREAM

       /*contatos.stream().filter(contato -> contato.getIdade() >25).forEach(System.out::println);
       System.out.println("---");

       contatos.stream().map(Contatos::getCidade).forEach(System.out::println); //Transforma essa lista de contatos em uma Lista de Strings apenas com os nomes da cidades
       System.out.println("---");

       contatos.stream().map(Contatos::getIdade).forEach(System.out::println); //Lista de Inteiros
       System.out.println("---");
       
       contatos.stream().map(Contatos::getIdade).distinct() //não permite itens repetidos
       .forEach(System.out::println);
       System.out.println("---");*/

       contatos.stream().filter(contato -> contato.getIdade() > 18).findAny()//optional que retorna qualquer pessoa no padrão do filtro
       .ifPresent(System.out::println);
       /*System.out.println("---");
       long quantidade = contatos.stream().filter(contato -> contato.getIdade() > 18).count();//conta quantos contatos tem a idade acima de 18
       System.out.println(quantidade);
       System.out.println("---");
       double média = contatos.stream().mapToDouble(contato -> contato.getIdade())
       .average().orElse(0); //metodo optional que faz a média
       System.out.println(média);
       System.out.println("---"); 
       double somaDeTudo = contatos.stream().mapToDouble(contato -> contato.getIdade()).sum(); //soma todas os valores
       System.out.println(somaDeTudo);
       System.out.println("---");
       double máximo = contatos.stream().mapToDouble(contato -> contato.getIdade()).max().orElse(0);
       System.out.println(máximo);//apresenta o valor máximo
       System.out.println("---");
       double mínimo = contatos.stream().mapToDouble(contato -> contato.getIdade()).min().orElse(0);
       System.out.println(mínimo);//apresenta o valor minimo
       System.out.println("---");*/
    }
}
