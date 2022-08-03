CREATE TABLE car (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    make VARCHAR(30) NOT NULL,
    model VARCHAR(30) NOT NULL,
    price NUMERIC(19,2) NOT NULL
);

CREATE TABLE person (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    email VARCHAR(150),
    date_of_birth date NOT NULL,
    country_of_birth VARCHAR(30) NOT NULL,
    car_id BIGINT REFERENCES car (id),
    UNIQUE (car_id)
);

INSERT into person (first_name, last_name, gender, email, date_of_birth, country_of_birth) VALUES ('Arun', 'Bhatia', 'Male', 'Arun.Bhatia@gmail.com', '1837-05-04', 'India');
INSERT into person (first_name, last_name, gender, email, date_of_birth, country_of_birth) VALUES ('Maria', 'Chumbernecks', 'Female', 'Maria@gmail.com', '2059-02-29', 'England');
INSERT into person (first_name, last_name, gender, email, date_of_birth, country_of_birth) VALUES ('Sofie', 'Buttonwala', 'Non-Binary', 'Sofia.Buttonwala@gmail.com', '1999-12-17', 'Singapore');

INSERT into car(make, model, price) VALUES ('Land Rover', 'Sterling', '87745.23');
INSERT into car(make, model, price) VALUES ('GMC', 'Acadia', '17662.99');  