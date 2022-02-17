package U1;
public class TryCatchExample2{
    public static void main (String[] args){
        try{
            int data = 10/0; //Exception
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Continue to Run the Program");
    }
}