public class TryConst {
     private String username ;
    int age ;

public TryConst(){}

public String getUsername(){
    return username;
}
    


public void setUsername(String username){
    if(!username.isEmpty()){
this.username = username;
    }
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

}


}
