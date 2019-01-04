#!/usr/bin/php
<?php
/*
 * Methods to invoke an executable
 *    1. exec         
 *    2. pcntl_exec
 *
 */

// the test value
if ($argc > 1) {
    $testVal = $argv[1] ;
} else {
    $testVal = 1 ;
}
$cmd = "./testProgram " ;

// ========================
//   METHOD 1 - exec
// ========================

// exec returns the result in the $ans array
// the return value is in variable $retr
exec("$cmd $testVal", $ans, $retr) ;
// print the answers
if ($retr != 0) echo "Failed with return=$retr" ;
foreach ($ans as $ansLine) {
    echo $ansLine, "AAA \n" ;
}


// ========================
//   METHOD 2 pcntl_exec
//     * no result
//     * no status
// ========================

// executable, with path but no \n
$path = rtrim(`pwd`) ;

//   create an array of arguments
$args = array("$testVal") ;
echo pcntl_exec("{$path}/testProgram", $args) ;

// no way to check the results here
// as pcntl_exec does not return
// result is printed to the standard output
echo("This is only printed if pcntl_exec fails") ;

?>
