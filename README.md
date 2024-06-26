**Academic Simulator - Java MVC CRUD Project**

## Introduction

Welcome to the Academic Simulator repository! Academic Simulator is a Java project developed using the Model-View-Controller (MVC) architectural pattern. This simulator aims to simulate various academic activities such as student enrollment, course registration, grading, and academic progress tracking.

## Features

- **Student Management**:
  - Add new students.
  - View detailed information about students.

- **Course Management**:
  - Add new courses.
  - View course details and history.

- **Enrollment Management**:
  - Enroll students in courses.
  - Record grades and remedial actions for enrolled students.

- **Lecturer Management**:
  - Add new lecturers.
  - Manage lecturer details.
 
  *You can see how the program run in* <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/README.md">here</a>.
  *For the other example, you can see in*  <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/test.txt">here</a>

## MVC Architecture
<hr>
<div class="image-container">
  <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/image%20MVC.jpg">
    <img src="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/image%20MVC.jpg" alt="MVC image">
  </a>
</div>
<hr>

The Academic Simulator project follows the Model-View-Controller (MVC) architectural pattern. Here's how each component is implemented:

- **Model**: Represents the data and business logic of the application. It includes classes for students, courses, enrollments, and lecturers.

- **View**: Represents the user interface (UI) of the application. Views are responsible for displaying information to the user and capturing user input.

- **Controller**: Acts as an intermediary between the model and the view. It handles user input, processes requests, and updates the model accordingly. Controllers contain methods for adding students, courses, enrollments, lecturers, recording grades, and performing other actions.

     <table border="1">
  <tr>
    <th>Type</th>
    <th>Class Name</th>
  </tr>
  <tr>
    <td>Controller</td>
    <td>
      <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/model/Controller.java">Controller</a>
    </td>
  </tr>
  <tr>
    <td>Model</td>
    <td>
      <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/model/Course.java">Course</a>, 
      <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/model/CourseOpening.java">CourseOpening</a>, 
      <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/model/Enrollment.java">Enrollment</a>, 
      <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/model/Lecture.java">Lecture</a>, 
      <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/model/Person.java">Person</a>, 
      <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/model/Student.java">Student</a>,
      <a href="https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/model/I_AcademicEntity.java">I_AcademicEntity</a>
    </td>
  </tr>
  <tr>
    <td>View</td>
    <td>
      <a href= "https://github.com/wilsonsihombing/Academic-Simulator-MVC-Java/blob/main/Academic%20Simulator/src/academic/driver/Driver1.java">Driver</a>
    </td>
  </tr>
</table>





## CRUD Operations

The project implements CRUD (Create, Read, Update, Delete) operations for managing academic data:

- **Create**: Add new students, courses, enrollments, and lecturers.
- **Read**: View detailed information about students, courses, enrollments, and lecturers.
- **Update**: Modify existing student details,enrollment records namely updating remedial grade.
- **Delete**: Remove students, courses, enrollments, and lecturers from the system.

## Code Structure

The project structure follows the MVC pattern:

- **Model**: Contains Java classes representing entities such as Student, Course, Enrollment, and Lecturer.

- **View**: Represents the user interface (UI) of the application. Views are responsible for displaying information to the user and capturing user input such as adding students, enrolling students in courses, or recording grades.

- **Controller**: Consists of Java classes responsible for handling user input and updating the model and view accordingly. Each controller method corresponds to a specific action, such as adding a student, enrolling a student in a course, or recording grades.

## Contribution

Contributions to the development and improvement of the Academic Simulator project are welcome! If you have ideas for enhancements or new features, please fork this repository, make your changes, and submit a pull request.


---

Thank you for your interest in the Academic Simulator project! We hope it proves to be a valuable tool for academic institutions and students alike. Happy simulating! 🎓📚
