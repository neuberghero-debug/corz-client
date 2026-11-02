package gg.corz;

import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_8881;

public final class IlIliIIlllIliIIl {
   private static iIlIilIlIllIilIl IliIlllilIi() {
      try {
         return (iIlIilIlIllIilIl)llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class);
      } catch (Throwable var1) {
         return null;
      }
   }

   public static llIIIlIiilIIIlIi liiiIIllIl() {
      iIlIilIlIllIilIl var0 = IliIlllilIi();
      return var0 == null ? null : var0.iIIlIllIlIlIll();
   }

   public static int lIiiIiIlilli(class_8881 mask, int h) {
      long var8 = -3621762961645997214L;
      long var10 = -5500074535732012181L;
      long var12 = 4594851094826002418L;
      var8 ^= (0L ^ var8) & -1L << 32;
      int[] var3 = IiliIIllliliIIll.lIiiIiIlilli(IilliliilIIi(mask), h);
      var8 ^= ((long)var3.length ^ var8) & -1L >>> 32;
      var10 ^= (0L ^ var10) & -1L << 32;

      while ((int)(var10 >>> 32) < (int)var8) {
         var10 ^= ((long)var3[(int)(var10 >>> 32)] ^ var10) & -1L >>> 32;
         var12 ^= ((long)(!IiliIIllliliIIll.IilliliilIIi(h, (int)var10) ? 1 : 0) << 32 ^ var12) & -1L << 32;
         iIlIilIlIllIilIl.lillIlliillIll(mask, (int)var10, (boolean)((int)(var12 >>> 32)));
         mask.method_54458((int)var10, (boolean)((int)(var12 >>> 32)));
         var8 += 4294967296L;
         var10 += 4294967296L;
      }

      return (int)(var8 >>> 32);
   }

   public static void IIIllIIliIIl(class_8881 h) {
      long var5 = -5401255144095223696L;
      llIIIlIiilIIIlIi var1 = liiiIIllIl();
      if (var1 != null) {
         illiiIIlIiliiIIl var2 = var1.IIIllIIliIIl();
         class_310 var3 = class_310.method_1551();
         if (var2 == null) {
            var3.method_1507(new lIIIiiIiiIIIiiIi(var3.field_1755, var1, null));
         } else {
            var5 ^= ((long)lIiiIiIlilli(h, var2.iIlIlllllill()) << 32 ^ var5) & -1L << 32;
            if (var3.field_1724 != null) {
               var3.field_1724
                  .method_7353(
                     class_2561.method_43470(
                        IlIlllIlilIl<"IlIlllIlilIl","O/P1V19m9k3Tv4K1KNabVacAktFYiChHxcVv0ysSYQvTPZrkJyw9Wm5pqcQcxaPq+rQ8f8BVkGsb8c4=">()
                           + var2.liiiIIllIl()
                           + IlIlllIlilIl<"IlIlllIlilIl","cciRRgXRXY21/m5Zew4KYSCOANomfRorAIttPSId">()
                           + IiliIIllliliIIll.iliIiiliiiii(var2.iIlIlllllill())
                           + IlIlllIlilIl<"IlIlllIlilIl","uVdAgAJAlP26rvQibfU+HQd1O3sS6ML9sLP4l1lb">()
                           + (int)(var5 >>> 32)
                           + IlIlllIlilIl<"IlIlllIlilIl","PKLjxpkV+Ct44Ee3y97KSimAEyrOM+msdFNzftKs6SfC">()
                           + ((int)(var5 >>> 32) == 1 ? "" : IlIlllIlilIl<"IlIlllIlilIl","+Aa9lzbM5niuwHnHL706Ro/JZ3W4/4uKdae4MrQ=">())
                           + IlIlllIlilIl<"IlIlllIlilIl","ccHhl5WFsGkYofe7QmlBuqfvEAZ8yCFHmqT2ifePdovgVcC7fg==">()
                     ),
                     true
                  );
            }
         }
      }
   }

   public static boolean iIlIlllllill() {
      return liiiIIllIl() != null;
   }

   public static void iliIiiliiiii(class_8881 h) {
      llIIIlIiilIIIlIi var1 = liiiIIllIl();
      if (var1 != null) {
         class_310 var2 = class_310.method_1551();
         var2.method_1507(new lIIIiiIiiIIIiiIi(var2.field_1755, var1, IilliliilIIi(h)));
      }
   }

   public static int IilliliilIIi(class_8881 h) {
      long var3 = -6480808338120207257L;
      var3 ^= (0L ^ var3) & -1L << 32;

      for (var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < 9; var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
         if (h.method_54461((int)var3)) {
            var3 ^= ((long)((int)(var3 >>> 32) | 1 << (int)var3) << 32 ^ var3) & -1L << 32;
         }
      }

      return (int)(var3 >>> 32);
   }

   private IlIliIIlllIliIIl() {
   }
}
