package gg.corz;

import java.util.List;

public record Ilililillilili(String name, List<String> lore, lIillIIiiIillIIi tool, double durability) {
   private final String IiiIlIlIIl;
   private final double IIIllIlIIl;
   private final lIillIIiiIillIIi iiiIlIlIIl;
   private final List<String> liiIlIlIIl;

   public String IliIlllilIi() {
      return this.IiiIlIlIIl;
   }

   public Ilililillilili(String name, List<String> lore, lIillIIiiIillIIi tool, double durability) {
      this.IiiIlIlIIl = name;
      this.liiIlIlIIl = lore;
      this.iiiIlIlIIl = tool;
      this.IIIllIlIIl = durability;
   }

   public lIillIIiiIillIIi iIlIlllllill() {
      return this.iiiIlIlIIl;
   }

   public double IilliliilIIi() {
      return this.IIIllIlIIl;
   }

   public List<String> liiiIIllIl() {
      return this.liiIlIlIIl;
   }
}
