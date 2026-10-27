# Event Management System — Project Report

## 1. Introduction
The Event Management System is a Java console application designed to demonstrate how event details, event package fees, participant registration, bookings, tickets and bills can be organised in one application.

## 2. Objectives
- Display available events and venues.
- Show Basic, Standard and Premium fee packages.
- Calculate discounts and final package price.
- Register participant details with basic validation.
- Create a booking and generate a ticket and bill.
- Store records in text files for demonstration.

## 3. Technology Used
- Language: Java
- Concepts: Classes, objects, encapsulation, constructors, enums, methods, collections and file handling
- IDE: Visual Studio Code
- Storage: Text files in the `data` folder

## 4. Main Modules
1. Event Management — lists event type, date, venue and starting price.
2. Fee Structure — maintains package rates for five sample event types.
3. Price Calculator — calculates discounts and final price.
4. Participant Registration — validates and stores participant details.
5. Booking and Ticket — creates booking IDs and sample ticket IDs.
6. Billing — creates a printable bill and saves the bill record.
7. File Handling — appends records to text files.

## 5. Sample Fee Structure
| Event | Basic | Standard | Premium |
|---|---:|---:|---:|
| Birthday Party | ₹5,000 | ₹10,000 | ₹20,000 |
| Wedding | ₹50,000 | ₹1,00,000 | ₹2,50,000 |
| College Fest | ₹15,000 | ₹30,000 | ₹60,000 |
| Corporate Event | ₹25,000 | ₹50,000 | ₹1,00,000 |
| Music Concert | ₹20,000 | ₹50,000 | ₹1,50,000 |

*All prices are illustrative academic sample data.*

## 6. Formula
Discount = Base Price × Discount Percentage / 100

Final Price = Base Price − Discount

Example: Standard Birthday Party = ₹10,000. For a 10% discount, discount = ₹1,000 and final price = ₹9,000.

## 7. Testing
- View Events: expected to display five sample events.
- View Fee Structure: expected to display three packages for each event.
- Price Calculation: valid event/package and discount calculate final price.
- Invalid Discount: values below 0 or above 100 are rejected.
- Registration: valid name, email and 10-digit phone are saved to `data/participants.txt`.
- Booking: booking, ticket and bill are appended to their respective text files.

## 8. Limitations
This is a console-based educational prototype. It does not have a database, authentication, a graphical interface, real online payments or real email/SMS delivery. Existing records are saved to text files but are not loaded into the current menu as a database would be.

## 9. Future Scope
A database, administrator login, GUI, editable fee management, venue availability checking, secure payment gateway and automated email notifications could be added.

## 10. Conclusion
The project demonstrates basic Java OOP and file handling through a practical event planning example. It gives a foundation that can be extended into a more complete event management application.
