/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp=head;
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        int count=1;
        while(temp!=null){
            if(count%2==1){
                for(int i=0;i<count;i++){
                    if(temp==null)
                        break;
                    queue.add(temp.val);
                    temp=temp.next;
                }
                if(temp==null && queue.size()%2 ==0){
                    while(!queue.isEmpty())
                        stack.push(queue.poll());
                    while(!stack.isEmpty())
                        arr.add(stack.pop());
                }
                else{
                    while(!queue.isEmpty())
                        arr.add(queue.poll());
                }
            }
            else{
                for(int i=0;i<count && temp!=null;i++){
                    stack.push(temp.val);
                    temp=temp.next;
                }
                if(stack.size()%2==0){
                    while(!stack.isEmpty())
                        arr.add(stack.pop());
                }
                else{
                    Collections.reverse(stack);
                    while(!stack.isEmpty())
                        arr.add(stack.pop());
                }
            }
            count++;
        }
        temp=head;
        count=0;
        while(temp!=null){
            temp.val=arr.get(count++);
            temp=temp.next;
        }

        return head;
    }
}