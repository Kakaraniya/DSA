package OOP.ExceptionHandling;

public class exceptionHandling {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        try{
            //int c = a / b;
            //divide(a,b);
            //throw new Exception("this is normal exception");
            String name = "abc";
            if(name.equals("abc")){
                throw new MyException("this is myException. name is abc");
            }

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        // note that you can't put catch(Exception e) block on top of ArithematicException e block
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{   //handle exceptions explicitely. it is runtime exception
        if(b==0){
            throw new ArithmeticException("divide by zero");   //can also write ArithematicException
        }
        return a/b;
    }
}
