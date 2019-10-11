package demo;

import java.io.IOException;

public class Main {

    public static void main(String [] ar) throws IOException{


        int a = 10;
        int b = 10;

        String s = null;
        try{
            System.out.println(b / a);

            System.out.println(s.length());


        }catch (ArithmeticException ae){
            System.err.println("Exception occurred.\n" + ae.getMessage());

        }catch (NullPointerException ne){
            System.err.println("Null pointer Exception occurred.\n" + ne.getMessage());
        }
        catch (Exception ex){
            System.err.println("Exception occurred.\n" + ex.getMessage());
        }finally {
            System.out.println("Program terminated..");
        }


    }
}
