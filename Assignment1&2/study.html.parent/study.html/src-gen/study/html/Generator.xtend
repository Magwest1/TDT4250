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
''' 
		generateJavascript(ins, stringbuilder)
		stringbuilder << '''
</html>
'''
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
		if (pro.specializations.size() != 0) {
			generateSelect(pro, stringbuilder)
			pro.specializations.forEach[generateOutput(it, false, stringbuilder)]			
		}
		stringbuilder << "<div class='border'></div>\n<br>\n<br>\n"
	}
	
	
	def void generateOutput(Specialization spec, Boolean secondary, StringBuilder stringbuilder) { // Generate html from data in Specialization
		//If the boolean is true we have a higher level specialization and want to use a different header
		stringbuilder << "<div id='" << spec.name.replaceAll("\\s","") << "' style='display: none;'>\n"
		stringbuilder << "<div class='specialization" << (secondary ? "-secondary'" : "'") << ">Specialization: " << spec.name << "</div>\n"
		spec.year.forEach[generateOutput(it, stringbuilder)]
		if (spec.requiredSpecialization.size() != 0) {
			generateSelect(spec, stringbuilder)
			spec.requiredSpecialization.forEach[generateOutput(it, true, stringbuilder)]
		}
		stringbuilder << "</div>\n"
	}
	
	def dispatch void generateSelect(Programme pro, StringBuilder stringbuilder) { // Generate HTML select element with specializations in a programme
		stringbuilder << "<select class='default' id='select" << pro.name.replaceAll("\\s","") << "' name='select" << pro.name.replaceAll("\\s","") << "'>\n"
		stringbuilder << "<option value='' selected>Select specialization...</option>\n"
		pro.specializations.forEach[generateSelectOption(it, stringbuilder)]
		stringbuilder << "</select>\n"
	}
	
	def dispatch void generateSelect(Specialization spec, StringBuilder stringbuilder) { // Generate HTML select element with specializations in specializations
		stringbuilder << "<select class='default' id='select" << spec.name.replaceAll("\\s","") << "' name='select" << spec.name.replaceAll("\\s","") << "'>\n"
		stringbuilder << "<option value='' selected>Select specialization...</option>\n"
		spec.requiredSpecialization.forEach[generateSelectOption(it, stringbuilder)]
		stringbuilder << "</select>\n"
	}
	
	def void generateSelectOption(Specialization spec, StringBuilder stringbuilder) { // Generate options in select element
		stringbuilder << "<option value='"<< spec.name.replaceAll("\\s","") << "'>" << spec.name << "</option>\n"
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
	
	def dispatch void generateJavascript(Institute ins, StringBuilder stringbuilder) { // Creates javascript html tags and calls function to generate javascript code
		stringbuilder << "<script>\n"
		ins.programme.forEach[generateJavascript(it, stringbuilder)]
		stringbuilder << "</script>\n"
	}
	
	def dispatch void generateJavascript(Programme pro, StringBuilder stringbuilder) { // Generates functions to listen for a selection of specialization in a programme
		stringbuilder << "var elem" << pro.name.replaceAll("\\s","") << " = document.getElementById('select" << pro.name.replaceAll("\\s","") << "');\n"
		stringbuilder << "elem" << pro.name.replaceAll("\\s","") << ".onchange = function(){\n"
		pro.specializations.forEach[generateJavascript(it, stringbuilder)]
		stringbuilder << "};\n"
		pro.specializations.forEach[generateJavascriptRequiredSpec(it, stringbuilder)] // Recursive function to generate javascript for all specializations in specialization
	}
	
	def dispatch void generateJavascript(Specialization spec, StringBuilder stringbuilder) { // Shows or hides content based on selection
		stringbuilder << "var hiddenDiv" << spec.name.replaceAll("\\s","") << " = document.getElementById('" << spec.name.replaceAll("\\s","") << "');\n"
		stringbuilder << "hiddenDiv" << spec.name.replaceAll("\\s","") << ".style.display = (this.value == '" << spec.name.replaceAll("\\s","") << "') ? 'block':'none';\n"
		
	}
	
	def void generateJavascriptRequiredSpec(Specialization spec, StringBuilder stringbuilder) { // Recursive function to generate javascript for all specializations in specialization
		if (spec.requiredSpecialization.size() != 0) {
			stringbuilder << "var elem" << spec.name.replaceAll("\\s","") << " = document.getElementById('select" << spec.name.replaceAll("\\s","") << "');\n"
			stringbuilder << "elem" << spec.name.replaceAll("\\s","") << ".onchange = function(){\n"
			spec.requiredSpecialization.forEach[generateJavascript(it, stringbuilder)]
			stringbuilder << "};\n"
			spec.requiredSpecialization.forEach[generateJavascriptRequiredSpec(it, stringbuilder)]
		} else {
			return
		}
	}
	
	// << Operator
	def StringBuilder operator_doubleLessThan(StringBuilder stringbuilder, Object o) {
		return stringbuilder.append(o);
	}
	
}