public class IPhone implements SmartPhones, IOS{
    @Override
    public void call() {
        System.out.println("  дзвінок IPhone ");
    }

    @Override
    public void sms() {
        System.out.println("  sms IPhone ");
    }

    @Override
    public void internet() {
        System.out.println("  internet IPhone ");
    }
}
