public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if (isActive()) {
            System.out.println("Conducting online consultation session.");
        } else {
            System.out.println("Service is inactive. Cannot conduct consultation.");
        }

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Generating bill for " + getServiceName() + " based on session duration.");

    }
}