import java.util.*;

public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName) {
        for(Service service : services) {
            if(service.getServiceName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached " + serviceName);
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exists = false;

        for(Service service : services){
            if(service.getServiceName().equalsIgnoreCase(newService.getServiceName())) {
                exists = true;
            }
        }
        if(!exists) {
            services.add(newService);
        }
    }
}