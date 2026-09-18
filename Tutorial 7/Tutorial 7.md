# Tutorial 7

Date: 17/9/26

## Q1 — College Management System (`Q1_CollegeManagement/`)

Develop a college management system by creating separate packages for Student and Course management.

- Create a `Student` class with student details and a `Course` class with course details.
- Place each class in its respective package (`student`, `course`).
- Import them into a `Main` class and display the student and course information.

## Q2 — Hospital Management System (`Q2_HospitalManagement/`)

Develop a Hospital Management System using separate packages for doctor and patient management.

- Create a `Doctor` class in a `doctor` package with private data members `doctorId`, `name`, `specialization`, and `consultationFee`.
- Create a `Patient` class in a `patient` package with private data members `patientId`, `name`, `disease`, and `age`.
- Provide suitable constructors, getter methods, and display methods in both classes.
- In the `Main` class: import the `Doctor` and `Patient` classes from their respective packages, create at least two doctors and three patients, assign each patient to an appropriate doctor based on the doctor's specialization, display the details of each patient along with the details of the doctor treating them, and calculate and display the total consultation fee collected by each doctor based on the number of patients assigned.

## Q3 — Online Examination System Threads (`Q3_OnlineExamSystem.java`)

An online examination system performs three activities concurrently: displaying the remaining time, auto-saving the student's answers, and checking the network connection.

- Implement each activity using the `Runnable` interface.
- Create separate `Thread` objects for each task, assign suitable thread names using `setName()`, and use `sleep()` to simulate different execution intervals.
- The `run()` method should display the name of the currently executing thread and its corresponding activity.

## Q4 — Banking Application Threads (`Q4_BankingThreads.java`)

A banking application needs to perform transaction processing, balance updating, and SMS notification as separate concurrent activities.

- Implement each activity using the `Runnable` interface.
- Create the required `Thread` objects, assign suitable names using `setName()`, and introduce different delays using `sleep()`.
- Each activity should execute three times, displaying its thread name, activity, and execution count.

## Q5 — Smart Traffic Management (`Q5_TrafficMonitoring.java`)

A smart traffic management system simultaneously monitors traffic conditions at three different junctions. Each junction periodically reports its traffic status to the central monitoring system.

- Extend the `Thread` class to create three threads representing the three traffic junctions.
- Assign a unique name to each thread using `setName()`.
- Override the `run()` method so that each thread displays its thread name and traffic status three times.
- Use `sleep()` with different time intervals for the three threads to simulate different monitoring frequencies.
