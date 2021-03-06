#include <stdio.h>
#include <math.h>
#include "meh.h"
#define PI 3.14159265

// comment
int unum = 1;

int scalar (int a, int b) {
	for (int i = 0; i < 10; i++) {
		printf("boo\n");
		if (a < b) a -= b;
	}
	/***********
	 * comment *
	 ***********/
	if (a > b) {
		printf("a > b\n");
	} else if (a < b) {
		printf("a < b\n");
	} else {
		printf("a == b\n");
	}

	return sqrt(a * a + b + (b - a) * b);
}


