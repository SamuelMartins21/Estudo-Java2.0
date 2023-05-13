import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Model.AnimeModel;
import Service.AnimeComparator;

public class App {
    public static void main(String[] args) {
        List<AnimeModel> animeList = new ArrayList<>(List.of(new AnimeModel("one piece", 1000), 
        new AnimeModel("dragon ball", 500)));

        Collections.sort(animeList, AnimeComparator::compareByTitle); //chamo o nome da classe que eu quero utilizar o metodo
        System.out.println(animeList);
    }
}
