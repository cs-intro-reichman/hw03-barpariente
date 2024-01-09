public class LowerCase {
    public static void main(String[] args) {

        String a = (args[0]);
        String newA = ""; 
        char s = ' '; 
        for (int i=0; i < a.length(); i++){
            s = a.charAt(i);

            if (((a.charAt(i)) >= 65)&&(a.charAt(i) <= 90)){
                
                s = ((char)(s+32));  
                newA = newA + s; 
            }
            else {
                newA = newA + s;
            }
        }
        System.out.println(newA); 

    }
}
