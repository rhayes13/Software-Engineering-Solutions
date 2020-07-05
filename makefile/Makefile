CC=gcc
CFLAGS=-c -Wall

all: makefileAssignment

makefileAssignment: driver.o file1.o file2.o
	$(CC) driver.o file1.o file2.o -o makefileAssignment
	
driver.o: driver.c headers.h
	$(CC) $(CFLAGS) driver.c
	
file1.o: file1.c headers.h
	$(CC) $(CFLAGS) file1.c
	
file2.o: file2.c headers.h
	$(CC) $(CFLAGS) file2.c

.PHONY: clean
clean:
	rm -rf *o makefileAssignment