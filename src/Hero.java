public class Hero {
    private String heroAtackType;
    private int demage;
    private int hiels;
    public Hero(String heroAtackType, int demage, int hiels){
        this.heroAtackType = heroAtackType;
        this.demage = demage;
        this.hiels = hiels;
    }
    public Hero (int demage, int hiels){
        this.hiels = hiels;
        this.demage = demage;
    }
    public int getDemage() {
        return demage;
    }
    public int getHiels() {
        return hiels;
    }

    public String getHeroAtackType() {
        return heroAtackType;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }
    public void setHiels(int hiels) {
        this.hiels = hiels;
    }
    public void setHeroAtackType(String heroAtackType) {
        this.heroAtackType = heroAtackType;
    }
}


