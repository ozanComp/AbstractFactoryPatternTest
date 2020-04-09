package com.ozan.abstractfactorypatterntest;

	public class Football {
		private Team team;
		private Player player;
		
	    public Football(FootballFactory factory){
	        team = factory.createTeam();
	        player = factory.createPlayer();
	    }
	
	    public String getFootballTeamColor(){
	        return team.getTeamColor();
	    }
	    
	    public String getTopScorer(){
	        return player.getTopScorer();
	    }
	}

	