public class Users {
    private String name;
    private String edad;

    private boolean compro;

    public Users(String name,String edad,boolean compro){
        this.name=name;
        this.edad= edad;
        this.compro=compro;
    }

    public String getName() {
        return name;
    }

    public String getEdad() {
        return edad;
    }
}
