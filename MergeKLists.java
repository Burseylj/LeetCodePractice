public class CodeSnippets {
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}


	public static ListNode mergeKLists(ListNode[] lists) {
        ListNode mergedHead = null;
        for (ListNode node : lists) {
        	mergedHead = mergeLists(mergedHead, node);
        }
        return mergedHead;
    }
    private static ListNode mergeLists(ListNode x, ListNode y){
        if (x ==null) {
        	return y;
        }
        if (y == null) {
        	return x;
        }
        if (x.val < y.val) {
        	x.next = mergeLists(x.next,y);
        	return x;
        } else {
        	y.next = mergeLists(x, y.next);
        	return y;
        }
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
		int[] xs = {1,3,4,5,7};
		int[] ys = {0,4,4,5,6};
		int[] zs = {-1,3,4,10,11,100};
		int[] ws = {0};
		int [] rs = {-4,3,6,7,50};
		ListNode[] nodes = {toList(xs),toList(ys),toList(zs),toList(ws),toList(rs)};
		printListNode(mergeKLists(nodes));
	}

}