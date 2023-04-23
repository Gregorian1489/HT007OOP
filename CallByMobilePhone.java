public class CallByMobilePhone implements PhoneContactCaller {
    @Override
    public void call(String number) {
        System.out.printf("Вызов '%s' через мобильный телефон... \n", number);
    }
}
