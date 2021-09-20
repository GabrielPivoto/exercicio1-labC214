public class Math {

    public static int areaRetangulo(int arg1, int arg2){
        return arg1*arg2;
    }

    public static String verificaParidade(int arg1){
        if(arg1 % 2 == 0)
            return "Par";
        return "Ímpar";
    }

    public static int fatorial(int arg1){
        int fat = 1;
        for(int i = 1; i <= arg1; i++)
            fat *= i;
        return fat;
    }

}
