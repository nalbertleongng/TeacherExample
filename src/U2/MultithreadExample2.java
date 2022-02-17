package U2;

public class MultithreadExample2 implements Runnable{
    public void run(){
        System.out.println("Thread"+Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        int n = 4;
        for(int i =0; i<n; i++){
            MultithreadExample obj = new MultithreadExample();
            obj.start();
        }
    }
}