package U2;

public class InterThreadExample {
    int money = 400;

    synchronized void withdraw(int amount) {
        System.out.println("Going to Withdraw...");
        if (money < amount) {
            System.out.println("Do not have enough money...");
            try { wait(); }
            catch (Exception e) { System.out.println(e);}
            }
            money -= amount;
            System.out.println("Withdraw Completed! Saving: " + money);

    }

        synchronized void deposit(int amount){
            System.out.println("Going to Deposit...");
            money += amount;
            System.out.println("Deposit Completed! Saving: "+ money);
            notify();
        }




    public static void main(String[] args) {
        final InterThreadExample obj = new InterThreadExample();
        System.out.println("Saving: " + obj.money);
        new Thread() {
            public void run() {
                obj.withdraw(700);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.deposit(500);
            }
        }.start();
        }
    }

