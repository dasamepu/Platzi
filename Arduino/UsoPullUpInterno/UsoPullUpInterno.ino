int boton = 10;
int Led = 11;

void setup() {
  // put your setup code here, to run once:
  pinMode(Led, OUTPUT);
  pinMode(boton, INPUT_PULLUP);
  Serial.begin(9600);
  //Las entradas analogicas no requieren inicialización
}

void loop() {
  // put your main code here, to run repeatedly:
 
  Serial.println(digitalRead(boton));

    //When boton is LOW means is not been pressed
    //When boton is HIGH means is been pressed

  if(digitalRead(boton) == LOW){
    digitalWrite(Led, HIGH);
  }else{
    digitalWrite(Led, LOW);
  }
}
