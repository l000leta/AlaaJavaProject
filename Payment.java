
//create to handle  all payments momo Payments

public class Payment {
    

private String phoneNumber;
private String network;
private double amount;
private String currency;



/**
 * @param phoneNumber phone number for payment
 * @param network payment network
 * @param amount the amount in double to pay for
 * @param currency the currency for payment 
 */
public Payment(String phoneNumber, String network, double amount, String currency){
   
    this.phoneNumber= formatPhoneNumber(phoneNumber);
    this.network = network;
    this.amount = amount;
    this.currency = currency;
}

private String formatPhoneNumber(String number){
    if(number.startsWith("0") && number.length()==10){
       return "+233" +number.substring(0,10);
       }
       return number;
       
}


/**
 * 
 * @return string of the paymen number with +233
 */

public String getPhoneNumber(){
    return phoneNumber;
}



}

