<?php
	require_once 'conectarBD.php';
	if(isset($_POST)){
		$json = $_POST["json"];
		$jsonarray = json_decode($json,true);
		$isUpdate = $jsonarray[0]["update"];
		$id = $jsonarray[0]["username"];
		if($isUpdate=="1"){
			$nombre = $jsonarray[0]["name"];
			$apellidos = $jsonarray[0]["surnames"];
			$biography = $jsonarray[0]["bio"];
			$sql = "UPDATE users SET name='" . $nombre . "', surname='" .$apellidos . "', bio='" . $biography. "' WHERE username='" . $id . "'";
			$res = mysqli_query($mysqli,$sql);
			if($res){
				echo 'OK';
			}else{
				echo 'ERROR';
			}
		}else{
			$sql = "SELECT name, surname, bio from users where username='" .$id."'";
			$res = mysqli_query($mysqli,$sql);
			$res2 = mysqli_fetch_row($res);
			$array_general = [$res2[0],$res2[1],$res2[2]];
		//	var_dump($array_general);
			echo json_encode($array_general);
		}

	}