#include <stdio.h> 
#include <stdlib.h>
// constante simbolica que representa o tamanho do vetor 
#define TAM 10
// defini��o da fun��o inicializaVetor e void nao retorna valor
void inicializaVetor(int v[]) {         
        int i;      
        for (i = 0; i < TAM; i++) {      
             v[i] = rand()%100;     
        }   
}
// defini��o da fun��o imprimeVetor     
void imprimeVetor(int v[ ]) {   
        int i;      
        for (i = 0; i < TAM; i++) {    
             printf ("%d ", v[i]); 
        }   
}

void Maior_Vetor(int v[ ]) {   
        int i,aux=0;      
        for (i = 0; i < TAM; i++) {    
            if(v[i]>aux)
               aux=v[i];
        }   
}

main () {     
       int x,vetor[TAM];   
       // chama a funcao inicializaVetor    
       inicializaVetor(vetor); 
       // chama a fun��o imprimeVetor   
       imprimeVetor(vetor);   
       printf ("\n\n"); 
       x=Maior_Vetor(vetor);
       printf ("Maior N=%d\n",x);
       system("PAUSE");    
}
