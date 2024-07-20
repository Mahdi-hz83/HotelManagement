package Rooms;

import java.time.LocalDate;

public class Services {
    private final String serviceName;
    private final double servicePrice;
    private final LocalDate usageTime;

    public Services(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.usageTime = LocalDate.now();
    }
    public String getServiceName() {return serviceName;}
    public double getServicePrice() {return servicePrice;}
    public LocalDate getUsageTime() {return usageTime;}
}
