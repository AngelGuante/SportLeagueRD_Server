package WebSocket;

import WebSocket.MODELOS.Entity_usuario;
import WebSocket.MODELOS.model_comentarios;
import WebSocket.MODELOS.model_equipos;
import WebSocket.MODELOS.model_eventos;
import WebSocket.MODELOS.model_jugadores;
import WebSocket.MODELOS.model_lideres;
import WebSocket.MODELOS.model_marcador;
import WebSocket.MODELOS.model_noticias;
import WebSocket.MODELOS.model_puntos_bascketball;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import java.util.List;
import com.google.gson.Gson;
import java.util.ArrayList;

@ServerEndpoint("/websocketendpoint")
public class WsServer {

    //      **LISTAS**
    private final List<model_noticias> noticias = new ArrayList<>();
    private final List<model_eventos> eventos = new ArrayList<>();
    private final List<model_equipos> equipos = new ArrayList<>();
    private final List<model_jugadores> jugadores = new ArrayList<>();
    private final List<model_marcador> marcador = new ArrayList<>();
    private final List<model_lideres> lideres = new ArrayList<>();
    private final List<model_puntos_bascketball> puntosBasquesball = new ArrayList<>();
    private final List<model_comentarios> comentarios = new ArrayList<>();
    private final List<Entity_usuario> usuarios = new ArrayList<>();

