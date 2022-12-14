package br.com.dio.controller;

import br.com.dio.model.Evento;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class EventoBean implements Serializable {

    private static final long serialVersionUID = 1l;

    @Inject
    private Evento evento;

    private List<Evento> eventos = new ArrayList<Evento>();

    public String adicionarEvento(){
        eventos.add(evento);
        System.out.println("Evento " + evento.getNome() + " cadastrado com sucesso!");
        clean();
        return "";
    }

    public void clean(){
        this.evento = new Evento();
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
}
