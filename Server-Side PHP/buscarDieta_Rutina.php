<?php
	require_once 'conectarBD.php';

	if(isset($_POST)){
		$json = $_POST["json"];
		$jsonarray = json_decode($json,true);
		
		$tipo = $jsonarray[0]["tipo"];
		
		$consulta_sql = "SELECT tipo, description,image FROM publications WHERE tipo = " . $tipo . ";";
			
		$publicaciones = mysqli_query($mysqli,$consulta_sql);
			//var_dump($publicaciones);
		$contador = 0;
			// JSON de $fila
		$array_general = [];
		while ($fila = mysqli_fetch_row($publicaciones)) {
				$arr = [];
				array_push($arr, $fila[0], $fila[1], $fila[2]);
        		//echo $fila[0] . "|" . $fila[1] . "|". $fila[2] . PHP_EOF;
				array_push($array_general, $arr);
    	}
			//var_dump($array_general);
		echo json_encode($array_general);
		}else{
			echo "ZERO_RESULTS";
		}
		

?>