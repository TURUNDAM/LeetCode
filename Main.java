import Solutions.Easy.TwoSum;
import Solutions.Medium.AddTwoNumbers;
import Solutions.Medium.ListNode;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2 = new ListNode(9,l2);
        l2 = new ListNode(9,l2);
        l2 = new ListNode(9,l2);
        l2 = new ListNode(9,l2);
        l2 = new ListNode(9,l2);
        l2 = new ListNode(9,l2);
        l2 = new ListNode(9,l2);
        l2 = new ListNode(9,l2);
        l2 = new ListNode(1,l2);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        System.out.println(addTwoNumbers.addTwoNumbers(l1,l2));
    }
}
