package game;

import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Java8Demo {

    public static void main(String[] args) {
//        Consumer类，函数式编程
//        Consumer<String> consumer=System.out::println;
//        consumer.accept("ss");

//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(3);
//        list.add(3);
//        list.add(4);
//        list.stream().map(x->x+2).filter(x->x>4).distinct().forEach(System.out::println);
//        Integer reduce = list.stream().map(x -> x + 3).reduce(0, (x, y) -> x + y);
//        System.out.println(reduce);
        List<User> users= Arrays.asList(
                new User("zs",11,10000),
                new User("ls",21,11636),
                new User("ww",31,17384),
                new User("zl",41,17789),
                new User("cai",51,14399)
        );
        Set<String> collect = users.stream().map(User::getName).collect(Collectors.toSet());
        collect.forEach(System.out::println);

        Double collect1 = users.stream().collect(Collectors.averagingDouble(User::getSalary));
        System.out.println(collect1);


//        run(System.out::println);
        run((x,y)->{
            System.out.println("这是lambda表达式:");
            return x+y;
        });
        run(new People() {
            @Override
            public Integer printName(Integer x,Integer y) {
                return x-y;
            }
        });
    }

    public static void run(People people){
        Integer integer = people.printName(1, 2);
        System.out.println(integer);
    }
}

interface People{
    Integer printName(Integer x,Integer y);
}
class User {
    private String name;
    private Integer age;
    private double salary;

    public User(String name, Integer age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.salary, salary) == 0 &&
                Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }
}
