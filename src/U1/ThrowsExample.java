package U1;
import java.io.IOException;
public class ThrowsExample {
    void method2()throws IOException {
        throw new IOException("Hardware Failure");
    }
    void method1(){
        try{
            method2();
        }catch(Exception e){
            System.out.println("Handle Exception!");}

    }

    public static void main(String[] args) {
        ThrowsExample obj = new ThrowsExample();
        obj.method1();
        System.out.println("Continue to Run the Program");
    }

}


