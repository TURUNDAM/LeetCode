/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

package Solutions.Medium;

import java.math.BigInteger;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger sum = getNumber(l1).add(getNumber(l2));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sum);
        stringBuilder.reverse();
        String string = stringBuilder.toString();
        BigInteger reverse = new BigInteger(string);
        BigInteger ten =  BigInteger.valueOf(10);
        ListNode result = new ListNode(Integer.parseInt(String.valueOf(reverse.mod(ten))));

       for(int i = 1 ;i<string.length();i++){
            reverse = reverse.divide(ten);
            result = new ListNode(Integer.parseInt(String.valueOf(reverse.mod(ten))),result);
        }


        return result;
    }

    private BigInteger getNumber(ListNode listNode){
        StringBuilder stringBuilder = new StringBuilder();

        while (listNode.next != null){
            stringBuilder.append(listNode.val);
            listNode = listNode.next;
        }

        stringBuilder.append(listNode.val);//last val
        stringBuilder.reverse();
        String string1 = stringBuilder.toString();
        BigInteger result = new BigInteger(string1);

        return result;
    }
}
