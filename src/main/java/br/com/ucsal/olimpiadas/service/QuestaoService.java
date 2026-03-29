package br.com.ucsal.olimpiadas.service;

import java.util.List;
import br.com.ucsal.olimpiadas.Questao;

public class QuestaoService {

    private List<Questao> questoes;

    public QuestaoService(List<Questao> questoes) {
        this.questoes = questoes;
    }

    public void cadastrar(long provaId, String enunciado, String[] alternativas, char correta, long id) {

        var q = new Questao();
        q.setId(id);
        q.setProvaId(provaId);
        q.setEnunciado(enunciado);
        q.setAlternativas(alternativas);
        q.setAlternativaCorreta(correta);

        questoes.add(q);
    }
}