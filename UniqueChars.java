public class UniqueChars {
    public static void main(String[] args) {

        String a = (args[0]);
        String newA = ""; 
        
        for (int i=0; i<a.length(); i++){

            char s = a.charAt(i);

            if ((a.indexOf(s) == i) && (s != 32)){
                newA = newA + s;
            }
           if (s == 32){
               newA = newA + " ";
              }
        }
        
        System.out.println(newA); 

    }
}
