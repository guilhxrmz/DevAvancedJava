package Lambda;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterName {
    public static  void  main(String[] args){
        String [] nomes = {"maria","vania","duda","alex","mauro","tagashi"};

        //printa o nome x
        var filterprint = Stream.of(nomes).
                filter(nome -> nome.equals("maria"))
                .collect(Collectors.joining());
        System.out.println(filterprint);

        //printa tudo
        Stream.of(nomes)
                .forEach(System.out::println);

        //trabalhando com numeros
        Integer[] numeros = {2,4,6,8,10};

        //multiplicando por 2
        Stream.of(numeros).
                map(numero -> numero*2).
                forEach(System.out::println);
    }
}
