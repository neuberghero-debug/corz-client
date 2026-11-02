package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2338.class_2339;

final class IiIlliIlliIlliIl {
   private final Long2LongOpenHashMap iliiliiIll;
   private final class_2338 IIiiliiIll;
   private final Long2ByteOpenHashMap liiiliiIll;
   private final boolean iIiiliiIll;
   private final long IliiliiIll;
   private final class_1937 iililiiIll;
   private final int lIiiliiIll;
   private int IIIIiiiIll;
   private final class_2339 iiiiliiIll;
   private final LongOpenHashSet IiiiliiIll;
   private final LongArrayFIFOQueue lliiliiIll = new LongArrayFIFOQueue();

   IiIlliIlliIlliIl(class_1937 maxDrop, class_2338 w, int from) {
      this.iliiliiIll = new Long2LongOpenHashMap();
      this.IiiiliiIll = new LongOpenHashSet();
      this.liiiliiIll = new Long2ByteOpenHashMap();
      this.iiiiliiIll = new class_2339();
      this.iililiiIll = maxDrop;
      this.IIiiliiIll = w;
      this.lIiiliiIll = from;
      this.iIiiliiIll = from <= 16 && liiiIIllIl(w);
      this.IliiliiIll = w.method_10063();
      this.lliiliiIll.enqueue(this.IliiliiIll);
      this.iliiliiIll.put(this.IliiliiIll, this.IliiliiIll);
   }

   private List<class_2338> IlIlllIlilIl(long toKey) {
      ArrayList var3 = new ArrayList();
      long var4 = toKey;

      while (var4 != this.IliiliiIll) {
         var3.add(class_2338.method_10092(var4));
         var4 = this.iliiliiIll.get(var4);
      }

      Collections.reverse(var3);
      return var3;
   }

   private boolean iliIiiliiiii(int x, int y, int z) {
      long var7 = 5332173495403615020L;
      long var4 = class_2338.method_10064(x, y, z);
      var7 ^= ((long)this.liiiliiIll.get(var4) << 32 ^ var7) & -1L << 32;
      if (((int)(var7 >>> 32) & 1) == 0) {
         var7 ^= (
               (long)((byte)((int)(var7 >>> 32) | (lllIIlilillIIlil.lIiiIiIlilli(this.iililiiIll, this.iiiiliiIll.method_10103(x, y, z)) ? 3 : 1))) << 32
                  ^ var7
            )
            & -1L << 32;
         this.liiiliiIll.put(var4, (byte)((int)(var7 >>> 32)));
      }

      return ((int)(var7 >>> 32) & 2) != 0;
   }

   List<class_2338> IliIlllilIi(class_2338 to) {
      if (!this.iIiiliiIll || !liiiIIllIl(to)) {
         return IIiillllIiilll.IliIlllilIi(this.iililiiIll, this.IIiiliiIll, to, this.lIiiliiIll);
      } else if (this.IIiiliiIll.equals(to)) {
         return List.of();
      } else if (!lllIIlilillIIlil.IIIllIIliIIl(this.iililiiIll, to)) {
         return null;
      } else {
         long var2 = to.method_10063();
         if (this.IiiiliiIll.contains(var2)) {
            return this.IlIlllIlilIl(var2);
         } else {
            while (!this.lliiliiIll.isEmpty() && this.IIIIiiiIll++ < 3000) {
               long var4 = this.lliiliiIll.dequeueLong();
               this.IiiiliiIll.add(var4);
               this.iIlIlllllill(var4);
               if (var4 == var2) {
                  return this.IlIlllIlilIl(var2);
               }
            }

            return null;
         }
      }
   }

   private boolean lIiiIiIlilli(int y, int z, int x) {
      return this.IIIllIIliIIl(y, z - 1, x) && this.iliIiiliiiii(y, z, x) && this.iliIiiliiiii(y, z + 1, x);
   }

