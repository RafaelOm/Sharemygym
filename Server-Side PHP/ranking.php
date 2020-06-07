<?php
	require_once 'conectarBD.php';

		$consulta_sql = "SELECT username, points FROM users ORDER BY points DESC;";
			
		$publicaciones = mysqli_query($mysqli,$consulta_sql);
		
		$array_general = [];
		while ($fila = mysqli_fetch_row($publicaciones)) {
				$arr = [];
				array_push($arr, $fila[0], $fila[1]);
        		//echo $fila[0] . "|" . $fila[1] . "|". $fila[2] . PHP_EOF;
				array_push($array_general, $arr);
    	}
		echo json_encode($array_general);
	
		

?>