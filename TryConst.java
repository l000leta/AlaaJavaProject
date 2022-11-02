public class TryConst {
     private String username ;
    int age ;
    private String password ;
    private double amountRaised;

public TryConst(){}


    public double getAmountRaised(){
        if(amountRaised > 100){}
        else{}
        return amountRaised;
    }



public void setpassword(String password){  
this.password = password;
    
}


public String getpassword(){
    return "*****";
}
    


public void setUsername(String username){
    if(username.trim().length()>5){
this.username = username;
    }
}

public String getUsername(){
    return username;
}
   
   public TryConst(String username){
    this.username = username;
   }
   public TryConst(String username,int age){
    this.username = username;
    this.age = age;
   }

public static void main(String[] args){
    TryConst tryConst = new TryConst();

    TryConst tryConst1 = new TryConst("Alaa");
    TryConst tryConst2 = new TryConst("loli",31);

    tryConst.setUsername("test");
    System.out.println(tryConst.getUsername());
}


}
