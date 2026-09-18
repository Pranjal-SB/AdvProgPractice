# Tutorial 6

Date: 31/8/26

## Q1 — Vehicle Rental Polymorphism (`Q1_VehicleRental.java`)

A vehicle rental company manages Cars and Bikes.

- Create a parent class `Vehicle` containing `vehicleNumber`, `brand`, `speed`, and `displayDetails()`.
- Derive `Car` and `Bike` from `Vehicle`, adding `numberOfDoors` and `hasGear` respectively.
- Override `displayDetails()` in both subclasses.
- Demonstrate runtime polymorphism by using a `Vehicle` reference to invoke the appropriate overridden method.

## Q2 — Payment Interface (`Q2_PaymentInterface.java`)

An online shopping application supports Credit Card, UPI, and Net Banking payments.

- Declare a `Payment` interface with a `pay(double amount)` method.
- Implement the interface in `CreditCardPayment`, `UPIPayment`, and `NetBankingPayment` classes with different implementations.
- Use a `Payment` reference to invoke `pay()` for different payment methods.

## Q3 — Banking Security Interfaces (`Q3_BankingSecurity.java`)

A mobile banking application provides basic login and logout features. An advanced version additionally supports fingerprint and face-recognition authentication.

- Create a `BasicSecurity` interface and an `AdvancedSecurity` interface that extends it.
- Implement `AdvancedSecurity` in a `BankingApplication` class.
- Demonstrate all the security operations.

## Q4 — Document Tagging Interface (`Q4_DocumentTagging.java`)

A document management system stores different types of documents.

- Create a tagging interface `Confidential` and implement it in selected document classes.
- Use `instanceof` to identify whether a document is confidential.

## Q5 — College Management System (`Q5_CollegeManagement/`)

Develop a college management system by creating separate packages for Student and Course management.

- Create a `Student` class with student details and a `Course` class with course details.
- Place each class in its respective package (`student`, `course`).
- Import them into a `Main` class and display the student and course information.

## Q6 — Online Banking System (`Q6_OnlineBankingSystem/`)

Develop an Online Banking System that supports different types of accounts and payment methods.

- Create a parent class `Account` and derive `SavingsAccount` and `CurrentAccount` from it. Override `displayDetails()` and demonstrate runtime polymorphism using an `Account` reference.
- Create a `Payment` interface with a `pay(double amount)` method and implement it in `UPIPayment` and `CardPayment`. Create another interface `SecurePayment` that extends `Payment` and adds a `verifyPayment()` method; implement it in `UPIPayment`.
- Create a tagging interface `OnlineTransaction` and use it to identify online payment classes.
- Organize the classes into suitable packages (`account`, `payment`) and create a `Main` class to demonstrate the complete system.
