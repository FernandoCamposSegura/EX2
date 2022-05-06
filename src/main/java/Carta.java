public class Carta {
    private String palo;
    private String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getValor() {
        return numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
