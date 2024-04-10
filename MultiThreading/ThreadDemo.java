package MultiThreading;

public class ThreadDemo {
    public static void main(String[] args) {
        //using lamda expression to minimize the code
        Runnable obj = () -> {
            for (int i = 1; i < 100; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj1 = () -> {
            for (int i = 1; i < 100; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }
}

// class A implements Runnable{
// public void run() {
// for(int i=1;i<100;i++){
// System.out.println("hi");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }
// class B implements Runnable {
// public void run() {
// for(int i=1;i<100;i++){
// System.out.println("hello");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }

// }
// }
// }
