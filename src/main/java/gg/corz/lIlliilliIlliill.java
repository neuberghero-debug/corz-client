package gg.corz;

import java.util.HashMap;
import java.util.Map;

public final class lIlliilliIlliill {
   public static final int lIIIliiill = 1;
   private long llIIliiill;
   private long IlIIliiill;
   private static final int IIIIliiill = 512;
   private long ilIIliiill;
   private final Map<Long, Integer> iIIIliiill = new HashMap<>();

   public void lIiiIiIlilli() {
      this.IlIIliiill++;
      this.iIIIliiill.clear();
   }

   public int IilliliilIIi(long signature) {
      return this.iIIIliiill.getOrDefault(signature, 0);
   }

   private static long liiiIIllIl(long h, long v) {
      return (h ^ v) * 1099511628211L;
   }

   public long IlIlllIlilIl() {
      return this.ilIIliiill;
   }

   public static long IliIlllilIi(int pose, long target, long column, long geometryRevision, long inventoryRevision, long kind) {
      long var11 = -3750763034362895579L;
      var11 = liiiIIllIl(var11, (long)pose);
      var11 = liiiIIllIl(var11, target);
      var11 = liiiIIllIl(var11, column);
      var11 = liiiIIllIl(var11, geometryRevision);
      var11 = liiiIIllIl(var11, inventoryRevision);
      return liiiIIllIl(var11, kind);
   }

   public long iliIiiliiiii() {
      return this.IlIIliiill;
   }

   public long IIIllIIliIIl() {
      return this.llIIliiill;
   }

   public void IiIlliIliiIl() {
      this.iIIIliiill.clear();
   }

   public iiiiIIIlIIIIlIIl iIlIlllllill(long signature) {
      long var4 = -8200413710014444353L;
      if (this.iIIIliiill.size() >= 512 && !this.iIIIliiill.containsKey(signature)) {
         this.iIIIliiill.clear();
      }

      var4 ^= ((long)this.iIIIliiill.merge(signature, 1, Integer::sum).intValue() << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) == 1) {
         return iiiiIIIlIIIIlIIl.lliIllllIl;
      } else if ((int)(var4 >>> 32) <= 1) {
         this.ilIIliiill++;
         return iiiiIIIlIIIIlIIl.iliIllllIl;
      } else {
         this.llIIliiill++;
         return iiiiIIIlIIIIlIIl.IiiIllllIl;
      }
   }
}
