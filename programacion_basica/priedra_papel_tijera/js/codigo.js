function aleatorio(min, max) {
    return Math.floor(Math.random()*(max-min+1)+min);
}

function eleccion(jugada) {
    let resultado = ""
    if (jugada==1) {
        resultado = "PIEDRA 🪨"
    } else if (jugada==2){
        resultado = "PAPEL 🧻"
    } else if (jugada==3){
        resultado = "TIJERA ✂️"
    }else{
        resultado = "invalid data"
    }
    return resultado
}

//1 piedra, 2 papel, 3 tijera
let jugador = 0;
let pc = 0
let triunfos = 0
let perdidas = 0

while(triunfos < 3 && perdidas < 3){

    pc = aleatorio(1, 3)

    console.log(pc);
    jugador = prompt("Elige 1 para piedra, 2 para papel y 3 para tijera")

    alert("Jugador elige: " +eleccion(jugador));
    alert("PC elige: " +eleccion(pc));

    //Batalla
    if(pc == jugador){
        alert("EMPATE");
    }else if(jugador==1 && pc==3 || jugador==2 && pc==1 || jugador==3 && pc==2){
        alert("GANASTE");
        triunfos++;
    }else{
        alert("PERDISTE");
        perdidas++
    }

}

console.log("Ganaste: " + triunfos + " Veces. Perdiste: " + perdidas + " veces.")