package gg.corz;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class lIIIiiiiIIIiii {
   private volatile long iiIiiliIIl;
   private static final int ilIiiliIIl = 2;
   private volatile List<liIIIlliiIIIll> liIiiliIIl;
   private final AtomicInteger IiIiiliIIl = new AtomicInteger(0);
   private static final int IlIiiliIIl = 0;
   private static final int llIiiliIIl = 1;

   public lIIIiiiiIIIiii() {
      this.liIiiliIIl = List.of();
      this.iiIiiliIIl = Long.MIN_VALUE;
   }

   public boolean IIIllIIliIIl() {
      return this.IiIiiliIIl.get() == 1;
   }

   public boolean iliIiiliiiii() {
      return this.IiIiiliIIl.compareAndSet(0, 1);
   }

   public static int IlIlllIlilIl(List<liIIIlliiIIIll> steps) {
      long var5 = -4791790219114868511L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 + 1 < steps.size(); var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         liIIIlliiIIIll var3 = (liIIIlliiIIIll)steps.get((int)var5);
         if (var3.IliIlllilIi() == ilIlIilIiIlIil.liliiilIiiiliiilIi
            || var3.IliIlllilIi() == ilIlIilIiIlIil.IlliiilIillliiilIi
            || var3.IliIlllilIi() == ilIlIilIiIlIil.illiiilIiIiliiilIi) {
            break;
         }

         liIIIlliiIIIll var4 = (liIIIlliiIIIll)steps.get((int)var5 + 1);
         if (var3.IliIlllilIi() == ilIlIilIiIlIil.IIiiiilIilIiiiilIi
            && (var4.IliIlllilIi() != ilIlIilIiIlIil.IIiiiilIilIiiiilIi || !Objects.equals(var4.iIlIlllllill(), var3.iIlIlllllill()))) {
            var5 ^= ((long)((int)var5 + 1) << 32 ^ var5) & -1L << 32;
         }
      }

      return (int)(var5 >>> 32);
   }

   boolean IilliliilIIi() {
      return this.IiIiiliIIl.compareAndSet(0, 2);
   }

   public List<liIIIlliiIIIll> lIiiIiIlilli() {
      return this.liIiiliIIl;
   }

   public long iIlIlllllill() {
      long var1 = this.iiIiiliIIl;
      return var1 == Long.MIN_VALUE ? 0L : System.nanoTime() - var1;
   }

   void IliIlllilIi(List<liIIIlliiIIIll> steps) {
      if (this.IiIiiliIIl.get() != 2) {
         this.liIiiliIIl = List.copyOf(steps);
      }
   }

   void liiiIIllIl() {
      this.iiIiiliIIl = System.nanoTime();
   }
}
