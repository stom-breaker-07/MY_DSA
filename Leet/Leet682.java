package MY_DSA.Leet;

import java.util.Stack;

public class Leet682 {

        public int calPoints(String[] operations) {
            int sum=0;
            Stack<Integer> stack=new Stack<>();
            for (String op : operations) {
                if (op.matches("-?\\d+")) {
                    int num = Integer.parseInt(op);
                    stack.push(num);
                    sum += num;
                } else if (op.equals("C")) {
                    if (!stack.isEmpty()) {
                        sum -= stack.pop();
                    }
                } else if (op.equals("D")) {
                    if (!stack.isEmpty()) {
                        int doubled = 2 * stack.peek();
                        stack.push(doubled);
                        sum += doubled;
                    }
                } else if (op.equals("+")) {
                    if (stack.size() >= 2) {
                        int last = stack.get(stack.size() - 1);
                        int secondLast = stack.get(stack.size() - 2);
                        int total = last + secondLast;
                        stack.push(total);
                        sum += total;
                    }
                }
            }

            return sum;
        }

}
/*Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.*/