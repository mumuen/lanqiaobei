package game;

public class MythQuestion1 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=300;i++){
            if(i%3!=0&&i%5!=0&&i%7==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
