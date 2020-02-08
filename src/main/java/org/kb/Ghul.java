package org.kb;

public class Ghul extends Monster {


    public Ghul() {
        setWeaponType(WeaponType.UNARMED);
        setHp(70);
        setStrength(90);
        setAlive(true);
    }


    @Override
    public int attack() {
        return getWeaponType().getDamage() + getStrength();
    }


}
