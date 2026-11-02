package gg.corz;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import net.minecraft.class_1923;
import net.minecraft.class_238;
import org.lwjgl.system.MemoryUtil;

final class lIlIIIliiIlIIIli {
   final Long2ObjectOpenHashMap<iiiIllIlIIIlllIl> iIIIIlIlIi = new Long2ObjectOpenHashMap();
   final ArrayList<iiiIllIlIIIlllIl> IlIIIlIlIi = new ArrayList<>();
   private ByteBuffer ilIIIlIlIi;
   private final LongOpenHashSet llIIIlIlIi = new LongOpenHashSet();

   boolean liiiIIllIl() {
      return this.iIIIIlIlIi.isEmpty();
   }

   int IilliliilIIi(Long2ObjectOpenHashMap<lIilIliiIilIli> now, int budgetNanos, int maxRegions, int centerRz, long centerRx, long columns) {
      long var19 = -3980883248444545207L;
      long var21 = -8557948450980374826L;
      if (this.llIIIlIlIi.isEmpty()) {
         return 0;
      } else {
         long var9 = System.nanoTime();
         var19 ^= (0L ^ var19) & -1L << 32;

         while ((int)(var19 >>> 32) < centerRz && !this.llIIIlIlIi.isEmpty()) {
            long var12 = 0L;
            var19 ^= (2147483647L ^ var19) & -1L >>> 32;
            LongIterator var15 = this.llIIIlIlIi.iterator();

            while (var15.hasNext()) {
               long var16 = var15.nextLong();
               var21 ^= (
                     (long)Math.max(Math.abs(class_1923.method_8325(var16) - budgetNanos), Math.abs(class_1923.method_8332(var16) - maxRegions)) << 32 ^ var21
                  )
                  & -1L << 32;
               if ((int)(var21 >>> 32) < (int)var19) {
                  var19 ^= ((long)((int)(var21 >>> 32)) ^ var19) & -1L >>> 32;
                  var12 = var16;
               }
            }

            this.llIIIlIlIi.remove(var12);
            this.lIiiIiIlilli(now, var12, columns);
            var19 += 4294967296L;
            if (System.nanoTime() - var9 > centerRx) {
               break;
            }
         }

         return (int)(var19 >>> 32);
      }
   }

   void IlIlllIlilIl() {
      this.IIIllIIliIIl();
      if (this.ilIIIlIlIi != null) {
         MemoryUtil.memFree(this.ilIIIlIlIi);
         this.ilIIIlIlIi = null;
      }
   }

   int iIlIlllllill() {
      return this.llIIIlIlIi.size();
   }

   void IliIlllilIi(long key) {
      this.llIIIlIlIi.add(key);
   }

   private static void iliIiiliiiii(iiiIllIlIIIlllIl region) {
      if (region.lIllliIiIl != null) {
         region.lIllliIiIl.close();
         region.lIllliIiIl = null;
      }

      region.IlllliIiIl = 0;
   }

