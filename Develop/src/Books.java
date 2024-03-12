public class Books {

    private String name;
    private String autor;
    private boolean disponible;

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public Books(String name,String autor,boolean disponible){
        this.name=name;
        this.autor= autor;
        this.disponible=disponible;

    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }
}


