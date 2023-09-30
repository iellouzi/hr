CREATE
DATABASE IF NOT EXISTS employeeDB;
CREATE
DATABASE IF NOT EXISTS candidateDB;
    CREATE
DATABASE IF NOT EXISTS offreDB;
        CREATE
DATABASE IF NOT EXISTS candidatureDB;
            CREATE
DATABASE IF NOT EXISTS evaluationDB;
CREATE
-- USER 'issam'@'%' IDENTIFIED BY '1234';
-- GRANT ALL PRIVILEGES ON employeeDB.* TO
-- 'issam'@'%';
-- FLUSH
-- PRIVILEGES;

USE employeeDB;

INSERT INTO employees (first_name, last_name, email, date_of_birth, department, position, salary)
VALUES
    ('John', 'Doe', 'john.doe@example.com', '1990-01-01', 'Sales', 'Manager', '5000'),
    ('Jane', 'Smith', 'jane.smith@example.com', '1992-02-02', 'Marketing', 'Analyst', '4000'),
    ('David', 'Johnson', 'david.johnson@example.com', '1995-03-03', 'Finance', 'Accountant', '4500'),
    -- Add the remaining employee records here
    ('Sarah', 'Williams', 'sarah.williams@example.com', '1991-04-04', 'HR', 'Recruiter', '3800'),
    ('Michael', 'Brown', 'michael.brown@example.com', '1993-05-05', 'Operations', 'Supervisor', '4200'),
    ('Emily', 'Davis', 'emily.davis@example.com', '1994-06-06', 'IT', 'Developer', '5500'),
    ('Daniel', 'Miller', 'daniel.miller@example.com', '1996-07-07', 'Engineering', 'Engineer', '4800'),
    ('Olivia', 'Anderson', 'olivia.anderson@example.com', '1989-08-08', 'Sales', 'Representative', '3900'),
    ('Matthew', 'Wilson', 'matthew.wilson@example.com', '1997-09-09', 'Finance', 'Analyst', '4200'),
    ('Sophia', 'Taylor', 'sophia.taylor@example.com', '1998-10-10', 'Marketing', 'Manager', '5500');

USE offreDB;

INSERT INTO offres (id, offreTitle, Description, requirements, experience, salaire)
VALUES
    (1, 'Intitulé 1', 'Description 1', 'Requirements 1', 1, 1000.0),
    (2, 'Intitulé 2', 'Description 2', 'Requirements 2', 2, 2000.0),
    (3, 'Intitulé 3', 'Description 3', 'Requirements 3', 3, 3000.0),
    (4, 'Intitulé 4', 'Description 4', 'Requirements 4', 4, 4000.0),
    (5, 'Intitulé 5', 'Description 5', 'Requirements 5', 5, 5000.0),
    (6, 'Intitulé 6', 'Description 6', 'Requirements 6', 6, 6000.0),
    (7, 'Intitulé 7', 'Description 7', 'Requirements 7', 7, 7000.0),
    (8, 'Intitulé 8', 'Description 8', 'Requirements 8', 8, 8000.0),
    (9, 'Intitulé 9', 'Description 9', 'Requirements 9', 9, 9000.0),
    (10, 'Intitulé 10', 'Description 10', 'Requirements 10', 10, 10000.0);


USE evaluationDB;

INSERT INTO evaluations (id, noteCV, noteRH, note_Technique, description)
VALUES
    (1, 9.5, 8.2, 7.8, 'Evaluation 1'),
    (2, 8.7, 6.4, 9.1, 'Evaluation 2'),
    (3, 7.9, 8.6, 7.2, 'Evaluation 3'),
    (4, 6.8, 9.2, 8.4, 'Evaluation 4'),
    (5, 9.1, 7.5, 8.9, 'Evaluation 5'),
    (6, 8.3, 8.8, 7.1, 'Evaluation 6'),
    (7, 7.6, 9.4, 8.2, 'Evaluation 7'),
    (8, 8.9, 7.2, 9.3, 'Evaluation 8'),
    (9, 7.3, 8.9, 8.5, 'Evaluation 9'),
    (10, 9.2, 7.8, 8.7, 'Evaluation 10');


