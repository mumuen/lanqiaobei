package game;

import com.swetake.util.Qrcode;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("F:\\致青春.mp3");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        byte[] by=new byte[fileInputStream.available()];
//        fileInputStream.read(by);
        //新建一个对象
        Qrcode qrcode = new Qrcode();

        //强行设置纠错等级
        //此处的B代表的是中文，还有其他语言的可以设置之后看一下
        qrcode.setQrcodeEncodeMode('B');

        qrcode.setQrcodeErrorCorrect('m');
        //此处的版本号可以设置为1-40的版本 ，
        qrcode.setQrcodeVersion(10);

        //此处使用GUI进行编程
        //版本号与图片的长和宽是有联系的:这是一个固定的公式
        int width=67+12*(10-1);
        int height=67+12*(10-1);

        //为二维码来设置偏移量
        int offset = 2;

        //缓冲区图片 下面的这几个类都是在GUI中的几个类，不是特别的常见
        BufferedImage buffimmage=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //在缓冲区图片的基础上创造画笔
        Graphics2D g=buffimmage.createGraphics();
        g.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.clearRect(0, 0, width, height);

        //接下来我们要生成二维码，

        String str= "林荣盛";

        //把字符串转化为字节数组
        byte[] bytes= null;
        try {
            bytes=str.getBytes("utf-8");
        }catch (UnsupportedEncodingException e){

        }
        if(bytes.length>0){
            //用boolean类型的二维数组存放二维码，如果是true则描黑，false则留白。qrcode.calQrcode(bytes);是计算二维码的信息的是方法
            boolean[][] bool=qrcode.calQrcode(bytes);
            //长和宽是一样的
            for(int i=0;i<bool.length;i++){
                for(int j=0;j<bool[i].length;j++){
                    if(bool[i][j]==true){
                        //画小方格
                        g.fillRect(i*3+offset, j*3+offset, 3, 3);
                    }
                }
            }
        }
        g.dispose();
        buffimmage.flush();
        try {
            ImageIO.write(buffimmage, "png", new File("E://Java极客技术.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
