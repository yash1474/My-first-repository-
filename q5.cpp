#include <stdio.h>
#include <ctype.h>
int main(){
	char ch;
	printf("Enter your letter: ");
	scanf("%c", &ch);
	if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'||ch=='U'){
		printf("%c is a vowel!", ch);
	}
	else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
		printf("%c is a consonant!",ch);
	}
	else{
		printf("Your input isn't a letter, try again");
	}
	
} 
