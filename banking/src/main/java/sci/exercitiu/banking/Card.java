package sci.exercitiu.banking;

import java.util.Date;

public class Card {
    private Date date;
    private int PIN;
    private int cardNumber;
    private ContBancar contBancar;

    public Card(Date date, int PIN, int number, ContBancar contBancar) {
        this.date = date;
        this.PIN = PIN;
        this.cardNumber = number;
        this.contBancar = contBancar;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ContBancar getContBancar() {
        return contBancar;
    }
}
