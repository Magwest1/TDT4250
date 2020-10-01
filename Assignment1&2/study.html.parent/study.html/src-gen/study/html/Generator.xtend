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
		generateOutput(ins, stringbuilder) 
		stringbuilder << '''
</body>
</html>'''
	}
	
	def dispatch void generateOutput(Institute ins, StringBuilder stringbuilder) {
		stringbuilder << "<div class='content'>\n"
    	stringbuilder << "<div class='institute'>" << ins.name << "</div>\n"
    	stringbuilder << "<h1>Study plan</h1>\n"
    	ins.programme.forEach[generateOutput(it, stringbuilder)]
    	stringbuilder << "</div>\n"

	}
	
	def dispatch void generateOutput(Programme pro, StringBuilder stringbuilder) {
		stringbuilder << "<div class='programme'>Programme: " << pro.name << "</div>\n"
		pro.years.forEach[generateOutput(it, stringbuilder)]
		pro.specializations.forEach[generateOutput(it, stringbuilder)]
	}
	
	def dispatch void generateOutput(Specialization spec, StringBuilder stringbuilder) {
		stringbuilder << "<div class='specialization'>Specialization: " << spec.name << "</div>\n"
		spec.year.forEach[generateOutput(it, stringbuilder)]
	}
	
	def dispatch void generateOutput(Year yr, StringBuilder stringbuilder) {
		stringbuilder << "<div class='year'>" << yr.yearNumber << ". Year. Showing "
		stringbuilder << yr.getNumberOfSemesters() << " semester"<< (yr.getNumberOfSemesters() > 1 ? "s:" : ":") << "</div>\n"
		yr.semesters.forEach[generateOutput(it, stringbuilder)]
	}
	
	def dispatch void generateOutput(Semester sm, StringBuilder stringbuilder) {
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
	
	def void generateOutput(Course crs, Boolean mandatory, StringBuilder stringbuilder) {
		stringbuilder << "<div class='course'>\n"
		stringbuilder << "<div class='code'>" << crs.courseCode << "</div>\n"
		stringbuilder << "<div class='name'>" << crs.courseName << "</div>\n"
		stringbuilder << "<div class='credits'>" << crs.credits << "</div>\n"
		stringbuilder << "<div class='status'>" << (mandatory ? "O" : "VA") << "</div>\n"
		stringbuilder << "</div>\n"
	}
	

	// << operator
	def StringBuilder operator_doubleLessThan(StringBuilder stringbuilder, Object o) {
		return stringbuilder.append(o);
	}
	
}