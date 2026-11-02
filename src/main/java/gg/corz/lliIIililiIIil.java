package gg.corz;

import java.util.Arrays;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_742;

public final class lliIIililiIIil {
   private static liIlIiliiIlIil iiiIiilIiIIIliilIi;
   private static lliIiiililiIiiil lllliilIiillliilIi;
   private static class_742 lIIliilIiiIIliilIi;
   private static float[] ililiilIiIiiliilIi;
   private static float[] IliliilIilliliilIi;
   private static final float IiiIiilIiliiIiilIi = 0.12F;
   private static class_1306 iIlliilIiIllliilIi;
   private static class_1799 IlIliilIillIliilIi = class_1799.field_8037;
   private static int IIlliilIilIlliilIi;
   private static long iilliilIiIIiliilIi;
   private static int ilIliilIiIiIliilIi;
   private static long lIiliilIiiIiliilIi;
   private static String IilliilIililliilIi = IIlilIliiIli<"IIlilIliiIli","/wn+8Se0VLD3ibJsT55nb3glLO1byWjWrOqgfq+BnpicyiKThKMM">();
   private static int liIliilIiiiIliilIi;

   private static void IiIiliIiiiIi(float[] a, float[] out, float t, float[] b) {
      for (int var4 = 0; var4 < a.length; var4++) {
         float var5 = out[var4] - a[var4];
         int var6 = var4 % 9;
         if (var6 >= 3 && var6 < 6) {
            var5 -= (float)Math.floor((double)((var5 + 180.0F) / 360.0F)) * 360.0F;
         }

         b[var4] = a[var4] + var5 * t;
      }
   }

   public static iiIiliiIIlilii iIlIlllllill() {
      return iiiIiilIiIIIliilIi == null ? null : iiiIiilIiIIIliilIi.IliIlllilIi();
   }

   public static boolean Ililllililil(class_1309 entity, class_1268 hand) {
      class_310 var2 = class_310.method_1551();
      return entity == var2.field_1724
            && var2.field_1755 == null
            && var2.method_1569()
            && hand == class_1268.field_5808
            && IIililIili.IliIlllilIi(var2.field_1724, hand, var2.field_1724.method_5998(hand))
            && Iilllilliill()
         ? Iiilliiliiil(
            iIIIIilIlIIIil.IilliliilIIi(
               iiiIiilIiIIIliilIi.IliIlllilIi(), iiiIiilIiIIIliilIi.liiiIIllIl(), var2.field_1690.field_1904.method_1434(), liIliilIiiiIliilIi++
            )
         )
         : false;
   }

   private lliIIililiIIil() {
   }

   public static long lIiiIiIlilli() {
      return lllliilIiillliilIi == null ? 0L : iilliilIiIIiliilIi;
   }

   private static void IlIillIiilIi() {
      if (iiiIiilIiIIIliilIi != null) {
         Arrays.fill(IliliilIilliliilIi, 0.0F);

         for (int var0 = 0; var0 < iiiIiilIiIIIliilIi.liiiIIllIl().liiililIll.length; var0++) {
            Arrays.fill(IliliilIilliliilIi, var0 * 9 + 6, var0 * 9 + 9, 1.0F);
         }

         lliIiiililiIiiil var7 = iiiIiilIiIIIliilIi.liiiIIllIl().iiiililIll.get(IilliilIililliilIi);
         if (var7 == null) {
            var7 = iiiIiilIiIIIliilIi.liiiIIllIl().iiiililIll.get(IIlilIliiIli<"IIlilIliiIli","/wn+8Se0VLD3ibJsT55nb3glLO1byWjWrOqgfq+BnpicyiKThKMM">());
         }

         long var1 = System.nanoTime();
         var7.IliIlllilIi((float)(var1 - lIiliilIiiIiliilIi) / 1.0E9F % var7.iIlIlllllill(), IliliilIilliliilIi);
         if (lllliilIiillliilIi != null) {
            float var3 = (float)(var1 - iilliilIiIIiliilIi) / 1.0E9F;
            if (var3 > lllliilIiillliilIi.iIlIlllllill() + 0.12F) {
               lllliilIiillliilIi = null;
            } else {
               float[] var4 = null;
               if (var3 > lllliilIiillliilIi.iIlIlllllill()) {
                  var4 = (float[])IliliilIilliliilIi.clone();
                  lllliilIiillliilIi.IliIlllilIi(lllliilIiillliilIi.iIlIlllllill(), IliliilIilliliilIi);
               } else {
                  lllliilIiillliilIi.IliIlllilIi(var3, IliliilIilliliilIi);
               }

               float var5 = Math.clamp(var3 / 0.12F, 0.0F, 1.0F);
               var5 = var5 * var5 * (3.0F - 2.0F * var5);
               if (var4 != null) {
                  float var6 = Math.clamp((var3 - lllliilIiillliilIi.iIlIlllllill()) / 0.12F, 0.0F, 1.0F);
                  var6 = var6 * var6 * (3.0F - 2.0F * var6);
                  IiIiliIiiiIi(IliliilIilliliilIi, var4, var6, IliliilIilliliilIi);
               } else if (var5 < 1.0F) {
                  IiIiliIiiiIi(ililiilIiIiiliilIi, IliliilIilliliilIi, var5, IliliilIilliliilIi);
               }
            }
         }
      }
   }

   public static List<iIiiiilIliiiil> IiIlliIliiIl() {
      if (iiiIiilIiIIIliilIi != null && lllliilIiillliilIi != null) {
         List var0 = IillIlilillIli.IiIiliIiiiIi(iiiIiilIiIIIliilIi.IliIlllilIi(), lllliilIiillliilIi);
         if (var0 != null) {
            return var0;
         } else {
            return !IlIlllIlilIl() ? List.of() : IllIiiillllIiiil.IliIlllilIi(iiiIiilIiIIIliilIi.liiiIIllIl(), lllliilIiillliilIi);
         }
      } else {
         return List.of();
      }
   }

