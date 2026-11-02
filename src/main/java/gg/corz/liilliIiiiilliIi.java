package gg.corz;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_1923;
import net.minecraft.class_2596;
import net.minecraft.class_2672;
import net.minecraft.class_2676;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_6606;
import net.minecraft.class_746;

public final class liilliIiiiilliIi {
   private static final long iiIiiliIIi = 1000000L;
   private static final int IIliiliIIi = 8000;
   private final ConcurrentLinkedQueue<lliIliIiiliIliIi> IlliiliIIi;
   private static final int liIiiliIIi = 4096;
   public static final liilliIiiiilliIi ilIiiliIIi = new liilliIiiiilliIi();
   private class_638 illiiliIIi;
   private final AtomicInteger llliiliIIi;
   private static final int IiIiiliIIi = 5000;
   public final Map<Long, iIiilIllIliilIll> iIliiliIIi = new ConcurrentHashMap<>();
   private static final int lIliiliIIi = 40;

   private lliIliIiiliIliIi IilliliilIIi() {
      lliIliIiiliIliIi var1 = this.IlliiliIIi.poll();
      if (var1 != null) {
         this.llliiliIIi.decrementAndGet();
      }

      return var1;
   }

   private void liiiIIllIl(int chunkX, int chunkZ, class_6606 data) {
      if (data != null) {
         if (this.llliiliIIi.get() < ((288872302 - 41 >>> 5 | 288872302 - 41 << 27) ^ 680111410)) {
            this.llliiliIIi.incrementAndGet();
            this.IlliiliIIi.offer(new lliIliIiiliIliIi(chunkX, chunkZ, data, System.nanoTime()));
         }
      }
   }

   public void iIlIlllllill() {
      class_310 var1 = class_310.method_1551();
      class_638 var2 = var1.field_1687;
      if (var2 != this.illiiliIIi) {
         this.iIliiliIIi.clear();
         this.IlliiliIIi.clear();
         this.llliiliIIi.set(0);
         this.illiiliIIi = var2;
      }

      if (var2 != null) {
         int var3 = var2.method_32890();
         int var4 = var2.method_32891();
         int var5 = 0;
         long var6 = System.nanoTime() + 1000000L;

         lliIliIiiliIliIi var8;
         while ((var8 = this.IilliliilIIi()) != null) {
            this.lIiiIiIlilli(var8, var3, var4);
            var5++;
            if (var5 >= 4096 || (var5 & 15) == 0 && System.nanoTime() >= var6) {
               break;
            }
         }

         if (this.iIliiliIIi.size() > 8000) {
            class_746 var9 = var1.field_1724;
            if (var9 != null) {
               int var10 = var9.method_31477() >> 4;
               int var11 = var9.method_31479() >> 4;
               this.iIliiliIIi.keySet().removeIf(key -> {
                  int var3x = class_1923.method_8325(key);
                  int var4x = class_1923.method_8332(key);
                  return Math.abs(var3x - var10) > 40 || Math.abs(var4x - var11) > 40;
               });
            }
         }
      }
   }

   private liilliIiiiilliIi() {
      this.IlliiliIIi = new ConcurrentLinkedQueue<>();
      this.llliiliIIi = new AtomicInteger();
      this.illiiliIIi = null;
   }

   private void lIiiIiIlilli(lliIliIiiliIliIi sectionCount, int p, int bottomSectionY) {
      long var4 = class_1923.method_8331(sectionCount.IliIlllilIi(), sectionCount.liiiIIllIl());
      iIiilIllIliilIll var6 = this.iIliiliIIi.get(var4);
      if (var6 == null || var6.IIliIlilll != p || var6.lIliIlilll != bottomSectionY) {
         var6 = new iIiilIllIliilIll(sectionCount.IliIlllilIi(), sectionCount.liiiIIllIl(), p, bottomSectionY);
         this.iIliiliIIi.put(var4, var6);
      }

      try {
         IiililIlliililIl.liiiIIllIl(sectionCount.iIlIlllllill(), var6, sectionCount.IilliliilIIi());
      } catch (Throwable var8) {
      }
   }

   public static void IliIlllilIi(class_2596<?> packet) {
      if (packet instanceof class_2676 var1) {
         ilIiiliIIi.liiiIIllIl(var1.method_11558(), var1.method_11554(), var1.method_38600());
      } else if (packet instanceof class_2672 var2) {
         ilIiiliIIi.liiiIIllIl(var2.method_11523(), var2.method_11524(), var2.method_38599());
      }
   }
}
