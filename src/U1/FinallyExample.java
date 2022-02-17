package U1;
public class FinallyExample{
    public static void main(String args[]){
        try{
            int val = 100/0;
            System.out.println(val);
        }
        catch (ArithmeticException e){ System.out.println(e);}
        finally{ System.out.println("Finally Block");}
        System.out.println("Continue to Run the Program");
    }
}