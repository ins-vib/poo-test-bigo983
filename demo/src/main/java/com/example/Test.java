package com.example;

import java.util.ArrayList;

public class Test {
    ArrayList<Pregunta> preguntes;
    int respostesContestades[];
    int posActual;

    public Test(ArrayList<Pregunta> preguntes) {
        this.preguntes = preguntes;
        this.posActual = 0;
        this.respostesContestades = new int[preguntes.size()];
    }

    public String getEnunciatPreguntaActual() {
        Pregunta preguntaActual = preguntes.get(posActual);
        return preguntaActual.getEnunciat();
    }

    public String[] getRespostesPreguntaActual() {
        Pregunta preguntaActual = preguntes.get(posActual);
        return preguntaActual.getRespostes();
    }

    public int getNumeroPregunta() {
        return posActual;
    }

    public void respondre(int resposta) {
        respostesContestades[posActual] = resposta - 1;
        posActual++;
    }

    public boolean anarEndavant() {
        if (posActual == preguntes.size() - 1)
            return false;
        posActual++;
        return true;
    }

    public boolean anarEndarrera() {
        if (posActual == 0)
            return false;
        posActual--;
        return true;

    }

    public double solucionarTest() {
        int respostesCorrectes = 0;
        for (int i = 0; i < preguntes.size(); i++) {
            Pregunta preguntaComparar = preguntes.get(i);
            if (preguntaComparar.getCorrecta() == respostesContestades[i])
                respostesCorrectes++;
        }
        double valorPerPregunta = 10.0 / preguntes.size();
        return valorPerPregunta * respostesCorrectes;
    }
}
