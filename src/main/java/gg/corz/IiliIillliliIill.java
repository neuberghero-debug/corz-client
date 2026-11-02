package gg.corz;

import java.util.HashMap;
import java.util.Map;

public final class IiliIillliliIill {
   private long liIililill;
   private final Map<Long, Long> IiIililill = new HashMap<>();

   public int lIiiIiIlilli() {
      return this.IiIililill.size();
   }

   public boolean iIlIlllllill(long fingerprint, long signature) {
      Long var5 = this.IiIililill.get(fingerprint);
      if (var5 == null) {
         return false;
      } else if (var5 == signature) {
         this.liIililill++;
         return true;
      } else {
         this.IiIililill.remove(fingerprint);
         return false;
      }
   }

   public void iliIiiliiiii() {
      this.IiIililill.clear();
   }

   public static long IliIlllilIi(
      long sneak, int scaffoldBase, long support, long face, int scaffoldCount, boolean target, long op, int stand, long componentKey
   ) {
      long var22 = -2823304044075448682L;
      long var14 = -3750763034362895579L;
      long[] var16 = new long[]{sneak, (long)scaffoldBase, support, face, (long)scaffoldCount, target ? 1L : 0L, op, (long)stand, componentKey};
      long[] var17 = var16;
      var22 ^= ((long)var16.length << 32 ^ var22) & -1L << 32;

      for (long var25 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var25 < (int)(var25 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
         long var20 = var17[(int)var25];
         var14 = (var14 ^ var20) * 1099511628211L;
      }

      return var14;
   }

   public void liiiIIllIl(long signature, long fingerprint) {
      this.IiIililill.put(signature, fingerprint);
   }

   public long IilliliilIIi() {
      return this.liIililill;
   }
}
