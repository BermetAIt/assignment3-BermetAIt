public class Customer extends User {
    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public void useService(Service s) {
        System.out.println("[Customer] " + name + " is consuming " + s.getServiceName());
        if (s != null) {
            s.performService();
        }
    }
}