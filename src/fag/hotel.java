package fag;

import java.util.ArrayList;
import java.util.List;

public class hotel {
    private List<quarto> quartos;
    private List<reserva> reservas;

    public hotel() {
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarquarto(quarto quarto) {
        quartos.add(quarto);
    }

    public void fazerreserva(reserva reserva) {
        reservas.add(reserva);
        for (quarto quarto : quartos) {
            if (quarto.gettipo().equals(reserva.gettipoquarto()) && quarto.isdisponivel()) {
                quarto.setdisponivel(false);
                reserva.numeroquartos--;
                if (reserva.numeroquartos == 0) break;
            }
        }
    }

    public void realizarcheckin(String nomehospede) {
        for (reserva reserva : reservas) {
            if (reserva.getnomehospede().equalsIgnoreCase(nomehospede)) {
                System.out.println("Check-in realizado para " + nomehospede);
                return;
            }
        }
        System.out.println("Reserva não encontrada.");
    }

    public void realizarcheckout(String nomehospede) {
        for (reserva reserva : reservas) {
            if (reserva.getnomehospede().equalsIgnoreCase(nomehospede)) {
                for (quarto quarto : quartos) {
                    if (quarto.gettipo().equals(reserva.gettipoquarto())) {
                        quarto.setdisponivel(true);
                    }
                }
                reservas.remove(reserva);
                System.out.println("Check-out realizado para " + nomehospede);
                return;
            }
        }
        System.out.println("Reserva não encontrada.");
    }

    public void listarocupacaoquartos() {
        System.out.println("Ocupação de Quartos:");
        for (quarto quarto : quartos) {
            System.out.println(quarto);
        }
    }

    public void gerarhistoricoreservas(String nomehospede) {
        System.out.println("Histórico de Reservas para " + nomehospede + ":");
        for (reserva reserva : reservas) {
            if (reserva.getnomehospede().equalsIgnoreCase(nomehospede)) {
                System.out.println(reserva);
            }
        }
    }
}