package sci.exercitiu.banking;

public class ContBancar {
    private String contBancar;
    private String iban;
    public Card card;
    private int balance;

    public void setContBancar(String contBancar,String iban, Card card, int balance){
        this.contBancar=contBancar;
        this.iban=iban;
        this.card=card;
        this.balance=balance;

    }
    public int sumaRamasa(Bancomat sumaPeCareOScot ) {
        return  balance - sumaPeCareOScot.value;
    }

    public String getContBancar() {
        return contBancar;
    }

    public void setContBancar(String contBancar) {
        this.contBancar = contBancar;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
