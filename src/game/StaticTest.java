package game;

public class StaticTest {
    private static Cat cat;
    public static Cat getCat(){
        if(cat==null){
            System.out.println("你正在创建一个新的类！");
            cat=new Cat();
        }
        return cat;
    }

    public static Animal getAni(int num){
        if(num>10){
            return new Cat();
        }else {
            return new Dog();
        }
    }

    public static void main(String[] args) {
        getCat();
        getCat();
    }
}
class Animal{

}
class Cat extends Animal{
    Cat(){

    }
}
class Dog extends Animal{
    Dog(){

    }
}
