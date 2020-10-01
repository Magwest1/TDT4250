# EMF
EMF is a Study plan made with Ecore modeling framework. It is part of a project during autumn 2020 in the course *TDT4250 Advanced Software Design*.

## Content
The main folder **Assignment1&2** contains the folders **EMF** and **study.html.parent**. The **EMF** folder was created for assignment 1 and is a part of assigment 2. It contains the java model. The **study.html.parent** folder was created for assignment 2. It contains generation files to make a HTML page. 

## Assignment 1
### The model
The **EMF** folder contains a model folder with an ecore and genmodel file. They are used to model the software and generate corresponding java code.
The src-gen folder contains the generated java files, including implementation and util files.

For assignment 1 I have modeled the software in the **eMF.ecore** file. It consists of a Programme root class. It has a opposite association and is containment for the Year class. The same relation goes for the Year and Semester class. A Semester can have several Courses through the courseInSemester relationship class. A Specialization can have a relation to a Programme and Semester, and also to another Specialization it may be a part of. The model has a DataType class which enumerates legal credit values. A constraint written in OCL checks that a Programme has at least one year.
### The generated code
A constraint written in **EMFValidator.java** ensures that mandatory courses in a year do not exceed *60* credits. In the **yearImpl.java** file the *NumberOfSemesters* int in Year is derived from the number of semesters contained by Year.
### Changes
01.10.20. After working with assignment 2 following changes to the model from assignment 1 was made:
- Made a new super class named Institute
- Added manual written code to calculate *NumberOfSemesters* as described above
- Renamed some of the references
- Removed some unnecessary references

## Assignment 2
For assignment 2 I created a seperate Xtext Project named **study.html**. The model from assignment 1 is transformed to text in **GeneratorMain.java** which is located in study.html/src-gen/study/html. The model is initialized with **Institute.xmi** as sample data and returned as an EObject. The **Generateor.xtend** gets the EObject as input and returns a string with the html code. **GeneratorMain.java** prints the string and saves it as **index.html** in the same folder. **index.html** together with **main.css** makes up the webpage.