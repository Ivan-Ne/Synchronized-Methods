public class ATM {

    //Private variable equal to the value of money in the ATM
    private int amount;
    // Monitor for synchronization
    private final Object monitor1 = new Object();

    // Constructor of class ATM
    public ATM(int amount) {
        this.amount = amount;
    }

    // Method withdraw decreases amount of money at the ATM
    public synchronized void withdraw(String name, int amount){
        synchronized (monitor1){
            System.out.println();
            System.out.println(name + " went to the ATM");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (amount <= this.amount){
                this.amount -= amount;
                System.out.println(name + " withdrew " + amount);
                System.out.println("Left: " + this.amount);
            } else{
                System.out.println("There is not enough money in the account for " + name);
            }
        }
    }

    // Method topUp increases amount of money at the ATM
    public synchronized void topUp(String name, int amount){
        synchronized (monitor1){
            System.out.println();
            System.out.println(name + " went to the ATM");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.amount += amount;
            System.out.println(name + " topped up " + amount);
            System.out.println("Left: " + this.amount);
        }
    }
}
