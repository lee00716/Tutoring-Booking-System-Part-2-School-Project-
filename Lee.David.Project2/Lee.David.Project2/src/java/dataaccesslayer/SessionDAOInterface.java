/*
 * File name: SessionDAOInterface.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 2
 * Date: July 16 2019 
 * Professor: George Kriger 
 * Purpose: this is a DAO interface class in the peer tutoring application
 */
package dataaccesslayer;

import java.util.List;
import transferobjects.Session;

/**
 * interface method of SessionDAO's method getAllSessions
 * @author David
 */
public interface SessionDAOInterface {
    	List<Session> getAllSessions();

}
