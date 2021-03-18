import java.util.Arrays;

public class Variant2 implements MyFunction {
    @Override
    public void addDictionary(String[] str) {
        Arrays.stream(str).distinct().sorted().forEach(System.out::println);
    }
}
