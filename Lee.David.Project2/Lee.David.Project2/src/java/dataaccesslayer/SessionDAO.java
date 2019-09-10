/*
 * File name: SessionDAO.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 2
 * Date: July 16 2019 
 * Professor: George Kriger 
 * Purpose: this is a DAO class in the peer tutoring application
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import transferobjects.Session;

/**
 * this class gets the Session objects from the database
 *
 * @author David
 */
public class SessionDAO implements SessionDAOInterface {

    /**
     *
     * @return the list of Session objects
     */
    @Override
    public List<Session> getAllSessions() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Session> sessions = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT \"DATEKEY\", \"TIMEKEY\", \"STUDENTLASTNAME\", \"SESSIONSTATUS\", \"SESSIONTOPIC\" FROM \"SESSIONS\"");
            sessions = new ArrayList<Session>();
            while (rs.next()) {
                Session session = new Session();
                session.setDate(rs.getDate("DATEKEY"));
                session.setTime(rs.getTime("TIMEKEY"));
                session.setStudentLastName(rs.getString("STUDENTLASTNAME"));
                session.setSessionStatus(rs.getInt("SESSIONSTATUS"));
                session.setSessionTopic(rs.getString("SESSIONTOPIC"));
               sessions.add(session);

           }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return sessions;
    }
}
