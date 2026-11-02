package gg.corz;

import java.util.Map;

public record lIliIlIiiIliIlIi(
   int slot, int kind, double score, boolean keep, boolean junk, double durability, double base, Map<String, Integer> enchants, Map<String, Integer> curses
) {
   private final Map<String, Integer> IilIiIIIIi;
   private final int IIlIiIIIIi;
   private final Map<String, Integer> lilIiIIIIi;
   private final double illIiIIIIi;
   private final int iiIIiIIIIi;
   private final boolean iIlIiIIIIi;
   private final double lIlIiIIIIi;
   private final double lllIiIIIIi;
   private final boolean IllIiIIIIi;

   public Map<String, Integer> IiIlliIliiIl() {
      return this.lilIiIIIIi;
   }

   public double IIIllIIliIIl() {
      return this.illIiIIIIi;
   }

   public lIliIlIiiIliIlIi(
      int slot, int kind, double score, boolean keep, boolean junk, double durability, double base, Map<String, Integer> enchants, Map<String, Integer> curses
   ) {
      this.iiIIiIIIIi = slot;
      this.IIlIiIIIIi = kind;
      this.lIlIiIIIIi = score;
      this.iIlIiIIIIi = keep;
      this.IllIiIIIIi = junk;
      this.lllIiIIIIi = durability;
      this.illIiIIIIi = base;
      this.IilIiIIIIi = enchants;
      this.lilIiIIIIi = curses;
   }

   public boolean IilliliilIIi() {
      return this.iIlIiIIIIi;
   }

   public boolean lIiiIiIlilli() {
      return this.IllIiIIIIi;
   }

   public double iIlIlllllill() {
      return this.lIlIiIIIIi;
   }

   public double iliIiiliiiii() {
      return this.lllIiIIIIi;
   }

   public Map<String, Integer> IlIlllIlilIl() {
      return this.IilIiIIIIi;
   }

   public lIliIlIiiIliIlIi(int kind, int junk, double slot, boolean keep, boolean durability, double score) {
      this(kind, junk, slot, keep, durability, score, slot, Map.of(), Map.of());
   }

   public int liiiIIllIl() {
      return this.IIlIiIIIIi;
   }

   public int IliIlllilIi() {
      return this.iiIIiIIIIi;
   }
}
