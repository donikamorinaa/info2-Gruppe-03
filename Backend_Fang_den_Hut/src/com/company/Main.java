package com.company;

import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        //outter Ring test
        Spielfeld spiel=new Spielfeld();
        LinkedList outterring;
        LinkedList redtoyellow;
        LinkedList bluetogreen;

        outterring=spiel.outterRing();
        System.out.println("outterring before initialize\n"+outterring);
        outterring=spiel.initializeOutterring(outterring);
        System.out.println("outterring after initialize\n"+outterring);
        System.out.println("\n");
        //connect redtoyellow
        redtoyellow=spiel.connectredtoyellow();
        System.out.println("redtoyellow before initialize\n"+redtoyellow);
        bluetogreen=spiel.connectbluetogreen();
        System.out.println("bluetogreen before initialize:\n"+bluetogreen);
        System.out.println("\n");
        redtoyellow=spiel.initializeredtoyellow(redtoyellow);
        System.out.println("redtoyellow after initialize\n"+redtoyellow);
        bluetogreen=spiel.initializebluetogreen(bluetogreen);
        System.out.println("greentoblue after initialize\n"+bluetogreen);
        System.out.println("\n");



        //Farbe rot
        Gamechar charonered=new Gamechar(0,"red");
        Gamechar chartwored=new Gamechar(0,"red");
        Gamechar charthreered=new Gamechar(0,"red");
        Gamechar charfourred=new Gamechar(0,"red");

        //TEAM RED
        Team teamred=new Team(charonered,chartwored,charthreered,charfourred,0,"red");
        System.out.println(teamred);
        int wuerfel=teamred.wuerfeln();
        System.out.println("Team rot hat eine "+wuerfel+"gewuerfelt");
        System.out.println("\n");
        //test auf dem aeußeren Ring bewegen
        Game game=new Game();
        game.redmovesstraight(teamred.char1,wuerfel,redtoyellow,bluetogreen,outterring);
        System.out.println("retdoyellow after red moves "+redtoyellow);
        System.out.println("\n");
        wuerfel= teamred.wuerfeln();
        System.out.println("Team rot hat eine "+wuerfel+"gewuerfelt");
        System.out.println("\n");
        game.redmovesstraight(teamred.char1,wuerfel,redtoyellow,bluetogreen,outterring);;
        System.out.println("\n");
        System.out.println("redtoyellow after red moves "+redtoyellow);



        //Farbe blue
        Gamechar charoneblue=new Gamechar(0,"blue");
        Gamechar chartwoblue=new Gamechar(0,"blue");
        Gamechar charthreeblue=new Gamechar(0,"blue");
        Gamechar charfourblue=new Gamechar(0,"blue");

        //TEam blue
        Team teamblue=new Team(charoneblue,chartwoblue,charthreeblue,charfourblue,0,"blue");
        wuerfel= teamblue.wuerfeln();
        System.out.println("Team Blue hat eine "+wuerfel+"gewuerfelt");
        System.out.println("\n");
        game.bluemoveright(teamblue.char1,wuerfel,outterring);
        System.out.println("\n");
        System.out.println("outterring after blue moves "+outterring);
        //Farbe green
        Gamechar charonegreen=new Gamechar(0,"green");
        Gamechar chartwogreen=new Gamechar(0,"green");
        Gamechar charthreegreen=new Gamechar(0,"green");
        Gamechar charfourgreen=new Gamechar(0,"green");



        //TEam green
        Team teamgreen= new Team(charonegreen,chartwogreen,charthreegreen,charfourgreen,0,"green");

        wuerfel= teamgreen.wuerfeln();
        System.out.println("Team Green hat eine "+wuerfel+"gewuerfelt");
        //Farbe gelb
        Gamechar charoneyellow=new Gamechar(0,"yellow");
        Gamechar chartwoyellow=new Gamechar(0,"yellow");
        Gamechar charthreeyellow=new Gamechar(0,"yellow");
        Gamechar charfouryellow=new Gamechar(0,"yellow");

        //Team Yellow
        Team teamyellow= new Team(charoneyellow,chartwoyellow,charthreeyellow,charfouryellow,0,"yellow");
        wuerfel= teamyellow.wuerfeln();
        System.out.println("Team Yellow hat eine "+wuerfel+"gewuerfelt");










    }
}
