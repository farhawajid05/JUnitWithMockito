package com.learn.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.learn.dao.TeamDAO;
import com.learn.model.Team;

@RunWith(MockitoJUnitRunner.class)
public class TeamServiceTest {
	
	@Mock
	TeamDAO dao;
	
	@InjectMocks
	TeamService service;
	
	List<Team> teamList = new ArrayList();

	@Before
	public void setUp() throws Exception {
		teamList.add(new Team(111,"Hockey",15));
		teamList.add(new Team(222,"Cricket",12));
		teamList.add(new Team(333,"Football",10));
		teamList.add(new Team(444,"baseball",20));
		service = new TeamService();
		MockitoAnnotations.initMocks(this);
		when(dao.getAllTeams()).thenReturn(teamList);
		when(dao.getTeamById(111)).thenReturn(teamList.get(0));

	}

	@After
	public void tearDown() throws Exception {
		service = null;
	}

	@Test
	public void testGetAllTeamsFromDB() {
		int size = service.getAllTeamsFromDB().size();
		assertEquals("Total number of team is 4",4, size);
	}

	@Test
	public void testGetTeamByIdFromDB() {
		Team team = service.getTeamByIdFromDB(1);
		assertNotNull(team);
		assertEquals("Hockey",team.getTeamName());
	}
//
//	@Test
//	public void testDeleteTeamById() {
//		fail("Not yet implemented");
//	}

}
