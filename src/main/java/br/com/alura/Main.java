package br.com.alura;

import br.com.alura.controller.RelogioController;
import br.com.alura.model.RelogioModel;
import br.com.alura.view.RelogioDigitalView;

public class Main {
    public static void main(String[] args) {
        RelogioModel relogio = new RelogioModel();
        RelogioDigitalView view = new RelogioDigitalView();
        RelogioController controller = new RelogioController(relogio, view);

        view.setVisible(true);
    }
}