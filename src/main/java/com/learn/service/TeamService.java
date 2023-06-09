package com.learn.service;

import java.util.List;

import com.learn.dao.TeamDAO;
import com.learn.dao.TeamDAOImpl;
import com.learn.model.Team;

public class TeamService {

	TeamDAO dao;
	
	TeamService(){
		dao = new TeamDAOImpl();
	}
	
	
	public List<Team> getAllTeamsFromDB(){
		return dao.getAllTeams();
	}
	public Team getTeamByIdFromDB(int id) {
		return dao.getTeamById(id);
	}
	public String deleteTeamById(int id) {
		return dao.removeTeam(id);
	}
}
