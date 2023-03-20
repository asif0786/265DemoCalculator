import java.util.Scanner;

abstract class person{
    String soul = "Atma";
    abstract public void display();
}


class Student{  //it is a class
    private String name;
    private int rollNo;
    private long phoneNumber;

    //making getter to get value of name which is in private
    public String getName(){  //it is a method
        return name;
    }

    //making getter to get value of rollNumber which is in private
    public int getrollNo(){  //it is a method
        return rollNo;
    }

    //making getter to get value of phoneNumber which is in private
    public long getPhoneNumber(){ //it is a method
        return phoneNumber;
    }

    //setter to set the value
    public void setName(String inputName) {
        this.name = inputName;    //to tak input from user
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
public class encapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        int noOfStudents = sc.nextInt();

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        s1.setName(name);
        System.out.println(s1.getName());

    }
}