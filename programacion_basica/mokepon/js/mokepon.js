let ataque_jugador = ""
let ataque_enemigo = ""
let resultado = ""
let num_vidasjugador = 3
let num_vidasenemigo = 3
let ganador = ""

function iniciarJuego() {
    let section_seleccionar_ataque = document.getElementById("select_ataque")
    section_seleccionar_ataque.style.display = "none"

    let section_reiniciar = document.getElementById("reiniciar")
    section_reiniciar.style.display = "none"

    /* let sectionMensajes = document.getElementById("mensajes")
    sectionMensajes.style.display = "none" */

    let let_boton_mascota = document.getElementById("boton_mascota")
    let_boton_mascota.addEventListener("click", seleccionarMascota)

    let let_botonfuego = document.getElementById("boton_fuego")
    let_botonfuego.addEventListener("click", ataqueFuego)

    let let_botonagua = document.getElementById("boton_agua")
    let_botonagua.addEventListener("click", ataqueAgua)
    
    let let_botontierra = document.getElementById("boton_tierra")
    let_botontierra.addEventListener("click", ataqueTierra)

    let let_botonreiniciar = document.getElementById("boton_reiniciar")
    let_botonreiniciar.addEventListener("click", reiniciarJuego)
}

function seleccionarMascota() {
    let section_seleccionar_ataque = document.getElementById("select_ataque")
    section_seleccionar_ataque.style.display = "flex"

    let section_seleccionar_mascota = document.getElementById("seleccionar-mascota")
    section_seleccionar_mascota.style.display = "none"

    input_hipodoge = document.getElementById("Hipodoge")
    input_capipepo = document.getElementById("Capipepo")
    input_ratigueya = document.getElementById("Ratigueya")
    span_mascotajugador = document.getElementById("id_mascotajugador")

    if(input_hipodoge.checked){
        span_mascotajugador.innerHTML = "Hipodoge"
    } else if(input_capipepo.checked){
        span_mascotajugador.innerHTML = "Capipepo"
    } else if(input_ratigueya.checked){
        span_mascotajugador.innerHTML = "Ratigueya"
    }else{
        span_mascotajugador.innerHTML = "NO SELECCIONADA"
    }

    seleccionarMascotaEnemigo()
}

function seleccionarMascotaEnemigo() {
    let mascota_aleatoria = aleatorio(1, 3)
    span_mascotaenemigo = document.getElementById("id_mascotaenemigo")

    if (mascota_aleatoria == 1) {
        span_mascotaenemigo.innerHTML = "Hipodoge"
    } else if (mascota_aleatoria == 2) {
        span_mascotaenemigo.innerHTML = "Capipepo"
    } else if (mascota_aleatoria == 3) {
        span_mascotaenemigo.innerHTML = "Ratigueya"
    } else {
        span_mascotaenemigo.innerHTML = "ERROR, MASCOTA NO SELECCIONADA"
    }

}

function ataqueFuego(){
    ataque_jugador = "FUEGO"
    ataqueEnemigo()
}

function ataqueAgua(){
    ataque_jugador = "AGUA"
    ataqueEnemigo()
}

function ataqueTierra(){
    ataque_jugador = "TIERRA"
    ataqueEnemigo()
}

function ataqueEnemigo() {
    
    let num_ataque_enemigo = aleatorio(1,3)

    if (num_ataque_enemigo==1) {
        ataque_enemigo = "FUEGO"
    } else if(num_ataque_enemigo==2){
        ataque_enemigo = "AGUA"
    } else if (num_ataque_enemigo==3) {
        ataque_enemigo = "TIERRA"
    }

    combate()
}

function combate() {

    span_vidasjugador = document.getElementById("id_vidas_jugador")
    span_vidasenemigo = document.getElementById("id_vidas_enemigo")
    
    console.log("ataque_jugador" + ataque_jugador);
    console.log("ataque_enemigo" + ataque_enemigo);

    if (ataque_jugador == ataque_enemigo) {
            resultado = "EMPATE"
    } else if (ataque_jugador=="FUEGO" && ataque_enemigo=="TIERRA" ||ataque_jugador=="AGUA" && ataque_enemigo=="FUEGO" || ataque_jugador=="TIERRA" &&    ataque_enemigo=="AGUA"){
            resultado = "GANASTE"
            num_vidasenemigo--
            span_vidasenemigo.innerHTML = num_vidasenemigo
    }else{
            resultado = "PERDISTE"
            num_vidasjugador--
            span_vidasjugador.innerHTML = num_vidasjugador
    }

        addMensaje()

        revisarVidas()
}

function revisarVidas() {
    if (num_vidasenemigo==0 && num_vidasjugador>num_vidasenemigo) {
        ganador = "eres tu"
        decirGanador()
    } else if (num_vidasjugador==0 && num_vidasenemigo>num_vidasjugador) {
        ganador = "es el enemigo"
        decirGanador()
    }
}

function addMensaje() {
    /* 
    let sectionMensajes = document.getElementById("mensajes") 
    */
    let let_resultado = document.getElementById("id_resultado")
    let let_ataques_deljugador = document.getElementById("id_ataques_deljugador")
    let let_ataques_delenemigo = document.getElementById("id_ataques_delenemigo")

    let parrafo_ataques_deljugador = document.createElement("p")
    let parrafo_ataques_delenemigo = document.createElement("p")

    let_resultado.innerHTML = "Resultado: " + resultado
    parrafo_ataques_deljugador.innerHTML = "Jugador atacó con: " + ataque_jugador
    parrafo_ataques_delenemigo.innerHTML = "Enemigo atacó con: " + ataque_enemigo

/*     let parrafo = document.createElement("p")
    parrafo.innerHTML = "Tu atacaste con: " + ataque_jugador + " y el enemigo atacó con: " + ataque_enemigo + " Resultado: " + resultado
 */
    let_ataques_deljugador.appendChild(parrafo_ataques_deljugador)
    let_ataques_delenemigo.appendChild(parrafo_ataques_delenemigo)

}

function decirGanador(){
    let let_resultado = document.getElementById("id_resultado")
    
    let_resultado.innerHTML = "El ganador " + ganador

    alert("El ganador " + ganador)

    let let_botonfuego = document.getElementById("boton_fuego")
    let_botonfuego.disabled = true

    let let_botonagua = document.getElementById("boton_agua")
    let_botonagua.disabled = true
    
    let let_botontierra = document.getElementById("boton_tierra")
    let_botontierra.disabled = true

    let section_reiniciar = document.getElementById("reiniciar")
    section_reiniciar.style.display = "block"
}

function reiniciarJuego() {
    location.reload()
}

function aleatorio(min, max) {
    return Math.floor(Math.random()*(max-min+1)+min);
}

window.addEventListener("load", iniciarJuego)