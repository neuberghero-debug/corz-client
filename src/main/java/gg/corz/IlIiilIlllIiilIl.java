package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class IlIiilIlllIiilIl {
   public static final int lIiIiilIll = 5;
   private static final IiIIIlliIIIl liIliilIll = new IiIIIlliIIIl();
   private List<List<class_243>> IIlliilIll = List.of();
   public static final int IiiIiilIll = 2;
   public static final int llIliilIll = 3;
   public static final int iIiIiilIll = 3;
   public static final double IiIliilIll = 0.001;
   public static final int liIIiilIll = 30;
   public static final int lliIiilIll = 72;
   public static final double lIIliilIll = 0.2;
   public static final double illIiilIll = 2.0;
   public static final int iiiIiilIll = 2;
   public static final double IllIiilIll = 6.0;
   private final IilIllililIlli iiIliilIll;
   public static final int IlIliilIll = 60;
   public static final int iIIliilIll = 6;
   public static final int lilIiilIll = 8;
   public static final int liiIiilIll = 400;
   public static final int lllIiilIll = 6;
   public static final double iilIiilIll = 1.0;
   public static final int lIlIiilIll = 2;
   private Predicate<class_2338> lIlliilIll = p -> false;
   public static final int iiIIiilIll = 2;
   public static final double ilIliilIll = 0.3;
   public static final int IIlIiilIll = 25;
   public static final double IIiIiilIll = 1.6;
   private int iIlliilIll = 100;
   public static final double iIlIiilIll = 0.2;
   public static final double IIIliilIll = 0.15;
   public static final double[] IilIiilIll = new double[]{1.6, 2.4, 3.4};
   public static final int iliIiilIll = 45;
   public static final int IiIIiilIll = 40;
   public static final int IliIiilIll = 16;

   private static boolean Iiilliiliiil(class_2338 eye, class_243 base) {
      long var8 = -89517293974929171L;
      class_2350[] var2 = new class_2350[]{class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034};
      var8 ^= ((long)var2.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         class_2350 var5 = var2[(int)var11];
         class_243 var6 = lllIliIlillIliIl.illilIilil(eye, var5);
         class_243 var7 = new class_243((double)var5.method_10148(), 0.0, (double)var5.method_10165());
         if (!((base.field_1352 - var6.field_1352) * var7.field_1352 + (base.field_1350 - var6.field_1350) * var7.field_1350 <= 0.0)
            && base.method_1022(var6) <= 4.25) {
            return true;
         }
      }

      return false;
   }

   private IiiilIllliiilIll IlIlllIlilIl(
      IlIlilIillIlilIi grounded,
      IliIlIIllliIlIIl floorY,
      iIlIiiIiIllIiiIi ticksSincePop,
      int landIdx,
      boolean c,
      boolean rT,
      int targetWindow,
      int retotem,
      int cal,
      int jw,
      double eye0,
      IIliiiIilIliiiIi sinceRight,
      lliiilIiiliiilIi seed,
      liiilIiliiiilIil path,
      illIlIiIilIlIi lo,
      IiIIIlliIIIl self,
      IilIlIIllilIlIIl selfWindow,
      IilIlIIllilIlIIl player,
      float ourFeet,
      int target,
      int reattack,
      int targetReadyIn,
      iliIIiIiiIIi w,
      class_746 belowLevel,
      class_243 ticksSinceLastBlast,
      class_243 cycle,
      int spawnSeen,
      double selfBudget
   ) {
      long var80 = 7736805511310770256L;
      long var82 = 8319807153089844255L;
      long var84 = -4017737099780798090L;
      long var74 = -8768096301076600701L;
      long var76 = -27865822153178836L;
      long var78 = 8255387369630676686L;
      class_2338 var31 = grounded.IliIlllilIi();
      class_243 var32 = lllIliIlillIliIl.liiiIIllIl(var31);
      class_243 var33 = IliIlIIllliIlIIl.Iliilliiilii(var31);
      ArrayList var34 = new ArrayList(4);
      ArrayList var35 = new ArrayList(3);
      class_243 var36 = null;
      float var37 = belowLevel.method_36454();
      float var38 = belowLevel.method_36455();
      if (!grounded.lIiiIiIlilli()) {
         for (class_2338 var40 : grounded.liiiIIllIl()) {
            class_243 var41 = new class_243((double)var40.method_10263() + 0.5, (double)var40.method_10264(), (double)var40.method_10260() + 0.5);
            double var42 = var36 == null
               ? IliIlIIllliIlIIl.Illillliilli(var37, var38, ticksSinceLastBlast, var41)
               : IliIlIIllliIlIIl.IIlilIliiIli(ticksSinceLastBlast, var36, var41);
            var34.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.IIliiiIiil, 2, var42, false));
            var35.add(var40);
            var36 = var41;
         }

         double var86 = var36 == null
            ? IliIlIIllliIlIIl.Illillliilli(var37, var38, ticksSinceLastBlast, var33)
            : IliIlIIllliIlIIl.IIlilIliiIli(ticksSinceLastBlast, var36, var33);
         var34.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.lIliiiIiil, 1, var86, false));
         var35.add(null);
         var36 = var33;
      }

      class_243 var87 = var32.method_1031(0.0, 1.0, 0.0);
      double var88 = var36 == null
         ? IliIlIIllliIlIIl.Illillliilli(var37, var38, ticksSinceLastBlast, var87)
         : IliIlIIllliIlIIl.IIlilIliiIli(ticksSinceLastBlast, var36, var87);
      var34.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.iIliiiIiil, 3, var88, false));
      int[] var89 = IlIiIiillIiIii.IilliliilIIi(new illIIlIilIIl(w.iliIiiliiiii(), this.iIlliilIll, targetReadyIn, 2, cal, jw, true), var34);
      var74 ^= ((long)(c ? ticksSincePop.liiiIIllIl() - 1 : landIdx - 1) << 32 ^ var74) & -1L << 32;
      double var44 = Double.POSITIVE_INFINITY;
      var74 ^= (0L ^ var74) & -1L >>> 32;
      var76 ^= (0L ^ var76) & -1L << 32;

      while ((int)(var76 >>> 32) < var35.size()) {
         var76 ^= ((long)(var89[(int)(var76 >>> 32)] + (int)var74) ^ var76) & -1L >>> 32;
         var78 ^= ((long)(var35.get((int)(var76 >>> 32)) == null ? Math.max((int)var76, grounded.IIIllIIliIIl()) : (int)var76) << 32 ^ var78) & -1L << 32;
         class_238 var50 = var35.get((int)(var76 >>> 32)) == null
            ? lllIliIlillIliIl.iIlIlllllill(var31)
            : lllIliIlillIliIl.lIiiIiIlilli((class_2338)var35.get((int)(var76 >>> 32)));
         var78 ^= ~var78 & -1L >>> 32;

         for (var80 ^= ((long)((int)(var78 >>> 32)) << 32 ^ var80) & -1L << 32; (int)(var80 >>> 32) <= (int)(var74 >>> 32); var80 += 4294967296L) {
            double var53 = IliIlIIllliIlIIl.IlIillIiilIi(IliIlIIllliIlIIl.IIIilIIiiIIi(ticksSincePop.IliIlllilIi((int)(var80 >>> 32)), 0.0), var50);
            if (var53 > 0.0) {
               var78 ^= ((long)((int)(var80 >>> 32)) ^ var78) & -1L >>> 32;
               var44 = Math.min(var44, var53);
               break;
            }
         }

         if ((int)var78 < 0) {
            return null;
         }

         var74 ^= ((long)((int)var74 + ((int)var78 - (int)var76)) ^ var74) & -1L >>> 32;
         var76 += 4294967296L;
      }

      var76 ^= ((long)(var89[var89.length - 1] + (int)var74) << 32 ^ var76) & -1L << 32;
      if (grounded.lIiiIiIlilli() && grounded.iliIiiliiiii() > (int)(var76 >>> 32)) {
         var76 ^= ((long)grounded.iliIiiliiiii() << 32 ^ var76) & -1L << 32;
      }

      if (!grounded.lIiiIiIlilli() && (int)(var76 >>> 32) < var89[var89.length - 2] + (int)var74 + cal) {
         var76 ^= ((long)(var89[var89.length - 2] + (int)var74 + cal) << 32 ^ var76) & -1L << 32;
      }

      if ((int)(var76 >>> 32) > (int)(var74 >>> 32)) {
         return null;
      } else {
         double var90 = self.IiIlliIliiIl();
         iilIIlIlIIiIIlIl var49;
         if (!c && (!rT || !ticksSincePop.IliIlllilIi((int)(var76 >>> 32)).IIIllIIliIIl())) {
            var80 ^= ((long)(Math.min(landIdx, ticksSincePop.liiiIIllIl() - 1) + 1) << 32 ^ var80) & -1L << 32;
            double[] var92 = new double[(int)(var80 >>> 32)];
            double[] var54 = new double[(int)(var80 >>> 32)];
            double[] var55 = new double[(int)(var80 >>> 32)];

            for (var80 ^= (0L ^ var80) & -1L >>> 32; (int)var80 < (int)(var80 >>> 32); var80 ^= (var80 ^ var80 + (long)1) & -1L >>> 32) {
               liIIiIlliiIIiIll var57 = ticksSincePop.IliIlllilIi((int)var80);
               var92[(int)var80] = var57.liiiIIllIl() - (double)grounded.iIlIlllllill();
               var54[(int)var80] = var57.lIiiIiIlilli();
               var55[(int)var80] = IIlllIlliIll(
                  ticksSincePop, (int)var80, retotem, targetWindow, var32, var57, grounded.iIlIlllllill(), lo.lIiiIiIlilli(), var90
               );
            }

            var76 ^= ((long)iIIIIIlIlIIIIl.liiiIIllIl(var92, var54, (int)(var76 >>> 32), target, reattack, retotem, targetWindow, landIdx, var55) ^ var76)
               & -1L >>> 32;
            if ((int)var76 < 0) {
               return null;
            }

            double var56 = (int)var76 + 1 < (int)(var80 >>> 32) ? var92[(int)var76 + 1] : var92[(int)var76];
            var49 = iIIIIIlIlIIIIl.IliIlllilIi(
               var92[(int)var76],
               var54[(int)var76],
               (int)var76 >= target,
               (int)Math.min(2147483647L, (long)reattack + (long)((int)var76)),
               retotem,
               targetWindow,
               landIdx - (int)var76,
               var56,
               var55[(int)var76]
            );
            if (var49 == iilIIlIlIIiIIlIl.iIliIiilIl) {
               var49 = iilIIlIlIIiIIlIl.lIliIiilIl;
            }
         } else {
            var76 ^= ~var76 & -1L >>> 32;

            for (long var104 = var80 ^ ((long)Math.max(0, (int)(var76 >>> 32)) << 32 ^ var80) & -1L << 32;
               (int)(var104 >>> 32) <= (int)(var74 >>> 32);
               var104 += 4294967296L
            ) {
               if ((int)(var104 >>> 32) >= target && (long)reattack + (long)((int)(var104 >>> 32)) >= (long)retotem) {
                  liIIiIlliiIIiIll var91 = ticksSincePop.IliIlllilIi((int)(var104 >>> 32));
                  if (IIiiIIllIiiIIl.IliIlllilIi(var91.liiiIIllIl(), (double)grounded.iIlIlllllill()) >= 3) {
                     var76 ^= ((long)((int)(var104 >>> 32)) ^ var76) & -1L >>> 32;
                     break;
                  }
               }
            }

            if ((int)var76 < 0) {
               return null;
            }

            var49 = iilIIlIlIIiIIlIl.IIliIiilIl;
         }

         liIIiIlliiIIiIll var52 = ticksSincePop.IliIlllilIi((int)var76);
         class_243 var93 = new class_243(var52.IliIlllilIi(), var52.liiiIIllIl(), var52.iIlIlllllill());
         var82 ^= ((long)IIiiIIllIiiIIl.IliIlllilIi(var52.liiiIIllIl(), (double)grounded.iIlIlllllill()) << 32 ^ var82) & -1L << 32;
         double var94 = (double)((int)(var82 >>> 32)) / (double)IIiiIIllIiiIIl.IIIIiiiIllIIIiiiIl.length;
         if (!(var94 > 0.0)) {
            return null;
         } else {
            double var95 = 0.2 * (double)Math.min((int)var76, 6);
            if (!grounded.lIiiIiIlilli()) {
               for (class_2338 var60 : grounded.liiiIIllIl()) {
                  if (ticksSinceLastBlast.method_1022(
                        new class_243((double)var60.method_10263() + 0.5, (double)var60.method_10264(), (double)var60.method_10260() + 0.5)
                     )
                     > 4.25 + var95) {
                     return null;
                  }
               }

               if (ticksSinceLastBlast.method_1022(var33) > 4.25 + var95) {
                  return null;
               }
            }

            if (!(lllIliIlillIliIl.IIlilIliiIli(ticksSinceLastBlast, lllIliIlillIliIl.IilliliilIIi(var31)) < 3.0 + var95)) {
               return null;
            } else {
               double var96 = Math.min(cycle.field_1351, (double)grounded.iIlIlllllill() - 1.0);
               double var61 = IIiiIIllIiiIIl.IilliliilIIi(var96, (double)grounded.iIlIlllllill());
               double var63 = Math.max(IilIiilIll[0], cycle.method_1022(var32) - 0.2 * (double)Math.min((int)var76, 6));
               float var65 = lllIliIlillIliIl.ilIllIiIll(belowLevel, var63, 6.0F) * (float)var61;
               float var66 = iiIiiliIIliili.iliIiiliiiii(var65, seed.IiIlliIliiIl(), selfWindow, (int)var76);
               float var67 = iiIiiliIIliili.lIiiIiIlilli(var65, seed.IiIlliIliiIl());
               if (!(var66 <= ourFeet)) {
                  return null;
               } else if (var67 > 0.0F && var67 >= seed.IIIllIIliIIl() + seed.IlIlllIlilIl() - 1.0F) {
                  return null;
               } else {
                  float var68 = lllIliIlillIliIl.ilIllIiIll(path.lIiiIiIlilli(), var93.method_1022(var32), 6.0F) * (float)var94;
                  float var69 = iiIiiliIIliili.IIIllIIliIIl(var68, path.IlIillIiilIi(), player, (int)var76) * path.Illillliilli();
                  var82 ^= ((long)iiIiiliIIliili.IlIlllIlilIl(var69, path.IliIlllilIi()) ^ var82) & -1L >>> 32;
                  var84 ^= (
                        (long)((int)var82 == 0 || !path.IllIllllIl() && path.Iilililiiili() && !((double)spawnSeen < selfBudget - 1.0) ? 0 : 1) << 32 ^ var84
                     )
                     & -1L << 32;
                  double var72 = this.IiIlliIliiIl(
                     grounded,
                     (int)var76,
                     var94,
                     var69,
                     (boolean)((int)var82),
                     (boolean)((int)(var84 >>> 32)),
                     var66,
                     ourFeet,
                     ticksSincePop,
                     landIdx,
                     targetWindow,
                     retotem,
                     eye0,
                     lo,
                     self,
                     cycle,
                     var44,
                     sinceRight
                  );
                  return !Double.isFinite(var72)
                     ? null
                     : new IiiilIllliiilIll(
                        grounded, (int)var76, var49, var72, var94, var69, (boolean)((int)var82), (boolean)((int)(var84 >>> 32)), var66, var44, var93, var89
                     );
               }
            }
         }
      }
   }

   public llIIlllilIIlll IilliliilIIi(
      long veto,
      IliIlIIllliIlIIl weights,
      iIliIlilIlliIlil t,
      lliiilIiiliiilIi cfg,
      liiilIiliiiilIil self,
      ilIliliIiIlili targetReadyIn,
      llilIlIlililIlIl current,
      lilliIiiilliIi target,
      iliilIlIiiilIl ticksSinceLastBlast,
      List<liiilIiliiiilIil> threat,
      int profile,
      int selfBudget,
      float crystal,
      IlliIlllllliIlll enemies,
      Predicate<class_243> tick,
      llIIlllilIIlll w
   ) {
      return this.lIiiIiIlilli(
         veto, weights, t, cfg, self, targetReadyIn, current, target, ticksSinceLastBlast, threat, profile, selfBudget, crystal, enemies, tick, w, false
      );
   }

   private static class_243 IIillIiliIil(IliIlIIllliIlIIl w, class_243 top, int p) {
      long var7 = -1296478715483279383L;
      long var9 = -6253839562998914842L;
      var7 ^= ((long)((int)Math.floor(top.field_1352)) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)((int)Math.floor(top.field_1350)) ^ var7) & -1L >>> 32;
      var9 ^= ((long)((int)Math.floor((double)p - 1.0 + 1.0E-6)) << 32 ^ var9) & -1L << 32;

      for (long var14 = var9 ^ ((long)((int)(var9 >>> 32)) ^ var9) & -1L >>> 32;
         (int)var14 >= (int)(var14 >>> 32) - 5;
         var14 ^= (var14 ^ var14 + (long)-1) & -1L >>> 32
      ) {
         if (!w.solid((int)(var7 >>> 32), (int)var14, (int)var7)
            && !w.solid((int)(var7 >>> 32), (int)var14 + 1, (int)var7)
            && w.solid((int)(var7 >>> 32), (int)var14 - 1, (int)var7)) {
            return new class_243((double)((int)(var7 >>> 32)) + 0.5, (double)((int)var14), (double)((int)var7) + 0.5);
         }
      }

      return null;
   }

   private static boolean IiIiliIiiiIi(IliIlIIllliIlIIl targetEntity, IlIlilIillIlilIi w, class_1297 c, class_1297 selfEntity) {
      if (!w.lIiiIiIlilli() && targetEntity.IIillIiliIil(w.IliIlllilIi(), c, selfEntity)) {
         return true;
      } else if (w.liiiIIllIl().isEmpty()) {
         return false;
      } else {
         for (class_1511 var5 : targetEntity.Iilllilliill(lllIliIlillIliIl.liiiIIllIl(w.IliIlllilIi()), 3.0)) {
            if (!lllIliIlillIliIl.iliIiiliiiii(var5).equals(w.IliIlllilIi())) {
               for (class_2338 var7 : w.liiiIIllIl()) {
                  if (var5.method_5829().method_994(lllIliIlillIliIl.lIiiIiIlilli(var7))) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private List<IlIlilIillIlilIi> IIIllIIliIIl(
      IliIlIIllliIlIIl s0,
      iIlIiiIiIllIiiIi w,
      int selfEntity,
      boolean belowLevel,
      liIIiIlliiIIiIll path,
      iliIIiIiiIIi cfg,
      llilIlIlililIlIl snap,
      Predicate<class_243> belowTop,
      IlliIlllllliIlll grounded,
      long tick,
      int spawnSeen,
      boolean landIdx,
      int veto,
      class_1297 targetEntity,
      class_1297 lo
   ) {
      long var64 = -4988960037434611922L;
      long var66 = -1719824683299191368L;
      long var52 = -914917686555920989L;
      long var68 = 5788745776964670933L;
      long var54 = -4390863411660764535L;
      long var70 = -2057274537185907291L;
      long var56 = -701661353467330743L;
      long var72 = 7978169561273635182L;
      long var58 = 3094493905734523525L;
      long var74 = -8268731727098098060L;
      long var60 = 870261462933922413L;
      long var62 = -5191054530656123032L;
      double var17 = 2.0;
      HashMap var19 = new HashMap();
      var52 ^= ((long)(belowLevel ? Math.min(30, w.liiiIIllIl() - 1) : Math.min(selfEntity, 30)) << 32 ^ var52) & -1L << 32;

      for (long var78 = var52 ^ ((long)(belowLevel ? 0 : 1) ^ var52) & -1L >>> 32;
         (int)var78 <= (int)(var78 >>> 32);
         var78 ^= ((long)((int)var78 + (belowLevel ? 31 : 2)) ^ var78) & -1L >>> 32
      ) {
         liIIiIlliiIIiIll var22 = w.IliIlllilIi((int)var78);
         long var79 = var54 ^ ((long)((int)Math.floor(var22.IliIlllilIi() - var17)) << 32 ^ var54) & -1L << 32;
         var54 = var79 ^ ((long)((int)Math.floor(var22.IliIlllilIi() + var17)) ^ var79) & -1L >>> 32;
         var56 ^= ((long)((int)Math.floor(var22.iIlIlllllill() - var17)) << 32 ^ var56) & -1L << 32;
         var56 ^= ((long)((int)Math.floor(var22.iIlIlllllill() + var17)) ^ var56) & -1L >>> 32;
         var58 ^= ((long)((int)(var54 >>> 32)) << 32 ^ var58) & -1L << 32;

         while ((int)(var58 >>> 32) <= (int)var54) {
            for (var58 ^= ((long)((int)(var56 >>> 32)) ^ var58) & -1L >>> 32; (int)var58 <= (int)var56; var58 ^= (var58 ^ var58 + (long)1) & -1L >>> 32) {
               double var29 = IliIlIIllliIlIIl.iIIIlIlIIl(
                  (double)((int)(var58 >>> 32)) + 0.5, (double)((int)var58) + 0.5, var22.IliIlllilIi(), var22.iIlIlllllill()
               );
               if (!(var29 > var17)) {
                  long var31 = class_2338.method_10064((int)(var58 >>> 32), 0, (int)var58);
                  double[] var33 = (double[])var19.get(var31);
                  if (var33 == null || var29 < var33[0]) {
                     var19.put(var31, new double[]{var29, var22.liiiIIllIl(), (double)((int)(var58 >>> 32)), (double)((int)var58)});
                  }
               }
            }

            var58 += 4294967296L;
         }
      }

      Object var21 = new ArrayList(var19.values());
      var21.sort(Comparator.comparingDouble(a -> a[0]));
      if (var21.size() > 25) {
         var21 = var21.subList(0, 25);
      }

      var60 ^= ((long)(snap.IIIllIIliIIl() && cfg.lIiiIiIlilli() >= 0 ? 1 : 0) << 32 ^ var60) & -1L << 32;
      ArrayList var23 = new ArrayList();

      for (double[] var25 : var21) {
         var56 ^= ((long)((int)var25[2]) ^ var56) & -1L >>> 32;
         var58 ^= ((long)((int)var25[3]) << 32 ^ var58) & -1L << 32;
         double var28 = var25[1];
         double var30 = belowLevel ? var28 + 1.0E-6 : var28 - 0.2;
         double var32 = var28 - 6.0;
         var60 ^= ((long)((int)Math.floor(var30) - 1) ^ var60) & -1L >>> 32;
         var62 ^= ((long)((int)Math.floor(var32) - 2) << 32 ^ var62) & -1L << 32;
         var62 ^= (-2147483648L ^ var62) & -1L >>> 32;

         for (var64 ^= ((long)((int)var60) << 32 ^ var64) & -1L << 32; (int)(var64 >>> 32) >= (int)(var62 >>> 32); var64 += -4294967296L) {
            if (s0.solid((int)var56, (int)(var64 >>> 32), (int)(var58 >>> 32))) {
               var62 ^= ((long)((int)(var64 >>> 32)) ^ var62) & -1L >>> 32;
               break;
            }
         }

         if ((int)var62 != Integer.MIN_VALUE && (!s0.solid((int)var56, (int)var62 + 1, (int)(var58 >>> 32)) || (int)var62 + 1 > (int)var60)) {
            ArrayList var37 = new ArrayList(3);
            class_2338 var38 = new class_2338((int)var56, (int)var62, (int)(var58 >>> 32));
            class_2338 var39 = var38.method_10084();
            class_2338 var40 = var38.method_10086(2);
            if ((int)(var60 >>> 32) != 0 && !landIdx) {
               var64 ^= ((long)((int)var62 + 3) ^ var64) & -1L >>> 32;
               if ((double)((int)var64) <= var30
                  && (double)((int)var64) >= var32
                  && s0.IiIlliIliiIl(var39)
                  && s0.IlIlllIlilIl(var40)
                  && s0.iliIiiliiiii(var40.method_10084())
                  && !s0.lIiiIiIlilli(var40)) {
                  var37.add(new IlIlilIillIlilIi(var40, List.of(var39, var40), (int)var64, false, false, -1, 0));
               }

               var66 ^= ((long)((int)var62 + 2) << 32 ^ var66) & -1L << 32;
               if ((double)((int)(var66 >>> 32)) <= var30 && (double)((int)(var66 >>> 32)) >= var32 && s0.IiIlliIliiIl(var39)) {
                  var37.add(new IlIlilIillIlilIi(var39, List.of(var39), (int)(var66 >>> 32), false, false, -1, 0));
               }
            }

            var64 ^= ((long)((int)var62 + 1) ^ var64) & -1L >>> 32;
            if ((double)((int)var64) <= var30 && (double)((int)var64) >= var32 && s0.IIIllIIliIIl(var38)) {
               class_1511 var42 = s0.Illlllllilll(var38);
               var66 ^= ((long)var38.equals(grounded.IilliliilIIi()) ^ var66) & -1L >>> 32;
               long var84 = var68 ^ ((long)IIlilIliiIli(var38, grounded, IlIiilIlllIiilIl::Illillliilli) << 32 ^ var68) & -1L << 32;
               var68 = var84
                  ^ (
                        (long)(
                              (int)(var84 >>> 32) == 0
                                    || grounded.IiIlliIliiIl() == Long.MIN_VALUE
                                    || grounded.IIlllIlliIll() != Long.MIN_VALUE && grounded.IiIlliIliiIl() <= grounded.IIlllIlliIll()
                                 ? 0
                                 : 1
                           )
                           ^ var84
                     )
                     & -1L >>> 32;
               long var85 = var70
                  ^ (
                        (long)(
                                 (int)var66 == 0
                                       || grounded.IIlllIlliIll() == Long.MIN_VALUE
                                       || grounded.IiIlliIliiIl() != Long.MIN_VALUE && grounded.IIlllIlliIll() < grounded.IiIlliIliiIl()
                                    ? 0
                                    : 1
                              )
                              << 32
                           ^ var70
                     )
                     & -1L << 32;
               var70 = var85 ^ ((long)((int)(var85 >>> 32) != 0 && tick - grounded.IIlllIlliIll() < (long)(spawnSeen + 1) ? 1 : 0) ^ var85) & -1L >>> 32;
               var72 ^= ((long)(var42 == null && (int)var68 != 0 && tick - grounded.IiIlliIliiIl() < (long)(spawnSeen + 1) ? 1 : 0) << 32 ^ var72) & -1L << 32;
               var72 ^= ((long)((var42 == null || (int)var70 != 0) && (int)(var72 >>> 32) == 0 ? 0 : 1) ^ var72) & -1L >>> 32;
               if ((int)var72 != 0 || s0.iliIiiliiiii(var39) || (int)var70 != 0) {
                  long var87 = var74
                     ^ ((long)((int)(var72 >>> 32) != 0 ? (int)Math.max(0L, grounded.IiIlliIliiIl() + (long)spawnSeen - tick) : -1) << 32 ^ var74) & -1L << 32;
                  var74 = var87
                     ^ ((long)((int)var72 == 0 && (int)var70 != 0 ? (int)Math.max(0L, grounded.IIlllIlliIll() + (long)spawnSeen - tick) : 0) ^ var87)
                        & -1L >>> 32;
                  var37.add(new IlIlilIillIlilIi(var38, List.of(), (int)var64, true, (boolean)((int)var72), (int)(var74 >>> 32), (int)var74));
               }
            }

            if (landIdx && (int)(var60 >>> 32) != 0 && !s0.IIIllIIliIIl(var38)) {
               class_2338 var76 = new class_2338((int)var56, veto - 1, (int)(var58 >>> 32));
               if (s0.IiIlliIliiIl(var76) && var76.method_10264() + 1 == veto) {
                  var37.add(new IlIlilIillIlilIi(var76, List.of(var76), veto, false, false, -1, 0));
               }
            }

            var66 ^= (0L ^ var66) & -1L << 32;

            for (IlIlilIillIlilIi var44 : var37) {
               if ((int)(var66 >>> 32) >= 2) {
                  break;
               }

               if (!landIdx || var44.iIlIlllllill() == veto) {
                  class_243 var45 = lllIliIlillIliIl.liiiIIllIl(var44.IliIlllilIi());
                  if (!belowTop.test(var45)
                     && !this.lIlliilIll.test(var44.IliIlllilIi())
                     && !this.IlIillIiilIi(var44.IliIlllilIi())
                     && !IiIiliIiiiIi(s0, var44, targetEntity, lo)) {
                     var23.add(var44);
                     var66 += 4294967296L;
                  }
               }
            }
         }
      }

      return var23;
   }

   static boolean IIlilIliiIli(class_2338 snap, IlliIlllllliIlll pending, Predicate<class_2338> ground) {
      if (snap != null && pending != null && snap.equals(pending.IilliliilIIi())) {
         return pending.iIlIlllllill() == IlliIlillliIli.IiiiIlIIIl ? false : ground != null && ground.test(snap);
      } else {
         return false;
      }
   }

   public llIIlllilIIlll lIiiIiIlilli(
      long current,
      IliIlIIllliIlIIl cfg,
      iIliIlilIlliIlil enemies,
      lliiilIiiliiilIi ticksSinceLastBlast,
      liiilIiliiiilIil t,
      ilIliliIiIlili w,
      llilIlIlililIlIl tick,
      lilliIiiilliIi profile,
      iliilIlIiiilIl selfBudget,
      List<liiilIiliiiilIil> targetReadyIn,
      int belowLevel,
      int crystal,
      float threat,
      IlliIlllllliIlll veto,
      Predicate<class_243> self,
      llIIlllilIIlll target,
      boolean weights
   ) {
      long var81 = -238210300115184381L;
      long var97 = -170307858031181370L;
      long var83 = -6781608141275636173L;
      long var99 = 4374389996489735424L;
      long var85 = -7881885726914565871L;
      long var101 = 7571947504083478280L;
      long var87 = -8544496714916385100L;
      long var103 = -4356259827004547884L;
      long var89 = 77156794431055109L;
      long var91 = -8072906629473123110L;
      long var93 = 4919497284199576685L;
      long var95 = -3047338752289710618L;
      class_746 var19 = class_310.method_1551().field_1724;
      if (var19 != null && cfg != null && cfg.IilliliilIIi() != null && enemies != null && ticksSinceLastBlast != null && t != null && tick != null) {
         IlliIlllllliIlll var20 = veto == null ? IlliIlllllliIlll.IiiIIlIill : veto;
         cfg.liiiIIllIl(var20.Illlllllilll());
         illIlIiIilIlIi var21 = enemies.IiIlliIliiIl();
         if (var21 == null) {
            return null;
         } else {
            iliIIiIiiIIi var22 = iIiilillIliilill.Iliilliiilii(var19, tick.IIIllIIliIIl());
            if (var22.IilliliilIIi() < 0) {
               return null;
            } else {
               IiIIIlliIIIl var23 = w != null ? w.IilliliilIIi() : liIliilIll;
               Predicate var24 = self == null ? v -> false : self;
               liIIiIlliiIIiIll var25 = var21.IliIlllilIi();
               class_243 var26 = new class_243(var25.IliIlllilIi(), var25.liiiIIllIl(), var25.iIlIlllllill());
               class_243 var27 = iIliIlilIlliIlil.iIiIlIliIl(ticksSinceLastBlast.liiiIIllIl().method_1020(var26));
               iIlIiiIiIllIiiIi var28 = enemies.IIlllIlliIll(40, cfg, var23, var27, null);
               if (var28 == null) {
                  return null;
               } else {
                  var81 ^= ((long)var28.iIlIlllllill() << 32 ^ var81) & -1L << 32;
                  var81 ^= ((long)((int)(var81 >>> 32) >= var28.liiiIIllIl() && var25.IIIllIIliIIl() ? 1 : 0) ^ var81) & -1L >>> 32;
                  if ((int)var81 != 0 && !weights) {
                     return null;
                  } else {
                     var83 ^= ((long)var21.IIIllIIliIIl().IilliliilIIi() << 32 ^ var83) & -1L << 32;
                     var83 ^= ((long)var21.IIIllIIliIIl().iIlIlllllill() ^ var83) & -1L >>> 32;
                     var85 ^= ((long)IlIiIiillIiIii.iIlIlllllill((int)var83) << 32 ^ var85) & -1L << 32;
                     var85 ^= ((long)liiIIliliiiIIlil.IIiilIiiiIii((int)Math.round(var21.IIIllIIliIIl().iliIiiliiiii())) ^ var85) & -1L >>> 32;
                     double var35 = (int)var81 != 0
                        ? var25.liiiIIllIl()
                        : var28.IliIlllilIi(Math.min((int)(var81 >>> 32), var28.liiiIIllIl() - 1)).liiiIIllIl();
                     var87 ^= ((long)(tick.IliIlllilIi() == null ? 0 : tick.IliIlllilIi().ordinal()) << 32 ^ var87) & -1L << 32;
                     IIliiiIilIliiiIi var38 = IIliiiIilIliiiIi.IliIlllilIi(
                        profile == null ? 1.0 : (double)profile.liiiIIllIl(),
                        profile == null ? 1.0 : (double)profile.iIlIlllllill(),
                        ililiilIiiliil.IliIllllilliIlllli[(int)(var87 >>> 32)]
                     );
                     IilIlIIllilIlIIl var39 = new IilIlIIllilIlIIl(
                        lIiiililiIiiilil.liiiIIllIl(ticksSinceLastBlast.IIIIllIIIl(), ticksSinceLastBlast.IIiIllIiIl()), ticksSinceLastBlast.iIIIlIlIIl()
                     );
                     IilIlIIllilIlIIl var40 = new IilIlIIllilIlIIl(Math.max(0, belowLevel), t.llIIlilIIl());
                     var87 ^= ((long)(var20.IiIlliIliiIl() == Long.MIN_VALUE ? 100 : (int)Math.min(100L, Math.max(0L, current - var20.IiIlliIliiIl()))) ^ var87)
                        & -1L >>> 32;
                     var89 ^= (
                           (long)(t.lIlIliIlIl() == Long.MIN_VALUE ? Integer.MAX_VALUE : (int)Math.min(2147483647L, current - t.lIlIliIlIl())) << 32 ^ var89
                        )
                        & -1L << 32;
                     double var43 = w != null ? w.lIiiIiIlilli().Ililllililil() : 8.0;
                     var89 ^= ((long)((int)Math.round(var35)) ^ var89) & -1L >>> 32;
                     List var46 = this.IIIllIIliIIl(
                        cfg,
                        var28,
                        (int)(var81 >>> 32),
                        (boolean)((int)var81),
                        var25,
                        var22,
                        tick,
                        var24,
                        var20,
                        current,
                        (int)var83,
                        weights,
                        (int)var89,
                        t.lIiiIiIlilli(),
                        var19
                     );
                     ArrayList var47 = new ArrayList(var46.size());
                     class_243 var48 = ticksSinceLastBlast.iIlIlllllill() != null ? ticksSinceLastBlast.iIlIlllllill() : var19.method_33571();

                     for (IlIlilIillIlilIi var50 : var46) {
                        IiiilIllliiilIll var51 = this.IlIlllIlilIl(
                           var50,
                           cfg,
                           var28,
                           (int)(var81 >>> 32),
                           (boolean)((int)var81),
                           weights,
                           (int)(var83 >>> 32),
                           (int)(var85 >>> 32),
                           (int)var83,
                           (int)var85,
                           var35,
                           var38,
                           ticksSinceLastBlast,
                           t,
                           var21,
                           var23,
                           var39,
                           var40,
                           threat,
                           belowLevel,
                           crystal,
                           (int)var87,
                           var22,
                           var19,
                           var48,
                           ticksSinceLastBlast.liiiIIllIl(),
                           (int)(var89 >>> 32),
                           var43
                        );
                        if (var51 != null) {
                           var47.add(var51);
                        }
                     }

                     var47.sort(Comparator.comparingDouble(IiiilIllliiilIll::IilliliilIIi).reversed());
                     if (target != null && target.IliIlllilIi() != null) {
                        for (var91 ^= (4294967296L ^ var91) & -1L << 32; (int)(var91 >>> 32) < var47.size(); var91 += 4294967296L) {
                           if (((IiiilIllliiilIll)var47.get((int)(var91 >>> 32))).IliIlllilIi().IliIlllilIi().equals(target.IliIlllilIi())) {
                              var47.add(0, (IiiilIllliiilIll)var47.remove((int)(var91 >>> 32)));
                              break;
                           }
                        }
                     }

                     ArrayList var105 = new ArrayList();
                     var91 ^= (4L ^ var91) & -1L >>> 32;
                     var93 ^= (1717986918400L ^ var93) & -1L << 32;
                     var93 ^= (0L ^ var93) & -1L >>> 32;
                     var95 ^= (0L ^ var95) & -1L << 32;
                     HashMap var54 = new HashMap();
                     ArrayList var55 = new ArrayList();

                     for (IiiilIllliiilIll var57 : var47) {
                        if ((int)var93 >= 6 || (int)(var95 >>> 32) >= 16) {
                           break;
                        }

                        long var125 = var95 + 4294967296L;
                        var95 = var125 ^ ((long)((int)var93 == 0 && (int)(var93 >>> 32) >= 72 ? 1 : 0) ^ var125) & -1L >>> 32;
                        IIIllillIIllil var59 = this.Iilllilliill(
                           cfg, var57.IliIlllilIi(), ticksSinceLastBlast, (int)var95 != 0 ? selfBudget : null, targetReadyIn, profile, weights
                        );
                        if (var59 != null) {
                           if ((int)var95 != 0) {
                              var93 += -309237645312L;
                           }

                           class_243 var60 = var59.IliIlllilIi().method_1031(0.0, 1.62, 0.0);
                           if (Ililllililil(var57.IliIlllilIi(), var57.liiiIIllIl(), var60)) {
                              var93 ^= (var93 ^ var93 + (long)1) & -1L >>> 32;
                              double var61 = IIiiIIllIiiIIl.IilliliilIIi(var59.IliIlllilIi().field_1351, (double)var57.IliIlllilIi().iIlIlllllill());
                              class_243 var63 = lllIliIlillIliIl.liiiIIllIl(var57.IliIlllilIi().IliIlllilIi());
                              float var64 = lllIliIlillIliIl.ilIllIiIll(var19, var59.IliIlllilIi().method_1022(var63), 6.0F) * (float)var61;
                              float var65 = iiIiiliIIliili.iliIiiliiiii(var64, ticksSinceLastBlast.IiIlliIliiIl(), var39, var57.liiiIIllIl());
                              float var66 = iiIiiliIIliili.lIiiIiIlilli(var64, ticksSinceLastBlast.IiIlliIliiIl());
                              double var67 = var57.lIiiIiIlilli();
                              float var69 = var57.iliIiiliiiii();
                              class_2338 var70 = var57.IliIlllilIi().IilliliilIIi() ? null : var57.IliIlllilIi().IliIlllilIi();
                              var97 ^= (0L ^ var97) & -1L << 32;
                              if ((int)var91 > 0 && this.iiIliilIll != null && t.lIiiIiIlilli() != null) {
                                 var97 ^= ((long)(45 + (var61 > 0.0 ? 45 : 0)) ^ var97) & -1L >>> 32;
                                 if ((int)var97 <= (int)(var93 >>> 32) && this.iiIliilIll.liiiIIllIl((int)var97, 2)) {
                                    var93 ^= ((long)((int)(var93 >>> 32) - (int)var97) << 32 ^ var93) & -1L << 32;
                                    var91 ^= (var91 ^ var91 + (long)-1) & -1L >>> 32;
                                    var97 ^= (4294967296L ^ var97) & -1L << 32;
                                    liIIiIlliiIIiIll var73 = var28.IliIlllilIi(var57.liiiIIllIl());
                                    float var74 = lllIliIlillIliIl.lIlIliIlIl(
                                       var63,
                                       IliIlIIllliIlIIl.Iiilliiliiil(var73.IliIlllilIi(), var73.liiiIIllIl(), var73.iIlIlllllill(), 0.0),
                                       t.lIiiIiIlilli(),
                                       var70
                                    );
                                    var67 = (double)var74;
                                    if (var61 > 0.0) {
                                       class_238 var75 = IliIlIIllliIlIIl.Iiilliiliiil(
                                          var59.IliIlllilIi().field_1352, var59.IliIlllilIi().field_1351, var59.IliIlllilIi().field_1350, 0.0
                                       );
                                       float var76 = lllIliIlillIliIl.IlIllllIll(var19, var63, var59.IliIlllilIi(), var75, var70, null, 6.0F);
                                       var65 = iiIiiliIIliili.iliIiiliiiii(var76, ticksSinceLastBlast.IiIlliIliiIl(), var39, var57.liiiIIllIl());
                                       var66 = iiIiiliIIliili.lIiiIiIlilli(var76, ticksSinceLastBlast.IiIlliIliiIl());
                                    } else {
                                       var65 = 0.0F;
                                       var66 = 0.0F;
                                    }
                                 }
                              }

                              if ((!(var66 > 0.0F) || !(var66 >= ticksSinceLastBlast.IIIllIIliIIl() + ticksSinceLastBlast.IlIlllIlilIl() - 1.0F))
                                 && var65 <= threat
                                 && var67 > 0.0) {
                                 liIIiIlliiIIiIll var72 = var28.IliIlllilIi(var57.liiiIIllIl());
                                 float var109 = lllIliIlillIliIl.ilIllIiIll(
                                       t.lIiiIiIlilli(), new class_243(var72.IliIlllilIi(), var72.liiiIIllIl(), var72.iIlIlllllill()).method_1022(var63), 6.0F
                                    )
                                    * (float)var67;
                                 var69 = iiIiiliIIliili.IIIllIIliIIl(var109, t.IlIillIiilIi(), var40, var57.liiiIIllIl()) * t.Illillliilli();
                                 long var126 = var99 ^ ((long)iiIiiliIIliili.IlIlllIlilIl(var69, t.IliIlllilIi()) << 32 ^ var99) & -1L << 32;
                                 var99 = var126
                                    ^ (
                                          (long)(
                                                (int)(var126 >>> 32) == 0
                                                      || !t.IllIllllIl() && t.Iilililiiili() && !((double)((int)(var89 >>> 32)) < var43 - 1.0)
                                                   ? 0
                                                   : 1
                                             )
                                             ^ var126
                                       )
                                       & -1L >>> 32;
                                 double var110 = this.IiIlliIliiIl(
                                    var57.IliIlllilIi(),
                                    var57.liiiIIllIl(),
                                    var67,
                                    var69,
                                    (boolean)((int)(var99 >>> 32)),
                                    (boolean)((int)var99),
                                    var65,
                                    threat,
                                    var28,
                                    (int)(var81 >>> 32),
                                    (int)(var83 >>> 32),
                                    (int)(var85 >>> 32),
                                    var35,
                                    var21,
                                    var23,
                                    var59.IliIlllilIi(),
                                    var57.IIlllIlliIll(),
                                    var38
                                 );
                                 if (Double.isFinite(var110)) {
                                    class_2350 var78 = IIIilIIiiIIi(var57.IliIlllilIi().IliIlllilIi(), var60);
                                    var101 ^= ((long)(var57.IliIlllilIi().lIiiIiIlilli() && var57.liiiIIllIl() > 0 ? 1 : 0) << 32 ^ var101) & -1L << 32;
                                    llIIlllilIIlll var80 = new llIIlllilIIlll(
                                       var57.IliIlllilIi().IliIlllilIi(),
                                       var57.IliIlllilIi().liiiIIllIl(),
                                       var57.liiiIIllIl(),
                                       current + (long)var57.liiiIIllIl(),
                                       var57.iIlIlllllill(),
                                       var110,
                                       (boolean)((int)(var99 >>> 32)),
                                       (boolean)((int)var99),
                                       var65,
                                       var59.IliIlllilIi(),
                                       var78,
                                       (boolean)((int)(var101 >>> 32))
                                    );
                                    var105.add(var80);
                                    var55.add(Boolean.valueOf((boolean)((int)(var97 >>> 32))));
                                 }
                              }
                           }
                        }
                     }

                     if (var105.isEmpty()) {
                        return null;
                     } else {
                        var101 ^= ((long)var55.contains(Boolean.TRUE) ^ var101) & -1L >>> 32;
                        List var106 = iliIiiliiiii(var105, var55);

                        for (long var128 = var103 ^ (0L ^ var103) & -1L << 32; (int)(var128 >>> 32) < var106.size(); var128 += 4294967296L) {
                           if ((int)var101 == 0 || Boolean.TRUE.equals(var55.get((int)(var128 >>> 32)))) {
                              var54.put(((llIIlllilIIlll)var106.get((int)(var128 >>> 32))).IliIlllilIi(), (llIIlllilIIlll)var106.get((int)(var128 >>> 32)));
                           }
                        }

                        var106.sort(Comparator.comparingDouble(llIIlllilIIlll::iliIiiliiiii).reversed());
                        llIIlllilIIlll var107 = (llIIlllilIIlll)var106.get(0);
                        if (target != null && target.IliIlllilIi() != null) {
                           llIIlllilIIlll var58 = (llIIlllilIIlll)var54.get(target.IliIlllilIi());
                           if (var58 != null && !(var107.iliIiiliiiii() > var58.iliIiiliiiii() + 2.0)) {
                              return var58;
                           }
                        }

                        return var107;
                     }
                  }
               }
            }
         }
      } else {
         return null;
      }
   }

   public void liiiIIllIl(Predicate<class_2338> blocked) {
      this.lIlliilIll = blocked == null ? p -> false : blocked;
   }

   private static boolean Ililllililil(IlIlilIillIlilIi standEye, int idx, class_243 c) {
      if (!standEye.lIiiIiIlilli()) {
         for (class_2338 var4 : standEye.liiiIIllIl()) {
            if (c.method_1022(new class_243((double)var4.method_10263() + 0.5, (double)var4.method_10264(), (double)var4.method_10260() + 0.5)) > 4.25) {
               return false;
            }
         }

         if (c.method_1022(IliIlIIllliIlIIl.Iliilliiilii(standEye.IliIlllilIi())) > 4.25 && !Iiilliiliiil(standEye.IliIlllilIi(), c)) {
            return false;
         }
      }

      return lllIliIlillIliIl.IIlilIliiIli(c, lllIliIlillIliIl.IilliliilIIi(standEye.IliIlllilIi())) < 3.0;
   }

   static List<llIIlllilIIlll> iliIiiliiiii(List<llIIlllilIIlll> exact, List<Boolean> steps) {
      long var7 = -2975824027072228145L;
      double var2 = Double.POSITIVE_INFINITY;

      for (var7 ^= (0L ^ var7) & -1L << 32; (int)(var7 >>> 32) < exact.size(); var7 += 4294967296L) {
         if (Boolean.TRUE.equals(steps.get((int)(var7 >>> 32)))) {
            var2 = Math.min(var2, ((llIIlllilIIlll)exact.get((int)(var7 >>> 32))).iliIiiliiiii());
         }
      }

      ArrayList var4 = new ArrayList(exact.size());

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < exact.size(); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         llIIlllilIIlll var6 = (llIIlllilIIlll)exact.get((int)var10);
         if (Double.isFinite(var2) && !Boolean.TRUE.equals(steps.get((int)var10)) && var6.iliIiiliiiii() >= var2) {
            var6 = new llIIlllilIIlll(
               var6.IliIlllilIi(),
               var6.liiiIIllIl(),
               var6.iIlIlllllill(),
               var6.IilliliilIIi(),
               var6.lIiiIiIlilli(),
               var2 - 0.001,
               var6.IIIllIIliIIl(),
               var6.IlIlllIlilIl(),
               var6.IiIlliIliiIl(),
               var6.IIlllIlliIll(),
               var6.Illlllllilll(),
               var6.Iilllilliill()
            );
         }

         var4.add(var6);
      }

      return var4;
   }

   private IIIllillIIllil Iilllilliill(
      IliIlIIllliIlIIl weights,
      IlIlilIillIlilIi threat,
      lliiilIiiliiilIi enemies,
      iliilIlIiiilIl c,
      List<liiilIiliiiilIil> w,
      lilliIiiilliIi self,
      boolean here
   ) {
      long var24 = 3638146134921310947L;
      long var26 = 3762769671514791038L;
      class_243 var8 = new class_243(
         (double)threat.IliIlllilIi().method_10263() + 0.5, (double)threat.iIlIlllllill(), (double)threat.IliIlllilIi().method_10260() + 0.5
      );
      ArrayList var9 = new ArrayList(IilIiilIll.length * 8 + 1);
      class_243 var10 = enemies.liiiIIllIl();
      var9.add(var10);
      double[] var11 = here ? new double[0] : IilIiilIll;
      var24 ^= ((long)var11.length << 32 ^ var24) & -1L << 32;

      for (var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < (int)(var24 >>> 32); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
         double var14 = var11[(int)var24];

         for (var26 ^= (0L ^ var26) & -1L << 32; (int)(var26 >>> 32) < 8; var26 += 4294967296L) {
            double var17 = (Math.PI * 2) * (double)((int)(var26 >>> 32)) / 8.0;
            var9.add(new class_243(var8.field_1352 + Math.cos(var17) * var14, var8.field_1351, var8.field_1350 + Math.sin(var17) * var14));
         }
      }

      class_238 var28 = lllIliIlillIliIl.iIlIlllllill(threat.IliIlllilIi());
      ArrayList var12 = new ArrayList();

      for (long var38 = var24 ^ (0L ^ var24) & -1L >>> 32; (int)var38 < var9.size(); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
         class_243 var29 = (class_243)var9.get((int)var38);
         class_243 var15 = (int)var38 == 0 ? (!enemies.iliIiiliiiii() && !here ? null : var10) : IIillIiliIil(weights, var29, threat.iIlIlllllill());
         if (var15 != null && !(var15.field_1351 > (double)threat.iIlIlllllill() - 1.0 + 1.0E-6)) {
            class_238 var16 = IliIlIIllliIlIIl.Iiilliiliiil(var15.field_1352, var15.field_1351, var15.field_1350, 0.0);
            if (!var16.method_994(var28)) {
               var26 ^= (0L ^ var26) & -1L >>> 32;

               for (class_2338 var19 : threat.liiiIIllIl()) {
                  if (var16.method_994(lllIliIlillIliIl.lIiiIiIlilli(var19))) {
                     var26 ^= (1L ^ var26) & -1L >>> 32;
                     break;
                  }
               }

               if ((int)var26 == 0) {
                  if ((int)var38 > 0) {
                     class_2338 var32 = class_2338.method_49637(var15.field_1352, var15.field_1351 + 0.01, var15.field_1350);
                     if (!iIiIilIliIil.iIlIlllllill(weights.IilliliilIIi(), var32) || !weights.llIIlilIIl(var10, var15, 0)) {
                        continue;
                     }
                  }

                  double var33 = IIiiIIllIiiIIl.IilliliilIIi(var15.field_1351, (double)threat.iIlIlllllill());
                  double var20 = var15.field_1351 <= (double)threat.iIlIlllllill() - 1.6 ? 0.5 : 0.0;
                  double var22 = 3.0 * (1.0 - var33) + var20 - 0.5 * var10.method_1022(var15);
                  var12.add(new IIIllillIIllil(var15, var22));
               }
            }
         }
      }

      if (var12.isEmpty()) {
         return null;
      } else {
         var12.sort(Comparator.comparingDouble(IIIllillIIllil::liiiIIllIl).reversed());
         if (c != null && self != null) {
            IIIllillIIllil var13 = null;
            double var30 = Double.NEGATIVE_INFINITY;

            for (long var39 = var26 ^ (0L ^ var26) & -1L << 32; (int)(var39 >>> 32) < Math.min(3, var12.size()); var39 += 4294967296L) {
               IIIllillIIllil var31 = (IIIllillIIllil)var12.get((int)(var39 >>> 32));
               class_238 var34 = IliIlIIllliIlIIl.Iiilliiliiil(
                  var31.IliIlllilIi().field_1352, var31.IliIlllilIi().field_1351, var31.IliIlllilIi().field_1350, 0.0
               );
               double var35 = var31.liiiIIllIl() - (double)(self.IilliliilIIi() * c.Iilllilliill(var31.IliIlllilIi(), var34, w));
               if (var35 > var30) {
                  var30 = var35;
                  var13 = new IIIllillIIllil(var31.IliIlllilIi(), var35);
               }
            }

            return var13;
         } else {
            return (IIIllillIIllil)var12.get(0);
         }
      }
   }

   private static class_2350 IIIilIIiiIIi(class_2338 eye, class_243 base) {
      double var2 = (double)eye.method_10264() + 1.0;
      if (base.field_1351 > var2 + 0.05) {
         return class_2350.field_11036;
      } else {
         double var4 = base.field_1352 - ((double)eye.method_10263() + 0.5);
         double var6 = base.field_1350 - ((double)eye.method_10260() + 0.5);
         if (Math.abs(var4) >= Math.abs(var6)) {
            return var4 >= 0.0 ? class_2350.field_11034 : class_2350.field_11039;
         } else {
            return var6 >= 0.0 ? class_2350.field_11035 : class_2350.field_11043;
         }
      }
   }

   private static double IIlllIlliIll(iIlIiiIiIllIiiIi path, int es, int rExpl, int i, class_243 centre, liIIiIlliiIIiIll cycle, int top, double s, double rT) {
      long var18 = 7611052198262426976L;
      if (rExpl <= i) {
         return path.IliIlllilIi(es + rExpl).liiiIIllIl() - (double)top;
      } else {
         var18 ^= ((long)IIiiIIllIiiIIl.IliIlllilIi(cycle.liiiIIllIl(), (double)top) << 32 ^ var18) & -1L << 32;
         double var12 = (double)((int)(var18 >>> 32)) / (double)IIiiIIllIiiIIl.IIIIiiiIllIIIiiiIl.length;
         double[] var14 = llllIiililllIiil.IlIlllIlilIl(
            cycle.IliIlllilIi(), cycle.liiiIIllIl(), cycle.iIlIlllllill(), 1.62, centre.field_1352, centre.field_1351, centre.field_1350, 6.0, var12, s
         );
         liIIiIlliiIIiIll var15 = path.IliIlllilIi(es + i);
         double var16 = var15.lIiiIiIlilli() + var14[1] * rT;
         return var15.liiiIIllIl() + IlIIiillllIIiill.iIlIlllllill(var16, rExpl - i) - (double)top;
      }
   }

   private boolean IlIillIiilIi(class_2338 base) {
      long var8 = 2070632076164218972L;
      if (this.IIlliilIll.isEmpty()) {
         return false;
      } else {
         class_238 var2 = lllIliIlillIliIl.IilliliilIIi(base).method_1014(0.3);

         for (List var4 : this.IIlliilIll) {
            if (var4 != null) {
               for (var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) + 1 < var4.size(); var8 += 4294967296L) {
                  class_243 var6 = (class_243)var4.get((int)(var8 >>> 32));
                  class_243 var7 = (class_243)var4.get((int)(var8 >>> 32) + 1);
                  if (var2.method_1006(var6) || var2.method_1006(var7) || var2.method_992(var6, var7).isPresent()) {
                     return true;
                  }
               }

               if (var4.size() == 1 && var2.method_1006((class_243)var4.get(0))) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean Illillliilli(class_2338 base) {
      lIIiIiiIIiIi var1 = llilIllililIll.iliIiiliiiii(iiIIiiIlIIlIiiIl.class) instanceof iiIIiiIlIIlIiiIl var2 ? var2.lIilliIill() : null;
      return var1 != null && var1.IiIlliIliiIl(base.method_10063(), IIIiillllIIiilll.IliIlllilIi());
   }

   private static boolean Illlllllilll(IlIlilIillIlilIi vyKick, liIIiIlliiIIiIll es, double cycle, double[] sk, double c, int kb) {
      long var25 = 6835673916800225785L;
      double var8 = es.IilliliilIIi() + sk[0] * c;
      double var10 = es.iliIiiliiiii() + sk[2] * c;
      double var12 = (double)vyKick.IliIlllilIi().method_10263() + 0.5;
      double var14 = (double)vyKick.IliIlllilIi().method_10260() + 0.5;

      for (long var27 = var25 ^ ((long)kb << 32 ^ var25) & -1L << 32; (int)(var27 >>> 32) <= 2 * kb; var27 += 4294967296L) {
         double var17 = (1.0 - Math.pow(0.91, (double)((int)(var27 >>> 32)))) / 0.08999999999999997;
         double var19 = es.IliIlllilIi() + var8 * var17;
         double var21 = es.iIlIlllllill() + var10 * var17;
         double var23 = es.liiiIIllIl() + IlIIiillllIIiill.iIlIlllllill(cycle, (int)(var27 >>> 32));
         if (IliIlIIllliIlIIl.iIIIlIlIIl(var19, var21, var12, var14) <= 2.0 && var23 - (double)vyKick.iIlIlllllill() >= 1.0) {
            return true;
         }
      }

      return false;
   }

   private double IiIlliIliiIl(
      IlIlilIillIlilIi path,
      int rT,
      double expo,
      float selfBudget,
      boolean seed,
      boolean c,
      float pops,
      float selfCost,
      iIlIiiIiIllIiiIi kills,
      int idx,
      int landIdx,
      int jw,
      double dmg,
      illIlIiIilIlIi cycle,
      IiIIIlliIIIl cal,
      class_243 stand,
      double margin,
      IIliiiIilIliiiIi floorY
   ) {
      long var48 = -894335919999621089L;
      long var50 = -8478340780581945100L;
      long var46 = -5623133743000081171L;
      class_243 var22 = lllIliIlillIliIl.liiiIIllIl(path.IliIlllilIi());
      liIIiIlliiIIiIll var23 = kills.IliIlllilIi(rT);
      double[] var24 = llllIiililllIiil.IlIlllIlilIl(
         var23.IliIlllilIi(),
         var23.liiiIIllIl(),
         var23.iIlIlllllill(),
         1.62,
         var22.field_1352,
         var22.field_1351,
         var22.field_1350,
         6.0,
         expo,
         cycle.lIiiIiIlilli()
      );
      double var25 = cal.IiIlliIliiIl();
      var46 ^= ((long)(rT + landIdx) << 32 ^ var46) & -1L << 32;
      liIIiIlliiIIiIll var28 = kills.IliIlllilIi((int)(var46 >>> 32));
      double var29 = var28.lIiiIiIlilli() + var24[1] * var25;
      var46 ^= ((long)(idx < kills.liiiIIllIl() ? idx : (int)(var46 >>> 32)) ^ var46) & -1L >>> 32;
      var48 ^= ((long)IliIlIIllliIlIIl.Iilililiiili(var28.liiiIIllIl(), var29, dmg, 60) << 32 ^ var48) & -1L << 32;
      var48 ^= ((long)((int)(var46 >>> 32) + (int)(var48 >>> 32) - Math.max((int)(var46 >>> 32), (int)var46)) ^ var48) & -1L >>> 32;
      double var34 = IliIlIIllliIlIIl.IIiilIiiiIii(var28.liiiIIllIl(), var29, dmg);
      class_243 var36 = new class_243(var23.IliIlllilIi(), var23.liiiIIllIl(), var23.iIlIlllllill());
      class_243 var37 = iIliIlilIlliIlil.iIiIlIliIl(stand.method_1020(var36));
      class_243 var38 = iIliIlilIlliIlil.iIiIlIliIl(new class_243(var24[0], 0.0, var24[2]));
      double var39 = Math.hypot(var24[0], var24[2]) > 0.1 ? var38.field_1352 * var37.field_1352 + var38.field_1350 * var37.field_1350 : 0.0;
      double var41 = Math.max(0.05, var23.IlIlllIlilIl());
      double var43 = Double.isInfinite(margin) ? 0.0 : IliIlIIllliIlIIl.IiIiliIiiiIi(-margin / var41);
      var50 ^= ((long)Illlllllilll(path, var28, var29, var24, var25, jw) << 32 ^ var50) & -1L << 32;
      return liIlllliiIllll.IliIlllilIi(
         new iIilIiiIlilIii(
            (double)selfBudget,
            seed,
            c,
            (int)var48,
            var34,
            var39,
            (double)pops,
            (double)selfCost,
            rT,
            path.lIiiIiIlilli() ? 0 : path.liiiIIllIl().size(),
            var43,
            (boolean)((int)(var50 >>> 32))
         ),
         floorY
      );
   }

   public void iIlIlllllill(int ticks) {
      this.iIlliilIll = Math.max(0, ticks);
   }

   public IlIiilIlllIiilIl(IilIllililIlli budget) {
      this.iiIliilIll = budget;
   }

   public void IliIlllilIi(List<List<class_243>> pearlTails) {
      this.IIlliilIll = pearlTails == null ? List.of() : pearlTails;
   }
}
