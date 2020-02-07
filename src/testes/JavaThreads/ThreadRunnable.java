package testes.JavaThreads;

import javafx.scene.input.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.applet.*;
import java.text.*;

public class ThreadRunnable extends Applet implements Runnable {
    DateFormat formatador;
    String dataFinal;
    Date dataAtual;
    Color corDoNumero;
    Font fonteDoNumero;
    Locale locale;
    private volatile Thread relogio = null;

    public void init() {
        setBackground(Color.white);
        corDoNumero = Color.red;
        locale = Locale.getDefault();
        formatador = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, locale);
        dataAtual = new Date();
        dataFinal = formatador.format(dataAtual);
        fonteDoNumero = new Font("Sans-Serif", Font.PLAIN, 14);
        resize(275, 25);
    }

    public void start() {
        if (relogio == null) {
            relogio = new Thread(this, "Relógio");
            relogio.start();
        }
    }

    public void run() {
        Thread thread = Thread.currentThread();
        while (relogio == thread) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void paint(Graphics g) {
        String diaDeHoje;
        dataAtual = new Date();
        formatador = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, locale);
        diaDeHoje = formatador.format(dataAtual);
        g.setFont(fonteDoNumero);

        //Re-desenhar
        g.setColor(getBackground());
        g.drawString(dataFinal, 0, 12);
        g.setColor(corDoNumero);
        g.drawString(diaDeHoje, 0, 12);
        dataFinal = diaDeHoje;
        dataAtual = null;

    }

    public void stop(){
        relogio = null;
    }
}
