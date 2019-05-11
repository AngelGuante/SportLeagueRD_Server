package WebSocket.MODELOS;

public class model_puntos_bascketball {
    public String _id;
    public String _puntos_EquipoA;
    public String _puntos_EquipoB;

    public model_puntos_bascketball(String _id) {
        this._id = _id;
    }

    public model_puntos_bascketball(String _puntos_EquipoA, String _puntos_EquipoB) {
        this._puntos_EquipoA = _puntos_EquipoA;
        this._puntos_EquipoB = _puntos_EquipoB;
    }
}
