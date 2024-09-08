package br.com.alura.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogioModel {
    private LocalTime horaAtual;
    private DateTimeFormatter formatador;

    public RelogioModel() {
        formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
        atualizarHora();
    }

    public void atualizarHora() {
        this.horaAtual = LocalTime.now();
    }
    public String getHoraFormatada() {
        return horaAtual.format(formatador);
    }
    public LocalTime getHoraAtual() {
        return horaAtual;
    }

    public void setHoraAtual(LocalTime horaAtual) {
        this.horaAtual = horaAtual;
    }
}
