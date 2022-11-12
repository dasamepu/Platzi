<?php
function placesRecommendation($condition = '', $question = ''){
  $weather = array("Bogota" => "cold",
                   "Montería" => "hot", 
                   "Medellín" => "mild");
  $ubication = array("Guajira" => "north", 
                     "Leticia" => "south", 
                     "Santander" => "east", 
                     "Antioquia" => "west");
  $tourism = array("Santa Marta" => "sea",
                   "Villavicencio" => "plains",
                   "Riohacha" => "desert",
                   "Quindio" => "valley");

  switch($condition){
    case "weather":
      $search = $weather;
    break;
    case "ubication":
      $search = $ubication;
    break;
    case "touism":
      $search = $tourism;
    break;
    default:
      echo "welcome to Colombia";
  }
  echo "the perfect place in colombia for you is ".array_search($question, $search);
}
placesRecommendation("weather", "hot");
