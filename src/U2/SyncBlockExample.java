package U2;

public class SyncBlockExample {
    synchronized void display(int val) {
        System.out.println("Thread: " + Thread.currentThread().getId());
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(val * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String args[]){
        final SyncBlockExample obj = new SyncBlockExample();
        Thread t1 = new Thread() {
            public void run() {obj.display(1);}
        };
        Thread t2 = new Thread(){
            public void run() {obj.display(10);}
        };
        t1.start();
        t2.start();
    }
}

