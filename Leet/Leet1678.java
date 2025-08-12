package MY_DSA.Leet;

public class Leet1678 {
    class Solution {
        public String interpret(String command) {
            return command.replace("()","o").replace("(al)","al");
        }
    }
}
