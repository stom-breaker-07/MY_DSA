package MY_DSA.Leet;

public class Leet065 {
    public boolean isNumber(String s) {
        return s.matches("^[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?$");
    }
}
