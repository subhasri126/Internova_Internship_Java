class NumberThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number Thread : " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

class MessageThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Message Thread : Learning Java Multithreading");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class MultipleTasks {

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        MessageThread t2 = new MessageThread();

        t1.start();
        t2.start();
    }
}