   public static void IliIlllilIi() {
      iiiIiilIiIIIliilIi = null;
      lIIliilIiiIIliilIi = null;
      lllliilIiillliilIi = null;
      IlIliilIillIliilIi = class_1799.field_8037;
      IliliilIilliliilIi = null;
      ililiilIiIiiliilIi = null;
      liIliilIiiiIliilIi = 0;
      IIlliilIilIlliilIi = 0;
      IilliilIililliilIi = IIlilIliiIli<"IIlilIliiIli","/wn+8Se0VLD3ibJsT55nb3glLO1byWjWrOqgfq+BnpicyiKThKMM">();
   }

   public static boolean IlIlllIlilIl() {
      return lllliilIiillliilIi != null
         && lllliilIiillliilIi.liiiIIllIl().startsWith(IIlilIliiIli<"IIlilIliiIli","2ZfbKkOxTal7mCBr3e83w6gML9kvt2V14TNZ/CBG99prHOA=">());
   }

   public static void IIlllIlliIll(class_310 c, boolean pressed) {
      if (c.field_1724 != null && IIililIili.IliIlllilIi(c.field_1724, class_1268.field_5808, c.field_1724.method_6047())) {
         Iilllilliill();
         if (c.field_1755 == null && c.method_1569()) {
            if (pressed) {
               IIillIiliIil();
            }
         } else {
            lllliilIiillliilIi = null;
         }
      } else {
         IliIlllilIi();
      }
   }

   public static void liiiIIllIl() {
      if (lllliilIiillliilIi != null
         && lllliilIiillliilIi.liiiIIllIl().startsWith(IIlilIliiIli<"IIlilIliiIli","UAFbIPGON6LbG/6tTmnmrXxNpay0/KeVM6P20JKT3vozkQ==">())) {
         lllliilIiillliilIi = null;
      }
   }

   public static float[] IIIilIIiiIIi() {
      Iilllilliill();
      IlIillIiilIi();
      return IliliilIilliliilIi;
   }

   public static float iliIiiliiiii() {
      return lllliilIiillliilIi == null ? 0.0F : (float)(System.nanoTime() - iilliilIiIIiliilIi) / 1.0E9F;
   }

   private static boolean Iiilliiliiil(String name) {
      lliIiiililiIiiil var1 = iiiIiilIiIIIliilIi.liiiIIllIl().iiiililIll.get(name);
      if (var1 == null) {
         return false;
      } else {
         IlIillIiilIi();
         System.arraycopy(IliliilIilliliilIi, 0, ililiilIiIiiliilIi, 0, IliliilIilliliilIi.length);
         lllliilIiillliilIi = var1;
         iilliilIiIIiliilIi = System.nanoTime();
         return true;
      }
   }

   public static float IIIllIIliIIl() {
      return lllliilIiillliilIi == null ? 0.0F : lllliilIiillliilIi.iIlIlllllill();
   }

   static liIlIiliiIlIil Illlllllilll() {
      return iiiIiilIiIIIliilIi;
   }

   public static String IilliliilIIi() {
      return lllliilIiillliilIi == null ? IilliilIililliilIi : lllliilIiillliilIi.liiiIIllIl();
   }

   private static boolean Iilllilliill() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 == null) {
         return false;
      } else {
         liIlIiliiIlIil var1 = iIllliIlllli.iliIiiliiiii(iIiIiliIliIili.lIiiIiIlilli());
         if (var1 == null) {
            return false;
         } else {
            if (iiiIiilIiIIIliilIi != var1
               || lIIliilIiiIIliilIi != var0.field_1724
               || ilIliilIiIiIliilIi != var0.field_1724.method_31548().method_67532()
               || iIlliilIiIllliilIi != var0.field_1724.method_6068()
               || !class_1799.method_7984(IlIliilIillIliilIi, var0.field_1724.method_6047())) {
               IliIlllilIi();
               iiiIiilIiIIIliilIi = var1;
               lIIliilIiiIIliilIi = var0.field_1724;
               ilIliilIiIiIliilIi = lIIliilIiiIIliilIi.method_31548().method_67532();
               iIlliilIiIllliilIi = lIIliilIiiIIliilIi.method_6068();
               IlIliilIillIliilIi = lIIliilIiiIIliilIi.method_6047().method_7972();
               IilliilIililliilIi = iIIIIilIlIIIil.IliIlllilIi(var1.IliIlllilIi(), var1.liiiIIllIl());
               IliliilIilliliilIi = iiiIiilIiIIIliilIi.liiiIIllIl().Illlllllilll();
               ililiilIiIiiliilIi = (float[])IliliilIilliliilIi.clone();
               lIiliilIiiIiliilIi = System.nanoTime();
               IlIillIiilIi();
               Iiilliiliiil(iIIIIilIlIIIil.liiiIIllIl(var1.IliIlllilIi(), var1.liiiIIllIl()));
            }

            return true;
         }
      }
   }

   public static void IIillIiliIil() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 != null
         && IIililIili.IliIlllilIi(var0.field_1724, class_1268.field_5808, var0.field_1724.method_6047())
         && Iilllilliill()
         && !IlIlllIlilIl()) {
         List var1 = iIIIIilIlIIIil.iIlIlllllill(iiiIiilIiIIIliilIi.IliIlllilIi(), iiiIiilIiIIIliilIi.liiiIIllIl());
         if (!var1.isEmpty()) {
            Iiilliiliiil((String)var1.get(Math.floorMod(IIlliilIilIlliilIi++, var1.size())));
         }
      }
   }
}
