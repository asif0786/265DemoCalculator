import org.w3c.dom.ls.LSOutput;

public class Equals {
    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = "hi";
        String s3 = "Hello";
        String s4 = "Hello";
        int i = s1.compareTo(s2);
        int j = s2.compareTo(s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(i);
        System.out.println(j);//0 if equal

        Integer m = 10; //object is created and stored
        //int m = 10; //variable is created and stored in memory
        Integer n = 20;

        if(i==j) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
