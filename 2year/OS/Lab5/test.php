<?php
$dir = 'dir1';
if (is_dir($dir)){
  $dh=opendir($dir);
  while ($file = readdir($dir ,1)) {
    if ($file != "." && $file != "..") {
        echo "filename: $file : filetype: ". filetype($dir . $file)."</br>";
    }
  }
  closedir($dh);
}
?>