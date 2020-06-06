<?php
	$mysqli = new mysqli("PMYSQL125.dns-servicio.com:3306", "sharemygym_db", "f738Lpr@", "7385705_sharemygym");
	/* comprobar la conexión */
	if ($mysqli->connect_errno) {
		printf("Falló la conexión: %s\n", $mysqli->connect_error);
		exit();
	}
?>