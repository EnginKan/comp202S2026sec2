package Proxy;

public class Client {

    public static void main(String[] args) {

        User user = new User("role1");

        DBInterafce db= new StudentProxy(user);

        try {
            System.out.println(db.getStudentByID("3123123123"));
        } catch (RoleDoesNotSupportException e) {
            throw new RuntimeException(e);
        }
    }
}
