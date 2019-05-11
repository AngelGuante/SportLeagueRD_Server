package WebSocket.MODELOS;

public class model_equipos {

    //      **VARIABLES**
    //DATOS DE EL EQUIPO
    public String _id;
    public String _source;
    public String _nombreEquipo;
    public String _siglas;
    public String _representante;
    public String _localidad;
    public String _ubicacionLocalidad;
    public String _votos;
    //  0 - ACTIVO
    //  1 - SUSPENDIDO
    //  2 - RETIRADO
    public String _estado;

    //      **CONSTRUCTOR**
    public model_equipos(String _id) {
        this._id = _id;
    }

    public model_equipos(String _representante, String _localidad,
            String _ubicacionLocalidad, String _votos, String _estado, String dif) {
        this._representante = _representante;
        this._localidad = _localidad;
        this._ubicacionLocalidad = _ubicacionLocalidad;
        this._votos = _votos;
        this._estado = _estado;
    }
    
    public model_equipos(String _representante, String _localidad,
            String _ubicacionLocalidad, String _estado, int dif) {
        this._representante = _representante;
        this._localidad = _localidad;
        this._ubicacionLocalidad = _ubicacionLocalidad;
        this._estado = _estado;
    }

    public model_equipos(String _id, String _source, String _nombreEquipo,
            String _siglas, String _representante, String _localidad,
            String _ubicacionLocalidad, String _votos, String _estado) {
        this._id = _id;
        this._source = _source;
        this._nombreEquipo = _nombreEquipo;
        this._siglas = _siglas;
        this._representante = _representante;
        this._localidad = _localidad;
        this._ubicacionLocalidad = _ubicacionLocalidad;
        this._votos = _votos;
        this._estado = _estado;
    }
    
    //      **GETTER AND SETTER
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getSource() {
        return _source;
    }

    public void setSource(String _source) {
        this._source = _source;
    }

    public String getNombreEquipo() {
        return _nombreEquipo;
    }

    public void setNombreEquipo(String _nombreEquipo) {
        this._nombreEquipo = _nombreEquipo;
    }

    public String getSiglas() {
        return _siglas;
    }

    public void setSiglas(String _siglas) {
        this._siglas = _siglas;
    }

    public String getRepresentante() {
        return _representante;
    }

    public void setRepresentante(String _representante) {
        this._representante = _representante;
    }

    public String getLocalidad() {
        return _localidad;
    }

    public void setLocalidad(String _localidad) {
        this._localidad = _localidad;
    }

    public String getUbicacionLocalidad() {
        return _ubicacionLocalidad;
    }

    public void setUbicacionLocalidad(String _ubicacionLocalidad) {
        this._ubicacionLocalidad = _ubicacionLocalidad;
    }

    public String getVotos() {
        return _votos;
    }

    public void setVotos(String _votos) {
        this._votos = _votos;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }
}
