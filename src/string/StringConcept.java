package string;

public class StringConcept {

    public static void main(String[] args) {

        String st = new String("hello"); // declare and intialize a String
        String st1 = "Good morning";//  it means the value is same ,they will take same
        // place in the heap

        String st2 = "good morning";
        String st3 = "Good morning";
        String st6 = "1234";
        int a = 1234;

        String st4 = "Java";
        st3 = st4 + "enjoy "; // it means you created a new String on the heap . even the name
        // is same , but is different  String
        String st5 = "abc1234";


        System.out.println(st4.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st2.lastIndexOf('g'));
        System.out.println(st2.length());

        System.out.println(st1.compareTo(st2));
        System.out.println(st1.compareTo(st3));
        System.out.println(st1.substring(5));
        System.out.println(st1.substring(0,6));
        System.out.println(st1.compareToIgnoreCase(st2));
        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println(st4.trim());
        System.out.println(String.valueOf(st5));
        System.out.println(StringConcept.class.getName());
        System.out.println(StringConcept.class.getGenericInterfaces());



        if (st1.hashCode()== st3.hashCode()){
            System.out.println("Cause there are take same place in the heap ");
        }
        else{
            System.out.println("They don't take same place in the heap");
        }
        if(Integer.parseInt(st6)== a ){// change String to int then compare
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal .");
        }

    }
}
