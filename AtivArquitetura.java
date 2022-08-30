import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtivArquitetura {
    public static void main(String[] args) {
        int opcao;
        int num = 0;
        List<Tarefa> tarefas = new ArrayList<Tarefa>();
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.lineSeparator());
    
        do {
            System.out.println("---------------------------------------");
            System.out.println("Digite a opcao");
            System.out.println("--- 1 - Nova Tarefa ---");
            System.out.println("--- 2 - Completar Tarefa ---");
            System.out.println("--- 3 - Listar Tarefas ---");
            System.out.println("--- 4 - Fechar Lista de Tarefas ---");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Tarefa task = new Tarefa();
                    System.out.println("Digite a descrição da tarefa: ");
                    task.setDescription(sc.next());
                    task.setId(num+1);
                    tarefas.add(task);
                    num += 1;
                    break;
                case 2:
                    System.out.println("Digite o id da tarefa para concluir: ");
                    for(Tarefa t : tarefas) {
                        System.out.println(t.getId() + " - " + t.getDescription());
                    }
                    int taskFinished = sc.nextInt();
                    for (Tarefa t: tarefas) {
                        if (t.getId() == taskFinished) {
                            t.setDescription(t.getDescription() + " CONCLUIDO");
                        }
                    }
                    break;
                case 3:
                    for(Tarefa t : tarefas) {
                        System.out.println(t.getId() + " - " + t.getDescription());
                    }
                    break;
                case 4:
                    System.out.println("Fechando lista...");
                    sc.next();
                    sc.close();
                    break;
                default:
                    System.out.println("Comando não reconhecido");
                    break;
            }
        } while (opcao != 4);

    }
}
