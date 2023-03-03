<?php
// A fim de representar empregados em uma firma, crie uma classe chamada
// Empregado que inclui as três informações a seguir como atributos:
// a. um primeiro nome,
// b. um sobrenome, e
// c. um salário mensal.
// Sua classe deve ter um construtor que inicializa os três atributos. Forneça um
// método set e get para cada atributo. Se o salário mensal não for positivo,
// configure-o como 0.0. Escreva um aplicativo de teste que demonstra as
// capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de
// cada instância. Então dê a cada empregado um aumento de 10% e exiba
// novamente o salário anual de cada empregado.
class Empregado
{
    private string $name;
    private string $surname;
    private float $salary;

    // Construtor
    public function __construct(string $nome, string $sobrenome, float $sal)
    {
        $this->name = $nome;
        $this->surname = $sobrenome;
        if ($sal < 0) {
            $this->salary = 0;
        } else {
            $this->salary = $sal;
        }
    }

    // Calcular o salário anual
    public function calc_sal_yearly()
    {
        $yearly_sal = $this->salary * 12;
        return $yearly_sal;
    }

    // Aumentar o salário com percentual
    public function calc_salary_raise(int $percent)
    {
        $raised_salary = $this->salary * ($percent / 100);
        $total = $raised_salary + $this->salary;
        return $total;
    }

    // Getters
    public function get_name()
    {
        return $this->name;
    }
    public function get_surname()
    {
        return $this->surname;
    }
    public function get_salary()
    {
        return $this->salary;
    }

    // Setters
    public function set_name(string $var)
    {
        $this->name = $var;
    }
    public function set_surname(string $var)
    {
        $this->surname = $var;
    }
    public function set_salary(float $var)
    {
        $this->salary = $var;
    }
}

$emp_1 = new Empregado("Natanael", "Xavier", 5000); // Empregado 1
$emp_2 = new Empregado("Iderlan", "Lira", 5100); // Empregado 2

// Calculos do empregado 1, Natanael
echo $emp_1->calc_sal_yearly();
echo "\n";
echo $emp_1->calc_salary_raise(10);

echo "\n";
echo "\n";

// Calculos do empregado 2, Iderlan
echo $emp_2->calc_sal_yearly();
echo "\n";
echo $emp_2->calc_salary_raise(10);
