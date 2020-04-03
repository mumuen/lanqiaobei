package lanqiaobei;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        minSteps(2);
    }
    public static int minSteps(int n) {
        List<Integer> list=new ArrayList<>();

        int ans = 0, d = 2;
//        将一个合数分解成素数相乘，核心代码
        while (n > 1) {
//            初始的除数为2，从2开始可以保证不漏一个素数
            while (n % d == 0) {
                ans += d;
                n /= d;
                list.add(d);
            }
            d++;
        }
        System.out.println(list);
        return ans;
    }
}
