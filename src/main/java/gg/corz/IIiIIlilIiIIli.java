package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class IIiIIlilIiIIli {
   public static final int Iillliiiilillliiii = 32;
   public static final int iIllliiiiIlllliiii = 8;
   private final lilIIIliiilIIIli ililliiiiIiilliiii;
   public static final int iillliiiiIIilliiii = 64;
   public static final int IIllliiiilIllliiii = 4;
   public static final double IlIlliiiillIlliiii = 4.5;
   public static final int lIilliiiiiIilliiii = 128;
   private long IiIiliiiiliIiliiii;
   public static final float lIIlliiiiiIIlliiii = 0.25F;
   public static final int llllliiiiilllliiii = 16;
   public static final float iiiIliiiiIIIlliiii = 24.0F;
   public static final int ilIlliiiiIiIlliiii = 1;
   private int llIiliiiiilIiliiii;
   public static final int liIlliiiiiiIlliiii = 2;
   private long iIIiliiiiIlIiliiii;
   public static final float lliIliiiiiliIliiii = 0.35F;
   public static final float IiiIliiiiliiIliiii = 0.8F;
   private int liilliiiiiiilliiii;
   private int IIIiliiiilIIiliiii;
   private final class_310 Ililliiiillilliiii = class_310.method_1551();

   public class_243 Iliilliiilii(class_2338 reach, double pos) {
      class_746 var4 = this.Ililliiiillilliiii.field_1724;
      return this.Iiiiliiiiiii(var4.method_33571(), reach, pos);
   }

   public void liiiIIllIl() {
      class_315 var1 = this.Ililliiiillilliiii.field_1690;
      if (var1 != null) {
         int var2 = this.IIIiliiiilIIiliiii & ~this.liilliiiiiiilliiii;
         if (var2 != 0) {
            IIIllIIliIIl(var1, var2, false);
         }
      }
   }

   public void Illlllllilll() {
      this.ililliiiiIiilliiii.lIiiIiIlilli();
   }

   public static class_304[] IlIlllIlilIl(class_315 o) {
      return new class_304[]{
         o.field_1894,
         o.field_1881,
         o.field_1913,
         o.field_1849,
         o.field_1903,
         o.field_1832,
         o.field_1867,
         o.field_1886,
         o.field_1904,
         o.field_1869,
         o.field_1831,
         o.field_1822
      };
   }

   public class_3965 IIiilIiiiIii(double reach) {
      class_746 var3 = this.Ililliiiillilliiii.field_1724;
      class_243 var4 = var3.method_33571();
      class_243 var5 = var4.method_1019(ilIiiIiIii.Iiilliiliiil(var3.method_36454(), var3.method_36455()).method_1021(reach));
      return this.Ililliiiillilliiii.field_1687.method_17742(new class_3959(var4, var5, class_3960.field_17559, class_242.field_1348, var3)) instanceof class_3965 var7
         ? var7
         : class_3965.method_17778(var5, class_2350.field_11036, class_2338.method_49638(var5));
   }

   public IIiIIlilIiIIli() {
      this.ililliiiiIiilliiii = new lilIIIliiilIIIli(0.35F, 0.8F);
      this.llIiliiiiilIiliiii = -1;
      this.IiIiliiiiliIiliiii = -732142904086501587L ^ 8491229132768274221L;
      this.ililliiiiIiilliiii.IliIlllilIi(24.0F);
   }

   public void IIlilIliiIli(class_243 sneak, boolean target) {
      class_746 var3 = this.Ililliiiillilliiii.field_1724;
      if (target) {
         this.IilliliilIIi(((-773312891 - 103 << 25 | -773312891 - 103 >>> 7) + 87) * -113 ^ -894377763);
      }

      double var4 = sneak.field_1352 - var3.method_23317();
      double var6 = sneak.field_1350 - var3.method_23321();
      if (!(var4 * var4 + var6 * var6 < Double.longBitsToDouble(8306607229522624251L ^ 5535633825302653568L))) {
         double var8 = Math.toRadians((double)var3.method_36454());
         double var10 = Math.sin(var8);
         double var12 = Math.cos(var8);
         double var14 = -var4 * var10 + var6 * var12;
         double var16 = var4 * var12 + var6 * var10;
         if (var14 > Double.longBitsToDouble(2442140624384787346L ^ 2184319573521569769L)) {
            this.IilliliilIIi(1);
         } else if (var14 < Double.longBitsToDouble(-8182388598223550300L ^ 3586600389828664543L)) {
            this.IilliliilIIi(2);
         }

         if (var16 > Double.longBitsToDouble(7180889052261840648L ^ 6634891237056897907L)) {
            this.IilliliilIIi(4);
         } else if (var16 < Double.longBitsToDouble(668742871610149267L ^ -5263686550376686104L)) {
            this.IilliliilIIi(-1994648795 * 31 ^ -1704570509);
         }
      }
   }

   public void Iilllilliill(iIIlIlIlIlIlIlIl e) {
      this.ililliiiiIiilliiii.iliIiiliiiii(e);
   }

   private static void IIIllIIliIIl(class_315 o, int on, boolean keys) {
      if ((on & 1) != 0) {
         illIilIilIil.IliIlllilIi(o.field_1894, keys);
      }

      if ((on & 2) != 0) {
         illIilIilIil.IliIlllilIi(o.field_1881, keys);
      }

      if ((on & 4) != 0) {
         illIilIilIil.IliIlllilIi(o.field_1913, keys);
      }

      if ((on & (~(~(~1331089096)) ^ -1331089089)) != 0) {
         illIilIilIil.IliIlllilIi(o.field_1849, keys);
      }

      if ((on & ((--1718866079 * -93 >>> 11 | --1718866079 * -93 << 21) ^ -944177738)) != 0) {
         illIilIilIil.IliIlllilIi(o.field_1903, keys);
      }

      if ((on & ((-(582881651 << 25 | 582881651 >>> 7) >>> 17 | -(582881651 << 25 | 582881651 >>> 7) << 15) ^ -5 ^ -1106185466)) != 0) {
         illIilIilIil.IliIlllilIi(o.field_1832, keys);
      }

      if ((on & ((-1290173053 << 11 | -1290173053 >>> 21) * 9 ^ 764217880)) != 0) {
         illIilIilIil.IliIlllilIi(o.field_1867, keys);
      }

      if ((on & (((1421412383 << 31 | 1421412383 >>> 1) >>> 3 | (1421412383 << 31 | 1421412383 >>> 1) << 29) ^ -179597311)) != 0) {
         illIilIilIil.IliIlllilIi(o.field_1904, keys);
      }
   }

   public void lIiiIiIlilli(int keys) {
      class_315 var2 = this.Ililliiiillilliiii.field_1690;
      this.liilliiiiiiilliiii &= ~keys;
      this.IIIiliiiilIIiliiii &= ~keys;
      if (var2 != null) {
         IIIllIIliIIl(var2, keys, false);
      }
   }

   public void IIlllIlliIll(class_243 prio, int target) {
      class_746 var3 = this.Ililliiiillilliiii.field_1724;
      if (var3 != null && prio != null) {
         float[] var4 = ilIiiIiIii.Ililllililil(var3.method_33571(), prio);
         float var5 = target >= (-((-1913562485 ^ -87) >>> 7 | (-1913562485 ^ -87) << 25) ^ -1155800393)
            ? lilllliillll.iIlIlllllill(this.iIIiliiiiIlIiliiii, 0.25F, 0)
            : 0.0F;
         float var6 = target >= (((216332915 + -13 << 7 | 216332915 + -13 >>> 25) - -93) * -1431655765 ^ 2071925024)
            ? lilllliillll.iIlIlllllill(this.iIIiliiiiIlIiliiii, 0.25F, 1)
            : 0.0F;
         this.ililliiiiIiilliiii.iIlIlllllill(var4[0] + var5, var4[1] + var6, target);
      }
   }

   public static boolean iIIIlIlIIl(class_310 pos, class_2338 mc) {
      if (mc != null && pos.field_1765 instanceof class_3965 var3 && var3.method_17783() == class_240.field_1332 && var3.method_17777().equals(mc)) {
         return true;
      }

      return false;
   }

   public boolean IiIiliIiiiIi(class_2338 tol, double cell) {
      return this.IIIilIIiiIIi(class_243.method_24955(tol)) <= cell;
   }

   public void IliIlllilIi(long nowTick) {
      this.iIIiliiiiIlIiliiii = nowTick;
      this.IIIiliiiilIIiliiii = this.liilliiiiiiilliiii;
      this.liilliiiiiiilliiii = 0;
      this.ililliiiiIiilliiii.liiiIIllIl();
      class_746 var3 = this.Ililliiiillilliiii.field_1724;
      if (var3 != null) {
         int var4 = var3.method_31548().method_67532();
         if (var4 != this.llIiliiiiilIiliiii) {
            this.llIiliiiiilIiliiii = var4;
            this.IiIiliiiiliIiliiii = nowTick;
         }
      }
   }

   public double IIIilIIiiIIi(class_243 t) {
      class_746 var2 = this.Ililliiiillilliiii.field_1724;
      return Math.hypot(t.field_1352 - var2.method_23317(), t.field_1350 - var2.method_23321());
   }

   public void IiIlliIliiIl(float pitch, float prio, int yaw) {
      this.ililliiiiIiilliiii.iIlIlllllill(pitch, prio, yaw);
   }

   public void IilliliilIIi(int keys) {
      class_315 var2 = this.Ililliiiillilliiii.field_1690;
      if (var2 != null) {
         this.liilliiiiiiilliiii |= keys;
         IIIllIIliIIl(var2, keys, true);
      }
   }

   public void Illillliilli(class_2338 cell, boolean sneakEdge, boolean jump) {
      class_746 var4 = this.Ililliiiillilliiii.field_1724;
      class_243 var5 = class_243.method_24955(cell);
      double var6 = this.IIIilIIiiIIi(var5);
      boolean var8 = cell.method_10264() < this.Iiilliiliiil().method_10264();
      if (var6 < 0.6) {
         if (!var8) {
            this.IilliliilIIi(32);
         }

         this.IIlilIliiIli(var5, false);
         if (sneakEdge && var4.method_24828()) {
            this.IilliliilIIi(16);
         }
      } else {
         float var9 = this.IlIillIiilIi(var5);
         this.IiIlliIliiIl(var9, 12.0F, 0);
         if (Math.abs(class_3532.method_15393(var9 - var4.method_36454())) < 35.0F) {
            this.IilliliilIIi(1);
         } else {
            this.IIlilIliiIli(var5, false);
         }

         if ((jump || !var8 && !sneakEdge && var6 < 1.2) && !var8) {
            this.IilliliilIIi(32);
         }

         if (sneakEdge && var4.method_24828() && var6 < 1.5) {
            this.IilliliilIIi(16);
         }
      }
   }

   public boolean iliIiiliiiii(int keys) {
      return (this.liilliiiiiiilliiii & keys) != 0;
   }

   public class_2338 Iiilliiliiil() {
      class_746 var1 = this.Ililliiiillilliiii.field_1724;
      return class_2338.method_49637(
         var1.method_23317(), var1.method_23318() + Double.longBitsToDouble(2277863458627240838L ^ 2341778949197197493L), var1.method_23321()
      );
   }

   public class_243 Iiiiliiiiiii(class_243 pos, class_2338 reach, double eye) {
      class_746 var5 = this.Ililliiiillilliiii.field_1724;
      class_243 var6 = null;
      double var7 = Double.MAX_VALUE;

      for (class_2350 var12 : class_2350.values()) {
         class_243 var13 = class_243.method_24953(reach)
            .method_1031((double)var12.method_10148() * 0.49, (double)var12.method_10164() * 0.49, (double)var12.method_10165() * 0.49);
         class_243 var14 = pos.method_1020(var13);
         if (!(
            var14.field_1352 * (double)var12.method_10148() + var14.field_1351 * (double)var12.method_10164() + var14.field_1350 * (double)var12.method_10165()
               <= 0.0
         )) {
            double var15 = pos.method_1025(var13);
            if (!(var15 > eye * eye) && !(var15 >= var7)) {
               class_3965 var17 = this.Ililliiiillilliiii
                  .field_1687
                  .method_17742(new class_3959(pos, var13, class_3960.field_17559, class_242.field_1348, var5));
               if (var17 instanceof class_3965) {
                  class_3965 var18 = var17;
                  if (var18.method_17783() == class_240.field_1332 && !var18.method_17777().equals(reach)) {
                     continue;
                  }
               }

               var6 = var13;
               var7 = var15;
            }
         }
      }

      return var6;
   }

   public void Ililllililil(int slot) {
      class_746 var2 = this.Ililliiiillilliiii.field_1724;
      if (var2 != null && slot >= 0 && slot <= (~((2145456010 - 91 ^ -87) * -113) ^ -1918358739)) {
         if (var2.method_31548().method_67532() != slot) {
            var2.method_31548().method_61496(slot);
            this.llIiliiiiilIiliiii = slot;
            this.IiIiliiiiliIiliiii = this.iIIiliiiiIlIiliiii;
         }
      }
   }

   public void Iilililiiili(double jump, double dx, boolean sprint, boolean dz) {
      class_746 var7 = this.Ililliiiillilliiii.field_1724;
      if (var7 != null) {
         float var8 = (float)Math.toDegrees(Math.atan2(-jump, dx));
         this.IiIlliIliiIl(var8, 8.0F, 0);
         if (Math.abs(class_3532.method_15393(var8 - var7.method_36454())) < 32.0F) {
            this.IilliliilIIi(1);
            if (sprint && var7.method_7344().method_7586() > ((117375400 + -7) * 99 * -1631000239 ^ -201457355)) {
               this.IilliliilIIi((1726446739 - 119) * -91 - 43 ^ 1807147425);
            }
         }

         if (dz && (var7.method_24828() || var7.method_5799())) {
            this.IilliliilIIi(~(-36944194 + 119 >>> 31 | -36944194 + 119 << 1) ^ 73888132);
         }
      }
   }

   public void iIlIlllllill() {
      long var3 = 5988410707790658474L;
      class_315 var1 = this.Ililliiiillilliiii.field_1690;
      var3 ^= ((long)(this.liilliiiiiiilliiii | this.IIIiliiiilIIiliiii) << 32 ^ var3) & -1L << 32;
      this.liilliiiiiiilliiii = 0;
      this.IIIiliiiilIIiliiii = 0;
      if (var1 != null && (int)(var3 >>> 32) != 0) {
         IIIllIIliIIl(var1, (int)(var3 >>> 32), false);
      }

      this.ililliiiiIiilliiii.IiIlliIliiIl();
   }

   public boolean IIIIllIIIl(class_243 target, float tolDeg) {
      class_746 var3 = this.Ililliiiillilliiii.field_1724;
      class_243 var4 = target.method_1020(var3.method_33571());
      double var5 = var4.method_1033();
      if (var5 < Double.longBitsToDouble(-998808519195406957L ^ -3658697425479725378L)) {
         return true;
      } else {
         class_243 var7 = ilIiiIiIii.Iiilliiliiil(var3.method_36454(), var3.method_36455());
         return var7.method_1026(var4) / var5 >= Math.cos(Math.toRadians((double)tolDeg));
      }
   }

   public float IlIillIiilIi(class_243 t) {
      class_746 var2 = this.Ililliiiillilliiii.field_1724;
      return (float)Math.toDegrees(Math.atan2(-(t.field_1352 - var2.method_23317()), t.field_1350 - var2.method_23321()));
   }

   public boolean IIillIiliIil(int slot) {
      class_746 var2 = this.Ililliiiillilliiii.field_1724;
      return var2 != null
         && var2.method_31548().method_67532() == slot
         && this.iIIiliiiiIlIiliiii - this.IiIiliiiiliIiliiii >= (541869578514894078L ^ 541869578514894079L);
   }
}
