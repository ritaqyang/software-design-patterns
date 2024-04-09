package ca.mcgill.cs.swdesign.GUI.simplemvc;

public class StudentController {

    private Student model;
    private StudentView view;
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){ model.setName(name);}
    public void setRollNumber(String rollNo){ model.setRollNo(rollNo);}
    public String getStudentName(){ return model.getName(); }
    public String getStudentRollNumber(){ return model.getRollNo(); }
}
