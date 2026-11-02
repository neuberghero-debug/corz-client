package gg.corz;

import java.util.HashSet;

public final class ilillIiill {
   private final HashSet<Long> lIIiIIiiIIiIIi;
   public final long IiilIIiliilIIi;
   public final long iiilIIiIIIiIIi;

   public boolean IliIlllilIi() {
      return this.lIIiIIiiIIiIIi != null;
   }

   private ilillIiill(long shared, long clock, HashSet<Long> fingerprint) {
      this.IiilIIiliilIIi = shared;
      this.iiilIIiIIIiIIi = clock;
      this.lIIiIIiiIIiIIi = fingerprint;
   }

   ilillIiill IilliliilIIi(long clockNow) {
      return new ilillIiill(clockNow, this.iiilIIiIIIiIIi, this.lIIiIIiiIIiIIi);
   }

   public int liiiIIllIl() {
      return this.lIIiIIiiIIiIIi == null ? 0 : this.lIIiIIiiIIiIIi.size();
   }

   public ilillIiill(long footprint, long fingerprint, long[] clock) {
      long var11 = 2905074380932002082L;
      super();
      this.IiilIIiliilIIi = footprint;
      this.iiilIIiIIIiIIi = fingerprint;
      if (clock != null && clock.length != 0) {
         this.lIIiIIiiIIiIIi = new HashSet<>(clock.length * 2);
         long[] var6 = clock;
         var11 ^= ((long)clock.length << 32 ^ var11) & -1L << 32;

         for (long var14 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            long var9 = var6[(int)var14];
            this.lIIiIIiiIIiIIi.add(var9);
         }
      } else {
         this.lIIiIIiiIIiIIi = null;
      }
   }

   public boolean iIlIlllllill(long feet) {
      return this.lIIiIIiiIIiIIi == null || this.lIIiIIiiIIiIIi.contains(feet);
   }
}
