<?php
	require_once 'conectarBD.php';
	if(isset($_POST)){
		$json = $_POST["json"];
		$jsonarray = json_decode($json,true);
		// ID USUARIO QUE SUBE
		//$id = $jsonarray[0]["id"];
		$tipoPublicacion = $jsonarray[0]["tipo"];
		$descripcion = $jsonarray[0]["desc"];
		// URL donde está subida.
		$imgurl = $jsonarray[0]["img"];
		
		// Login
		$email = $jsonarray[0]["email"];
		$password = md5($jsonarray[0]["password"]);
		
		// Comprobar login
		$consulta_sql = "SELECT id FROM users WHERE email = '".$email."' AND password='" . $password . "';";
		
		$login = mysqli_query($mysqli,$consulta_sql);
		
		if($login && mysqli_num_rows($login)==1){
			$row = mysqli_fetch_assoc($login);
			$id = $row["id"];
			echo "ID: --> " . $id . " <--- Login correcto, insertamos".PHP_EOL;
			$consulta_sql = "INSERT INTO publications(user_id, tipo, description, image) VALUES ('". $id."', ". $tipoPublicacion .", '". $descripcion."', '".$imgurl."')";
			echo $consulta_sql . PHP_EOL;
			$subida = mysqli_query($mysqli,$consulta_sql);
			if($subida){
				echo "UPLOAD_OK";
			}else{
				echo "ERROR";
			}
		}else{
			echo 'ERROR, LOGIN INVALIDO';
		}
	}
?>