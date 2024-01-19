import java.util.HashSet;

public class uniqueSubsequence {

    //HASHSET= UNIQUE ELEMENT RAKHTA H
    public static void UniqueSubsequence(String str, int idx, String neString, HashSet<String>set){
        if(idx == str.length()){
            if(set.contains(neString)){
                return;
            }
            else{
                System.out.println(neString);
                set.add(neString);
                return;
            }
        }
        char currChar = str.charAt(idx); 

       UniqueSubsequence(str, idx+1, neString+currChar, set);

       UniqueSubsequence(str, idx+1, neString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String>set = new HashSet<>();
        UniqueSubsequence(str, 0, "", set);
        
    }
}
