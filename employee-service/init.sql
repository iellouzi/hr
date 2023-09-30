CREATE DATABASE IF NOT EXISTS employeeDB;
CREATE USER 'issam'@'%' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON employeeDB.* TO 'issam'@'%';
FLUSH PRIVILEGES;

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
