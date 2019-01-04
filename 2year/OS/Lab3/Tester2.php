#!/usr/bin/php
<?php
declare(ticks = 1);
if ($argc < 3) {
	die("Two arguments expected: starting test value and last test value\n") ;
}
$testVal = $argv[1] ;
$lastVal = $argv[2] ;

$pid;
$bool="successful";
pcntl_signal( SIGALRM, "signal_handler");

while ($testVal <= $lastVal) {
	$pid = pcntl_fork();
	if( $pid){
		pcntl_alarm(1);
		pcntl_waitpid($pid, $status);

		$exitCode = pcntl_wexitstatus($status);

		echo " termination $bool for $testVal\n";
		$bool = "successful";
		pcntl_alarm(0);
	} else {
		$path = rtrim(`pwd`) ;
		$args = array("$testVal") ;
		pcntl_exec("{$path}/testProgram", $args) ;
	}
	$testVal++ ;
}
exit(0) ;
function signal_handler(){
	global $pid;
	global $bool;
	$bool = "failed";
	posix_kill( $pid, SIGKILL);
}
?>