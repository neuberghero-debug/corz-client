package gg.corz;

import net.minecraft.class_243;

record lIllIlIliIllIlIl(int id, class_243 from, long tick, boolean low) {
   private final long lIllliilIl;
   private final boolean iIllliilIl;
   private final class_243 IIllliilIl;
   private final int iiIlliilIl;

   private lIllIlIliIllIlIl(int id, class_243 from, long tick, boolean low) {
      this.iiIlliilIl = id;
      this.IIllliilIl = from;
      this.lIllliilIl = tick;
      this.iIllliilIl = low;
   }

   public boolean IilliliilIIi() {
      return this.iIllliilIl;
   }

   public long iIlIlllllill() {
      return this.lIllliilIl;
   }

   public int IliIlllilIi() {
      return this.iiIlliilIl;
   }

   public class_243 liiiIIllIl() {
      return this.IIllliilIl;
   }
}
