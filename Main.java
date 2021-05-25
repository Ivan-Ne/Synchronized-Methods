public class Main {
    public static void main(String[] args) {

        // Creating an object of a class ATM
        ATM atm = new ATM(1000);

        // Creating 5 threads. Each of thread represents a client.

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdraw("Max", 300);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdraw("John", 500);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdraw("Nick", 400);
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.topUp("Andrew", 600);
            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.topUp("Julia", 600);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
