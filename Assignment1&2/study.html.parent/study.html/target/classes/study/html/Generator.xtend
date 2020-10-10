package study.html

import eMF.Course
import eMF.Institute
import eMF.Programme
import eMF.Semester
import eMF.Specialization
import eMF.Year

class Generator {
	
	def String generateHtml(Institute ins) {
		generateHtml(ins, new StringBuilder).toString
	}

	def CharSequence generateHtml(Institute ins, StringBuilder stringbuilder) {
		stringbuilder << '''
<!DOCTYPE html>
<html lang="en">
<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <link rel="stylesheet" href="main.css">
	    <title>Studyplan</title>
</head>
<body>
'''	
		generateOutput(ins, stringbuilder) // Start generating content based on the Institute EObject
		stringbuilder << '''
</body>
</html>'''
	}
	
	def dispatch void generateOutput(Institute ins, StringBuilder stringbuilder) { // Generate html from data in Institute 
		stringbuilder << "<div class='content'>\n"
    	stringbuilder << "<div class='institute'>" << ins.name << "</div>\n"
    	stringbuilder << "<h1>Study plan</h1>\n"
    	ins.programme.forEach[generateOutput(it, stringbuilder)]
    	stringbuilder << "</div>\n"

	}
	
	def dispatch void generateOutput(Programme pro, StringBuilder stringbuilder) { // Generate html from data in Programme
		stringbuilder << "<div class='programme'>Programme: " << pro.name << "</div>\n"
		pro.years.forEach[generateOutput(it, stringbuilder)]
		pro.specializations.forEach[generateOutput(it, false, stringbuilder)]
		stringbuilder << "<div class='border'></div>\n<br>\n<br>\n"
	}
	
	def void generateOutput(Specialization spec, Boolean secondary, StringBuilder stringbuilder) { // Generate html from data in Specialization
		//If the boolean is true we have a higher level specialization and want to use a different header
		stringbuilder << "<div class='specialization" << (secondary ? "-secondary'" : "'") << ">Specialization: " << spec.name << "</div>\n"
		spec.year.forEach[generateOutput(it, stringbuilder)]
		spec.requiredSpecialization.forEach[generateOutput(it, true, stringbuilder)]
	}
	
	def dispatch void generateOutput(Year yr, StringBuilder stringbuilder) { // Generate html from data in Year
		stringbuilder << "<div class='year'>" << yr.yearNumber << ". Year. Showing "
		// Check number of semesters with function made in assignment 1 and print the text accordingly
		stringbuilder << yr.getNumberOfSemesters() << " semester"<< (yr.getNumberOfSemesters() > 1 ? "s:" : ":") << "</div>\n"
		yr.semesters.forEach[generateOutput(it, stringbuilder)]
	}
	
	def dispatch void generateOutput(Semester sm, StringBuilder stringbuilder) { // Generate html from data in Semester
		stringbuilder << "<div class='table'>\n"
		stringbuilder << "<div class='semester'>" << sm.semesterNumber << ". Semester</div>\n"
		stringbuilder << "<div class='header'>\n"
		stringbuilder << "<div class='code'>Code</div>\n"
        stringbuilder << "<div class='name'>Name</div>\n"
        stringbuilder << "<div class='credits'>SP</div>\n"
        stringbuilder << "<div class='status'>Status</div>\n"
        stringbuilder << "</div>\n"
		sm.courses.forEach[generateOutput(it.course, it.mandatory, stringbuilder)]
		stringbuilder << "</div>\n"
	}
	
	def void generateOutput(Course crs, Boolean mandatory, StringBuilder stringbuilder) { // Generate html from data in Course
		stringbuilder << "<div class='course'>\n"
		stringbuilder << "<div class='code'>" << crs.courseCode << "</div>\n"
		stringbuilder << "<div class='name'>" << crs.courseName << "</div>\n"
		stringbuilder << "<div class='credits'>" << crs.credits << "</div>\n"
		stringbuilder << "<div class='status'>" << (mandatory ? "O" : "VA") << "</div>\n" // Check if course is mandatory
		stringbuilder << "</div>\n"
	}
	

	// << Operator
	def StringBuilder operator_doubleLessThan(StringBuilder stringbuilder, Object o) {
		return stringbuilder.append(o);
	}
	
}