package br.com.alura.controller;


import br.com.alura.model.RelogioModel;
import br.com.alura.view.RelogioDigitalView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class RelogioControllerTest {

    private RelogioModel relogioModel;
    private RelogioDigitalView view;
    private RelogioController controller;

    @BeforeEach
    void setUp() {
        relogioModel = mock(RelogioModel.class);
        view = mock(RelogioDigitalView.class);
        controller = new RelogioController(relogioModel, view);
    }

    @Test
    void testConstrutor() {
        assertNotNull(controller);
    }

    @Test
    void testAtualizacaoView() {

        when(relogioModel.getHoraFormatada()).thenReturn("12:00:00");

        controller.atualizarView();

        verify(view).exibirHora("12:00:00");
    }
}
