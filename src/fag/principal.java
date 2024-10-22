package fag;

import java.time.LocalDate;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        hotel hotel = new hotel();
        Scanner scanner = new Scanner(System.in);

        hotel.adicionarquarto(new quarto(101, "solteiro", 150.0));
        hotel.adicionarquarto(new quarto(102, "casal", 200.0));
        hotel.adicionarquarto(new quarto(201, "suíte", 350.0));

        int opcao;
        do {
            System.out.println("\nSistema de Gerenciamento de Hotel:");
            System.out.println("1. Fazer Reserva");
            System.out.println("2. Realizar Check-in");
            System.out.println("3. Realizar Check-out");
            System.out.println("4. Listar Ocupação de Quartos");
            System.out.println("5. Gerar Histórico de Reservas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Hóspede: ");
                    String nomehospede = scanner.nextLine();
                    System.out.print("Data de Check-in (DD/MM/YYYY): ");
                    LocalDate checkin = LocalDate.parse(scanner.nextLine());
                    System.out.print("Data de Check-out (DD/MM/YYYY): ");
                    LocalDate checkout = LocalDate.parse(scanner.nextLine());
                    System.out.print("Tipo de Quarto: ");
                    String tipoquarto = scanner.nextLine();
                    System.out.print("Número de Quartos: ");
                    int numeroquartos = scanner.nextInt();

                    reserva reserva = new reserva(nomehospede, checkin, checkout, numeroquartos, tipoquarto);
                    hotel.fazerreserva(reserva);
                    break;
                case 2:
                    System.out.print("Nome do Hóspede: ");
                    nomehospede = scanner.nextLine();
                    hotel.realizarcheckin(nomehospede);
                    break;
                case 3:
                    System.out.print("Nome do Hóspede: ");
                    nomehospede = scanner.nextLine();
                    hotel.realizarcheckout(nomehospede);
                    break;
                case 4:
                    hotel.listarocupacaoquartos();
                    break;
                case 5:
                    System.out.print("Nome do Hóspede: ");
                    nomehospede = scanner.nextLine();
                    hotel.gerarhistoricoreservas(nomehospede);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}