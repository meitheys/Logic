package testes.JavaThreads;

class ST extends Thread {
    public ST(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
            System.out.println("Done " + getName());
        }
    }
}

public class JavaThreads {
    public static void main(String[] args) {
        new ST("New York").start();
        new ST("Kyoto").start();
    }
}
