package gg.corz;

import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_310;
import net.minecraft.class_3532;

public final class liiIiIiiiiIiIi {
   private final IliIIIlllliIIIll IIIIIiliilIIIIilii;
   private static final float[] iIliilliiIlliillii = new float[]{0.0F, -18.0F, 18.0F, -36.0F, 36.0F, -60.0F, 60.0F, -90.0F, 90.0F};
   public double iiIIIiliiIIlIIilii;
   public long IllIIiliilllIIilii;
   public float llIIIiliiilIIIilii;
   private static final float[] IIliilliilIliillii = new float[]{-28.0F, -18.0F, -10.0F, -4.0F, 0.0F, 4.0F, 8.0F, 12.0F, 16.0F, 21.0F, 27.0F, 34.0F};
   private static final int Iliiilliilliiillii = 90;
   private boolean iIIIIiliiIlIIIilii;
   public boolean lIlIIiliiiIlIIilii;
   public float IiIIIiliiliIIIilii;
   public static final double iliiilliiIiiiillii = 900.0;
   private static final float[] Iiliilliililiillii = new float[]{-4.0F, 0.0F, 4.0F, 8.0F, 12.0F, 16.0F};
   private static final int[] iiliilliiIIiiillii = new int[]{10, 25, 45};
   private static final float[] lIiiilliiiIiiillii = new float[]{-28.0F, -18.0F};
   private static final float[] llliilliiilliillii = new float[]{0.0F, -18.0F, 18.0F};
   private final IliIIIlllliIIIll liiiilliiiiiiillii = new IliIIIlllliIIIll();

   private double liiiIIllIl(
      class_310 wantPitch, float mc, float boostLeft, class_243 gravity, int switchAt, float target, int wantYaw, double floor, Iiiilllliiilll pitch2
   ) {
      this.iIIIIiliiIlIIIilii = false;
      IliIIIlllliIIIll var11 = this.liiiilliiiiiiillii.liiiIIllIl(this.IIIIIiliilIIIIilii);
      int var12 = Math.max(0, wantYaw);
      double var13 = gravity.field_1352 - var11.IiiIiiIlll;
      double var15 = gravity.field_1350 - var11.iiiIiiIlll;
      double var17 = Math.hypot(var13, var15);
      if (var17 > 0.001) {
         var13 /= var17;
         var15 /= var17;
      } else {
         var13 = 0.0;
         var15 = 0.0;
      }

      double var19 = 0.0;

      for (int var21 = 0; var21 < 90; var21++) {
         var11.IlIliiIlll = ilIiIlilIiIiIlil.IlIlllIlilIl(var11.IlIliiIlll, mc, 300.0F);
         float var22 = switchAt >= 0 && var21 >= switchAt ? target : boostLeft;
         var11.llIliiIlll = ilIiIlilIiIiIlil.IiIlliIliiIl(var11.llIliiIlll, var22);
         double var23 = Math.hypot(var11.IIIliiIlll, var11.iIIliiIlll);
         ilIiIlilIiIiIlil.IilliliilIIi(var11, floor);
         class_243 var25 = new class_243(var11.IIIliiIlll, var11.lIIliiIlll, var11.iIIliiIlll);
         class_243 var26 = IilliliilIIi(wantPitch, var25, iliIiiliiiii(var11.IiiIiiIlll, var11.liiIiiIlll, var11.iiiIiiIlll));
         boolean var27 = var26.field_1352 != var25.field_1352;
         boolean var28 = var26.field_1350 != var25.field_1350;
         boolean var29 = var26.field_1351 != var25.field_1351;
         double var30 = var11.lIIliiIlll;
         if (var27 || var28) {
            double var32 = Math.hypot(var27 ? 0.0 : var11.IIIliiIlll, var28 ? 0.0 : var11.iIIliiIlll);
            double var34 = (var23 - var32) * 10.0 - 3.0;
            if (var34 > 0.0) {
               return 1000.0 + var34 * 60.0;
            }

            var19 += 12.0;
         }

         var11.IiiIiiIlll = var11.IiiIiiIlll + var26.field_1352;
         var11.liiIiiIlll = var11.liiIiiIlll + var26.field_1351;
         var11.iiiIiiIlll = var11.iiiIiiIlll + var26.field_1350;
         if (var27) {
            var11.IIIliiIlll = 0.0;
         }

         if (var29) {
            var11.lIIliiIlll = 0.0;
         }

         if (var28) {
            var11.iIIliiIlll = 0.0;
         }

         if (var12 > 0 && !var29) {
            ilIiIlilIiIiIlil.lIiiIiIlilli(var11);
            var12--;
         }

         if (var29) {
            if (var30 > 0.0) {
               return (double)(600 + var21);
            }

            double var51 = Math.hypot(var11.IIIliiIlll, var11.iIIliiIlll);
            double var52 = Math.hypot(var11.IiiIiiIlll - gravity.field_1352, var11.iiiIiiIlll - gravity.field_1350);
            int var36 = class_3532.method_15357(var11.IiiIiiIlll);
            int var37 = class_3532.method_15357(var11.liiIiiIlll + 0.01);
            int var38 = class_3532.method_15357(var11.iiiIiiIlll);
            boolean var39 = pitch2 == null || pitch2.safe(var36, var37, var38);
            if (!var39) {
               return 850.0 + var52;
            }

            boolean var40 = Math.abs(var11.liiIiiIlll - gravity.field_1351) < 1.2 && var52 < 7.0;
            double var41 = Math.max(0.0, -var30 - 0.5);
            double var43 = this.iIlIlllllill(wantPitch, var11.IiiIiiIlll, var11.liiIiiIlll, var11.iiiIiiIlll, var11.IIIliiIlll, var11.iIIliiIlll);
            this.iIIIIiliiIlIIIilii = var40 && var43 == 0.0;
            return (double)(var40 ? 0 : 150) + var43 + var52 * 0.6 + var51 * 7.0 + var41 * 45.0 + var19;
         }

         if (var11.liiIiiIlll < gravity.field_1351 - 6.0) {
            return 800.0;
         }
      }

      double var47 = Math.hypot(var11.IiiIiiIlll - gravity.field_1352, var11.iiiIiiIlll - gravity.field_1350);
      double var48 = var11.liiIiiIlll - gravity.field_1351;
      double var49 = Math.hypot(var11.IIIliiIlll, var11.iIIliiIlll);
      double var50 = Math.max(0.0, -((gravity.field_1352 - var11.IiiIiiIlll) * var13 + (gravity.field_1350 - var11.iiiIiiIlll) * var15));
      return Math.min(280.0, 120.0 + Math.abs(var48 - var47 * 0.22) * 4.0 + var47 * 0.4 + Math.max(0.0, var49 - 1.15) * 25.0 + var50 * 1.5 + var19);
   }

