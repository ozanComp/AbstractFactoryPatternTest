package com.ozan.abstractfactorypatterntest;

	public class Main {
		public static void main(String[] args) {
			try{
	            FootballFactory spain = new LaLigaFactory();
	            FootballFactory italy = new SerieAFactory();
	
	            Football football = new Football(spain);
	            
	            System.out.println(football.getFootballTeamColor());
	            System.out.println(football.getTopScorer());
	
	            football = new Football(italy);
	            System.out.println(football.getFootballTeamColor());
	            System.out.println(football.getTopScorer());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	