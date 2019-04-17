package 程序竞赛题;

public class 简单反转链表 {
    public static void main(String[] args) {
        list l=creatList ();
        l=reverse (l);
        while(l!=null){
            System.out.println (l.val);
            l=l.next;

        }
    }
    public static  list creatList(){
        list p=new list();
        list head=null;
        list p1=null;
        int i=0;
        while(i<10){
            if(i==0){
                head=p;
                p1=p;
            }
        else
            {
                p=new list();
                p.val=i;
                p1.next=p;
                p1=p;
            }
        i++;
        }
        p1.next=null;
        return head;
    }
//非递归实现反转链表
    public  static list   reverse(list head){
        if(head==null){
            return null;
        }
       list p=head.next;
        list q=p.next;//令q指向p的下一个节点
        list r;
        p.next=null; //因为反转以后头就是尾，因此我们需要将head的next置为空；方便以后遍历
        //开始循环
        while(q!=null){
            r=q.next;
            q.next=p;//这里开始实现反转，让后一个节点的next值指向前一个节点
            p=q; //指针向后移一个单位
            q=r;  //同理

        }
        //最后循环结束的时候q肯定是空的，说明q的前一个节点是最后一个节点，即为p;
        return p;

    }

}


class list{
    public list(){

    }
    int val;
    list next;
}