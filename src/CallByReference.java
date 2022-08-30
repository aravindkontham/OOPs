import java.lang.ref.Reference;

public class CallByReference {
    int a;
    int b;
    public static void Refer(CallByReference ref,CallByReference ref1){
        ref.a=20;
        System.out.println("During: "+(ref.a+ref1.b));
    }

    public static void main(String[] args) {
        CallByReference ref=new CallByReference();
        CallByReference ref1=new CallByReference();
        ref.a=10;
        ref1.b=45;
        Refer(ref,ref1);
        System.out.println(ref.a);
        System.out.println(ref1.b);

    }
}
