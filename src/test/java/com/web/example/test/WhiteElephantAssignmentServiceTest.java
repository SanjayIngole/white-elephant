package com.web.example.test;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

import com.web.examples.service.WhiteElephantAssignmentService;
import com.web.examples.service.impl.WhiteElephantAssignmentRandonShuffleServiceImpl;
import com.web.examples.service.impl.WhiteElephantAssignmentServiceImpl;

public class WhiteElephantAssignmentServiceTest {
	
	/**
	 * Logger object
	 */
	private Logger logger = Logger.getLogger(WhiteElephantAssignmentServiceTest.class.getName());
	
	/*
	 * Service to tested
	 */
	WhiteElephantAssignmentService whiteElephantAssignmentService;
	
	/**
	 * List of participants.
	 */
	final String[] 	participants = new String[] { "Kyle", "Kenny", "Eric",
			"Stan", "Stewie", "Brian" };
	/**
	 * Initializer method.
	 */
	public void init() {
		
		whiteElephantAssignmentService = new WhiteElephantAssignmentServiceImpl();
	}

	/**
	 * Test Case to test the generateAssignments in WhiteElephantAssignmentServiceImpl
	 */
	@Test
	public void testGenerateAssignments(){
		
		 logger.info("Start");
		 
		 init();
		 
		 String[] assigned = whiteElephantAssignmentService.generateAssignments(participants);
		 
		 for(int i = 0; i < participants.length; i++) {
			 logger.info("participants[" + i + "] : " + participants[i] + "  assigned[" + i + "] : " + participants[Integer.parseInt(assigned[i])]);

			 assertFalse(participants[i].equals(participants[Integer.parseInt(assigned[i])]));
		 }
		 
		 logger.info("End");
	}

	/**
	 * Test Case to test the generateAssignments in WhiteElephantAssignmentRandonShuffleServiceImpl
	 */
	@Test
	public void testGenerateAssignmentsRandonShuffleService(){
		
		 logger.info("Start");
		 
		 whiteElephantAssignmentService = new WhiteElephantAssignmentRandonShuffleServiceImpl();
		 
		 String[] assigned = whiteElephantAssignmentService.generateAssignments(participants);
		 
		 for(int i = 0; i < participants.length; i++) {
			 //logger.info("participants[" + i + "] : " + participants[i] + "  assigned[" + i + "] : " + assigned[i]);
			 assertFalse(participants[i].equals(assigned[i]));
		 }
		 
		 logger.info("End");
	}
}
