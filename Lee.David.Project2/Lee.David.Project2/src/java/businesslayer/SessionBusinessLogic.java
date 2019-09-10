/*
 * File name: SessionBusinessLogic.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 2
 * Date: July 16 2019 
 * Professor: George Kriger 
 * Purpose: this is a businesslayer class in the peer tutoring application
 */
package businesslayer;

import dataaccesslayer.SessionDAO;
import dataaccesslayer.SessionDAOInterface;

import java.util.List;
import transferobjects.Session;

/**
 * this is a businesslayer class in the peer tutoring application
 * @author David
 */
public class SessionBusinessLogic {
	
	private SessionDAOInterface sessionDAO = null;
	
    /**
     * instantiates sessionDAO class
     */
    public SessionBusinessLogic(){
		sessionDAO = new SessionDAO();
	}
	
    /**
     *
     * @return List<Session> the list of session objects
     */
    public List<Session> getAllSessions(){
		return sessionDAO.getAllSessions();
	}
	
}
