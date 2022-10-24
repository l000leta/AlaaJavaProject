public class TryingMethods {
    public static void main(String[] args){
        myFirststaticMethod();
         mySecondStaticMethod();

// One of the dynamic methods .


            int dayOfTheWeek = 6;
            switch(dayOfTheWeek){
                case 1:
            System.out.println("Monday") ;
               break;
                case 2:
                System.out.println("Tuesday") ;
                break;
                case 3:
                System.out.println("Wednesday") ;
                break;
                case 4:
                System.out.println("Thursday") ;
                break;
                case 5:
                System.out.println("Friday") ;
                break;
                default:
                System.out.println("It's Weekend") ;
            
                break;
            
            }

           
        

       
   
            
    }


  

    // The second dynamic method .

        public int secondDynamicMethod(int t){
            
        if(t == 5 ){
            Console.log("t == 5");
            return (t);
        }
        else if(t == 4 ){
            Console.log("t == 4");
            return (t);
        }else {
            Console.log("Bingo");
            return (t);
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

class Console{
    public static void log(Object obj) {
        System.out.println(obj);
    }
}
