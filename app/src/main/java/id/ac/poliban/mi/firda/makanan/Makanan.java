package id.ac.poliban.mi.firda.makanan;

public class Makanan {
    private String image;
    private String makananName;
    private String makananDesc;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMakananName() {
        return makananName;
    }

    public void setMakananName(String makananName) {
        this.makananName = makananName;
    }

    public String getMakananDesc() {
        return makananDesc;
    }

    public void setMakananDesc(String makananDesc) {
        this.makananDesc = makananDesc;
    }

    public Makanan(String image, String makananName, String makananDesc) {
        this.image = image;
        this.makananName = makananName;
        this.makananDesc = makananDesc;


    }
}
