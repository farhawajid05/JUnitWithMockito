package com.learn.dao;

import java.util.List;

import com.learn.model.Team;

public interface TeamDAO {
	public List<Team> getAllTeams();
	public Team getTeamById(int id);
	public String removeTeam(int id);

}
