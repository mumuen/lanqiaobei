package lanqiaobei;


import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    public static void main(String[] args) {
//        ListNode l1=new ListNode(1);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(3);
//        ListNode l4=new ListNode(6);
//        ListNode l5=new ListNode(9999);
//        ListNode l6=new ListNode(9);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
//        l5.next=l6;
//        ListNode listNode = addTwoNumbers1(l1, l5);
//
////        ListNode listNode = addTwoNumbers(l1, l5);
//        while(listNode!=null){
//            System.out.println(listNode.val);
//            listNode=listNode.next;
//        }
//        TreeNode n1 = new TreeNode(3);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//        TreeNode n4 = new TreeNode(3);
//        TreeNode n5 = new TreeNode(1);
//
//        n1.left=n2;
//        n1.right=n3;
//        n2.right=n4;
//        n3.right=n5;
//        int rob = rob(n1);
//        System.out.println(rob);
//        boolean validBST = isValidBST(n1);
//        System.out.println(validBST);
//        int arr[][] = {{0, 0, 1},
//                {0, 1, 1},
//                {1, 1, 1}};
//        int[][] ints = updateMatrix(arr);
//        for (int[] a : ints) {
//            System.out.println(Arrays.toString(a));
//        }
//        String s="aabcb";
//        int i = longestPalindrome(s);
//        System.out.println(i);

//        int arr[]={-1, 0, 0, 0, -1, -4};
//        mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//        List<List<Integer>> lists = threeSum(arr);
//        for(List<Integer> list:lists){
//            System.out.println(list);
//        }
//        List<TreeNode> treeNodes = allPossibleFBT(7);
//        System.out.println(treeNodes.size());
//        ListNode listNode = middleNode(l1);
//        System.out.println(listNode.val);
//        int arr[][]={{4,3,1},{3,2,4},{3},{4},{}};
//        List<List<Integer>> lists = allPathsSourceTarget(arr);
//        for(List<Integer> l:lists){
//            System.out.println(l);
//        }
//        int arr[]={2,1,1,2};
//        int rob = rob(arr);
//        System.out.println(rob);
//        int i = fibonaqie1(45);
//        System.out.println(i);
//        int fibonaqie = fibonaqie(46);
//        System.out.println(fibonaqie);
//        int grid[][]={{0}};
//        int i = surfaceArea(grid);
//        System.out.println(i);
//        char board[][]={
//                {'.','.','.','p','.','.','.','.'},
//                {'.','.','.','B','.','.','.','.'},
//                {'.','.','.','R','.','B','.','p'},
//                {'.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.'},
//                {'.','.','.','B','.','.','.','.'},
//                {'.','.','.','p','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.'},
//        };
//        int i = numRookCaptures(board);
//        System.out.println(i);
//        int arr[]={1,1};
//        boolean b = hasGroupsSizeX(arr);
//        System.out.println(b);
//        minimumLengthEncoding(new String[]{"aa","a"});
//        int grid[][]={{1,0,1},{0,0,0},{1,0,1}};
//        int i = maxDistance(grid);
//        System.out.println(i);
//        int i = lastRemaining(500000, 3);
//        System.out.println(i);
//        int arr[]={1,0,5,4};
//        int[] ints = sortArray(arr);
//        System.out.println(Arrays.toString(ints));
//        double v = myPow(2.0, -7);
//        System.out.println(v);
//        int arr[]={1,2,3,4,5};
//        test(arr);
//        maxDepthAfterSplit("((()))");
//        int[][] matrix={
//                {1,0,1},
//                {1,1,1},
//                {0,1,1},
//        };
//        int[][] matrix={
//                {0},
//                {0},
//                {0},
//                {0},
//                {0}
//        };
//        int[][] ints = updateMatrix1(matrix);
//        for(int[] a:ints){
//            System.out.println(Arrays.toString(a));
//        }
//        int[][] matrix={{1},
////        };
//        List<Integer> list = spiralOrder(matrix);
//        System.out.println(list);
//        int board[][]={
//                {0,1,0},
//                {0,0,1},
//                {1,1,1},
//                {0,0,0}
//        };
//        gameOfLife(board);
//        int arr[]={1,2,0,1};
//        trap(arr);
//        trap1(arr);
//        int jump = jump(arr);
//        System.out.println(jump);
//        generateParenthesis(3);
//        System.out.println(list);
//        reverseWords("a  bc");
//        int arr1[]={1,2};
//        int arr2[]={3};
//        findMedianSortedArrays(arr1,arr2);
//        int[] arr={-3, -2, -1, 0, 0, 1,2,3};
//        int[] arr={0,0,0,0};
//        int[] arr={1,-2,-5,-4,-3,3,3,5};
//        List<List<Integer>> lists = fourSum(arr, -11);
//        for(List<Integer> list:lists){
//            System.out.println(list);
//        }
//        int x=2;
//        int y=4;

//        x=x+y;
//        y=x-y;
//        x=x-y;

//        x=x^y;
//        即y=y^y^x,y^y=0,0^任何数等于他自身
//        y=x^y;
//        现在的x=最初的x^y  现在的y=最初的y^y^x
//        x=x^y;
//        System.out.println(x);
//        System.out.println(y);
//        int arr[]={1,0,1,2};
//        boolean b = canJump(arr);
//        System.out.println(b);
        int i = waysToChange(100);
        System.out.println(i);
    }
    static int count=0;
    public static int waysToChange(int n) {
        int values[]={1,5,10,25};
        dfs(values,0,n);
        return count;
    }
    public static void dfs(int[] values,int index,int n){
        if(n<0){
            return;
        }
        if(n==0){
            count++;
            return;
        }
        for(int i=index;i<values.length;i++){
            dfs(values,i,n-values[i]);
        }
    }
    public static List<Integer> rightSideView(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<Integer> list=new LinkedList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            list.add(queue.getFirst().val);
            for(int i=0;i<size;i++){
                TreeNode poll = queue.poll();
                if(poll.right!=null){
                    queue.add(poll.right);
                }
                if(poll.left!=null){
                    queue.add(poll.left);
                }
            }
        }

        return list;
    }
    public static boolean canJump(int[] nums) {
        int start=0;
        int end=0;
        while(end<nums.length-1&&nums[end]!=0){
            int max=start;
            int length=0;
            for(int i=start;i<=end;i++){
                if(nums[i]+i>max){
                    max=nums[i]+i;
                    length=i;
                }
            }
            start=start+length;
            end=max;
        }
        return end>=(nums.length-1);
    }
    public static int[][] updateMatrix1(int[][] matrix) {
        int M=matrix.length;
        int N=matrix[0].length;
        ArrayDeque<int[]> ints = new ArrayDeque<>();
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(matrix[i][j]==0){
                    ints.addLast(new int[]{i,j});
                }else{
                    matrix[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        int arr[][]={{0,1},{0,-1},{1,0},{-1,0}};
        while(!ints.isEmpty()){
            int[] poll = ints.poll();
            for(int k=0;k<4;k++){
                int x=poll[0]+arr[k][0];
                int y=poll[1]+arr[k][1];
                if(x<0||x>=M||y<0||y>=N||matrix[poll[0]][poll[1]]>=matrix[x][y]){
                    continue;
                }
                matrix[x][y]=matrix[poll[0]][poll[1]]+1;
                ints.add(new int[]{x,y});
            }
        }
        return matrix;
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
//            if(nums[i]>target){
//                break;
//            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1;
                int right=nums.length-1;
                while (left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        lists.add(list);
                        while(left<right&&nums[left+1]==nums[left]){
                            left++;
                        }
                        while(left<right&&nums[right-1]==nums[right]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else if(sum>target){
                        right--;
                    }
                }
            }
        }
        return lists;
    }
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        ListNode first=l1;
        ListNode second=l2;
        while (first!=null){
            stack1.push(first.val);
            first=first.next;
        }
        while (second!=null){
            stack2.push(second.val);
            second=second.next;
        }
        int chusu=0;
        ListNode head=null;
        while(!stack1.isEmpty()||!stack2.isEmpty()||chusu>0){
            int sum=chusu;
            if(!stack1.isEmpty()){
                sum+=stack1.pop();
            }
            if(!stack2.isEmpty()){
                sum+=stack2.pop();
            }
            ListNode node = new ListNode(sum % 10);
            node.next=head;
            head=node;
            chusu=sum/10;
        }
        return head;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=(nums1.length+nums2.length)/2+1;
        int left=0;
        int right=0;
        int count=0;
        while(count<length){
            if(left<nums1.length&&right<nums2.length&&nums1[left]<nums2[right]){
                left++;
            }else if(left<nums1.length&&right<nums2.length&&nums1[left]>=nums2[right]){
                right++;
            }else if(left==nums1.length){
                right++;
            }else if(right==nums2.length){
                left++;
            }
            count++;
        }
        System.out.println(left+"::"+right);
//        int max = Math.max(nums1[left - 1], nums2[right - 1]);
//        double mid=(double) max/2;
//        System.out.println(mid);
        return 1.0;
    }
    public static String reverseWords(String s) {
        String[] s1 = s.trim().split(" +");
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s1.length;i++){
            stack.push(s1[i]);
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop()+" ");
        }
        return sb.toString().trim();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode=l1;
        ListNode secondNode=l2;
        ListNode thirdNode=new ListNode(0);
        boolean flag=false;
        ListNode n=thirdNode;
        int x=0;
        do{
            int sum=0;
            if(firstNode!=null){
                sum=sum+firstNode.val;
                firstNode=firstNode.next;
            }
            if(secondNode!=null){
                sum+=secondNode.val;
                secondNode=secondNode.next;
            }
            int y=sum+x;
            if(flag){
                ListNode node=new ListNode(0);
                node.val=y%10;
                thirdNode.next=node;
                x=y/10;
                thirdNode=thirdNode.next;
            }else{
                thirdNode.val=y%10;
                x=y/10;
                flag=true;
            }
        }while (firstNode!=null||secondNode!=null||x>0);

        return n;
    }
