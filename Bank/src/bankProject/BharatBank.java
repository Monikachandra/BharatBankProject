package bankProject;
public class BharatBank {
    protected String name;
   protected String accountType;
    protected int balanceAmount;
    BharatBank(String name,String accountType,int balanceAmount){
        this.name=name;
        this.accountType=accountType;
        this.balanceAmount=balanceAmount;
    }
    public void withdrawalAmount(int amount){
        balanceAmount-=amount;
       }
    public void depositAmount( int amount){
        balanceAmount+=amount;
       }
    public double interest(){
        if (accountType.toLowerCase()=="current"){
            return 0;
            //0 interest for current savings
        }
        else{
            return (0.3/4)*(balanceAmount);
            //0.3 is the interest rate and 4 is written because we are calculating for a quater
        }
    }

}