    //      **METODOS**
    private String DatosAEviar(String mensage) {
        Object[] messageRecived = new Object[6];
        String message = mensage.replace("\"", "");

        int index = 0;
        for (Object tmp : message.split("-")) {
            messageRecived[index] = tmp;
            index++;
        }

        switch ((String) messageRecived[0]) {
            //      **NOMECLATURA EN LA QUE TRABAJARA EL SERVIDOR Y LA APLICACION**
            //  -NO..   -> NOTICIAS
            //  -EV..   -> EVENTOS
            //  -EQ..   -> EQUIPOS
            //  -JG..   -> JUGADORES
            //  -MC..   -> MARCADOR
            //  -CM..   -> COMENTARIOS
            //  -EJ..   -> JUGADORES BUSCADOS POR EQUIPO
            //  -EM..   -> MARCADOR BUSCADO POR EQUIPO
            //  -JE..   -> EQUIPO BUSCADO POR JUGADOR
            //  -PM..   -> PUNTOS POR SECCION DE UN PARTIDO
            //  -LM..   -> LIDERES EN MARCADOR
            //  -EB..   -> EQUIPOS BUSCADOS POR SU NOMBRE
            //  -JB..   -> JUGADORES BUSCADOS POR SU NOMBRE
            //  -VT..   -> VOTACIONES
            //  -US..   -> USUARIO
            case "NO01":
                noticias.clear();
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    noticias.add(new model_noticias(Integer.toString(i), "team8.png",
                            "Nombre Equipo Server", "TITULO NOTICIA " + Integer.toString(i),
                            "00/00/000", "TEXTO DE LA NOTICIA QUE VIENE DEL SERVIDOR"));
                }
                noticias.add(new model_noticias("NO01"));
                return new Gson().toJson(noticias);
            case "NO02":
                noticias.clear();
                noticias.add(new model_noticias("Lorem ipsum dolor sit amet,"
                        + "consectetur adipiscing elit. Donec fermentum nibh eu"
                        + "tincidunt consectetur. In id metus tempor, commodo"
                        + "mauris ut, hendrerit quam. Aenean hendrerit metus et"
                        + "sagittis lacinia. Proin sed maximus nulla, sed"
                        + "eleifend magna. Duis vehicula orci nibh, ac sagittis"
                        + "mauris pulvinar non. Etiam finibus ligula sit amet"
                        + "nibh mattis placerat. Nulla id varius velit. Morbi et"
                        + "justo nisi. Morbi quis dolor quam. Donec vitae nulla"
                        + "hendrerit, gravida lacus ac, tincidunt mauris. Sed"
                        + "scelerisque, arcu a maximus elementum, enim lectus"
                        + "posuere lorem, quis venenatis turpis tellus eget nisl."
                        + "Class aptent taciti sociosqu ad litora torquent per"
                        + "conubia nostra, per inceptos himenaeos. Sed efficitur"
                        + "velit non ante tincidunt, sed ultricies nunc"
                        + "pellentesque.\n"
                        + "\n"
                        + "Nullam venenatis arcu ac magna venenatis, quis tincidunt erat sollicitudin. Morbi non tellus non massa suscipit faucibus. Cras in massa id felis elementum viverra. Pellentesque accumsan, felis sed gravida tempor, diam erat sollicitudin nisl, tempus dignissim sem turpis eu ex. Fusce sed pretium diam. Nullam eu ipsum purus. Morbi vestibulum, mauris in semper tempor, magna mauris consectetur nunc, ac bibendum justo nibh sit amet lorem. Donec sit amet est nisi. Sed pharetra pretium mollis. Sed porta blandit justo sit amet pulvinar.",
                        "https://www.youtube.com/embed/MQIbmhVcmdI", "prb.jpg"));
                noticias.add(new model_noticias("NO02"));
                return new Gson().toJson(noticias);
//******************************************************************************

            case "EV01":
                eventos.clear();
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    eventos.add(new model_eventos(Integer.toString(i),
                            "TITULO EVENTO " + Integer.toString(i),
                            "TEXTO DE EL EVENTO QUE VIENE DEL SERVIDOR"));
                }
                eventos.add(new model_eventos("EV01"));
                return new Gson().toJson(eventos);
            case "EV02":
                eventos.clear();
                eventos.add(new model_eventos("LUGAR EVENTO SERVER", "03/01/2018 ",
                        "12:00 AM", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec fermentum nibh eu tincidunt consectetur. In id metus tempor, commodo mauris ut, hendrerit quam. Aenean hendrerit metus et sagittis lacinia. Proin sed maximus nulla, sed eleifend magna. Duis vehicula orci nibh, ac sagittis mauris pulvinar non. Etiam finibus ligula sit amet nibh mattis placerat. Nulla id varius velit. Morbi et justo nisi. Morbi quis dolor quam. Donec vitae nulla hendrerit, gravida lacus ac, tincidunt mauris. Sed scelerisque, arcu a maximus elementum, enim lectus posuere lorem, quis venenatis turpis tellus eget nisl. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed efficitur velit non ante tincidunt, sed ultricies nunc pellentesque.\n"
                        + "\n"
                        + "Nullam venenatis arcu ac magna venenatis, quis tincidunt erat sollicitudin. Morbi non tellus non massa suscipit faucibus. Cras in massa id felis elementum viverra. Pellentesque accumsan, felis sed gravida tempor, diam erat sollicitudin nisl, tempus dignissim sem turpis eu ex. Fusce sed pretium diam. Nullam eu ipsum purus. Morbi vestibulum, mauris in semper tempor, magna mauris consectetur nunc, ac bibendum justo nibh sit amet lorem. Donec sit amet est nisi. Sed pharetra pretium mollis. Sed porta blandit justo sit amet pulvinar.", "prb.jpg",
                        "https://www.youtube.com/embed/MQIbmhVcmdI"));
                eventos.add(new model_eventos("EV02"));
                return new Gson().toJson(eventos);
//******************************************************************************

