package sci.exercitiu.banking;

public class Persoana {
    private String account;
    private String name;
    private int cnp;
    private ContBancar conturi[];


    private Persoana(String name, int cnp, ContBancar[] cont) {
        this.name = name;
        this.cnp = cnp;
        this.conturi = cont;
    }

    public int getCnp() {
        return cnp;
    }

    public void setAccount(String account) {
        this.account = account
    }

    public void setCard() {

    }

    public ContBancar[] getConturi() {
        return conturi;
    }

    public void setConturi(ContBancar[] conturi) {
        this.conturi = conturi;
    }
}
