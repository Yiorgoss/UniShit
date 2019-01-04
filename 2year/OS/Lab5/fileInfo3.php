#!/bin/php
<?php


$headers = array("File Name", "Size", "Type", "Modified") ;	
$width = array(35, 11, 10, 30) ;

$info; 

printDir(0, ".");
exit(0) ;

function printDir($tabCounter, $filename) {
    
    print_header($tabCounter) ;

    foreach (glob("*") as $filename) {
      file_info($filename) ;
      print_file_info($tabCounter) ;
    }

    foreach (glob("*") as $filename) {
        $f_type = filetype($filename);

        if($f_type == 'dir') {
            chdir($filename);
            echo("\n");
            tabz($tabCounter);
            echo("Directory : ".basename(getcwd())."\n");
            print_header($tabCounter) ; 
            printDir($tabCounter+1, $filename);
            chdir('..');
        }
    }
}

function file_info($name) {
  global $info;
  $info[0] = $name ;
  $info[1] = filesize($name);
  $info[2] = filetype($name);
  $info[3] = date('d/m/Y', filemtime($name));
}
function print_file_info($tabCounter) {
    global $width, $info;
    $fldNum = 0 ;
    tabz($tabCounter);
    while ($fldNum < count($info)) {
        printf("%-{$width[$fldNum]}.{$width[$fldNum]}s", $info[$fldNum]) ;
        $fldNum++ ;
    }
    print "\n" ;
}
function print_header($tabCounter) {
    global $width, $headers;
    $fldNum = 0 ;
    tabz($tabCounter);
    while ($fldNum < count($headers)) {
        printf("%-{$width[$fldNum]}.{$width[$fldNum]}s", $headers[$fldNum] ) ;
        $fldNum++ ;
    }
    print "\n" ;
    $len = 0 ;
    tabz($tabCounter);
    foreach ($width as $w) { $len += $w ; }
    printf("%'-{$len}s\n", "") ;
}
function tabz($tabCounter) {
    $i=0;
    while($i<=$tabCounter) {
        echo("    ");
        $i++;
    }
}
?>