package MY_DSA.Leet;

import java.util.Stack;

public class Leet150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(String s:tokens){
            if(s.matches("-?\\d+")){
                int i=Integer.parseInt(s);
                stk.push(i);
            }else{
                int last=stk.pop();
                int first=stk.pop();

                switch(s){
                    case "+":stk.push(first+last); break;
                    case "-":stk.push(first-last); break;
                    case "*":stk.push(first*last); break;
                    case "/":stk.push(first/last); break;
                };
            }
        }
        return stk.pop();
    }
}
