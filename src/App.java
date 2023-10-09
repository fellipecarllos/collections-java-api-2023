import main.java.list.OperacoesBasicas.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.addicionarTarefa("Tarefa 1");
        listaTarefa.addicionarTarefa("Tarefa 2");
        listaTarefa.addicionarTarefa("Tarefa 3");
        listaTarefa.addicionarTarefa("Tarefa 3");
        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }

    
}
