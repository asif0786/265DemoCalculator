class Animal{
    public void eat(){
        System.out.println("Animal is eating.");
    }
    public void sleep(){
        System.out.println("Animal is sleeping.");
    }
    public void breathe(){
        System.out.println("Animal is breathing.");
    }
    public void movement(){
        System.out.println("Animal is moving.");
    }
}

class Dog extends Animal{
    String breeds = "dog";
    public void movement(){
        System.out.println("Dog is Walking.");
    }
}

class Doberman extends Dog{
    String breeds = "doberman";


    public void display(){
        breeds = "Hello";
        System.out.println(breeds);
        System.out.println(this.breeds); //points to current class value
        System.out.println(super.breeds);//point to immediate parent class value
    }
}


public class inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog(); //Object Creation
        Doberman c1 = new Doberman();
        d1.eat();
        c1.display();
        d1.sleep();
        d1.breathe();
        c1.movement();
        d1.movement();

        d1.breeds = "Doberman";
    }
}
