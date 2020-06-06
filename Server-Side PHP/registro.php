<?php
	require_once 'conectarBD.php';

	if(isset($_POST)){
		$json = $_POST["json"];
		$jsonarray = json_decode($json,true);
		$usuario = $jsonarray[0]["username"];
		$email = $jsonarray[0]["email"];
		$password = md5($jsonarray[0]["password"]);
		$consulta_sql = "SELECT email FROM users WHERE email = '".$email."';";
		
		$login = mysqli_query($mysqli,$consulta_sql);
		
		if($login && mysqli_num_rows($login)==1){
			echo "YA_EXISTE";	
		}else{
			$consulta_sql = "INSERT INTO users(username, email, password) VALUES ('". $usuario."', '".$email."', '".$password."')";
			$registro = mysqli_query($mysqli,$consulta_sql);
			echo 'OK';
		}
	}
?>