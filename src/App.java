import main.java.list.OperacoesBasicas.ListaTarefa;
import main.java.list.Ordenacao.OrdenacaoPessoa;
import main.java.list.Pesquisa.CatalogoLivros;

public class App {
    public static void main(String[] args) throws Exception {

        //Class ListaTarefa
   /*   ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.addicionarTarefa("Tarefa 1");
        listaTarefa.addicionarTarefa("Tarefa 2");
        listaTarefa.addicionarTarefa("Tarefa 3");
        listaTarefa.addicionarTarefa("Tarefa 3");
        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas(); */

        //Class CatalogoLivro
       /*  CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Java", "Felipe", 2015);
        catalogoLivros.adicionarLivro("Angula JS", "Pedro", 2020);
        catalogoLivros.adicionarLivro("Nodes JS", "Pedro", 2023);
        catalogoLivros.adicionarLivro("Programando com C#", "Maria", 2017);

        
   
        System.out.println(catalogoLivros.pesquisarPorAutor("Pedro"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Carlos"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2015, 2023));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2014));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Angula JS"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("CSS e HTML")); */

        //Ordenação
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.AdicionarPessoa("Felipe", 29, 1.70);
        ordenacaoPessoa.AdicionarPessoa("Karol", 26, 1.65);
        ordenacaoPessoa.AdicionarPessoa("Pedro", 23, 1.68);
        ordenacaoPessoa.AdicionarPessoa("Marta", 16, 1.55);
        ordenacaoPessoa.AdicionarPessoa("Rafael", 26, 1.75);

       
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

    }

}
