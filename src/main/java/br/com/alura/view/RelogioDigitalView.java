package br.com.alura.view;

import javax.swing.*;
import java.awt.*;

public class RelogioDigitalView extends JFrame {
    private JLabel labelHora;

    public RelogioDigitalView() {
        setTitle("Relógio Digital");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        labelHora = new JLabel();
        labelHora.setFont(new Font("Verdana", Font.PLAIN, 40));
        labelHora.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelHora, BorderLayout.CENTER);
    }
    public void exibirHora(String horaFormatada) {
        labelHora.setText(horaFormatada);
    }
}
