import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> conjuntoSet = new HashSet<>();
        conjuntoSet.add("Samuel");
        conjuntoSet.add("Samuel");
        conjuntoSet.add("Samuel");
        conjuntoSet.add("Raissa");
        conjuntoSet.add("Sandra");

        System.out.println(conjuntoSet);

        Set<String> conjuntoSetLinked = new LinkedHashSet<>();
        conjuntoSetLinked.add("Samuel");
        conjuntoSetLinked.add("Samuel");
        conjuntoSetLinked.add("Samuel");
        conjuntoSetLinked.add("Raissa");
        conjuntoSetLinked.add("Sandra");

        System.out.println(conjuntoSetLinked);

        Set<String> conjuntoSetTree = new TreeSet<>();
        conjuntoSetTree.add("Samuel");
        conjuntoSetTree.add("Samuel");
        conjuntoSetTree.add("Samuel");
        conjuntoSetTree.add("Raissa");
        conjuntoSetTree.add("Sandra");

        System.out.println(conjuntoSetTree);
    }
}
