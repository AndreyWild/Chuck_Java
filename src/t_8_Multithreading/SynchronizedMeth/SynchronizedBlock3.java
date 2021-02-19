package t_8_Multithreading.SynchronizedMeth;

public class SynchronizedBlock3 {

    void mobileCall() {
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mobile call ends");
    }

    void skypeCall() {
        System.out.println("Skype call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Skype call ends");
    }

    void whatsappCall() {
        System.out.println("WhatsApp call starts");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("WhatsApp call ends");
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableMobile());
        Thread thread2 = new Thread(new RunnableSkype());
        Thread thread3 = new Thread(new RunnableWhatsApp());
    }
}

class RunnableMobile implements Runnable{
    @Override
    public void run() {
        new SynchronizedBlock3().mobileCall();
    }
}

class RunnableSkype implements Runnable{
    @Override
    public void run() {
        new SynchronizedBlock3().skypeCall();
    }
}

class RunnableWhatsApp implements Runnable{
    @Override
    public void run() {
        new SynchronizedBlock3().whatsappCall();
    }
}