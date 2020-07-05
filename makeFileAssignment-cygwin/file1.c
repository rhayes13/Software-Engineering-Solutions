/*
 * file1.c
 *
 *  Created on: Apr 18, 2020
 *      Author: matt
 */

#include <stdio.h>
#include <stdlib.h>
#include "headers.h"

char* helpMe(char *message){
	printf("In helpMe with the message '%s'\n", message);
	char *result = helpMeMore(message);
	printf("Returning from helpMe with the message '%s'\n", result);
	return result;
}
