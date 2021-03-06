package LeetCode;
public class Problem02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        ListNode cur = pre;
        while(p != null || q != null) {
            int x = p !=null?p.val : 0;
            int y = q != null ?q.val : 0;
            int sum = x + y + carry;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
            if(p != null) {
                p = p.next;
            }
            if(q != null) {
                q = q.next;
            }
        }
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}