   public static class_238 iliIiiliiiii(double x, double y, double z) {
      return new class_238(
         x - Double.longBitsToDouble(8529298797909574894L ^ 5299922170328266717L),
         y,
         z - Double.longBitsToDouble(1282702232373935415L ^ 3323130757954440708L),
         x + Double.longBitsToDouble(-1348203434847182189L ^ -3271571365067763296L),
         y + Double.longBitsToDouble(3689910128287350451L ^ 924929543769017728L),
         z + Double.longBitsToDouble(7294833028976120801L ^ 6552527237577154770L)
      );
   }

   public void IliIlllilIi(class_310 boostLeft, IliIIIlllliIIIll mc, class_243 gravity, int now, double target, Iiiilllliiilll floor) {
      long var8 = System.nanoTime();
      this.IIIIIiliilIIIIilii.liiiIIllIl(mc);
      double var10 = Math.hypot(gravity.field_1352 - mc.IiiIiiIlll, gravity.field_1350 - mc.iiiIiiIlll);
      float var12 = var10 > 2.5
         ? mc.IlIliiIlll
            + class_3532.method_15393(ilIiIlilIiIiIlil.IIlllIlliIll(mc.IiiIiiIlll, mc.iiiIiiIlll, gravity.field_1352, gravity.field_1350) - mc.IlIliiIlll)
         : mc.IlIliiIlll;
      double var13 = Double.MAX_VALUE;
      float var15 = var12;
      float var16 = 0.0F;
      boolean var17 = false;

      for (float var21 : iIliilliiIlliillii) {
         for (float var25 : IIliilliilIliillii) {
            double var26 = this.liiiIIllIl(boostLeft, var12 + var21, var25, gravity, -1, var25, now, target, floor) + (double)Math.abs(var21) * 0.15;
            if (var26 < var13) {
               var13 = var26;
               var15 = var12 + var21;
               var16 = var25;
               var17 = this.iIIIIiliiIlIIIilii;
            }
         }
      }

      if (var10 > 8.0 && (!var17 || !(var13 < 40.0))) {
         for (float var39 : llliilliiilliillii) {
            for (float var43 : Iiliilliililiillii) {
               for (int var29 : iiliilliiIIiiillii) {
                  for (float var33 : lIiiilliiiIiiillii) {
                     double var34 = this.liiiIIllIl(boostLeft, var12 + var39, var43, gravity, var29, var33, now, target, floor)
                        + (double)Math.abs(var39) * 0.15
                        + 2.0;
                     if (var34 < var13) {
                        var13 = var34;
                        var15 = var12 + var39;
                        var16 = var43;
                        var17 = this.iIIIIiliiIlIIIilii;
                     }
                  }
               }
            }
         }
      }

      this.llIIIiliiilIIIilii = var15;
      this.IiIIIiliiliIIIilii = var16;
      this.iiIIIiliiIIlIIilii = var13;
      this.lIlIIiliiiIlIIilii = var17;
      this.IllIIiliilllIIilii = System.nanoTime() - var8;
   }

