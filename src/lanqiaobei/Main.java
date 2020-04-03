package lanqiaobei;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int arr[]={14,4,5,14,13,14,10,17,2,12,2,14,7,13,14,13,4,16,4,10};
//        int i = minIncrementForUnique(arr);
//        System.out.println(i);
//        int a[]={1,2};
//        int b[]={-1,-2};
//        int c[]={1,2};
//        int d[]={-1,-2};
//        int i = fourSumCount(a, b, c, d);
//        System.out.println(i);
        int arr[][]={{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> lists = allPathsSourceTarget(arr);
        for(List<Integer> l:lists){
            System.out.println(l);
        }
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return solve(graph, 0);
    }
    public static List<List<Integer>> solve(int[][] graph,int nei){
        List<List<Integer>> ans=new ArrayList<>();
        if(nei==graph.length-1){
            LinkedList<Integer> link=new LinkedList();
            link.addLast(nei);
            ans.add(link);
        }
        for(int i=0;i<graph[nei].length;i++){
            int cur=graph[nei][i];
            for(List<Integer> l:solve(graph,cur)){
                l.add(0,nei);
                ans.add(l);
            }
        }
        return ans;
    }
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length=A.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                int sumAB=A[i]+B[j];
                if(map.containsKey(sumAB)){
                    map.put(sumAB,map.get(sumAB)+1);
                }else {
                    map.put(sumAB,1);
                }
            }
        }
        int count=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++) {
                int sumCD=C[i]+D[j];
                if(map.containsKey(-sumCD)){
                    count=count+map.get(-sumCD);
                }
            }
        }
        return count;
    }
    public static int minIncrementForUnique(int[] A) {
        Integer[] arr=new Integer[100];
//        Arrays.sort(A);
        int index=-1;
        int count=0;
        for(int i=0;i<A.length;i++){
            index=A[i];
            if(arr[A[i]]!=null){
                while(arr[index]!=null){
                    index++;
                }
                count=count+index-A[i];
                arr[index]=index;
            }else{
                arr[A[i]]=A[i];
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
        return count;
    }

    public static void findMax(int[] arr,Map<Integer,Integer> map){
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(i)!=null){
                continue;
            }
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        map.put(index,arr[index]);
    }
    public static void bfs(char[][] chars,int K){
        int M=chars.length;
        int N=chars[0].length;
        Queue<int[]> queue=new ArrayDeque();
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(chars[i][j]=='g'){
                    queue.add(new int[]{i,j});
                }
            }
        }
        int arr[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int count=0;
        while(!queue.isEmpty()&&count<K){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int[] node = queue.poll();
                for(int j=0;j<4;j++){
                    int x=node[0]+arr[j][0];
                    int y=node[1]+arr[j][1];
                    if(x<0||x>=M||y<0||y>=N||chars[x][y]=='g'){
                        continue;
                    }
                    chars[x][y]='g';
                    queue.add(new int[]{x,y});
                }
            }
            count++;
        }
    }
}
