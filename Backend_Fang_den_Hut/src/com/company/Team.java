package com.company;

import java.util.Random;

public class Team extends Gamechar {
    Gamechar char1;
    Gamechar char2;
    Gamechar char3;
    Gamechar char4;



    public Team(Gamechar char1, Gamechar char2, Gamechar char3, Gamechar char4, int id, String color) {
        super(id,color);

        this.char1=char1;
        this.char2=char2;
        this.char3=char3;
        this.char4=char4;
    }
    //generiert random zahl zwischen >=0 und <7
    public int wuerfeln(){
        Random rand=new Random();
        int wuerfelzahl= rand.nextInt(6);
        //Da es keine null geben soll
        return wuerfelzahl+1;
    }

    @Override
    public String toString() {
        return "Team{" +
                "char1=" + char1 +
                ", char2=" + char2 +
                ", char3=" + char3 +
                ", char4=" + char4 +
                '}';
    }
}
