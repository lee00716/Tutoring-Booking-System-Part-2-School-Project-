
INSERT INTO EXPERIENCE (EXPERIENCEID, DESCRIPTION)
VALUES (1, '2Years');

INSERT INTO tutor (TutorID, LastName, FirstName, Email, PhoneNumber, Status, experience_ExperienceID)
VALUES (1,'Dirby','Man','Email','121212','not available',1);

INSERT INTO course (CourseCode, CourseName, CourseDescription)
VALUES ('1234','Dance','Dancing');

INSERT INTO student (StudentID, LastName, FirstName, Email, PhoneNumber)
VALUES (1,'Lenny','Lewis','Gmail','123123'); 

INSERT INTO sessions (DateKey, TimeKey, StudentLastName, SessionStatus, SessionTopic)
VALUES ('2019-06-02', '11:00:00', 'Lewis', 0, 'Dance');
