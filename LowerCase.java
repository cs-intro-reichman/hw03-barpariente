public class LowerCase {
    public static void main(String[] args) {

        String a = (args[0]);
        String newA = ""; 
        char s = ' '; 
        for (int i=0; i < a.length(); i++){
            s = a.charAt(i);
            // #feedback: you already calculated it and stored the result in s, why do you need to calculate it twice again?
            if ((s >= 65)&&(s <= 90)){
                
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
