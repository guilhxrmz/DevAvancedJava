package Lambda;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterName {
    public static  void  main(String[] args){
        String [] nomes = {"maria","vania","duda","alex","mauro","tagashi"};

        var filtrado = Stream.of(nomes).
                filter(nome -> nome.equals("maria"))
                .collect(Collectors.joining());

        System.out.println(filtrado);
    }
}
