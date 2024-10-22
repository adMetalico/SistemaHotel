package fag;

import java.time.LocalDate;

public class reserva {
    private String nomehospede;
    private LocalDate datacheckin;
    private LocalDate datacheckout;
    public int numeroquartos;
    private String tipoquarto;

    public reserva(String nomehospede, LocalDate datacheckin, LocalDate datacheckout, int numeroquartos, String tipoquarto) {
        this.nomehospede = nomehospede;
        this.datacheckin = datacheckin;
        this.datacheckout = datacheckout;
        this.numeroquartos = numeroquartos;
        this.tipoquarto = tipoquarto;
    }

    public String getnomehospede() {
        return nomehospede;
    }

    public LocalDate getdatacheckin() {
        return datacheckin;
    }

    public LocalDate getdatacheckout() {
        return datacheckout;
    }

    public int getnumeroquartos() {
        return numeroquartos;
    }

    public String gettipoquarto() {
        return tipoquarto;
    }

    @Override
    public String toString() {
        return "Reserva de " + numeroquartos + " quarto(s) " + tipoquarto + " para " + nomehospede +
                " de " + datacheckin + " até " + datacheckout;
    }
}