public class Operators {
    public static void main(String[] args){
        int ifStatmentBoss = 9;
        double valueA = 10;
        int valueB = 20;
        int examScore = 70;

        //Reassign values
        // valueB = 2;
        // valueB =+ 33; // valueB = valueB + 33 
        // valueB =- 33; // valueB = valueB - 33


         System.out.println("Result:"+ (valueA - valueB));
         System.out.println("Result:"+ (valueA + valueB));
         System.out.println("Result:"+ (valueA * valueB));
         System.out.println("Result:"+( valueA % valueB));



         System.out.println("Compare result:"+( valueA == valueB));
         System.out.println("Compare result:"+( valueA != valueB));
         System.out.println("Compare result:"+( valueA > valueB));
         System.out.println("Compare result:"+( valueA < valueB));
         System.out.println("Compare result:"+( valueA <= valueB));
         System.out.println("Compare result:"+( valueA >= valueB));

// condition (if)
if(ifStatmentBoss == 5 ){
    System.out.println("condition result:"+ (ifStatmentBoss));

}
else if(ifStatmentBoss == 4 ){
    System.out.println("condition result:"+ (ifStatmentBoss));
  
}else {
    System.out.println("Else result:"+ (ifStatmentBoss));

}

// condition (switch)

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
}
