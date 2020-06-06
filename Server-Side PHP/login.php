<?php
	require_once 'conectarBD.php';

	if(isset($_POST)){
		$json = $_POST["json"];
		$jsonarray = json_decode($json,true);
		
		$usuario = $jsonarray[0]["username"];
		$password = md5($jsonarray[0]["password"]);
		$consulta_sql = "SELECT * FROM users WHERE username = '" . $usuario . "' AND password = '" . $password . "';";
		$login = mysqli_query($mysqli,$consulta_sql);
		
		if($login && mysqli_num_rows($login)==1){
			echo "OK";	
		}else{
			echo "ERROR";
		}
	}
?>