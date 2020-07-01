package game;

public class MyLinkedList {
    Node first;
    Node last;
    private Integer size=0;

    MyLinkedList(){
    }

    public static void main(String[] args) {
        int arr[]={5,5,5,5,5};
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addAll(4,arr);
        System.out.println(myLinkedList.last.element);
        myLinkedList.show();
    }

    public int size(){
        return size;
    }

    public void addLast(Integer element){
        Node l=last;
        Node node = new Node(l, element, null);
        last=node;
        if(l==null){
            first=node;
        }else{
            l.next=node;
        }
        size++;
    }

    public boolean addAll(Integer index,int[] arr){
//        没处理当index==0时候的情况
        checkRange(index);

        if(arr.length==0){
            return false;
        }
        Node pred,theLast;

        pred=node(index);
        theLast=pred.next;

        for(int i=0;i<arr.length;i++){
            Node node = new Node(pred, arr[i], null);
            pred.next=node;
            pred=node;
            size++;
        }
//        最后面节点的处理
        pred.next=theLast;
//        当最后一个节点是空的时候，即index==size的情况，last要做改变成pred
        if(theLast==null){
            last=pred;
        }else{
//            如果最后一个节点不是空的时候，最后一个节点的前一个节点要改成pred
            theLast.prev=pred;
        }
        return true;
    }

    private Node node(Integer index){
        if(index==0){
            return null;
        }
        Node curr=first;
        for(int i=1;i<index;i++){
            curr=curr.next;
        }
        return curr;
    }

    private void checkRange(Integer index) {
        if(index>size||index<0){
            throw new IndexOutOfBoundsException("下标不合法！");
        }
    }

    public void show(){
        Node start=first;
        while(start!=null){
            System.out.print(start.element+",");
            start=start.next;
        }
    }

    private class Node{
        Integer element;
        Node prev;
        Node next;
        Node(Node prev,Integer element,Node next){
            this.prev=prev;
            this.next=next;
            this.element=element;
        }
    }
}
