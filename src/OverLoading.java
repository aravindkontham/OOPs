public class OverLoading {
    static int add(int a, int b){//method with 2 arguments
        return a+b;
    }
    static int add(int a, int b, int c){//method with 3 arguments
        return a+b+c;
    }
    static double add(double a,double b){//method with different data type
        return a+b;

    }
    public static void main(String[] args) {

        System.out.println(add(12,13));
        System.out.println(add(11,23,44));
        System.out.println(add(12.2,12.5));

    }
}
