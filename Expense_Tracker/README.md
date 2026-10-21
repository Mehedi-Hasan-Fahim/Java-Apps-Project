# 💰 Expense Tracker (Desktop Application)

An intuitive and robust desktop-based expense management software built with **Java Swing** and **MySQL**. It enables users to monitor daily transactions, manage custom spending categories, visualize expenses date-wise and category-wise, and handle reports seamlessly.

---

## 🔗 Quick Links & Downloads

* 📥 **[Download Desktop App (.exe)](https://drive.google.com/file/d/1PF1R0-xiSHlbPRUUGWl7WiqPXsABWXrI/view?usp=sharing)**
* 🎬 **[Watch User Manual & Video Tutorial](https://drive.google.com/file/d/16d1psHLw4Y89PPU_YBO815RpeF2Am-Bn/view?usp=sharing)**

---

## 📸 Screenshots & UI Tour

| Login Frame | Sign Up Frame |
|:---:|:---:|
| ![Login](imgs/login_frame_screenshot.png) | ![Sign Up](imgs/signup_frame_screenshot.png) |

| Add Expense Dashboard | Add Category |
|:---:|:---:|
| ![Add Expense](imgs/add_expense_frame_screenshot.png) | ![Add Category](imgs/add_category_frame_screenshot.png) |

| View Expenses (Filter by Date / Category) | Navigation Menu Bar |
|:---:|:---:|
| ![View Expenses](imgs/view_expenses_frame_screenshot.png) | ![Menu Bar](imgs/menubar_screenshot.png) |

---

## ✨ Features

* **Multi-User Authentication:** Independent user registration and secure login.
* **Dynamic Category Management:** Add and delete personal expenditure categories.
* **Expense Recording:** Record transactions with Date, Category, Remarks, and Amount.
* **Detailed Breakdown & Filtering:**
  * Date-wise expense filtering with auto-calculated total amount.
  * Category-wise breakdown of expenses.
* **Excel Integration:** Export / Import support via Microsoft Excel (`.xlsx`).

---

## 💻 System Prerequisites

Before running the desktop application, ensure you have the following installed on your PC:

1. **Java Runtime:**
   * **JDK 22 (x64)** must be installed on your Windows system (`jdk-22_windows-x64_bin`).
2. **Database Engine:**
   * **MySQL Server** installed and running on port `3306`.
   * **Default Credentials configured in the app:**
     * **User:** `root`
     * **Password:** `1234`

---

## 🗄️ Database Setup

1. Open **MySQL Workbench** or MySQL Command Line Client.
2. Execute the following SQL script to initialize the database and tables:

```sql
CREATE DATABASE IF NOT EXISTS expense_tracker_db;
USE expense_tracker_db;

CREATE TABLE IF NOT EXISTS user_details (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_ VARCHAR(30) NOT NULL,
    DOB DATE NOT NULL,
    email VARCHAR(30) NOT NULL,
    password_ VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS expenses (
    ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(30) NOT NULL,
    password_ VARCHAR(20) NOT NULL,
    Date_Issue DATE NOT NULL,
    Category VARCHAR(20) NOT NULL,
    Remarks VARCHAR(30) NOT NULL,
    Amount INT NOT NULL
);

CREATE TABLE IF NOT EXISTS category (
    category_list VARCHAR(20) NOT NULL,
    email VARCHAR(30) NOT NULL,
    password_ VARCHAR(20) NOT NULL,
    CONSTRAINT unique_category_per_user PRIMARY KEY (category_list, email)
);

```

---

## 🚀 How to Run

### Method 1: Using the Executable (`.exe`)

1. Download the `.exe` file from the [Google Drive Link](https://drive.google.com/file/d/1PF1R0-xiSHlbPRUUGWl7WiqPXsABWXrI/view?usp=sharing).
2. Ensure MySQL service is running and the database is configured.
3. Double-click the `.exe` file to start tracking your expenses!

### Method 2: Running from Source Code

1. Clone the repository:
```bash
git clone [https://github.com/Mehedi-Hasan-Fahim/Java-Apps-Project.git](https://github.com/Mehedi-Hasan-Fahim/Java-Apps-Project.git)

```


2. Navigate to `Expense_Tracker/src` and open the project in **NetBeans**, **IntelliJ IDEA**, or **Eclipse**.
3. Verify `connection.java` matches your local MySQL database credentials.
4. Run `Main.java` or `Login.java`.

---

## 🛠️ Built With

* **Programming Language:** Java (JDK 22)
* **GUI Toolkit:** Java Swing / AWT
* **Database:** MySQL
* **Libraries:** MySQL Connector/J, JCalendar, Apache POI

---

## 👤 Author

* **Mehedi Hasan Fahim** - [GitHub Profile](https://www.google.com/search?q=https://github.com/Mehedi-Hasan-Fahim)

```


```
