#include <stdio.h>
#include <stdlib.h>
int main (void) {
float r,cd,d;
printf ("valor em real\n");
scanf ("%f",&r);

printf ("cota�ao do dolar\n");
scanf ("%f",&cd);

d=r/cd;
printf ("valor convertido para d�lar=%f\n",d);
getch ();
return 0;
}
