#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(){
	int c,d,e,f,g;//declara��o de variaveis
	char a[1000],b[1000];
	scanf ("%d",&c);//atribui a quantidade de testes
	for (d=0;d<c;d++){//la�o para repetir os testes
		g=0;
		scanf("%s%s",a,b);//atribui os valores que ser�o comparados
		if((e=strlen(a)-strlen(b))>=0){//la�os que verificam se b corresponde aos digitos finais de a
			for(f=e;f<strlen(a);f++){
				if (a[f]==b[g])
					g++;
			}
			if(g==strlen(b))
				printf("encaixa\n");
			else
				printf("nao encaixa\n");
		}
		else
			printf("nao encaixa\n");
	}
system("pause");}
