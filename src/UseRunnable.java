/**
 * Created by m.karandish on 1/1/2019.
 */
public class UseRunnable {
    public static void main (String[] args){
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.print("Running thread 1");
//            }
//        };
//
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.print("Running Thread 2");
//            }
//        };

//        built-in interfaces
        Runnable r1 = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Running Thread 1");
        };
        Runnable r2 = () -> System.out.print("Running Thread 2");
        new Thread(r1).start();
        new Thread(r2).start();
    }
}

