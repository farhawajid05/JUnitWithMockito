package com.learn.model;

public class Team {
	private int teamId;
	private String teamName;
	private int noOfPlayers;
	public Team() {
		super();
	}
	public Team(int teamId, String teamName, int noOfPlayers) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.noOfPlayers = noOfPlayers;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", noOfPlayers=" + noOfPlayers + "]";
	}
	

}
