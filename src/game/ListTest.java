package game;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("1")){
                iterator.remove();
            }
        }
//        for(String i:list){
//            if("1".equals(i)){
//                list.remove(i);
//            }
//        }
        System.out.println(list);
    }
}
