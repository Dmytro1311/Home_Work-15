public class Android implements SmartPhones, LinuxOS {

    @Override
    public void call() {
        System.out.println("  дзвінок Android ");
    }

    @Override
    public void sms() {
        System.out.println("  sms Android ");
    }

    @Override
    public void internet() {
        System.out.println("  internet Android ");
    }
}
