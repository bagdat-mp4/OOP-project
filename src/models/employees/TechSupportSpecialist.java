package src.models.employees;

import src.DataStore;
import src.enums.RequestStatus;

import java.util.*;

public class TechSupportSpecialist extends Employee {

    public TechSupportSpecialist() {
        super();
    }

    public List<TechSupportRequest> viewRequests() {
        List<TechSupportRequest> requests =
                DataStore.getInstance().getTechSupportRequests();

        if (requests.isEmpty()) {
            System.out.println("No new requests.");
            return requests;
        }

        System.out.println("===== Tech Support Requests =====");
        for (TechSupportRequest request : requests) {
            if (request.getStatus() == RequestStatus.NEW) {
                request.setStatus(RequestStatus.VIEWED);
            }
            System.out.println(request);
        }
        return requests;
    }

    public void changeStatus(TechSupportRequest request, RequestStatus status) {
        request.setStatus(status);
        System.out.printf("Request updated: [%s] %s%n",
                status, request.getIssue());
    }

    @Override
    public String toString() {
        return String.format("TechSupportSpecialist[ %s %s ]",
                getFirstName(), getLastName());
    }
}