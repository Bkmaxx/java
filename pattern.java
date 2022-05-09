class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}
class Cat extends Dog{
    void meow(){
        System.out.println("cat meows");
    }
}
class pattern{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.bark();
        c.eat();
        c.meow();
    }
}