<?php
// Escreva uma classe cujos objetos representam alunos matriculados em uma
// disciplina. Cada objeto dessa classe deve guardar os seguintes dados do
// aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os
// seguintes métodos para esta classe:
// a. Média que calcula a média final do aluno (cada prova tem peso 2,5 e
// o trabalho tem peso 2)
// b. Final calcula quanto o aluno precisa para a prova final (retorna zero se
// ele não for para a final)

class Aluno
{
    public string $matricula;
    public string $nome;
    public float $n1;
    public float $n2;
    public float $n_trab;

    // Calcula a média
    public function calc_media()
    {
        $nota_calc = ($this->n1 * 2.5) + ($this->n2 * 2.5) + ($this->n_trab * 2);
        $soma_pesos = (2.5 * 2) + 2;
        $media = $nota_calc / $soma_pesos;
        return $media;
    }

    // Calcula a nota requerida pra final, se não houver final, retorna 0
    public function calc_final()
    {
        $media = $this->calc_media();
        if ($media < 5) {
            return 10 - $media;
        } else {
            return 0;
        }
    }
}

$aluno1 = new Aluno();
$aluno1->n1 = 10;
$aluno1->n2 = 10;
$aluno1->n_trab = 5;
echo $aluno1->calc_media(); // Calcula a média 
echo "\n";
echo $aluno1->calc_final(); // Calcula a final caso necessário
