package br.com.geekuniversity.secao11;
/*
Getters e Setters

Getter:
-é um método público que server para consultar dados;
-A nomenclatura desses métodos é get nome do atributo()
 */

public class Conta {
    //O ideal ser todos os Atributos da classe como privado
    private int numero; //PRIVATE, tornar o atributo privado da própria classe
    private float saldo; // para consultar o saldo
    private float limite;
    private Cliente cliente;

    //Construtor para a classe conta, é obrigatorio ser publico porque acessa outras classes
    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;

    }

    /**
     * Metodo sacar, pode colocar com acento, no navegador muda para UNICODE
     *
     * @param valor a ser sacado (100 - 50 = 50)
     *              Isso seria um JavaDoc
     */
    public void sacar(float valor) { // Criar a regra de negócio(Validações)
        if (valor <= (this.saldo)) { // Caso tenha saldo
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso");
        } else if (valor <= (this.saldo + this.limite)) {
            //calculando o valor excedente do saque
            // Saldo: 100 - Saque: 200 = -100
            float val_ret = this.saldo - valor;
            if (val_ret < 0) {
                this.saldo = 0;
            }
            //100 = 200 - 100
            val_ret = this.limite + val_ret;
            this.limite = val_ret; // Novo limite seria 100
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Salto insuficiente");
        }

    }

    //Método sacar
    // 100 + 30 = 130
    //Forma 1
    //   public void depositar(float valor) {
    //     synchronized (this) { // Para quando for usar Thread. O This é a própria classe
    //       this.saldo = this.saldo + valor; // Soma. Sincroniza (this.saldo = this.saldo + valor;)
    // }
    // }

    //Forma 2
    public synchronized void depositar(float valor){
        this.saldo = this.saldo + valor;
    }

    /**
     * Metodo getter do atributo saldo
     *
     * @return a soma do saldo + o limite
     * E publico para que for chamar conseguir
     */
    public float getSaldo() {
        return this.saldo + this.limite;
    }


    @Override //Sobrescrever o método da classe pai no caso da classe Object
    public String toString() {
        return "O saldo da conta é " + this.getSaldo();
    }

    @Override //Sobrescrever o método equals da classe pai
    // a instanceof é a instância do objeto
    /*
     -Isso serve para quando for if(c1.equals(cli1)) - Lá na classe cliente, irá entrar no else, porque as instâncias são diferentes
    */
    public boolean equals(Object o) {
        if (!(o instanceof Conta)) { //Retorna false, caso a instância do objeto for diferente de Conta
            return false;
        } else {
            Conta verificar = (Conta) o; //Cast
            return verificar.getSaldo() == this.getSaldo();

        }

    }
}