   private void lIiiIiIlilli(Long2ObjectOpenHashMap<lIilIliiIilIli> columns, long now, long key) {
      long var21 = -6974002754354397105L;
      long var23 = -4612779721797655867L;
      long var25 = 3547161535031342730L;
      long var27 = -703016712744537113L;
      long var29 = -2848263520221119624L;
      long var31 = -1211866215751221961L;
      var21 ^= ((long)class_1923.method_8325(now) << 32 ^ var21) & -1L << 32;
      var21 ^= ((long)class_1923.method_8332(now) ^ var21) & -1L >>> 32;
      var23 ^= (17179869184L ^ var23) & -1L << 32;
      var23 ^= (0L ^ var23) & -1L >>> 32;
      var25 ^= (0L ^ var25) & -1L << 32;
      float var11 = Float.MAX_VALUE;
      float var12 = -Float.MAX_VALUE;

      for (var25 ^= (0L ^ var25) & -1L >>> 32; (int)var25 < (int)(var23 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
         for (var27 ^= (0L ^ var27) & -1L << 32; (int)(var27 >>> 32) < (int)(var23 >>> 32); var27 += 4294967296L) {
            lIilIliiIilIli var15 = (lIilIliiIilIli)columns.get(
               class_1923.method_8331((int)(var21 >>> 32) * (int)(var23 >>> 32) + (int)var25, (int)var21 * (int)(var23 >>> 32) + (int)(var27 >>> 32))
            );
            if (var15 != null) {
               lilIIIliilIIIl[] var16 = var15.liIllIIIIl;
               var27 ^= ((long)var16.length ^ var27) & -1L >>> 32;

               for (var29 ^= (0L ^ var29) & -1L << 32; (int)(var29 >>> 32) < (int)var27; var29 += 4294967296L) {
                  lilIIIliilIIIl var19 = var16[(int)(var29 >>> 32)];
                  if (var19 != null) {
                     var23 ^= ((long)((int)var23 + var19.llIiiIiIlilIiiIiIl.length) ^ var23) & -1L >>> 32;
                     var25 ^= ((long)((int)(var25 >>> 32) + var19.IiIiiIiIlliIiiIiIl) << 32 ^ var25) & -1L << 32;
                     var11 = Math.min(var11, var19.iiIiiIiIlIIliiIiIl);
                     var12 = Math.max(var12, var19.lIliiIiIliIliiIiIl);
                  }
               }
            }
         }
      }

      iiiIllIlIIIlllIl var13 = (iiiIllIlIIIlllIl)this.iIIIIlIlIi.get(now);
      if ((int)(var25 >>> 32) != 0 && (int)var23 != 0) {
         if (this.ilIIIlIlIi == null || this.ilIIIlIlIi.capacity() < (int)var23) {
            if (this.ilIIIlIlIi != null) {
               MemoryUtil.memFree(this.ilIIIlIlIi);
            }

            this.ilIIIlIlIi = MemoryUtil.memAlloc(Math.max((int)var23, 65536));
         }

         this.ilIIIlIlIi.clear();

         for (var27 ^= (0L ^ var27) & -1L << 32; (int)(var27 >>> 32) < (int)(var23 >>> 32); var27 += 4294967296L) {
            for (var29 ^= (0L ^ var29) & -1L >>> 32; (int)var29 < (int)(var23 >>> 32); var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
               lIilIliiIilIli var33 = (lIilIliiIilIli)columns.get(
                  class_1923.method_8331((int)(var21 >>> 32) * (int)(var23 >>> 32) + (int)(var27 >>> 32), (int)var21 * (int)(var23 >>> 32) + (int)var29)
               );
               if (var33 != null) {
                  lilIIIliilIIIl[] var17 = var33.liIllIIIIl;
                  var29 ^= ((long)var17.length << 32 ^ var29) & -1L << 32;

                  for (var31 ^= (0L ^ var31) & -1L << 32; (int)(var31 >>> 32) < (int)(var29 >>> 32); var31 += 4294967296L) {
                     lilIIIliilIIIl var20 = var17[(int)(var31 >>> 32)];
                     if (var20 != null) {
                        this.ilIIIlIlIi.put(var20.llIiiIiIlilIiiIiIl);
                     }
                  }
               }
            }
         }

         this.ilIIIlIlIi.flip();
         if (var13 == null) {
            var13 = new iiiIllIlIIIlllIl(now);
            this.iIIIIlIlIi.put(now, var13);
            this.IlIIIlIlIi.add(var13);
         }

         if (var13.lIllliIiIl == null || var13.lIllliIiIl.isClosed() || var13.iIllliIiIl < (long)((int)var23)) {
            if (var13.lIllliIiIl != null) {
               var13.lIllliIiIl.close();
            }

            long var14 = Math.max((long)((int)var23) + (long)((int)var23) / 4L, 4096L);
            var13.lIllliIiIl = RenderSystem.getDevice()
               .createBuffer(() -> IIlllIlliIll<"IIlllIlliIll","L8LE4hHUfbHrDIxIKPWLEjiJntqEmQbR5qMCeAKEgXwQf5kB6bNz0H62e0Mk">(), 40, var14);
            var13.iIllliIiIl = var14;
         }

         RenderSystem.getDevice().createCommandEncoder().writeToBuffer(var13.lIllliIiIl.slice(0L, (long)((int)var23)), this.ilIIIlIlIi);
         if (var13.IlllliIiIl == 0) {
            var13.llllliIiIl = key;
         }

         var13.IlllliIiIl = (int)(var25 >>> 32);
         var27 ^= ((long)var13.IliIlllilIi() << 32 ^ var27) & -1L << 32;
         var29 ^= ((long)var13.liiiIIllIl() ^ var29) & -1L >>> 32;
         var13.illlliIiIl = new class_238(
            (double)((int)(var27 >>> 32)),
            (double)var11 - 0.5,
            (double)((int)var29),
            (double)((int)(var27 >>> 32) + 64),
            (double)var12 + 0.5,
            (double)((int)var29 + 64)
         );
      } else {
         if (var13 != null) {
            iliIiiliiiii(var13);
            this.iIIIIlIlIi.remove(now);
            this.IlIIIlIlIi.remove(var13);
         }
      }
   }

   void IIIllIIliIIl() {
      long var2 = 4777923756862461561L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.IlIIIlIlIi.size(); var4 += 4294967296L) {
         iliIiiliiiii(this.IlIIIlIlIi.get((int)(var4 >>> 32)));
      }

      this.iIIIIlIlIi.clear();
      this.IlIIIlIlIi.clear();
      this.llIIIlIlIi.clear();
   }
}
