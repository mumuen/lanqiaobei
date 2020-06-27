package game;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
//JAVA 反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，
// 都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为 java 语言的反射机制。
public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
//        获取TargetObject类
        Class<?> targetClass = Class.forName("game.TargetObject");
//        用获取到的TargetObject类来实例化一个TargetObject对象
        TargetObject targetObject  = (TargetObject)targetClass.newInstance();
//        获取TargetObject类的类加载器，为AppClassLoader加载器
        ClassLoader classLoader = targetClass.getClassLoader();
        System.out.println(classLoader);
//        通过TargetObject类来获取所有自定义的方法
        Method[] methods = targetClass.getDeclaredMethods();
        for(Method method:methods){
//            打印方法名
            System.out.println(method.getName());
//            获取方法的参数类型
            Class<?>[] parameterTypes = method.getParameterTypes();
//
            System.out.println(Arrays.toString(parameterTypes));
//            Parameter[] parameters = method.getParameters();
//            System.out.println(Arrays.toString(parameters));
        }
//        根据方法名字获取类中的方法
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
//        对方法进行调用，调用的前提是要有一个实例化对象
        publicMethod.invoke(targetObject ,"java");
//        根据名字获取targetClass类的字段
        Field value = targetClass.getDeclaredField("value");
//        获取字段的类型
        Class<?> type = value.getType();
        System.out.println(type);
//        因为是private，我们要对其取消安全检查才能对其进行操作
        value.setAccessible(true);
//        对属性进行赋值，对其赋值的前提是要有一个实例化对象
        value.set(targetObject,"python");
//        获取private方法，取消安全检查，对其调用
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);

    }
}
