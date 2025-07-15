package MY_DSA.Leet;

public class Leet3136 {
    public boolean isValid(String word) {
        int Ccount=0,Vowcount=0,Concount=0;
        for (char c:word.toCharArray()){
            if(c>='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9'){
                Ccount++;
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='I' || c=='O' || c=='U'){
                    Vowcount++;
                }
                else if(!(c>='0' && c<='9')){
                    Concount++;
                }
            }
            else{
                return false;
            }
        }

        if(Ccount>=3 && Vowcount>=1 && Concount>=1 ){
            return true;
        }
        return false;

    }
}