   private void iIlIlllllill(long cur) {
      long var17 = -8190634392859955302L;
      long var19 = -2063427836930749398L;
      long var21 = 2173125519288305127L;
      long var23 = 8296907994703115884L;
      long var15 = 4320366788642362747L;
      var15 ^= ((long)class_2338.method_10061(cur) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)class_2338.method_10071(cur) ^ var15) & -1L >>> 32;
      var17 ^= ((long)class_2338.method_10083(cur) << 32 ^ var17) & -1L << 32;
      class_2350[] var6 = IIiillllIiilll.lIIillIIiiIIillIIi;
      var17 ^= ((long)var6.length ^ var17) & -1L >>> 32;
      var19 ^= (0L ^ var19) & -1L << 32;

      while ((int)(var19 >>> 32) < (int)var17) {
         class_2350 var9 = var6[(int)(var19 >>> 32)];
         var19 ^= ((long)((int)(var15 >>> 32) + var9.method_10148()) ^ var19) & -1L >>> 32;
         var21 ^= ((long)((int)(var17 >>> 32) + var9.method_10165()) << 32 ^ var21) & -1L << 32;
         if (this.lIiiIiIlilli((int)var19, (int)var15, (int)(var21 >>> 32))) {
            this.IilliliilIIi(class_2338.method_10064((int)var19, (int)var15, (int)(var21 >>> 32)), cur);
         } else if (this.iliIiiliiiii((int)(var15 >>> 32), (int)var15 + 2, (int)(var17 >>> 32))
            && this.lIiiIiIlilli((int)var19, (int)var15 + 1, (int)(var21 >>> 32))) {
            this.IilliliilIIi(class_2338.method_10064((int)var19, (int)var15 + 1, (int)(var21 >>> 32)), cur);
         } else if (this.iliIiiliiiii((int)var19, (int)var15, (int)(var21 >>> 32)) && this.iliIiiliiiii((int)var19, (int)var15 + 1, (int)(var21 >>> 32))) {
            var21 ^= ((long)((int)var15) ^ var21) & -1L >>> 32;
            var23 ^= (4294967296L ^ var23) & -1L << 32;

            for (var23 ^= (0L ^ var23) & -1L >>> 32;
               (int)var23 < this.lIiiliiIll && !this.IIIllIIliIIl((int)var19, (int)var21 - 1, (int)(var21 >>> 32));
               var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32
            ) {
               if (!this.iliIiiliiiii((int)var19, (int)var21 - 1, (int)(var21 >>> 32))) {
                  var23 ^= (0L ^ var23) & -1L << 32;
                  break;
               }

               var21 ^= (var21 ^ var21 + (long)-1) & -1L >>> 32;
            }

            if ((int)(var23 >>> 32) != 0 && (int)var21 != (int)var15 && this.lIiiIiIlilli((int)var19, (int)var21, (int)(var21 >>> 32))) {
               this.IilliliilIIi(class_2338.method_10064((int)var19, (int)var21, (int)(var21 >>> 32)), cur);
            }
         }

         var19 += 4294967296L;
      }
   }

   private void IilliliilIIi(long cur, long k) {
      if (!this.iliiliiIll.containsKey(cur)) {
         this.iliiliiIll.put(cur, k);
         this.lliiliiIll.enqueue(cur);
      }
   }

   private static boolean liiiIIllIl(class_2338 p) {
      return p.method_10263() >= -33000000
         && p.method_10263() <= 33000000
         && p.method_10260() >= -33000000
         && p.method_10260() <= 33000000
         && p.method_10264() >= -2024
         && p.method_10264() <= 2024;
   }

   private boolean IIIllIIliIIl(int y, int x, int z) {
      long var7 = -5961652055809735973L;
      long var4 = class_2338.method_10064(y, x, z);
      var7 ^= ((long)this.liiiliiIll.get(var4) << 32 ^ var7) & -1L << 32;
      if (((int)(var7 >>> 32) & 4) == 0) {
         var7 ^= (
               (long)((byte)((int)(var7 >>> 32) | (lllIIlilillIIlil.iliIiiliiiii(this.iililiiIll, this.iiiiliiIll.method_10103(y, x, z)) ? 12 : 4))) << 32
                  ^ var7
            )
            & -1L << 32;
         this.liiiliiIll.put(var4, (byte)((int)(var7 >>> 32)));
      }

      return ((int)(var7 >>> 32) & 8) != 0;
   }
}