            case "EQ01":
                equipos.clear();
                /*
                    _id
                    _source
                    _nombreEquipo
                    _siglas
                 */
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    equipos.add(new model_equipos(Integer.toString(i), "team8.png",
                            ("NOMBRE EQUIPO " + Integer.toString(i)),
                            "STSV", null, null, null, null, null));
                }
                equipos.add(new model_equipos("EQ01"));
                return new Gson().toJson(equipos);
            case "EQ02":
                equipos.clear();
                /*
                    _id
                    _source
                    _nombreEquipo
                    _siglas
                    _votos
                 */
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    equipos.add(new model_equipos(Integer.toString(i), "team8.png",
                            ("NOMBRE EQUIPO " + Integer.toString(i)),
                            "STSV", null, null, null, "00" + Integer.toString(i),
                            null));
                }
                equipos.add(new model_equipos("EQ02"));
                return new Gson().toJson(equipos);
            case "EQ03":
                equipos.clear();
                equipos.add(new model_equipos("Bob Myers", "Oracle Arena",
                        "7000 Coliseum Way/Oakland/California 94621/Estados Unidos",
                        "30", "0", "3"));
                equipos.add(new model_equipos("EQ03"));
                return new Gson().toJson(equipos);
            case "EQ04":
                equipos.clear();
                equipos.add(new model_equipos("Bob Myers", "Oracle Arena",
                        "7000 Coliseum Way/Oakland/California 94621/Estados Unidos",
                        "0", 0));
                equipos.add(new model_equipos("EQ03"));
                return new Gson().toJson(equipos);
            case "EQ05":
                equipos.clear();
                /*
                    _source
                    _siglas
                 */
                equipos.add(new model_equipos(null, "team8.png", null, "STSV", null,
                        null, null, null, null));
                equipos.add(new model_equipos("EQ05"));
                return new Gson().toJson(equipos);
//******************************************************************************

            case "JG01":
                jugadores.clear();
                /*
                    _idJugador
                    _source
                    _nombreJugador
                    _apellidoJugador
                    _idEquipo
                    _posicion
                    _sourceEquipo
                 */
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    jugadores.add(new model_jugadores(Integer.toString(i),
                            "team8.png", "NOMBRE JUGADOR " + Integer.toString(i),
                            "APELLIDO JUGADOR " + Integer.toString(i), null, null,
                            null, null, null, null, null, null, null, null, null,
                            null, null, null, null, null, Integer.toString(i),
                            "2", "team8.png", null, null, null, null));
                }
                jugadores.add(new model_jugadores("JG01"));
                return new Gson().toJson(jugadores);
            case "JG02":
                jugadores.clear();
                /*
                    _idJugador
                    _source
                    _nombreJugador
                    _apellidoJugador
                    _votos
                    _idEquipo
                    _posicion
                 */
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    jugadores.add(new model_jugadores(Integer.toString(i),
                            "team8.png", "NOMBRE JUGADOR " + Integer.toString(i),
                            "APELLIDO JUGADOR " + Integer.toString(i),
                            Integer.toString(i), null, null, null, null, null, null, null, null,
                            null, null, null, null, null, null, null,
                            Integer.toString(i), "3",
                            null, null, null, null, null));
                }
                jugadores.add(new model_jugadores("JG02"));
                return new Gson().toJson(jugadores);
            case "JG03":
                jugadores.clear();
                /*
                    _votos
                    _fechaNacimientoEdad
                    _nombreEquipo
                    _siglasEquipo
                    _fechaIngreso
                    _numero
                 */
                jugadores.add(new model_jugadores(null, null, null, null,
                        "300", "15/20/2015 (25", null, null, null, null, null, null, null,
                        null, null, null, null, null, null, null, null, null,
                        null, "Nombre Equipo S", "SSGL", "11/15/1025", "10"));
                jugadores.add(new model_jugadores("JG03"));
                return new Gson().toJson(jugadores);
            case "JG04":
                jugadores.clear();
                /*
                    _source
                    _votos
                    _fechaNacimientoEdad
                    _fechaIngreso
                 */
                jugadores.add(new model_jugadores(null, "team8.png", null, null,
                        "300", "15/20/2015 (25", null, null, null, null, null, null, null,
                        null, null, null, null, null, null, null, null, null,
                        null, null, null, "11/15/1025", null));
                jugadores.add(new model_jugadores("JG03"));
                return new Gson().toJson(jugadores);
            case "JG05":
                jugadores.clear();
                /*
                    _source
                    _fechaNacimientoEdad
                    _nombreEquipo
                    _siglasEquipo
                    _fechaIngreso
                    _numero
                 */
                jugadores.add(new model_jugadores(null, "team8.png", null, null,
                        null, "15/20/2015 (25", null, null, null, null, null, null, null,
                        null, null, null, null, null, null, null, null, null,
                        null, "Nombre Equipo S", "SSGL", "11/15/1025", "10"));
                jugadores.add(new model_jugadores("JG03"));
                return new Gson().toJson(jugadores);
            case "JG06":
                jugadores.clear();
                /*
                    _source
                    _votos
                    _fechaNacimientoEdad
                    _nombreEquipo
                    _siglasEquipo
                    _fechaIngreso
                    _numero
                 */
                jugadores.add(new model_jugadores(null, "team8.png", null, null,
                        "300", "15/20/2015 (25", null, null, null, null, null, null, null,
                        null, null, null, null, null, null, null, null, null,
                        null, "Nombre Equipo S", "SSGL", "11/15/1025", "10"));
                jugadores.add(new model_jugadores("JG03"));
                return new Gson().toJson(jugadores);
