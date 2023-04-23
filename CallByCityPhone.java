public class CallByCityPhone implements PhoneContactCaller {
    @Override
    public void call(String number) {
        System.out.printf("Вызов '%s' через городской телефон... \n", number);
    }
}
