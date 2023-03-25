import java.util.Arrays;

public class Farm {

    private String addres;
    private Cow[]cows;
    private Horse[]horses;
    private Sheep[]sheep;
    private String OwnerName;

    public Farm(String addres, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.addres = addres;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        OwnerName = ownerName;
    }

    public Farm() {
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "addres='" + addres + '\'' +"\n"+
                ", cows=" + Arrays.toString(cows) +"\n"+
                ", horses=" + Arrays.toString(horses) +"\n"+
                ", sheep=" + Arrays.toString(sheep) +"\n"+
                ", OwnerName='" + OwnerName + '\'' +"\n"+
                '}';
    }
}
