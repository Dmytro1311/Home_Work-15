public class Main {
    public static void main(String[] args) {
        SmartPhones[] smartPhones = {new Android(), new IPhone()};
        for (SmartPhones phones : smartPhones){
            phones.call();
            phones.sms();
            phones.internet();
        }


    }
}