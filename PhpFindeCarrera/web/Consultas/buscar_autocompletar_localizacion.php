<?php
include('../configuracionBD.php');
$connection = get_db_conn();


if($_SERVER['REQUEST_METHOD']=='GET')
{
    if(isset($_GET['q']))
    {
        $busqueda = $_GET['q'];
    }
    else return;
}




$consulta = "SELECT distinct b.`Modelo` as Modelo  FROM `POSICIONVIVA` a INNER JOIN `AUTOBUS` b WHERE b.`Modelo` LIKE '%$busqueda%'";
$listado = mysql_query($consulta, $connection);


if(mysql_num_rows($listado) > 0)
{
    

    while($fila = mysql_fetch_assoc($listado))
    {
         
         $var = $fila['Modelo'];
         $str = "$var\n";  
         
         echo iconv('ISO-8859-1', 'UTF-8', $str);
   


    }
}





?>


