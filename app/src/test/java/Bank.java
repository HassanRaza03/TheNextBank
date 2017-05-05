/**
 * Created by Hasan.Raza on 5/4/2017.
 */

public class Bank {

    private String name;
    private int amount;
    private String report;
    private String pass;
    public int actv;
    private int limt = 500;

    public Bank(String n,int a,String p,int act)
    {
        name = n;
        amount = a;
        report = "Account Open. Amount is : "+amount;
        pass = p;
        actv = act;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getActv() {
        return actv;
    }

    public void setActv(int actv) {
        this.actv = actv;
    }

    public int getLimt() {
        return limt;
    }

    public void setLimt(int limt) {
        this.limt = limt;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
