package game;

import java.util.Arrays;

public class MythTest {
    public static void main(String[] args) {
//        邻接矩阵
        int g1[][]={
                {0,1,0,1,0},
                {0,0,0,1,0},
                {0,1,0,0,0},
                {0,0,1,0,1},
                {1,0,0,0,0}
        };
        test(g1,4);
//        int g2[][]={
//                {1,2,0},
//                {0,0,1},
//                {1,0,0},
//                {0,0,1}
//        };
//        test(g1,2);
//        multiple(g1,g2);

    }

//  计算矩阵的阶层
    public static void test(int[][] g,int n){
        if(n<=1){
            return;
        }
        int M=g.length;
        int N=g[0].length;
        int[][] g1=new int[M][N];

        for(int i=0;i<M;i++){
            g1[i]=Arrays.copyOf(g[i],N);
        }

        for(int i=1;i<n;i++){
            g1= multiple(g1, g);
        }
        for(int[] g2:g1){
            System.out.println(Arrays.toString(g2));
        }
    }

//  两矩阵相乘
    public static int[][] multiple(int[][] g1,int[][] g2){
//        第一个矩阵行
        int M=g1.length;
//        列
        int N=g1[0].length;
//        第二个矩阵行
        int M1=g2.length;
//        列
        int N1=g2[0].length;

        int[][] g3=new int[M][N1];

        for(int i=0;i<M;i++){
            for(int j=0;j<N1;j++){
                int sum=0;
                for(int k=0;k<N;k++){
                    sum+=g1[i][k]*g2[k][j];
                }
                g3[i][j]=sum;
            }
        }
//        for(int[] g:g3){
//            System.out.println(Arrays.toString(g));
//        }
        return g3;
    }
}
