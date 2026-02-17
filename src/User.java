public class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Methods must exist in User class because Main uses 'User' reference type
    public void manageService(Service s) {
        System.out.println("[User] " + name + " is attempting to manage " + s.getServiceName());
    }

    public void useService(Service s) {
        System.out.println("[User] " + name + " is attempting to use " + s.getServiceName());
        if (s != null) {
            s.performService();
        }
    }
}