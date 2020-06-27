package game;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/lrs/java/HelloWorld.java");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String str;
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        bufferedReader.close();
        fileReader.close();
    }
}
