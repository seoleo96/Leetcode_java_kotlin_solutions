import java.util.*;


class Main3 {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new TreeMap<>();
        map.put(null, 12);
    }
}
public class MainJava {

    private volatile static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                value++;
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                value++;
            }
        });
        th1.start();
        th2.start();
        th1.join();
        th2.join();

        System.out.println(value);
    }
}


class Tinkoff2022 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Thread(()->{
                try {
                    Thread.sleep(1000 );
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
            }).start();
        }
    }
}

interface Asd{
    void move();
}

class A {

}

class B extends A {
}

class C extends B {
}
