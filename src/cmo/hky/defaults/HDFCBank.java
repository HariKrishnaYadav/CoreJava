package cmo.hky.defaults;

class HDFCBank implements InternetBanking, MobileBanking {

    @Override
    public void transferMoney() {
        InternetBanking.super.transferMoney();
        MobileBanking.super.transferMoney();
    }

    public static void main(String[] args) {
        HDFCBank bank = new HDFCBank();
        bank.transferMoney();
    }
}