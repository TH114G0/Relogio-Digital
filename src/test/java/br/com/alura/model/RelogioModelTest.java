package br.com.alura.model;

import br.com.alura.controller.RelogioController;
import br.com.alura.view.RelogioDigitalView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RelogioModelTest {
    private RelogioModel relogioModel;
    @BeforeEach
    void setUp() {
        relogioModel = new RelogioModel();
    }

    @Test
    void testConstrutor() {
        assertNotNull(relogioModel);
        assertNotNull(relogioModel.getHoraAtual());
    }

    @Test
    void testGetHoraFormatada() {
        // Atualiza a hora
        relogioModel.atualizarHora();

        // Obtém a hora formatada
        String horaFormatada = relogioModel.getHoraFormatada();

        // Verifica se a hora formatada está no formato correto
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime horaAtual = relogioModel.getHoraAtual();

        assertEquals(horaAtual.format(formatter), horaFormatada);
    }

    @Test
    void testSetHoraAtual() {

        LocalTime horaEspecifica = LocalTime.of(10, 30, 45);
        relogioModel.setHoraAtual(horaEspecifica);

        LocalTime horaAtual = relogioModel.getHoraAtual();

        assertEquals(horaEspecifica, horaAtual);
    }
}
