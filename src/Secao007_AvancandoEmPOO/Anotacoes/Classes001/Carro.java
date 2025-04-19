package Secao007_AvancandoEmPOO.Anotacoes.Classes001;

public class Carro {

    private String marca;
    private String modelo;
    public Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        // Propriedades comuns
        this.marca = marca;
        this.modelo = modelo;
        // Propriedade de Object composition
        this.motor = motor;
    }

    public void exibirInfo() {
        System.out.println("Carro - Marca: " + marca);
        System.out.println("Carro - Modelo: " + modelo);
        motor.exibirInfo();
    }



}
