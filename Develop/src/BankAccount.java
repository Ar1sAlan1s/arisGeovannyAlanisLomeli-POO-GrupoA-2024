public class BankAccount {
    private long accountNumber;
    private double amount;

    public char getType() {
        return type;
    }

    private char type;

    public BankAccount(long accountNumber,char type) {
        this.type= type;
        this.accountNumber = accountNumber;


    }

    public long getAccountNumber() {
        return accountNumber;

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;

    }

    public void agregarDinero(double amount){
        if(type=='A'){agregarDineroA(amount);}
        if(type=='B'){agregarDineroB(amount);}
        if (type=='C'){this.amount=this.amount+amount;
            System.out.println("Su deposito fue EXITOSO");}
    }

    private  void agregarDineroA(double amount){
        if (this.amount+amount<=50000){
            this.amount+=amount;
            System.out.println("Su deposito fue EXITOSO");
        }else{
            System.out.println("Su amount excede la cantidad maxima");
            this.amount=this.amount;
        }
    }
    private  void agregarDineroB(double amount){
        if (this.amount+amount<=100000){
            this.amount+=amount;
            System.out.println("Su deposito fue EXITOSO");
        }else{
            System.out.println("Su amount excede la cantidad maxima");
            this.amount=this.amount;
        }

    }
    public void quitarDinero(double amount){
        if(type=='A'){sacarDineroA(amount);}
        if(type=='B'){sacarDineroB(amount);}
        if (type=='C'){ if (this.amount-amount>=0){
            this.amount-=amount;
            System.out.println("Su retiro fue EXITOSO");
        }else{
            System.out.println("No tiene suficiente dinero");

        }
        }
    }

    private void sacarDineroA(double amount){
        if (this.amount-amount>=0){
            this.amount-=amount;
            System.out.println("Su retiro fue EXITOSO");
        }else{
            System.out.println("No tiene suficiente dinero");

        }
    }
    private void sacarDineroB(double amount){
        if (this.amount-amount>=0){
            this.amount-=amount;
            System.out.println("Su retiro fue EXITOSO");
        }else{
            System.out.println("No tiene suficiente dinero");

        }
    }
}
