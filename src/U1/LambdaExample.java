package U1;
public class LambdaExample{
    public static void main(String[] args) {
        int value=10;

        //Without lambda, LambdaInterface implementation using anonymous class
        LambdaInterface obj = new LambdaInterface() {
            @Override
            public void display() {
                System.out.println("Value: " + value);
            }
        };
        obj.display();
    }
}