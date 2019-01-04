#!/bin/php
<?php


$headers = array("File Name", "Size", "Type", "Modified", "iNode",  "Link") ;	
$width = array(20, 11, 10, 14, 12, 20) ;                 		

$info ;
$hardlink = "";
$UniQ = array();


print_header() ;
foreach(glob("*") as $filename) {
  file_info($filename) ;
  print_file_info();
  foreach( $UniQ as $entry){
    $curINode = lstat($filename)[1];
    $savedINode = lstat($entry)[1];
    if($savedINode == $curINode){
        $hardlink .=  "\n\t" . $entry . ", " . $filename;
    }
  }
  array_push( $UniQ, $filename);
}
echo "The following files are the same: " . $hardlink;
exit(0) ;


function file_info($name) {
  global $info ;                // this ensures we are referring to the $info declared on line 27
    $info[0] = $name ;          // the file name
    $info[1] = filesize($name);
    $info[2] = filetype($name);
    $info[3] = date('d/m/Y', filemtime($name));
    $info[4] = fileinode($name);
    if( is_link($name)){
        $info[5] = '--> ' . readlink($name);
    } else {
        $info[5] = " ";
    }
}


/* ------------------------------------------------
 *
 * There should be no need to modify this part of the script, provided
 * that the width and info arrays are updated correctly.
 *
 * Printing is controlled by
 *    1. the headers array, which has column headers (see print_header)
 *    2. the info array, which has fields for one file (see print_file_info) 
 *    3. the width array, which has column widths (see both)
 * All three arrays should have the same length.
 */

/*
 * Print the file information.
 * 
 * Print the info entries, using the corresponding width entries.
 */
function print_file_info() {
    global $width, $info ;
    $fldNum = 0 ;
    while ($fldNum < count($info)) {
        printf("%-{$width[$fldNum]}.{$width[$fldNum]}s", $info[$fldNum]) ;
        $fldNum++ ;
    }
    print "\n" ;
}

/*
 * Print a header.
 *
 * Print the header entries, using the corresponding width entries.
 */
function print_header() {
    global $width, $headers ;
    $fldNum = 0 ;
    while ($fldNum < count($headers)) {
        printf("%-{$width[$fldNum]}.{$width[$fldNum]}s", $headers[$fldNum] ) ;
        $fldNum++ ;
    }
    print "\n" ;
    // print a line
    $len = 0 ;
    foreach ($width as $w) { $len += $w ; }
    printf("%'-{$len}s\n", "") ;
}
?>