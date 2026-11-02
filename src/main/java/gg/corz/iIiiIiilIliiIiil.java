package gg.corz;

import java.util.function.LongSupplier;

public final class iIiiIiilIliiIiil {
   private int IliiIIilil = -1;
   private long iliiIIilil;
   private long lliiIIilil;

   public boolean IliIlllilIi(int rollDelayMs, long entityId, LongSupplier nowMs) {
      if (rollDelayMs != this.IliiIIilil) {
         this.IliiIIilil = rollDelayMs;
         this.lliiIIilil = entityId;
         this.iliiIIilil = Math.max(0L, nowMs.getAsLong());
      }

      return entityId - this.lliiIIilil >= this.iliiIIilil;
   }

   public void liiiIIllIl() {
      this.IliiIIilil = -1;
      this.iliiIIilil = 0L;
   }

   public int iIlIlllllill() {
      return this.IliiIIilil;
   }
}
