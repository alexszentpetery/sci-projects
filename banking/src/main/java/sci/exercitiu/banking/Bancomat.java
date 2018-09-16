package sci.exercitiu.banking;

public class Bancomat {

    public int value;
    private Card card;
    private ContBancar[] listaConturi;

    private Chitanta getMoney(Card card, int value) {
        Chitanta chitanta = new Chitanta();
        this.card = card;
        this.value = value;
        for (int i = 0; i < listaConturi.length; i++) {
            if (card.getContBancar().getIban().equals(listaConturi[i].getIban())) {
                if (card.getContBancar().sumaRamasa(value) > 0) {
                    chitanta.getChitanta();
                }
            }
        }
    }

    private int getBalance(ContBancar cont) {
        cont.getBalance();
    }

    public void initializareListaConturiAleBancomatului(ContBancar[] listaConturi) {
        this.listaConturi = listaConturi;
    }

}
