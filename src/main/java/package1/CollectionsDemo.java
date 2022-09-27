package package1;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
    public static int getQuantityString (List<String> str, char a){
        String onetimeChar = "" + a;
        int count = 0;
        for(String str1 : str){
            if(str1.startsWith(onetimeChar)){
                count++;
            }
        }
        return count;
    }
}
