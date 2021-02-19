package uas;

public class Umur {
    private int umur;
    private String status;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String statusumur(int umur){
        if (umur >= 0 && umur <= 16){
            status = "true";
        }
        else if (umur > 16){
            status = "false";
        }

        return status;
    }
}
