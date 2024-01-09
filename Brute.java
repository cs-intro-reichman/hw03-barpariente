public class Brute {
    public static void main(String[] args) {

       double loan = 100000; 
       double rate = 1.05; 
       int n = 10; 
       double epsilon = 0.01; 
       double  loanfinal = loan; 
       double x = (double)(loan/n);
       int steps = 1;  

       for (int i=0; i<n; i++){
                    loanfinal = ((loanfinal - x)*rate); 

                }


            while (loanfinal >= epsilon) {
                loanfinal = loan;
                x = x + epsilon; 

                for (int i=0; i<n; i++){
                    loanfinal =  ((loanfinal - x)*rate); 

                    }
                    steps ++; 

                }
            System.out.println(x); 
            System.out.println(loanfinal);
            System.out.println(steps);  
    }
}
