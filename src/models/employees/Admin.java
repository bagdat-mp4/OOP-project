package src.models.employees;

import src.DataStore;
import src.GlobalMessage;
import src.models.User;
import src.models.UserAction;

import java.util.*;

public class Admin extends Employee {

    public Admin() {
        super();
    }


    public void addUser(User user) {
        DataStore.getInstance().addUser(user);
        System.out.println("User added: " + user.getFirstName());
    }


    public void removeUser(User user) {
        DataStore.getInstance().removeUser(user);
        System.out.println("User removed: " + user.getFirstName());
    }


    public void updateUser(User user) {
        System.out.println("User updated: " + user.getFirstName()
                + " " + user.getLastName());
    }


    public List<UserAction> viewAllLogs() {
        List<UserAction> logs = DataStore.getInstance().getLogs();
        System.out.println("===== All Logs =====");
        for (UserAction action : logs) {
            System.out.println(action.getDetails());
        }
        return logs;
    }


    public List<UserAction> viewUserLogs(User user) {
        List<UserAction> allLogs = DataStore.getInstance().getLogs();
        List<UserAction> userLogs = new ArrayList<>();

        for (UserAction action : allLogs) {
            if (action.getActor().equals(user)) {
                userLogs.add(action);
            }
        }

        System.out.println("===== Logs: " + user.getFirstName() + " =====");
        for (UserAction action : userLogs) {
            System.out.println(action.getDetails());
        }
        return userLogs;
    }


    public void sendGlobalMessage(GlobalMessage message) {
        System.out.println("Global message sent: " + message);
    }

    @Override
    public String toString() {
        return String.format("Admin[ %s %s ]",
                getFirstName(), getLastName());
    }
}