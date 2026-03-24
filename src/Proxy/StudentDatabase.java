package Proxy;

import java.util.List;

//ReaL service unit
public class StudentDatabase implements DBInterafce{

    private String path="";
    private String url="jbdc:sqlite:"+path;

    @Override
    public String getStudentByID(String ID) {
        return "Student"+ID;
    }

    @Override
    public List<String> getAllStudents() {
        return List.of();
    }

    @Override
    public int deleteStudent(String ID) {
        return 0;
    }
}