//******************************************************************************

            case "EJ01":
                jugadores.clear();
                for (int i = 0; i < 12; i++) {
                    /*
                        _idJugador
                        _nombreJugador
                        _apellidoJugador
                        _posicion
                        _numero
                     */
                    jugadores.add(new model_jugadores(Integer.toString(i), null,
                            "NOMBRE JUGADOR " + Integer.toString(i),
                            "APELLIDO JUGADOR " + Integer.toString(i), null, null,
                            null, null, null, null, null, null, null, null, null,
                            null, null, null, null, null, null,
                            "4", null, null, null,
                            null, Integer.toString(i)));
                }
                jugadores.add(new model_jugadores("EJ01"));
                return new Gson().toJson(jugadores);
            case "EJ02":
                jugadores.clear();
                for (int i = 0; i < 12; i++) {
                    /*
                        _MJ;
                        _JJ;
                        _RB;
                        _A;
                        _RO;
                        _F;
                        _BL;
                        _BP;
                     */
                    jugadores.add(new model_jugadores(null, null, null, null,
                            null, null, "01", "02", "03", "04", "05", "06", "07",
                            "08", null, null, null, null, null, null, null, null,
                            null, null, null, null, null));
                }
                jugadores.add(new model_jugadores("EJ02"));
                return new Gson().toJson(jugadores);
            case "EJ03":
                jugadores.clear();
                for (int i = 0; i < 12; i++) {
                    /*
                        _T2H;
                        _T2F;
                        _T3H;
                        _T3F;
                        _TLH;
                        _TLF;
                     */
                    jugadores.add(new model_jugadores(null, null, null, null,
                            null, null, null, null, null, null, null, null, null,
                            null, "09", "10", "11", "12", "13", "14", null, null,
                            null, null, null, null, null));
                }
                jugadores.add(new model_jugadores("EJ02"));
                return new Gson().toJson(jugadores);
            case "EJ04":
                jugadores.clear();
                for (int i = 0; i < 12; i++) {
                    /*
                        _idJugador
                        _nombreJugador
                        _apellidoJugador
                        _MJ;
                        _JJ;
                        _RB;
                        _A;
                        _RO;
                        _F;
                        _BL;
                        _BP;
                        _posicion
                        _numero
                     */
                    jugadores.add(new model_jugadores(Integer.toString(i), null,
                            "NOMBRE JUGADOR " + Integer.toString(i),
                            "APELLIDO JUGADOR " + Integer.toString(i), null, null,
                            "01", "02", "03", "04", "05", "06", "07", "08", null,
                            null, null, null, null, null, null,
                            "4", null, null, null,
                            null, Integer.toString(i)));
                }
                jugadores.add(new model_jugadores("EJ02"));
                return new Gson().toJson(jugadores);
            case "EJ05":
                jugadores.clear();
                for (int i = 0; i < 12; i++) {
                    /*
                        _idJugador
                        _nombreJugador
                        _apellidoJugador
                        _T2H;
                        _T2F;
                        _T3H;
                        _T3F;
                        _TLH;
                        _TLF;
                        _posicion
                        _numero
                     */
                    jugadores.add(new model_jugadores(Integer.toString(i), null,
                            "NOMBRE JUGADOR " + Integer.toString(i),
                            "APELLIDO JUGADOR " + Integer.toString(i),
                            null, null, null, null, null, null, null, null, null,
                            null, "09", "10", "11", "12", "13", "14", null,
                            "1", null, null, null,
                            null, Integer.toString(i)));
                }
                jugadores.add(new model_jugadores("EJ02"));
                return new Gson().toJson(jugadores);
