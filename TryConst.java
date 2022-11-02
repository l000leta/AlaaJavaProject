public class TryConst {
    String username="" ;
    int age ;
    
public TryConst(){}
  
   
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
    TryConst tryConst2 = new TryConst("loli");

}

}