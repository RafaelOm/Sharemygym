<?php
	require_once 'conectarBD.php';
	if(isset($_POST)){
		$json = $_POST["json"];
		$jsonarray = json_decode($json,true);

		// ID USUARIO QUE SUBE
		//$id = $jsonarray[0]["id"];
		// URL donde está subida.
		$publicacion = $jsonarray[0]["publicacion"];
		// Login
		$email = $jsonarray[0]["username"];
		$password = md5($jsonarray[0]["password"]);
		// Comprobar login
		$consulta_sql = "SELECT id FROM users WHERE username = '". $email ."' AND password='" . $password . "';";
		
		$login = mysqli_query($mysqli,$consulta_sql);
		$id = mysqli_fetch_row($login);
		if($login && mysqli_num_rows($login)==1){
			$consulta_sql_receptor = "SELECT user_id FROM publications WHERE id = '".$publicacion."';";
			$resultado = mysqli_query($mysqli,$consulta_sql_receptor);
			$fila = mysqli_fetch_row($resultado);
			echo $id[0].$fila[0].$publicacion;
			//$consulta_sql_addlike = "INSERT INTO likes (user, receptor, publication) VALUES ('". $id[0]."', ". $fila[0].", '". $publicacion."');";
			//echo $consulta_sql_addlike . PHP_EOL;
			
			$like = mysqli_query($mysqli,"INSERT INTO likes (user, receptor, publication) VALUES ($id[0], $fila[0],$publicacion)");
			if($like){
				echo "LIKE_OK";
			}else{
				echo "ERROR";
			}
			$consulta2 = mysqli_query($mysqli,"SELECT * FROM users WHERE id = $fila[0]");
			$res2 = mysqli_fetch_array($consulta2);
			$n = $res2['points'];
			echo $n;
			mysqli_query($mysqli, "UPDATE users SET points = $n+1 WHERE id = $fila[0]");
		}else{
			echo 'ERROR, LOGIN INVALIDO';
		}
	}
?>