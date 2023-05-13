public class App {
    public static void main(String[] args) throws Exception {
        String a1 = "   ola mundo.   ";
        a1.toUpperCase(); //Deixa tudo em maiusculo
        a1.toLowerCase(); //Deixa tudo em minusculo
        a1.length(); //Devolve um inteiro com a quantidade de caracteres presentes na variavel
        a1.trim();//Tira espaços das pontas
        
        String a2 = "   ola mundo.   ";
        String nomeAlterado = a2.replaceAll("ola", "oi");
        System.out.println(nomeAlterado); //Altera o nome selecionada por outro
    }
}