//    static List<String> list=new ArrayList<>();
//    public static List<String> generateParenthesis(int n) {
//        dfs(0,0,"",n);
//        return list;
//    }

//    private static void dfs(int left, int right, String str, int n) {
//        if(right==n){
////            System.out.println(str);
//            list.add(str);
//            return;
//        }
//        if(left<n){
//            dfs(left+1,right,str+"(",n);
//        }
//        if(right<left){
//            dfs(left,right+1,str+")",n);
//        }
//    }

    public static int jump(int[] nums) {
        int step=0;
        int start=0;
        int end=0;
        while(end<nums.length-1){
            int max=start;
            for(int i=start;i<=end;i++){
                if(nums[i]+i>max){
                    max=nums[i]+i;
                }
            }
            end=end+max;
            start=end+1;
            step++;
        }
        return step;
    }
    public static int trap(int[] height) {
        int ans=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty()&&height[stack.peek()]<height[i]){
                Integer pop = stack.pop();
                if(!stack.isEmpty()){
                    ans=ans+(Math.min(height[stack.peek()],height[i])-height[pop])*(i-stack.peek()-1);
                }
            }
            stack.push(i);
        }

        return ans;
    }
    public static int trap1(int[] height) {
        int left_max=0;
        int ans=0;
        int right_maxs[]=new int[height.length];
        for(int i=height.length-2;i>=0;i--){
            right_maxs[i]=Math.max(right_maxs[i+1],height[i+1]);
        }
        for(int i=1;i<height.length-1;i++){
            left_max=Math.max(left_max,height[i-1]);
            if(height[i]<left_max&&height[i]<right_maxs[i]){
                ans=ans+Math.min(right_maxs[i],left_max)-height[i];
            }
        }
        return ans;
    }
    public static void gameOfLife(int[][] board) {
        if(board.length==0){
            return;
        }
        int M=board.length;
        int N=board[0].length;
        int arr[][]={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                int ans=0;
                for(int k=0;k<8;k++){
                    int x=i+arr[k][0];
                    int y=j+arr[k][1];
                    if(x<0||x>=M||y<0||y>=N){
                        continue;
                    }
                    ans+=(board[x][y]&1);
                }
//                与1按位与操作，所得结果一定为0或者1，因为只看二进制最后一位是0还是1
                if((board[i][j]&1)==1){
                    if(ans==2||ans==3){
//                        0bxx为二进制数，0b11十进制为3
                        board[i][j]=0b11;
                    }else{
                        board[i][j]=0b01;
                    }
                }else {
                    if(ans==3){
                        board[i][j]=0b10;
                    }
                }
            }
        }
        for(int[] a:board){
            System.out.println(Arrays.toString(a));
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                board[i][j]>>=1;
            }
        }
        for(int[] a:board){
            System.out.println(Arrays.toString(a));
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int M=matrix.length;
        int N=matrix[0].length;
        int level=0;
        LinkedList<Integer> linkedList=new LinkedList<>();
        int i=0;
        int j=0;
        int[][] arr=new int[M][N];
        while (linkedList.size()<M*N){
            while(level%4==0){
                if(j>=N||arr[i][j]==1){
                    if(j>0){
                        j--;
                    }
                    if(i<M-1){
                        i++;
                    }
                    break;
                }
                linkedList.addLast(matrix[i][j]);
                arr[i][j]=1;
                j++;
            }
            level++;
            while(level%4==1){
                if(i>=M||arr[i][j]==1){
                    if(i>0){
                        i--;
                    }
                    if(j>0){
                        j--;
                    }
                    break;
                }
                linkedList.addLast(matrix[i][j]);
                arr[i][j]=1;
                i++;
            }
            level++;
            while (level%4==2){
                if(j<0||arr[i][j]==1){
                    if(j<N-1){
                        j++;
                    }
                    if(i>0){
                        i--;
                    }
                    break;
                }
                linkedList.addLast(matrix[i][j]);
                arr[i][j]=1;
                j--;
            }
            level++;
            while (level%4==3){
                if(j<0||arr[i][j]==1){
                    if(i<M-1){
                        i++;
                    }
                    if(j<N-1){
                        j++;
                    }
                    break;
                }
                linkedList.addLast(matrix[i][j]);
                arr[i][j]=1;
                i--;
            }
            level++;
        }
//        System.out.println(linkedList);
        return linkedList;
    }
    public static int[] maxDepthAfterSplit(String seq) {
        int a=0,b=0;
        int[] arr=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            char c=seq.charAt(i);
            if(c=='('){
                if(a>b){
                    b++;
                    arr[i]=1;
                }else {
                    a++;
                }
            }else{
                if(a>b){
                    a--;
                }else {
                    b--;
                    arr[i]=1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void test(int[] arr){
        quanpailie(arr,new LinkedList<>());
    }
    public static void quanpailie(int[] arr,LinkedList<Integer> list){
        if(list.size()==arr.length){
            System.out.println(list);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                continue;
            }
            list.addLast(arr[i]);
            quanpailie(arr,list);
            list.removeLast();
        }
    }

    public static double myPow(double x, int n) {
        return n<0?1/fastPow(x,-n):fastPow(x,n);
    }
    public static double fastPow(double x,int n){
        if(n==0){
            return 1;
        }
        double half=fastPow(x,n/2);
        if(n%2==1){
            return half*half*x;
        }else {
            return half*half;
        }
    }
    public static int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int stand=arr[start];
            int left=start;
            int right=end;
            while(left<right){
                while(left<right&&arr[right]>=stand){
                    right--;
                }
                arr[left]=arr[right];
                while(left<right&&arr[left]<=stand){
                    left++;
                }
                arr[right]=arr[left];
            }
            arr[left]=stand;
            quickSort(arr,start,left);
            quickSort(arr,left+1,end);
        }
    }
    public static int lastRemaining(int n, int m) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<n;i++){
            linkedList.add(i);
        }
        int arrlen=n;
        int index=0;
        int[] arr=new int[n-1];
        int aindex=0;
        while(arrlen>1){
            index=(m+index-1)%arrlen;
            linkedList.remove(index);
            arr[aindex]=index;
            aindex++;

            arrlen--;
//            System.out.println(index);
        }
