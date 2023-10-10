package main.java.map.Ordencao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMaps;

    public AgendaEventos() {
        this.eventosMaps = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMaps.put(data, evento);
    }
    
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMaps);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMaps);
        for (Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()) {

            if(entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual) ){
                System.out.println("Próximo evento: " + entry.getValue() + "em " + entry.getKey() );
                break;
            }
            
        }

    }
    
}
