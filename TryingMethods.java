public class TryingMethods {
    public static void main(String[] args){
        myFirststaticMethod();
         mySecondMethod();
    }

   public static void myFirststaticMethod(){
        {
            int x=1000, i = 1 ;
            int sum = 0;
            System.out.println("Enter Number of items :");
            while(i < x)
            {
                sum = sum +i;
                i++;
            }
            System.out.println("Sum of "+x+" numbers is :"+sum);
        }
    }
    static int mySecondMethod(){

        int sum = 0;
          
            for (int i = 12; i < 103; i++) {
                if ( i%2 == 0 ) {

                    sum+=i;
                }

    
    
            }
            System.out.println(sum);
            return sum;
      
    }
    
}
