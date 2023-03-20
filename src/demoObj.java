    class Person {
        String name;
        int age;
        String gender;

        public void eat() {
            System.out.println("A person eats");
        }

        public void sleep() {
            System.out.println("A person sleeps");
        }

        public void walk() {
            System.out.println("A person walks");
        }
    }
    public class demoObj {
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.name = "Asif";
            p1.age = 24;
            p1.gender = "Male";
            p1.eat();
            p1.sleep();
            p1.walk();
            System.out.println("Person name is : "+p1.name+" and age is : "+p1.age+" and gender is : "+p1.gender);
        }
    }
