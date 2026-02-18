package com.example;

public class Pregunta {
    private String enunciat;
    private String[] respostes;
    private int correcta;

    public Pregunta( String enunciat, String[] respostes,int correcta) {
        this.correcta = correcta;
        this.enunciat = enunciat;
        this.respostes = respostes;
    }

    public String getEnunciat() {
        return enunciat;
    }
    
    public void setEnunciat(String enunciat) {
        this.enunciat = enunciat;
    }

    public String[] getRespostes() {
        return respostes;
    }

    public void setRespostes(String[] respostes) {
        this.respostes = respostes;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }

    @Override
    public String toString() {
        String resultado = enunciat + "\n";
        for (int i = 0; i < respostes.length; i++) {
            resultado += (i + 1) + ". " + respostes[i] + "\n";
        }
        return resultado;
    }
    
    
}
