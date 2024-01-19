public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder  sb =new StringBuilder("Atul");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert
        sb.insert(2, 't');
        System.out.println(sb);
        //delete
        sb.delete(2, 2);
        System.out.println(sb);
    }
    
}
