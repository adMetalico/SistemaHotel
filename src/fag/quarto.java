package fag;

public class quarto {
    private int numero;
    private String tipo;
    private double precodiario;
    private boolean disponivel;

    public quarto(int numero, String tipo, double precodiario) {
        this.numero = numero;
        this.tipo = tipo;
        this.precodiario = precodiario;
        this.disponivel = true;
    }

    public int getnumero() {
        return numero;
    }

    public String gettipo() {
        return tipo;
    }

    public double getprecodiario() {
        return precodiario;
    }

    public boolean isdisponivel() {
        return disponivel;
    }

    public void setdisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Quarto " + numero + " (" + tipo + ") - R$" + precodiario + "/dia - " + (disponivel ? "Disponível" : "Ocupado");
    }
}