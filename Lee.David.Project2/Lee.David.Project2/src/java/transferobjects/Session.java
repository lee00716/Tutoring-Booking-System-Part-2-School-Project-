/*
 * File name: Session.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 2
 * Date: July 16 2019 
 * Professor: George Kriger 
 * Purpose: this is a DTO class in the peer tutoring application
 */
package transferobjects;

import java.sql.Date;
import java.sql.Time;

/**
 *  this is a DTO class in the peer tutoring application
 * @author David
 */
public class Session {
        private Date date;
    private Time time;
    private String studentLastName;
    private int sessionStatus;
    private String sessionTopic;
    private int tutorID;
    private String courseCode;
    private int studentID;

    /**
     *
     * @return tutorID tutor's ID
     */
    public int getTutorID() {
        return tutorID;
    }

    /**
     *
     * @param tutorID tutor's ID
     */
    public void setTutorID(int tutorID) {
        this.tutorID = tutorID;
    }

    /**
     *
     * @return courseCode the code of the course
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     *
     * @param courseCode the code of the course
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     *
     * @return student's ID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     *
     * @param studentID student's ID
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     *
     * @return date date of the session
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date date of the session
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return time time of the session
     */
    public Time getTime() {
        return time;
    }

    /**
     *
     * @param time time of the session
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     *
     * @return studentLastName student's last name in the session
     */
    public String getStudentLastName() {
        return studentLastName;
    }

    /**
     *
     * @param studentLastName student's last name in the session
     */
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    /**
     *
     * @return sessionStatus availability of the session
     */
    public int getSessionStatus() {
        return sessionStatus;
    }

    /**
     *
     * @param sessionStatus availability of the session
     */
    public void setSessionStatus(int sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    /**
     *
     * @return sessionTopic topic of the session
     */
    public String getSessionTopic() {
        return sessionTopic;
    }

    /**
     *
     * @param sessionTopic topic of the session
     */
    public void setSessionTopic(String sessionTopic) {
        this.sessionTopic = sessionTopic;
    }

}
