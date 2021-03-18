import java.util.Arrays;
import java.util.TreeSet;

public class Variant1 implements MyFunction {

    @Override
    public void addDictionary(String[] str) {
        new TreeSet<>(Arrays.asList(str)).forEach(System.out::println);
    }
}
