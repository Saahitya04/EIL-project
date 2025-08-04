# EIL-project
Sure! Here's the **README content** you can copy and paste into your GitHub repository:

---

# 💼 HR Dashboard System (EIL Internship)

This project is a comprehensive **HR Dashboard System** developed as part of an internship under **Engineers India Limited (EIL)**. It aims to streamline HR-related activities through an intuitive, role-based web application.

---

## 🛠 Tech Stack

* **Frontend:** ReactJS, TailwindCSS
* **Backend:** Spring Boot (Java)
* **Database:** PostgreSQL

---

## 🚀 Features

### 🏠 Lander Page

* Serves as the homepage for the app.
* Contains a **Sign In** option.
* Designed with visual components (e.g., video backgrounds).

---

### 🔐 Login & Authentication

* CAPTCHA verification to prevent spam.
* “Forgot Password” functionality.
* Role-based routing after login:

  * If role is **`EMP`** → redirects to **Employee Dashboard**
  * If role is **`AMD`** → redirects to **HR/Admin Dashboard**
  * If invalid credentials or role → shows error message
* Built-in navigation safeguards:

  * Prevents access to login page after login via browser back/forward buttons.

---

## 👨‍💼 Employee Dashboard

* ✅ **Check-in/Check-out Button**

  * Toggle system to mark attendance.
  * Timestamps intended to be stored in PostgreSQL via backend.

* ✅ **Employee Profile**

  * Displays employee info and job assignments.

* ✅ **Assignments Section**

  * Shows tasks along with their deadlines.

* ✅ **Leave Portal**

  * Track available and taken leaves.
  * Apply for new leaves.
  * Supports:

    * Paid Leave
    * Sick Leave
    * Maternity Leave
    * Paternity Leave

* ✅ **Logout Function**

  * Returns user to the Lander page.

---

## 🧑‍💼 HR/Admin Dashboard

### Contains the following 7 key sections:

1. **Dashboard Overview**

   * Summary of employees, attendance, leaves, etc.

2. **Employee Management**

   * View all employee records.
   * Filter by department or name.

3. **Attendance Tracking**

   * Monitor daily check-in/check-out data.

4. **Leave Management**

   * View, approve, or reject leave applications.

5. **Job Assignment Panel**

   * Assign and track tasks to/from employees.

6. **Calendar Integration**

   * View organizational events, leave dates, and deadlines.

7. **Reports Section**

   * View analytics, charts, and summaries of organization data.

---

## 🧪 Project Status

* ✅ **Frontend UI:** Completed
* ⚙️ **Backend Integration:** In progress (future scope)
* 🔄 Data currently mocked for demo and prototyping.

---

## 📁 Repository Notes

This project is part of an academic internship under **EIL** and is meant for educational/demo purposes.

---

## 📸 Screenshots

<img width="1920" height="979" alt="Screenshot 2025-08-03 130212" src="https://github.com/user-attachments/assets/b86ff62a-abbb-4114-b365-908d21ee4c4f" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 125956" src="https://github.com/user-attachments/assets/efb108f1-70f6-45a3-ab32-3a6651a11d0d" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 130006" src="https://github.com/user-attachments/assets/c9e39f8d-0489-458f-baa0-34937c5b0573" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 130140" src="https://github.com/user-attachments/assets/06ebbbb2-4de3-497d-8a92-c3de4352923b" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 130318" src="https://github.com/user-attachments/assets/740d226b-6908-4ae0-8e2a-629ccf494059" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 130353" src="https://github.com/user-attachments/assets/8ba02b97-4dd7-4d8d-861e-02c6dcfe3ec8" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 125715" src="https://github.com/user-attachments/assets/a6ec14e1-f274-4d66-b4fb-7a498a32cbb7" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 125734" src="https://github.com/user-attachments/assets/f9217b56-445a-4fa6-a8fb-5dec33a461d2" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 125743" src="https://github.com/user-attachments/assets/f72fa0fe-afbe-4e3d-935d-27ba9a641cbb" />

<img width="1920" height="1080" alt="Screenshot 2025-08-03 125750" src="https://github.com/user-attachments/assets/0968b4b2-e208-48b8-80e6-86d0bb9935ab" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 125801" src="https://github.com/user-attachments/assets/888e39ff-1dac-432f-91d7-eac93b6ab533" />

<img width="1920" height="1080" alt="Screenshot 2025-08-03 125812" src="https://github.com/user-attachments/assets/62703aff-117e-41cc-a782-9e486784fbc3" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 125816" src="https://github.com/user-attachments/assets/53a981d0-dd70-4839-adc7-b8e249304adc" />
<img width="1920" height="1080" alt="Screenshot 2025-08-03 125825" src="https://github.com/user-attachments/assets/0208e228-4792-4a7d-8940-00c689b2b5dc" />

---

## 📄 License

This project is intended for internal learning and demonstration during the EIL internship. Commercial use is not permitted.

---

Let me know if you'd like a shorter version or if you'd like me to add badges, instructions, or screenshots placeholders.
