package gg.corz;

import java.util.Arrays;
import java.util.HashMap;

public final class iIllIIliIlllIIli {
   private long lIiillIlIi;
   public static final int iilillIlIi = 3;
   private int iIiillIlIi;
   private final HashMap<Long, Integer> IIiillIlIi = new HashMap<>();

   public boolean lIiiIiIlilli(long signature) {
      return this.IilliliilIIi(signature) >= 3;
   }

   public int IIIllIIliIIl() {
      return this.iIiillIlIi;
   }

   public static long IlIlllIlilIl(long[] cells) {
      long var9 = -6230805940511530769L;
      long[] var1 = (long[])cells.clone();
      Arrays.sort(var1);
      long var2 = 1469598103934665603L;
      long[] var4 = var1;
      var9 ^= ((long)var1.length << 32 ^ var9) & -1L << 32;

      for (long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         long var7 = var4[(int)var12];
         var2 = (var2 ^ var7) * 1099511628211L;
      }

      return var2 ^ (long)var1.length;
   }

   public void IliIlllilIi(int confirms) {
      this.liiiIIllIl((long)confirms);
   }

   public int IilliliilIIi(long signature) {
      return this.IIiillIlIi.getOrDefault(signature, 0);
   }

   public void liiiIIllIl(long token) {
      if (token != this.lIiillIlIi) {
         this.lIiillIlIi = token;
         this.IIiillIlIi.clear();
      }
   }

   public lllIiiiillIiii iliIiiliiiii(lllIiiiillIiii current) {
      this.iIiillIlIi++;
      lllIiiiillIiii[] var2 = lllIiiiillIiii.values();
      return current.ordinal() + 1 < var2.length ? var2[current.ordinal() + 1] : lllIiiiillIiii.illIliiIIl;
   }

   public int iIlIlllllill(long signature) {
      return this.IIiillIlIi.merge(signature, 1, Integer::sum);
   }

   public iIllIIliIlllIIli() {
      this.lIiillIlIi = Long.MIN_VALUE;
   }
}
