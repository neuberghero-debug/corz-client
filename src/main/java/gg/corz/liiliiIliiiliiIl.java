package gg.corz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class liiliiIliiiliiIl {
   public static final int iIililIlll = 2;
   private int liililIlll;
   public static final int llililIlll = 4;
   private final Map<Long, ilIIiIiIiIIiIi> ilililIlll = new HashMap<>();
   private int lIIiilIlll;
   private int iIIiilIlll;
   public static final int IIIiilIlll = 1024;
   public static final int lIililIlll = 1;
   private final Set<Long> IiililIlll = new HashSet<>();
   public static final int IlililIlll = 3;
   private int iiililIlll;

   public long IlIlllIlilIl(long family) {
      ilIIiIiIiIIiIi var3 = this.ilililIlll.get(family);
      return var3 == null ? 0L : var3.IliIlllilIi();
   }

   public boolean IIIllIIliIIl(long family) {
      return this.ilililIlll.containsKey(family);
   }

   public int Iilllilliill() {
      return this.IiililIlll.size();
   }

   public void IIlllIlliIll() {
      this.IiililIlll.add(Long.MIN_VALUE + (long)(++this.iIIiilIlll));
   }

   public int IlIillIiilIi() {
      return this.ilililIlll.size();
   }

   public void IiIiliIiiiIi() {
      this.ilililIlll.clear();
      this.IiililIlll.clear();
   }

   public int Iiilliiliiil() {
      return this.liililIlll;
   }

   public void IiIlliIliiIl() {
      this.IiililIlll.clear();
   }

   public void liiiIIllIl(long tick, long family, int fingerprint) {
      this.iIlIlllllill(tick, family, fingerprint);
      this.IiililIlll.add(tick);
   }

   public boolean Ililllililil() {
      return false;
   }

   public int IIIilIIiiIIi() {
      return this.iiililIlll;
   }

   public void Illlllllilll() {
      this.IiililIlll.removeIf(k -> k < -9223372036853775808L);
   }

   public int iliIiiliiiii() {
      return this.lIIiilIlll;
   }

   public static long IliIlllilIi(int baseZ, int ownerY, int ownerX, int ownerZ, int baseY, int baseX, int kind) {
      long var15 = 8435356283621752739L;
      long var7 = -3750763034362895579L;
      long[] var9 = new long[]{(long)baseZ, (long)ownerY, (long)ownerX, (long)ownerZ, (long)(baseY >> 2), (long)(baseX >> 2), (long)(kind >> 2)};
      long[] var10 = var9;
      var15 ^= ((long)var9.length << 32 ^ var15) & -1L << 32;

      for (long var18 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
         long var13 = var10[(int)var18];
         var7 = (var7 ^ var13) * 1099511628211L;
      }

      return var7;
   }

   public iilIlliIIiIlli IIillIiliIil() {
      long var2 = -4554707114252072839L;
      var2 ^= ((long)this.IiililIlll.size() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) <= 0) {
         return iilIlliIIiIlli.lllIilIIIl;
      } else if ((int)(var2 >>> 32) == 1) {
         return iilIlliIIiIlli.illIilIIIl;
      } else {
         return (int)(var2 >>> 32) == 2 ? iilIlliIIiIlli.IilIilIIIl : iilIlliIIiIlli.lilIilIIIl;
      }
   }

   public int lIiiIiIlilli(long fingerprint, long family) {
      ilIIiIiIiIIiIi var5 = this.ilililIlll.get(fingerprint);
      if (var5 != null && var5.IliIlllilIi() != family) {
         this.ilililIlll.remove(fingerprint);
         this.IiililIlll.remove(fingerprint);
         this.lIIiilIlll++;
         return 1;
      } else {
         return 0;
      }
   }

   public void iIlIlllllill(long tick, long family, int fingerprint) {
      if (this.ilililIlll.size() >= 1024 && !this.ilililIlll.containsKey(tick)) {
         Iterator var6 = this.ilililIlll.keySet().iterator();
         var6.next();
         var6.remove();
      }

      this.ilililIlll.put(tick, new ilIIiIiIiIIiIi(family, fingerprint));
      this.liililIlll++;
      this.iiililIlll++;
   }

   public boolean IilliliilIIi(long fingerprint, long family) {
      ilIIiIiIiIIiIi var5 = this.ilililIlll.get(fingerprint);
      return var5 != null && var5.IliIlllilIi() == family;
   }
}
