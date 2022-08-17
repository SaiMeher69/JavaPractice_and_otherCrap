CREATE TABLE employee (
    name VARCHAR(30) NOT NULL PRIMARY KEY,
    skills VARCHAR(150) NOT NULL
)

INSERT INTO employee (name, skills) VALUES ("Alfred", "Java, C")
INSERT INTO employee (name, skills) VALUES ("Becca", "Python, C++")
INSERT INTO employee (name, skills) VALUES ("Caitlyn", "Java, SQL")
INSERT INTO employee (name, skills) VALUES ("Damian", "Java, C")

Select * FROM employee


