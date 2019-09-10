/*
 * File name: DataSource.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 2
 * Date: July 16 2019 
 * Professor: George Kriger 
 * Purpose: this is a datasource class in the peer tutoring application
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *this is a datasource class in the peer tutoring application
 * @author David
 */
public class DataSource {
    	private Connection connection = null;
        private final String connectionString = "jdbc:derby://localhost:1527/tutoring";
        private final String username = "scott";
	private final String password = "tiger";
	
    /**
     *  establishes the connection to the server
     */
    public DataSource(){}
/*
 * Only use one connection for this application, prevent memory leaks.
 */

    /**
     *
     * @return connection the object of Connection class established in this class
     */

	public Connection createConnection(){
		try{
			if(connection != null){
				System.out.println("Cannot create new connection, one exists already");
			}
			else{
				connection = DriverManager.getConnection(connectionString, username, password);
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return connection;
	}
}
