public class Admin extends User {

    // TODO: constructor
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        // print admin managing message
        System.out.println("Admin is managing " + s.getServiceName());

    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print admin using message
        // call performService()
        System.out.println("Admin is using " + s.getServiceName());
        s.performService();

    }
}