import Dominio.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1 , "samuel", "samuel@gmail.com");
        Pessoa p2 = new Pessoa(2 , "raissa", "raissa@gmail.com");
        Pessoa p3 = new Pessoa(3 , "samira", "samira@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
