package gg.corz;

import java.util.LinkedHashSet;

public record IiIlIiiliIlIii(long foreignHash, long ownHash, long[] sectionKeys, long[] sectionHashes) {
   public static final IiIlIiiliIlIii IiIIiilIIl = new IiIlIiiliIlIii(0L, 0L, new long[0], new long[0]);
   private final long[] ilIIiilIIl;
   private final long[] llIIiilIIl;
   private final long IlIIiilIIl;
   private final long iIIIiilIIl;

   public long[] iliIiiliiiii() {
      return this.llIIiilIIl;
   }

   public long lIiiIiIlilli() {
      return this.IlIIiilIIl;
   }

   public long[] IIIllIIliIIl() {
      return this.ilIIiilIIl;
   }

   private static int iIlIlllllill(long[] a, long v) {
      long var4 = 5513475186008690078L;

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < a.length; var6 += 4294967296L) {
         if (a[(int)(var6 >>> 32)] == v) {
            return (int)(var6 >>> 32);
         }
      }

      return -1;
   }

   public long IilliliilIIi() {
      return this.iIIIiilIIl;
   }

   public IiIlIiiliIlIii(long foreignHash, long ownHash, long[] sectionKeys, long[] sectionHashes) {
      sectionKeys = sectionKeys == null ? new long[0] : sectionKeys;
      sectionHashes = sectionHashes != null && sectionHashes.length == sectionKeys.length ? sectionHashes : new long[sectionKeys.length];
      this.iIIIiilIIl = foreignHash;
      this.IlIIiilIIl = ownHash;
      this.llIIiilIIl = sectionKeys;
      this.ilIIiilIIl = sectionHashes;
   }

   public IiIlIiiliIlIii liiiIIllIl(long[] keys, lIlIiIiliIlIiIil clock) {
      long var11 = 7235532389763718439L;
      long var13 = -8257831827171051551L;
      if (keys != null && keys.length != 0) {
         LinkedHashSet var3 = new LinkedHashSet();
         long[] var4 = this.llIIiilIIl;
         var11 ^= ((long)var4.length << 32 ^ var11) & -1L << 32;

         for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            long var7 = var4[(int)var11];
            var3.add(Long.valueOf(var7));
         }

         var4 = keys;
         var11 ^= ((long)keys.length << 32 ^ var11) & -1L << 32;

         for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            long var17 = var4[(int)var11];
            var3.add(Long.valueOf(var17));
         }

         var4 = new long[var3.size()];
         long[] var5 = new long[var3.size()];
         var11 ^= (0L ^ var11) & -1L >>> 32;

         for (long var8 : var3) {
            var4[(int)var11] = var8;
            var13 ^= ((long)iIlIlllllill(this.llIIiilIIl, var8) << 32 ^ var13) & -1L << 32;
            var5[(int)var11] = (int)(var13 >>> 32) >= 0 ? this.ilIIiilIIl[(int)(var13 >>> 32)] : clock.contentHash(var8);
            var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32;
         }

         return new IiIlIiiliIlIii(this.iIIIiilIIl, this.IlIIiilIIl, var4, var5);
      } else {
         return this;
      }
   }

   public IiIlIiiliIlIii IliIlllilIi(long[] hashes) {
      return new IiIlIiiliIlIii(this.iIIIiilIIl, this.IlIIiilIIl, this.llIIiilIIl, hashes);
   }
}
