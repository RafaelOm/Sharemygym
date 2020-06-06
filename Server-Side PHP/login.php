<?php
	require_once 'conectarBD.php';

	if(isset($_POST)){
		$usuario = $_POST["user"];
		$password = md5($_POST["password"]);
		$consulta_sql = "SELECT * FROM users WHERE username = '{$usuario}' AND password = '{$password}';";
		
		$login = mysqli_query($mysqli,$consulta_sql);
		
		if($login && mysqli_num_rows($login)==1){
			
			echo "OK";	
		}else{
			echo "ERROR";
		}
	}
?>