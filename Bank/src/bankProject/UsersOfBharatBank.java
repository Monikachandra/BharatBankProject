package bankProject;
public abstract class UsersOfBharatBank {
    public static void main(String[] args) {
        int personNo;
        BharatBank[] bharatBank = new BharatBank[2];

        bharatBank[0] = new BharatBank("Gopal", "current", 50000);
        bharatBank[1] = new BharatBank("Amritha", "savings", 100000);

        bharatBank[0].depositAmount(10000);
        bharatBank[1].withdrawalAmount(45000);

        bharatBank[0].depositAmount(70000);
    for(personNo=0;personNo<bharatBank.length;personNo++){
        System.out.print("The interest for the period of January 2021 - March 2021 Quarter of "+bharatBank[personNo].name+ " is ");
        System.out.println(bharatBank[personNo].interest());
    }
    }
}
