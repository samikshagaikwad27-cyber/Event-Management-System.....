# Event Management System (Java OOP Mini Project)

A console-based Java project for event listing, fee packages, price calculations, participant registration, booking, tickets, billing, payment records, venues, feedback, and reports. Prices are sample academic values.

## Requirements
- Java JDK 17 or later (JDK 8+ may also work)
- VS Code (optional)

## Run in VS Code
1. Extract the ZIP.
2. Open this folder in VS Code.
3. Open Terminal → New Terminal.
4. Compile: `javac *.java`
5. Run: `java EventManagementSystem`

Run from the project root so the relative `data/` paths work. Data records are stored in text files under `data/`.

## OOP concepts demonstrated
- Classes and objects
- Encapsulation through private fields and getters/setters
- Constructors and method overloading/utility methods where applicable
- Enums for event, booking and payment states/categories
- Composition (Booking contains/uses event-related data; Bill uses Booking)
- Exception handling and input validation
- File handling with text files
- Collections (`List`, `ArrayList`, `Arrays`)
- Static methods and constants

## Main menu
1. View Events
2. View Fee Structure
3. Calculate Package Price
4. Register Participant
5. Create Booking
6. View Sample Report
0. Exit

## Fee packages
Sample Basic, Standard and Premium prices are provided for Birthday Party, Wedding, College Fest, Corporate Event and Music Concert. They are for demonstration and can be edited in `FeeManager.java` and `data/fee_structure.txt`.

## GitHub upload
1. Sign in to GitHub and click **New repository**.
2. Name it `Event-Management-System` and create the repository.
3. On the repository page, choose **Add file → Upload files**.
4. Extract this ZIP on your computer, then drag the project files and `data` folder into the upload page. Alternatively use Git from the project folder:
   ```bash
   git init
   git add .
   git commit -m "Add Event Management System Java OOP project"
   git branch -M main
   git remote add origin https://github.com/YOUR-USERNAME/Event-Management-System.git
   git push -u origin main
   ```
5. Replace `YOUR-USERNAME` with your GitHub username. Do not upload `.class` files; `.gitignore` excludes them.

This is an academic console prototype. Payment records are simulated and do not process real payments.
