# EMF
EMF is a Study plan made with Ecore modeling framework. It is part of a project during autumn 2020 in the course *TDT4250 Advanced Software Design*.

## Content
The main folder *Assignment1&2* contains the folders *EMF* and *study.html.parent*. The *EMF* folder was created for assignment 1 and is a part of assigment 2. It contains the java model. The *study.html.parent* folder was created for assignment 2. It contains generation files to make a HTML page. 

## Assignment 1

### The model
The *EMF* folder contains a model folder with an ecore and genmodel file. They are used to model the software and generate corresponding java code.
The src-gen folder contains the generated java files, including implementation and util files.

For assignment 1 I have modeled the software in the **eMF.ecore** file. It consists of a Programme root class. It has a opposite association and is containment for the Year class. The same relation goes for the Year and Semester class. Programme can also have a reference to a specialization which in turn can have a reference to a higher level specialization. A Semester can have several Courses through the courseInSemester relationship class. courseInSemster has a level int which can be used when making constraints in a study plan. The model has a DataType class which enumerates legal credit values. A constraint written in OCL checks that a Programme has at least one year.
### The generated code
A constraint written in **EMFValidator.java** ensures that mandatory courses in a year do not exceed *60* credits. In the **yearImpl.java** file the *NumberOfSemesters* int in Year is derived from the number of semesters contained by Year.

## Assignment 2

### Changes to Assignment 1
01.10.20. After working with assignment 2 following changes to the model from assignment 1 was made:
- Made a new super class named Institute
- Added manual written code to calculate *NumberOfSemesters* as described above. This replaces code in a removed reference.
- Renamed some references
- Removed some unnecessary references
- Changed some classes to be containment
- Generated a institute.xmi and moved it to *study.html/src-gen/study/html*

### Files and code
For assignment 2 I have created a seperate Xtext Project named *study.html*. The model from assignment 1 is transformed to text in **GeneratorMain.java** which is located in *study.html/src-gen/study/html*. The model is initialized with **Institute.xmi** as sample data and returned as an EObject. The **Generateor.xtend** gets the EObject as input and returns a string with the html code. **GeneratorMain.java** prints the string and saves it as **index.html** in the same folder. **index.html** together with **main.css** makes up the webpage.

I have also generated tests which are located in the *EMF.tests* folder. A test is written in **YearTest.java** testing the getNumberOfSemesters function I created in assignment 1. To run the test, go to *EMF.tests/src/eMF/tests* and run **EMFAllTests.java**

### How to download and use the project
1. Open terminal/CMD and navigate to an empty folder. Run *git clone https://github.com/Magwest1/TDT4250.git*.
2. Open eclipse and choose *Open Projects from File System...* and navigate to TDT4250. Choose *TDT4250/Assignment1&2/EMF*, *TDT4250/Assignment1&2/study.html.parent/study.html* and *TDT4250/Assignment1&2/EMF.tests*
3. Navigate to *study.html/META-INF/MANIFEST.MF*. Select the tab *Dependencies* and make sure the following are selected as *Required Plug-ins*:
    - *EMF(0.1.0)*
    - *org.eclipse.xtext*
    - *org.eclipse.xtext.xbase*
    - *org.eclipse.equinox.common;bundle-version="3.5.0"*
    - *org.eclipse.xtend.lib.source;bundle-version="2.23.0"* 
4. Navigate to *study.html/src-gen/study/html/Institute.xmi* and make desired changes to the sample data.
5. Run *study.html/src-gen/study/html/GeneratorMain.java*.
6. A generated html file will be saved to *study.html/src-gen/study/html/index.html*. Make sure *main.css* is accessible

### How to install Xtend
1. Open eclipse and choose *Help* -> *Install New Software...*
2. Paste the following URL in the field: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/
3. Open *Xtext* and install *Xtend IDE* and *Xtext Complete SDK*
