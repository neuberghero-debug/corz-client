package gg.corz;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_746;
import net.minecraft.class_8038;
import net.minecraft.class_8143;

public final class illIllilIilIllil {
   private static final class_310 llillliIil = class_310.method_1551();
   private static volatile int iIIilliIil = -1;
   private static final long IlillliIil = 10000L;
   private static int iiillliIil = -1;
   public static final long iIillliIil = 400L;
   private static final lIIiIilliIIiIill ilillliIil = new lIIiIilliIIiIill(20);
   private static long IIIilliIil;
   private static final Map<Integer, iIIIiiIlIlIIiiIl> IiillliIil = new ConcurrentHashMap<>();
   private static long lIIilliIil;
   public static final int IIillliIil = 20;
   private static volatile long IlIilliIil;
   private static final Object liillliIil = new Object();
   private static volatile int llIilliIil;
   public static final long lIillliIil = 500L;

   public static long IIIllIIliIIl() {
      return ilillliIil.liiiIIllIl() > 0 ? ilillliIil.iIlIlllllill() : (long)IiIlliIliiIl();
   }

   public static int IIillIiliIil(class_1297 entity) {
      return entity instanceof class_1309 var1 ? var1.field_6235 : 0;
   }

   public static void IliIlllilIi(class_1297 target) {
      class_746 var1 = llillliIil.field_1724;
      if (var1 != null) {
         iIIilliIil = var1.method_5628();
      }

      if (target instanceof class_1309 var2 && var2.field_6235 <= 0) {
         long var3 = IIIiillllIIiilll.IliIlllilIi();
         synchronized (liillliIil) {
            if (var3 - lIIilliIil <= 400L) {
               return;
            }

            iiillliIil = target.method_5628();
            IIIilliIil = var3;
            lIIilliIil = var3;
            return;
         }
      }
   }

   static boolean Iiilliiliiil(long delayMs) {
      return delayMs >= 0L && delayMs < 500L;
   }

   public static void IilliliilIIi() {
      ilillliIil.IilliliilIIi();
      IiillliIil.clear();
      llIilliIil = 0;
      synchronized (liillliIil) {
         iiillliIil = -1;
         lIIilliIil = 0L;
      }
   }

   private illIllilIilIllil() {
   }

   public static void liiiIIllIl(class_2596<?> packet, long now) {
      long var9 = 8310228957381199133L;
      if (packet instanceof class_8038 var12) {
         for (class_2596 var13 : var12.method_48324()) {
            liiiIIllIl(var13, now);
         }
      } else if (packet instanceof class_8143 var3) {
         IiillliIil.put(var3.comp_1267(), new iIIIiiIlIlIIiiIl(now, IlIilliIil));
         var9 ^= ((long)iIIilliIil << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) != -1 && (var3.comp_1269() == (int)(var9 >>> 32) || var3.comp_1270() == (int)(var9 >>> 32))) {
            synchronized (liillliIil) {
               if (iiillliIil == var3.comp_1267()) {
                  long var6 = now - IIIilliIil;
                  iiillliIil = -1;
                  if (Iiilliiliiil(var6)) {
                     ilillliIil.IliIlllilIi(var6);
                  }
               }
            }
         }
      }
   }

   public static void iIlIlllllill() {
      IlIilliIil++;
      class_746 var0 = llillliIil.field_1724;
      iIIilliIil = var0 != null ? var0.method_5628() : -1;
      llIilliIil = IIlllIlliIll(var0);
      long var1 = IIIiillllIIiilll.IliIlllilIi();
      synchronized (liillliIil) {
         if (iiillliIil != -1 && var1 - IIIilliIil >= 500L) {
            iiillliIil = -1;
         }
      }

      if (IlIilliIil % 100L == 0L && !IiillliIil.isEmpty()) {
         IiillliIil.values().removeIf(h -> var1 - h.IliIlllilIi() > 10000L);
      }
   }

   public static int Iilllilliill(int entityId) {
      iIIIiiIlIlIIiiIl var1 = IiillliIil.get(entityId);
      return var1 == null ? Integer.MAX_VALUE : (int)Math.min(2147483647L, Math.max(0L, IlIilliIil - var1.liiiIIllIl()));
   }

   public static int iliIiiliiiii() {
      return ilillliIil.liiiIIllIl();
   }

   public static boolean lIiiIiIlilli() {
      return ilillliIil.liiiIIllIl() > 0;
   }

   private static int IIlllIlliIll(class_746 self) {
      class_634 var1 = llillliIil.method_1562();
      if (var1 != null && self != null) {
         class_640 var2 = var1.method_2871(self.method_5667());
         return var2 == null ? 0 : Math.max(0, var2.method_2959());
      } else {
         return 0;
      }
   }

   static int IIIilIIiiIIi(long ms) {
      return (int)Math.round((double)Math.max(0L, ms) / 50.0);
   }

   public static int Ililllililil(class_1309 entity) {
      return entity == null ? 0 : Math.max(0, entity.field_6008 - 10);
   }

   public static int IiIlliIliiIl() {
      return llIilliIil;
   }

   public static int IlIlllIlilIl() {
      return IIIilIIiiIIi(IIIllIIliIIl());
   }

   public static long Illlllllilll(int entityId) {
      iIIIiiIlIlIIiiIl var1 = IiillliIil.get(entityId);
      return var1 == null ? -1L : var1.IliIlllilIi();
   }
}
