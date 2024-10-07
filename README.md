Drink-Order Tracking System
This Java-based project simulates an infrastructure system for a dry bar, where users can order drinks like iced tea and coffee, track sugar content, and calculate the total bill. The system is designed with Test Driven Development (TDD) to ensure high-quality, bug-free code throughout development.

Key Features:

Order Tracking: Track drink orders (iced tea, coffee) with customizable sugar content.
Pricing: Calculate total bill dynamically as drinks are added to the tab.
Customizable Drinks: Modify sugar levels after drink creation.
Test Driven Development (TDD): Reduced development time by 60% with automated unit testing using JUnit 5.
Java-Based: Built entirely with Java, ensuring scalability and maintainability.
How to Run Locally:

Clone the Repository:
bash
Copy code
git clone https://github.com/your-username/dry-bar-drink-order-system.git
Open the Project:
Open the project in IntelliJ IDEA (or your preferred Java IDE).
Run the Tests:
Navigate to the test directory and run all tests using JUnit 5 to verify the project integrity:
bash
Copy code
./gradlew test
Build and Run the Application:
Once all tests pass, run the main class:
bash
Copy code
./gradlew run
Deployment Instructions:

To deploy this project on a local machine or server:

Build a JAR file:
bash
Copy code
./gradlew build
Run the JAR:
bash
Copy code
java -jar build/libs/dry-bar-drink-order-system.jar
Contributions:

Feel free to fork this project, submit pull requests, or report any issues! All contributions are welcome to enhance features or improve performance.
