<?php
	require_once 'conectarBD.php';

	$consulta_sql = "SELECT tipo, description, image, id  FROM publications ORDER BY created_at DESC;";
			
	$publicaciones = mysqli_query($mysqli,$consulta_sql);
			//var_dump($publicaciones);
	$contador = 0;
			// JSON de $fila
	$array_general = [];
	while ($fila = mysqli_fetch_row($publicaciones)) {
				$arr = [];
				array_push($arr, $fila[0], $fila[1], $fila[2], $fila[3]);
        		//echo $fila[0] . "|" . $fila[1] . "|". $fila[2] . PHP_EOF;
				array_push($array_general, $arr);
    }
			//var_dump($array_general);
	echo json_encode($array_general);

?>