<?php
// Escreva uma classe que determine as raízes de uma equação de 2º grau:
// ax2 + bx + c = 0 (recordar que o discriminante Δ = b2 – 4ac, e que a raiz r =
// (–b ± √Δ)/2a).

class Baskara
{
    public int $a;
    public int $b;
    public int $c;

    // Calcular delta
    public function calc_delta()
    {
        $delta = pow($this->b, 2) - 4 * $this->a * $this->c;
        return $delta;
    }

    // Calcular a raiz
    public function calc_root()
    {
        // square root
        $r_pos = (-$this->b + sqrt($this->calc_delta())) / 2 * $this->a;
        $r_neg = (-$this->b - sqrt($this->calc_delta())) / 2 * $this->a;
        return [$r_pos, $r_neg];
    }
}

$root = new Baskara();
$root->a = 1;
$root->b = 5;
$root->c = 6;

echo $root->calc_delta(); // Calcula o delta
echo "\n";
$roots = $root->calc_root(); // Calcula as raizes e retorna em um array de 2 posições
echo $roots[0]; // Imprime a raiz 1
echo "\n";
echo $roots[1]; // Imprime a raiz 2
