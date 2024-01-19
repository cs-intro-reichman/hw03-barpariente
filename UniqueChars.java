public class UniqueChars {
    public static void main(String[] args) {

        String a = (args[0]);
        String newA = ""; 

        /* 
            #Feedback: 
            It's very clever usage of indexOf for validating uniques.
            However it makes your code unclear.
            In addition, try to be more consistent with the definitions of space.
            You used here multiply versions, which made your code confusing.
            Try always to read your code as a non-programmer, your steps should be understandable.
            Another thin, instead of seperating cases for space, you could include it with same logic
            that way you avoid duplication of code and make the condition more reasonable.
        */
        char space = ' ';
        for (int i=0; i<a.length(); i++){
            char s = a.charAt(i);
            if ((a.indexOf(s) == i) || (s != space)){
                newA = newA + s;
            }
        }
        
        System.out.println(newA); 

    }
}
