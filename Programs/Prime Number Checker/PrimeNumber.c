// Tests whether a number is prime

#include "stdafx.h"
#include <stdio.h>

#define true 1
#define false 0
typedef int bool;

bool is_prime(int n)
{
	int divisor;

	if (n <= 1)
		return false;
	for (divisor = 2; divisor * divisor <= n; divisor++)
		if (n % divisor == 0)
			return false;
	return true;
}

int main(void)
{
	int n;

	printf("Enter a number: ");
	scanf("%d", &n);
	if (is_prime(n))
		printf("Prime\n");
	else 
		printf("Not prime\n");
	return 0;
}
