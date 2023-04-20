let candel = false; //vela apagada

if(candel==false){
  console.log("La vela está apagada");
  turnCandelOn();
}

function turnCandelOn(){
  let lighter = false; //no tenemos encendedor

  if(lighter == false){
    console.log("Buscando encendedor...");
    lighter = true;
  }
  if(lighter == true){
    console.log("Ya tenemos el encendedor vamos a buscar encender la vela");
  }
  if(lighter==true && candel==false){
    console.log("encendiendo la vela...");
    candel=true;
  }
}

if(candel==true){
  console.log("La vela está encendida");
}
