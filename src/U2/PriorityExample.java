package U2;

public class PriorityExample extends Thread{
    public void run(){
        System.out.println("Running Thread with its Priority: "
                +Thread.currentThread().getName()+","
                +Thread.currentThread().getPriority());}

    public static void main(String[] args) {
        PriorityExample t1 = new PriorityExample();
        t1.setName("t1");
        PriorityExample t2 = new PriorityExample();
        t2.setName("t2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
