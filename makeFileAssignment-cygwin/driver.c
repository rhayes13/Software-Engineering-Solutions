/*
 * driver.c
 *
 *  Created on: Apr 18, 2020
 *      Author: matt
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "headers.h"

int main() {
	char * myMessage = (char *)malloc(40);
	memcpy(myMessage, "Yikes!", 7);
	printf("In main, calling help function...\n");
	char * myResult = helpMe(myMessage);
	printf("In main, returned from help function with the message '%s'\n", myResult);
	return 0;
}
