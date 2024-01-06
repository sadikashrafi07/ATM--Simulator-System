
<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExcXhtM2J1YXBvZDFnajJwYXhqbTdsdGkwbHBtcnVtOHZhaDUwM3YybyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/NBbEGYK6Wz41q8WsM4/giphy.gif" height="50%" width="50%">

<img src="https://i.ibb.co/wRvxKHC/Screenshot-2024-01-05-at-7-51-51-PM.png" width="400"/> &nbsp;&nbsp; <img src="https://i.ibb.co/yf3G9hB/Screenshot-2024-01-05-at-9-12-38-PM.png" width="400"/>

<img src="https://i.ibb.co/BVFBKWw/Screenshot-2024-01-05-at-7-41-44-PM.png" width="250"/> &nbsp;&nbsp; <img src="https://i.ibb.co/7rT5ymC/Screenshot-2024-01-03-at-1-58-48-PM.png" width="250"/> &nbsp;&nbsp; <img src="https://i.ibb.co/3yTp3S3/Screenshot-2024-01-03-at-1-59-39-PM.png" width="250"/>
<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExZGl1dW51dDV5OWUxamg4azIzd2FsbmxrcHlrNDhwcjVjN2RsbmtubCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/qzpoF47z3BlAiIJtlC/source.gif" height="50%" width="50%"> &nbsp;&nbsp; <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExajVlZWZiZWZ5dGo4M3ZrOW05eHdyamJsMXZxcnZ2b3R5Z2J5cnB6MSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/8p58xS9pAUsQ3ngni2/giphy.gif" height="50%" width="50%"> 

<img src="https://i.ibb.co/CVXGTgX/Screenshot-2024-01-05-at-6-39-04-PM.png" width="400"/> &nbsp;&nbsp; <img src="https://i.ibb.co/PhNMn2L/Screenshot-2024-01-05-at-6-39-17-PM.png" width="400"/>

<img src="https://i.ibb.co/qgRM0gj/Screenshot-2024-01-05-at-6-39-30-PM.png" width="400"/> &nbsp;&nbsp; <img src="https://i.ibb.co/h1X9j4c/Screenshot-2024-01-05-at-6-39-42-PM.png" width="400"/>

<img src="https://i.ibb.co/3hkq4jm/Screenshot-2024-01-05-at-6-39-58-PM.png" width="400"/> &nbsp;&nbsp;<img src="https://i.ibb.co/QbXcbvy/Screenshot-2024-01-05-at-9-37-11-PM.png" width="200"/>

# Bank Management System
The "Bank Account Management System" project aims to provide users with the ability to perform basic banking tasks on the internet, such as managing their accounts, handling cash transactions, and checking their account details from the comfort of their homes or offices. This document outlines the objectives, methods, administrative modules, customer obligations, and future prospects of the system. The goal of the project is to enhance the system by improving its design, making it easy to incorporate new features later, and ensuring smooth and efficient operation.


## Appendix
***Acknowledgment:***                                         
We express our sincere gratitude to all those who have contributed to the conception and development of the proposed project. This venture aims to provides  users to do basic banking tasks on the internet, such as managing their accounts, handling cash transactions, and checking their account details.from the comfort of their homes or offices. The overarching objectives and vision for this initiative are as follows:


***Objectives:***  
The primary objectives of the project are to facilitate basic banking transactions, such as creating accounts, depositing/withdrawing cash, and providing access to detailed reports. The project leverages Internet Banking to transform traditional brick-and-mortar banking into a virtual, globally accessible platform.


***Benefits:***    
Our motto is to develop a software program for managing the entire bank process related to administration accounts, customer accounts, and to keep track of every detail about their property and various transaction processes efficiently. Hereby, our main objective is customer satisfaction, considering today's fast-paced world.  


- **Customer Satisfaction :** Clients can conduct their operations comfortably without any risk of losing their privacy. Our software will perform and fulfill all the tasks that any customer would desire.

- **Saving Customer Time :** Clients don't need to go to the bank to perform small operations.

- **Protecting the Customer :** It helps the customer feel satisfied and comfortable in their choices. This protection includes the customer’s account, money, and privacy.

- **Transferring Money :** Helps clients transfer money to another bank or country.
 

***Problem Statement:***   
The traditional banking system poses challenges such as time-consuming processes, limited accessibility, and the need for physical presence. This project aims to address these issues by introducing an Internet Banking System, providing users with the convenience of managing their accounts, conducting transactions, and accessing banking services from the comfort of their homes or offices.


***Banking Operations***  
**Login :** Manages the user authentication process, allowing users to log in to their accounts. It verifies the entered card number and PIN against the stored information in the database.

**SignupOne :** Represents the first page of the user registration process. It collects basic personal information such as name, father's name, date of birth, gender, email, marital status, address, city, state, and pin code.

