package hospital;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public  class GestaoHospital extends Paciente{
    
    private Queue<Paciente> filaNormal;
    private Queue<Paciente> filaLeve;
    private Queue<Paciente> filaModerado;
    private Queue<Paciente> filaSevero;

    public GestaoHospital(){

        filaNormal = new LinkedList<>(); 
        filaLeve = new LinkedList<>();
        filaModerado = new LinkedList<>();
        filaSevero = new LinkedList<>();
    }

 
    public void AdicionarPaciente(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            System.out.println("Selecione a prioridade do paciente:");
            System.out.println("0 - Normal");
            System.out.println("1 - Leve");
            System.out.println("2 - Moderado");
            System.out.println("3 - Severo");

            int prioridade = scanner.nextInt();

            Paciente paciente = new Paciente(nome, cpf, prioridade);
      
            switch (prioridade) {
                case 0:
                    filaNormal.offer(paciente);
                    break;
                case 1:
                    filaLeve.offer(paciente);
                    break;
                case 2:
                    filaModerado.offer(paciente);
                    break;
                case 3:
                    filaSevero.offer(paciente);
                    break;
                default:
                    System.out.println("Prioridade inválida!");
            }
            System.out.println("Paciente adicionado!");
        }
           
             public void AtenderProximoPaciente() {
            if (!filaSevero.isEmpty()) {
                return proximoPaciente(filaSevero.poll());
            } else if (!filaModerado.isEmpty()) {
                return proximoPaciente(filaModerado.poll());
            } else if (!filaLeve.isEmpty()) {
                return proximoPaciente(filaLeve.poll());
            } else if (!filaNormal.isEmpty()) {
                return proximoPaciente(filaNormal.poll());
            } else {
                System.out.println("Não há pacientes na fila.");
            }
        }

        private void proximoPaciente(String paciente) {
            System.out.println("Atendendo paciente: " + paciente.getNome());
            System.out.println("CPF: " + paciente.getCpf());
            System.out.println("Prioridade: " + paciente.getPrioridade());
            System.out.println();
        }
    
        public int getNumeroPacientesNaFila() {
            return filaNormal.size() + filaLeve.size() + filaModerado.size() + filaSevero.size();
        }
    }


    public void atenderProximoPaciente() {
    }


    public int getNumeroPacientesNaFila() {
        return 0;
    }
}

