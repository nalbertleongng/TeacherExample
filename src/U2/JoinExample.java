package U2;

public class JoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();
        JoinExample t3 = new JoinExample();

        t1.start();
        try {
            t1.join();
        } catch (Exception e) { System.out.println(e);}
            t2.start();
            t3.start();

    }
}
