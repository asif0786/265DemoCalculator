interface animal{
    abstract void breathe();
    abstract void eat();
    abstract void sleep();

}

class dog implements animal{

    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class interfaceDemo{
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.breathe();
        d1.eat();
    }
}