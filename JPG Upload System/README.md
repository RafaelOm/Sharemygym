# PHP Script
  - wsimages
    - images/
        - picturesave1.jpg
    - upload.php
```php
# upload.php
<?php
  $dir = "images/";
  $target_file = $dir.$_FILES["imageUploaded"]["name"];
  if (move_uploaded_file($_FILES['imageUploaded']['tmp_name'], $target_file)) {
    echo "The image was uploaded";
  } else {
    echo "The image was not uploaded";
  }
 ?>
```
