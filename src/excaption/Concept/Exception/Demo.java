package excaption.Concept.Exception;

public class Demo {

    public static void main(String[] args) throws Exception {

        int a = 5;
        int b = 0;
        //int c = a / b;
        int[] ary = new int[5];
        // there is two ways of that , one is doing try catch , another is just try
        // the no catch then write the throws .

        try {
            // System.out.println(c);
            System.out.println(ary[6]);

            //   } catch (Exception e) {
            //System.out.println("there is an error");


            //  finally {
            // System.out.println("delete cookies");
        }
        finally {
            System.out.println("close ");
        }
    }
}