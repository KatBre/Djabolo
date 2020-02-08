package org.kb.Actor;

import org.kb.WeaponType;

public abstract class Creature {
   protected int hp;
   protected boolean alive;
   protected int strength;
   protected WeaponType weaponType;

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

   public boolean isAlive() {
      return alive;
   }

   public void setAlive(boolean alive) {
      this.alive = alive;
   }

   public int getStrength() {
      return strength;
   }

   public void setStrength(int strength) {
      this.strength = strength;
   }

   public WeaponType getWeaponType() {
      return weaponType;
   }

   public void setWeaponType(WeaponType weaponType) {
      this.weaponType = weaponType;
   }

   public void receiveDamage(int dmg){
      setHp(getHp() - dmg);
      if (getHp() <= 0){
         setAlive(false);
         System.out.println("Received " + dmg +  " dmg");
      }
   }
}
