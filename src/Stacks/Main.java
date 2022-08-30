package Stacks;

public class Main {

    void print(){
        String a="JAVA";
        System.out.println(a);
    }//end of fun-- deallocates the memory
   // a="hello";//local variable

    public static void main(String[] args) {
	// write your code here
        Main obj=new Main();
        obj.print();//method calling
    }
}
