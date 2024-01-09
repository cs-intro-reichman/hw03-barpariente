public class UniqueChars {
    public static void main(String[] args) {

        String a = (args[0]);
        String newA = ""; 
        
        for (int i=0; i<a.length(); i++){

            char s = a.charAt(i);

            if (a.indexOf(s) == i){
                newA = newA + s;
            }
        }
        
        System.out.println(newA); 

    }
}
