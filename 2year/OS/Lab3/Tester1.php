#!/usr/bin/php
<?php
/* 
 * ECS518U January 2018
 * Lab Exercise Week 3
 *
 * Tester 0 - template for tester
 */

if ($argc < 3) {
    die("Two arguments expected: starting test value and last test value\n") ;
}

$testVal = $argv[1] ;
$lastVal = $argv[2] ;

while ($testVal <= $lastVal) {
    list ($return, $testResult) = runOneTest($testVal) ;
    checkResult($return, $testVal, $testResult) ;
    $testVal++ ;
}
// finished
exit(0) ;

/*
 * Function to test one input and check result
 *   Return an array with two entries
 *     - the return value (aka exit code) of the program being tested
 *     - the output (or result) of the program being tested
 */
function runOneTest($testInput) {
    $cmd = "./testProgram" ;
    exec("$cmd $testInput", $output, $code) ;

    $result = $output[0] ;
    $return = $code ; 

    return(array($return, $result)) ;
}

/*
 * Function to check the results
 */
 function checkResult($retVal, $testInput, $testOutput) {
    if ($retVal == 0) {
        if ($testOutput == $testInput+1) {
            echo "Test passed for test value=$testInput", "\n" ;
        } else {
            echo "Test failed for test value=$testInput", "; result=$testOutput", "\n" ;
        }
    } else {
        echo "Test failed for test value=$testInput", "; return value=$retVal", "\n" ;
    }
 }

?>

