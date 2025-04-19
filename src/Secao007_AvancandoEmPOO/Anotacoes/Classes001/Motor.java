package Secao007_AvancandoEmPOO.Anotacoes.Classes001;

public class Motor {

    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void exibirInfo() {
        System.out.println("Motor - Tipo: " + tipo);
        System.out.println("Motor - Potência: " + potencia + " cavalos");
    }

}
