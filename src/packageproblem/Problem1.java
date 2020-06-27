package packageproblem;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
//        有n件物品和容量为m的背包 给出i件物品的重量以及价值 求解让装入背包的物品重量不超过背包容量 且价值最大 。
//        特点:这是最简单的背包问题，特点是每个物品只有一件供你选择放还是不放。
//        有物品的体积v[i],物品的价值w[i]
//        f[i][j]表示只看前i个物品放入容量为j的物品的最优解
//        第i件物品不放：f[i][j]=f[i-1][j]
//        第i件物品放：f[i][j]=f[i-1][j-v[i]]+w[i]
//
        int N=8;
        int n=5,m=6;
        int[] v={0,1,2,3,4,5};
        int[] w={0,1,2,3,4,5};
        int[][] f=new int[N][N];
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(j>=v[i]){
                    f[i][j]= Math.max(f[i-1][j],f[i-1][j-v[i]]+w[i]);
                }
            }
        }

        System.out.println(Arrays.toString(f[4]));
    }
}
