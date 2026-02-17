public class StreamingService extends Service implements PremiumFeature {
    private boolean isPremium = false;

    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("[Streaming] Cannot stream: Service is inactive.");
            return;
        }
        if (isPremium) {
            System.out.println("[Streaming] Streaming 4K HDR content (Premium)...");
        } else {
            System.out.println("[Streaming] Streaming SD content (Standard)...");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println("[Streaming] " + getServiceName() + " upgraded to PREMIUM.");
    }
}