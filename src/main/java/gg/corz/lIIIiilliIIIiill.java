package gg.corz;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2743;
import net.minecraft.class_8038;

public final class lIIIiilliIIIiill {
   private final ConcurrentLinkedQueue<IlIIIiIillIIIiIi> Iiillliill = new ConcurrentLinkedQueue<>();
   public static final int ilillliill = Integer.MIN_VALUE;
   public static final int llillliill = 256;
   private volatile int iiillliill;
   private final AtomicInteger liillliill = new AtomicInteger();

   public int iIlIlllllill(Consumer<IlIIIiIillIIIiIi> max, int sink) {
      long var5 = 7618172351584672544L;

      for (var5 ^= (0L ^ var5) & -1L << 32; (int)(var5 >>> 32) < sink; var5 += 4294967296L) {
         IlIIIiIillIIIiIi var4 = this.Iiillliill.poll();
         if (var4 == null) {
            break;
         }

         this.liillliill.decrementAndGet();
         if (max != null) {
            max.accept(var4);
         }
      }

      return (int)(var5 >>> 32);
   }

   public void liiiIIllIl(class_2596<?> packet) {
      if (!(packet instanceof class_8038 var2)) {
         this.lIiiIiIlilli(packet);
      } else {
         for (class_2596 var4 : var2.method_48324()) {
            this.lIiiIiIlilli(var4);
         }
      }
   }

   public void IliIlllilIi(int entityId) {
      this.iiillliill = entityId;
   }

   public void IilliliilIIi() {
      while (this.Iiillliill.poll() != null) {
         this.liillliill.decrementAndGet();
      }
   }

   private void lIiiIiIlilli(class_2596<?> packet) {
      long var6 = -2676603606943172494L;
      if (packet instanceof class_2743 var2) {
         var6 ^= ((long)var2.method_11818() << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)this.iiillliill ^ var6) & -1L >>> 32;
         if ((int)var6 == Integer.MIN_VALUE || (int)var6 == (int)(var6 >>> 32)) {
            class_243 var5 = var2.method_73085();
            if (var5 != null && Double.isFinite(var5.field_1352) && Double.isFinite(var5.field_1351) && Double.isFinite(var5.field_1350)) {
               while (this.liillliill.get() >= 256 && this.Iiillliill.poll() != null) {
                  this.liillliill.decrementAndGet();
               }

               this.Iiillliill.add(new IlIIIiIillIIIiIi((int)(var6 >>> 32), var5, IIIiillllIIiilll.IliIlllilIi()));
               this.liillliill.incrementAndGet();
            }
         }
      }
   }

   public lIIIiilliIIIiill() {
      this.iiillliill = Integer.MIN_VALUE;
   }
}
