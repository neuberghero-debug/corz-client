package gg.corz;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_310;

public final class lIIIIIlliIIIIIll {
   private static int IIllliIlll;
   private static final ArrayDeque<Long> IlIlliIlll = new ArrayDeque<>();
   private static final class_310 liiIliIlll = class_310.method_1551();
   private static long ilIlliIlll;
   private static final double lIIlliIlll = 0.12;
   private static int llIlliIlll = -1;
   private static long IiIlliIlll;
   private static final long iiiIliIlll = 1000L;
   private static long lIllliIlll;
   private static long liIlliIlll;
   private static long iIllliIlll;
   private static final long iIIlliIlll = 1200L;
   private static final int IIIlliIlll = 8;
   private static int iiIlliIlll;

   private static long IIIllIIliIIl() {
      double var0 = 150.0 + ThreadLocalRandom.current().nextGaussian() * 45.0;
      return (long)Math.max(90.0, Math.min(280.0, var0));
   }

   public static void iIlIlllllill() {
      long var0 = System.currentTimeMillis();
      IlIlllIlilIl(var0);
      IlIlliIlll.addLast(var0);
      iliIiiliiiii(var0);
   }

   public static boolean liiiIIllIl(class_1297 target) {
      long var1 = System.currentTimeMillis();
      if (target.method_5628() != llIlliIlll || var1 - liIlliIlll > 1200L) {
         llIlliIlll = target.method_5628();
         ilIlliIlll = var1;
         IiIlliIlll = IIIllIIliIIl();
      }

      liIlliIlll = var1;
      if (lIiiIiIlilli()) {
         return false;
      } else if (var1 < lIllliIlll) {
         return false;
      } else if (var1 - ilIlliIlll < IiIlliIlll) {
         return false;
      } else {
         IlIlllIlilIl(var1);
         return IlIlliIlll.size() >= 8 ? false : ThreadLocalRandom.current().nextDouble() >= 0.12;
      }
   }

   public static boolean IliIlllilIi(class_1297 target) {
      if (!liiiIIllIl(target)) {
         return false;
      } else {
         iIlIlllllill();
         return true;
      }
   }

   public static void IilliliilIIi(class_1297 target) {
      long var1 = System.currentTimeMillis();
      llIlliIlll = target.method_5628();
      liIlliIlll = var1;
      ilIlliIlll = Math.min(ilIlliIlll, var1 - IiIlliIlll);
      IlIlllIlilIl(var1);
      IlIlliIlll.addLast(var1);
      iliIiiliiiii(var1);
   }

   private lIIIIIlliIIIIIll() {
   }

   private static void IlIlllIlilIl(long now) {
      while (!IlIlliIlll.isEmpty() && now - IlIlliIlll.peekFirst() > 1000L) {
         IlIlliIlll.pollFirst();
      }
   }

   private static void iliIiiliiiii(long now) {
      if (IIllliIlll == 0) {
         IIllliIlll = 6 + ThreadLocalRandom.current().nextInt(7);
      }

      if (++iiIlliIlll >= IIllliIlll) {
         iiIlliIlll = 0;
         IIllliIlll = 6 + ThreadLocalRandom.current().nextInt(7);
         lIllliIlll = now + 300L + (long)ThreadLocalRandom.current().nextInt(300);
      }
   }

   public static boolean lIiiIiIlilli() {
      long var0 = System.currentTimeMillis();
      if (liiIliIlll.field_1761 != null && liiIliIlll.field_1761.method_2923()) {
         iIllliIlll = var0;
         return true;
      } else {
         return var0 - iIllliIlll < 75L;
      }
   }
}
