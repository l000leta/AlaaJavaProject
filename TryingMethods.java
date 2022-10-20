public class TryingMethods {
    public static void main(String[] args){
        myFirststaticMethod();
         mySecondStaticMethod();
    }


    public void dayOfTheWeek(){
        int dayOfTheWeek = 6;
        switch(dayOfTheWeek){
            case 1:
        System.out.println("Monday") ;
           break;
            case 2:
            System.out.println("Tuesday") ;
            break;
            case 3:
            System.out.println("Wednsday") ;
            break;
            default:
            System.out.println("All go chop breakfast") ;
        
            break;
        
        }
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
    static int mySecondStaticMethod(){

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