//        System.out.println(Arrays.toString(arr));

//        for(int i=0;i<n-1;i++){
//            linkedList.remove(arr[i]);
//        }
        System.out.println(linkedList);
        return 0;
    }
    public static int maxDistance(int[][] grid) {
        int M=grid.length;
        int N=grid[0].length;
        ArrayList<int[]> arrayList=new ArrayList<>();
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(grid[i][j]==0){
                    arrayList.add(new int[]{i,j});
                }
            }
        }
        if(arrayList.size()==0||arrayList.size()==M*N){
            return -1;
        }
        int maxdistance=0;
        int arr[][]={{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] ans:arrayList){
            Queue<int[]> queue=new ArrayDeque<>();
            queue.add(ans);
            boolean flag=true;
            int count=1;
            int index[][]=new int[M][N];
            index[ans[0]][ans[1]]=1;
            while (flag){
                int size=queue.size();
                first:for(int m=0;m<size;m++){
                    int[] poll = queue.poll();
                    for(int k=0;k<4;k++){
                        int x=poll[0]+arr[k][0];
                        int y=poll[1]+arr[k][1];
                        if(x<0||x>=M||y<0||y>=N||index[x][y]==1){
                            continue;
                        }
                        if(grid[x][y]==0){
                            index[x][y]=1;
                            queue.add(new int[]{x,y});
                        }
                        if(grid[x][y]==1){
                            index[x][y]=1;
                            if(count>maxdistance){
                                maxdistance=count;
                            }
                            flag=false;
                            break first;
                        }
                    }
                }
                count++;
            }
        }
        return maxdistance;
    }
    public static int minimumLengthEncoding(String[] words) {
        int ans=0;
        Set<String> set=new HashSet<>(Arrays.asList(words));
        for(int i=0;i<words.length;i++){
            for(int j=1;j<words[i].length();j++){
                set.remove(words[i].substring(j));
            }
        }
        for(String word:set){
            ans=ans+word.length()+1;
        }
//        System.out.println(ans);
        return ans;
    }
    public static boolean hasGroupsSizeX(int[] deck) {
        int[] arr=new int[10000];
        for(int i:deck){
            arr[i]++;
        }
        int g=-1;
        for(int i:arr){
            if(i>0){
                if(g==-1){
                    g=i;
                }else{
//                    g=gcd(g,i);
                }
            }
        }
        return g>=2;
    }
