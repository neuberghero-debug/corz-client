package gg.corz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class liiiliIliiiiliIl {
   private final ilIIIIiIiIIIIi liIllIIlll;
   private class_2338 iIlllIIlll;
   private boolean lIlllIIlll;
   private final class_310 IiIllIIlll;
   private class_243 IllllIIlll;
   private double IilllIIlll;
   private class_2338 lilllIIlll;
   private IlIIIIllllIIIIll IIlllIIlll;
   private class_243 iilllIIlll;
   private double lllllIIlll;
   private final IliIIlIllliIIlIl iiIllIIlll = new IliIIlIllliIIlIl();
   private static final float ilIllIIlll = 32.0F;
   private final Set<class_2338> IIillIIlll;
   private double illllIIlll;

   private class_243 IIillIiliIil(class_746 reach, class_2338 pos, double p) {
      long var18 = -6482313830991631219L;
      long var20 = 1823418021710802635L;
      long var22 = -6193780152122525364L;
      class_243 var5 = class_243.method_24953(pos);
      if (this.IIillIIlll.contains(pos)) {
         class_243 var6 = this.Ililllililil(reach, pos, p);
         if (var6 != null) {
            return var6;
         }
      }

      if (IiIiliIiiiIi(reach, pos, var5, p)) {
         return var5;
      } else {
         class_238 var24 = IIIilIIiiIIi(reach.method_73183(), pos);
         if (var24 != null) {
            class_243 var7 = var24.method_1005();
            if (IiIiliIiiiIi(reach, pos, var7, p)) {
               return var7;
            }

            class_2350[] var8 = IlIillIiilIi(reach.method_33571(), var7);
            var18 ^= ((long)var8.length << 32 ^ var18) & -1L << 32;

            for (long var30 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var30 < (int)(var30 >>> 32); var30 ^= (var30 ^ var30 + (long)1) & -1L >>> 32) {
               class_2350 var11 = var8[(int)var30];
               class_243 var12 = new class_243(
                  var11.method_10148() > 0 ? var24.field_1320 - 0.01 : (var11.method_10148() < 0 ? var24.field_1323 + 0.01 : var7.field_1352),
                  var11.method_10164() > 0 ? var24.field_1325 - 0.01 : (var11.method_10164() < 0 ? var24.field_1322 + 0.01 : var7.field_1351),
                  var11.method_10165() > 0 ? var24.field_1324 - 0.01 : (var11.method_10165() < 0 ? var24.field_1321 + 0.01 : var7.field_1350)
               );
               if (IiIiliIiiiIi(reach, pos, var12, p)) {
                  return var12;
               }
            }
         }

         double var25 = (double)pos.method_10263();
         double var9 = (double)pos.method_10264();
         double var26 = (double)pos.method_10260();
         if (var9 <= reach.method_23318() + 0.5) {
            class_243[] var13 = new class_243[]{
               new class_243(var25 + 0.5, var9 + 0.9, var26 + 0.5),
               new class_243(var25 + 0.3, var9 + 0.9, var26 + 0.5),
               new class_243(var25 + 0.7, var9 + 0.9, var26 + 0.5),
               new class_243(var25 + 0.5, var9 + 0.9, var26 + 0.3),
               new class_243(var25 + 0.5, var9 + 0.9, var26 + 0.7)
            };
            class_243[] var14 = var13;
            var20 ^= ((long)var13.length << 32 ^ var20) & -1L << 32;

            for (var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
               class_243 var17 = var14[(int)var20];
               if (IiIiliIiiiIi(reach, pos, var17, p)) {
                  return var17;
               }
            }
         }

         class_2350[] var27 = IlIillIiilIi(reach.method_33571(), var5);
         var22 ^= ((long)var27.length << 32 ^ var22) & -1L << 32;

         for (long var32 = var20 ^ (0L ^ var20) & -1L << 32; (int)(var32 >>> 32) < (int)(var22 >>> 32); var32 += 4294967296L) {
            class_2350 var16 = var27[(int)(var32 >>> 32)];
            class_243 var28 = lllIIlilillIIlil.IlIlllIlilIl(pos, var16);
            if (IiIiliIiiiIi(reach, pos, var28, p)) {
               return var28;
            }
         }

         return null;
      }
   }

   private class_243 Iilllilliill(class_746 p, class_2338 reach, double pos) {
      if (reach.equals(this.iIlllIIlll) && this.IllllIIlll != null && IiIiliIiiiIi(p, reach, this.IllllIIlll, pos)) {
         return this.IllllIIlll;
      } else {
         return reach.equals(this.lilllIIlll) && this.iilllIIlll != null && IiIiliIiiiIi(p, reach, this.iilllIIlll, pos)
            ? this.iilllIIlll
            : this.IIillIiliIil(p, reach, pos);
      }
   }

   static class_238 IIIilIIiiIIi(class_1922 w, class_2338 pos) {
      class_265 var2 = w.method_8320(pos).method_26218(w, pos);
      if (var2.method_1110()) {
         return null;
      } else {
         class_238 var3 = var2.method_1107();
         return var3.field_1323 <= 0.001
               && var3.field_1322 <= 0.001
               && var3.field_1321 <= 0.001
               && var3.field_1320 >= 0.999
               && var3.field_1325 >= 0.999
               && var3.field_1324 >= 0.999
            ? null
            : var3.method_996(pos);
      }
   }

   public boolean Illlllllilll(class_2338 reach, class_2338 stand, double pos) {
      class_746 var5 = this.IiIllIIlll.field_1724;
      class_638 var6 = this.IiIllIIlll.field_1687;
      if (var5 != null && var6 != null) {
         class_243 var7 = new class_243(
            (double)reach.method_10263() + 0.5, (double)((float)reach.method_10264() + var5.method_5751()), (double)reach.method_10260() + 0.5
         );
         class_238 var8 = IIIilIIiiIIi(var6, stand);
         class_243 var9 = var8 == null ? class_243.method_24953(stand) : var8.method_1005();
         if (var7.method_1025(var9) > pos * pos) {
            return false;
         } else {
            class_3965 var10 = var6.method_17742(new class_3959(var7, var9, class_3960.field_17559, class_242.field_1348, var5));
            return var10.method_17783() == class_240.field_1332 && var10.method_17777().equals(stand);
         }
      } else {
         return false;
      }
   }

   static int IIlilIliiIli(class_746 p, class_2680 state) {
      long var10 = 6945620961100553573L;
      long var12 = 2955654253890571354L;
      class_1661 var2 = p.method_31548();
      var10 ^= ((long)var2.method_67532() << 32 ^ var10) & -1L << 32;
      float var4 = -1.0F;
      var10 ^= (0L ^ var10) & -1L >>> 32;
      var12 ^= (0L ^ var12) & -1L << 32;

      while ((int)(var12 >>> 32) < 9) {
         class_1799 var7 = var2.method_5438((int)(var12 >>> 32));
         float var8 = var7.method_7960() ? 1.0F : var7.method_7924(state);
         var12 ^= ((long)(!var7.method_7960() && var7.method_7951(state) ? 1 : 0) ^ var12) & -1L >>> 32;
         if ((int)var12 != 0 && (int)var10 == 0 || (int)var12 == (int)var10 && var8 > var4) {
            var4 = var8;
            var10 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)((int)var12) ^ var10) & -1L >>> 32;
         }

         var12 += 4294967296L;
      }

      if ((int)(var10 >>> 32) != var2.method_67532()) {
         var2.method_61496((int)(var10 >>> 32));
      }

      return (int)(var10 >>> 32);
   }

   public int IIIllIIliIIl(class_746 p) {
      long var6 = 592025600943365008L;
      String var2 = this.liIllIIlll.IlIIlIilillIIlIili == null ? "" : this.liIllIIlll.IlIIlIilillIIlIili.trim().toLowerCase();
      if (var2.isEmpty()) {
         return -1;
      } else {
         class_1661 var3 = p.method_31548();

         for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < 9; var8 += 4294967296L) {
            class_1799 var5 = var3.method_5438((int)(var8 >>> 32));
            if (!var5.method_7960() && var5.method_7964().getString().toLowerCase().contains(var2)) {
               return (int)(var8 >>> 32);
            }
         }

         return -1;
      }
   }

   private class_243 Ililllililil(class_746 p, class_2338 pos, double reach) {
      class_1937 var5 = p.method_73183();
      ArrayList var6 = new ArrayList(var5.method_8320(pos).method_26218(var5, pos).method_1090());
      var6.sort((a, b) -> Double.compare(Iiilliiliiil(b), Iiilliiliiil(a)));
      class_243 var7 = p.method_33571();

      for (class_238 var9 : var6) {
         class_238 var10 = var9.method_996(pos);
         class_243 var11 = var10.method_1005();
         double var12 = var7.field_1351 > var10.field_1325
            ? var10.field_1325 - 0.01
            : (var7.field_1351 < var10.field_1322 ? var10.field_1322 + 0.01 : var11.field_1351);
         class_243 var14 = new class_243(var11.field_1352, var12, var11.field_1350);
         if (IiIiliIiiiIi(p, pos, var14, reach)) {
            return var14;
         }

         if (IiIiliIiiiIi(p, pos, var11, reach)) {
            return var11;
         }
      }

      return null;
   }

   public boolean IiIlliIliiIl() {
      long var2 = 8082141671074047055L;
      var2 ^= ((long)this.lIlllIIlll << 32 ^ var2) & -1L << 32;
      this.lIlllIIlll = false;
      return (boolean)((int)(var2 >>> 32));
   }

   public void IliIlllilIi(class_2338 pos) {
      this.IIillIIlll.add(pos.method_10062());
      if (pos.equals(this.iIlllIIlll)) {
         this.IllllIIlll = null;
      }

      if (pos.equals(this.lilllIIlll)) {
         this.iilllIIlll = null;
      }
   }

   private static double Iiilliiliiil(class_238 b) {
      return b.method_17939() * b.method_17941() + b.method_17940() * Math.max(b.method_17939(), b.method_17941());
   }

   public boolean IIlllIlliIll(class_2338 pos, double reach) {
      class_746 var4 = this.IiIllIIlll.field_1724;
      return var4 != null && this.Iilllilliill(var4, pos, reach) != null;
   }

   public boolean iliIiiliiiii(class_2338 reach, double drill, boolean pos) {
      long var10 = -2980712672440439807L;
      class_746 var5 = this.IiIllIIlll.field_1724;
      class_638 var6 = this.IiIllIIlll.field_1687;
      if (var5 != null && var6 != null && this.IiIllIIlll.field_1761 != null) {
         class_2680 var7 = var6.method_8320(reach);
         if (var7.method_26215()) {
            this.Iilililiiili();
            return false;
         } else {
            var10 ^= ((long)(pos && this.IIIllIIliIIl(var5) >= 0 ? 1 : 0) << 32 ^ var10) & -1L << 32;
            if (this.IIlllIIlll != null && !this.IIlllIIlll.allows(reach, (boolean)((int)(var10 >>> 32)))) {
               if (this.iIlllIIlll != null) {
                  this.Iilililiiili();
               }

               return false;
            } else {
               class_243 var9 = this.Iilllilliill(var5, reach, drill);
               if (var9 == null) {
                  if (!reach.equals(this.iIlllIIlll)) {
                     this.Iilililiiili();
                  }

                  return false;
               } else {
                  if (!reach.equals(this.iIlllIIlll)) {
                     this.IiIllIIlll.field_1761.method_2925();
                     this.iIlllIIlll = reach.method_10062();
                  }

                  this.IllllIIlll = var9;
                  this.IlIlllIlilIl(var5, var7, pos);
                  if (!this.lIiiIiIlilli(reach)) {
                     this.iiIllIIlll.IilliliilIIi(var5, var9, 32.0F);
                  }

                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   private static class_2350[] IlIillIiilIi(class_243 eye, class_243 center) {
      long var9 = -6080675501043459578L;
      class_2350[] var2 = (class_2350[])class_2350.values().clone();
      double[] var3 = new double[var2.length];

      for (var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < var2.length; var9 += 4294967296L) {
         var3[(int)(var9 >>> 32)] = (double)var2[(int)(var9 >>> 32)].method_10148() * (eye.field_1352 - center.field_1352)
            + (double)var2[(int)(var9 >>> 32)].method_10164() * (eye.field_1351 - center.field_1351)
            + (double)var2[(int)(var9 >>> 32)].method_10165() * (eye.field_1350 - center.field_1350);
      }

      var9 ^= (4294967296L ^ var9) & -1L << 32;

      while ((int)(var9 >>> 32) < var2.length) {
         class_2350 var5 = var2[(int)(var9 >>> 32)];
         double var6 = var3[(int)(var9 >>> 32)];

         for (var9 ^= ((long)((int)(var9 >>> 32) - 1) ^ var9) & -1L >>> 32;
            (int)var9 >= 0 && var3[(int)var9] < var6;
            var9 ^= (var9 ^ var9 + (long)-1) & -1L >>> 32
         ) {
            var2[(int)var9 + 1] = var2[(int)var9];
            var3[(int)var9 + 1] = var3[(int)var9];
         }

         var2[(int)var9 + 1] = var5;
         var3[(int)var9 + 1] = var6;
         var9 += 4294967296L;
      }

      return var2;
   }

   public class_2338 IIiilIiiiIii() {
      return this.iIlllIIlll;
   }

   public void Iilililiiili() {
      this.iIlllIIlll = null;
      this.IllllIIlll = null;
      this.lilllIIlll = null;
      this.iilllIIlll = null;
      if (this.IiIllIIlll.field_1761 != null) {
         this.IiIllIIlll.field_1761.method_2925();
      }
   }

   private static boolean IiIiliIiiiIi(class_746 pos, class_2338 reach, class_243 p, double point) {
      class_243 var5 = pos.method_33571();
      if (var5.method_1025(p) > point * point) {
         return false;
      } else {
         class_3965 var6 = pos.method_73183().method_17742(new class_3959(var5, p, class_3960.field_17559, class_242.field_1348, pos));
         return var6.method_17783() == class_240.field_1332 && var6.method_17777().equals(reach);
      }
   }

   public liiiliIliiiiliIl(class_310 config, ilIIIIiIiIIIIi mc) {
      this.lllllIIlll = Double.NaN;
      this.IIillIIlll = new HashSet<>();
      this.IiIllIIlll = config;
      this.liIllIIlll = mc;
   }

   public void Illillliilli() {
      this.iIlllIIlll = null;
      this.IllllIIlll = null;
   }

   private boolean lIiiIiIlilli(class_2338 pos) {
      long var13 = 6408216408507727541L;
      class_746 var2 = this.IiIllIIlll.field_1724;
      if (var2 == null) {
         return false;
      } else {
         class_243 var3 = var2.method_33571();
         var13 ^= ((long)Double.isNaN(this.lllllIIlll) << 32 ^ var13) & -1L << 32;
         double var5 = var3.field_1352 - this.lllllIIlll;
         double var7 = var3.field_1351 - this.illllIIlll;
         double var9 = var3.field_1350 - this.IilllIIlll;
         this.lllllIIlll = var3.field_1352;
         this.illllIIlll = var3.field_1351;
         this.IilllIIlll = var3.field_1350;
         if ((int)(var13 >>> 32) == 0 && !(var5 * var5 + var7 * var7 + var9 * var9 > 1.0E-4)) {
            if (this.IiIllIIlll.field_1765 instanceof class_3965 var11 && var11.method_17783() == class_240.field_1332 && var11.method_17777().equals(pos)) {
               return true;
            }

            return false;
         } else {
            return false;
         }
      }
   }

   private void IlIlllIlilIl(class_746 drill, class_2680 p, boolean state) {
      long var11 = 158279709716732672L;
      long var13 = 1666028767123509774L;
      class_1661 var4 = drill.method_31548();
      var11 ^= ((long)this.IIIllIIliIIl(drill) << 32 ^ var11) & -1L << 32;
      if ((int)(var11 >>> 32) < 0) {
         IIlilIliiIli(drill, p);
      } else if (state) {
         if (var4.method_67532() != (int)(var11 >>> 32)) {
            var4.method_61496((int)(var11 >>> 32));
         }
      } else {
         var11 ^= ~var11 & -1L >>> 32;
         float var7 = -1.0F;

         for (var13 ^= (0L ^ var13) & -1L << 32; (int)(var13 >>> 32) < 9; var13 += 4294967296L) {
            if ((int)(var13 >>> 32) != (int)(var11 >>> 32)) {
               class_1799 var9 = var4.method_5438((int)(var13 >>> 32));
               if (!var9.method_7960() && var9.method_7951(p)) {
                  float var10 = var9.method_7924(p);
                  if (var10 > var7) {
                     var7 = var10;
                     var11 ^= ((long)((int)(var13 >>> 32)) ^ var11) & -1L >>> 32;
                  }
               }
            }
         }

         if ((int)var11 < 0) {
            if (var4.method_5438((int)(var11 >>> 32)).method_7951(p)) {
               var11 ^= ((long)((int)(var11 >>> 32)) ^ var11) & -1L >>> 32;
               this.lIlllIIlll = true;
            } else {
               for (long var20 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var20 >>> 32) < 9; var20 += 4294967296L) {
                  if ((int)(var20 >>> 32) != (int)(var11 >>> 32)) {
                     class_1799 var15 = var4.method_5438((int)(var20 >>> 32));
                     float var16 = var15.method_7960() ? 1.0F : var15.method_7924(p);
                     if (var16 > var7) {
                        var7 = var16;
                        var11 ^= ((long)((int)(var20 >>> 32)) ^ var11) & -1L >>> 32;
                     }
                  }
               }
            }
         }

         if ((int)var11 >= 0 && (int)var11 != var4.method_67532()) {
            var4.method_61496((int)var11);
         }
      }
   }

   public void liiiIIllIl() {
      this.IIillIIlll.clear();
   }

   public boolean IilliliilIIi(class_2338 reach, double pos) {
      class_746 var4 = this.IiIllIIlll.field_1724;
      class_638 var5 = this.IiIllIIlll.field_1687;
      if (var4 == null || var5 == null) {
         return false;
      } else if (var5.method_8320(reach).method_26215()) {
         return false;
      } else {
         class_243 var6 = reach.equals(this.lilllIIlll) && this.iilllIIlll != null && IiIiliIiiiIi(var4, reach, this.iilllIIlll, pos)
            ? this.iilllIIlll
            : this.IIillIiliIil(var4, reach, pos);
         if (var6 == null) {
            return false;
         } else {
            this.lilllIIlll = reach.method_10062();
            this.iilllIIlll = var6;
            if (!this.lIiiIiIlilli(reach)) {
               this.iiIllIIlll.IilliliilIIi(var4, var6, 32.0F);
            }

            return true;
         }
      }
   }

   public void iIlIlllllill(IlIIIIllllIIIIll guard) {
      this.IIlllIIlll = guard;
   }
}
