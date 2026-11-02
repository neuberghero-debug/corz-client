package gg.corz;

import java.util.HashMap;
import net.minecraft.class_1792;

record iIilllIiIlilllIi(HashMap<class_1792, Integer> counts, int freeSlots, int slots) {
   private final int iIIiiiIIIi;
   private final int IlIiiiIIIi;
   private final HashMap<class_1792, Integer> lIIiiiIIIi;

   public int iIlIlllllill() {
      return this.IlIiiiIIIi;
   }

   private iIilllIiIlilllIi(HashMap<class_1792, Integer> counts, int freeSlots, int slots) {
      this.lIIiiiIIIi = counts;
      this.iIIiiiIIIi = freeSlots;
      this.IlIiiiIIIi = slots;
   }

   public int liiiIIllIl() {
      return this.iIIiiiIIIi;
   }

   public HashMap<class_1792, Integer> IliIlllilIi() {
      return this.lIIiiiIIIi;
   }
}
