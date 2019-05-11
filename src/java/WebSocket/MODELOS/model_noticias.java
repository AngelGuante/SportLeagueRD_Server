
package WebSocket.MODELOS;

public class model_noticias {

    //      **VARIABLES**
    //DATOS DE LA NOTICIA
    public String _id;
    public String _titulo;
    public String _texto;
    public String _fecha;
    public String _videoEnlace;
    public String _sourceNoticia;

    //EQUIPO
    public String _source;
    public String _nombreEquipo;

    //      **CONSTRUCTOR**
    public model_noticias(String _id) {
        this._id = _id;
    }

    public model_noticias(String _id, String _source, String _nombreEquipo,
            String _titulo, String _fecha, String _texto) {
        this._id = _id;
        this._source = _source;
        this._nombreEquipo = _nombreEquipo;
        this._titulo = _titulo;
        this._fecha = _fecha;
        this._texto = _texto;
    }

    public model_noticias(String _texto, String _videoEnlace, String _sourceNoticia) {
        this._texto = _texto;
        this._videoEnlace = _videoEnlace;
        this._sourceNoticia = _sourceNoticia;
    }

    //      **GETTER Y SETTER**
    public String getId() {
        return _id;
    }

    public String getSource() {
        return _source;
    }

    public void setSource(String _source) {
        this._source = _source;
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

    public String getTexto() {
        return _texto;
    }

    public void setTexto(String _texto) {
        this._texto = _texto;
    }

    public String getFecha() {
        return _fecha;
    }

    public void setFecha(String _fecha) {
        this._fecha = _fecha;
    }

    public String getVideoEnlace() {
        return _videoEnlace;
    }

    public String getSourceNoticia() {
        return _sourceNoticia;
    }

    public void setSourceNoticia(String _sourceNoticia) {
        this._sourceNoticia = _sourceNoticia;
    }

    public void setVideoEnlace(String _videoEnlace) {
        this._videoEnlace = _videoEnlace;
    }

    public String getNombreEquipo() {
        return _nombreEquipo;
    }

    public void setNombreEquipo(String _nombreEquipo) {
        this._nombreEquipo = _nombreEquipo;
    }
}
