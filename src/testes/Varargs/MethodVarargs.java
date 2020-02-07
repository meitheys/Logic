package testes.Varargs;

import com.sun.prism.shader.Mask_TextureSuper_AlphaTest_Loader;

class TestArgs {
    public void args(Object... args) {
        //This gives at this method the posibility of get lots of variables that are not being all of them declarated here.
        if (args == null) {
            System.out.println("One/Or more than one of the values is null");
        } else if (args instanceof Object[]) {
            System.out.println("Object is with " + args.length + " elemento(s)");
            for (Object ob: args) {
                System.out.println("\t[" + ob + "]");
            }
        }
    }
}

public class MethodVarargs {
    public static void main(String[] args) {
        //Some code...
        TestArgs ar = new TestArgs();
        ar.args(null);
        ar.args();
        ar.args(1);
        ar.args((Object) null);
        ar.args(new Object[]{null});
        ar.args((Object[]) null);
    }
}
