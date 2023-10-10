package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    } 

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    
    public Contato pesquisarPorNomeCompleto(String nome){
        Contato contatoPorNome = null;

        for (Contato contato : contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contatoPorNome = contato;
            }
        }
        return contatoPorNome;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPornome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if(contato.getNome().startsWith(nome)){
                contatosPornome.add(contato);
            }
        }
        return contatosPornome;
    }

    public Contato AtualizarNumeroContato( String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            } 
        }
        return contatoAtualizado;
    }
}
