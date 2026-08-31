# Tutorial 4

Date: 14/8/26

## Q1 — Product Billing System (`Q1_ProductBilling.java`)

An online shopping store wants to develop a Product Billing System to calculate the final price of products after applying discounts. Create a Java program using a `Product` class and objects to store the following details of 5 products (use array of objects, looping, and conditional control structures): Product ID, Product Name, Price, Quantity.

Create an array of 5 `Product` objects to store the product details. Calculate the total price of each product. If the total price is ₹5,000 or more, give a 10% discount. Otherwise, give a 5% discount. Calculate the final price using total price − discount. Finally, display the Product ID, Product Name, Total Price, Discount, and Final Price for all 5 products.

## Q2 — Student Performance Management System (`Q2_StudentPerformance.java`)

A college wants to develop a Student Performance Management System to evaluate the academic performance of its students. (Constraint: choose an appropriate decision-making operator/construct for the conditions; avoid using multiple lines of branching code.)

Create a Java program using a `Student` class with the following attributes: Roll number, Student name, Marks in 3 subjects, Attendance percentage. Create 5 `Student` objects and store them in an array of `Student` objects.

For each student:
- Calculate the total marks and average marks using a for loop.
- Determine whether the student has Passed or Failed based on the average: Average ≥ 50 → Pass, Average < 50 → Fail.
- Determine whether the student is eligible for a scholarship: Average ≥ 75 and attendance ≥ 80% → Eligible, otherwise → Not Eligible.
- Classify the student's performance: Average ≥ 85 → Excellent, otherwise → Good.

Display the student's details along with the above results. Finally, identify and display the student with the highest average.

## Q3 — Employee Management System (`Q3_EmployeeManagement.java`)

A company wants to develop a simple Employee Management System to calculate the yearly salary and bonus of its employees. The HR department needs to store the details of 5 employees and determine which employees are eligible for a bonus.

Develop a Java program that:
- Creates an `Employee` class containing employee details such as Employee ID, Name, and Monthly Salary.
- Stores the details of 5 employees using an array of objects.
- Creates methods to display the details of each employee, calculate and display the annual salary, calculate the bonus based on the employee's salary, and check and display whether the employee is eligible for a bonus.
- Use a suitable condition to determine bonus eligibility. For example, an employee earning a monthly salary of ₹30,000 or more is eligible for a 10% annual salary bonus.

Display the complete details of all employees along with their annual salary, bonus, and eligibility status.

## Q4 — Hospital Consultation Billing (`Q4_HospitalBilling.java`)

A multispecialty hospital wants to automate its consultation billing process. The billing department needs to maintain the consultation details of 5 patients and calculate the final amount payable after applying a discount. Develop a Java program for this system.

- Create a `Patient` class with patient name and consultation fee.
- Use a parameterized constructor to initialize the patient details.
- Store the details of 5 patients using an array of objects.
- Create a method with arguments to calculate the final consultation amount. Apply discounts: Consultation fee ≥ ₹2000 → 10% discount, Consultation fee < ₹2000 → 5% discount.
- Use a loop to process all 5 patients.
- Create a separate method to display: Patient name, Original consultation fee, Discount, Final amount.

## Q5 — Amusement Park Ride Pattern (`Q5_RidePattern.java`)

An amusement park wants to display the activity level of its rides in a simple visual format. The park has 5 different rides, and each ride is assigned an activity level from 1 to 5 based on the number of visitors.

Develop a Java program to generate a pattern where the number of `*` corresponds to the ride's activity level:

```
Roller Coaster  : *
Ferris Wheel    : **
Bumper Cars     : ***
Water Ride      : ****
Haunted House   : *****
```

- Create a `Ride` class with ride number and ride name.
- Use a constructor to initialize the ride details.
- Store the 5 rides using an array of objects.
- Use a for loop to access each ride.
- Use a nested for loop to print the `*` pattern.
- Display the ride name along with its corresponding pattern.
