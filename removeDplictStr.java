public class removeDplictStr {

    public static boolean[] map =new boolean[26];
    public static void removeDplictStr(String str,int idx,String neString){
        
        if(idx == str.length()){
            System.out.println(neString);
            return;
        }
        char currChar =str.charAt(idx);
        if(map[currChar -'a']){
            removeDplictStr(str, idx+1, neString);
        }else{
            neString += currChar;
            map[currChar - 'a']=true;
            removeDplictStr(str, idx+1, neString);
        }
    }

    public static void main(String[] args) {
        String syr ="abbccd";
        removeDplictStr(syr, 0,"");
    }
    
}
