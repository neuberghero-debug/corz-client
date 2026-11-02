package gg.corz;

import java.util.List;

public final class liiIIIiiiiIIIi {
   public static final int IIiIiIililIiIiIili = 12;
   public static final int IiiIiIililiiIiIili = 3;
   public static final double lliIiIiliiliIiIili = 1.5;
   public static final double iIiIiIiliIliIiIili = 0.05;

   public static double iIlIlllllill(int tempBlocks, int routeLen, int expectedBlocks) {
      return (double)tempBlocks / (1.0 + (double)routeLen + (double)expectedBlocks * 6.0);
   }

   public static boolean IIIllIIliIIl(int expectedBlocks, int routeLen, int tempBlocks, boolean localWorkExists, boolean bottleneckOrCompletion) {
      List var5 = bottleneckOrCompletion
         ? List.of(new IiiIlIiliiIlIi(IlIlllIlilIl<"IlIlllIlilIl","PDZMlrFRZSZ6mMdrE/ZI14kli/VF5epV/t/gnhzbgoiR">(), 1, 1.0, 0L))
         : List.of();
      return !IilliliilIIi(expectedBlocks, routeLen, tempBlocks, localWorkExists, 0, var5).liiiIIllIl();
   }

   public static IliiIlIllliiIlIl lIiiIiIlilli(
      int alternatives,
      int tempBlocks,
      int dependencyUnlocks,
      boolean bottleneckOrCompletion,
      int expectedBlocks,
      List<IiiIlIiliiIlIi> target,
      long proof,
      IlliIIlillliIIli routeLen
   ) {
      return iliIiiliiiii(alternatives, tempBlocks, dependencyUnlocks, bottleneckOrCompletion, expectedBlocks, target, proof, routeLen, true);
   }

   private liiIIIiiiiIIIi() {
   }

   public static IliiIlIllliiIlIl IilliliilIIi(
      int dependencyUnlocks, int tempBlocks, int expectedBlocks, boolean routeLen, int bottleneckOrCompletion, List<IiiIlIiliiIlIi> alternatives
   ) {
      return lIiiIiIlilli(dependencyUnlocks, tempBlocks, expectedBlocks, routeLen, bottleneckOrCompletion, alternatives, 0L, null);
   }

   public static IliiIlIllliiIlIl iliIiiliiiii(
      int alternativesProven,
      int alternatives,
      int bottleneckOrCompletion,
      boolean proof,
      int routeLen,
      List<IiiIlIiliiIlIi> target,
      long dependencyUnlocks,
      IlliIIlillliIIli expectedBlocks,
      boolean tempBlocks
   ) {
      double var10 = iIlIlllllill(alternativesProven, alternatives, bottleneckOrCompletion);
      IiiIlIiliiIlIi var12 = null;
      if (target != null) {
         for (IiiIlIiliiIlIi var14 : target) {
            if (var14.lIiiIiIlilli() > 0 && (var12 == null || var14.liiiIIllIl() > var12.liiiIIllIl())) {
               var12 = var14;
            }
         }
      }

      if (expectedBlocks != null && expectedBlocks.IliIlllilIi(dependencyUnlocks, var12)) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.IlllIIliIl, var10, var12);
      } else if (var12 != null && var12.liiiIIllIl() > var10 * 1.5) {
         return new IliiIlIllliiIlIl(false, IIIillIllIIillIl.IillIIliIl, var10, var12);
      } else if (!tempBlocks && var12 == null && alternativesProven < IliIlllilIi(alternatives)) {
         return new IliiIlIllliiIlIl(false, IIIillIllIIillIl.lillIIliIl, var10, null);
      } else if (alternatives <= 12) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.iiIlIIliIl, var10, var12);
      } else if (var10 >= 0.05) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.IIllIIliIl, var10, var12);
      } else if (proof) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.lIllIIliIl, var10, var12);
      } else if (routeLen >= 3) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.iIllIIliIl, var10, var12);
      } else if (var12 == null) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.llllIIliIl, var10, null);
      } else {
         return var12.liiiIIllIl() < var10 * 1.5
            ? new IliiIlIllliiIlIl(true, IIIillIllIIillIl.illlIIliIl, var10, var12)
            : new IliiIlIllliiIlIl(false, IIIillIllIIillIl.IillIIliIl, var10, var12);
      }
   }

   public static boolean liiiIIllIl(int dz, int dx, int dy) {
      return Math.max(Math.abs(dz), Math.abs(dy)) <= 8 && Math.abs(dx) <= 2;
   }

   public static int IliIlllilIi(int routeLen) {
      if (routeLen <= 5) {
         return 1;
      } else if (routeLen <= 12) {
         return 3;
      } else {
         return routeLen <= 24 ? 6 : 10;
      }
   }
}
