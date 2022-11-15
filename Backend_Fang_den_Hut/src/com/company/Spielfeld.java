package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Spielfeld {

    LinkedList <String> ring=new LinkedList();
    LinkedList <String> connectredtoyellow=new LinkedList<>();
    LinkedList <String> connectbluetogreen=new LinkedList<>();

    public LinkedList outterRing(){
        for (int i=0;i<=51;i++){
            ring.add(""+i);
        }
        return ring;
    }
    public LinkedList<String> initializeOutterring(LinkedList <String> ring){
        ring.set(0, "infrontofredbase");
        ring.set(3, "rest");
        ring.set(10,"rest");
        ring.set(13,"infrontofgreenbase");
        ring.set(16,"rest");
        ring.set(23,"rest");
        ring.set(26,"infrontofyellowbase");
        ring.set(29,"rest");
        ring.set(36,"rest");
        ring.set(39,"infrontofbluebase");
        ring.set(42,"rest");
        ring.set(49,"rest");

        return ring;
    }
    public LinkedList connectredtoyellow(){
        for (int i=0;i<=12;i++){
            connectredtoyellow.add(""+i);
        }
        return connectredtoyellow;
    }
    public LinkedList<String> initializeredtoyellow(LinkedList<String>connectredtoyellow){
        connectredtoyellow.set(2,"rest");
        connectredtoyellow.set(10,"rest");

        return connectredtoyellow;
    }

    public LinkedList connectbluetogreen(){
        for (int i=0;i<=12;i++){
            connectbluetogreen.add(""+i);
        }
        return connectbluetogreen;
    }
    public LinkedList<String> initializebluetogreen(LinkedList<String>connectbluetogreen){
        connectbluetogreen.set(2,"rest");
        connectbluetogreen.set(10,"rest");

        return connectbluetogreen;
    }






    }


