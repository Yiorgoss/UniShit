#!/usr/bin/php
<?php
declare(ticks = 1);
$pid = getmypid();
if ($argc < 3) {
	die("Two arguments expected: starting test value and last test value\n") ;
}
$testVal = $argv[1] ;
$lastVal = $argv[2] ;

pcntl_signal(SIGALRM, 'signal_handler');

while ($testVal <= $lastVal) {
	pcntl_alarm(3);
	list ($return, $testResult) = runOneTest($testVal) ;
	echo "testing : $testVal\n";
	$testVal++ ;
}
exit(0) ;
function runOneTest($testInput) {
	$cmd = "./testProgram" ;
	exec("$cmd $testInput", $output, $code) ;

    $result = $output[0] ; // default value
    $return = $code ; // default value

    return(array($return, $result)) ;
}

function signal_handler()
{
	$testVal++;
	$ch_pid = pcntl_fork();
	$path = rtrim('pwd');
	$args = array("$testVal") ;

	print "Test terminated for value : $testVal\n";
	pcntl_alarm(0);
	pcntl_exec("{$path}/testProgram", $args) ;
}
?>