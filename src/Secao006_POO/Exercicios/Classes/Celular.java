package Secao006_POO.Exercicios.Classes;

public class Celular {
    private String marca;
    private String modelo;
    private int bateria;
    private boolean estaLigado = false;

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("A marca inserida (" + marca + ") não atende aos critérios!");
        }
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("O modelo inserido (" + modelo + ") não atende aos critérios!");
        }
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("A porcentagem de bateria informada (" + bateria + ") não esta no intervalo necessário (0 - 100)!");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getBateria() {
        return bateria + "%";
    }

    public Celular() {
        this.marca = "Samsung";
        this.modelo = "Galaxy S23";
        this.bateria = 100;
    }

    public Celular(String marca, String modelo, int bateria) {
        setMarca(marca);
        setModelo(modelo);
        setBateria(bateria);
    }

    public void ligarCelular() {
        if (this.estaLigado) {
            System.out.println("O " + getModelo() + " já está ligado!");
        } else {
            this.estaLigado = true;
            System.out.println("O " + getModelo() + " foi ligado.");
        }
    }

    public void desligarCelular() {
        if (this.estaLigado) {
            this.estaLigado = false;
            System.out.println("O " + getModelo() + " foi desligado.");
        } else {
            System.out.println("O " + getModelo() + " já está desligado!");
        }
    }

    public void fazerLigacao(int bateriaUsada) {
        if (this.bateria > 0) {
            if (this.bateria >= bateriaUsada) {
                this.bateria -= bateriaUsada;
                System.out.println(getModelo() + " | Porcentagem atual: " + this.bateria + "%");
                System.out.println(getModelo() + " | Consumo: " + bateriaUsada + "%");
                System.out.println("---");
            } else {
                System.out.println("O " + getModelo() + " não possui bateria o suficiente!");
            }
        } else {
            System.out.println(getModelo() + " | % de bateria insuficiente!");
        }
    }

    public void exibirDescricao() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Bateria: " + getBateria());
        System.out.println("---");
    }
}