//******************************************************************************                
            case "EM01":
                marcador.clear();
                for (int i = 0; i < 5; i++) {
                    /*
                        _estado
                        _idA
                        _puntuacionEquipoA
                        _idB
                        _nomnbreEquipoB
                        _puntuacionEquipoB
                        _id
                        _fecha
                     */
                    marcador.add(new model_marcador("1", "4", null, null, null,
                            "01", null, "5", null, "Nombre Equipo 2", null, "02",
                            null, Integer.toString(i), "02/02/1992", null, null,
                            null));
                }
                marcador.add(new model_marcador("EM01"));
                return new Gson().toJson(marcador);
//******************************************************************************
            case "JE01":
                equipos.clear();
                for (int i = 0; i < 5; i++) {
                    /*
                        _id
                        _source
                        _nombreEquipo
                        _siglas
                     */
                    equipos.add(new model_equipos(Integer.toString(i), "team8.png",
                            "Nombre Equipo " + Integer.toString(i),
                            "SGL" + Integer.toString(i), null, null, null, null,
                            null));
                }
                equipos.add(new model_equipos("JE01"));
                return new Gson().toJson(equipos);
//******************************************************************************
            case "LM01":
                lideres.clear();
                for (int i = 0; i < 2; i++) {
                    /*
                            _idJugadorA
                            _sourceJugadorA
                            _nombreJugadorA
                            _apellidoJugadorA
                            _posicionJugadorA
                            _totalJugadorA
                            _idJugadorB
                            _sourceJugadorB
                            _nombreJugadorB
                            _apellidoJugadorB
                            _posicionJugadorB
                            _totalJugadorB
                     */
                    lideres.add(new model_lideres("0", "team8.png",
                            "Nombre" + Integer.toString(i), "Apellido Jugador A" + Integer.toString(i),
                            "PosicionT A" + Integer.toString(i), "00", "1", "team8.png",
                            "Nombre" + Integer.toString(i), "Apellido Jugador B" + Integer.toString(i),
                            "PocisionT B" + Integer.toString(i), "00", null, null));
                }
                for (int i = 0; i < 2; i++) {
                    lideres.add(new model_lideres("0", "team8.png",
                            "Nombre" + Integer.toString(i), "Apellido Jugador A" + Integer.toString(i),
                            "PosicionR A" + Integer.toString(i), "00", "1", "team8.png",
                            "Nombre B" + Integer.toString(i), "Apellido B" + Integer.toString(i),
                            "PocisionT B" + Integer.toString(i), "00", null, null));
                }
                for (int i = 0; i < 2; i++) {
                    lideres.add(new model_lideres("0", "team8.png",
                            "Nombre" + Integer.toString(i), "Apellido Jugador A" + Integer.toString(i),
                            "PosicionA A" + Integer.toString(i), "00", "1", "team8.png",
                            "Nombre B" + Integer.toString(i), "Apellido B" + Integer.toString(i),
                            "PocisionT B" + Integer.toString(i), "00", null, null));
                }
                for (int i = 0; i < 2; i++) {
                    /*
                            _loMasDestacadoA
                            _loMasDestacadoB
                     */
                    lideres.add(new model_lideres(null, null, null, null, null,
                            null, null, null, null, null, null, null,
                            "https://www.youtube.com/embed/MQIbmhVcmdI",
                            "https://www.youtube.com/embed/MQIbmhVcmdI"));
                }
                lideres.add(new model_lideres("LM01"));
                return new Gson().toJson(lideres);
