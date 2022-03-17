#include <pthread.h>
#include <stdio.h>
#include <time.h>

void * Thread0 ()//Corpo da thread
{
	int i=0;
	for(i=1;i<10;i++){
		printf(" Thread0 - %d\n",i);
		sleep(3); //Suspende thread por 3segs
	}
}

void * Thread1 ()//Corpo da thread
{
	int i=0;
	for(i=10;i<20;i++){
		printf(" Thread1 - %d\n",i);
		sleep(1);
	}
}

void * Thread2 ()//Corpo da thread
{
	int i=0;
	for(i=20;i<40;i++){
		printf(" Thread2 - %d\n",i);
		sleep(2);
	}
}

int main(){
	pthread_t t0, t1, t2, t3, t4, t5; //handles das threads
	int ret0, ret1, ret2, ret3, ret4, ret5;

	//Cria threads
	ret0 = pthread_create(&t0, NULL, Thread0,NULL) ;
	ret1 = pthread_create(&t1, NULL, Thread1,NULL) ;
	ret2 = pthread_create(&t2, NULL, Thread2,NULL) ;
	ret3 = pthread_create(&t3, NULL, Thread0,NULL) ;
	ret4 = pthread_create(&t4, NULL, Thread1,NULL) ;
	ret5 = pthread_create(&t5, NULL, Thread2,NULL) ;
	//Faz thread principal esperar as demais
	pthread_join(t0,NULL);
	pthread_join(t1,NULL);
	pthread_join(t2,NULL);
	pthread_join(t3,NULL);
	pthread_join(t4,NULL);
	pthread_join(t5,NULL);
	printf("Main acabou\n");
}