//    public static int gcd(int x, int y) {
//        return x == 0 ? y : gcd(y%x, x);
//    }
    public int gcd(int x,int y){
        return x==0?y:gcd(y%x,x);
    }
    public static int numRookCaptures(char[][] board) {
        int M=board.length;
        int N=board[0].length;
        int m=-1;
        int n=-1;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    m=i;
                    n=j;
                }
            }
        }
        int arr[][]={{1,0},{-1,0},{0,1},{0,-1}};
        int ans=0;
        for(int i=0;i<4;i++){
            int step=1;
            while(true){
                int x=m+arr[i][0]*step;
                int y=n+arr[i][1]*step;
                if(x<0||x>=M||y<0||y>=N||board[x][y]=='B'){
                    break;
                }
                if(board[x][y]=='p'){
                    ans++;
                    break;
                }
                step++;
            }
        }
        return ans;
    }
    public static int surfaceArea(int[][] grid) {
        int M=grid.length;
        int N=grid[0].length;
        int blocks=0;
        int covers=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                blocks+=grid[i][j];
                if(grid[i][j]>1){
                    covers+=grid[i][j]-1;
                }
//                不需要加上四周的被覆盖的面，只需要加2个就能够将全部的被覆盖的面计算出来了
//                不过一定加四周的话可以最后可以除以二算出总共被覆盖的面吧？
//                加上与上一行同一列被覆盖的面
                if(i>0){
                    covers+=Math.min(grid[i][j],grid[i-1][j]);
                }
//                加上与上一列同一行被覆盖的面
                if(j>0){
                    covers+=Math.min(grid[i][j],grid[i][j-1]);
                }
            }
        }
        return 6*blocks-2*covers;
    }
    public static int fibonaqie(int n){
        int pre=1;
        int mid=1;
        int cur=0;
        for(int i=2;i<n;i++){
            cur=pre+mid;
            pre=mid;
            mid=cur;
        }
        return cur;
    }
    public static int fibonaqie1(int n){
        if(n==1||n==2){
            return 1;
        }
        return fibonaqie1(n-2)+fibonaqie1(n-1);
    }
    public static int  fibonaqie2(int n,int[] arr){
        if(arr[n]!=0){
            return arr[n];
        }
        if(arr[n-1]!=0&&arr[n-2]!=0){
            arr[n]=arr[n-1]+arr[n-2];
        }
        return fibonaqie2(n-2,arr)+fibonaqie2(n-1,arr);
    }
    public static int rob(TreeNode root) {
        if(root==null) return 0;
        int money=root.val;
        if(root.left!=null){
            money+=rob(root.left.left)+rob(root.left.right);
        }
        if(root.left!=null){
            money+=rob(root.right.left)+rob(root.right.right);
        }
        return Math.max(money,rob(root.left)+rob(root.right));
    }
    public static int rob(int[] nums) {
        int[] dp=new int[nums.length];
        int[] dp1=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        dp1[1]=nums[1];
        dp1[2]=Math.max(nums[1],nums[2]);
        for(int i=2;i<nums.length-1;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        for(int i=3;i<nums.length;i++){
            dp1[i]=Math.max(dp1[i-2]+nums[i],dp1[i-1]);
        }
        return Math.max(dp[nums.length-2],dp1[nums.length-1]);
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return solve(graph, 0);
    }

    public static List<List<Integer>> solve(int[][] graph, int node) {
        int N = graph.length;
        List<List<Integer>> ans = new ArrayList();
        if (node == N - 1) {
            List<Integer> path = new ArrayList();
            path.add(N-1);
            ans.add(path);
            return ans;
        }

        for (int nei: graph[node]) {
//            首先递归找到N-1的节点，将N-1节点加入路径中，然后返回给他的邻接节点，再将他的所有邻接节点加入路径中，就这样递归下去
            for (List<Integer> path: solve(graph, nei)) {
                path.add(0, node);
                ans.add(path);
            }
        }
        return ans;
    }

    public static ListNode middleNode(ListNode head) {
        int mid=listCount(head)/2;
        int count=1;
        ListNode curr=head;
        while(curr!=null&&count<=mid){
            curr=curr.next;
            count++;
        }
        return curr;
    }
    public static int listCount(ListNode head){
        ListNode current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public static List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> nodes=new ArrayList<>();
        if(N%2==0){
            return nodes;
        }
        if(N==1){
            nodes.add(new TreeNode(0));
            return nodes;
        }
        for(int i=1;i<N;i+=2){
            List<TreeNode> treeNodes = allPossibleFBT(i);
            List<TreeNode> treeNodes1 = allPossibleFBT(N - 1 - i);

            for(int m=0;m<treeNodes.size();m++){
                for(int n=0;n<treeNodes1.size();n++){
                    TreeNode root = new TreeNode(0);
                    root.left=treeNodes.get(m);
                    root.right=treeNodes1.get(n);
                    nodes.add(root);
                }
            }
        }
        return nodes;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        if(nums.length<3){
            return lists;
        }
//        quickSort(nums);
        for(int i=0;i<nums.length-2;i++){
//            当前数大于0直接返回，
            if(nums[i]>0){
                break;
            }
//            去除重复
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    while(left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return lists;
    }


    public static int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> queue = new ArrayDeque();
        int M = matrix.length;
        int N = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int arr[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] a = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = a[0] + arr[i][0];
                int y = a[1] + arr[i][1];
                if (x >= 0 && x < M && y >= 0 && y < N && matrix[a[0]][a[1]] < matrix[x][y]) {
                    matrix[x][y] = matrix[a[0]][a[1]] + 1;
                    queue.add(new int[]{x, y});
                }

            }
        }
        return matrix;
    }


    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