   public static class_243 IilliliilIIi(class_310 box, class_243 mc, class_238 move) {
      class_238 var3 = move.method_18804(mc);
      return !box.field_1687.method_27982() && lIiiIiIlilli(box, var3) && !box.field_1687.method_8621().method_39459(box.field_1724, var3)
         ? mc
         : class_1297.method_20736(box.field_1724, mc, move, box.field_1687, List.of());
   }

   private static boolean lIiiIiIlilli(class_310 mc, class_238 b) {
      int var2 = class_3532.method_15357(b.field_1323) - 2;
      int var3 = class_3532.method_15357(b.field_1320) + 2;
      int var4 = class_3532.method_15357(b.field_1322) - 2;
      int var5 = class_3532.method_15357(b.field_1325) + 2;
      int var6 = class_3532.method_15357(b.field_1321) - 2;
      int var7 = class_3532.method_15357(b.field_1324) + 2;
      if (var3 < var2 || var5 < var4 || var7 < var6) {
         return false;
      } else if (var4 >= mc.field_1687.method_31607() && var5 <= mc.field_1687.method_31600()) {
         for (int var8 = var2 >> 4; var8 <= var3 >> 4; var8++) {
            for (int var9 = var6 >> 4; var9 <= var7 >> 4; var9++) {
               class_2818 var10 = mc.field_1687.method_2935().method_21730(var8, var9);
               if (var10 == null) {
                  return false;
               }

               class_2826[] var11 = var10.method_12006();

               for (int var12 = var4 >> 4; var12 <= var5 >> 4; var12++) {
                  int var13 = var10.method_31603(var12);
                  if (var13 < 0 || var13 >= var11.length || var11[var13] == null || !var11[var13].method_38292()) {
                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public liiIiIiiiiIiIi() {
      this.IIIIIiliilIIIIilii = new IliIIIlllliIIIll();
      this.iiIIIiliiIIlIIilii = Double.longBitsToDouble(-1078146867243645867L ^ -8149728769238500438L);
   }

   private double iIlIlllllill(class_310 y, double vx, double x, double z, double vz, double mc) {
      double var12 = x;
      double var14 = 0.0;

      for (int var16 = 0; var16 < 14; var16++) {
         var14 = (var14 - 0.08) * 0.98;
         class_243 var17 = new class_243(vz, var14, mc);
         class_243 var18 = IilliliilIIi(y, var17, new class_238(vx - 0.3, x, z - 0.3, vx + 0.3, x + 1.8, z + 0.3));
         vx += var18.field_1352;
         x += var18.field_1351;
         z += var18.field_1350;
         if (var12 - x > 1.2) {
            return 400.0;
         }

         boolean var19 = var18.field_1351 != var17.field_1351 && var14 < 0.0;
         if (var19) {
            var14 = 0.0;
         }

         double var20 = var19 ? 0.546 : 0.91;
         vz = var18.field_1352 != var17.field_1352 ? 0.0 : vz * var20;
         mc = var18.field_1350 != var17.field_1350 ? 0.0 : mc * var20;
         if (var19 && Math.hypot(vz, mc) < 0.02) {
            return 0.0;
         }
      }

      return 0.0;
   }
}
