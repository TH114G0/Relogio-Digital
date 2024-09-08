package br.com.alura.controller;

import br.com.alura.model.RelogioModel;
import br.com.alura.view.RelogioDigitalView;


import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RelogioController {
    private RelogioModel relogio;
    private RelogioDigitalView view;
    public RelogioController(RelogioModel relogio, RelogioDigitalView view) {
        this.relogio = relogio;
        this.view = view;

        iniciarAtualizacao();
    }
    private void iniciarAtualizacao() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarView();
            }
        });
        timer.start();
    }

    private void atualizarView() {
        relogio.atualizarHora();
        view.exibirHora(relogio.getHoraFormatada());
    }
}
