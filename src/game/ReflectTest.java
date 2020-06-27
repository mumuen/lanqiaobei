package game;

import sun.misc.Launcher;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class ReflectTest {
    public static void main(String[] args) {
        System.out.println("请输入你要动态加载的类名：");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        Class<?> aClass;
        ArrayList<Integer> integers = new ArrayList<>();
        MyReflect myReflect = new MyReflect();
        try {
            aClass = Class.forName("game."+s);
//            ClassLoader classLoader = myReflect.getClass().getClassLoader();
//            System.out.println(classLoader);
//            System.out.println(classLoader.getParent());
//            null并不代表他没有类加载器，而是类加载器为bootstrap加载器，因为他特殊，所以为null
//            System.out.println(classLoader.getParent().getParent());
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for(Method method:declaredMethods){
                System.out.println(method.getName());
            }
            System.out.println("动态加载成功！");
        } catch (ClassNotFoundException e) {
            System.out.println("类没有找到！");
        }

    }
}
