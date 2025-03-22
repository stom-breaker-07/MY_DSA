package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leet2115 {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {

        HashSet<String> set=new HashSet<>();
        List<String>ans=new ArrayList<>();
        for(String s:supplies)
        {
            set.add(s);
        }
        boolean flag=true;
        while(flag)
        {
            flag=false;
            for(int i=0;i<recipes.length;i++)
            {
                if(!set.contains(recipes[i]))
                {
                    int x=0;
                    for(int j=0;j<ingredients.get(i).size();j++)
                    {
                        if(!set.contains(ingredients.get(i).get(j)))
                        {
                            x=1;
                            break;
                        }
                    }
                    if(x==0)
                    {
                        flag=true;
                        set.add(recipes[i]);
                        ans.add(recipes[i]);
                    }

                }
            }

        }
        return ans;
    }
}
/*Input: recipes = ["bread","sandwich"], ingredients = [["yeast","flour"],["bread","meat"]], supplies = ["yeast","flour","meat"]
Output: ["bread","sandwich"]
Explanation:
We can create "bread" since we have the ingredients "yeast" and "flour".
We can create "sandwich" since we have the ingredient "meat" and can create the ingredient "bread".*/