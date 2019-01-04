#!/bin/php
<?php


$headers = array("File Name", "Size", "Type", "Modified") ;	// column headers
$width = array(20, 11, 10, 30) ;                 		// max width of data in each column

// The info array contains the information about the file
// This array is updated in the file_info function
$info ; // array of file information fields
$directories ; 
// The glob function returns an array of file names matching the pattern
// in the current directory. Here the pattern is to match everything.
print_header();

// foreach (glob("*") as $filename) {
//   file_info($filename) ;
//   print_file_info();
//   $f_type = filetype($filename);
//   if( $f_type == 'dir'){
//     print_directory($filename);
//   }
// }
print_directory(".");
exit(0) ;
function indenter($count){

}
function print_directory($directory){
    if ($handle = opendir($directory)) {
        while (false !== ($entry = readdir($handle))) {
            if ($entry != "." && $entry != "..") {
                $f_type = filetype($directory ."/" .  $entry);
                if($f_type == 'dir'){
                    print_directory( $directory . "/" .$entry);
                } else {
                    echo $directory ." \t". $entry . "\n"; 
                    //print_header();
                    //file_info( $directory . "/" . $entry);
                    //print_file_info();
                }
            }
        }
        closedir($handle);
    }
}
function file_info($name) {
  global $info ;
    $info[0] = $name ;          // the file name
    $info[1] = filesize($name);
    $info[2] = filetype($name);
    $info[3] = date('d/m/Y', filemtime($name));
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