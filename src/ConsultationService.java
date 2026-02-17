public class ConsultationService extends Service implements Billable {
    private double consultationFee = 50.0;

    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("[Consult] Cannot consult: Service is inactive.");
            return;
        }
        System.out.println("[Consult] Starting video consultation on " + getServiceName() + "...");
    }

    @Override
    public void generateBill() {
        System.out.println("[Billing] Bill for " + getServiceName() + ": $" + consultationFee);
    }
}