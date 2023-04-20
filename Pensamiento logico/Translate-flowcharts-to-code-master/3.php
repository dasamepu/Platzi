<?php
$closed_door = true;

if($closed_door == true){
  echo "Opening door...";
  $closed_door = false;
}

if($closed_door == false){
  echo "\n"."Entering to store...";
  echo "\n"."Already in the store";
}
