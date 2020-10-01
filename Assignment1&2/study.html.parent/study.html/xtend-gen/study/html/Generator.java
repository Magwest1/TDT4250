package study.html;

import eMF.Course;
import eMF.Institute;
import eMF.Programme;
import eMF.Semester;
import eMF.Specialization;
import eMF.Year;
import eMF.courseInSemester;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Generator {
  public String generateHtml(final Institute ins) {
    StringBuilder _stringBuilder = new StringBuilder();
    return this.generateHtml(ins, _stringBuilder).toString();
  }
  
  public CharSequence generateHtml(final Institute ins, final StringBuilder stringbuilder) {
    StringBuilder _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!DOCTYPE html>");
      _builder.newLine();
      _builder.append("<html lang=\"en\">");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("<meta charset=\"UTF-8\">");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("<link rel=\"stylesheet\" href=\"main.css\">");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("<title>Studyplan</title>");
      _builder.newLine();
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      this.operator_doubleLessThan(stringbuilder, _builder);
      this.generateOutput(ins, stringbuilder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("</body>");
      _builder_1.newLine();
      _builder_1.append("</html>");
      _xblockexpression = this.operator_doubleLessThan(stringbuilder, _builder_1);
    }
    return _xblockexpression;
  }
  
  protected void _generateOutput(final Institute ins, final StringBuilder stringbuilder) {
    this.operator_doubleLessThan(stringbuilder, "<div class=\'content\'>\n");
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'institute\'>");
    String _name = ins.getName();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _name);
    this.operator_doubleLessThan(_doubleLessThan_1, "</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<h1>Study plan</h1>\n");
    final Consumer<Programme> _function = (Programme it) -> {
      this.generateOutput(it, stringbuilder);
    };
    ins.getProgramme().forEach(_function);
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
  }
  
  protected void _generateOutput(final Programme pro, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'programme\'>Programme: ");
    String _name = pro.getName();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _name);
    this.operator_doubleLessThan(_doubleLessThan_1, "</div>\n");
    final Consumer<Year> _function = (Year it) -> {
      this.generateOutput(it, stringbuilder);
    };
    pro.getYears().forEach(_function);
    final Consumer<Specialization> _function_1 = (Specialization it) -> {
      this.generateOutput(it, stringbuilder);
    };
    pro.getSpecializations().forEach(_function_1);
  }
  
  protected void _generateOutput(final Specialization spec, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'specialization\'>Specialization: ");
    String _name = spec.getName();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _name);
    this.operator_doubleLessThan(_doubleLessThan_1, "</div>\n");
    final Consumer<Year> _function = (Year it) -> {
      this.generateOutput(it, stringbuilder);
    };
    spec.getYear().forEach(_function);
  }
  
  protected void _generateOutput(final Year yr, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'year\'>");
    int _yearNumber = yr.getYearNumber();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, Integer.valueOf(_yearNumber));
    this.operator_doubleLessThan(_doubleLessThan_1, ". Year. Showing ");
    int _numberOfSemesters = yr.getNumberOfSemesters();
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(stringbuilder, Integer.valueOf(_numberOfSemesters));
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, " semester");
    String _xifexpression = null;
    int _numberOfSemesters_1 = yr.getNumberOfSemesters();
    boolean _greaterThan = (_numberOfSemesters_1 > 1);
    if (_greaterThan) {
      _xifexpression = "s:";
    } else {
      _xifexpression = ":";
    }
    StringBuilder _doubleLessThan_4 = this.operator_doubleLessThan(_doubleLessThan_3, _xifexpression);
    this.operator_doubleLessThan(_doubleLessThan_4, "</div>\n");
    final Consumer<Semester> _function = (Semester it) -> {
      this.generateOutput(it, stringbuilder);
    };
    yr.getSemesters().forEach(_function);
  }
  
  protected void _generateOutput(final Semester sm, final StringBuilder stringbuilder) {
    this.operator_doubleLessThan(stringbuilder, "<div class=\'table\'>\n");
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'semester\'>");
    int _semesterNumber = sm.getSemesterNumber();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, Integer.valueOf(_semesterNumber));
    this.operator_doubleLessThan(_doubleLessThan_1, ". Semester</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'header\'>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'code\'>Code</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'name\'>Name</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'credits\'>SP</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'status\'>Status</div>\n");
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
    final Consumer<courseInSemester> _function = (courseInSemester it) -> {
      this.generateOutput(it.getCourse(), Boolean.valueOf(it.isMandatory()), stringbuilder);
    };
    sm.getCourses().forEach(_function);
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
  }
  
  public void generateOutput(final Course crs, final Boolean mandatory, final StringBuilder stringbuilder) {
    this.operator_doubleLessThan(stringbuilder, "<div class=\'course\'>\n");
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'code\'>");
    String _courseCode = crs.getCourseCode();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _courseCode);
    this.operator_doubleLessThan(_doubleLessThan_1, "</div>\n");
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(stringbuilder, "<div class=\'name\'>");
    String _courseName = crs.getCourseName();
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _courseName);
    this.operator_doubleLessThan(_doubleLessThan_3, "</div>\n");
    StringBuilder _doubleLessThan_4 = this.operator_doubleLessThan(stringbuilder, "<div class=\'credits\'>");
    Float _credits = crs.getCredits();
    StringBuilder _doubleLessThan_5 = this.operator_doubleLessThan(_doubleLessThan_4, _credits);
    this.operator_doubleLessThan(_doubleLessThan_5, "</div>\n");
    StringBuilder _doubleLessThan_6 = this.operator_doubleLessThan(stringbuilder, "<div class=\'status\'>");
    String _xifexpression = null;
    if ((mandatory).booleanValue()) {
      _xifexpression = "O";
    } else {
      _xifexpression = "VA";
    }
    StringBuilder _doubleLessThan_7 = this.operator_doubleLessThan(_doubleLessThan_6, _xifexpression);
    this.operator_doubleLessThan(_doubleLessThan_7, "</div>\n");
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
  }
  
  public StringBuilder operator_doubleLessThan(final StringBuilder stringbuilder, final Object o) {
    return stringbuilder.append(o);
  }
  
  public void generateOutput(final EObject ins, final StringBuilder stringbuilder) {
    if (ins instanceof Institute) {
      _generateOutput((Institute)ins, stringbuilder);
      return;
    } else if (ins instanceof Programme) {
      _generateOutput((Programme)ins, stringbuilder);
      return;
    } else if (ins instanceof Semester) {
      _generateOutput((Semester)ins, stringbuilder);
      return;
    } else if (ins instanceof Specialization) {
      _generateOutput((Specialization)ins, stringbuilder);
      return;
    } else if (ins instanceof Year) {
      _generateOutput((Year)ins, stringbuilder);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ins, stringbuilder).toString());
    }
  }
}
