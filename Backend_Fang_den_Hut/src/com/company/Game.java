package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Game {

    public void redmoveleft(Gamechar gamechar, int wuerfel, LinkedList<String> outterring) {
        //Red moves in outter Ring left
        //es wird geprueft ob sich die erste Figur noch in der basis befindet
        //Wenn sie das tut läuft sie von dort los
        //0 tes feld des rings wird mit 1 erreicht
        if (gamechar.color == "red" && gamechar.id == 0) {
            String s = outterring.get(53 - wuerfel);
            outterring.set(53 - wuerfel, "charred" + s);
            gamechar.id = 53 - wuerfel;

        }
        //Figur befindet sich nicht mehr in der Basis
        //Läuft von aktueller position weiter
        else {
            if (gamechar.color == "red" && gamechar.id != 0) {
                String t = outterring.get(gamechar.id);
                if (t.contains("rest")) {
                    outterring.set(gamechar.id, "rest");
                } else {
                    if (t.contains("infrontofredbase")) {
                        outterring.set(gamechar.id, "infrontofredbase");
                    } else {
                        outterring.set(gamechar.id, "" + gamechar.id);
                        String u = outterring.get(gamechar.id - wuerfel);
                        outterring.set(gamechar.id - wuerfel, "charred" + u);
                        gamechar.id = gamechar.id - wuerfel;
                    }
                }

            }
            //es wird der extremfall abgefangen index out of linked list
            if (gamechar.id - wuerfel < 0) {
                //hilfsvariable speichert den wert wo die figur stehen soll
                //hilfsvariable wird dann benutzt um den hut am gewünschten fel zu platzieren
                int hilf = (gamechar.id - wuerfel);
                outterring.set(51 + hilf, "charred");
                gamechar.id = 51 + hilf;
            } else {
                outterring.set(gamechar.id - wuerfel, "charred");
                gamechar.id = gamechar.id - wuerfel;
            }
        }


    }

    public void greenmoveleft(Gamechar gamechar, int wuerfel, LinkedList<String> outterring) {
        //green moves in outter Ring left
        //es wird geprueft ob sich die erste Figur noch in der basis befindet
        //Wenn sie das tut läuft sie von dort los
        if (gamechar.color == "green" && gamechar.id == 0) {
            String s = outterring.get(15 - wuerfel);
            outterring.set(15 - wuerfel, "chargreen" + s);
            gamechar.id = 15 - wuerfel;
        }
        //Figur befindet sich nicht mehr in der Basis
        //Läuft von aktueller position weiter
        else {
            if (gamechar.color == "green" && gamechar.id != 0) {
                String t = outterring.get(gamechar.id);
                if (t.contains("rest")) {
                    outterring.set(gamechar.id, "rest");
                } else {
                    if (t.contains("infrontofgreenbase")) {
                        outterring.set(gamechar.id, "infrontofgreenbase");
                    } else {
                        outterring.set(gamechar.id, "" + gamechar.id);
                        String u = outterring.get(gamechar.id - wuerfel);
                        outterring.set(gamechar.id - wuerfel, "chargreen" + u);
                        gamechar.id = gamechar.id - wuerfel;
                    }
                }
            }
            //es wird der extremfall abgefangen index out of linked list
            if (gamechar.id - wuerfel < 0) {
                //hilfsvariable speichert den wert wo die figur stehen soll
                //hilfsvariable wird dann benutzt um den hut am gewünschten fel zu platzieren
                int hilf = (gamechar.id - wuerfel);
                outterring.set(51 + hilf, "chargreen");
                gamechar.id = 51 + hilf;
            } else {
                outterring.set(gamechar.id - wuerfel, "chargreen");
                gamechar.id = gamechar.id - wuerfel;
            }
        }

    }

    public void yellowmoveleft(Gamechar gamechar, int wuerfel, LinkedList<String> outterring) {
        //yellow moves in outter Ring left
        //es wird geprueft ob sich die erste Figur noch in der basis befindet
        //Wenn sie das tut läuft sie von dort los
        if (gamechar.color == "yellow" && gamechar.id == 0) {
            String s = outterring.get(27 - wuerfel);
            outterring.set(27 - wuerfel, "charyellow" + s);
            gamechar.id = 27 - wuerfel;
        }
        //Figur befindet sich nicht mehr in der Basis
        //Läuft von aktueller position weiter
        else {
            if (gamechar.color == "yellow" && gamechar.id != 0) {
                //aktuellen stand zwischenspeichern
                String t = outterring.get(gamechar.id);
                //Ruhebank
                if (t.contains("rest")) {
                    outterring.set(gamechar.id, "rest");
                } else {
                    if (t.contains("infrontofyellowbase")) {
                        outterring.set(gamechar.id, "infrontofyellowbase");
                    } else {
                        outterring.set(gamechar.id, "" + gamechar.id);
                        String u = outterring.get(gamechar.id - wuerfel);
                        outterring.set(gamechar.id - wuerfel, "charyellow" + u);
                        gamechar.id = gamechar.id - wuerfel;
                    }
                }


            }
            //es wird der extremfall abgefangen index out of linked list
            if (gamechar.id - wuerfel < 0) {
                //hilfsvariable speichert den wert wo die figur stehen soll
                //hilfsvariable wird dann benutzt um den hut am gewünschten fel zu platzieren
                int hilf = (gamechar.id - wuerfel);
                outterring.set(51 + hilf, "charyellow");
                gamechar.id = 51 + hilf;
            } else {
                outterring.set(gamechar.id - wuerfel, "charyellow");
                gamechar.id = gamechar.id - wuerfel;
            }
        }
    }


    public void bluemovesleft(Gamechar gamechar, int wuerfel, LinkedList<String> outterring) {
        //blue moves in outter Ring left
        //es wird geprueft ob sich die erste Figur noch in der basis befindet
        //Wenn sie das tut läuft sie von dort los
        if (gamechar.color == "blue" && gamechar.id == 0) {
            String s = outterring.get(40 - wuerfel);
            outterring.set(40 - wuerfel, "charblue" + s);
            gamechar.id = 40 - wuerfel;
        }
        //Figur befindet sich nicht mehr in der Basis
        //Läuft von aktueller position weiter
        else {
            if (gamechar.color == "blue" && gamechar.id != 0) {

                String t = outterring.get(gamechar.id);
                if (t.contains("rest")) {
                    outterring.set(gamechar.id, "rest");
                } else {
                    if (t.contains("infrontofbluebase")) {
                        outterring.set(gamechar.id, "infrontofbluebase");
                    } else {
                        outterring.set(gamechar.id, "" + gamechar.id);
                        String u = outterring.get(gamechar.id - wuerfel);
                        outterring.set(gamechar.id - wuerfel, "charblue" + u);
                        gamechar.id = gamechar.id - wuerfel;
                    }
                }


            }

            //es wird der extremfall abgefangen index out of linked list
            if (gamechar.id - wuerfel < 0) {
                //hilfsvariable speichert den wert wo die figur stehen soll
                //hilfsvariable wird dann benutzt um den hut am gewünschten fel zu platzieren
                int hilf = (gamechar.id - wuerfel);
                outterring.set(51 + hilf, "charblue");
                gamechar.id = 51 + hilf;
            } else {
                outterring.set(gamechar.id - wuerfel, "charblue");
                gamechar.id = gamechar.id - wuerfel;
            }
        }
    }


//nach rechts auf dem außeren ring bewegen


    public void redmoveright(Gamechar gamechar, int wuerfel, LinkedList<String> outterring) {
        //Red moves in outter Ring right
        //Wenn id 0 hut befindet sich in basis kann von seiner basis aus loslaufen
        if (gamechar.color == "red" && gamechar.id == 0) {
            String s = outterring.get(-1 + wuerfel);
            outterring.set(-1 + wuerfel, s + "charred");
            gamechar.id = 0 + wuerfel;
        } else {
            //Wenn id nicht null hut befindet sich bereits auf Spielfeld
            if (gamechar.color == "red" && gamechar.id != 0) {
                outterring.set(gamechar.id, "" + gamechar.id);
            }
            //Ueberlauf abfangen
            if (gamechar.id + wuerfel > 51) {
                int hilf = (gamechar.id + wuerfel) - 51;
                outterring.set(hilf - 1, "charred");
                gamechar.id = hilf - 1;
            } else {
                outterring.set(gamechar.id + wuerfel, "charred");
                gamechar.id = gamechar.id + wuerfel;
            }
        }


    }

    public void greenmoveright(Gamechar gamechar, int wuerfel, LinkedList<String> outterring) {
        //Green moves in outter Ring righgt
        //Wenn id 0 hut befindet sich in basis kann von seiner basis aus loslaufen
        if (gamechar.color == "green" && gamechar.id == 0) {
            outterring.set(12 + wuerfel, "charred");
            gamechar.id = 12 + wuerfel;
        } else {
            //Wenn id nicht null hut befindet sich bereits auf Spielfeld
            if (gamechar.color == "green" && gamechar.id != 0) {
                outterring.set(gamechar.id, "" + gamechar.id);
            }
            //Ueberlauf abfangen
            if (gamechar.id + wuerfel > 51) {
                int hilf = (gamechar.id + wuerfel) - 51;
                outterring.set(hilf - 1, "chargreen");
                gamechar.id = hilf - 1;
            } else {
                outterring.set(gamechar.id + wuerfel, "chargreen");
                gamechar.id = gamechar.id + wuerfel;
            }
        }
    }

    public void yellowmoveright(Gamechar gamechar, int wuerfel, LinkedList<String> outterring) {
        //Yellow moves in outter Ring righgt
        //Wenn id 0 hut befindet sich in basis kann von seiner basis aus loslaufen
        if (gamechar.color == "yellow" && gamechar.id == 0) {
            outterring.set(25 + wuerfel, "charyellow");
            gamechar.id = 25 + wuerfel;
        } else {
            //Wenn id nicht null hut befindet sich bereits auf Spielfeld
            if (gamechar.color == "yellow" && gamechar.id != 0) {
                outterring.set(gamechar.id, "" + gamechar.id);
            }
            //Ueberlauf abfangen
            if (gamechar.id + wuerfel > 51) {
                int hilf = (gamechar.id + wuerfel) - 51;
                outterring.set(hilf - 1, "charyellow");
                gamechar.id = hilf - 1;
            } else {
                outterring.set(gamechar.id + wuerfel, "charyellow");
                gamechar.id = gamechar.id + wuerfel;
            }
        }
    }

    public void bluemoveright(Gamechar gamechar, int wuerfel, LinkedList<String> outterring) {
        //blue moves in outter Ring righgt
        //Wenn id 0 hut befindet sich in basis kann von seiner basis aus loslaufen
        if (gamechar.color == "blue" && gamechar.id == 0) {
            outterring.set(38 + wuerfel, "charblue");
            gamechar.id = 38 + wuerfel;
        } else {
            //Wenn id nicht null hut befindet sich bereits auf Spielfeld
            if (gamechar.color == "blue" && gamechar.id != 0) {
                outterring.set(gamechar.id, "" + gamechar.id);
            }
            //Ueberlauf abfangen
            if (gamechar.id + wuerfel > 51) {
                int hilf = (gamechar.id + wuerfel) - 51;
                outterring.set(hilf - 1, "charblue");
                gamechar.id = hilf - 1;
            } else {
                outterring.set(gamechar.id + wuerfel, "charblue");
                gamechar.id = gamechar.id + wuerfel;
            }
        }
    }

    public void redmovesstraight(Gamechar gamechar, int wuerfel, LinkedList<String> redtoyellow, LinkedList<String> bluetogreen,LinkedList<String>outterring) throws IOException {
        //Wenn Spielfigur noch in Basis
        if (gamechar.id == 0 && gamechar.color == "red" && wuerfel > 1) {
            String s = redtoyellow.get(-2 + wuerfel);
            redtoyellow.set(-2 + wuerfel, "charred" + s);
            gamechar.id = -2 + wuerfel;

        } else {
            //Wenn sich char nicht mehr in der Basis befindet
        }
        if (gamechar.color == "red" && gamechar.id != 0) {
            String t = redtoyellow.get(gamechar.id);
            if (t.contains("rest")) {
                redtoyellow.set(gamechar.id, "rest");
            } else {
                redtoyellow.set(gamechar.id, "" + gamechar.id);
                String u = redtoyellow.get(gamechar.id + wuerfel);
                redtoyellow.set(gamechar.id +wuerfel, "charred" + u);
                gamechar.id = gamechar.id +wuerfel;

            }
                    //Überlauf bedeutet entweder nach links in den äußerenring oder nach rechts
                 if (gamechar.id + wuerfel > 12) {
                    int hilf = gamechar.id+wuerfel-12;
                     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                     System.out.println("In welche Richtung wollen Sie gehen?: ");
                     String str = br.readLine();
                    if(str=="r"){
                        gamechar.id =26;
                        redmoveleft(gamechar,hilf,outterring);
                    }
                    else
                    {
                        if(str=="l"){
                            gamechar.id=28;
                            redmoveleft(gamechar,hilf,outterring);
                        }
                        else{
                            throw new IOException("falsche Eingabe");
                        }
                    }

                } else {
                     if (gamechar.id + wuerfel > 6) {
                         int hilf = gamechar.id+wuerfel-6;
                         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                         System.out.println("In welche Richtung wollen Sie gehen?: ");
                         String str = br.readLine();
                         //rechts kommt in die liste bluetogreen
                         if(str=="r"){
                             gamechar.id =6;
                             ;
                         }
                         else
                         {
                             //blue to green
                             if(str=="l"){
                                 gamechar.id=6;
                                 redmoveleft(gamechar,hilf,outterring);
                             }
                             else{
                                 //geradeaus weiter
                                 if(str=="s"){
                                     redmovesstraight(gamechar,hilf,redtoyellow,bluetogreen,outterring);
                                 }
                                 else{
                                     //weder l r noch s eingegeben
                                     throw new IOException("falsche Eingabe");
                                 }
                             }

                             }
                         }
                     //kommt an keine Kreuzung und lauft einfach geradeaus weiter
                         outterring.set(gamechar.id + wuerfel, "charred");
                         gamechar.id = gamechar.id + wuerfel;
                      }


        }

    }
}
