package U2;

public class SleepExample extends Thread{
    public void run(){
        for(int i=1; i<=4; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        SleepExample t2 = new SleepExample();
        t1.start();
        t2.start();
    }
}
