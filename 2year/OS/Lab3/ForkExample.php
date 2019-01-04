#!/usr/bin/php

<?php
/* 
 * ECS518U January 2018
 * Lab Exercise Week 3
 *
 * Example of the use of fork
 */


$pid = pcntl_fork();

// both processes continue to this point

if ($pid == -1) {
     die("could not fork\n");

} else if ($pid) {
     // we are the parent
     print("Parent: child process pid=: $pid \n") ;

     // wait for the child process to exit
     //  the 'status' variable is updated with the status
     pcntl_waitpid($pid, $status);

     // this function gets the exit code from the status
     $exitCode = pcntl_wexitstatus($status) ;
     print ("Child exit code is: $exitCode \n") ;
     exit (0) ;


} else {
     // we are the child
     print("Child: my pid=") ;
     
     // this function get the PID
     print posix_getpid() ;
     print "\n";
     exit (0) ;
}
?>
