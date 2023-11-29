package leetcode2023.date_11_29;

public class AddTwoNumbersII {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len=Math.max(getLength(l1),getLength(l2));
        return null;
    }

    public int getLength(ListNode node){
        if(node.next==null){
            return 1;
        }
        return 1+getLength(node.next);
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
