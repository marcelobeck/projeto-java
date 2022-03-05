package br.com.geekuniversity.secao14;
/*
Uma interface pode conter:
  -Constante; é a marca, por exemplo, toda vez que acessar essa interface a marca vai ser "Geek";
  -Métodos abstratos;


Interface para servir de contrato para produtos eletrônicos. Todo produto eletrônico que implementar
esta interface OBRIGATORIAMENTE deverão implementar os métodos abstratos.
 */


public interface IEletronico { // a letra I é para identificar que é interface

    public String MARCA = "Geek"; // Atributo de uma classe, a constante "marca", colocar tudo em maiúsculo. Na constante não se altera o valor

    public void ligar(); //Aqui é um método Abstrato. Não pode ter métodos implementados.

    public void desligar(); //Aqui é um método Abstrato. Não pode ter métodos implementados.

}