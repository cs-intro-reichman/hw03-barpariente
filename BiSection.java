public class BiSection {
    public static void main(String[] args) {

       double loan = 1000; 
       double rate = 1.05; 
       int n = 10; 
       double epsilon = 0.01; 
       double  loanfinal = loan; 
       int steps = 1;  
       double H = loan;
       double L = (double)(loan/n);
       double x = (H+L)/2;  


                for (int i=0; i <n; i++){
                    loanfinal = ((loanfinal - x)*rate); 

                }

            while ((H-L) > epsilon) {

                loanfinal = loan;
                 x = (H+L)/2;

                for (int j=0; j<n; j++){
                    loanfinal =  ((loanfinal - x)*rate);
                    
                    steps ++;

                    }
                     
                    if (loanfinal >= epsilon){
                        L = x; 
                    }
                    else {
             
                        H = x; 

                    }

                }
            System.out.println(x); 
            System.out.println(loanfinal);
            System.out.println(steps);  
    }
}
