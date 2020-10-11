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
      this.operator_doubleLessThan(stringbuilder, _builder_1);
      this.generateJavascript(ins, stringbuilder);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("</html>");
      _builder_2.newLine();
      _xblockexpression = this.operator_doubleLessThan(stringbuilder, _builder_2);
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
    int _size = pro.getSpecializations().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      this.generateSelect(pro, stringbuilder);
      final Consumer<Specialization> _function_1 = (Specialization it) -> {
        this.generateOutput(it, Boolean.valueOf(false), stringbuilder);
      };
      pro.getSpecializations().forEach(_function_1);
    }
    this.operator_doubleLessThan(stringbuilder, "<div class=\'border\'></div>\n<br>\n<br>\n");
  }
  
  public void generateOutput(final Specialization spec, final Boolean secondary, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div id=\'");
    String _replaceAll = spec.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _replaceAll);
    this.operator_doubleLessThan(_doubleLessThan_1, "\' style=\'display: none;\'>\n");
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(stringbuilder, "<div class=\'specialization");
    String _xifexpression = null;
    if ((secondary).booleanValue()) {
      _xifexpression = "-secondary\'";
    } else {
      _xifexpression = "\'";
    }
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _xifexpression);
    StringBuilder _doubleLessThan_4 = this.operator_doubleLessThan(_doubleLessThan_3, ">Specialization: ");
    String _name = spec.getName();
    StringBuilder _doubleLessThan_5 = this.operator_doubleLessThan(_doubleLessThan_4, _name);
    this.operator_doubleLessThan(_doubleLessThan_5, "</div>\n");
    final Consumer<Year> _function = (Year it) -> {
      this.generateOutput(it, stringbuilder);
    };
    spec.getYear().forEach(_function);
    int _size = spec.getRequiredSpecialization().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      this.generateSelect(spec, stringbuilder);
      final Consumer<Specialization> _function_1 = (Specialization it) -> {
        this.generateOutput(it, Boolean.valueOf(true), stringbuilder);
      };
      spec.getRequiredSpecialization().forEach(_function_1);
    }
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
  }
  
  protected void _generateSelect(final Programme pro, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<select class=\'default\' id=\'select");
    String _replaceAll = pro.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _replaceAll);
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(_doubleLessThan_1, "\' name=\'select");
    String _replaceAll_1 = pro.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _replaceAll_1);
    this.operator_doubleLessThan(_doubleLessThan_3, "\'>\n");
    this.operator_doubleLessThan(stringbuilder, "<option value=\'\' selected>Select specialization...</option>\n");
    final Consumer<Specialization> _function = (Specialization it) -> {
      this.generateSelectOption(it, stringbuilder);
    };
    pro.getSpecializations().forEach(_function);
    this.operator_doubleLessThan(stringbuilder, "</select>\n");
  }
  
  protected void _generateSelect(final Specialization spec, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<select class=\'default\' id=\'select");
    String _replaceAll = spec.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _replaceAll);
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(_doubleLessThan_1, "\' name=\'select");
    String _replaceAll_1 = spec.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _replaceAll_1);
    this.operator_doubleLessThan(_doubleLessThan_3, "\'>\n");
    this.operator_doubleLessThan(stringbuilder, "<option value=\'\' selected>Select specialization...</option>\n");
    final Consumer<Specialization> _function = (Specialization it) -> {
      this.generateSelectOption(it, stringbuilder);
    };
    spec.getRequiredSpecialization().forEach(_function);
    this.operator_doubleLessThan(stringbuilder, "</select>\n");
  }
  
  public void generateSelectOption(final Specialization spec, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<option value=\'");
    String _replaceAll = spec.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _replaceAll);
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(_doubleLessThan_1, "\'>");
    String _name = spec.getName();
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _name);
    this.operator_doubleLessThan(_doubleLessThan_3, "</option>\n");
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
  
  protected void _generateJavascript(final Institute ins, final StringBuilder stringbuilder) {
    this.operator_doubleLessThan(stringbuilder, "<script>\n");
    final Consumer<Programme> _function = (Programme it) -> {
      this.generateJavascript(it, stringbuilder);
    };
    ins.getProgramme().forEach(_function);
    this.operator_doubleLessThan(stringbuilder, "</script>\n");
  }
  
  protected void _generateJavascript(final Programme pro, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "var elem");
    String _replaceAll = pro.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _replaceAll);
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(_doubleLessThan_1, " = document.getElementById(\'select");
    String _replaceAll_1 = pro.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _replaceAll_1);
    this.operator_doubleLessThan(_doubleLessThan_3, "\');\n");
    StringBuilder _doubleLessThan_4 = this.operator_doubleLessThan(stringbuilder, "elem");
    String _replaceAll_2 = pro.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_5 = this.operator_doubleLessThan(_doubleLessThan_4, _replaceAll_2);
    this.operator_doubleLessThan(_doubleLessThan_5, ".onchange = function(){\n");
    final Consumer<Specialization> _function = (Specialization it) -> {
      this.generateJavascript(it, stringbuilder);
    };
    pro.getSpecializations().forEach(_function);
    this.operator_doubleLessThan(stringbuilder, "};\n");
    final Consumer<Specialization> _function_1 = (Specialization it) -> {
      this.generateJavascriptRequiredSpec(it, stringbuilder);
    };
    pro.getSpecializations().forEach(_function_1);
  }
  
  protected void _generateJavascript(final Specialization spec, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "var hiddenDiv");
    String _replaceAll = spec.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _replaceAll);
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(_doubleLessThan_1, " = document.getElementById(\'");
    String _replaceAll_1 = spec.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _replaceAll_1);
    this.operator_doubleLessThan(_doubleLessThan_3, "\');\n");
    StringBuilder _doubleLessThan_4 = this.operator_doubleLessThan(stringbuilder, "hiddenDiv");
    String _replaceAll_2 = spec.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_5 = this.operator_doubleLessThan(_doubleLessThan_4, _replaceAll_2);
    StringBuilder _doubleLessThan_6 = this.operator_doubleLessThan(_doubleLessThan_5, ".style.display = (this.value == \'");
    String _replaceAll_3 = spec.getName().replaceAll("\\s", "");
    StringBuilder _doubleLessThan_7 = this.operator_doubleLessThan(_doubleLessThan_6, _replaceAll_3);
    this.operator_doubleLessThan(_doubleLessThan_7, "\') ? \'block\':\'none\';\n");
  }
  
  public void generateJavascriptRequiredSpec(final Specialization spec, final StringBuilder stringbuilder) {
    int _size = spec.getRequiredSpecialization().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "var elem");
      String _replaceAll = spec.getName().replaceAll("\\s", "");
      StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _replaceAll);
      StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(_doubleLessThan_1, " = document.getElementById(\'select");
      String _replaceAll_1 = spec.getName().replaceAll("\\s", "");
      StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _replaceAll_1);
      this.operator_doubleLessThan(_doubleLessThan_3, "\');\n");
      StringBuilder _doubleLessThan_4 = this.operator_doubleLessThan(stringbuilder, "elem");
      String _replaceAll_2 = spec.getName().replaceAll("\\s", "");
      StringBuilder _doubleLessThan_5 = this.operator_doubleLessThan(_doubleLessThan_4, _replaceAll_2);
      this.operator_doubleLessThan(_doubleLessThan_5, ".onchange = function(){\n");
      final Consumer<Specialization> _function = (Specialization it) -> {
        this.generateJavascript(it, stringbuilder);
      };
      spec.getRequiredSpecialization().forEach(_function);
      this.operator_doubleLessThan(stringbuilder, "};\n");
      final Consumer<Specialization> _function_1 = (Specialization it) -> {
        this.generateJavascriptRequiredSpec(it, stringbuilder);
      };
      spec.getRequiredSpecialization().forEach(_function_1);
    } else {
      return;
    }
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
    } else if (ins instanceof Year) {
      _generateOutput((Year)ins, stringbuilder);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ins, stringbuilder).toString());
    }
  }
  
  public void generateSelect(final EObject pro, final StringBuilder stringbuilder) {
    if (pro instanceof Programme) {
      _generateSelect((Programme)pro, stringbuilder);
      return;
    } else if (pro instanceof Specialization) {
      _generateSelect((Specialization)pro, stringbuilder);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(pro, stringbuilder).toString());
    }
  }
  
  public void generateJavascript(final EObject ins, final StringBuilder stringbuilder) {
    if (ins instanceof Institute) {
      _generateJavascript((Institute)ins, stringbuilder);
      return;
    } else if (ins instanceof Programme) {
      _generateJavascript((Programme)ins, stringbuilder);
      return;
    } else if (ins instanceof Specialization) {
      _generateJavascript((Specialization)ins, stringbuilder);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ins, stringbuilder).toString());
    }
  }
}
