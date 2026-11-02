package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_746;

public final class iIiilillIliilill {
   public static final double lIliIliill = 0.2;
   public static final double ilIIlliill = 4.0;
   public static final double IIliIliill = 1.5;
   public static final double lliiIliill = 0.3;
   public static final double liiiIliill = 0.001;
   public static final double IliiIliill = 0.35;
   public static final double iliiIliill = 0.12;
   public static final int lIIIlliill = 2;
   public static final int iIliIliill = 3;
   public static final double[] ilIiIliill = new double[]{1.0, 1.4, 1.8, 2.2};
   public static final int iIIIlliill = 60;
   private final IilIllililIlli iiIIlliill;
   public static final double llIIlliill = 1.6;
   public static final double lIiiIliill = 0.15;
   public static final double IIiiIliill = 0.1;
   public static final int IiiiIliill = 3;
   public static final double IiIIlliill = 1.2;
   public static final int liIiIliill = 2;
   public static final int IlliIliill = 4;
   public static final int IiIiIliill = 30;
   public static final double IiliIliill = 1.5;
   public static final int iiiiIliill = 90;
   public static final double IlIIlliill = 0.05;
   public static final int IIIIlliill = 4;
   public static final double illiIliill = -0.1;
   public static final int iiIiIliill = 9;
   public static final double iIiiIliill = 0.1;
   public static final double llliIliill = 0.9;
   public static final double liliIliill = -0.2;
   public static final double iiliIliill = 0.05;
   private static final IiIIIlliIIIl liIIlliill = new IiIIIlliIIIl();

   private lIlIlIlliIlIlIll iIlIlllllill(
      long chest,
      IliIlIIllliIlIIl t,
      iIliIlilIlliIlil launchYaw,
      IiIIIlliIIIl cal,
      lliiilIiiliiilIi strikeEye,
      liiilIiliiiilIil hit,
      IiiiIilliiiIil selfWindow,
      IIIliIlllIIliIll weapon,
      iIlIiiIiIllIiiIi self,
      int w,
      Iiillliliillli spacing,
      class_243 tick,
      class_243 charge,
      float player,
      class_243 spawnSeen,
      class_243 lineUpEye,
      class_243 landIdx,
      class_243 lo,
      class_238 reattack,
      class_238 targetNow,
      class_243 u,
      class_746 towardUs,
      iliIIiIiiIIi prior,
      int selfBudget,
      boolean floorY,
      int seed,
      float meleeRaw,
      double lineUpFeet,
      int sprint,
      int melee,
      int path,
      double jw,
      IIliiiIilIliiiIi strikeFeet,
      double b,
      IilIlIIllilIlIIl ourBox,
      float rT,
      illIlIiIilIlIi target
   ) {
      long var56 = -1537297062792902507L;
      long var58 = -3548187686325787995L;
      class_2338 var42 = selfWindow.IliIlllilIi();
      class_238 var43 = lllIliIlillIliIl.iIlIlllllill(var42);
      if (!selfWindow.lIiiIiIlilli()) {
         if (reattack.method_994(var43) || targetNow != null && targetNow.method_994(var43)) {
            return null;
         }

         if (!selfWindow.iIlIlllllill()) {
            class_238 var44 = lllIliIlillIliIl.lIiiIiIlilli(var42);
            if (reattack.method_994(var44) || targetNow != null && targetNow.method_994(var44)) {
               return null;
            }

            if (spawnSeen.method_1022(new class_243((double)var42.method_10263() + 0.5, (double)var42.method_10264(), (double)var42.method_10260() + 0.5))
               > 4.25) {
               return null;
            }
         }

         if (spawnSeen.method_1022(IliIlIIllliIlIIl.Iliilliiilii(var42)) > 4.25) {
            return null;
         }
      }

      class_243 var60 = lllIliIlillIliIl.liiiIIllIl(var42);
      class_238 var45 = lllIliIlillIliIl.IilliliilIIi(var42);
      lIlIlIlliIlIlIll var46 = null;

      for (long var62 = var56 ^ (8589934592L ^ var56) & -1L << 32; (int)(var62 >>> 32) <= 9 && (int)(var62 >>> 32) < w; var62 += 4294967296L) {
         liIIiIlliiIIiIll var48 = self.IliIlllilIi((int)(var62 >>> 32));
         if (Ililllililil(var48.liiiIIllIl(), selfWindow) && Illillliilli(IlIillIiilIi(spawnSeen, tick, (int)(var62 >>> 32)), var45)) {
            var62 ^= ((long)IIiiIIllIiiIIl.IliIlllilIi(var48.liiiIIllIl(), (double)selfWindow.liiiIIllIl()) ^ var62) & -1L >>> 32;
            double var50 = (double)((int)var62) / (double)IIiiIIllIiiIIl.IIIIiiiIllIIIiiiIl.length;
            var58 ^= (-4294967296L ^ var58) & -1L << 32;
            if (!selfWindow.lIiiIiIlilli()) {
               ArrayList var53 = new ArrayList(2);
               class_243 var54 = towardUs.method_33571();
               if (!selfWindow.iIlIlllllill()) {
                  var53.add(
                     new illiiIlIiliiIl(
                        iilIIIIiIIiIIIIi.IIliiiIiil,
                        2,
                        IliIlIIllliIlIIl.Illillliilli(
                           towardUs.method_36454(),
                           towardUs.method_36455(),
                           var54,
                           new class_243((double)var42.method_10263() + 0.5, (double)var42.method_10264(), (double)var42.method_10260() + 0.5)
                        ),
                        false
                     )
                  );
               }

               var53.add(
                  new illiiIlIiliiIl(
                     iilIIIIiIIiIIIIi.lIliiiIiil,
                     1,
                     selfWindow.iIlIlllllill()
                        ? IliIlIIllliIlIIl.Illillliilli(towardUs.method_36454(), towardUs.method_36455(), var54, IliIlIIllliIlIIl.Iliilliiilii(var42))
                        : 10.0,
                     false
                  )
               );
               int[] var55 = IlIiIiillIiIii.IilliliilIIi(new illIIlIilIIl(prior.iliIiiliiiii(), 100, 100, 2, melee, path, true), var53);
               var58 ^= ((long)var55[var55.length - 1] << 32 ^ var58) & -1L << 32;
            }

            var58 ^= ((long)((int)(var58 >>> 32) + 1 + seed + (floorY ? 3 : 0)) ^ var58) & -1L >>> 32;
            lIlIlIlliIlIlIll var61 = this.IIIllIIliIIl(
               lIllilliIllill.IllllIlIilllllIlIi,
               weapon,
               selfWindow,
               var48,
               var60,
               var50,
               (int)(var62 >>> 32),
               sprint,
               self,
               w,
               spacing,
               launchYaw,
               t,
               cal,
               strikeEye,
               hit,
               charge,
               lineUpEye,
               meleeRaw,
               jw,
               strikeFeet,
               b,
               ourBox,
               rT,
               target,
               (int)var58,
               selfWindow.iIlIlllllill() ? 0 : 1,
               IIIilIIiiIIi(reattack, var43, var48, (int)var58),
               player,
               lo,
               lineUpFeet,
               selfBudget,
               floorY,
               null
            );
            if (var61 != null && (var46 == null || var61.IliIlllilIi().iIlIlllllill() > var46.IliIlllilIi().iIlIlllllill())) {
               var46 = var61;
            }
         }
      }

      return var46;
   }

   static class_1799 IIIIllIIIl(class_746 slot, int player) {
      return slot != null && player >= 0 && player <= 8 ? slot.method_31548().method_5438(player) : class_1799.field_8037;
   }

   static double Iilllilliill(double bound, double ratio) {
      return bound > 0.0 && ratio > 0.0 ? Math.min(bound, bound * Math.min(1.0, ratio)) : 0.0;
   }

