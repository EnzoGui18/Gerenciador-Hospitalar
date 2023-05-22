package hospital;
import java.lang.String;
import java.util.Scanner;


public class Gerenciador {
    public static void main(String[] args) {
        GestaoHospital gestaoHospital = new GestaoHospital();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Adicionar paciente à fila");
                System.out.println("2 - Atender próximo paciente");
                System.out.println("3 - Exibir número de pacientes na fila");
                System.out.println("0 - Sair");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        gestaoHospital.AdicionarPaciente();
                        break;
                    case 2:
                        gestaoHospital.atenderProximoPaciente();
                        break;
                    case 3:
                        int numeroPacientes = gestaoHospital.getNumeroPacientesNaFila();
                        System.out.println("Número de pacientes na fila: " + numeroPacientes);
                        System.out.println();
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        return;
                    default:
                        System.out.println("Opção inválida!");
                        System.out.println();
                }
            }
        }
    }
}

