public class Variables {
   public  int a=10;//instance variable
    public static  int b=20;//static variable
    void printVal(){//simple method:
        System.out.println(" "+a);
    }

    public static void main(String[] args) {
    Variables var=new Variables();
        Variables va=new Variables();

        //System.out.println(a);error because var.a
//        System.out.println(var.a);//
//        System.out.println(b);//object is not mandatory;
       var.printVal();//calling a function
//        System.out.println("" +Variables.b);//class name
//        System.out.println(""+var.b);//reference
        var.a=39;
        var.b=88;
        System.out.println(var.a);
        System.out.println(va.a);
        System.out.println(var.b);
        System.out.println(va.b);

    }
}
