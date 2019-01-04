#!/usr/bin/php
<?php
$parent_pid="";$child_pid="";
$pid = pcntl_fork();
if ($pid == -1) die("could not fork");
if ($pid) {
 $parent_pid=posix_getpid();
 posix_kill($parent_pid, SIGTERM);
 echo "Parent PID = $parent_pid\n";
} else {
 $child_pid=posix_getpid();
 echo "Child PID = $child_pid\n";
}
 
pcntl_waitpid(posix_getpid(), $status);
echo pcntl_wifstopped($status);
echo posix_getpid()." is still running\n";
 
echo "Done running script\n";
?>