package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Random;

public final class IIiIlilIiIli {
   public static final int lIilIiIIliIilIiIIl = 2;
   private int IIIiIiIIllIIiIiIIl = -1;
   public static final int IlilIiIIlllilIiIIl = 10;
   public static final double ililIiIIlIiilIiIIl = 0.85;
   private final Random liilIiIIliiilIiIIl;
   private final Deque<Integer> iIIiIiIIlIlIiIiIIl = new ArrayDeque<>();

   public int IliIlllilIi(int maxTicks, int minTicks) {
      long var11 = 1629485306995621367L;
      long var13 = 5220484527973081443L;
      long var15 = -8313731760998832210L;
      var11 ^= ((long)Math.max(1, maxTicks) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)Math.max((int)(var11 >>> 32), minTicks) ^ var11) & -1L >>> 32;
      if (this.IIIiIiIIllIIiIiIIl < 0) {
         return (int)(var11 >>> 32) + this.liilIiIIliiilIiIIl.nextInt((int)var11 - (int)(var11 >>> 32) + 1);
      } else {
         ArrayList var5 = new ArrayList((int)var11 - (int)(var11 >>> 32) + 1);

         for (var13 ^= ((long)((int)(var11 >>> 32)) << 32 ^ var13) & -1L << 32; (int)(var13 >>> 32) <= (int)var11; var13 += 4294967296L) {
            if (Math.abs((int)(var13 >>> 32) - this.IIIiIiIIllIIiIiIIl) >= 2) {
               var5.add((int)(var13 >>> 32));
            }
         }

         if (var5.isEmpty()) {
            return Math.abs((int)(var11 >>> 32) - this.IIIiIiIIllIIiIiIIl) >= Math.abs((int)var11 - this.IIIiIiIIllIIiIiIIl) ? (int)(var11 >>> 32) : (int)var11;
         } else {
            var13 ^= ((long)this.IIIllIIliIIl() << 32 ^ var13) & -1L << 32;
            if (var5.size() > 1 && var5.contains((int)(var13 >>> 32)) && this.liilIiIIliiilIiIIl.nextDouble() < 0.85) {
               var5.remove(Integer.valueOf((int)(var13 >>> 32)));
            }

            var13 ^= (2147483647L ^ var13) & -1L >>> 32;

            for (Iterator var8 = var5.iterator();
               var8.hasNext();
               var13 ^= ((long)Math.min((int)var13, this.iliIiiliiiii((int)(var15 >>> 32))) ^ var13) & -1L >>> 32
            ) {
               var15 ^= ((long)((Integer)var8.next()).intValue() << 32 ^ var15) & -1L << 32;
            }

            ArrayList var17 = new ArrayList(var5.size());
            Iterator var9 = var5.iterator();

            while (var9.hasNext()) {
               var15 ^= ((long)((Integer)var9.next()).intValue() ^ var15) & -1L >>> 32;
               if (this.iliIiiliiiii((int)var15) == (int)var13) {
                  var17.add((int)var15);
               }
            }

            return (Integer)var17.get(this.liilIiIIliiilIiIIl.nextInt(var17.size()));
         }
      }
   }

   private int iliIiiliiiii(int t) {
      long var5 = -1049984787855829973L;
      var5 ^= (0L ^ var5) & -1L << 32;
      Iterator var3 = this.iIIiIiIIlIlIiIiIIl.iterator();

      while (var3.hasNext()) {
         var5 ^= ((long)((Integer)var3.next()).intValue() ^ var5) & -1L >>> 32;
         if ((int)var5 == t) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public int IilliliilIIi() {
      return this.IIIiIiIIllIIiIiIIl;
   }

   public void lIiiIiIlilli() {
      this.IIIiIiIIllIIiIiIIl = -1;
      this.iIIiIiIIlIlIiIiIIl.clear();
   }

   public void iIlIlllllill(int actualTicks) {
      this.IIIiIiIIllIIiIiIIl = Math.max(0, actualTicks);
      this.iIIiIiIIlIlIiIiIIl.addLast(this.IIIiIiIIllIIiIiIIl);

      while (this.iIIiIiIIlIlIiIiIIl.size() > 10) {
         this.iIIiIiIIlIlIiIiIIl.pollFirst();
      }
   }

   public IIiIlilIiIli(Random rng) {
      this.liilIiIIliiilIiIIl = rng;
   }

   private int IIIllIIliIIl() {
      if (this.iIIiIiIIlIlIiIiIIl.size() < 2) {
         return -1;
      } else {
         Integer[] var1 = this.iIIiIiIIlIlIiIiIIl.toArray(new Integer[0]);
         return var1[var1.length - 2];
      }
   }

   public int liiiIIllIl() {
      return this.IIIiIiIIllIIiIiIIl == 0 ? 1 : 0;
   }
}
