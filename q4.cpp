#include <stdio.h>
#include <math.h>
	int main(){
	double principal, rate, time;
	double si, ci;
	
	printf("Enter the principal: ");
	scanf("%lf", &principal);
	printf("Enter rate: ");
	scanf("%lf", &rate);
	printf("Enter time (years): ");
	scanf("%lf", &time);
	
	si=(principal*rate*time)/100;
	ci=principal *(pow((1+rate/100),time))-principal;
	
	printf("Simple Interest is: %.2lf\n", si);
	printf("Compound Interest is: %.2lf", ci);
	
}
