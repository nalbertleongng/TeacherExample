package U1;
public class MultipleCatchExample{
    public static void main(String[] args){
        try{
            int arr[]=new int[3];
            arr[3]=10/0;
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
                }
                catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBounds Exception");
                }
                catch(Exception e){
                    System.out.println("Exception");
                }
                System.out.println("Continue to Run the Program");
            }
        }