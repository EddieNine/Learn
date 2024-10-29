package LeetCode.AddTwoNumbers;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode deserialize(String data) {
        if (data == null || data.length() == 0 || data.equals("[]")) return null;

        String[] nodes = data.replaceAll("[\\[\\]]", "").split(",");
        ListNode head = new ListNode(Integer.parseInt(nodes[0].trim()));
        ListNode current = head;

        for (int i = 1; i < nodes.length; i++) {
            if (nodes[i].trim().isEmpty()) continue;
            current.next = new ListNode(Integer.parseInt(nodes[i].trim()));
            current = current.next;
        }
        return head;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }

    // Método principal para testes
    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = ListNode.deserialize("[2,4,3]");
        ListNode l2 = ListNode.deserialize("[5,6,4]");
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Imprimir o resultado
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
