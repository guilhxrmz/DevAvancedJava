package Lambda;

public class FuntionHighOrder {

    public static  void  main(String[] args){
        Calculo soma = (a,b) -> a+b;
        Calculo sub = (a,b) -> a-b;
        Calculo mult = (a,b) -> a*b;
        Calculo div = (a,b) -> a/b;

        System.out.println(executarOperacao(soma,5,5));
        System.out.println(executarOperacao(sub,5,5));
        System.out.println(executarOperacao(mult,5,5));
        System.out.println(executarOperacao(div,5,5));


    }

    public static int executarOperacao(Calculo calculo,int a, int b){
        return calculo.calcular(a, b) ;
    }

    interface Calculo{
        public int calcular(int a, int b);
    }
}
