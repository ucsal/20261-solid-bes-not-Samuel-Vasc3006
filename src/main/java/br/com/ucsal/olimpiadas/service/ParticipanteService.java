package br.com.ucsal.olimpiadas.service;

import java.util.List;
import br.com.ucsal.olimpiadas.Participante;

public class ParticipanteService {

    private List<Participante> participantes;

    public ParticipanteService(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public void cadastrar(String nome, String email, long id) {
        var p = new Participante();
        p.setId(id);
        p.setNome(nome);
        p.setEmail(email);

        participantes.add(p);
    }
}