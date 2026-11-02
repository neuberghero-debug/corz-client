package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class IlIilIlllIilIl {
   public static final int ilIiIiIllIiIiIiIll = 6;
   public static final int iiilIiIllIIIiIiIll = 30;
   public static final int liIiIiIlliiIiIiIll = 8;
   public static final double IlIiIiIllllIiIiIll = 1.15;
   public static final int lIIiIiIlliIIiIiIll = 3;
   public static final int IiilIiIllliilIiIll = 6;

   public static boolean liiiIIllIl(liilllIliiilllIl k) {
      return k == liilllIliiilllIl.liiIIIliIl
         || k == liilllIliiilllIl.iiiIIIliIl
         || k == liilllIliiilllIl.IIIlIIliIl
         || k == liilllIliiilllIl.lIIlIIliIl
         || k == liilllIliiilllIl.iIIlIIliIl;
   }

   public static lllIliilillIliil iliIiiliiiii(
      liilllIliiilllIl directionalMembers,
      long confirmTicks,
      int slippery,
      int entryTravelTicks,
      double expectedPlacements,
      boolean clusterKey,
      int sneakPulses,
      int kind
   ) {
      long var12 = -6636622870212924697L;
      var12 ^= ((long)Math.max(1, slippery) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(2 + (int)Math.round((6.0 * (double)Math.max(0, sneakPulses) + 8.0 * (double)Math.max(0, kind)) / (double)((int)(var12 >>> 32)))) ^ var12)
         & -1L >>> 32;
      return new lllIliilillIliil(
         directionalMembers,
         confirmTicks,
         entryTravelTicks,
         slippery,
         (double)slippery,
         1.0,
         (int)var12,
         0,
         0,
         0,
         clusterKey ? 4 : 0,
         (int)Math.round(expectedPlacements),
         clusterKey ? 0.1 : 0.05,
         10,
         directionalMembers.name().toLowerCase(Locale.ROOT) + IlIlllIlilIl<"IlIlllIlilIl","T4Qwz4E9Ln6Ajq6xI4WHUE6O9917pjlRKdJHx3ss+RQjbj1uasqE">()
      );
   }

   public static lllIliilillIliil iIlIlllllill(
      long failureRisk, int clusterKey, int confirmTicks, double expectedPlacements, double accessTicks, double placementsPerStand
   ) {
      return new lllIliilillIliil(
         liilllIliiilllIl.IiIlIIliIl,
         failureRisk,
         Math.max(0, confirmTicks),
         clusterKey,
         Math.max(1.0, expectedPlacements),
         2.0,
         3,
         0,
         4,
         0,
         0,
         (int)Math.round(accessTicks),
         Math.max(0.0, placementsPerStand),
         0,
         IlIlllIlilIl<"IlIlllIlilIl","sQ/36WxtKBBcWlhzkgd++4o+ncX2Vm8ACaoSg7xaN43k+MCH/9RMYg==">()
      );
   }

   private IlIilIlllIilIl() {
   }

   public static lllIliilillIliil lIiiIiIlilli(
      liilllIliiilllIl confirmTicks, long expectedPlacements, int clusterKey, int slippery, double entryTravelTicks, boolean kind
   ) {
      return iliIiiliiiii(confirmTicks, expectedPlacements, clusterKey, slippery, entryTravelTicks, kind, 0, 0);
   }

   public static lllIliilillIliil IIIllIIliIIl(long perPlacementTicks, int expectedPlacements, int entryTravelTicks, double clusterKey) {
      return new lllIliilillIliil(
         liilllIliiilllIl.llIlIIliIl,
         perPlacementTicks,
         entryTravelTicks,
         expectedPlacements,
         (double)expectedPlacements,
         (double)expectedPlacements,
         4,
         0,
         (int)Math.round(clusterKey),
         0,
         0,
         3,
         0.05,
         0,
         IlIlllIlilIl<"IlIlllIlilIl","GYkKAQPPiKigVU9lrOz2sty9jg53m/fFFFrax6tsNswtnWKhSgkkw+kLs2Xyhg==">()
      );
   }

   public static iiiIIiIlIIIlIiIl IliIlllilIi(List<lllIliilillIliil> candidates) {
      ArrayList var1 = new ArrayList();

      for (lllIliilillIliil var3 : candidates) {
         if (var3 != null && var3.iliIiiliiiii() > 0) {
            var1.add(var3);
         }
      }

      if (var1.isEmpty()) {
         return new iiiIIiIlIIIlIiIl(null, var1, 0.0, IlIlllIlilIl<"IlIlllIlilIl","wGSKANQAI0jP2dm1YpdPk05I77r+JQKQj7sO9Xfom6xZ6aVJ02blSw==">());
      } else {
         lllIliilillIliil var10 = null;
         double var11 = -1.0;

         for (lllIliilillIliil var6 : var1) {
            if (!liiiIIllIl(var6.iIlIlllllill()) || var6.iliIiiliiiii() >= 3) {
               double var7 = var6.liiiIIllIl();
               if (var7 > var11) {
                  var11 = var7;
                  var10 = var6;
               }
            }
         }

         if (var10 == null) {
            var10 = (lllIliilillIliil)var1.get(0);
            var11 = var10.liiiIIllIl();

            for (lllIliilillIliil var15 : var1) {
               if (var15.liiiIIllIl() > var11) {
                  var10 = var15;
                  var11 = var15.liiiIIllIl();
               }
            }
         }

         lllIliilillIliil var14 = null;

         for (lllIliilillIliil var18 : var1) {
            if (!liiiIIllIl(var18.iIlIlllllill()) && (var14 == null || var18.liiiIIllIl() > var14.liiiIIllIl())) {
               var14 = var18;
            }
         }

         if (liiiIIllIl(var10.iIlIlllllill()) && var14 != null && var10.liiiIIllIl() < var14.liiiIIllIl() * 1.15) {
            return new iiiIIiIlIIIlIiIl(
               var14,
               var1,
               0.0,
               IlIlllIlilIl<"IlIlllIlilIl","es+hw8uhAjQ/3Qc4cnk1Af5oggKCvj1spA+6ALjOG490fHnlT/uEA1RvKouPRjOyNTfszETTvdIS">() + var14.iIlIlllllill()
            );
         } else {
            double var17 = 0.0;

            for (lllIliilillIliil var9 : var1) {
               if (var9 != var10) {
                  var17 = Math.max(var17, var9.liiiIIllIl());
               }
            }

            double var19 = var17 <= 0.0 ? 0.0 : Math.max(0.0, (double)var10.iliIiiliiiii() / var17 * 20.0 - var10.IliIlllilIi());
            return new iiiIIiIlIIIlIiIl(var10, var1, var19, var10.IlIillIiilIi());
         }
      }
   }

   public static lllIliilillIliil IilliliilIIi(
      long confirmTicks,
      int entryTravelTicks,
      int clusterKey,
      double expectedPlacements,
      double avgEdgeAdjustTicks,
      double rotationTicks,
      double placementsPerLocalMove,
      int avgCrouchTicks
   ) {
      return new lllIliilillIliil(
         liilllIliiilllIl.IlIlIIliIl,
         confirmTicks,
         clusterKey,
         entryTravelTicks,
         4.0,
         Math.max(0.5, avgEdgeAdjustTicks),
         avgCrouchTicks,
         0,
         (int)Math.round(expectedPlacements),
         (int)Math.round(rotationTicks),
         0,
         (int)Math.round(placementsPerLocalMove),
         0.05,
         20,
         IlIlllIlilIl<"IlIlllIlilIl","F2MutvRlaFLtvj4TsVnCnB9ZiN5NM6Sy4NnWh0COAoSiBejjsTLgeH4=">()
      );
   }
}
