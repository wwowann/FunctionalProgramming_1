import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        Variant1 var1 = new Variant1();
        Variant2 var2 = new Variant2();
        System.out.println("Введите слова через пробел и \"enter\" в конце строки. " +
                "Для завершения введите \"end\"");
        while (true) {
            String str = scan.nextLine();
            if (str.equals("end")) break;
            stringBuilder.append(str);
            stringBuilder.append(" ");
        }
        String[] subStr = stringBuilder.toString().split(" ");
        System.out.println("Вариант 1");
        var1.addDictionary(subStr);
        System.out.println("");
        System.out.println("Вариант 2");
        var2.addDictionary(subStr);
    }


}
