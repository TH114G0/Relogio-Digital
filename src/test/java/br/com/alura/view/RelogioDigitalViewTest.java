package br.com.alura.view;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RelogioDigitalViewTest {
    private RelogioDigitalView view;

    @BeforeEach
    void setUp() {
        // Cria uma instância da visão
        view = new RelogioDigitalView();
        // Configura a janela para que os componentes possam ser manipulados
        view.setVisible(true);
    }

    @Test
    void testConstrutor() {
        // Verifica se o título da janela está correto
        assertEquals("Relógio Digital", view.getTitle());

        // Verifica se o tamanho da janela está correto
        assertEquals(new Dimension(300, 150), view.getSize());

        // Verifica se o layout é BorderLayout
        assertTrue(view.getLayout() instanceof BorderLayout);

        // Verifica se o JLabel foi adicionado corretamente
        assertTrue(view.getContentPane().getComponent(0) instanceof JLabel);
    }

    @Test
    void testExibirHora() {
        // Define uma hora formatada
        String horaFormatada = "12:34:56";

        // Chama o método para atualizar a hora
        view.exibirHora(horaFormatada);

        // Obtém o JLabel da visão
        JLabel labelHora = (JLabel) view.getContentPane().getComponent(0);

        // Verifica se o texto do JLabel foi atualizado corretamente
        assertEquals(horaFormatada, labelHora.getText());
    }
}
