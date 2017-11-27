<?php
define('DB_HOST', 'dbprojects.eecs.qmul.ac.uk');
define('DB_NAM', 'yjm30');
define('DB_USER', 'yjm30');
define('DB_PASSWORD', 'frNieW5yvBeUr');

$con=mysql_connect(DB_HOST, DB_USER, DB_PASSWORD) or die( "Failed to connect " . mysql_error());
$db=mysql_select_db(DB_NAME, $con) or die( "FAILED" . mysql_error());

/*
$ID = $_POST['Username'];
$Password = $_POST['Password'];
*/

function SignIn()
{
session_start();
if(!empty($_POST['Username']))
{
    $query = mysql_query("SELECT* FROM user where Username = '$_POST[Username]' AND Password = '$_POST[Password]'") or die(mysql_error());
    $row = mysql_fetch_array($query) or die(mysql_error());
    if(!empty($row['Username']) AND !empty($row['Password']))
    {   
        $_SESSION['Username'] = $row['Password'];
        echo "SUCCESS";
    }
    else
    {
        echo "something went wrong";
    }
}
}
if(isset($_POST['submit']))
{
    SignIn();
}

?>
