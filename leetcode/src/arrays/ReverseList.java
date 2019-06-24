package arrays;



//反转一个单链表。
//输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/43/


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class ReverseList {



    public ListNode reverseList(ListNode head) {
        return null;
    }

    public static void main(String[] args) {
        ListNode l=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;



        while (l!=null){
            System.out.println(l.val);
            l=l.next;
        }

    }
}
