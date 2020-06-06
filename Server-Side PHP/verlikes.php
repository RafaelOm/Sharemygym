<?php
	require_once 'conectarBD.php';
	if(isset($_POST)){
		$json = $_POST["json"];
		$jsonarray = json_decode($json,true);
		$id = $jsonarray[0]['publicacion'];
		$consulta_num = mysqli_query($mysqli,"SELECT count(*) FROM likes WHERE publication = $id");
		
		$num = mysqli_fetch_array($consulta_num);
		echo $num[0];
	}
?>