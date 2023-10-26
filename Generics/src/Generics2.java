import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class Generics2 {
    public static void main(String[] args) throws Exception {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        consultandoAnimais(gatos);
        consultandoAnimais(cachorros);
        List<Animal> animais = new ArrayList<>();
        consultandoAnimais2(animais);
    }

    private static void consultandoAnimais(List<? extends Animal> animal) { //Nessa lista(animal) não se pode adicionar elementos ela serve apenas para consulta pois não se sabe ao certo o que deve ser recebido se é cachorros ou gatos
        for (Animal animais : animal) {
            animais.consulta();
        }
    }
    
    private static void consultandoAnimais2(List<? super Animal> animal) { //Nessa lista pode se adicionar elementos pois é certeza que tem que vim algo do tipo Animal para cima, a relação super pede que seja do filho para o pai, enquanto extends é de pai para filho
        animal.add(new Cachorro());
        animal.add(new Gato());

        for (Object animais : animal) {
            ((Animal) animais).consulta();
        }
      }
}
