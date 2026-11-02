package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class lIIlIiIliIIlIiIl {
   private int IllIIliIll;
   public static final int llIIIliIll = 3;
   public static final int iIIIIliIll = 1;
   public static final int IlIIIliIll = 2;
   private final Map<Long, Map<Long, lIIIIlIliIIIIlIl>> IIlIIliIll = new HashMap<>();
   public static final int IilIIliIll = 3;
   public static final long IiIIIliIll = 1800000L;
   public static final int liIIIliIll = 512;
   private boolean illIIliIll;
   public static final int iiIIIliIll = 20000;
   public static final int lIIIIliIll = 0;
   private int lIlIIliIll = 0;
   private int lllIIliIll;
   private int iIlIIliIll = 0;
   public static final int ilIIIliIll = 4;

   public int IIIilIIiiIIi() {
      return this.lllIIliIll;
   }

   public int Iiilliiliiil() {
      return this.IllIIliIll;
   }

   public List<lIIIIlIliIIIIlIl> IlIillIiilIi() {
      ArrayList var1 = new ArrayList();

      for (Map var3 : this.IIlIIliIll.values()) {
         var1.addAll(var3.values());
      }

      return var1;
   }

   public int IiIlliIliiIl(int minAgeMs, int pz, int now, int py, long px, long radius) {
      long var23 = -4840206591443532743L;
      long var25 = 387701818426949971L;
      long var27 = 4226657440091194800L;
      long var29 = 6604707579536847180L;
      long var31 = -6370144301140432873L;
      var23 ^= (0L ^ var23) & -1L << 32;
      var23 ^= ((long)((py >> 4) + 1) ^ var23) & -1L >>> 32;
      var25 ^= ((long)(minAgeMs >> 4) << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)(now >> 4) ^ var25) & -1L >>> 32;
      var27 ^= ((long)((int)(var25 >>> 32) - (int)var23) << 32 ^ var27) & -1L << 32;

      while ((int)(var27 >>> 32) <= (int)(var25 >>> 32) + (int)var23) {
         for (var27 ^= ((long)((int)var25 - (int)var23) ^ var27) & -1L >>> 32;
            (int)var27 <= (int)var25 + (int)var23;
            var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32
         ) {
            long var15 = lIiiIIIiiIiiIIIi.IliIlllilIi((int)(var27 >>> 32), (int)var27);
            Map var17 = this.IIlIIliIll.get(var15);
            if (var17 != null) {
               Iterator var18 = var17.values().iterator();

               while (var18.hasNext()) {
                  lIIIIlIliIIIIlIl var19 = (lIIIIlIliIIIIlIl)var18.next();
                  if (var19.IIlIIiilIl && px - var19.iiIIIiilIl >= radius) {
                     var29 ^= ((long)Math.abs(var19.llIIIiilIl - minAgeMs) << 32 ^ var29) & -1L << 32;
                     var29 ^= ((long)Math.abs(var19.ilIIIiilIl - pz) ^ var29) & -1L >>> 32;
                     var31 ^= ((long)Math.abs(var19.IiIIIiilIl - now) << 32 ^ var31) & -1L << 32;
                     if (Math.max((int)(var29 >>> 32), Math.max((int)var29, (int)(var31 >>> 32))) <= py) {
                        var18.remove();
                        this.lIlIIliIll--;
                        var23 += 4294967296L;
                     }
                  }
               }

               if (var17.isEmpty()) {
                  this.IIlIIliIll.remove(var15);
               }
            }
         }

         var27 += 4294967296L;
      }

      return (int)(var23 >>> 32);
   }

   public void IIIllIIliIIl(int token, int y, int z, Object now, long x) {
      lIIIIlIliIIIIlIl var7 = this.IilliliilIIi(token, y, z);
      if (var7 != null) {
         if (now != null) {
            var7.liIIIiilIl = now;
         }

         var7.iiIIIiilIl = x;
         var7.IIlIIiilIl = false;
      }
   }

   public int IlIlllIlilIl(long centerChunkZ, int now, int radiusChunks, int centerChunkX) {
      long var16 = 3721092616936181661L;
      long var18 = -6271712473385655406L;
      var16 ^= (0L ^ var16) & -1L << 32;
      Iterator var7 = this.IIlIIliIll.entrySet().iterator();

      while (var7.hasNext()) {
         Map.Entry var8 = (Map.Entry)var7.next();
         long var9 = (Long)var8.getKey();
         var16 ^= ((long)((int)(var9 & 4294967295L)) ^ var16) & -1L >>> 32;
         var18 ^= ((long)((int)(var9 >> 32)) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)(Math.abs((int)var16 - now) <= centerChunkX && Math.abs((int)(var18 >>> 32) - radiusChunks) <= centerChunkX ? 0 : 1) ^ var18)
            & -1L >>> 32;
         if ((int)var18 != 0) {
            var16 ^= ((long)((int)(var16 >>> 32) + ((Map)var8.getValue()).size()) << 32 ^ var16) & -1L << 32;
            this.lIlIIliIll = this.lIlIIliIll - ((Map)var8.getValue()).size();
            var7.remove();
         } else {
            Iterator var14 = ((Map)var8.getValue()).values().iterator();

            while (var14.hasNext()) {
               lIIIIlIliIIIIlIl var15 = (lIIIIlIliIIIIlIl)var14.next();
               if (centerChunkZ - var15.iiIIIiilIl > 1800000L) {
                  var14.remove();
                  this.lIlIIliIll--;
                  var16 += 4294967296L;
               }
            }

            if (((Map)var8.getValue()).isEmpty()) {
               var7.remove();
            }
         }
      }

      return (int)(var16 >>> 32);
   }

   public boolean lIiiIiIlilli(int x, int z, int y) {
      long var8 = 6796057934656348467L;
      long var4 = lIiiIIIiiIiiIIIi.IliIlllilIi(x >> 4, y >> 4);
      Map var6 = this.IIlIIliIll.get(var4);
      if (var6 == null) {
         return false;
      } else {
         var8 ^= ((long)(var6.remove(IliIlllilIi(x, z, y)) != null ? 1 : 0) << 32 ^ var8) & -1L << 32;
         if ((int)(var8 >>> 32) != 0) {
            this.lIlIIliIll--;
         }

         if (var6.isEmpty()) {
            this.IIlIIliIll.remove(var4);
         }

         return (boolean)((int)(var8 >>> 32));
      }
   }

   public Map<Long, lIIIIlIliIIIIlIl> iliIiiliiiii(long chunkKey) {
      Map var3 = this.IIlIIliIll.get(chunkKey);
      return var3 == null ? Collections.emptyMap() : Collections.unmodifiableMap(var3);
   }

   public void Iilllilliill() {
      this.illIIliIll = true;
   }

   public void IIlllIlliIll() {
      this.IIlIIliIll.clear();
      this.lIlIIliIll = 0;
      this.iIlIIliIll = this.IllIIliIll = this.lllIIliIll = 0;
      this.illIIliIll = false;
   }

   public static long IliIlllilIi(int z, int y, int x) {
      return (long)(z & 67108863) | (long)(x & 67108863) << 26 | (long)(y & 4095) << 52;
   }

   public int Ililllililil() {
      return this.iIlIIliIll;
   }

   public lIIlIiIliIIlIiIl() {
      this.IllIIliIll = 0;
      this.lllIIliIll = 0;
      this.illIIliIll = false;
   }

   public lIIIIlIliIIIIlIl IilliliilIIi(int y, int x, int z) {
      Map var4 = this.IIlIIliIll.get(lIiiIIIiiIiiIIIi.IliIlllilIi(y >> 4, z >> 4));
      return var4 == null ? null : (lIIIIlIliIIIIlIl)var4.get(IliIlllilIi(y, x, z));
   }

   public boolean Illlllllilll() {
      return this.illIIliIll || this.IllIIliIll >= 1 || this.iIlIIliIll >= 3;
   }

   public int IIillIiliIil() {
      return this.lIlIIliIll;
   }

   private void iIlIlllllill(int now, int hidden, int x, Object y, long token, boolean z) {
      long var8 = lIiiIIIiiIiiIIIi.IliIlllilIi(now >> 4, x >> 4);
      Map var10 = this.IIlIIliIll.computeIfAbsent(var8, k -> new HashMap<>());
      long var11 = IliIlllilIi(now, hidden, x);
      lIIIIlIliIIIIlIl var13 = (lIIIIlIliIIIIlIl)var10.get(var11);
      if (var13 == null) {
         if (var10.size() >= 512 || this.lIlIIliIll >= 20000) {
            return;
         }

         var10.put(var11, new lIIIIlIliIIIIlIl(now, hidden, x, y, token, z));
         this.lIlIIliIll++;
      } else {
         if (y != null) {
            var13.liIIIiilIl = y;
         }

         var13.iiIIIiilIl = token;
         var13.IIlIIiilIl = z;
      }
   }

   public boolean liiiIIllIl(int newToken, int z, int now, int x, int newClass, Object oldClass, Object oldToken, long y) {
      if (x == 2 && newClass == 3) {
         this.iIlIlllllill(newToken, z, now, oldToken, y, false);
         this.iIlIIliIll++;
         return true;
      } else if (x == 3 && newClass == 2) {
         this.iIlIlllllill(newToken, z, now, oldClass, y, true);
         this.IllIIliIll++;
         return true;
      } else if (x == 3) {
         if (this.lIiiIiIlilli(newToken, z, now)) {
            this.lllIIliIll++;
         }

         return false;
      } else {
         if (newClass == 3) {
            lIIIIlIliIIIIlIl var10 = this.IilliliilIIi(newToken, z, now);
            if (var10 != null) {
               var10.liIIIiilIl = oldToken;
               var10.iiIIIiilIl = y;
               var10.IIlIIiilIl = false;
            }
         }

         return false;
      }
   }
}
