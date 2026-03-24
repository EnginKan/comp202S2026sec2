package Proxy;

import java.util.List;

public interface DBInterafce {

    public String getStudentByID(String ID) throws RoleDoesNotSupportException;
    public List<String> getAllStudents();
    public int deleteStudent(String ID);

}
