package U2;

public class staticSyncExample {
        synchronized void display(int val) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(val * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e); }
            }
        }

        public static void main(String args[]){
            final SyncMethodExample obj = new SyncMethodExample();
            Thread t1 = new Thread() {
                public void run() { obj.display(1);}
            };
            Thread t2 = new Thread(){
                public void run() {obj.display(10);}
            };
            Thread t3 = new Thread(){
                public void run() {obj.display(100);}
            };
            Thread t4 = new Thread(){
                public void run() {obj.display(2000);}
            };
            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
    }



