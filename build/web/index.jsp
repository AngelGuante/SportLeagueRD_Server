<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tomcat WebSocket</title>
</head>
<body>
	<form>
		<input id="message" type="text">
		<input onclick="wsSendMessage();" value="Echo" type="button">
		<input onclick="wsCloseConnection();" value="Disconnect" type="button">
	</form>
	<br>
	<textarea  id="echoText" rows="30" cols="50"></textarea>

	<br><input type="text" name="" id="nombre" placeholder="Nombre"><br>
	<br><input type="text" name="" id="direccion" placeholder="Direccion"><br>
	<br><input type="text" name="" id="celular" placeholder="Celular"><br>
	<br><input type="text" name="" id="telefono" placeholder="Telefono"><br>

	<script type="text/javascript">
		var webSocket = new WebSocket("ws://localhost:8080/WebSocket/websocketendpoint");
		
		var echoText = document.getElementById("echoText");
		var nombre = document.getElementById("nombre");
		var direccion = document.getElementById("direccion");
		var celular = document.getElementById("celular");
		var telefono = document.getElementById("telefono");
		
		echoText.value = "";
		nombre.value = "";
		direccion.value = "";
		celular.value = "";
		telefono.value = "";

		var message = document.getElementById("message");

		webSocket.onopen = function(message){ wsOpen(message);};
		webSocket.onmessage = function(message){ wsGetMessage(message);};
		webSocket.onclose = function(message){ wsClose(message);};
		webSocket.onerror = function(message){ wsError(message);};
		
		function wsOpen(message){
			echoText.value += "Conectado ... \n";
		}

		function wsSendMessage(){
			webSocket.send(message.value);
		  //echoText.value += "E : " + message.value + "\n";
			message.value = "";
		}

		function wsCloseConnection(){
			webSocket.close();
		}

		
		function wsGetMessage(message){
			echoText.value += "R : " + message.data+ "\n";

		 
			
			
		    var datos = JSON.parse(message.data);

			
			for(x=0; x < datos.length; x++)
			 {
                console.log(datos[x].Id);
                console.log(datos[x].Nombre);                
                console.log(datos[x].Descripcion);
             }		

		}

		function wsClose(message){
			echoText.value += "Desconectar ... \n";
		}

		function wserror(message){
			echoText.value += "Error ... \n";
		}
	</script>
</body>
</html>