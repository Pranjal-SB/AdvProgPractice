# Tutorial 5

Date: 21/8/26

## Q1 — Bank Account Encapsulation (`Q1_BankAccount.java`)

A bank wants to develop a system to manage customer accounts. Each account has an account number, account holder name, and balance. The balance should not be modified directly. Customers should be able to deposit and withdraw money.

- Create a `BankAccount` class. Apply encapsulation to protect the balance.
- Use a constructor to initialize account details.
- Implement `deposit()` and `withdraw()` methods.
- Display the updated account details.

## Q2 — University Employee Hierarchy (`Q2_UniversityEmployee.java`)

A university has different types of employees such as Professor, LabAssistant, and AdministrativeStaff. All employees have a name, employee ID, and basic salary, but salary calculation differs for each employee type.

- Create a parent `Employee` class.
- Create appropriate child classes.
- Override a `calculateSalary()` method.
- Display the salary of different employees.

## Q3 — Payment Methods via Polymorphism (`Q3_PaymentMethods.java`)

An e-commerce application supports payment through UPI, Credit Card, and Net Banking. Every payment method must provide a `makePayment()` operation, but the implementation is different for each method.

- Create a suitable abstract class or interface.
- Implement different payment methods.
- Use polymorphism to process payments.
- Allow the user to select a payment method.

## Q4 — Product Discount via Polymorphism (`Q4_ProductDiscount.java`)

An online shopping application sells Electronics, Clothing, and Books. Every product has a product ID, name, and price. Each category provides a different discount.

- Create an abstract `Product` class.
- Create subclasses for Electronics, Clothing, and Books.
- Implement `calculateDiscount()`.
- Use polymorphism to calculate the final price.

## Q5 — Shape Area via Polymorphism (`Q5_ShapeArea.java`)

A graphics application needs to calculate the area of different shapes such as circles, rectangles, and triangles.

- Create an abstract `Shape` class.
- Define an abstract `calculateArea()` method.
- Create subclasses for each shape.
- Accept dimensions from the user.
- Display the area using polymorphism.

## Q6 — Campus Placement Top-K Candidates (`Q6_TopKCandidates.java`)

A company is conducting a campus placement drive. Each candidate is assigned a unique Candidate ID and receives scores in three assessment categories: Aptitude, Technical, Communication. The placement team wants to shortlist the Top K candidates based on their overall score.

Overall Score = Aptitude + Technical + Communication. If two or more candidates have the same overall score, the candidate with the smaller Candidate ID is given higher priority.

- Create a class named `Candidate` with data members: Candidate_Id, name, aptitude, technical, communication.
- Create a parameterized constructor to initialize the candidate details.
- Define a method `getTotalScore()` to calculate and return the overall score.
- Use an array of `Candidate` objects to store all candidates.
- Sort/rank the candidates according to the given priority rules.
- Display only the Top K candidates.

**Input Format:**
```
N K
CandidateID Name Aptitude Technical Communication   (repeated N times)
```
N — number of candidates, K — number of candidates to shortlist.

**Constraints:** 1 ≤ N ≤ 1000, 1 ≤ K ≤ N, 1 ≤ CandidateID ≤ 10^6, 0 ≤ Aptitude, Technical, Communication ≤ 100

**Test Case 1**

Input:
```
5 3
101 Arun 80 90 70
102 Priya 90 85 80
103 Ravi 70 95 75
104 Divya 85 85 85
105 Kiran 80 80 70
```

Output:
```
102 Priya 255
104 Divya 255
101 Arun 240
```
