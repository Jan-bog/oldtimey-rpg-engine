package inventory;

import java.util.Map;

public class WeaponItem extends Item {
    private int minDmg = -1;
    private int maxDmg = -1;
    private boolean is1H = true;
    private boolean isShield = false;

    public boolean isShield() {
        return isShield;
    }

    public void setShield(boolean shield) {
        isShield = shield;
    }

    private String scalingStat = "";

    public int getMinDmg() {
        return minDmg;
    }

    public void setMinDmg(int minDmg) {
        this.minDmg = minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public void setMaxDmg(int maxDmg) {
        this.maxDmg = maxDmg;
    }

    public boolean isIs1H() {
        return is1H;
    }

    public void setIs1H(boolean is1H) {
        this.is1H = is1H;
    }

    public String getScalingStat() {
        return scalingStat;
    }

    public void setScalingStat(String scalingStat) {
        this.scalingStat = scalingStat;
    }

    public WeaponItem(WeaponItem weapon) {
        super(weapon.getItemID(), weapon.getName(), weapon.getDescription(), "Weapon",
                weapon.getBuyValue(), weapon.getStatBoons(), weapon.getStatRequirements());
        this.minDmg = weapon.getMinDmg();
        this.maxDmg = weapon.getMaxDmg();
        this.is1H = weapon.isIs1H();
        this.isShield = weapon.isShield();
        this.scalingStat = weapon.getScalingStat();
    }
    public WeaponItem(int itemID, String name, String description, int itemValue, Map<String, Integer> statBoons,
                      Map<String, Integer> statRequirements,
                      int minDmg, int maxDmg, boolean is1H, boolean isShield, String scalingStat) {
        super(itemID, name, description, "Weapon", itemValue, statBoons, statRequirements);
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.is1H = is1H;
        this.isShield = isShield;
        this.scalingStat = scalingStat;
    }
}
