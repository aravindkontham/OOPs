import java.util.Scanner;

public class MinMax {
    int i;
    int s;
    void min(int a, int b)//parameters.formal parameters
    {
        if(a>b)
            System.out.println(+a+"is max");
        else if (b>a)
            System.out.println(+b+" is max");
        else
            System.out.println("Both are equal:");

    }
    public static void minn(int a,int c){
        System.out.println("Hello everyone");

    }

    public static void main(String[] args) {
        MinMax m1=new MinMax();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 nos.");
        int a=scan.nextInt();
        int b=scan.nextInt();
        m1.min(a,b);//calling function  with object
        minn(a,b);//arguments or actual parameters

    }
}
