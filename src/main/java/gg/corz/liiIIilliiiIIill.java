package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public record liiIIilliiiIIill(long container, long stand, int interactionFace, double hitX, double hitY, double hitZ, String routeProof, String screenType) {
   private final double iiliillill;
   private final double IIiiillill;
   private final int liliillill;
   private final long illiillill;
   private final String iIiiillill;
   private final String Iliiillill;
   private final double lIiiillill;
   private static final int[][] lliiillill = new int[][]{{0, -1, 2}, {0, 1, 3}, {-1, 0, 4}, {1, 0, 5}};
   private final long Iiliillill;

   public int IlIlllIlilIl() {
      return this.liliillill;
   }

   public long IIIllIIliIIl() {
      return this.Iiliillill;
   }

   public String Iilllilliill() {
      return this.iIiiillill;
   }

   public double IiIlliIliiIl() {
      return this.iiliillill;
   }

   public String IIillIiliIil() {
      return this.Iliiillill;
   }

   public double Illlllllilll() {
      return this.lIiiillill;
   }

   public static double[] iIlIlllllill(long container, int face) {
      double var3 = (double)llIiIiililIiIiil.IiIlliIliiIl(container) + 0.5;
      double var5 = (double)llIiIiililIiIiil.IIlllIlliIll(container) + 0.45;
      double var7 = (double)llIiIiililIiIiil.Illlllllilll(container) + 0.5;
      switch (face) {
         case 1:
            var5 = (double)llIiIiililIiIiil.IIlllIlliIll(container) + 0.85;
            break;
         case 2:
            var7 -= 0.42;
            break;
         case 3:
            var7 += 0.42;
            break;
         case 4:
            var3 -= 0.42;
            break;
         case 5:
            var3 += 0.42;
      }

      return new double[]{var3, var5, var7};
   }

   public long iliIiiliiiii() {
      return this.illiillill;
   }

   public static liiIIilliiiIIill IilliliilIIi(long stand, long routeProof, int container, String screenType, String face) {
      double[] var7 = iIlIlllllill(stand, container);
      return new liiIIilliiiIIill(stand, routeProof, container, var7[0], var7[1], var7[2], screenType, face);
   }

   public String lIiiIiIlilli() {
      return String.format(
         Locale.ROOT,
         Ililllililil<"Ililllililil","0XjoYZKqoUrLWuKuaoUEJ6bjjsNqpFuiC3gT9o04jgyKbF8NOpGoTC4o+RTwHXLwu800FUavhITmWpTOpoQwyhHeDaI4+A2ki7NmUbpQqzC/n0RZz8B0ry4Kph1KMxk4+aGTjqkyx9T5Ncl21ht5JjTNbQBMFA==">(),
         llIiIiililIiIiil.IlIlllIlilIl(this.illiillill),
         llIiIiililIiIiil.IlIlllIlilIl(this.Iiliillill),
         this.liliillill,
         this.iiliillill,
         this.IIiiillill,
         this.lIiiillill,
         this.iIiiillill,
         this.Iliiillill
      );
   }

   public static List<long[]> liiiIIllIl(long frontFaceOrdinal, Integer container, lIIlIIliIIlIIl g) {
      long var19 = 1471851411603528637L;
      long var21 = 4999802249546450729L;
      long var23 = 1855176641946621782L;
      long var25 = 6808327833444072712L;
      long var27 = 4698421957251832010L;
      long var29 = 3753528530350466070L;
      var19 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(frontFaceOrdinal) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(frontFaceOrdinal) ^ var19) & -1L >>> 32;
      var21 ^= ((long)llIiIiililIiIiil.Illlllllilll(frontFaceOrdinal) << 32 ^ var21) & -1L << 32;
      ArrayList var7 = new ArrayList();
      ArrayList var8 = new ArrayList();
      int[][] var9 = lliiillill;
      var21 ^= ((long)var9.length ^ var21) & -1L >>> 32;

      for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
         int[] var12 = var9[(int)(var23 >>> 32)];
         if (container != null && var12[2] == container) {
            var8.add(var12);
         }
      }

      var9 = lliiillill;
      var21 ^= ((long)var9.length ^ var21) & -1L >>> 32;

      for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
         int[] var34 = var9[(int)(var23 >>> 32)];
         if (container == null || var34[2] != container) {
            var8.add(var34);
         }
      }

      int[] var32 = new int[]{0, -1, 1};
      var21 ^= ((long)var32.length ^ var21) & -1L >>> 32;
      var23 ^= (0L ^ var23) & -1L << 32;

      while ((int)(var23 >>> 32) < (int)var21) {
         var23 ^= ((long)var32[(int)(var23 >>> 32)] ^ var23) & -1L >>> 32;

         for (int[] var14 : var8) {
            long var15 = llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + var14[0], (int)var19, (int)(var21 >>> 32) + var14[1]);
            if (!g.liiiIIllIl(var15)) {
               long var17 = llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + var14[0], (int)var19 + (int)var23, (int)(var21 >>> 32) + var14[1]);
               if (g.IliIlllilIi(var17)) {
                  var7.add(new long[]{var17, (long)var14[2]});
               }
            }
         }

         var23 += 4294967296L;
      }

      if (!g.liiiIIllIl(llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32), (int)var19 + 1, (int)(var21 >>> 32)))) {
         var9 = lliiillill;
         var21 ^= ((long)var9.length ^ var21) & -1L >>> 32;

         for (long var48 = var23 ^ (0L ^ var23) & -1L << 32; (int)(var48 >>> 32) < (int)var21; var48 += 4294967296L) {
            int[] var35 = var9[(int)(var48 >>> 32)];
            long var36 = llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + var35[0], (int)var19 + 1, (int)(var21 >>> 32) + var35[1]);
            if (g.IliIlllilIi(var36)) {
               var25 ^= (0L ^ var25) & -1L << 32;

               for (long[] var37 : var7) {
                  if (var37[0] == var36) {
                     var25 ^= (4294967296L ^ var25) & -1L << 32;
                     break;
                  }
               }

               if ((int)(var25 >>> 32) == 0) {
                  var7.add(new long[]{var36, 1L});
               }
            }
         }
      }

      for (long var49 = var25 ^ ~var25 & -1L >>> 32; (int)var49 <= 1; var49 ^= (var49 ^ var49 + (long)2) & -1L >>> 32) {
         for (var21 ^= ~var21 & -1L >>> 32; (int)var21 <= 1; var21 ^= (var21 ^ var21 + (long)2) & -1L >>> 32) {
            long var11 = llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + (int)var49, (int)var19, (int)(var21 >>> 32) + (int)var21);
            if (g.IliIlllilIi(var11)) {
               var27 ^= ((long)((int)var49 < 0 ? 4 : 5) << 32 ^ var27) & -1L << 32;
               var27 ^= ((long)((int)var21 < 0 ? 2 : 3) ^ var27) & -1L >>> 32;
               var49 ^= (
                     (long)(!g.liiiIIllIl(llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + (int)var49, (int)var19, (int)(var21 >>> 32))) ? 1 : 0) << 32
                        ^ var49
                  )
                  & -1L << 32;
               var29 ^= (
                     (long)(!g.liiiIIllIl(llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32) + (int)var21)) ? 1 : 0) << 32
                        ^ var29
                  )
                  & -1L << 32;
               if ((int)(var49 >>> 32) != 0) {
                  var7.add(new long[]{var11, (long)((int)(var27 >>> 32))});
               } else if ((int)(var29 >>> 32) != 0) {
                  var7.add(new long[]{var11, (long)((int)var27)});
               }
            }
         }
      }

      return var7;
   }

   public static boolean IliIlllilIi(boolean chestLike, boolean aboveSolid) {
      return !chestLike || !aboveSolid;
   }

   public liiIIilliiiIIill(long container, long stand, int interactionFace, double hitX, double hitY, double hitZ, String routeProof, String screenType) {
      this.illiillill = container;
      this.Iiliillill = stand;
      this.liliillill = interactionFace;
      this.iiliillill = hitX;
      this.IIiiillill = hitY;
      this.lIiiillill = hitZ;
      this.iIiiillill = routeProof;
      this.Iliiillill = screenType;
   }

   public double IIlllIlliIll() {
      return this.IIiiillill;
   }
}
