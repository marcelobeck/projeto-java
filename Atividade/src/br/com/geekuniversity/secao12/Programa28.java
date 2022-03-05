package br.com.geekuniversity.secao12;

//Heranca
/*
Beneficioes da Heranca
- Um dos fatores da Herença é evitar repetição de
código.
- Facilita a manutenção do programa
 */
public class Programa28 {
    public static void main(String[] args) {

        // Pessoa p1 = new Pessoa("Pedro", 1985, "pedro@gmail.com");
        // System.out.println(p1);
        //System.out.println(p1.getNome());

        //Obejto, que são pessoas
        Aluno a1 = new Aluno("Vanessa", 2001, "12345","pedro@gmail.com");
        System.out.println(a1);
        //System.out.println(a1.getNome());

        //Objeto, que são pessoas
        Professor prof1 = new Professor("Pedro", 1987,"pedro@gmail.com","45678");
        System.out.println(prof1);
        //System.out.println(prof1.getNome());


    }
}
