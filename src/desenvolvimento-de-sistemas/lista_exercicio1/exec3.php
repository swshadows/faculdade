<?php
// Crie uma classe chamada Invoice que possa ser utilizado por uma loja de
// suprimentos de informática para representar uma fatura de um item vendido
// na loja. Uma fatura deve incluir as seguintes informações como atributos:
// a. o número do item faturado,
// b. a descrição do item,
// c. a quantidade comprada do item e
// d. o preço unitário do item.
// Sua classe deve ter um construtor que inicialize os quatro atributos. Se a
// quantidade não for positiva, ela deve ser configurada como 0. Se o preço por
// item não for positivo ele deve ser configurado como 0.0. Forneça um método set
// e um método get para cada variável de instância. Além disso, forneça um método
// chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a
// quantidade pelo preço por item) e depois retorna o valor como um double.
// Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
class Invoice
{
    private int $number;
    private string $description;
    private int $qty;
    private float $unit_price;

    // Construtor
    public function __construct(int $num, string $desc, int $qt, float $u_price)
    {
        $this->number = $num;
        $this->description = $desc;

        if ($qt < 0) {
            $this->qty = 0;
        } else {
            $this->qty = $qt;
        }

        if ($u_price < 0) {
            $this->unit_price = 0;
        } else {
            $this->unit_price = $u_price;
        }
    }

    // Calcular preco total
    public function get_invoice_amount()
    {
        $total = $this->qty * $this->unit_price;
        return $total;
    }

    // Getters
    public function get_number()
    {
        return $this->number;
    }
    public function get_description()
    {
        return $this->description;
    }
    public function get_qty()
    {
        return $this->qty;
    }
    public function get_unit_price()
    {
        return $this->unit_price;
    }

    // Setters
    public function set_number(int $var)
    {
        $this->number = $var;
    }
    public function set_description(string $var)
    {
        $this->description = $var;
    }
    public function set_qty(int $var)
    {
        $this->qty = $var;
    }
    public function set_unit_price(float $var)
    {
        $this->unit_price = $var;
    }
}

$inv = new Invoice(10, "Caderno", 2, 10.50);
$inv->set_number(5); // Mudando o valor de number pra 5 com setter
echo $inv->get_number(); // Imprime number com getter
echo "\n";
echo $inv->get_invoice_amount(); // Imprime o total