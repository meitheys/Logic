package testes.instaceof;

class Tree {

}

class Pine extends Tree {

}

class Oak extends Tree {

}

public class JavaInstanceOf {
    public static void main(String[] args) {
        Tree tree = new Pine();

        if (tree instanceof Oak)
            System.out.println("Oak");
        if (tree instanceof Pine)
            System.out.println("Pine");
        if (tree instanceof Tree){
            System.out.println("Tree");
        }
        else System.out.println("Isn't");
    }
}
