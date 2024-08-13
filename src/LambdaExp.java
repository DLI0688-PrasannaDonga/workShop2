import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.Locale.filter;

public class LambdaExp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Prasa", "Mouni", "Dong","", "gadd","");
        List<String> nonEmptyList=list.stream()
                .filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(nonEmptyList);
    }
}
