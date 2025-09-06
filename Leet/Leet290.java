package MY_DSA.Leet;

public class Leet290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] st = s.split(" ");
        if (st.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (!map1.containsKey(ch) && !map2.containsKey(st[i])) {
                map1.put(ch, st[i]);
                map2.put(st[i], ch);
            }
            else {
                if (!map1.containsKey(ch) || !map1.get(ch).equals(st[i])) return false;
                if (!map2.containsKey(st[i]) || map2.get(st[i]) != ch) return false;
            }
        }
        return true;
    }
}
