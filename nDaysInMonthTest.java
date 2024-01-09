public class nDaysInMonthTest {
    public static void main(String[] args) {

        for (int i=1; i <= 12; i++){

            if ((i == 4) || (i == 6) || (i == 11)){

                System.out.println("Month" + i + "has 30 days");
            }
            else if (i == 2) {
                if (isLeapYear) {
                    System.out.println("Month" + i + "has 29 days");
                }
                else {
                    System.out.println("Month" + i + "has 28 days");
                }

            }
            else {
                    System.out.println("Month" + i + "has 31 days");
                }
        }
        
    }
}
