package game;

import java.util.Arrays;

public class BinaryTest {
    public static void main(String[] args) {
//        int ans=10|0b0;
//        System.out.println(ans);
        System.out.println(intToBinary(115));
        System.out.println(intToBinary(98));
        String s1="sb";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
    }

    public static String intToBinary(int i){
        StringBuilder binary = new StringBuilder();
        int count=0;
        while(i>0){
            int y=i%2;
            i>>=1;
            if(y==0){
                binary.append("0");
            }else{
                binary.append("1");
            }
            count++;
        }
        for(int j=0;j<8-count;j++){
            binary.append("0");
        }
        return binary.reverse().toString();
    }

}
