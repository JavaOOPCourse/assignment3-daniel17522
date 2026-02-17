public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean isPremium;

    // TODO: constructor
    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if (isActive()) {
            System.out.println("Accessing cloud storage.");
        } else {
            System.out.println("Service is inactive. Cannot access cloud storage.");
        }

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        isPremium = true;
        System.out.println(getServiceName() + " upgraded to Premium with extra storage!");

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Generating bill for " + getServiceName() + " based on storage usage.");

    }
}