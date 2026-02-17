public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    private boolean isPremium;

    // TODO: constructor
    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal
        if (isActive()) {
            if (isPremium) {
                System.out.println("Streaming 4K content with no ads.");
            } else {
                System.out.println("Streaming standard content.");
            }
        } else {
            System.out.println("Service is inactive. Cannot perform streaming.");
        }

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        isPremium = true;
        System.out.println(getServiceName() + " upgraded to Premium!");

    }
}