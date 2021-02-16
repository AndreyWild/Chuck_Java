package t_8_Multithreading.ThreadMethods;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        thread.start();
        thread.join(1500); // ждать либо 1,5 сек либо завершения Worker
        // (что быстрее то и сработает), т.к. Worker работает дольше 1,5 секунды,

//        Method main begins
//        Work begin
//        Method main ends
//        Work ends

        System.out.println("Method main ends");
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begin");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}