USE candidatureDB;

INSERT INTO candidatures (candidate_Id, offre_Id, evaluation_Id, status, creation_Date)
VALUES
    (1, 1, 1, 1, '2023-05-11'),
    (2, 2, 2, 1, '2023-05-12'),
    (3, 3, 3, 1, '2023-05-13'),
    (4, 4, 4, 1, '2023-05-14'),
    (5, 5, 5, 1, '2023-05-15'),
    (6, 6, 6, 1, '2023-05-16'),
    (7, 7, 7, 1, '2023-05-17'),
    (8, 8, 8, 1, '2023-05-18'),
    (9, 9, 9, 1, '2023-05-19'),
    (10, 10, 10, 1, '2023-05-20');

USE candidateDB;

INSERT INTO candidates (name, phone, email)
VALUES
    ('Candidate 1', '1234567890', 'candidate1@example.com'),
    ('Candidate 2', '9876543210', 'candidate2@example.com'),
    ('Candidate 3', '4567890123', 'candidate3@example.com'),
    ('Candidate 4', '0123456789', 'candidate4@example.com'),
    ('Candidate 5', '9870123456', 'candidate5@example.com'),
    ('Candidate 6', '6547890123', 'candidate6@example.com'),
    ('Candidate 7', '0129876543', 'candidate7@example.com'),
    ('Candidate 8', '7890123456', 'candidate8@example.com'),
    ('Candidate 9', '3456789012', 'candidate9@example.com'),
    ('Candidate 10', '8901234567', 'candidate10@example.com');


INSERT INTO candidates (id, name, phone, email)
VALUES
    (1, 'Candidate 1', '1234567890', 'candidate1@example.com'),
    (2, 'Candidate 2', '9876543210', 'candidate2@example.com'),
    (3, 'Candidate 3', '4567890123', 'candidate3@example.com'),
    (4, 'Candidate 4', '0123456789', 'candidate4@example.com'),
    (5, 'Candidate 5', '9870123456', 'candidate5@example.com'),
    (6, 'Candidate 6', '6547890123', 'candidate6@example.com'),
    (7, 'Candidate 7', '0129876543', 'candidate7@example.com'),
    (8, 'Candidate 8', '7890123456', 'candidate8@example.com'),
    (9, 'Candidate 9', '3456789012', 'candidate9@example.com'),
    (10, 'Candidate 10', '8901234567', 'candidate10@example.com');


INSERT INTO educations (name, date_start, date_end, candidate_id)
VALUES
    ('Education 1', '2022-01-01', '2022-12-31', 1),
    ('Education 2', '2023-03-15', '2023-09-30', 2),
    ('Education 3', '2022-09-01', '2023-06-30', 1),
    ('Education 4', '2023-01-15', '2023-12-31', 3),
    ('Education 5', '2022-06-01', '2023-03-31', 2);

INSERT INTO experiences (title, date_start, date_end, organization, candidate_id)
VALUES
    ('Experience 1', '2022-01-01', '2022-12-31', 'Organization 1', 1),
    ('Experience 2', '2023-03-15', '2023-09-30', 'Organization 2', 2),
    ('Experience 3', '2022-09-01', '2023-06-30', 'Organization 1', 1),
    ('Experience 4', '2023-01-15', '2023-12-31', 'Organization 3', 3),
    ('Experience 5', '2022-06-01', '2023-03-31', 'Organization 2', 2);

INSERT INTO skills (name, candidate_id)
VALUES
    ('Skill 1', 1),
    ('Skill 2', 2),
    ('Skill 3', 1),
    ('Skill 4', 3),
    ('Skill 5', 2);
