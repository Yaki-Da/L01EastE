package Lvl_II.h08_Multistreams;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exmpl21RunnableFactoria {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService eS = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        eS.execute(factorial);
        eS.shutdown();
        eS.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable {
    int f;
    public Factorial (int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f<=0) {
            System.out.println("Вы ввели неверное число");
            return;
        }
        int result = 1;
        for(int i = 1; i<=f; i++) {
            result *=i;
        }
        Exmpl21RunnableFactoria.factorialResult = result;
    }
}