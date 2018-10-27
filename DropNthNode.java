public class DropNthNode {
	
	/* 
	*	Program that drops the nth node from the end of a linked list. 
	*/
	
	public static class ListNode {
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

	private static ListNode toList(int[] xs){
    	ListNode head = new ListNode(xs[0]);
    	ListNode end = head;
    	for (int i = 1 ; i < xs.length; i++ ) {
    		end.next = new ListNode(xs[i]);
    		end = end.next;
    	}
    	return head;
    }
    private static void printListNode(ListNode node) {
    	while (node != null) {
    		System.out.print(node.val + " -> ");
    		node = node.next;
    	}
    }
    


	public static void main(String[] args) {
//		int[][] nums = {
//		               { 5, 1, 9,11},
//		               { 2, 4, 8,10},
//		               {13, 3, 6, 7},
//		               {15,14,12,16}
//		             };
//		rotate(nums);
//		System.out.println(Arrays.deepToString(nums))
		int[] xs = {1,3,4,5,7};
		int[] ys = {0,4,4,5,6};
		int[] zs = {-1,3,4,10,11,100};
		int[] ws = {0};
		int [] rs = {-4,3,6,7,50};
		ListNode[] nodes = {toList(xs),toList(ys),toList(zs),toList(ws),toList(rs)};
		for (int toDrop: xs) {
			for (ListNode node : nodes) {
				System.out.print("Before: ");
				printListNode(node);
				System.out.print(" After dropping number" + toDrop + " from end: ");
				printListNode(removeNthFromEnd(node,toDrop));
				System.out.println("\n");
			}
		}
	}
}