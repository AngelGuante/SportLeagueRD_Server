package WebSocket.MODELOS;

public class Entity_usuario {
    public String ID;
    public String Nombre;
    public String Correo;
    public String EquiposSeguidosID;
    public String EquipoFavorito_id;
    public String JugadorFavorito_id;
    public String JugadorFavorito_EquipoId;
    public String BaseFavorito_id;
    public String BaseFavorito_EquipoId;
    public String AleroFavorito_id;
    public String AleroFavorito_EquipoId;
    public String PivotFavorito_id;
    public String PivotFavorito_EquipoId;
    public String AlaPivotFavorito_id;
    public String AlaPivotFavorito_EquipoId;

    public Entity_usuario(String ID) {
        this.ID = ID;
    }
    
    public Entity_usuario(String ID, String Nombre, String Correo,
            String EquipoFavorito_id, String EquiposSeguidosID, String JugadorFavorito_id,
            String JugadorFavorito_EquipoId, String BaseFavorito_id,
            String BaseFavorito_EquipoId, String AleroFavorito_id,
            String AleroFavorito_EquipoId, String PivotFavorito_id,
            String PivotFavorito_EquipoId, String AlaPivotFavorito_id,
            String AlaPivotFavorito_EquipoId) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.EquiposSeguidosID = EquiposSeguidosID;
        this.EquipoFavorito_id = EquipoFavorito_id;
        this.JugadorFavorito_id = JugadorFavorito_id;
        this.JugadorFavorito_EquipoId = JugadorFavorito_EquipoId;
        this.BaseFavorito_id = BaseFavorito_id;
        this.BaseFavorito_EquipoId = BaseFavorito_EquipoId;
        this.AleroFavorito_id = AleroFavorito_id;
        this.AleroFavorito_EquipoId = AleroFavorito_EquipoId;
        this.PivotFavorito_id = PivotFavorito_id;
        this.PivotFavorito_EquipoId = PivotFavorito_EquipoId;
        this.AlaPivotFavorito_id = AlaPivotFavorito_id;
        this.AlaPivotFavorito_EquipoId = AlaPivotFavorito_EquipoId;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEquipoFavorito_id() {
        return EquipoFavorito_id;
    }

    public void setEquipoFavorito_id(String EquipoFavorito_id) {
        this.EquipoFavorito_id = EquipoFavorito_id;
    }

    public String getJugadorFavorito_id() {
        return JugadorFavorito_id;
    }

    public void setJugadorFavorito_id(String JugadorFavorito_id) {
        this.JugadorFavorito_id = JugadorFavorito_id;
    }

    public String getJugadorFavorito_EquipoId() {
        return JugadorFavorito_EquipoId;
    }

    public void setJugadorFavorito_EquipoId(String JugadorFavorito_EquipoId) {
        this.JugadorFavorito_EquipoId = JugadorFavorito_EquipoId;
    }

    public String getBaseFavorito_id() {
        return BaseFavorito_id;
    }

    public void setBaseFavorito_id(String BaseFavorito_id) {
        this.BaseFavorito_id = BaseFavorito_id;
    }

    public String getBaseFavorito_EquipoId() {
        return BaseFavorito_EquipoId;
    }

    public void setBaseFavorito_EquipoId(String BaseFavorito_EquipoId) {
        this.BaseFavorito_EquipoId = BaseFavorito_EquipoId;
    }

    public String getAleroFavorito_id() {
        return AleroFavorito_id;
    }

    public void setAleroFavorito_id(String AleroFavorito_id) {
        this.AleroFavorito_id = AleroFavorito_id;
    }

    public String getAleroFavorito_EquipoId() {
        return AleroFavorito_EquipoId;
    }

    public void setAleroFavorito_EquipoId(String AleroFavorito_EquipoId) {
        this.AleroFavorito_EquipoId = AleroFavorito_EquipoId;
    }

    public String getPivotFavorito_id() {
        return PivotFavorito_id;
    }

    public void setPivotFavorito_id(String PivotFavorito_id) {
        this.PivotFavorito_id = PivotFavorito_id;
    }

    public String getPivotFavorito_EquipoId() {
        return PivotFavorito_EquipoId;
    }

    public void setPivotFavorito_EquipoId(String PivotFavorito_EquipoId) {
        this.PivotFavorito_EquipoId = PivotFavorito_EquipoId;
    }

    public String getAlaPivotFavorito_id() {
        return AlaPivotFavorito_id;
    }

    public void setAlaPivotFavorito_id(String AlaPivotFavorito_id) {
        this.AlaPivotFavorito_id = AlaPivotFavorito_id;
    }

    public String getAlaPivotFavorito_EquipoId() {
        return AlaPivotFavorito_EquipoId;
    }

    public void setAlaPivotFavorito_EquipoId(String AlaPivotFavorito_EquipoId) {
        this.AlaPivotFavorito_EquipoId = AlaPivotFavorito_EquipoId;
    }
    
    
}
