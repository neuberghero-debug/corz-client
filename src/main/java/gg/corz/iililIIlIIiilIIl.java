package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.LongPredicate;

public final class iililIIlIIiilIIl {
   private final HashMap<Long, Long> lIlIIIilIl = new HashMap<>();
   private long iIlIIIilIl;

   public long[] IliIlllilIi(long[] ordered, int probes, LongPredicate eligible) {
      long var8 = 5972688909690421785L;
      ArrayList var4 = new ArrayList();

      for (var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < ordered.length; var8 += 4294967296L) {
         long var6 = ordered[(int)(var8 >>> 32)];
         if (eligible.test(var6)) {
            var4.add(new long[]{var6, this.lIlIIIilIl.getOrDefault(var6, Long.MIN_VALUE), (long)((int)(var8 >>> 32))});
         }
      }

      var4.sort((a, b) -> a[1] != b[1] ? Long.compare(a[1], b[1]) : Long.compare(a[2], b[2]));
      var8 ^= ((long)Math.min(probes, var4.size()) << 32 ^ var8) & -1L << 32;
      long[] var10 = new long[(int)(var8 >>> 32)];

      for (long var13 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         var10[(int)var13] = ((long[])var4.get((int)var13))[0];
         this.lIlIIIilIl.put(var10[(int)var13], ++this.iIlIIIilIl);
      }

      return var10;
   }

   public void IilliliilIIi() {
      this.lIlIIIilIl.clear();
      this.iIlIIIilIl = 0L;
   }

   public boolean liiiIIllIl(long[] ordered) {
      long var7 = 2355838697893658006L;
      long[] var2 = ordered;
      var7 ^= ((long)ordered.length << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         long var5 = var2[(int)var10];
         if (!this.lIlIIIilIl.containsKey(var5)) {
            return false;
         }
      }

      return true;
   }

   public int iIlIlllllill() {
      return this.lIlIIIilIl.size();
   }
}
