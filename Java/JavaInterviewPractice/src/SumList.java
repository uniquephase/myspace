
class Node{
	int value;
	Node next;
}
public class SumList {
	Node outList=null;
	public static void main(String[] args) {
		
		SumList obj = new SumList();
		Node list1 = null;
		Node list2 = null;
		list1 = obj.AddEnd(list1, 8);
		list1 = obj.AddEnd(list1, 7);
		list1 = obj.AddEnd(list1, 5);
		list1 = obj.AddEnd(list1, 2);
		
		list2 = obj.AddEnd(list2, 4);
		list2 = obj.AddEnd(list2, 1);
		list2 = obj.AddEnd(list2, 9);
		list2 = obj.AddEnd(list2, 7);
		
		obj.Sum(list1, list2);

	}

	private void Sum(Node list1, Node list2) {
		int len1 = 0, len2 = 0,num=0;
		len1=getLength(list1);
		len2=getLength(list2);
		
		num=AddList(list1, list2,len1, len2);
		
		if(num>0)
			outList=Add(outList, num);
		PrintList(outList);
		return;
	}

	private int AddList(Node list1, Node list2,int len1, int len2) {
		int num = 0;
		if (len1 <= 0 && len2 <= 0) {
			return 0;
		} else if (len1 > len2) {
			num = AddList(list1.next, list2,len1 - 1, len2);
			num += list1.value;
		} else if (len2 > len1) {
			num = AddList(list1, list2.next,len1, len2 - 1);
			num += list2.value;
		} else{
			num=AddList(list1.next, list2.next,len1-1, len2-1);
			num+=list1.value+list2.value;
		}
		outList=Add(outList, num%10);
		return num / 10;
	}
	private int getLength(Node list){
		Node temp=list;
		int len=0;
		while (temp != null){
			len++;
			temp=temp.next;
		}
		return len;
	}

	private Node Add(Node list, int value) {
		Node node = new Node();
		node.value=value;
		node.next=list;
		list = node;
		return list;
	}

	private Node AddEnd(Node head, int value) {
		Node node = new Node();
		Node temp = new Node();
		node.value=value;
		if (head == null) {
			head = node;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next=node;
		}

		return head;
	}
	private void PrintList(Node list){
		while (list != null) {
			System.out.print(list.value);
			if (list.next != null)
				System.out.print("-->");
			list = list.next;
		}
	}

}
