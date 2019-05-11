package WebSocket.MODELOS;

public class model_lideres {
    public String _id;
    //EQUIPO A
    public String _idJugadorA;
    public String _sourceJugadorA;
    public String _nombreJugadorA;
    public String _apellidoJugadorA;
    public String _posicionJugadorA;
    //ALMACENARA LA CANTIDAD DEPENDIENDO DE LO QUE SE ESTE HABLANDO, SI ES LIDER EN PUNTOS, EN REBOTES, ETC..
    public String _totalJugadorA;
    //EQUIPO B
    public String _idJugadorB;
    public String _sourceJugadorB;
    public String _nombreJugadorB;
    public String _apellidoJugadorB;
    public String _posicionJugadorB;
    //ALMACENARA LA CANTIDAD DEPENDIENDO DE LO QUE SE ESTE HABLANDO, SI ES LIDER EN PUNTOS, EN REBOTES, ETC..
    public String _totalJugadorB;
    //VIDEOS QUE MUESTRAN LO MAS DESTACADO DE CADA EQUIPO
    public String _loMasDestacadoA;
    public String _loMasDestacadoB;

    public model_lideres(String _id) {
        this._id = _id;
    }

    public model_lideres(String _idJugadorA, String _sourceJugadorA,
            String _nombreJugadorA, String _apellidoJugadorA,
            String _posicionJugadorA, String _totalJugadorA, String _idJugadorB,
            String _sourceJugadorB, String _nombreJugadorB,
            String _apellidoJugadorB, String _posicionJugadorB,
            String _totalJugadorB, String _loMasDestacadoA,
            String _loMasDestacadoB) {
        this._idJugadorA = _idJugadorA;
        this._sourceJugadorA = _sourceJugadorA;
        this._nombreJugadorA = _nombreJugadorA;
        this._apellidoJugadorA = _apellidoJugadorA;
        this._posicionJugadorA = _posicionJugadorA;
        this._totalJugadorA = _totalJugadorA;
        this._idJugadorB = _idJugadorB;
        this._sourceJugadorB = _sourceJugadorB;
        this._nombreJugadorB = _nombreJugadorB;
        this._apellidoJugadorB = _apellidoJugadorB;
        this._posicionJugadorB = _posicionJugadorB;
        this._totalJugadorB = _totalJugadorB;
        this._loMasDestacadoA = _loMasDestacadoA;
        this._loMasDestacadoB = _loMasDestacadoB;
    }

    public String getIdJugadorA() {
        return _idJugadorA;
    }

    public void setIdJugadorA(String _idJugadorA) {
        this._idJugadorA = _idJugadorA;
    }

    public String getSourceJugadorA() {
        return _sourceJugadorA;
    }

    public void setSourceJugadorA(String _sourceJugadorA) {
        this._sourceJugadorA = _sourceJugadorA;
    }

    public String getNombreJugadorA() {
        return _nombreJugadorA;
    }

    public void setNombreJugadorA(String _nombreJugadorA) {
        this._nombreJugadorA = _nombreJugadorA;
    }

    public String getApellidoJugadorA() {
        return _apellidoJugadorA;
    }

    public void setApellidoJugadorA(String _apellidoJugadorA) {
        this._apellidoJugadorA = _apellidoJugadorA;
    }

    public String getPosicionJugadorA() {
        return _posicionJugadorA;
    }

    public void setPosicionJugadorA(String _posicionJugadorA) {
        this._posicionJugadorA = _posicionJugadorA;
    }

    public String getTotalJugadorA() {
        return _totalJugadorA;
    }

    public void setTotalJugadorA(String _totalJugadorA) {
        this._totalJugadorA = _totalJugadorA;
    }

    public String getIdJugadorB() {
        return _idJugadorB;
    }

    public void setIdJugadorB(String _idJugadorB) {
        this._idJugadorB = _idJugadorB;
    }

    public String getSourceJugadorB() {
        return _sourceJugadorB;
    }

    public void setSourceJugadorB(String _sourceJugadorB) {
        this._sourceJugadorB = _sourceJugadorB;
    }

    public String getNombreJugadorB() {
        return _nombreJugadorB;
    }

    public void setNombreJugadorB(String _nombreJugadorB) {
        this._nombreJugadorB = _nombreJugadorB;
    }

    public String getApellidoJugadorB() {
        return _apellidoJugadorB;
    }

    public void setApellidoJugadorB(String _apellidoJugadorB) {
        this._apellidoJugadorB = _apellidoJugadorB;
    }

    public String getPosicionJugadorB() {
        return _posicionJugadorB;
    }

    public void setPosicionJugadorB(String _posicionJugadorB) {
        this._posicionJugadorB = _posicionJugadorB;
    }

    public String getTotalJugadorB() {
        return _totalJugadorB;
    }

    public void setTotalJugadorB(String _totalJugadorB) {
        this._totalJugadorB = _totalJugadorB;
    }

    public String getLoMasDestacadoA() {
        return _loMasDestacadoA;
    }

    public void setLoMasDestacadoA(String _loMasDestacadoA) {
        this._loMasDestacadoA = _loMasDestacadoA;
    }

    public String getLoMasDestacadoB() {
        return _loMasDestacadoB;
    }

    public void setLoMasDestacadoB(String _loMasDestacadoB) {
        this._loMasDestacadoB = _loMasDestacadoB;
    }

}
