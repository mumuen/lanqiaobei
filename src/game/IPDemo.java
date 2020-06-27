package game;

import java.util.Arrays;

public class IPDemo {
    public static void main(String[] args) {
        String ip="39.97.125.228";
        byte[] bytes = ipToByte(ip);
        String s = Arrays.toString(bytes);
        System.out.println(s);
        int i = ipToInt(bytes);
        System.out.println(i);
        intToIp(i);
    }
    public static byte[] ipToByte(String ip){
        String[] split = ip.split("\\.");
        String s = Arrays.toString(split);
        System.out.println(s);
        byte[] ips=new byte[4];
        for(int i=0;i<4;i++){
            ips[i]=(byte) (Integer.parseInt(split[i])&0xFF);
        }
        return ips;
    }
    public static int ipToInt(byte[] bytes){

        int addr=bytes[0]&0XFF;
        addr|=(bytes[1]<<8)&0XFF00;
        addr|=(bytes[2]<<16)&0XFF0000;
        addr|=(bytes[3]<<24)&0XFF000000;
        return addr;
    }

    public static void intToIp(int i){
        byte[] bytes=new byte[4];
        bytes[0]=(byte)(i&0XFF);
        i>>=8;
        bytes[1]=(byte)(i&0XFF);
        i>>=8;
        bytes[2]=(byte)(i&0XFF);
        i>>=8;
        bytes[3]=(byte)(i&0XFF);
        System.out.println(Arrays.toString(bytes));
    }

}
