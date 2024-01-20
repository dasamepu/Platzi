#include <stdio.h>

int i, j, k;
int minutosEstacionadosMinimos = 30;

int main()
{
    /* First hello world in C language
    printf("hello Platzi"); */

    printf("Hello students");
    return 0;

}

Basic Types:
    Aritmeticos:
        (A) Valores enteros:

            char 1 Byte (-128 a 127)
            unsigned char 1 Byte (0 a 255)
            
            int 4 Bytes (-2,147,483,648 a 2,147,483,647)
            unsigned int 4 Bytes (0 a 4,294,967,25)

            short 2 Bytes (-32,768 a 32,767)
            unsigned short 2 Bytes (0 a 65,535)

            long 8 Bytes (-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
            unsigned long 8 Bytes (0 a 18,446,744,073,709,551,615)

        (B) De punto Flotante:
            
            float 4 Bytes (1.2E-38 a 3.4E+38)               6 posiciones para los numero decimales
            
            double 8 Bytes (2.3E-308 a 1.7E+308)            15 posiciones para los numero decimales

            long double 10 Bytes (3.4E-4932 a 1.1E+4932)    19 posiciones para los numero decimales
    
    void: Especifica que no hay valor disponible, se usa en 3 escenarios:
        1. Una funcion que retorna un tipo de datos void.
            /* void funtion() */
        2. Una funcion que tiene argumento de tipo void.
            /* int rand(void); */
        3. Puntero o apuntador qe va a la dirección en memoria de un objeto, pero no le importa el tipo de dato que tenga.
