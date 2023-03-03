<?php
// Crie uma classe chamada Conta com os atributos número da conta, nome do
// titular e o saldo. Construa os métodos Saldo (mostra o saldo da conta),
// Depósito (aumenta o saldo da conta) e Saque (diminui o saldo da conta).
class Conta
{
    public int $number;
    public string $owner;
    public float $balance;

    // Mostrar saldo
    public function show_balance()
    {
        return $this->balance;
    }

    // Depositar
    public function deposit_funds(float $funds)
    {
        $this->balance += $funds;
    }

    // Sacar
    public function retrieve_funds(float $funds)
    {
        $this->balance -= $funds;
    }
}
$conta = new Conta();
$conta->balance = 100;

echo $conta->show_balance(); // Mostra o saldo total = 100
echo "\n";
$conta->deposit_funds(50); // Depositando 50
echo $conta->show_balance(); // Mostra o saldo total = 150
echo "\n";
$conta->retrieve_funds(100); // Sacando 100
echo $conta->show_balance(); // Mostra o saldo total = 50
echo "\n";