   private static boolean Ililllililil(double feetY, IiiiIilliiiIil b) {
      long var4 = -7263024765342770836L;
      var4 ^= ((long)IIiiIIllIiiIIl.IliIlllilIi(feetY, (double)b.liiiIIllIl()) << 32 ^ var4) & -1L << 32;
      return b.IilliliilIIi() ? (int)(var4 >>> 32) >= 4 : feetY >= (double)b.liiiIIllIl() + 0.2 && (int)(var4 >>> 32) >= 3;
   }

   private lIlIlIlliIlIlIll lIiiIiIlilli(
      IliIlIIllliIlIIl target,
      iIliIlilIlliIlil b,
      IiIIIlliIIIl towardUs,
      lliiilIiiliiilIi jw,
      liiilIiliiiilIil launchYaw,
      IiiiIilliiiIil strikeFeet,
      iIlIiiIiIllIiiIi strikeEye,
      int selfBudget,
      Iiillliliillli selfWindow,
      class_243 w,
      class_243 lo,
      float floorY,
      class_243 self,
      class_243 spawnSeen,
      class_243 weapon,
      class_243 spacing,
      iliIIiIiiIIi rT,
      int t,
      int reattack,
      float cal,
      double melee,
      int charge,
      int chest,
      int seed,
      double path,
      IIliiiIilIliiiIi prior,
      double lineUpFeet,
      IilIlIIllilIlIIl landIdx,
      float meleeRaw,
      illIlIiIilIlIi u
   ) {
      long var50 = -1351563327841444798L;
      long var52 = -7613759826156150068L;
      class_2338 var34 = strikeFeet.IliIlllilIi();
      class_243 var35 = IliIlIIllliIlIIl.Iliilliiilii(var34);
      class_243 var36 = lllIliIlillIliIl.liiiIIllIl(var34);
      ArrayList var37 = new ArrayList(3);
      var37.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.IlliiiIiil, 1, 0.0, false));
      var37.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.lIliiiIiil, 1, IliIlIIllliIlIIl.IIlilIliiIli(self, spacing, var35), false));
      var37.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.iIliiiIiil, 3, IliIlIIllliIlIIl.IIlilIliiIli(self, var35, var36.method_1031(0.0, 1.0, 0.0)), false));
      int[] var38 = IlIiIiillIiIii.IilliliilIIi(new illIIlIilIIl(1, 100, 100, 2, chest, seed, true), var37);
      var50 ^= ((long)var38[2] << 32 ^ var50) & -1L << 32;
      if ((int)(var50 >>> 32) > selfBudget - 1) {
         return null;
      } else {
         liIIiIlliiIIiIll var40 = strikeEye.IliIlllilIi((int)(var50 >>> 32));
         if (!Ililllililil(var40.liiiIIllIl(), strikeFeet)) {
            return null;
         } else {
            var50 ^= ((long)var38[1] ^ var50) & -1L >>> 32;
            liIIiIlliiIIiIll var42 = strikeEye.IliIlllilIi((int)var50);
            double var43 = IliIlIIllliIlIIl.IlIillIiilIi(IliIlIIllliIlIIl.IIIilIIiiIIi(var42, 0.0), lllIliIlillIliIl.iIlIlllllill(var34));
            if (var43 <= 0.0) {
               return null;
            } else if (IlIillIiilIi(self, w, (int)var50).method_1022(var35) > 4.25) {
               return null;
            } else if (!Illillliilli(IlIillIiilIi(self, w, (int)(var50 >>> 32)), lllIliIlillIliIl.IilliliilIIi(var34))) {
               return null;
            } else {
               double var45 = (double)IIiiIIllIiiIIl.IliIlllilIi(var40.liiiIIllIl(), (double)strikeFeet.liiiIIllIl())
                  / (double)IIiiIIllIiiIIl.IIIIiiiIllIIIiiiIl.length;
               var52 ^= ((long)(reattack + 3) << 32 ^ var52) & -1L << 32;
               double var48 = IliIlIIllliIlIIl.IiIiliIiiiIi(-var43 / Math.max(0.05, var42.IlIlllIlilIl()));
               return this.IIIllIIliIIl(
                  lIllilliIllill.lilllIlIiiilllIlIi,
                  IIIliIlllIIliIll.IIIiililll,
                  strikeFeet,
                  var40,
                  var36,
                  var45,
                  (int)(var50 >>> 32),
                  charge,
                  strikeEye,
                  selfBudget,
                  selfWindow,
                  b,
                  target,
                  towardUs,
                  jw,
                  launchYaw,
                  lo,
                  spawnSeen,
                  cal,
                  path,
                  prior,
                  lineUpFeet,
                  landIdx,
                  meleeRaw,
                  u,
                  (int)(var52 >>> 32),
                  0,
                  var48,
                  floorY,
                  weapon,
                  melee,
                  t,
                  true,
                  null
               );
            }
         }
      }
   }

   private static double IlIlllIlilIl(
      lIiIiIIiiIiIiIIi expo, double target, float p, float floorY, liiilIiliiiilIil cal, IiIIIlliIIIl jw, IIliiiIilIliiiIi selfCost, double selfBudget
   ) {
      long var32 = -2058609179036395956L;
      long var34 = 4702067095570731461L;
      double var10 = jw.IiIlliIliiIl();
      double var12 = expo.iIlIlllllill()[0] * target;
      double var14 = expo.iIlIlllllill()[1] * target;
      double var16 = expo.iIlIlllllill()[2] * target;
      double var18 = expo.lIiiIiIlilli() + var14 * var10;
      var32 ^= ((long)IliIlIIllliIlIIl.Iilililiiili(expo.IilliliilIIi(), var18, selfBudget, 60) << 32 ^ var32) & -1L << 32;
      var32 ^= ((long)(expo.iliIiiliiiii() + (int)(var32 >>> 32) - Math.max(expo.iliIiiliiiii(), expo.IIIllIIliIIl())) ^ var32) & -1L >>> 32;
      double var22 = IliIlIIllliIlIIl.IIiilIiiiIii(expo.IilliliilIIi(), var18, selfBudget);
      float var24 = lllIliIlillIliIl.ilIllIiIll(cal.lIiiIiIlilli(), expo.IliIlllilIi().method_1022(expo.liiiIIllIl()), 6.0F) * (float)target;
      float var25 = expo.IiIlliIliiIl() != null
         ? iiIiiliIIliili.IIIllIIliIIl(var24, cal.IlIillIiilIi(), expo.IiIlliIliiIl(), expo.Ililllililil())
         : iiIiiliIIliili.lIiiIiIlilli(Math.max(0.0F, var24 - expo.IlIlllIlilIl()), cal.IlIillIiilIi());
      var34 ^= ((long)iiIiiliIIliili.IlIlllIlilIl(var25, cal.IliIlllilIi()) << 32 ^ var34) & -1L << 32;
      var34 ^= ((long)((int)(var34 >>> 32) == 0 || !cal.IllIllllIl() && cal.Iilililiiili() ? 0 : 1) ^ var34) & -1L >>> 32;
      class_243 var28 = iIliIlilIlliIlil.iIiIlIliIl(expo.Iiilliiliiil().method_1020(expo.IliIlllilIi()));
      class_243 var29 = iIliIlilIlliIlil.iIiIlIliIl(new class_243(var12, 0.0, var16));
      double var30 = Math.hypot(var12, var16) > 0.1 ? var29.field_1352 * var28.field_1352 + var29.field_1350 * var28.field_1350 : 0.0;
      return liIlllliiIllll.IliIlllilIi(
         new iIilIiiIlilIii(
            (double)var25,
            (boolean)((int)(var34 >>> 32)),
            (boolean)((int)var34),
            (int)var32,
            var22,
            var30,
            (double)p,
            (double)floorY,
            expo.IIillIiliIil(),
            expo.Iilllilliill(),
            expo.IIlllIlliIll(),
            expo.Illlllllilll()
         ),
         selfCost
      );
   }

   private static boolean Iilililiiili(IliIlIIllliIlIIl w, class_243 feet) {
      class_2338 var2 = class_2338.method_49637(feet.field_1352, feet.field_1351 + 0.01, feet.field_1350);
      return !w.lIiiIiIlilli(var2) && !w.lIiiIiIlilli(var2.method_10084()) && w.lIiiIiIlilli(var2.method_10074());
   }

   private static boolean Illillliilli(class_243 eye, class_238 crystalBox) {
      return lllIliIlillIliIl.IIlilIliiIli(eye, crystalBox) < 2.9;
   }

   static int Iiiiliiiiiii(class_1799 st) {
      if (st == null || st.method_7960()) {
         return 3;
      } else if (lIlllIliIlllIl.iIlIlllllill(st)) {
         return 0;
      } else if (st.method_31574(class_1802.field_8301)) {
         return 1;
      } else {
         return st.method_31574(class_1802.field_8281) ? 2 : 3;
      }
   }

   private List<lIlIlIlliIlIlIll> iliIiiliiiii(
      IliIlIIllliIlIIl rT,
      iIliIlilIlliIlil jw,
      IiIIIlliIIIl spawnSeen,
      lliiilIiiliiilIi floorY,
      liiilIiliiiilIil towardUs,
      class_746 self,
      iliIIiIiiIIi selfWindow,
      class_243 seed,
      int selfBudget,
      class_243 ourBox,
      int target,
      int feet,
      int reattack,
      double veto,
      IIliiiIilIliiiIi prior,
      double w,
      IilIlIIllilIlIIl targetWindow,
      IilIlIIllilIlIIl player,
      float feetLevel,
      illIlIiIilIlIi lo,
      Predicate<class_243> cal,
      class_238 t
   ) {
      long var54 = -459600500000352818L;
      long var56 = 4329601081768418609L;
      long var58 = 3870224245934238166L;
      long var60 = -1048345573055231191L;
      long var62 = 3735887903292237945L;
      ArrayList var25 = new ArrayList();
      iIlIiiIiIllIiiIi var26 = jw.IIlllIlliIll(30, rT, spawnSeen, ourBox, null);
      if (var26 == null) {
         return var25;
      } else {
         class_243 var27 = floorY.iIlIlllllill() != null ? floorY.iIlIlllllill() : self.method_33571();
         class_243 var28 = floorY.liiiIIllIl();
         var54 ^= ((long)((int)Math.ceil(1.5)) << 32 ^ var54) & -1L << 32;
         var54 ^= ((long)((int)Math.floor(seed.field_1352)) ^ var54) & -1L >>> 32;
         var56 ^= ((long)((int)Math.floor(seed.field_1350)) << 32 ^ var56) & -1L << 32;

         for (long var68 = var56 ^ ((long)(-((int)(var54 >>> 32)) - 1) ^ var56) & -1L >>> 32;
            (int)var68 <= (int)(var54 >>> 32) + 1;
            var68 ^= (var68 ^ var68 + (long)1) & -1L >>> 32
         ) {
            var58 ^= ((long)(-((int)(var54 >>> 32)) - 1) << 32 ^ var58) & -1L << 32;

            while ((int)(var58 >>> 32) <= (int)(var54 >>> 32) + 1) {
               for (var58 ^= ((long)(selfBudget - 1) ^ var58) & -1L >>> 32; (int)var58 <= selfBudget; var58 ^= (var58 ^ var58 + (long)1) & -1L >>> 32) {
                  class_2338 var35 = new class_2338((int)var54 + (int)var68, (int)var58, (int)(var68 >>> 32) + (int)(var58 >>> 32));
                  double var36 = (double)var35.method_10264() + 1.0;
                  if (!(var36 < seed.field_1351 + -0.2)
                     && !(var36 > seed.field_1351 + 0.05)
                     && !(
                        IliIlIIllliIlIIl.iIIIlIlIIl((double)var35.method_10263() + 0.5, (double)var35.method_10260() + 0.5, seed.field_1352, seed.field_1350)
                           > 1.5
                     )
                     && rT.IIIllIIliIIl(var35)) {
                     var60 ^= ((long)(rT.Illlllllilll(var35) != null ? 1 : 0) << 32 ^ var60) & -1L << 32;
                     if (((int)(var60 >>> 32) != 0 || rT.iliIiiliiiii(var35.method_10084()))
                        && ((int)(var60 >>> 32) != 0 || !rT.IIillIiliIil(var35, towardUs.lIiiIiIlilli(), self))) {
                        class_243 var39 = lllIliIlillIliIl.liiiIIllIl(var35);
                        if (!cal.test(var39)) {
                           class_238 var40 = lllIliIlillIliIl.iIlIlllllill(var35);
                           if (((int)(var60 >>> 32) != 0 || t == null || !t.method_994(var40))
                              && ((int)(var60 >>> 32) != 0 || !(var27.method_1022(IliIlIIllliIlIIl.Iliilliiilii(var35)) > 4.25))
                              && lllIliIlillIliIl.IIlilIliiIli(var27, lllIliIlillIliIl.IilliliilIIi(var35)) < 3.0) {
                              ArrayList var41 = new ArrayList(2);
                              if ((int)(var60 >>> 32) == 0) {
                                 var41.add(
                                    new illiiIlIiliiIl(
                                       iilIIIIiIIiIIIIi.lIliiiIiil,
                                       1,
                                       IliIlIIllliIlIIl.Illillliilli(self.method_36454(), self.method_36455(), var27, IliIlIIllliIlIIl.Iliilliiilii(var35)),
                                       false
                                    )
                                 );
                              }

                              var41.add(
                                 new illiiIlIiliiIl(
                                    iilIIIIiIIiIIIIi.iIliiiIiil,
                                    3,
                                    (int)(var60 >>> 32) != 0
                                       ? IliIlIIllliIlIIl.Illillliilli(self.method_36454(), self.method_36455(), var27, var39.method_1031(0.0, 1.0, 0.0))
                                       : 4.0,
                                    false
                                 )
                              );
                              int[] var42 = IlIiIiillIiIii.IilliliilIIi(new illIIlIilIIl(selfWindow.iliIiiliiiii(), 100, 100, 2, feet, reattack, true), var41);
                              var60 ^= ((long)var42[var42.length - 1] ^ var60) & -1L >>> 32;
                              double var44 = Double.POSITIVE_INFINITY;
                              if ((int)(var60 >>> 32) == 0) {
                                 liIIiIlliiIIiIll var46 = var26.IliIlllilIi(var42[0]);
                                 double var47 = IliIlIIllliIlIIl.IlIillIiilIi(IliIlIIllliIlIIl.IIIilIIiiIIi(var46, 0.0), var40);
                                 if (var47 <= 0.0) {
                                    continue;
                                 }

                                 var44 = var47;
                              }

                              liIIiIlliiIIiIll var64 = var26.IliIlllilIi((int)var60);
                              var62 ^= ((long)IIiiIIllIiiIIl.IliIlllilIi(var64.liiiIIllIl(), var36) << 32 ^ var62) & -1L << 32;
                              if ((int)(var62 >>> 32) >= 3) {
                                 double var48 = (double)((int)(var62 >>> 32)) / (double)IIiiIIllIiiIIl.IIIIiiiIllIIIiiiIl.length;
                                 IiiiIilliiiIil var50 = new IiiiIilliiiIil(var35, (int)var36, true, false, (boolean)((int)(var60 >>> 32)));
                                 double var51 = Double.isInfinite(var44) ? 0.0 : IliIlIIllliIlIIl.IiIiliIiiiIi(-var44 / Math.max(0.05, var64.IlIlllIlilIl()));
                                 lIlIlIlliIlIlIll var53 = this.IIIllIIliIIl(
                                    lIllilliIllill.IIillIlIilIillIlIi,
                                    IIIliIlllIIliIll.lIIiililll,
                                    var50,
                                    var64,
                                    var39,
                                    var48,
                                    (int)var60,
                                    target,
                                    var26,
                                    var26.iIlIlllllill(),
                                    null,
                                    jw,
                                    rT,
                                    spawnSeen,
                                    floorY,
                                    towardUs,
                                    ourBox,
                                    var28,
                                    0.0F,
                                    veto,
                                    prior,
                                    w,
                                    targetWindow,
                                    feetLevel,
                                    lo,
                                    (int)var60,
                                    0,
                                    var51,
                                    IlliiIIlllliiIIl.iIlIlllllill(seed.field_1352 - var28.field_1352, seed.field_1350 - var28.field_1350),
                                    var28,
                                    IliIlIIllliIlIIl.IIIIllIIIl(var28, seed),
                                    selfWindow.IilliliilIIi(),
                                    false,
                                    player
                                 );
                                 if (var53 != null) {
                                    var25.add(var53);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var58 += 4294967296L;
            }
         }

         return var25;
      }
   }

   private static class_243 IlIillIiilIi(class_243 u, class_243 ticks, int strikeEye) {
      return u.method_1019(ticks.method_1021(IIlilIliiIli(strikeEye)));
   }

   private lIlIlIlliIlIlIll IilliliilIIi(
      IliIlIIllliIlIIl reattack,
      iIliIlilIlliIlil path,
      IiIIIlliIIIl self,
      lliiilIiiliiilIi strikeEye,
      liiilIiliiiilIil u,
      IiiiIilliiiIil chest,
      IIIliIlllIIliIll meleeRaw,
      iIlIiiIiIllIiiIi sprint,
      int melee,
      Iiillliliillli spawnSeen,
      class_243 lineUpFeet,
      class_243 cal,
      float seed,
      class_243 b,
      class_243 jw,
      class_243 spacing,
      class_243 floorY,
      iliIIiIiiIIi rT,
      int landIdx,
      boolean lo,
      int hit,
      float selfBudget,
      double charge,
      int target,
      int strikeFeet,
      int t,
      double prior,
      IIliiiIilIliiiIi launchYaw,
      double selfWindow,
      IilIlIIllilIlIIl towardUs,
      float w,
      illIlIiIilIlIi weapon
   ) {
      long var64 = -5752899253249949553L;
      long var60 = 2161767235966839806L;
      long var62 = 2823736418891482994L;
      class_2338 var36 = chest.IliIlllilIi();
      var60 ^= ((long)(!chest.iIlIlllllill() ? 1 : 0) << 32 ^ var60) & -1L << 32;
      if ((int)(var60 >>> 32) != 0 && rT.lIiiIiIlilli() < 0) {
         return null;
      } else {
         class_243 var38 = new class_243((double)var36.method_10263() + 0.5, (double)var36.method_10264(), (double)var36.method_10260() + 0.5);
         class_243 var39 = IliIlIIllliIlIIl.Iliilliiilii(var36);
         class_243 var40 = lllIliIlillIliIl.liiiIIllIl(var36);
         ArrayList var41 = new ArrayList(4);
         var41.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.IlliiiIiil, 0, 0.0, false));
         if ((int)(var60 >>> 32) != 0) {
            var41.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.IIliiiIiil, 2, IliIlIIllliIlIIl.IIlilIliiIli(b, floorY, var38), false));
         }

         var41.add(
            new illiiIlIiliiIl(
               iilIIIIiIIiIIIIi.lIliiiIiil,
               1,
               (int)(var60 >>> 32) != 0 ? IliIlIIllliIlIIl.IIlilIliiIli(b, var38, var39) : IliIlIIllliIlIIl.IIlilIliiIli(b, floorY, var39),
               false
            )
         );
         var41.add(new illiiIlIiliiIl(iilIIIIiIIiIIIIi.iIliiiIiil, 3, IliIlIIllliIlIIl.IIlilIliiIli(b, var39, var40.method_1031(0.0, 1.0, 0.0)), false));
         int[] var42 = IlIiIiillIiIii.IilliliilIIi(new illIIlIilIIl(0, 100, 100, 2, strikeFeet, t, true), var41);
         var60 ^= ((long)var42[var42.length - 1] ^ var60) & -1L >>> 32;
         if ((int)var60 > melee - 1) {
            return null;
         } else {
            liIIiIlliiIIiIll var44 = sprint.IliIlllilIi((int)var60);
            double var45 = chest.IilliliilIIi() ? -0.1 : 0.9;
            if (var44.liiiIIllIl() < (double)chest.liiiIIllIl() + var45) {
               return null;
            } else {
               double var47 = Double.POSITIVE_INFINITY;
               var62 ^= (4294967296L ^ var62) & -1L << 32;
               if ((int)(var60 >>> 32) != 0) {
                  int var10001 = (int)(var62 >>> 32);
                  long var72 = var62 + 4294967296L;
                  var62 = var72 ^ ((long)var42[var10001] ^ var72) & -1L >>> 32;
                  liIIiIlliiIIiIll var51 = sprint.IliIlllilIi((int)var62);
                  class_238 var52 = IliIlIIllliIlIIl.IIIilIIiiIIi(var51, 0.0);
                  class_238 var53 = lllIliIlillIliIl.lIiiIiIlilli(var36);
                  double var54 = IliIlIIllliIlIIl.IlIillIiilIi(var52, var53);
                  if (var54 <= 0.0) {
                     return null;
                  }

                  var47 = Math.min(var47, var54);
                  if (IlIillIiilIi(b, lineUpFeet, (int)var62).method_1022(var38) > 4.25) {
                     return null;
                  }
               }

               var62 ^= ((long)var42[(int)(var62 >>> 32)] ^ var62) & -1L >>> 32;
               liIIiIlliiIIiIll var67 = sprint.IliIlllilIi((int)var62);
               double var68 = IliIlIIllliIlIIl.IlIillIiilIi(IliIlIIllliIlIIl.IIIilIIiiIIi(var67, 0.0), lllIliIlillIliIl.iIlIlllllill(var36));
               if (var68 <= 0.0) {
                  return null;
               } else {
                  var47 = Math.min(var47, var68);
                  if (IlIillIiilIi(b, lineUpFeet, (int)var62).method_1022(var39) > 4.25) {
                     return null;
                  } else if (!Illillliilli(IlIillIiilIi(b, lineUpFeet, (int)var60), lllIliIlillIliIl.IilliliilIIi(var36))) {
                     return null;
                  } else {
                     var64 ^= ((long)IIiiIIllIiiIIl.IliIlllilIi(var44.liiiIIllIl(), (double)chest.liiiIIllIl()) << 32 ^ var64) & -1L << 32;
                     if ((int)(var64 >>> 32) < (chest.IilliliilIIi() ? 4 : 3)) {
                        return null;
                     } else {
                        double var55 = (double)((int)(var64 >>> 32)) / (double)IIiiIIllIiiIIl.IIIIiiiIllIIIiiiIl.length;
                        var64 ^= ((long)(hit + (lo ? 3 : 0)) ^ var64) & -1L >>> 32;
                        double var58 = IliIlIIllliIlIIl.IiIiliIiiiIi(-var47 / Math.max(0.05, var67.IlIlllIlilIl()));
                        return this.IIIllIIliIIl(
                           lIllilliIllill.illllIlIiIilllIlIi,
                           meleeRaw,
                           chest,
                           var44,
                           var40,
                           var55,
                           (int)var60,
                           target,
                           sprint,
                           melee,
                           spawnSeen,
                           path,
                           reattack,
                           self,
                           strikeEye,
                           u,
                           cal,
                           jw,
                           selfBudget,
                           prior,
                           launchYaw,
                           selfWindow,
                           towardUs,
                           w,
                           weapon,
                           (int)var64,
                           (int)(var60 >>> 32) != 0 ? 1 : 0,
                           var58,
                           seed,
                           spacing,
                           charge,
                           landIdx,
                           lo,
                           null
                        );
                     }
                  }
               }
            }
         }
      }
   }

   private List<lIlIlIlliIlIlIll> liiiIIllIl(
      long profile,
      IliIlIIllliIlIIl self,
      iIliIlilIlliIlil selfBudget,
      lliiilIiiliiilIi cfg,
      liiilIiliiiilIil target,
      ilIliliIiIlili tick,
      llilIlIlililIlIl weights,
      lilliIiiilliIi veto,
      double spacing,
      int w,
      float t,
      Predicate<class_243> targetReadyIn
   ) {
      long var81 = 348753238806024361L;
      long var83 = 6322560943039703105L;
      long var85 = 5916913350348540211L;
      long var75 = 5465315354103947690L;
      long var77 = -8010221827243589310L;
      long var79 = 7836763635270522329L;
      class_310 var15 = class_310.method_1551();
      class_746 var16 = var15.field_1724;
      if (var16 != null && self != null && self.IilliliilIIi() != null && selfBudget != null && cfg != null && target != null && weights != null) {
         illIlIiIilIlIi var17 = selfBudget.IiIlliIliiIl();
         if (var17 == null) {
            return List.of();
         } else {
            var75 ^= ((long)(weights.IliIlllilIi() == null ? 0 : weights.IliIlllilIi().ordinal()) << 32 ^ var75) & -1L << 32;
            if (target.Illlllllilll() > ililiilIiiliil.iIIllllliIlIllllli[(int)(var75 >>> 32)] + 1.5) {
               return List.of();
            } else if (var17.iliIiiliiiii() == IiIllIilliIllIil.iiIilIlIil) {
               return List.of();
            } else {
               iliIIiIiiIIi var19 = Iliilliiilii(var16, weights.IIIllIIliIIl());
               if (var19.IilliliilIIi() < 0) {
                  return List.of();
               } else {
                  IiIIIlliIIIl var20 = tick != null ? tick.IilliliilIIi() : liIIlliill;
                  Predicate var21 = targetReadyIn == null ? v -> false : targetReadyIn;
                  liIIiIlliiIIiIll var22 = var17.IliIlllilIi();
                  class_243 var23 = new class_243(var22.IliIlllilIi(), var22.liiiIIllIl(), var22.iIlIlllllill());
                  class_243 var24 = iIliIlilIlliIlil.iIiIlIliIl(var23.method_1020(cfg.liiiIIllIl()));
                  if (var24.method_1027() < 0.5) {
                     return List.of();
                  } else {
                     class_243 var25 = new class_243(-var24.field_1352, 0.0, -var24.field_1350);
                     float var26 = IlliiIIlllliiIIl.iIlIlllllill(var24.field_1352, var24.field_1350);
                     var75 ^= ((long)var17.IIIllIIliIIl().IilliliilIIi() ^ var75) & -1L >>> 32;
                     var77 ^= ((long)var17.IIIllIIliIIl().iIlIlllllill() << 32 ^ var77) & -1L << 32;
                     var77 ^= ((long)liiIIliliiiIIlil.IIiilIiiiIii((int)Math.round(var17.IIIllIIliIIl().iliIiiliiiii())) ^ var77) & -1L >>> 32;
                     double var30 = var22.liiiIIllIl();
                     var79 ^= ((long)((int)Math.floor(var22.liiiIIllIl() + 1.0E-6)) << 32 ^ var79) & -1L << 32;
                     IIliiiIilIliiiIi var33 = IIliiiIilIliiiIi.IliIlllilIi(
                        veto == null ? 1.0 : (double)veto.liiiIIllIl(),
                        veto == null ? 1.0 : (double)veto.iIlIlllllill(),
                        ililiilIiiliil.IliIllllilliIlllli[(int)(var75 >>> 32)]
                     );
                     double var34 = 15.0 * lIIlliiiIIllii.liiiIIllIl(var17.iliIiiliiiii());
                     IilIlIIllilIlIIl var36 = new IilIlIIllilIlIIl(lIiiililiIiiilil.liiiIIllIl(cfg.IIIIllIIIl(), cfg.IIiIllIiIl()), cfg.iIIIlIlIIl());
                     IilIlIIllilIlIIl var37 = new IilIlIIllilIlIIl(Math.max(0, w), target.llIIlilIIl());
                     class_243 var38 = new class_243(
                        var23.field_1352 - var24.field_1352 * spacing, var23.field_1351, var23.field_1350 - var24.field_1350 * spacing
                     );
                     double[] var39 = IlliiIIlllliiIIl.IilliliilIIi(var23.field_1352, var23.field_1350, var24.field_1352, var24.field_1350, spacing + 0.6);
                     class_243 var40 = new class_243(var39[0], var23.field_1351, var39[1]);
                     class_243 var41 = var40.method_1031(0.0, 1.62, 0.0);
                     var79 ^= (
                           (long)(
                                 self.IilliliilIIi() != null
                                       && Iilililiiili(self, var38)
                                       && Iilililiiili(self, var40)
                                       && self.llIIlilIIl(cfg.liiiIIllIl(), var40, 1)
                                    ? 1
                                    : 0
                              )
                              ^ var79
                        )
                        & -1L >>> 32;
                     class_238 var43 = IliIlIIllliIlIIl.IIIilIIiiIIi(var22, 0.1);
                     class_238 var44 = cfg.IilliliilIIi();
                     class_243 var45 = var23.method_1031(0.0, 1.2, 0.0);
                     ArrayList var46 = new ArrayList();
                     var81 ^= ((long)(var17.liiiIIllIl() && var17.iIlIlllllill() >= 1 ? 1 : 0) << 32 ^ var81) & -1L << 32;
                     List var48 = (int)var79 != 0 && (int)(var81 >>> 32) != 0
                        ? IIiilIiiiIii(self, var23, var24, (int)(var79 >>> 32), var19.lIiiIiIlilli() >= 0, var21, target.lIiiIiIlilli(), var16)
                        : List.of();
                     ArrayList var49 = new ArrayList(3);
                     if (var19.IliIlllilIi() >= 0) {
                        var49.add(IIIliIlllIIliIll.liilililll);
                        if (var19.liiiIIllIl() >= 1) {
                           var49.add(IIIliIlllIIliIll.iiilililll);
                        }
                     }

                     for (IIIliIlllIIliIll var51 : var49) {
                        if (var48.isEmpty()) {
                           break;
                        }

                        var81 ^= ((long)(var51 == IIIliIlllIIliIll.IIIiililll ? 1 : 0) ^ var81) & -1L >>> 32;
                        var83 ^= ((long)(var51 != IIIliIlllIIliIll.iiilililll ? 1 : 0) << 32 ^ var83) & -1L << 32;
                        double var54 = IiIiliIiiiIi(spacing, (boolean)((int)(var83 >>> 32)));
                        class_243 var56 = new class_243(
                           var23.field_1352 - var24.field_1352 * var54, var23.field_1351, var23.field_1350 - var24.field_1350 * var54
                        );
                        class_243 var57 = var56.method_1031(0.0, 1.62, 0.0);
                        double var58 = (int)var81 != 0 ? 0.5 : llllIiililllIiil.IliIlllilIi(0.0, var19.liiiIIllIl(), (boolean)((int)(var83 >>> 32)));
                        double[] var60 = llllIiililllIiil.IIIllIIliIIl(
                           new double[]{0.0, -0.0784, 0.0},
                           true,
                           var17.IilliliilIIi(),
                           -var24.field_1352,
                           -var24.field_1350,
                           var26,
                           var58,
                           IillIlIilillIlIi.liilIIIIIi
                        );
                        double var61 = var20.IIIllIIliIIl();
                        Iiillliliillli var63 = new Iiillliliillli((int)var75, var60[0] * var61, var60[1], var60[2] * var61, true);
                        iIlIiiIiIllIiiIi var64 = selfBudget.IIlllIlliIll(30, self, var20, var25, List.of(var63));
                        if (var64 != null) {
                           var83 ^= ((long)var64.iIlIlllllill() ^ var83) & -1L >>> 32;
                           float var66 = (int)var81 != 0 ? 1.0F : iIIIlIlIIl(var19.iIlIlllllill());
                           var85 ^= ((long)((int)var81 != 0 ? var19.IilliliilIIi() : var19.IliIlllilIi()) << 32 ^ var85) & -1L << 32;
                           double var68 = (int)var81 != 0 ? 4.0 : 1.6;
                           var85 ^= ((long)(llllIiililllIiil.iIlIlllllill(var68) + 1) ^ var85) & -1L >>> 32;

                           for (IiiiIilliiiIil var72 : var48) {
                              lIlIlIlliIlIlIll var73 = this.iIlIlllllill(
                                 profile,
                                 self,
                                 selfBudget,
                                 var20,
                                 cfg,
                                 target,
                                 var72,
                                 var51,
                                 var64,
                                 (int)var83,
                                 var63,
                                 var24,
                                 var25,
                                 var26,
                                 var57,
                                 var56,
                                 var41,
                                 var40,
                                 var43,
                                 var44,
                                 var45,
                                 var16,
                                 var19,
                                 (int)(var85 >>> 32),
                                 (boolean)((int)(var83 >>> 32)),
                                 (int)var85,
                                 var66,
                                 spacing,
                                 (int)var75,
                                 (int)(var77 >>> 32),
                                 (int)var77,
                                 var30,
                                 var33,
                                 var34,
                                 var36,
                                 t,
                                 var17
                              );
                              if (var73 != null) {
                                 var46.add(var73);
                              }

                              if ((int)var81 == 0 && !var72.lIiiIiIlilli()) {
                                 lIlIlIlliIlIlIll var74 = this.IilliliilIIi(
                                    self,
                                    selfBudget,
                                    var20,
                                    cfg,
                                    target,
                                    var72,
                                    var51,
                                    var64,
                                    (int)var83,
                                    var63,
                                    var24,
                                    var25,
                                    var26,
                                    var57,
                                    var56,
                                    var40,
                                    var45,
                                    var19,
                                    (int)(var85 >>> 32),
                                    (boolean)((int)(var83 >>> 32)),
                                    (int)var85,
                                    var66,
                                    spacing,
                                    (int)var75,
                                    (int)(var77 >>> 32),
                                    (int)var77,
                                    var30,
                                    var33,
                                    var34,
                                    var36,
                                    t,
                                    var17
                                 );
                                 if (var74 != null) {
                                    var46.add(var74);
                                 }
                              }

                              if ((int)var81 != 0 && var72.iIlIlllllill() && !var72.lIiiIiIlilli()) {
                                 lIlIlIlliIlIlIll var87 = this.lIiiIiIlilli(
                                    self,
                                    selfBudget,
                                    var20,
                                    cfg,
                                    target,
                                    var72,
                                    var64,
                                    (int)var83,
                                    var63,
                                    var24,
                                    var25,
                                    var26,
                                    var57,
                                    var56,
                                    var40,
                                    var45,
                                    var19,
                                    (int)(var85 >>> 32),
                                    (int)var85,
                                    var66,
                                    spacing,
                                    (int)var75,
                                    (int)(var77 >>> 32),
                                    (int)var77,
                                    var30,
                                    var33,
                                    var34,
                                    var36,
                                    t,
                                    var17
                                 );
                                 if (var87 != null) {
                                    var46.add(var87);
                                 }
                              }
                           }
                        }
                     }

                     var46.addAll(
                        this.iliIiiliiiii(
                           self,
                           selfBudget,
                           var20,
                           cfg,
                           target,
                           var16,
                           var19,
                           var23,
                           (int)(var79 >>> 32),
                           var25,
                           (int)var75,
                           (int)(var77 >>> 32),
                           (int)var77,
                           var30,
                           var33,
                           var34,
                           var36,
                           var37,
                           t,
                           var17,
                           var21,
                           var44
                        )
                     );
                     var46.sort(Comparator.<lIlIlIlliIlIlIll>comparingDouble(e -> e.IliIlllilIi().iIlIlllllill()).reversed());
                     return this.IiIlliIliiIl(
                        var46, self, selfBudget, var20, cfg, target, var16, var25, (int)var75, var30, var33, var34, var36, var37, t, var17
                     );
                  }
               }
            }
         }
      } else {
         return List.of();
      }
   }

   private List<lIlIlIlliIlIlIll> IiIlliIliiIl(
      List<lIlIlIlliIlIlIll> w,
      IliIlIIllliIlIIl selfBudget,
      iIliIlilIlliIlil cal,
      IiIIIlliIIIl towardUs,
      lliiilIiiliiilIi floorY,
      liiilIiliiiilIil jw,
      class_746 t,
      class_243 target,
      int evals,
      double prior,
      IIliiiIilIliiiIi player,
      double targetWindow,
      IilIlIIllilIlIIl seed,
      IilIlIIllilIlIIl rT,
      float selfWindow,
      illIlIiIilIlIi self
   ) {
      long var38 = 1391674856415375474L;
      ArrayList var19 = new ArrayList(w.size());
      ArrayList var20 = new ArrayList();
      HashMap var21 = new HashMap();
      HashSet var22 = new HashSet();
      HashMap var23 = new HashMap();
      var38 ^= (0L ^ var38) & -1L << 32;

      for (lIlIlIlliIlIlIll var26 : w) {
         lIiliiiliIiliiil var27 = var26.IliIlllilIi();
         lIiIiIIiiIiIiIIi var28 = var26.liiiIIllIl();
         IIiIiIllIiIiIl var29 = new IIiIiIllIiIiIl(var27.lIiiIiIlilli(), var27.IliIlllilIi() == lIllilliIllill.IIillIlIilIillIlIi);
         if (!var22.contains(var29)) {
            class_2338 var30 = var26.IilliliilIIi() ? var27.lIiiIiIlilli() : null;
            IlIiiIllllIiiIll var31 = new IlIiiIllllIiiIll(var27.lIiiIiIlilli(), var28.Iiilliiliiil());
            Double var32 = (Double)var21.get(var29);
            float var33;
            if (var32 == null) {
               if ((int)(var38 >>> 32) >= 4 || jw.lIiiIiIlilli() == null || this.iiIIlliill == null || !this.iiIIlliill.liiiIIllIl(90, 4)) {
                  var20.add(var26);
                  continue;
               }

               var38 += 4294967296L;
               class_238 var34 = IliIlIIllliIlIIl.Iiilliiliiil(
                  var28.IliIlllilIi().field_1352, var28.IliIlllilIi().field_1351, var28.IliIlllilIi().field_1350, 0.0
               );
               var33 = lllIliIlillIliIl.lIlIliIlIl(var28.liiiIIllIl(), var34, jw.lIiiIiIlilli(), var30);
               if (!(var33 > 0.0F)) {
                  var22.add(var29);
                  continue;
               }

               var21.put(var29, Illlllllilll((double)var33, var26.iIlIlllllill()));
               class_243 var35 = var28.Iiilliiliiil();
               class_238 var36 = IliIlIIllliIlIIl.Iiilliiliiil(var35.field_1352, var35.field_1351, var35.field_1350, 0.0);
               var23.put(var31, lllIliIlillIliIl.IlIllllIll(t, var28.liiiIIllIl(), var35, var36, var30, null, 6.0F));
            } else {
               var33 = (float)Iilllilliill(var26.iIlIlllllill(), var32);
               if (!(var33 > 0.0F)) {
                  continue;
               }
            }

            Float var46 = (Float)var23.get(var31);
            float var47 = var27.IIillIiliIil();
            if (var46 != null) {
               float var48 = iiIiiliIIliili.lIiiIiIlilli(var46, floorY.IiIlliIliiIl());
               var47 = iiIiiliIIliili.iliIiiliiiii(var46, floorY.IiIlliIliiIl(), seed, var27.IIIllIIliIIl());
               if (var48 > 0.0F && var48 >= floorY.IIIllIIliIIl() + floorY.IlIlllIlilIl() - 1.0F) {
                  continue;
               }
            }

            if (var47 <= selfWindow) {
               double var49 = IlIlllIlilIl(var28, (double)var33, var47, selfWindow, jw, towardUs, player, prior);
               if (Double.isFinite(var49)) {
                  var19.add(new lIlIlIlliIlIlIll(IIlllIlliIll(var27, var49 + targetWindow, var47), var28, (double)var33, var26.IilliliilIIi()));
               }
            }
         }
      }

      var19.sort(Comparator.<lIlIlIlliIlIlIll>comparingDouble(x -> x.IliIlllilIi().iIlIlllllill()).reversed());
      double var40 = var19.isEmpty() ? Double.POSITIVE_INFINITY : ((lIlIlIlliIlIlIll)var19.get(var19.size() - 1)).IliIlllilIi().iIlIlllllill();
      ArrayList var41 = new ArrayList(var19.size() + var20.size());
      var41.addAll(var19);
      ArrayList var42 = new ArrayList(var20.size());

      for (lIlIlIlliIlIlIll var44 : var20) {
         double var45 = IIillIiliIil(var44.IliIlllilIi().iIlIlllllill(), var40);
         var42.add(
            var45 == var44.IliIlllilIi().iIlIlllllill()
               ? var44
               : new lIlIlIlliIlIlIll(
                  IIlllIlliIll(var44.IliIlllilIi(), var45, var44.IliIlllilIi().IIillIiliIil()), var44.liiiIIllIl(), var44.iIlIlllllill(), var44.IilliliilIIi()
               )
         );
      }

      var42.sort(Comparator.<lIlIlIlliIlIlIll>comparingDouble(x -> x.IliIlllilIi().iIlIlllllill()).reversed());
      var41.addAll(var42);
      return var41;
   }

   public iIiilillIliilill(IilIllililIlli budget) {
      this.iiIIlliill = budget;
   }

   static double IiIiliIiiiIi(double spacing, boolean sprint) {
      return spacing + (sprint ? 0.3 : 0.35);
   }

   private static double IIIilIIiiIIi(class_238 space, class_238 s, liIIiIlliiIIiIll targetNow, int prep) {
      double var4 = IliIlIIllliIlIIl.IlIillIiilIi(space, s);
      double var6 = Math.min(1.2, Math.max(0.05, targetNow.IlIlllIlilIl() + 0.05 * (double)Math.min(prep, 20)));
      return IliIlIIllliIlIIl.IiIiliIiiiIi(-Math.max(0.0, var4) / var6);
   }

   static double IIillIiliIil(double checkedFloor, double value) {
      return Double.isFinite(value) && !(checkedFloor < value) ? value - 0.001 : checkedFloor;
   }

   static iliIIiIiiIIi Iliilliiilii(class_746 player, boolean buildObsidian) {
      long var9 = -4445363237909363043L;
      long var11 = -7257022469904981069L;
      long var13 = 5760170667991105805L;
      class_1661 var2 = player.method_31548();
      var9 ^= (-4294967296L ^ var9) & -1L << 32;
      var9 ^= ~var9 & -1L >>> 32;
      class_1799 var5 = class_1799.field_8037;

      for (var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) < 9; var11 += 4294967296L) {
         class_1799 var7 = var2.method_5438((int)(var11 >>> 32));
         if (lIlllIliIlllIl.iIlIlllllill(var7)) {
            var11 ^= ((long)lIlllIliIlllIl.lIiiIiIlilli(var7, class_1893.field_9121) ^ var11) & -1L >>> 32;
            if ((int)var11 > (int)var9 || (int)var11 == (int)var9 && iIIIlIlIIl(var7) > iIIIlIlIIl(var5)) {
               var9 ^= ((long)((int)var11) ^ var9) & -1L >>> 32;
               var9 ^= ((long)((int)(var11 >>> 32)) << 32 ^ var9) & -1L << 32;
               var5 = var7;
            }
         }
      }

      var11 ^= ((long)IilIIililIIi.lIiiIiIlilli(class_1802.field_8301) << 32 ^ var11) & -1L << 32;
      var13 ^= ((long)(buildObsidian ? IilIIililIIi.lIiiIiIlilli(class_1802.field_8281) : -1) << 32 ^ var13) & -1L << 32;
      return new iliIIiIiiIIi(
         (int)(var9 >>> 32), Math.max(0, (int)var9), var5, (int)(var11 >>> 32), (int)(var13 >>> 32), Iiiiliiiiiii(var2.method_5438(var2.method_67532()))
      );
   }

   public List<lIiliiiliIiliiil> IliIlllilIi(
      long w,
      IliIlIIllliIlIIl target,
      iIliIlilIlliIlil t,
      lliiilIiiliiilIi self,
      liiilIiliiiilIil profile,
      ilIliliIiIlili spacing,
      llilIlIlililIlIl veto,
      lilliIiiilliIi cfg,
      double targetReadyIn,
      int weights,
      float selfBudget,
      Predicate<class_243> tick
   ) {
      List var15 = this.liiiIIllIl(w, target, t, self, profile, spacing, veto, cfg, targetReadyIn, weights, selfBudget, tick);
      ArrayList var16 = new ArrayList(var15.size());

      for (lIlIlIlliIlIlIll var18 : var15) {
         var16.add(var18.IliIlllilIi());
      }

      return var16;
   }

   private lIlIlIlliIlIlIll IIIllIIliIIl(
      lIllilliIllill blastIdx,
      IIIliIlllIIliIll lineUpFeet,
      IiiiIilliiiIil ourFeet,
      liIIiIlliiIIiIll s,
      class_243 path,
      double jw,
      int sprint,
      int launchYaw,
      iIlIiiIiIllIiiIi selfBudget,
      int arm,
      Iiillliliillli towardUs,
      iIliIlilIlliIlil floorY,
      IliIlIIllliIlIIl prep,
      IiIIIlliIIIl rT,
      lliiilIiiliiilIi expo,
      liiilIiliiiilIil prior,
      class_243 target,
      class_243 seed,
      float landIdx,
      double meleeRaw,
      IIliiiIilIliiiIi selfWindow,
      double window,
      IilIlIIllilIlIIl w,
      float b,
      illIlIiIilIlIi spacing,
      int cal,
      int hit,
      double t,
      float self,
      class_243 weapon,
      double centre,
      int obsidianPlaces,
      boolean failRisk,
      IilIlIIllilIlIIl melee
   ) {
      long var58 = -4052676551337694356L;
      long var60 = 6445448304775093775L;
      class_243 var40 = new class_243(s.IliIlllilIi(), s.liiiIIllIl(), s.iIlIlllllill());
      double[] var41 = llllIiililllIiil.IlIlllIlilIl(
         s.IliIlllilIi(), s.liiiIIllIl(), s.iIlIlllllill(), 1.62, path.field_1352, path.field_1351, path.field_1350, 6.0, 1.0, spacing.lIiiIiIlilli()
      );
      var58 ^= ((long)(sprint + launchYaw) << 32 ^ var58) & -1L << 32;
      liIIiIlliiIIiIll var43 = selfBudget.IliIlllilIi((int)(var58 >>> 32));
      var58 ^= ((long)(arm < selfBudget.liiiIIllIl() ? arm : (int)(var58 >>> 32)) ^ var58) & -1L >>> 32;
      double var45 = seed.method_1022(path);
      float var47 = lllIliIlillIliIl.ilIllIiIll(class_310.method_1551().field_1724, var45, 6.0F)
         * (float)IIiiIIllIiiIIl.IilliliilIIi(seed.field_1351, (double)ourFeet.liiiIIllIl());
      float var48 = iiIiiliIIliili.iliIiiliiiii(var47, expo.IiIlliIliiIl(), w, sprint);
      float var49 = iiIiiliIIliili.lIiiIiIlilli(var47, expo.IiIlliIliiIl());
      if (var49 > 0.0F && var49 >= expo.IIIllIIliIIl() + expo.IlIlllIlilIl() - 1.0F) {
         return null;
      } else {
         double var50 = rT.IiIlliIliiIl();
         var60 ^= ((long)Iiilliiliiil(ourFeet, var43, var43.lIiiIiIlilli() + var41[1] * jw * var50, var41, jw * var50) << 32 ^ var60) & -1L << 32;
         lIiIiIIiiIiIiIIi var53 = new lIiIiIIiiIiIiIIi(
            var40,
            path,
            var41,
            var43.liiiIIllIl(),
            var43.lIiiIiIlilli(),
            (int)(var58 >>> 32),
            (int)var58,
            landIdx,
            melee,
            t,
            (boolean)((int)(var60 >>> 32)),
            hit,
            cal,
            sprint,
            seed
         );
         double var54 = IlIlllIlilIl(var53, jw, var48, b, prior, rT, selfWindow, meleeRaw);
         if (!Double.isFinite(var54)) {
            return null;
         } else {
            var54 += window;
            class_2338 var56 = ourFeet.iIlIlllllill() ? null : ourFeet.IliIlllilIi();
            lIiliiiliIiliiil var57 = new lIiliiiliIiliiil(
               blastIdx, lineUpFeet, var54, cal, ourFeet.IliIlllilIi(), var56, sprint, self, weapon, centre, obsidianPlaces, failRisk, var48
            );
            return new lIlIlIlliIlIlIll(var57, var53, jw, !ourFeet.iIlIlllllill());
         }
      }
   }

   private static boolean Iiilliiliiil(IiiiIilliiiIil es, liIIiIlliiIIiIll kb, double vyKick, double[] kickSample, double b) {
      long var16 = 6389470633841939660L;
      var16 ^= ((long)IlIIiillllIIiill.IilliliilIIi(vyKick) << 32 ^ var16) & -1L << 32;
      double var8 = kb.IliIlllilIi() + (kb.IilliliilIIi() + kickSample[0] * b) * (double)Math.min((int)(var16 >>> 32), 10) * 0.7;
      double var10 = kb.iIlIlllllill() + (kb.iliIiiliiiii() + kickSample[2] * b) * (double)Math.min((int)(var16 >>> 32), 10) * 0.7;
      double var12 = kb.liiiIIllIl() + IlIIiillllIIiill.iIlIlllllill(vyKick, Math.max(0, (int)(var16 >>> 32)));
      double var14 = IliIlIIllliIlIIl.iIIIlIlIIl(var8, var10, (double)es.IliIlllilIi().method_10263() + 0.5, (double)es.IliIlllilIi().method_10260() + 0.5);
      return var14 <= 2.0 && var12 >= (double)es.liiiIIllIl() + 1.5;
   }

   private static lIiliiiliIiliiil IIlllIlliIll(lIiliiiliIiliiil value, double o, float selfCost) {
      return new lIiliiiliIiliiil(
         value.IliIlllilIi(),
         value.liiiIIllIl(),
         o,
         value.IilliliilIIi(),
         value.lIiiIiIlilli(),
         value.iliIiiliiiii(),
         value.IIIllIIliIIl(),
         value.IlIlllIlilIl(),
         value.IiIlliIliiIl(),
         value.IIlllIlliIll(),
         value.Illlllllilll(),
         value.Iilllilliill(),
         selfCost
      );
   }

   static float iIIIlIlIIl(class_1799 st) {
      long var4 = -3841530045749583784L;
      if (st != null && !st.method_7960()) {
         class_1792 var1 = st.method_7909();
         float var2;
         if (var1 == class_1802.field_22022) {
            var2 = 8.0F;
         } else if (var1 == class_1802.field_8802) {
            var2 = 7.0F;
         } else if (var1 == class_1802.field_8371) {
            var2 = 6.0F;
         } else if (var1 == class_1802.field_8528) {
            var2 = 5.0F;
         } else if (var1 == class_1802.field_8845 || var1 == class_1802.field_8091) {
            var2 = 4.0F;
         } else if (var1 == class_1802.field_22025) {
            var2 = 10.0F;
         } else if (var1 == class_1802.field_8556 || var1 == class_1802.field_8475 || var1 == class_1802.field_8062) {
            var2 = 9.0F;
         } else if (var1 == class_1802.field_8825 || var1 == class_1802.field_8406) {
            var2 = 7.0F;
         } else if (lIlllIliIlllIl.IliIlllilIi(st)) {
            var2 = 6.0F;
         } else if (st.method_31573(class_3489.field_42611)) {
            var2 = 6.0F;
         } else {
            var2 = 1.0F;
         }

         var4 ^= ((long)lIlllIliIlllIl.lIiiIiIlilli(st, class_1893.field_9118) << 32 ^ var4) & -1L << 32;
         return var2 + ((int)(var4 >>> 32) > 0 ? 0.5F * (float)((int)(var4 >>> 32)) + 0.5F : 0.0F);
      } else {
         return 1.0F;
      }
   }

   static double Illlllllilll(double bound, double exact) {
      return bound > 0.0 && exact > 0.0 ? Math.min(1.0, bound / exact) : 0.0;
   }

   static double IIlilIliiIli(int ticks) {
      return 0.12 * (double)Math.min(Math.max(0, ticks), 3);
   }

   private static List<IiiiIilliiiIil> IIiilIiiiIii(
      IliIlIIllliIlIIl veto,
      class_243 feetLevel,
      class_243 selfEntity,
      int feet,
      boolean w,
      Predicate<class_243> canBuild,
      class_1297 u,
      class_1297 targetEntity
   ) {
      long var33 = 6085147138449970829L;
      long var25 = 8095103726980934085L;
      long var27 = -6143118876963802944L;
      long var29 = -1911959904021064265L;
      long var31 = 3664551639840383293L;
      ArrayList var8 = new ArrayList();
      ArrayList var9 = new ArrayList();
      double[] var10 = ilIiIliill;
      var25 ^= ((long)var10.length << 32 ^ var25) & -1L << 32;

      for (long var36 = var25 ^ (0L ^ var25) & -1L >>> 32; (int)var36 < (int)(var36 >>> 32); var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32) {
         double var13 = var10[(int)var36];
         double[] var15 = IlliiIIlllliiIIl.lIiiIiIlilli(feetLevel.field_1352, feetLevel.field_1350, selfEntity.field_1352, selfEntity.field_1350, var13);
         var27 ^= ((long)((int)Math.floor(var15[0])) << 32 ^ var27) & -1L << 32;
         var27 ^= ((long)((int)Math.floor(var15[1])) ^ var27) & -1L >>> 32;

         for (var29 ^= ((long)(feet - 2) << 32 ^ var29) & -1L << 32; (int)(var29 >>> 32) <= feet; var29 += 4294967296L) {
            class_2338 var19 = new class_2338((int)(var27 >>> 32), (int)(var29 >>> 32), (int)var27);
            if (!var9.contains(var19)) {
               var9.add(var19);
               var29 ^= ((long)((int)(var29 >>> 32) == feet ? 1 : 0) ^ var29) & -1L >>> 32;
               long var38 = var31 ^ ((long)veto.IIIllIIliIIl(var19) << 32 ^ var31) & -1L << 32;
               var31 = var38 ^ ((long)((int)(var38 >>> 32) != 0 && veto.Illlllllilll(var19) != null ? 1 : 0) ^ var38) & -1L >>> 32;
               var33 ^= ((long)((int)(var31 >>> 32) == 0 || (int)var31 == 0 && !veto.iliIiiliiiii(var19.method_10084()) ? 0 : 1) << 32 ^ var33) & -1L << 32;
               var33 ^= ((long)((int)(var31 >>> 32) == 0 && w && veto.IiIlliIliiIl(var19) ? 1 : 0) ^ var33) & -1L >>> 32;
               if (((int)(var33 >>> 32) != 0 || (int)var33 != 0)
                  && ((int)(var33 >>> 32) == 0 || (int)var31 != 0 || !veto.IIillIiliIil(var19, u, targetEntity))
                  && !canBuild.test(lllIliIlillIliIl.liiiIIllIl(var19))) {
                  var8.add(new IiiiIilliiiIil(var19, var19.method_10264() + 1, (boolean)((int)(var33 >>> 32)), (boolean)((int)var29), (boolean)((int)var31)));
               }
            }
         }
      }

      return var8;
   }
}
