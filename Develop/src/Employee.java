import java.util.Scanner;

public class Employee {

    private String name;
    private String lastName;
    private BankAccount account;
    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Employee(String name, String lastName, long accountNumber,char type) {
        if(type!='A'&&type!='B'&&type!='C'){
            System.out.println("Tipo de cuenta invalido");
            System.out.println("Recuerda que solo hay tipo 'A','B'y'C'");
            System.out.println("Ingrese de nuevo el tipo de cuenta:");
            Scanner leer=new Scanner(System.in);
            type=leer.nextLine().toUpperCase().charAt(0);
            this.name = name;
            this.lastName = lastName;
            this.account = new BankAccount(accountNumber,type);

        }else{
            this.name = name;
            this.lastName = lastName;
            this.account = new BankAccount(accountNumber,type);}


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void mostrarInfoAll(){

    }
}

