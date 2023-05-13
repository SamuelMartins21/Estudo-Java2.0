
interface Taxi{
    String reservar(String origem); //UM UNICO METODO ABSTRATO
}

public class App {
    public static void main(String[] args) {
        
        //                        P R E D I C A T E

        /*Taxi taxi = (origem) -> { //Implementando a interface que possui APENAS UM metodo de forma simples
            System.out.println("taxi reservado. Origem:" + origem); // -> Corpo do meu metodo
        };  
        taxi.reservar("Fortaleza");*/ //JEITO NORMAL

        Taxi taxi = origem -> ("taxi reservado. Origem: " + origem); //FORMA RESUMIDA 
        String taxi2 = taxi.reservar("Fortaleza");
        System.out.println(taxi2);

        //anonimas
        //(Parametro) -> expressão
        // (String origem) ->  System.out.println("taxi reservado. Origem:" + origem);
        // origem ->  System.out.println("taxi reservado. Origem:" + origem);

        
    }
    
}