//******************************************************************************
            case "PM01":
                puntosBasquesball.clear();
                /*
                    _puntos_EquipoA
                    _puntos_EquipoB
                 */
                puntosBasquesball.add(new model_puntos_bascketball("20", "15"));
                puntosBasquesball.add(new model_puntos_bascketball("30", "51"));
                puntosBasquesball.add(new model_puntos_bascketball("82", "5"));
                puntosBasquesball.add(new model_puntos_bascketball("125", "15"));
                puntosBasquesball.add(new model_puntos_bascketball("250", "145"));
                puntosBasquesball.add(new model_puntos_bascketball("PM01"));
                return new Gson().toJson(puntosBasquesball);
//******************************************************************************

            case "MC01":
                marcador.clear();

                /*
                        _estado
                        _idA
                        _sourceA
                        _nomnbreEquipoA
                        _siglasA
                        _idB
                        _sourceB
                        _nomnbreEquipoB
                        _siglasB
                        _id
                 */
                marcador.add(new model_marcador("8", "01", "team8.png",
                        "NEQUIPOAA", "SGLAA", null, null, "02", "team8.png",
                        "NEQUIPOBB", "SGLBB", null, null, "03", null, null, null,
                        null));

                /*
                        _estado
                        _idA
                        _sourceA
                        _nomnbreEquipoA
                        _siglasA
                        _idB
                        _sourceB
                        _nomnbreEquipoB
                        _siglasB
                        _id
                        _fecha
                        _hora
                 */
                marcador.add(new model_marcador("7", "01", "team8.png",
                        "NEQUIPOA", "SGLA", null, null, "02", "team8.png",
                        "NEQUIPOB", "SGLB", null, null, "03", "28/12/2018",
                        "12:00 AM", null, null));
                /*
                        _estado
                        _idA
                        _sourceA
                        _nomnbreEquipoA
                        _siglasA
                        _puntuacionEquipoA
                        _idB
                        _sourceB
                        _nomnbreEquipoB
                        _siglasB
                        _puntuacionEquipoB
                        _id
                        _fecha
                 */
                marcador.add(new model_marcador("4", "1", "team8.png", "Nombre Equipo A",
                        "SGS1", "999", null, "2", "team8.png", "Nombre Equipo B", "SGS2",
                        "999", null, "0", "28/12/2018", null, null, null));
                marcador.add(new model_marcador("5", "1", "team8.png", "Nombre Equipo A",
                        "SGS1", "23", null, "2", "team8.png", "Nombre Equipo B", "SGS2",
                        "56", null, "0", "28/12/2018", null, null, null));
                marcador.add(new model_marcador("6", "1", "team8.png", "Nombre Equipo A",
                        "SGS1", "23", null, "2", "team8.png", "Nombre Equipo B", "SGS2",
                        "23", null, "0", "28/12/2018", null, null, null));
                marcador.add(new model_marcador("1", "1", "team8.png", "Nombre Equipo A",
                        "SGS1", "56", null, "2", "team8.png", "Nombre Equipo B", "SGS2",
                        "23", null, "0", "28/12/2018", null, null, null));
                marcador.add(new model_marcador("MC01"));
                return new Gson().toJson(marcador);
            case "MC02":
                marcador.clear();
                /*
                    _votosA
                    _votosB
                    _localidad
                    _usuarioVotado
                 */
                marcador.add(new model_marcador(null, null, null, null, null, null,
                        "58", null, null, null, null, null, "30", null, null,
                        null, "localidad_server", "false"));
                marcador.add(new model_marcador("MC02"));
                return new Gson().toJson(marcador);
            //******************************************************************************

            case "EB01":
                equipos.clear();
                /*
                    _id
                    _source
                    _nombreEquipo
                    _siglas
                 */
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    equipos.add(new model_equipos(Integer.toString(i), "team8.png",
                            "Equipo Por Busqueda", "STSV", null, null, null, null, null));
                }
                equipos.add(new model_equipos("EQ01"));
                return new Gson().toJson(equipos);
            case "EB02":
                equipos.clear();
                /*
                    _id
                    _source
                    _nombreEquipo
                    _siglas
                    _votos
                 */
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    equipos.add(new model_equipos(Integer.toString(i), "team8.png",
                            "Equipo Por Busqueda", "STSV", null, null, null,
                            "00" + Integer.toString(i), null));
                }
                equipos.add(new model_equipos("EQ02"));
                return new Gson().toJson(equipos);
            //******************************************************************************

            case "JB01":
                jugadores.clear();
                /*
                    _idJugador
                    _source
                    _nombreJugador
                    _apellidoJugador
                    _idEquipo
                    _posicion
                    _sourceEquipo
                 */
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    jugadores.add(new model_jugadores(Integer.toString(i),
                            "team8.png", "Jugador por",
                            "Busqueda", null, null,
                            null, null, null, null, null, null, null, null, null,
                            null, null, null, null, null, Integer.toString(i),
                            "2", "team8.png", null, null, null, null));
                }
                jugadores.add(new model_jugadores("JG01"));
                return new Gson().toJson(jugadores);
            case "JB02":
                jugadores.clear();
                /*
                    _idJugador
                    _source
                    _nombreJugador
                    _apellidoJugador
                    _votos
                    _idEquipo
                    _posicion
                 */
                for (int i = Integer.parseInt((String) messageRecived[2]);
                        i < (Integer.parseInt((String) messageRecived[2])
                        + Integer.parseInt((String) messageRecived[1])); i++) {
                    jugadores.add(new model_jugadores(Integer.toString(i),
                            "team8.png", "NOMBRE JUGADOR " + Integer.toString(i),
                            "APELLIDO JUGADOR " + Integer.toString(i),
                            Integer.toString(i), null, null, null, null, null, null, null, null,
                            null, null, null, null, null, null, null,
                            Integer.toString(i), "3",
                            null, null, null, null, null));
                }
                jugadores.add(new model_jugadores("JG02"));
                return new Gson().toJson(jugadores);
