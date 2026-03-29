package br.com.ucsal.olimpiadas.service;

import java.util.List;
import br.com.ucsal.olimpiadas.Prova;

public class ProvaService {

    private List<Prova> provas;

    public ProvaService(List<Prova> provas) {
        this.provas = provas;
    }

    public void cadastrar(String titulo, long id) {
        var prova = new Prova();
        prova.setId(id);
        prova.setTitulo(titulo);

        provas.add(prova);
    }
}