public class App {
    public static void main(String[] args){

Dog bruce = new Dog();
bruce.run();
Dog.bark();


Payment payment = new Payment("0206353460","VOD",10.5,"GHS");
String number = payment.getPhoneNumber();
System.out.println(number);


  }
}