<?php
	$dir = "images/";
	$num = random_int(100000,999999);
	$path = $_FILES["imageUploaded"]['name'];
	$ext = pathinfo($path, PATHINFO_EXTENSION);
	$target_file = $dir . $num . "." . $ext;
	if (move_uploaded_file($_FILES['imageUploaded']['tmp_name'], $target_file)) {
		echo $target_file;
    } else {
    	echo "ERROR";
  	}
 ?>