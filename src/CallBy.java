public class CallBy {
    int a;
    int b;
    public static void Call(int c,int d){
         c=10;
        System.out.println("during thr function call: "+(c+d));

    }

    public static void main(String[] args) {
        CallBy call=new CallBy();
        call.a=4;
        call.b=8;
        System.out.println("Before call: "+(call.a+call.b));
        Call(call.a, call.b);
        System.out.println("After the call :"+(call.a+call.b));
    }
}
