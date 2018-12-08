package string;

public class StringBufferConcept {
    public static void main(String[] args) {


        String st1 = "Hello java";
        String st2 = "zaytuna128@gmail.com";
        String st3 = "Hello java";
        String st4 = "Hello java";


        System.out.println(st3.hashCode() + " "+ st2.hashCode());



        StringBuffer sb = new StringBuffer(st1);
        sb.insert(2,"ll");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(st2);

        System.out.println(sb1.insert(0,"A  "));
        StringBuffer sb2 = new StringBuffer(st1);
        System.out.println(sb.hashCode()  + " "+ sb2.hashCode());

        StringBuilder sbb = new StringBuilder(st3);
        StringBuilder abb1 = new StringBuilder(st3);
        System.out.println(st1.hashCode()+  " "+ st3.hashCode());
        System.out.println();
        System.out.println(sbb.hashCode()+ " "+ abb1.hashCode());


        if(sbb.hashCode()==sb1.hashCode()){
            System.out.println("They are same");
        }
        else{
            System.out.println("They are not same");
        }

        System.out.println(sb1.substring(0,st2.indexOf("@")));
        System.out.println(sb1.substring(st2.indexOf("@"),st2.length()));

        sb.append(1);// append means put something in the end .
        System.out.println(sb.append(1));
    }
}