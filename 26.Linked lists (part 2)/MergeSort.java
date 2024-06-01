import java.util.*;
public class MergeSort {


    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

    }
    private Node getMid(Node head){
        Node slow =head;
        Node fast =head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//mid node
    }


    //merge fxn
    private Node merge(Node head1, node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head!= null && head2!= null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1= head1.next;
                temp = temp.next;
            }else{
                temp.next=head2;
                head2= head2.next;
                temp = temp.next;
            }
        }
        while(head1!= null){
            temp.next =head1;
            head1= head1.next;
            temp = temp.next;

        }
        while(head2!= null){
            temp.next =head2;
            head2= head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null ){
            return head;
        }
        //finf mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergerSort(head);
        Node newRight = mergerSort(rightHead);

        //merge
        return merge(newLeft,newRight);


    }
}
