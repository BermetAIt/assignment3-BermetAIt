public class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("[Admin] " + name + " is configuring " + s.getServiceName());
        // Admin logic could include activating/deactivating
        if (!s.isActive()) {
            s.activateService();
        }
    }
}