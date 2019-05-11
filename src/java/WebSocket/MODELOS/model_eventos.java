package WebSocket.MODELOS;

public class model_eventos {
    private String _id;
    private String _titulo;
    private String _lugar;
    private String _fecha;
    private String _hora;
    private String _texto;
    private String _sourceEvento;
    private String _video;
    
    //      **CONSTRUCTOR**
    public model_eventos(String _id) {
        this._id = _id;
    }
    
    public model_eventos(String _id, String _titulo, String _texto) {
        this._id = _id;
        this._titulo = _titulo;
        this._texto = _texto;
    }

    public model_eventos(String _lugar, String _fecha, String _hora, String _texto,
            String _sourceNoticia, String _video) {
        this._lugar = _lugar;
         this._hora = _hora;
         this._fecha = _fecha;
        this._hora = _hora;
        this._texto = _texto;
        this._sourceEvento = _sourceNoticia;
        this._video = _video;
    }
    
    //      **GETTER SETTER**
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String _titulo) {
        this._titulo = _titulo;
    }

    public String getLugar() {
        return _lugar;
    }

    public void setLugar(String _lugar) {
        this._lugar = _lugar;
    }

    public String getFecha() {
        return _fecha;
    }

    public void setFecha(String _fecha) {
        this._fecha = _fecha;
    }

    public String getHora() {
        return _hora;
    }

    public void setHora(String _hora) {
        this._hora = _hora;
    }

    public String getTexto() {
        return _texto;
    }

    public void setTexto(String _texto) {
        this._texto = _texto;
    }

    public String getSourceNoticia() {
        return _sourceEvento;
    }

    public void setSourceNoticia(String _sourceNoticia) {
        this._sourceEvento = _sourceNoticia;
    }

    public String getVideo() {
        return _video;
    }

    public void setVideo(String _video) {
        this._video = _video;
    }
    
    
}
