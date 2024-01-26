// includes the LiquidCrystal Library 
#include <LiquidCrystal.h> 
// Creates an LCD object. Parameters: (rs, enable, d4, d5, d6, d7) 
LiquidCrystal lcd(12, 11, 2, 3, 4, 5); 

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
  lcd.begin(16, 2);
}

void loop()
{ 
  //llamamos al metodo "read11()" del objeto DHT para leer los datos del sensor
  DHT.read11(dhtpin);    
  
  //Imprimimos la temperatura en el monitor
  Serial.print("temperature = ");
  Serial.print(DHT.temperature); 
  Serial.println("C  ");  

  lcd.setCursor(2, 0);
  lcd.print("temperature: ");
  lcd.setCursor(2, 1);
  lcd.print(DHT.temperature); 
  
} 