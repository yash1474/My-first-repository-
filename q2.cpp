#include <stdio.h>
#include <math.h>
int main(){
	double a,b,c,dis,root1,root2,real,img;
	printf("Enter the coefficients: a, b, c \n");
	scanf("%lf\t%lf\t%lf", &a,&b,&c);
	dis=b*b-4*a*c;
	if (dis>0){
		root1=((-b)+sqrt(dis))/2*a;
		root2=((-b)-sqrt(dis))/2*a;
		printf("Root1: %.2lf\n Root2: %.2lf",root1,root2);
	}
	else if(dis==0){
		root1=root2 =-b/(2*a);
		printf("Root1 = Root2 = %.2lf\n", root1);
	}
	else{
		double realpart =-b/ (2*a);
		double imaginaryPart = sqrt(-dis)/(2*a);
		printf("Root 1=%.2lf +%.2lfi\n",realpart, imaginaryPart);
		printf("Root2=%.2lf +%.2lfi",realpart, imaginaryPart);
	}
	return 0;
	
}
