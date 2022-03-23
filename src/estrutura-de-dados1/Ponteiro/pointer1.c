#include <stdio.h>

typedef struct{
    char nome[30];
    int idade;
    float coeficiente;
}t_aluno;

int main(){
    t_aluno *pAluno, aluno;
    pAluno = &aluno;

    puts("Informe o nome do aluno: ");
    gets(pAluno->nome);
    puts("Informe a idade do aluno: ");
    gets(pAluno->idade);
    puts("Informe o coeficiente do aluno: ");
    gets(pAluno->coeficiente);

    printf("Nome do aluno: %s\n", pAluno->nome);
    printf("Idade do aluno: %d\n", pAluno->idade);
    printf("Coeficiente do aluno: %d\n", pAluno->coeficiente);

}
