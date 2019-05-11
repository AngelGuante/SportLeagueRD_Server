package WebSocket.MODELOS;

public class model_jugadores {

    //      **VARIABLES**
    //DATOS DEL JUGADOR
    public String _idJugador;
    public String _source;
    public String _nombreJugador;
    public String _apellidoJugador;
    public String _votos;
    public String _fechaNacimientoEdad;
    //ESTADISTICAS DEL JUGADOR
    public String _MJ;
    public String _JJ;
    public String _RB;
    public String _A;
    public String _RO;
    public String _F;
    public String _BL;
    public String _BP;
    public String _T2H;
    public String _T2F;
    public String _T3H;
    public String _T3F;
    public String _TLH;
    public String _TLF;
    // **PROPIEDADES DE EL EQUIPO AL QUE PERTENECE**
    public String _idEquipo;
    public String _posicion;
    public String _sourceEquipo;
    public String _nombreEquipo;
    public String _siglasEquipo;
    public String _fechaIngreso;
    public String _numero;

    //      **CONSTRUCTOR**
    public model_jugadores(String _idJugador) {
        this._idJugador = _idJugador;
    }

    public model_jugadores(String _idJugador, String _source,
            String _nombreJugador, String _apellidoJugador, String _votos,
            String _fechaNacimientoEdad, String _MJ, String _JJ, String _RB,
            String _A, String _RO, String _F, String _BL, String _BP,
            String _T2H, String _T2F, String _T3H, String _T3F, String _TLH,
            String _TLF, String _idEquipo, String _posicion,
            String _sourceEquipo, String _nombreEquipo, String _siglasEquipo,
            String _fechaIngreso, String _numero) {
        this._idJugador = _idJugador;
        this._source = _source;
        this._nombreJugador = _nombreJugador;
        this._apellidoJugador = _apellidoJugador;
        this._votos = _votos;
        this._fechaNacimientoEdad = _fechaNacimientoEdad;
        this._MJ = _MJ;
        this._JJ = _JJ;
        this._RB = _RB;
        this._A = _A;
        this._RO = _RO;
        this._F = _F;
        this._BL = _BL;
        this._BP = _BP;
        this._T2H = _T2H;
        this._T2F = _T2F;
        this._T3H = _T3H;
        this._T3F = _T3F;
        this._TLH = _TLH;
        this._TLF = _TLF;
        this._idEquipo = _idEquipo;
        this._posicion = _posicion;
        this._sourceEquipo = _sourceEquipo;
        this._nombreEquipo = _nombreEquipo;
        this._siglasEquipo = _siglasEquipo;
        this._fechaIngreso = _fechaIngreso;
        this._numero = _numero;
    }

    //      **GETTER AND SETTER**
    public String getIdJugador() {
        return _idJugador;
    }

    public void setIdJugador(String _idJugador) {
        this._idJugador = _idJugador;
    }

    public String getSource() {
        return _source;
    }

    public void setSource(String _source) {
        this._source = _source;
    }

    public String getNombreJugador() {
        return _nombreJugador;
    }

    public void setNombreJugador(String _nombreJugador) {
        this._nombreJugador = _nombreJugador;
    }

    public String getApellidoJugador() {
        return _apellidoJugador;
    }

    public void setApellidoJugador(String _apellidoJugador) {
        this._apellidoJugador = _apellidoJugador;
    }

    public String getMJ() {
        return _MJ;
    }

    public void setMJ(String _MJ) {
        this._MJ = _MJ;
    }

    public String getJJ() {
        return _JJ;
    }

    public void setJJ(String _JJ) {
        this._JJ = _JJ;
    }

    public String getRB() {
        return _RB;
    }

    public String getFechaNacimientoEdad() {
        return _fechaNacimientoEdad;
    }

    public void setFechaNacimientoEdad(String _fechaNacimientoEdad) {
        this._fechaNacimientoEdad = _fechaNacimientoEdad;
    }

    public void setRB(String _RB) {
        this._RB = _RB;
    }

    public String getA() {
        return _A;
    }

    public void setA(String _A) {
        this._A = _A;
    }

    public String getRO() {
        return _RO;
    }

    public void setRO(String _RO) {
        this._RO = _RO;
    }

    public String getF() {
        return _F;
    }

    public void setF(String _F) {
        this._F = _F;
    }

    public String getBL() {
        return _BL;
    }

    public void setBL(String _BL) {
        this._BL = _BL;
    }

    public String getBP() {
        return _BP;
    }

    public void setBP(String _BP) {
        this._BP = _BP;
    }

    public String getT2H() {
        return _T2H;
    }

    public void setT2H(String _T2H) {
        this._T2H = _T2H;
    }

    public String getT2F() {
        return _T2F;
    }

    public void setT2F(String _T2F) {
        this._T2F = _T2F;
    }

    public String getT3H() {
        return _T3H;
    }

    public void setT3H(String _T3H) {
        this._T3H = _T3H;
    }

    public String getT3F() {
        return _T3F;
    }

    public void setT3F(String _T3F) {
        this._T3F = _T3F;
    }

    public String getTLH() {
        return _TLH;
    }

    public void setTLH(String _TLH) {
        this._TLH = _TLH;
    }

    public String getTLF() {
        return _TLF;
    }

    public void setTLF(String _TLF) {
        this._TLF = _TLF;
    }

    public String getVotos() {
        return _votos;
    }

    public void setVotos(String _votos) {
        this._votos = _votos;
    }

    public String getNumero() {
        return _numero;
    }

    public void setNumero(String _numero) {
        this._numero = _numero;
    }

    public String getIdEquipo() {
        return _idEquipo;
    }

    public void setIdEquipo(String _idEquipo) {
        this._idEquipo = _idEquipo;
    }

    public String getPosicion() {
        return _posicion;
    }

    public void setPosicion(String _posicion) {
        this._posicion = _posicion;
    }

    public String getSourceEquipo() {
        return _sourceEquipo;
    }

    public void setSourceEquipo(String _sourceEquipo) {
        this._sourceEquipo = _sourceEquipo;
    }

    public String getNombreEquipo() {
        return _nombreEquipo;
    }

    public void setNombreEquipo(String _nombreEquipo) {
        this._nombreEquipo = _nombreEquipo;
    }

    public String getSiglasEquipo() {
        return _siglasEquipo;
    }

    public void setSiglasEquipo(String _siglasEquipo) {
        this._siglasEquipo = _siglasEquipo;
    }

    public String getFechaIngreso() {
        return _fechaIngreso;
    }

    public void setFechaIngreso(String _fechaIngreso) {
        this._fechaIngreso = _fechaIngreso;
    }

}
