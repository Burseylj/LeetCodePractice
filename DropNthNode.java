public class DropNthNode {
	
	/* 
	*	Program that drops the nth node from the end of a linked list. 
	*/
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}


	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int index = 0;
		//this is the parent of the nth node which we are dropping
		ListNode nodeToSwap = head;
		ListNode lastChecked = head;
		while (index + 1< n){ //make sure that there is an nth node from the head
			if (isLast(lastChecked)) {
				return head;
			}
			index++;
			lastChecked = lastChecked.next;
		}
		//handle the case where we drop the head
		if (isLast(lastChecked)){
			return head.next;
		}
		lastChecked = lastChecked.next;

			//move through the list until we hit the end
			while (!isLast(lastChecked)){
				nodeToSwap = nodeToSwap.next;
				lastChecked = lastChecked.next;
			}
		nodeToSwap.next =nodeToSwap.next.next;
		return head;
	}
	private static boolean isLast(ListNode node){
		return (node.next == null);
	}

	public static void main(String[] args) {
		
        
	}

}