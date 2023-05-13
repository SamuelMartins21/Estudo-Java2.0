public class App {
    public static void main(String[] args)  {
        ControleDeGastosModel teste = new ControleDeGastosModel();
        teste.setIdade(10);
        teste.setName("samuel");

        Service service = new Service();
        
        service.save(teste);

    }
}