**SignupTwo :** Represents the second page of the user registration process. It collects additional details such as religion, category, income, education, occupation, PAN number, Aadhar number, senior citizen status, and existing account status.

**SignupThree :** Represents the third page of the user registration process. It collects account details, including the type of account (e.g., Savings, Fixed Deposit, Current, or Recurring Deposit), services required (ATM card, Internet Banking, Mobile Banking, etc.), and generates a card number and PIN.

**Deposit :** The `Deposit` class in a Java-based banking system allows users to input a deposit amount through a Swing GUI. Upon clicking "Deposit," the amount is stored in a MySQL database, linked to the user's PIN and current date. A success message confirms the deposit, and users can return to the transaction menu with the "Back" button. The class adheres to a basic MVC pattern, managing user input, backend updates, and user feedback.

**Withdrawl :** The `Withdrawal` class in a Java banking system enables users to input a withdrawal amount through a Swing GUI. Upon clicking "Withdraw," the amount is deducted from the user's account in a MySQL database, associating the transaction with the PIN and current date. A success message confirms the withdrawal, and users can return to the transaction menu using the "Back" button. The class follows a basic MVC pattern, managing user input, backend updates, and user feedback. Additionally, it performs a balance check to ensure sufficient funds before processing the withdrawal. If the balance is insufficient, an alert is displayed. The code includes error handling for invalid amount formats.

***FastCash :*** The  `FastCash ` class in a Java banking system provides users with predefined withdrawal amounts through a Swing GUI. Users can select amounts such as Rs 100, Rs 500, Rs 1000, Rs 2000, Rs 5000, and Rs 10000. Upon selection, the corresponding amount is deducted from the user's account in a MySQL database, associating the transaction with the PIN and current date. A balance check is performed to ensure sufficient funds before processing the withdrawal. If the balance is insufficient, an alert is displayed. Users can return to the transaction menu using the "Back" button. The class adheres to a basic MVC pattern, managing user input, backend updates, and user feedback

***BalanceEnquiry :*** The `BalanceEnquiry` class in a Java banking system provides users with their current account balance through a Swing GUI. The class displays the balance retrieved from a MySQL database based on the user's PIN. Users can return to the transaction menu using the "Back" button. The class adheres to a basic MVC pattern, managing user input, backend data retrieval, and user feedback. The displayed balance is dynamically updated based on the user's transaction history.

***PinChange :*** The `PinChange` class in a Java banking system allows users to change their PIN through a Swing GUI. Users input a new PIN and re-enter it for confirmation. Upon clicking "CHANGE," the PIN is updated in the database for the user's account, login credentials, and additional user details. A successful change prompts a confirmation message, and users can proceed to transactions with the updated PIN. The "BACK" button allows users to return to the transaction menu without changing the PIN. The class follows a basic MVC pattern, handling user input, backend updates, and user feedback.

***MiniStatement :*** The `MiniStatement` class in a Java banking system provides users with a concise view of their recent transactions and current account balance through a Swing GUI. The mini statement includes transaction details such as date, transaction type, and amount. The user's card number is displayed at the top, and the bank logo (HDFC Bank) is shown alongside it. The class dynamically retrieves transaction details and calculates the account balance based on the user's PIN from a MySQL database. The GUI is designed with a white background and HDFC Bank logo. The class follows a basic MVC pattern, handling data retrieval and displaying relevant information to the user.


***Competitive Advantage:***  
- Online banking with KeyBank is fast, secure, convenient, and free.
- Quick, simple, and authenticated access to accounts via the web application.
- Simply scalable to accommodate changing system requirements.
- Global enterprise-wide access to information.
- Improved data security, restricting unauthorized access.
- Minimizes storage space.


***Conclusion:***  
The Bank Account Management System is a successful project aimed at meeting the diverse financial needs of users. It emphasizes efficiency, security, and convenience in banking operations. The future outlook includes continuous enhancements to adapt to evolving customer requirements and technological advancements.


## Tech Stack
***Front-End***                                               
- ***Java Swing :*** For building the graphical user interface (GUI) of the desktop application.       
- ***LookAndFeel :*** The application uses UIManager to set the look and feel, which may include system-specific styles for the GUI.  

***Back-End***  
- ***Java :*** As the primary programming language for the back-end logic and application functionality. 

***Database***: 
- ***MySQL :*** For storing and managing data related to user accounts, transactions, and other banking details.

***Database Connectivity***: 
- ***JDBC (Java Database Connectivity) :*** For connecting Java applications to the MySQL database.


## Feedback
We value your input and are committed to providing you with the best possible experience. If you have any suggestions, feedback, or if there's an idea you'd like me to consider, please don't hesitate to reach out to me at angadimohammadsadiq@gmail.com.







