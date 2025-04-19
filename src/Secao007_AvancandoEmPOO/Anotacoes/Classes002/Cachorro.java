package Secao007_AvancandoEmPOO.Anotacoes.Classes002;

public class Cachorro extends Animal {

    // O cachorro (SUBCLASSE) é obrigado a usar as propriedades do animal (SUPERCLASSE)
    // cachorro -> subclasse -> filho
    // animal -> superclasse -> pai

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(nome + " está latindo!");
    }

}
