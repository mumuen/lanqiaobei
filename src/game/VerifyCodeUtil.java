package game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class VerifyCodeUtil {
    private int weight=100;
    private int height=40;
    private Color bgColor = new Color(255,255,255);
    private String[] fontName = {"宋体","华文楷体","黑体","华文新魏","华文隶书","微软雅黑"};
    private int[] fontSize = {30,32,34,36,38};
    private String codes = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRESTUVWXYZ0123456789";
    private Random random=new Random();
    private StringBuilder sb = new StringBuilder();

//    先创建背景图片
//    在图片上添加字符
//    在图片上添加几条横线

    public void createVerifyCode() throws IOException {
        BufferedImage img=new BufferedImage(weight,height,BufferedImage.TYPE_INT_RGB);
        Graphics graphics = img.getGraphics();
        graphics.setColor(bgColor);
        graphics.fillRect(0,0,weight,height);

        for(int i=0;i<4;i++){
            graphics.setColor(getRandomColor());
            graphics.setFont(getRandomFont());
            String s=getRandomChar();
            sb.append(s);
            graphics.drawString(s,weight/4*i,height-5);
        }

        graphics.setColor(Color.black);
        for(int i=0;i<3;i++){
            int x1=random.nextInt(weight);
            int x2=random.nextInt(weight);
            int y1=random.nextInt(height);
            int y2=random.nextInt(height);
            graphics.drawLine(x1,y1,x2,y2);
        }

        graphics.dispose();

        FileOutputStream outputStream = new FileOutputStream("e://a.jpg");
        ImageIO.write(img, "JPEG", outputStream);
        outputStream.close();
    }

    private Color getRandomColor(){
        Color color = new Color(random.nextFloat(),random.nextFloat(),random.nextFloat());
        return color;
    }

    private Font getRandomFont(){
        String fontname=fontName[random.nextInt(fontName.length)];
        int style=random.nextInt(4);
        int size=fontSize[random.nextInt(fontSize.length)];
        return new Font(fontname,style,size);
    }

    private String getRandomChar(){
        int index=random.nextInt(codes.length());
        return codes.charAt(index)+"";
    }

    private void getString(){
        System.out.println(sb);
    }


    public static void main(String[] args) throws IOException {
        VerifyCodeUtil verifyCodeUtil = new VerifyCodeUtil();
        verifyCodeUtil.createVerifyCode();
        verifyCodeUtil.getString();
    }

}
