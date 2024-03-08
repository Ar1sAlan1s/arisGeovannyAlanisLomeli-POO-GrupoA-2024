import java.util.ArrayList;
import java.util.Random;
public class Bank {
    int k=0;
    public ArrayList<Employee> getClientes() {
        return Clientes;
    }

    public ArrayList<Employee>Clientes=new ArrayList<>();

    public void clientes(Employee cliente){
        Clientes.add(cliente);
    }


    public void imprimirClientes(){
        for (int i=0;i<Clientes.size();i++) {
            System.out.printf("%s %s No %d Type:%c Balance:%f\n" ,Clientes.get(i).getName(),Clientes.get(i).getLastName(),Clientes.get(i).getAccount().getAccountNumber(),Clientes.get(i).getAccount().getType(),Clientes.get(i).getAccount().getAmount());

        }
    }
    public void info(int espacio){
        espacio=k;
        if(espacio>=0){
            System.out.printf("%s %s No %d Type:%c Balance:%f\n" ,Clientes.get(k).getName(),Clientes.get(k).getLastName(),Clientes.get(k).getAccount().getAccountNumber(),Clientes.get(k).getAccount().getType(),Clientes.get(k).getAccount().getAmount());}


    }
    public void buscarUser(String nombre, String lastName){
        for (int i=0;i<Clientes.size();i++) {
            if (Clientes.get(i).getName().equals(nombre)){
                if (Clientes.get(i).getLastName().equals(lastName)){
                    System.out.printf("%s %s No %d Type:%c Balance:%f\n" ,Clientes.get(i).getName(),Clientes.get(i).getLastName(),Clientes.get(i).getAccount().getAccountNumber(),Clientes.get(i).getAccount().getType(),Clientes.get(i).getAccount().getAmount());


                }
            }
        }
    }
    public long validacionNum(long acc){
        for (int i=0;i<Clientes.size();i++) {
            if (Clientes.get(i).getAccount().getAccountNumber()==acc){
                Random num=new Random();
                acc=num.nextLong(10)+1;
                i=0;
            }
        }return  acc;


    }

    public Employee logIn(String name,String lastname,long acc){
        Employee personanew=null;
        String n=name,ln=lastname;long nc=acc;
        for (int k = 0; k <Clientes.size(); k++) {
            if (Clientes.get(k).getName().equals(n)) {
                if (Clientes.get(k).getLastName().equals(ln)) {
                    if(Clientes.get(k).getAccount().getAccountNumber()==nc) {
                        personanew=Clientes.get(k);
                        this.k=k;
                        info(this.k);
                        System.out.printf("%s %s No %d Type:%c Balance:%f\n" ,Clientes.get(k).getName(),Clientes.get(k).getLastName(),Clientes.get(k).getAccount().getAccountNumber(),Clientes.get(k).getAccount().getType(),Clientes.get(k).getAccount().getAmount());}
                }
            }
        }

        return personanew;
    }
}

