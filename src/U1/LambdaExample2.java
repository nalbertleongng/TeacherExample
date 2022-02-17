package U1;
public class LambdaExample2{
    public static void main(String[] args) {
        int value=10;

        //Using Lambda
        LambdaInterface obj =()-> {System.out.println("Value: " + value); };
        obj.display();
    }
}
