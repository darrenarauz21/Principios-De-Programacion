#include <conio.h>
#include <stdio.h>

int main()
{
    int dia;
 //   int enero=31,febrero=28,marzo=31,abril=30,mayo=31,junio=30,julio=31,agosto=31,septiempre=30,ocutubre=31,noviembre=30,diciembre=31;
    printf("1. Enero\n2. Febrero\n3. Marzo\n4. Abril\n5. Mayo\n6. Junio\n7. Julio\n8. Agosto\n9. Septiempre\n10. Ocutubre\n11. Noviembre\n12. Diciembre\n" );
    printf("Elija un mes 1-12: ");
    scanf( "%d", &dia );

    switch ( dia )
    {
        case  1 : printf( "\n   Enero: Tiene 31 dias" );
                  break;
        case  2 : printf( "\n   Febrero: Tiene 28 a 29 dias" );
                  break;
        case  3 : printf( "\n   Marzo: Tiene 31 dias" );
                  break;
        case  4 : printf( "\n   Abril: Tiene 30 dias" );
                  break;
        case  5 : printf( "\n   Mayo: Tiene 30 dias" );
                  break;
        case  6 : printf( "\n   Junio: Tiene 31 dias" );
                  break;
        case  7 : printf( "\n   Julio: Tiene 31 dias" );
                  break;
        case  8 : printf( "\n   Agosto: Tiene 31 dias" );
                  break;
        case  9 : printf( "\n   Septiembre: Tiene 30 dias" );
                  break;
        case 10 : printf( "\n   Octubre: Tiene 31 dias" );
                  break;
        case 11 : printf( "\n   Noviembre: Tiene 30 dias" );
                  break;
        case 12 : printf( "\n   Diciembre: Tiene 31 dias" );
                  break;
        default : printf( "\n   ERROR: Mes incorrecto." );
    }
    getch(); 

    return main ();
}
