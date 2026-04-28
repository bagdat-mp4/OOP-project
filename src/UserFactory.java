package src;

import src.enums.UserType;
import src.models.User;
import src.models.employees.*;
import src.models.students.*;

public class UserFactory {

    public UserFactory() {}

    public User createUser(UserType type) {
        switch (type) {
            case STUDENT:
                return new Student();
            case GRADUATE_STUDENT:
                return new GraduateStudent();
            case TEACHER:
                return new Teacher();
            case MANAGER:
                return new Manager();
            case ADMIN:
                return new Admin();
            case TECH_SUPPORT:
                return new TechSupportSpecialist();
            default:
                System.out.println("Unknown user type: " + type);
                return null;
        }
    }
}