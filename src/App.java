import java.time.LocalDate;
import java.time.Month;

import main.java.list.OperacoesBasicas.ListaTarefa;
import main.java.list.Ordenacao.OrdenacaoPessoa;
import main.java.list.Pesquisa.CatalogoLivros;
import main.java.set.OperacoesBasicas.ConjuntoConvidados;
import main.java.set.Ordencao.CadastroProdutos;
import main.java.set.Pesquisa.AgendaContatos;
import main.java.map.OperacoesBasicas.AgendaDeContatos;
import main.java.map.Ordencao.AgendaEventos;
import main.java.map.Pesquisa.EstoqueProdutos;


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

        //LIST - Catalogo Livro
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

        //LIST - Ordenação
        /* OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.AdicionarPessoa("Felipe", 29, 1.70);
        ordenacaoPessoa.AdicionarPessoa("Karol", 26, 1.65);
        ordenacaoPessoa.AdicionarPessoa("Pedro", 23, 1.68);
        ordenacaoPessoa.AdicionarPessoa("Marta", 16, 1.55);
        ordenacaoPessoa.AdicionarPessoa("Rafael", 26, 1.75);     
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade()); */

        //SET - CONJUNTOCONVIDADO
      /*   ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "convidados.");

        conjuntoConvidados.adicionarConvidado("Felipe",10);
        conjuntoConvidados.adicionarConvidado("Karol",30);
        conjuntoConvidados.adicionarConvidado("Pedro",14);
        conjuntoConvidados.adicionarConvidado("Maria",10);
        conjuntoConvidados.adicionarConvidado("Ligia",20);
        conjuntoConvidados.adicionarConvidado("Rafael",12);
       
        conjuntoConvidados.removerConvidadoPorCodigoConvite(10);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados.");
        conjuntoConvidados.exibirConvidados(); */

        //SET - AGENDA CONTATOS
        /* AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Felipe", 12345678);
        agendaContatos.adicionarContato("Ligia", 98881172);
        agendaContatos.adicionarContato("Ligia", 44444444);
        agendaContatos.adicionarContato("Karol", 888888888);
        agendaContatos.adicionarContato("Rafael", 77777777);
        agendaContatos.adicionarContato("Italo", 5555555);
         agendaContatos.adicionarContato("Felipe Carlos", 222222222);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Felipe"));
        System.out.println(agendaContatos.AtualizarNumeroContato("Felipe Carlos", 000000000)); */

        //SET - CADASTRO PRODUTOS
        /* CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Caneta", 2d, 20);
        cadastroProdutos.adicionarProduto(2L, "Lapis", 1d, 30);
        cadastroProdutos.adicionarProduto(3L, "Caderno", 21d, 10);
        cadastroProdutos.adicionarProduto(4L, "Borracha", 0.5d, 50);
        cadastroProdutos.adicionarProduto(5L, "Estojo", 5.5d, 10);


        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco()); */

         //MAP - AGENDA CONTATOS

     /*    AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

        agendaDeContatos.exibirContatos();
        agendaDeContatos.adicionarContato("Felipe", 12345678);
        agendaDeContatos.adicionarContato("Ligia", 98881172);
        agendaDeContatos.adicionarContato("Ligia", 44444444);
        agendaDeContatos.adicionarContato("Karol", 888888888);
        agendaDeContatos.adicionarContato("Rafael", 77777777);
        agendaDeContatos.adicionarContato("Italo", 5555555);
        agendaDeContatos.adicionarContato("Felipe Carlos", 222222222);

        agendaDeContatos.exibirContatos();
        agendaDeContatos.removerContato("Felipe");
        agendaDeContatos.exibirContatos();
        System.out.println(agendaDeContatos.pesquiserPorNome("Felipe Carlos")); */
        
      //MAP - ESTOQUE PRODUTOS

     /*    EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Caneta", 3d, 20);
        estoque.adicionarProduto(2L, "Lapis", 2d, 30);
        estoque.adicionarProduto(3L, "Caderno", 21d, 10);
        estoque.adicionarProduto(4L, "Borracha", 1d, 50);
        estoque.adicionarProduto(5L, "Estojo", 5.5d, 10);

        estoque.exibirProdutos();

        System.out.println("Produto Mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto Mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Valor Total do estoque R$" + estoque.calculeValorTotalEstoque());
        System.out.println("Produto com maior valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque()); */
        
        // MAP - AGENDA EVENTOS
      AgendaEventos agendaEventos = new AgendaEventos();
 
      agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 15), "Conferência de Tecnologia", "Palestrante renomado");
      agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
      agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
      agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
      agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
      
      agendaEventos.exibirAgenda();
      agendaEventos.obterProximoEvento();

    } 
}
