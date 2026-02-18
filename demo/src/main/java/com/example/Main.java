package com.example;    

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                Scanner teclat = new Scanner(System.in);

                // Crear l'ArrayList de preguntes
                ArrayList<Pregunta> preguntes = inicialitzarPreguntes();

                // Crear el test passant l'ArrayList
                Test test = new Test(preguntes);

                boolean finalitzat = false;

                while (!finalitzat) {
                        int preguntaActualNum = test.getNumeroPregunta();
                        if (preguntaActualNum >= preguntes.size()) {
                            System.out.println("Ja has respost totes les preguntes. Prem 4 per finalitzar el test.");
                        } else {
                        
                            System.out.println(preguntaActualNum + " " + preguntes.get(preguntaActualNum).getEnunciat());
                            System.out.println("Tria una opcio: (1)Endarrera - (2) Endavant - (3) Respondre - (4) Finalitzar");
                        }
                        int eleccioUser = teclat.nextInt();
                        switch (eleccioUser) {
                            case 1:
                                test.anarEndarrera();
                                break;
                            case 2:
                                test.anarEndavant();
                                break;
                            case 3:
                                if (preguntaActualNum < preguntes.size()) {
                                    System.out.println("Quina es la teva resposta?");
                                    System.out.println(preguntes.get(preguntaActualNum));
                                    int respostaUser = teclat.nextInt();
                                    test.respondre(respostaUser);
                                } else {
                                    System.out.println("No hi ha més preguntes per respondre.");
                                }
                                break;
                            case 4:
                                finalitzat = true;
                                break;
                            default:
                                throw new AssertionError();
                        }

                }
                System.out.println(test.solucionarTest());

                //
                // Mentre l'usuari no tria Finalitzar , es pot anar endavant, endarrera,
                // respondre
                // Quan finalitza el test es mostra la seva puntució
        }

        public static ArrayList<Pregunta> inicialitzarPreguntes() {
                ArrayList<Pregunta> preguntes = new ArrayList<>();

                preguntes.add(new Pregunta("Qui va pintar el Guernica",
                                new String[] { "Velàzquez", "Goya", "Picasso" }, 2));
                preguntes.add(new Pregunta("Qui va escriure Alicia al país de les meravelles",
                                new String[] { "Grimm", "Stevenson", "Carrol" }, 2));
                preguntes.add(new Pregunta("Quina és la magnitud que relaciona espai i temps",
                                new String[] { "velocitat", "temperatura", "pes" }, 0));
                preguntes.add(new Pregunta("Si el radi d'una circumferència és 4, el seu diàmetre és",
                                new String[] { "4", "8", "12", "14" }, 1));
                preguntes.add(new Pregunta("Quants segons té 1 hora",
                                new String[] { "420", "760", "3600" }, 2));
                preguntes.add(new Pregunta("Quin no és un llenguatge de programació",
                                new String[] { "java", "php", "samsung" }, 2));
                preguntes.add(new Pregunta("Dins un termòmetre hi trobem",
                                new String[] { "aigua", "aigua amb gas", "mercuri" }, 2));
                preguntes.add(new Pregunta("L'Acropolis es troba a",
                                new String[] { "Atenes", "Roma", "París" }, 0));
                preguntes.add(new Pregunta("L'element químic amb símbol Fe és ",
                                new String[] { "Estronci", "Ferro", "Feril·li" }, 1));
                preguntes.add(new Pregunta("La capital d'Estats Units és",
                                new String[] { "Georgetown", "New York", "Washington" }, 2));

                return preguntes;
        }
        
        // Altres mètodes que consideris necessaris...
}


