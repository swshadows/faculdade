#include <stdio.h>

main()
{
    FILE *arquivo; // Cria a variável que irá manipular o arquivo

    // A variavel recebe o comando de abrir (fopen) o arquivo 'meu_arquivo.txt'
    // fopen recebe 2 argumentos, sendo o primeiro o nome do arquivo com extensão (.txt).
    // O 2o argumento pode ser de três tipos, "r" para leitura, "w" para sobreescrita e "a" para escrita normal
    arquivo = fopen("meu_arquivo.txt", "w");
    fprintf(arquivo, "Texto adicionado\n"); //usando a variável arquivo, é possivel escrever no modo W com o comando fprintf
    fclose(arquivo);                        // Para fechar o arquivo, deve utilizar o método fclose com o arquivo aberto como argumento da função
}