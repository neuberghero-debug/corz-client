package gg.corz;

import java.util.List;
import net.minecraft.class_1684;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_2350.class_2351;

final class IIlIlillIlIlil implements liIIliliiIIlil {
   @Override
   public boolean Ililllililil() {
      class_746 var1 = IIlilIliiIli();
      return var1 != null && iliilliIiiilli.IiIlliIliiIl(IiIiliIiiiIi(), var1.method_5829().method_989(0.0, 1.0, 0.0).method_1014(0.01));
   }

   @Override
   public boolean Iilllilliill(int x, int y, int z) {
      return iliilliIiiilli.IilliliilIIi(IiIiliIiiiIi(), new class_2338(x, y, z));
   }

   @Override
   public boolean iliIiiliiiii(class_2338 feet) {
      return (iIiIilIliIil.liiiIIllIl(IiIiliIiiiIi(), feet) & 2) != 0;
   }

   private static class_1937 IiIiliIiiiIi() {
      class_310 var0 = class_310.method_1551();
      return var0 == null ? null : var0.field_1687;
   }

   @Override
   public boolean IIIilIIiiIIi() {
      class_746 var1 = IIlilIliiIli();
      return var1 != null && var1.method_5624() && !var1.method_5681();
   }

   @Override
   public int Iiilliiliiil() {
      long var8 = 1715669620255337003L;
      class_746 var1 = IIlilIliiIli();
      class_1937 var2 = IiIiliIiiiIi();
      if (var1 != null && var2 != null) {
         var8 ^= (-4294967296L ^ var8) & -1L << 32;

         for (class_1684 var5 : var2.method_8390(class_1684.class, var1.method_5829().method_1014(96.0), p -> !p.method_31481() && p.method_24921() == var1)) {
            lIililiIilil var6 = liIiililiiIiilil.IilliliilIIi(var5, true, 80);
            var8 ^= ((long)(var6 != null && var6.iIilIIiiIlilIIii && var6.lIllIIiiiIllIIii >= 0 ? var6.lIllIIiiiIllIIii : 80) ^ var8) & -1L >>> 32;
            if ((int)(var8 >>> 32) < 0 || (int)var8 < (int)(var8 >>> 32)) {
               var8 ^= ((long)((int)var8) << 32 ^ var8) & -1L << 32;
            }
         }

         return (int)(var8 >>> 32);
      } else {
         return -1;
      }
   }

   @Override
   public boolean IiIlliIliiIl() {
      class_746 var1 = IIlilIliiIli();
      return var1 != null && var1.field_5976;
   }

   private static class_746 IIlilIliiIli() {
      class_310 var0 = class_310.method_1551();
      return var0 == null ? null : var0.field_1724;
   }

   @Override
   public int IIIllIIliIIl(class_2338 max, int feet) {
      return iIiIilIliIil.IilliliilIIi(IiIiliIiiiIi(), max, feet);
   }

   @Override
   public boolean IIlllIlliIll() {
      class_746 var1 = IIlilIliiIli();
      return var1 != null && var1.method_5799();
   }

   @Override
   public boolean IIillIiliIil() {
      class_746 var1 = IIlilIliiIli();
      return var1 != null && iliilliIiiilli.IiIlliIliiIl(IiIiliIiiiIi(), var1.method_5829().method_1009(0.1, 0.0, 0.1));
   }

   @Override
   public float Illlllllilll() {
      class_746 var1 = IIlilIliiIli();
      return var1 == null ? Float.NaN : var1.method_7261(0.5F);
   }

   @Override
   public int lIiiIiIlilli(class_2338 feet) {
      return iIiIilIliIil.IliIlllilIi(IiIiliIiiiIi(), feet);
   }

   @Override
   public boolean IliIlllilIi() {
      return lIlIiIliIlIiIl.Iilllilliill();
   }

   @Override
   public double IilliliilIIi(int y, int x, int z) {
      class_1937 var4 = IiIiliIiiiIi();
      if (var4 == null) {
         return Double.NaN;
      } else {
         class_2338 var5 = new class_2338(y, x, z);
         class_2680 var6 = var4.method_8320(var5);
         class_265 var7 = var6.method_26220(var4, var5);
         return var7.method_1110() ? Double.NaN : (double)x + var7.method_1105(class_2351.field_11052);
      }
   }

   @Override
   public List<class_2338> IlIlllIlilIl(class_2338 from, class_2338 to) {
      class_1937 var3 = IiIiliIiiiIi();
      return var3 != null && from != null && to != null ? IIiillllIiilll.IliIlllilIi(var3, from, to, 3) : null;
   }

   @Override
   public boolean iIlIlllllill(int x, int y, int z) {
      class_1937 var4 = IiIiliIiiiIi();
      if (var4 == null) {
         return false;
      } else {
         class_2338 var5 = new class_2338(x, y, z);
         return !var4.method_8320(var5).method_26220(var4, var5).method_1110();
      }
   }

   @Override
   public long liiiIIllIl() {
      long var1 = IIIiillllIIiilll.iIlIlllllill();
      return var1 < 0L ? Long.MAX_VALUE : IIIiillllIIiilll.IliIlllilIi() - var1;
   }

   @Override
   public float IlIillIiilIi() {
      class_746 var1 = IIlilIliiIli();
      if (var1 == null) {
         return Float.NaN;
      } else {
         return ilIiiIiIii.IIlllIlliIll() ? ilIiiIiIii.Iilllilliill() : var1.method_36454();
      }
   }
}
