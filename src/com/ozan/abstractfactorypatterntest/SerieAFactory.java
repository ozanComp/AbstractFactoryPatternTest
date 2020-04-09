package com.ozan.abstractfactorypatterntest;

public class SerieAFactory implements FootballFactory{
	public Team createTeam(){
        return new Juventus();
    }

    public Player createPlayer(){
        return new SerieAPlayer();
    }
}

