package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;

public final class IiIIIiIlliIIIiIl {
   private final Long2LongOpenHashMap IIiIlIiIll;
   private long iIiIlIiIll;
   private final Long2IntOpenHashMap iilIlIiIll = new Long2IntOpenHashMap();
   private final Long2IntOpenHashMap lIiIlIiIll;

   public void IIillIiliIil() {
      this.iilIlIiIll.clear();
      this.IIiIlIiIll.clear();
      this.lIiIlIiIll.clear();
      this.iIiIlIiIll = 0L;
   }

   public void liiiIIllIl(int y, int x, int z) {
      this.iilIlIiIll.addTo(IliIlllilIi(y, x, z), 1);
   }

   public long IiIlliIliiIl() {
      return this.iIiIlIiIll;
   }

   public void IilliliilIIi(int y, int x, int z, long oldStateId, long newStateId) {
      this.liiiIIllIl(y, x, z);
      if (oldStateId != newStateId) {
         long var8 = IliIlllilIi(y, x, z);
         long var10 = iIlIlllllill(y, x, z, oldStateId) ^ iIlIlllllill(y, x, z, newStateId);
         this.IIiIlIiIll.put(var8, this.IIiIlIiIll.get(var8) ^ var10);
      }
   }

   public long lIiiIiIlilli(long sectionKey) {
      return this.IIiIlIiIll.getOrDefault(sectionKey, 0L);
   }

   public long IIlllIlliIll(int z1, int z0, int y0, int y1, int x0, int x1) {
      long var17 = -1166716722322080200L;
      long var15 = 1099019634829716296L;
      long var7 = -3750763034362895579L;
      var15 ^= ((long)(z1 >> 4) << 32 ^ var15) & -1L << 32;

      while ((int)(var15 >>> 32) <= y1 >> 4) {
         for (var15 ^= ((long)(z0 >> 4) ^ var15) & -1L >>> 32; (int)var15 <= x0 >> 4; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            var17 ^= ((long)(y0 >> 4) << 32 ^ var17) & -1L << 32;

            while ((int)(var17 >>> 32) <= x1 >> 4) {
               long var12 = ((long)((int)(var15 >>> 32)) & 16777215L) << 40 | ((long)((int)var15) & 65535L) << 24 | (long)((int)(var17 >>> 32)) & 16777215L;
               var17 ^= ((long)this.lIiIlIiIll.getOrDefault(var12, 0) ^ var17) & -1L >>> 32;
               var7 = (var7 ^ var12 * 31L + (long)((int)var17)) * 1099511628211L;
               var17 += 4294967296L;
            }
         }

         var15 += 4294967296L;
      }

      return var7;
   }

   public long iliIiiliiiii(int z, int r, int y, int x) {
      long var13 = -2854560640851504516L;
      long var15 = 3483824508039619707L;
      long var5 = -3750763034362895579L;
      var13 ^= ((long)(z - x >> 4) << 32 ^ var13) & -1L << 32;

      while ((int)(var13 >>> 32) <= z + x >> 4) {
         for (var13 ^= ((long)(r - x >> 4) ^ var13) & -1L >>> 32; (int)var13 <= r + x >> 4; var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
            var15 ^= ((long)(y - x >> 4) << 32 ^ var15) & -1L << 32;

            while ((int)(var15 >>> 32) <= y + x >> 4) {
               long var10 = ((long)((int)(var13 >>> 32)) & 16777215L) << 40 | ((long)((int)var13) & 65535L) << 24 | (long)((int)(var15 >>> 32)) & 16777215L;
               var15 ^= ((long)this.iilIlIiIll.getOrDefault(var10, 0) ^ var15) & -1L >>> 32;
               var5 = (var5 ^ var10 * 31L + (long)((int)var15)) * 1099511628211L;
               var15 += 4294967296L;
            }
         }

         var13 += 4294967296L;
      }

      return var5;
   }

   public long Iilllilliill(int x, int rx, int ryUp, int ryDown, int z, int y, int rz) {
      long var16 = -7087669591613706553L;
      long var18 = -4707556752938117198L;
      long var8 = -3750763034362895579L;
      var16 ^= ((long)(x - ryDown >> 4) << 32 ^ var16) & -1L << 32;

      while ((int)(var16 >>> 32) <= x + ryDown >> 4) {
         for (var16 ^= ((long)(rx - y >> 4) ^ var16) & -1L >>> 32; (int)var16 <= rx + z >> 4; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
            var18 ^= ((long)(ryUp - rz >> 4) << 32 ^ var18) & -1L << 32;

            while ((int)(var18 >>> 32) <= ryUp + rz >> 4) {
               long var13 = ((long)((int)(var16 >>> 32)) & 16777215L) << 40 | ((long)((int)var16) & 65535L) << 24 | (long)((int)(var18 >>> 32)) & 16777215L;
               var18 ^= ((long)this.lIiIlIiIll.getOrDefault(var13, 0) ^ var18) & -1L >>> 32;
               var8 = (var8 ^ var13 * 31L + (long)((int)var18)) * 1099511628211L;
               var18 += 4294967296L;
            }
         }

         var16 += 4294967296L;
      }

      return var8;
   }

   public void IlIlllIlilIl(int y, int z, int x) {
      this.lIiIlIiIll.addTo(IliIlllilIi(y, z, x), 1);
      this.iIiIlIiIll++;
   }

   public static long IliIlllilIi(int x, int y, int z) {
      return ((long)(x >> 4) & 16777215L) << 40 | ((long)(y >> 4) & 65535L) << 24 | (long)(z >> 4) & 16777215L;
   }

   public IiIIIiIlliIIIiIl() {
      this.IIiIlIiIll = new Long2LongOpenHashMap();
      this.lIiIlIiIll = new Long2IntOpenHashMap();
   }

   public int IIIllIIliIIl() {
      return this.iilIlIiIll.size();
   }

   private static long iIlIlllllill(int z, int x, int stateId, long y) {
      long var5 = (long)z * -7046029254386353131L ^ (long)x * -4417276706812531889L ^ (long)stateId * 1609587929392839161L ^ y * 2870177450012600261L;
      var5 ^= var5 >>> 29;
      var5 *= -4658895280553007687L;
      return var5 ^ var5 >>> 32;
   }

   public int Illlllllilll(long sectionKey) {
      return this.lIiIlIiIll.getOrDefault(sectionKey, 0);
   }
}
