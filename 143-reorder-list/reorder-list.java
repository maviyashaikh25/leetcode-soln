
class Solution {
    public void reorderList(ListNode head) {


        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode Midnode = slow ;

        ListNode curr = Midnode.next;
        Midnode.next = null ; 
        ListNode prev = null ;
        ListNode next ;

while(curr!=null){

next =curr.next ;
    curr.next=prev ;
      prev=curr;
      curr=next ;

}



ListNode left = head ;
ListNode right = prev ;

while(right != null){

  ListNode tmp1 = left.next;
            ListNode tmp2 = right.next;

            left.next = right ;
            right.next = tmp1;

            left = tmp1;
            right = tmp2;




}

        
    }
}