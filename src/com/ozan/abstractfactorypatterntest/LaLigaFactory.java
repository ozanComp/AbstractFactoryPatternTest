package com.ozan.abstractfactorypatterntest;

public class LaLigaFactory implements FootballFactory{
	public Team createTeam(){
        return new RealMadrid();
    }

    public Player createPlayer(){
        return new LaLigaPlayer();
    }
}
