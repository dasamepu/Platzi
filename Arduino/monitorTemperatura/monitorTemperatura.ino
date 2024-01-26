//incluimos la libreria
#include "dht.h"

//definimos A0 como la entrada analogica de nuestro sensor
#define dhtpin A0 

//Instanciamos un objeto de la clase "dht" (que se encuentra en la libreria dht.h) y lo llamamos "DHT" 
dht DHT; 

void setup()
{ 
  //Inizializamos la comunicación serial a una velocidad de 9600 baudios 
  Serial.begin(9600);
  
  //esperamos 500 milisegundos
  delay(500);
  
  //Imprimimos el titulo
  Serial.println("DHT11 Humidity & temperature Sensor\n\n");
  
  //Esperamos 1000 milisegundos
  delay(1000); 
} 
void loop()
{ 
  //llamamos al metodo "read11()" del objeto DHT para leer los datos del sensor
  DHT.read11(dhtpin);    
  
  //Imprimimos la humedad en el monitor
  Serial.print("Current humidity = ");
  Serial.print(DHT.humidity);
  Serial.print("%  ");
  
  //Imprimimos la temperatura en el monitor
  Serial.print("temperature = ");
  Serial.print(DHT.temperature); 
  Serial.println("C  ");    
  
  //esperamos 1000 milisegundos antes de imprimir los datos otra vez
  delay(1000); 
} 