//******************************************************************************
            case "CM01":
                comentarios.clear();
                /*
                    _usuario
                    _comentario
                 */
                comentarios.add(new model_comentarios("SERVER ",
                        "Respuesta Del Server.."));
                comentarios.add(new model_comentarios("CM02"));
                return new Gson().toJson(comentarios);
            case "CM02":
                comentarios.clear();
                /*
                    _usuario
                    _comentario
                 */
                for (int i = 0; i < 6; i++) {
                    comentarios.add(new model_comentarios("Usuario " + i,
                            "SLKADJALKAKLNDLKANKASNDKLASNDLASNDLSANLDNADNADLNDLSANDALD"
                            + "FSGFDGFDGFDGDFSGFDSGFDSGFDGDFSGSDGGDGFDSGDSGDFSG"
                            + "SDFGDGFDGFDGDFGDSGFDSGDSFGDSFGFDSGSDGSDFGDSFG"));
                }
                comentarios.add(new model_comentarios("CM02"));
                return new Gson().toJson(comentarios);

            //******************************************************************************
            case "US01":
                usuarios.clear();
                /*
                    _nombre
                    _correo
                 */
                usuarios.add(new Entity_usuario(null, ((String)messageRecived[2]),
                        ((String)messageRecived[1]), null, null, null, null,
                        null, null, null, null, null, null, null)
                );
                usuarios.add(new Entity_usuario("US01"));
                return new Gson().toJson(usuarios);

            //******************************************************************************
        }

        return null;
    }

    @OnOpen
    public void onOpen() {
        System.out.println("Abriendo Conexion ...");
    }

    @OnClose
    public void onClose() {
        System.out.println("Cerrando Conexion ...");
    }

    @OnMessage
    public String onMessage(String message) {
        System.out.println("Recibi: " + message);

        String echoMsg = DatosAEviar(message);
        System.err.println(echoMsg);
        return echoMsg;
    }

    @OnError
    public void onError(Throwable e) {
        e.printStackTrace();
    }
}
