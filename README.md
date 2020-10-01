# EMF
EMF is a Study plan made with Ecore modeling framwork. It is part of a project during autumn 2020 in the course *TDT4250 Advanced Software Design*.

## Content
The project contains a model folder with a ecore and genmodel file. They are used to model the software and generate corresponding java code.
The src-gen folder contains the generated java files, including implementation and util files.

## Assignment 1
### The model
For assignment 1 I have modeled the software in the **eMF.ecore** file. It consists of a Programme root class. It has a opposite association and is containment for the Year class. The same relation goes for the Year and Semester class. A Semester can have several Courses thorugh the courseInSemester relationship class. A Specialization can have a relation to a Programme and Semester, and also to another Specialization it may be a part of. The model has a DataType class which enumerates legal credit values. A constraint written in OCL checks that a Programme has at least one year.
### The generated code
A constraint written in **EMFValidator.java** ensures that mandatory courses in a year dont exceed *60* credidts. In the **yearImpl.java** file the *NumberOfSemesters* inst in Year is derived from the number of semesters contained by Year.