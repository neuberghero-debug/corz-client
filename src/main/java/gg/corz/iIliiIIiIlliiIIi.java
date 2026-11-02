package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2596;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2672;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_310;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_2338.class_2339;

public final class iIliiIIiIlliiIIi {
   private final iIIlIIIiIlIlIIIi iiiiIiiiil = new iIIlIIIiIlIlIIIi();
   public static final int iliiIiiiil = 600;
   public static final int IiiiIiiiil = 4096;
   public static final int lliiIiiiil = 12;
   private final Long2ByteOpenHashMap IIIIliiiil = new Long2ByteOpenHashMap();
   private final ConcurrentLinkedQueue<Long> lIIIliiiil = new ConcurrentLinkedQueue<>();
   private volatile long llIIliiiil;
   private final ConcurrentLinkedQueue<Long> iIIIliiiil = new ConcurrentLinkedQueue<>();
   private int ilIIliiiil;
   private final AtomicInteger IlIIliiiil = new AtomicInteger();
   private static final Predicate<class_2680> liiiIiiiil = s -> s.method_27852(class_2246.field_23152);

   public void iliIiiliiiii(class_2596<?> nowMs, long packet) {
      if (nowMs instanceof class_2626 var4) {
         class_2680 var7 = var4.method_11308();
         if (var7 != null && (var7.method_27852(class_2246.field_23152) || var7.method_26215() || !var7.method_26227().method_15769())) {
            this.IIIllIIliIIl(var4.method_11309().method_10063());
         }
      } else if (nowMs instanceof class_2637 var5) {
         var5.method_30621((pos, s) -> {
            if (s != null && (s.method_27852(class_2246.field_23152) || s.method_26215())) {
               this.IIIllIIliIIl(pos.method_10063());
            }
         });
      } else if (nowMs instanceof class_2672 var6) {
         this.llIIliiiil = packet;
         if (this.iIIIliiiil.size()
            < (((-404726446 + -93 << 25 | -404726446 + -93 >>> 7) >>> 19 | (-404726446 + -93 << 25 | -404726446 + -93 >>> 7) << 13) ^ -132698759)) {
            this.iIIIliiiil.offer(class_1923.method_8331(var6.method_11523(), var6.method_11524()));
         }
      }
   }

   public void IliIlllilIi() {
      this.iiiiIiiiil.liiiIIllIl();
      this.IIIIliiiil.clear();

      while (this.lIIIliiiil.poll() != null) {
         this.IlIIliiiil.decrementAndGet();
      }

      this.iIIIliiiil.clear();
   }

   public void lIiiIiIlilli(class_2338 pos) {
      if (pos != null) {
         this.IIIIliiiil.remove(pos.method_10063());
      }
   }

   public double Illlllllilll(class_638 chunkX, int w, int chunkZ) {
      if (chunkX == null) {
         return 0.0;
      } else {
         int var4 = 0;
         int var5 = 0;

         for (int var6 = -this.ilIIliiiil; var6 <= this.ilIIliiiil; var6++) {
            for (int var7 = -this.ilIIliiiil; var7 <= this.ilIIliiiil; var7++) {
               int var8 = w + var6;
               int var9 = chunkZ + var7;
               if (chunkX.method_2935().method_21730(var8, var9) != null) {
                  var4++;
                  if (this.iiiiIiiiil.IIIllIIliIIl(class_1923.method_8331(var8, var9))) {
                     var5++;
                  }
               }
            }
         }

         return var4 == 0 ? 0.0 : (double)var5 / (double)var4;
      }
   }

   private void Iilllilliill(class_2818 key, long chunk) {
      int var4 = class_1923.method_8325(chunk);
      int var5 = class_1923.method_8332(chunk);
      LongIterator var6 = this.IIIIliiiil.keySet().iterator();

      while (var6.hasNext()) {
         long var7 = var6.nextLong();
         if (class_2338.method_10061(var7) >> 4 == var4 && class_2338.method_10083(var7) >> 4 == var5) {
            var6.remove();
         }
      }

      class_2826[] var18 = key.method_12006();
      int var8 = key.method_31607();
      int var9 = key.method_12004().method_8326();
      int var10 = key.method_12004().method_8328();

      for (int var11 = 0; var11 < var18.length; var11++) {
         class_2826 var12 = var18[var11];
         if (var12 != null && !var12.method_38292() && var12.method_19523(liiiIiiiil)) {
            int var13 = var8 + (var11 << 4);

            for (int var14 = 0; var14 < 16; var14++) {
               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     class_2680 var17 = var12.method_12254(var16, var14, var15);
                     if (var17.method_27852(class_2246.field_23152)) {
                        this.IIIIliiiil.put(class_2338.method_10064(var9 + var16, var13 + var14, var10 + var15), (byte)IIillIiliIil(var17));
                     }
                  }
               }
            }
         }
      }
   }

   public Long2ByteMap iIlIlllllill() {
      return this.IIIIliiiil;
   }

   public static int IIillIiliIil(class_2680 s) {
      return s != null && s.method_28498(class_4969.field_23153) ? (Integer)s.method_11654(class_4969.field_23153) : 0;
   }

   private void IIIllIIliIIl(long v) {
      if (this.IlIIliiiil.get() < ((629794871 * -1857283155 << 31 | 629794871 * -1857283155 >>> 1) ^ -2138977003)) {
         this.lIIIliiiil.offer(v);
         this.IlIIliiiil.incrementAndGet();
      }
   }

   public iIliiIIiIlliiIIi() {
      this.llIIliiiil = 4209367660963301546L ^ -2708161366677780310L;
      this.ilIIliiiil = --1714259077 ^ 95 ^ 1714259164;
   }

   public int IiIlliIliiIl() {
      return this.ilIIliiiil;
   }

   public int IilliliilIIi() {
      return this.IIIIliiiil.size();
   }

   public long liiiIIllIl() {
      return this.llIIliiiil;
   }

   public void IIlllIlliIll(class_638 w, int chunkX, int chunkZ) {
      if (w != null) {
         class_310 var4 = class_310.method_1551();
         this.ilIIliiiil = Math.max(2, Math.min(var4.field_1690.method_38521(), 12));
         this.iiiiIiiiil.IiIlliIliiIl(chunkX, chunkZ, this.ilIIliiiil + 2);
         this.iiiiIiiiil.IIlllIlliIll(w, chunkX, chunkZ, this.ilIIliiiil, 0L, iIIlIIIiIlIlIIIi.IliIlllilIi(600), this::Iilllilliill);
      }
   }

   public void IlIlllIlilIl(class_638 w) {
      if (w != null) {
         Long var2;
         while ((var2 = this.iIIIliiiil.poll()) != null) {
            this.iiiiIiiiil.iIlIlllllill(var2);
         }

         int var8 = 0;

         Long var4;
         for (class_2339 var3 = new class_2339(); var8 < 512 && (var4 = this.lIIIliiiil.poll()) != null; var8++) {
            this.IlIIliiiil.decrementAndGet();
            long var5 = var4;
            var3.method_10103(class_2338.method_10061(var5), class_2338.method_10071(var5), class_2338.method_10083(var5));
            class_2680 var7 = w.method_8320(var3);
            if (var7.method_27852(class_2246.field_23152)) {
               this.IIIIliiiil.put(var5, (byte)IIillIiliIil(var7));
            } else {
               this.IIIIliiiil.remove(var5);
            }
         }
      }
   }
}
