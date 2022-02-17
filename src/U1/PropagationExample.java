package U1;
public class PropagationExample{
    void method1(){
        int val = 10/0;
    }
    void method2(){
        method1();
    }
    void method3(){
        try{ method2();}
        catch (Exception e){
            System.out.println("Handle Exception Here");}
    }
        public static void main(String args[]){
            PropagationExample obj=new PropagationExample();
            obj.method3();
            System.out.println("Continue to Run the Program");
        }
}