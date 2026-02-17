public class CloudStorageService extends Service implements PremiumFeature, Billable {
    private boolean isPremium = false;
    private double usageCost = 0.0;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("[Cloud] Cannot access storage: Service is inactive.");
            return;
        }
        System.out.println("[Cloud] Syncing files to " + getServiceName() + "...");
        this.usageCost += 5.0; // Simulate usage cost
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println("[Cloud] " + getServiceName() + " upgraded to PREMIUM (More storage).");
    }

    @Override
    public void generateBill() {
        System.out.println("[Billing] Bill for " + getServiceName() + ": $" + usageCost);
    }
}