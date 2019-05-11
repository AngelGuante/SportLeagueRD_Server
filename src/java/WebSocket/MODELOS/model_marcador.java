package WebSocket.MODELOS;

public class model_marcador {

    //      **VARIABLES**
    //INDICARA EL ESTADO FINAL DEL PARTIDO SEGUN EL VALOR DE ESTA PROPIEDAD SE PODRA DETERMINAR LO SIGUIENTE:
    //  1 - SUSPENDIDO
    //  4 - EQUIPO A GANADOR
    //  5 - EQUIPO B GANADOR
    //  6 - EMPATE
    //  7 - PENDIENTE
    public String _estado;

    //EQUIPO A
    public String _idA;
    public String _sourceA;
    public String _nomnbreEquipoA;
    public String _siglasA;
    public String _puntuacionEquipoA;
    public String _votosA;

    //EQUIPO B
    public String _idB;
    public String _sourceB;
    public String _nomnbreEquipoB;
    public String _siglasB;
    public String _puntuacionEquipoB;
    public String _votosB;

    //DATOS GENERALES
    public String _id;
    public String _fecha;
    public String _hora;
    public String _localidad;
    public String _usuarioVotado;

    //      **CONSTRUCTOR**
    public model_marcador(String _id) {
        this._id = _id;
    }

    public model_marcador(String _estado, String _idA, String _sourceA,
            String _nomnbreEquipoA, String _siglasA, String _puntuacionEquipoA,
            String _votosA, String _idB, String _sourceB, String _nomnbreEquipoB,
            String _siglasB, String _puntuacionEquipoB, String _votosB, String _id,
            String _fecha, String _hora, String _localidad, String _usuarioVotado) {
        this._estado = _estado;
        this._idA = _idA;
        this._sourceA = _sourceA;
        this._nomnbreEquipoA = _nomnbreEquipoA;
        this._siglasA = _siglasA;
        this._puntuacionEquipoA = _puntuacionEquipoA;
        this._votosA = _votosA;
        this._idB = _idB;
        this._sourceB = _sourceB;
        this._nomnbreEquipoB = _nomnbreEquipoB;
        this._siglasB = _siglasB;
        this._puntuacionEquipoB = _puntuacionEquipoB;
        this._votosB = _votosB;
        this._id = _id;
        this._fecha = _fecha;
        this._hora = _hora;
        this._localidad = _localidad;
        this._usuarioVotado = _usuarioVotado;
    }

    //      **GETTER AND SETTER
    public String getUsuarioVotado() {
        return _usuarioVotado;
    }

    public void setUsuarioVotado(String _usuarioVotado) {
        this._usuarioVotado = _usuarioVotado;
    }

    public String getVotosA() {
        return _votosA;
    }

    public void setVotosA(String _votosA) {
        this._votosA = _votosA;
    }

    public String getVotosB() {
        return _votosB;
    }

    public void setVotosB(String _votosB) {
        this._votosB = _votosB;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }

    public String getIdA() {
        return _idA;
    }

    public void setIdA(String _idA) {
        this._idA = _idA;
    }

    public String getSourceA() {
        return _sourceA;
    }

    public void setSourceA(String _sourceA) {
        this._sourceA = _sourceA;
    }

    public String getNomnbreEquipoA() {
        return _nomnbreEquipoA;
    }

    public void setNomnbreEquipoA(String _nomnbreEquipoA) {
        this._nomnbreEquipoA = _nomnbreEquipoA;
    }

    public String getSiglasA() {
        return _siglasA;
    }

    public void setSiglasA(String _siglasA) {
        this._siglasA = _siglasA;
    }

    public String getPuntuacionEquipoA() {
        return _puntuacionEquipoA;
    }

    public void setPuntuacionEquipoA(String _puntuacionEquipoA) {
        this._puntuacionEquipoA = _puntuacionEquipoA;
    }

    public String getIdB() {
        return _idB;
    }

    public void setIdB(String _idB) {
        this._idB = _idB;
    }

    public String getSourceB() {
        return _sourceB;
    }

    public void setSourceB(String _sourceB) {
        this._sourceB = _sourceB;
    }

    public String getNomnbreEquipoB() {
        return _nomnbreEquipoB;
    }

    public void setNomnbreEquipoB(String _nomnbreEquipoB) {
        this._nomnbreEquipoB = _nomnbreEquipoB;
    }

    public String getSiglasB() {
        return _siglasB;
    }

    public void setSiglasB(String _siglasB) {
        this._siglasB = _siglasB;
    }

    public String getPuntuacionEquipoB() {
        return _puntuacionEquipoB;
    }

    public void setPuntuacionEquipoB(String _puntuacionEquipoB) {
        this._puntuacionEquipoB = _puntuacionEquipoB;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
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

    public String getLocalidad() {
        return _localidad;
    }

    public void setLocalidad(String _localidad) {
        this._localidad = _localidad;
    }

}
