package Lambda;

public class FirtsClass {
    @Override
    public String toString() {
        return "FirtsClass{}";
    }

    public static  void  main(String[] args){
        Funtion funtion = value1 -> "Test from Lambda for" + value1;

        System.out.println(funtion.generate(" Guilherme"));
    }
}
@FunctionalInterface
interface Funtion{
    String generate (String value1);
        }