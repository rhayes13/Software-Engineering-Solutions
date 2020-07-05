/*
 * file2.c
 *
 *  Created on: Apr 18, 2020
 *      Author: matt
 */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "headers.h"

char *helpMeMore(char *message){
	printf("In helpMeMore with the message '%s'\n", message);
	char *result = strcat(message," LIFE_LINE!");
	printf("Returning from helpMe with the message '%s'\n", result);
	return result;
}
