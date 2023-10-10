package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaDeContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }
    
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquiserPorNome(String nome){
        Integer numeroPorNome =null;
          if(!agendaContatoMap.isEmpty()){
            numeroPorNome= agendaContatoMap.get(nome);
            
        }
        return numeroPorNome;
    } 
}
