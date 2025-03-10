## CustomerVault

A simple Java-based customer management system using serialization.



## 📌 Project Description

CustomerVault is a Java-based application that allows users to store, retrieve, and manage customer
details. It utilizes serialization to save customer records in a file, ensuring data persistence.



## ⚙️ Features

✔️ Add new customers with an automatically generated customer ID

✔️ Search for customers by name

✔️ Store customer data using serialization (ObjectOutputStream & ObjectInputStream)

✔️ Simple CLI-based interface



## 📂 Project Structure

CustomerVault/
│── src/
│   ├── Main.java          # Main entry point of the program

│   ├── Customer.java      # Customer class (data model)

│   ├── FileManager.java   # Handles file operations (saving & retrieving customers)

│── customerdata.dat       # Serialized customer data (generated after running the program)

│── README.md              # Project documentation





## 🚀 How to Run the Project

1️⃣ Clone the Repository

git clone https://github.com/Hritik-ray/CustomerVault.git

cd CustomerVault

2️⃣ Compile and Run the Program
javac src/*.java  

java src.Main






## 📖 Usage
1️⃣ Add a Customer – Enter customer name and phone number. The system will assign a unique ID.

2️⃣ Search for a Customer – Enter a name to find customer details.

3️⃣ Exit the Application – Quit when done.





## 🛠 Technologies Used
Java
File Handling (FileInputStream, FileOutputStream)
Object Serialization (ObjectOutputStream, ObjectInputStream)
Collections (ArrayList)




## 📝 To-Do (Future Enhancements)
🔹 Implement a GUI using Java Swing or JavaFX

🔹 Add validation for phone numbers

🔹 Export customer data to a CSV file
