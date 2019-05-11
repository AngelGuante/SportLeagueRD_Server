package WebSocket.MODELOS;

public class model_comentarios {

    public String _id;
    public String _usuario;
    public String _comentario;

    public model_comentarios(String _id) {
        this._id = _id;
    }

    public model_comentarios(String _usuario, String _comentario) {
        this._usuario = _usuario;
        this._comentario = _comentario;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getUsuario() {
        return _usuario;
    }

    public void setUsuario(String _usuario) {
        this._usuario = _usuario;
    }

    public String getComentario() {
        return _comentario;
    }

    public void setComentario(String _comentario) {
        this._comentario = _comentario;
    }
    
    
}
