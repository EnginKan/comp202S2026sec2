package Proxy;


import java.util.List;

public class StudentProxy implements DBInterafce {

    private User user;
    private StudentDatabase service=new StudentDatabase();


    public StudentProxy(User user) {
        this.user = user;
    }

    @Override
    public String getStudentByID(String ID) throws RoleDoesNotSupportException {
        if(this.user.role.equalsIgnoreCase("admin"))
        return  service.getStudentByID(ID);
        else
            throw new RoleDoesNotSupportException("You do not have permission");
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
