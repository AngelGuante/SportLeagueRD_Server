package WebSocket;

public class Gson_Convert {

    private int Id;
    private String Nombre;
    private String Descripcion;

    public Gson_Convert(int Id, String Nombre, String Descripcion) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    //Id
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    //nombre
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Name) {
        this.Nombre = Name;
    }

    //GET Descripcion
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Id=" + Id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion;
    }

}