//两个矩形重叠的条件是什么？
//可以转换成一维的问题来看待，两个矩形重叠，那么他们与x轴平行的边在x轴的投影会有重合，且重合的距离大于0，
//与y轴平行的边同理
//对x轴而言，问题就转换成了两个矩形右上角较小的x坐标要大于两个矩形左下角较大的x坐标
// y轴同理
        return Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) && Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]);
    }
//    public static void quickSort(int[] arr){
//        quickSort(arr,0,arr.length-1);
//    }

//    public static void quickSort(int[] arr,int start,int end){
//        if(start<end) {
//            int stand = arr[start];
//            int low = start;
//            int high = end;
//            while (low < high) {
////            int arr[]={2,4,5,3,2,1};
//                while (low < high && arr[high] >= stand) {
//                    high--;
//                }
//                arr[low] = arr[high];
//                while (low < high && arr[low] <= stand) {
//                    low++;
//                }
//                arr[high]=arr[low];
//            }
//            arr[low] = stand;
//            quickSort(arr,start,low);
//            quickSort(arr,low+1,end);
//        }
//    }
    public static void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }
    public static void mergeSort(int[] arr,int start,int end){
        if(start<end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr,int start,int mid,int end) {
        int[] newArr=new int[end-start+1];
        int res1=start;
        int res2=mid+1;
        int count=0;
        while(res1<=mid&&res2<=end){
            if(arr[res1]<arr[res2]){
                newArr[count++]=arr[res1];
                res1++;
            }else {
                newArr[count++]=arr[res2];
                res2++;
            }
        }
        while(res1<=mid){
            newArr[count++]=arr[res1++];
        }
        while(res2<=end){
            newArr[count++]=arr[res2++];
        }
        count=0;
        for(int i=start;i<=end;i++){
            arr[i]=newArr[count++];
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
class TreeNode {
   int val;
     TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
 class People{
    public void change(List<Integer> list){
        list.add(1);
    }
 }
 class Node{
    int x;
    int y;
    int val;
    public Node(int x,int y,int val){
        this.x=x;
        this.y=y;
        this.val=val;
    }
 }
class Vertex{
    int value;
    boolean visited;
    public Vertex(int value){
        this.value=value;
        this.visited=true;
    }
}



