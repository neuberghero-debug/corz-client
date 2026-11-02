package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1309;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_2338.class_2339;

final class IilllIIililllIIi {
   private final double ililiiliil;
   private final Map<Long, class_3965> illiiiliil = new HashMap<>();
   private final class_1309 IIiliiliil;
   private final class_746 lilliiliil;
   private final boolean lliliiliil;
   private final class_2338 liIiiiliil;
   private final ilIiliilIiIiliil iiiliiliil;
   private final iliiIiiIiiiIii Iilliiliil;
   private double iiliiiliil = -Double.MAX_VALUE;
   private final double llliiiliil;
   private final float llIiiiliil;
   private final class_243 IIliiiliil;
   private final IilIlIIllilIlIIl lIIiiiliil;
   private final lIiillIiiIiillIi liiliiliil;
   private final class_243 lIiliiliil;
   private final double Illiiiliil;
   private final iiIllIlIIlllIl IlIiiiliil;
   private final iIIlIIiIlIlIIi Iiiliiliil;
   private Iiilllliilll liliiiliil;
   private final double lIliiiliil;
   private final class_243 iIiliiliil;
   private int Iiliiiliil;
   private final int iIliiiliil;
   private final boolean iiIiiiliil;
   private final class_638 iilliiliil;
   private final class_2338 IiIiiiliil;
   private final float ilIiiiliil;
   private final IilIlIIllilIlIIl IIIiiiliil;
   private final boolean Ililiiliil;
   private final iiIllIlIIlllIl iIIiiiliil;

   private boolean Iilililiiili(class_2338 anchorCell, class_2338 obstacle, class_238 q) {
      long var24 = -4264213467623683063L;
      long var26 = 71816812040518981L;
      long var28 = 1144702460977426862L;
      double var4 = this.ililiiliil * this.ililiiliil;
      class_2350[] var6 = iliIiillIiiIiill.lIiIIiiill;
      var24 ^= ((long)var6.length << 32 ^ var24) & -1L << 32;

      for (long var31 = var24 ^ (0L ^ var24) & -1L >>> 32; (int)var31 < (int)(var31 >>> 32); var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
         class_2350 var9 = var6[(int)var31];
         class_2338 var10 = anchorCell.method_10093(var9);
         if (!var10.equals(obstacle) && !lliiIliliiIl.lIiiIiIlilli(var10)) {
            class_2350 var11 = var9.method_10153();
            if (iliIiillIiiIiill.Iliilliiilii(this.lIiliiliil, var10, var11) && lllIliIlillIliIl.Iilllilliill(var10, var11)) {
               double[] var12 = iliIiillIiiIiill.iIiIIiiill;
               var26 ^= ((long)var12.length << 32 ^ var26) & -1L << 32;

               for (var26 ^= (0L ^ var26) & -1L >>> 32; (int)var26 < (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
                  double var15 = var12[(int)var26];
                  double[] var17 = iliIiillIiiIiill.iIiIIiiill;
                  var28 ^= ((long)var17.length << 32 ^ var28) & -1L << 32;

                  for (var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 < (int)(var28 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
                     double var20 = var17[(int)var28];
                     class_243 var22 = iliIiillIiiIiill.Iiiiliiiiiii(var10, var11, var15, var20);
                     if (!(this.lIiliiliil.method_1025(var22) > var4) && !q.method_992(this.lIiliiliil, var22).isPresent()) {
                        float[] var23 = ilIiiIiIii.Ililllililil(this.lIiliiliil, var22);
                        if (lllIliIlillIliIl.IIiilIiiiIii(
                              lllIliIlillIliIl.Iilililiiili(this.lIiliiliil, var23[0], var23[1]), var10, var11, this.lIiliiliil, this.ililiiliil
                           )
                           != null) {
                           return true;
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private static boolean IIIilIIiiIIi(class_2338 feet, class_2338 cell) {
      return feet.equals(cell) || feet.equals(cell.method_10084()) || feet.equals(cell.method_10074());
   }

   private double IIillIiliIil(class_2338 cell) {
      class_243 var2 = this.Iiiliiliil.IliIlllilIi();
      class_243 var3 = class_243.method_24953(cell);
      class_243 var4 = new class_243(var2.field_1352, var2.field_1351 + (double)this.lilliiliil.method_5751(), var2.field_1350);
      return ilIiliilIiIiliil.IIiilIiiiIii(var4.field_1351 - var3.field_1351, var4.method_1022(var3));
   }

   void liiiIIllIl(class_2338 cell) {
      Iiilllliilll var2 = this.IilliliilIIi(cell, false);
      if (var2 != null) {
         double var3 = var2.IIillIiliIil() + this.iIlIlllllill(cell);
         if (var3 > this.iiliiiliil) {
            this.liliiiliil = var2;
            this.iiliiiliil = var3;
         }
      }
   }

   private boolean IIiilIiiiIii(class_2338 q) {
      class_238 var2 = lllIliIlillIliIl.lIiiIiIlilli(q);
      return !var2.method_994(this.Iilliiliil.liiiIIllIl().liiiIIllIl())
         && !var2.method_994(this.Iiiliiliil.liiiIIllIl())
         && !IIIilIIiiIIi(q, this.IiIiiiliil)
         && !iliilliIiiilli.Iiilliiliiil(q, this.iIliiiliil);
   }

   private class_3965 IlIillIiilIi(class_2338 cell, class_2338 exclude) {
      long var3 = cell.method_10063();
      class_3965 var5;
      if (this.illiiiliil.containsKey(var3)) {
         var5 = this.illiiiliil.get(var3);
      } else {
         var5 = this.IiIiliIiiiIi(cell, null);
         this.illiiiliil.put(var3, var5);
      }

      return var5 != null && exclude != null && var5.method_17777().equals(exclude) ? this.IiIiliIiiiIi(cell, exclude) : var5;
   }

   List<class_2338> IliIlllilIi() {
      long var16 = 5244170882428980568L;
      long var18 = 6167028700731442421L;
      long var20 = -3411983713171349881L;
      long var14 = -8844936405228611574L;
      class_243 var1 = this.Iilliiliil.liiiIIllIl().IliIlllilIi();
      ArrayList var2 = new ArrayList();
      var14 ^= ((long)((int)Math.ceil(this.ililiiliil)) << 32 ^ var14) & -1L << 32;
      class_2338 var4 = class_2338.method_49638(this.lIiliiliil);
      class_2339 var5 = new class_2339();

      for (long var27 = var14 ^ ((long)(-((int)(var14 >>> 32))) ^ var14) & -1L >>> 32;
         (int)var27 <= (int)(var27 >>> 32);
         var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32
      ) {
         var16 ^= ((long)(-((int)(var27 >>> 32))) << 32 ^ var16) & -1L << 32;

         while ((int)(var16 >>> 32) <= (int)(var27 >>> 32)) {
            for (var16 ^= ((long)(-((int)(var27 >>> 32))) ^ var16) & -1L >>> 32;
               (int)var16 <= (int)(var27 >>> 32);
               var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32
            ) {
               var5.method_10103(var4.method_10263() + (int)var27, var4.method_10264() + (int)(var16 >>> 32), var4.method_10260() + (int)var16);
               if (this.iilliiliil.method_8320(var5).method_27852(class_2246.field_23152)) {
                  class_2338 var9 = var5.method_10062();
                  if (!(lllIliIlillIliIl.IIlilIliiIli(this.lIiliiliil, lllIliIlillIliIl.lIiiIiIlilli(var9)) > this.ililiiliil)
                     && !(var1.method_1022(class_243.method_24953(var9)) > 10.0)) {
                     var2.add(var9);
                  }
               }
            }

            var16 += 4294967296L;
         }
      }

      var2.sort(Comparator.comparingDouble(feetT -> var1.method_1025(class_243.method_24953(feetT))));
      ArrayList var6 = new ArrayList(var2);
      class_2338 var7 = class_2338.method_49638(var1);
      IIIIllIIIl(var6, var7.method_10086(2));
      class_2350[] var8 = iliIiillIiiIiill.IIiIIiiill;
      var18 ^= ((long)var8.length << 32 ^ var18) & -1L << 32;

      for (var18 ^= (0L ^ var18) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
         class_2350 var11 = var8[(int)var18];
         IIIIllIIIl(var6, var7.method_10093(var11));
         IIIIllIIIl(var6, var7.method_10084().method_10093(var11));
      }

      IIIIllIIIl(var6, var7.method_10084().method_10069(1, 0, 1));
      IIIIllIIIl(var6, var7.method_10084().method_10069(1, 0, -1));
      IIIIllIIIl(var6, var7.method_10084().method_10069(-1, 0, 1));
      IIIIllIIIl(var6, var7.method_10084().method_10069(-1, 0, -1));
      int[][] var22 = iliIiillIiiIiill.IliIIiiill;
      var18 ^= ((long)var22.length << 32 ^ var18) & -1L << 32;

      for (var18 ^= (0L ^ var18) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
         int[] var24 = var22[(int)var18];
         IIIIllIIIl(var6, var7.method_10069(var24[0], 0, var24[1]));
      }

      var16 ^= ((long)Integer.signum(var4.method_10263() - var7.method_10263()) ^ var16) & -1L >>> 32;
      var18 ^= ((long)Integer.signum(var4.method_10260() - var7.method_10260()) << 32 ^ var18) & -1L << 32;
      if ((int)var16 != 0 || (int)(var18 >>> 32) != 0) {
         int[][] var10 = iliIiillIiiIiill.lliIIiiill;
         var20 ^= ((long)var10.length << 32 ^ var20) & -1L << 32;

         for (var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            int[] var13 = var10[(int)var20];
            IIIIllIIIl(var6, var7.method_10069(var13[0] * (int)var16, 0, var13[1] * (int)(var18 >>> 32)));
         }

         var10 = iliIiillIiiIiill.lliIIiiill;
         var20 ^= ((long)var10.length << 32 ^ var20) & -1L << 32;

         for (long var38 = var20 ^ (0L ^ var20) & -1L >>> 32; (int)var38 < (int)(var38 >>> 32); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
            int[] var25 = var10[(int)var38];
            IIIIllIIIl(var6, var7.method_10084().method_10069(var25[0] * (int)var16, 0, var25[1] * (int)(var18 >>> 32)));
         }
      }

      return var6;
   }

   IilllIIililllIIi(iliiIiiIiiiIii r, class_746 player, class_638 world) {
      this.Iilliiliil = r;
      this.lilliiliil = player;
      this.iilliiliil = world;
      this.IIiliiliil = r.IliIlllilIi();
      this.lIiliiliil = player.method_33571();
      this.Ililiiliil = !player.method_24828() && !player.method_5799();
      this.iIiliiliil = iliIiillIiiIiill.IIillIiliIil(this.lIiliiliil, player.method_18798(), !this.Ililiiliil);
      this.lliliiliil = player.field_6235 >= 7;
      this.ililiiliil = lliiIliliiIl.liiiIIllIl();
      this.Iiiliiliil = r.iIlIlllllill() != null ? r.iIlIlllllill() : new iIIlIIiIlIlIIi(player.method_73189(), player.method_5829());
      this.liiliiliil = r.Ililllililil() != null ? r.Ililllililil() : lIiillIiiIiillIi.lllllIlIIi;
      this.iiiliiliil = this.liiliiliil.lIilliIill();
      this.IIIiiiliil = r.IlIlllIlilIl() != null ? r.IlIlllIlilIl() : IilIlIIllilIlIIl.IIIIlillIl;
      this.lIIiiiliil = r.IiIlliIliiIl() != null ? r.IiIlliIliiIl() : IilIlIIllilIlIIl.IIIIlillIl;
      this.iIIiiiliil = lllIliIlillIliIl.iiiIlIIIll(this.IIiliiliil);
      this.IlIiiiliil = lllIliIlillIliIl.iiiIlIIIll(player);
      this.llIiiiliil = Float.isNaN(r.IIlllIlliIll()) ? this.IIiliiliil.method_6032() + this.IIiliiliil.method_6067() : r.IIlllIlliIll();
      this.ilIiiiliil = player.method_6032() + player.method_6067();
      this.IiIiiiliil = player.method_24515();
      this.liIiiiliil = class_2338.method_49638(this.Iiiliiliil.IliIlllilIi());
      this.iiIiiiliil = iliIiillIiiIiill.iliIiiliiiii(this.Iiiliiliil.IliIlllilIi().field_1351, r.liiiIIllIl().IliIlllilIi().field_1351);
      this.IIliiiliil = r.IlIillIiilIi();
      this.lIliiiliil = this.IIliiiliil != null ? 6.0 : 3.0;
      this.iIliiiliil = iliilliIiiilli.IIillIiliIil();
      class_243 var4 = this.IIiliiliil.method_73189();
      this.Illiiiliil = var4.field_1352 - this.IIiliiliil.field_6014;
      this.llliiiliil = var4.field_1350 - this.IIiliiliil.field_5969;
   }

   private float[] IiIlliIliiIl(class_2338 anchorCell, class_2338 target, class_243 centre) {
      long var19 = 1859918903616121366L;
      class_243 var4 = class_243.method_24953(anchorCell).method_1020(centre);
      double var5 = var4.method_1033();
      if (var5 < 1.0E-6) {
         return new float[0];
      } else {
         double var7 = var4.field_1352 / var5;
         double var9 = var4.field_1351 / var5;
         double var11 = var4.field_1350 / var5;
         var19 ^= ((long)Math.min(24, (int)Math.ceil(var5 / 0.3) + 2) << 32 ^ var19) & -1L << 32;
         float[] var14 = new float[(int)(var19 >>> 32)];
         class_2339 var15 = new class_2339();

         for (long var22 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            double var17 = (double)((int)var22) * 0.3;
            var15.method_10103(
               (int)Math.floor(centre.field_1352 + var7 * var17),
               (int)Math.floor(centre.field_1351 + var9 * var17),
               (int)Math.floor(centre.field_1350 + var11 * var17)
            );
            if (var15.equals(anchorCell)) {
               var14[(int)var22] = this.IIlllIlliIll(var15);
               return Arrays.copyOf(var14, (int)var22 + 1);
            }

            var14[(int)var22] = var15.equals(target) ? Float.NaN : this.IIlllIlliIll(var15);
         }

         return new float[0];
      }
   }

   private static void IIIIllIIIl(List<class_2338> cell, class_2338 out) {
      if (!cell.contains(out)) {
         cell.add(out);
      }
   }

   private int lIiiIiIlilli(class_2338 cell) {
      long var17 = 3150710516265005142L;
      long var19 = 5865060133413567305L;
      long var13 = 1570273000047191103L;
      long var15 = -3209396494552765645L;
      class_243 var2 = this.Iilliiliil.liiiIIllIl().IliIlllilIi();
      class_243 var3 = class_243.method_24953(cell);
      var13 ^= ((long)((int)Math.floor(var2.field_1351 + 0.001)) << 32 ^ var13) & -1L << 32;
      var13 ^= (0L ^ var13) & -1L >>> 32;
      var15 ^= (-8589934592L ^ var15) & -1L << 32;

      while ((int)(var15 >>> 32) <= 2) {
         for (var15 ^= (-2L ^ var15) & -1L >>> 32; (int)var15 <= 2; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            long var25 = var17 ^ ((long)(cell.method_10263() + (int)(var15 >>> 32)) << 32 ^ var17) & -1L << 32;
            var17 = var25 ^ ((long)(cell.method_10260() + (int)var15) ^ var25) & -1L >>> 32;
            double var10 = Math.hypot((double)((int)(var17 >>> 32)) + 0.5 - var2.field_1352, (double)((int)var17) + 0.5 - var2.field_1350);
            if (!(var10 < 2.0)
               && !(var10 > 3.2)
               && (
                  this.IIliiiliil == null
                     || !(
                        ((double)((int)(var17 >>> 32)) + 0.5 - var2.field_1352) * this.IIliiiliil.field_1352
                              + ((double)((int)var17) + 0.5 - var2.field_1350) * this.IIliiiliil.field_1350
                           < 0.0
                     )
               )) {
               for (var19 ^= (4294967296L ^ var19) & -1L << 32; (int)(var19 >>> 32) <= 2; var19 += 4294967296L) {
                  if (this.iliIiiliiiii(new class_2338((int)(var17 >>> 32), (int)(var13 >>> 32) - (int)(var19 >>> 32), (int)var17), cell, var3)) {
                     var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32;
                     break;
                  }
               }
            }
         }

         var15 += 4294967296L;
      }

      return (int)var13;
   }

   private boolean Ililllililil(class_2338 cell) {
      if (!lliiIliliiIl.lIiiIiIlilli(cell)) {
         return false;
      } else if (!this.iilliiliil.method_8628(class_2246.field_23152.method_9564(), cell, class_3726.method_16194())) {
         return false;
      } else {
         class_238 var2 = lllIliIlillIliIl.lIiiIiIlilli(cell);
         return !var2.method_994(this.Iilliiliil.liiiIIllIl().liiiIIllIl()) && !var2.method_994(this.Iiiliiliil.liiiIIllIl())
            ? !IIIilIIiiIIi(cell, this.IiIiiiliil) && !IIIilIIiiIIi(cell, this.liIiiiliil) && !iliilliIiiilli.Iiilliiliiil(cell, this.iIliiiliil)
            : false;
      }
   }

   private double iIlIlllllill(class_2338 cell) {
      class_243 var2 = this.Iilliiliil.liiiIIllIl().IliIlllilIi();
      return iliIiillIiiIiill.Iiilliiliiil(
         var2.field_1352,
         var2.field_1350,
         (int)Math.floor(var2.field_1351 + 0.001),
         cell.method_10263(),
         cell.method_10264(),
         cell.method_10260(),
         this.Illiiiliil,
         this.llliiiliil
      );
   }

   private boolean Iiilliiliiil(class_2338 cell) {
      long var6 = -1007375374125315425L;
      if (lllIliIlillIliIl.IIlilIliiIli(this.lIiliiliil, lllIliIlillIliIl.lIiiIiIlilli(cell)) > this.ililiiliil) {
         return false;
      } else {
         class_2350[] var2 = iliIiillIiiIiill.lIiIIiiill;
         var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

         for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            class_2350 var5 = var2[(int)var9];
            if (!lliiIliliiIl.lIiiIiIlilli(cell.method_10093(var5))) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean Iliilliiilii(class_2338 cell, class_2338 cover) {
      return iliIiillIiiIiill.IIiilIiiiIii(
         this.lIiliiliil, this.ililiiliil, cell, cover, this.IIiliiliil.method_5829(), this.Iilliiliil.liiiIIllIl().liiiIIllIl()
      );
   }

   private float IIlllIlliIll(class_2338 p) {
      class_2680 var2 = this.iilliiliil.method_8320(p);
      return var2.method_26215() && var2.method_26227().method_15769()
         ? Float.NaN
         : Math.max(var2.method_26204().method_9520(), var2.method_26227().method_15760());
   }

   private boolean Illlllllilll(class_2338 cell, boolean first, class_3965 existing) {
      if (this.iIiliiliil != null && existing != null) {
         if (this.iIiliiliil.method_1025(existing.method_17784()) > this.ililiiliil * this.ililiiliil) {
            return false;
         } else {
            class_3965 var4 = first
               ? lllIliIlillIliIl.Iliilliiilii(
                  cell, iliIiillIiiIiill.lIiIIiiill, null, this.iIiliiliil, this.Iilliiliil.IilliliilIIi(), this.Iilliiliil.lIiiIiIlilli(), this.ililiiliil
               )
               : lllIliIlillIliIl.Iliilliiilii(
                  existing.method_17777(),
                  new class_2350[]{existing.method_17780()},
                  existing.method_17780(),
                  this.iIiliiliil,
                  this.Iilliiliil.IilliliilIIi(),
                  this.Iilliiliil.lIiiIiIlilli(),
                  this.ililiiliil
               );
            return var4 != null;
         }
      } else {
         return true;
      }
   }

   Iiilllliilll IilliliilIIi(class_2338 forced, boolean cell) {
      long var18 = -7722002972128960009L;
      long var20 = -3865826044647698283L;
      long var22 = -7055803058909800492L;
      var18 ^= ((long)lliiIliliiIl.IilliliilIIi(forced) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)((int)(var18 >>> 32) >= 0 ? 1 : 0) ^ var18) & -1L >>> 32;
      class_243 var5 = class_243.method_24953(forced);
      double var6 = this.Iilliiliil.liiiIIllIl().IliIlllilIi().method_1022(var5);
      if (var6 > 10.0) {
         return null;
      } else if ((int)var18 != 0 || this.Ililllililil(forced) && this.Iiilliiliiil(forced)) {
         if (this.Iilliiliil.Iiilliiliiil() != null && this.Iilliiliil.Iiilliiliiil().test(var5)) {
            return null;
         } else {
            var20 ^= ((long)((int)var18 != 0 ? (int)(var18 >>> 32) : 0) << 32 ^ var20) & -1L << 32;
            var20 ^= ((long)((int)(var20 >>> 32) <= 0 ? 1 : 0) ^ var20) & -1L >>> 32;
            if (this.Iilliiliil.IIillIiliIil() < (int)var20) {
               return null;
            } else {
               float var10 = iiIiiliIIliili.lIiiIiIlilli(lllIliIlillIliIl.ilIllIiIll(this.IIiliiliil, var6, 5.0F), this.iIIiiiliil);
               if (var10 <= 0.0F) {
                  return null;
               } else {
                  if (!cell) {
                     if (this.liliiiliil != null
                        && (double)(this.liiliiliil.Iliilliiilii() * var10 + this.liiliiliil.iIIIlIlIIl() + this.liiliiliil.llIIlilIIl())
                              + (this.iiIiiiliil ? this.lIliiiliil : 0.0)
                              + (double)this.iiiliiliil.Iiiiliiiiiii()
                              + this.iIlIlllllill(forced)
                           <= this.iiliiiliil) {
                        return null;
                     }

                     this.Iiliiiliil++;
                  }

                  class_3965 var11 = (int)var18 != 0
                     ? lllIliIlillIliIl.Iliilliiilii(
                        forced,
                        iliIiillIiiIiill.lIiIIiiill,
                        null,
                        this.lIiliiliil,
                        this.Iilliiliil.IilliliilIIi(),
                        this.Iilliiliil.lIiiIiIlilli(),
                        this.ililiiliil
                     )
                     : this.IlIillIiilIi(forced, null);
                  if (var11 == null) {
                     return null;
                  } else if ((int)var18 == 0 && !this.Iliilliiilii(forced, null)) {
                     return null;
                  } else {
                     var22 ^= ((long)this.Illlllllilll(forced, (boolean)((int)var18), var11) << 32 ^ var22) & -1L << 32;
                     if (!cell && iliIiillIiiIiill.Ililllililil((boolean)((int)(var22 >>> 32)), (int)var18 == 0, this.Ililiiliil, this.lliliiliil)) {
                        return null;
                     } else {
                        iIIIiIlIlIIiIl var13 = this.Iilllilliill(forced, (int)var18 == 0, (int)(var20 >>> 32), null, var11, (boolean)((int)(var22 >>> 32)));
                        if (var13 != null
                           && !iliIiillIiiIiill.Iilililiiili(cell, (int)var18 == 0, var13.IliIlllilIi().IIlllIlliIll(), var13.IliIlllilIi().Ililllililil())) {
                           Iiilllliilll var14 = var13.liiiIIllIl() ? var13.IliIlllilIi() : null;
                           var22 ^= (
                                 (long)(
                                       this.iiiliiliil.iIIIlIlIIl()
                                          ? iliIiillIiiIiill.liiiIIllIl(
                                             this.Iilliiliil.Iilllilliill(),
                                             this.Iilliiliil.IIillIiliIil(),
                                             (int)var20,
                                             var13.liiiIIllIl(),
                                             var13.IliIlllilIi().IlIlllIlilIl()
                                          )
                                          : iliIiillIiiIiill.IliIlllilIi(
                                             this.Iilliiliil.Iilllilliill(),
                                             this.Iilliiliil.IIillIiliIil(),
                                             (int)var20,
                                             var13.liiiIIllIl(),
                                             var13.IliIlllilIi().IlIlllIlilIl(),
                                             var13.IliIlllilIi().Illlllllilll(),
                                             this.IIIiiiliil.liiiIIllIl()
                                          )
                                    )
                                    ^ var22
                              )
                              & -1L >>> 32;
                           if (this.iiiliiliil.iIIIlIlIIl()) {
                              var22 ^= ((long)((int)var22 & (var13.liiiIIllIl() && !var13.IliIlllilIi().IiIlliIliiIl() ? 0 : 1)) ^ var22) & -1L >>> 32;
                           }

                           if ((int)var22 != 0) {
                              class_2338 var16 = this.IIlilIliiIli(forced, (int)var18 == 0);
                              if (var16 != null && this.Iliilliiilii(forced, var16)) {
                                 iIIIiIlIlIIiIl var17 = this.Iilllilliill(
                                    forced, (int)var18 == 0, (int)(var20 >>> 32), var16, var11, (boolean)((int)(var22 >>> 32))
                                 );
                                 if (var17 != null
                                    && (
                                       !this.iiiliiliil.iIIIlIlIIl()
                                          || var14 == null
                                          || !var17.IliIlllilIi().IiIlliIliiIl() && (!var14.IIlllIlliIll() || var17.IliIlllilIi().IIlllIlliIll())
                                    )
                                    && var17.liiiIIllIl()
                                    && (
                                       var14 == null
                                          || var17.IliIlllilIi().IIillIiliIil() > var14.IIillIiliIil()
                                          || iliIiillIiiIiill.iIlIlllllill(this.iiiliiliil, var14, var17.IliIlllilIi(), this.llIiiiliil)
                                    )) {
                                    var14 = var17.IliIlllilIi();
                                 }
                              }
                           }

                           return var14 != null && this.iiIiiiliil ? iliIiillIiiIiill.Illlllllilll(var14, this.lIiiIiIlilli(forced), this.lIliiiliil) : var14;
                        } else {
                           return null;
                        }
                     }
                  }
               }
            }
         }
      } else {
         return null;
      }
   }

   private class_3965 IiIiliIiiiIi(class_2338 cell, class_2338 exclude) {
      long var16 = 1010703288720415229L;
      class_3965 var3 = null;
      double var4 = Double.MAX_VALUE;
      class_2350[] var6 = iliIiillIiiIiill.lIiIIiiill;
      var16 ^= ((long)var6.length << 32 ^ var16) & -1L << 32;

      for (long var19 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var19 < (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         class_2350 var9 = var6[(int)var19];
         class_2338 var10 = cell.method_10093(var9);
         if (!var10.equals(exclude) && !lliiIliliiIl.lIiiIiIlilli(var10)) {
            class_2350 var11 = var9.method_10153();
            if (lllIliIlillIliIl.Iilllilliill(var10, var11)) {
               class_3965 var12 = lllIliIlillIliIl.Iliilliiilii(
                  var10, new class_2350[]{var11}, var11, this.lIiliiliil, this.Iilliiliil.IilliliilIIi(), this.Iilliiliil.lIiiIiIlilli(), this.ililiiliil
               );
               if (var12 != null && this.Iiiiliiiiiii(var12.method_17784())) {
                  float[] var13 = ilIiiIiIii.Ililllililil(this.lIiliiliil, var12.method_17784());
                  double var14 = liiIIliliiiIIlil.Iilllilliill(this.Iilliiliil.IilliliilIIi(), this.Iilliiliil.lIiiIiIlilli(), var13[0], var13[1]);
                  if (var14 < var4) {
                     var4 = var14;
                     var3 = var12;
                  }
               }
            }
         }
      }

      return var3;
   }

   private class_2338 IIlilIliiIli(class_2338 cell, boolean placeAnchor) {
      lIIliiiliIIliiil var3 = lliiIliliiIl.IlIlllIlilIl(
         cell,
         this.Iiiliiliil.liiiIIllIl(),
         cellx -> this.IIiilIiiiIii(cellx) && this.Illillliilli(cellx, cell, placeAnchor),
         class_2246.field_10171.method_9564()
      );
      return var3.IliIlllilIi() && !var3.liiiIIllIl() ? lliiIliliiIl.IIIllIIliIIl(cell, var3.iIlIlllllill()) : null;
   }

   private boolean Iiiiliiiiiii(class_243 p) {
      return this.IIiliiliil.method_5829().method_992(this.lIiliiliil, p).isEmpty()
         && this.Iilliiliil.liiiIIllIl().liiiIIllIl().method_992(this.lIiliiliil, p).isEmpty();
   }

   private boolean IIIllIIliIIl(class_2338 p) {
      class_2680 var2 = this.iilliiliil.method_8320(p);
      return var2.method_26220(this.iilliiliil, p).method_1110() && var2.method_26227().method_15769();
   }

   private boolean iliIiiliiiii(class_2338 feet, class_2338 anchorCell, class_243 centre) {
      long var8 = 3679670872873369160L;
      class_2338 var4 = feet.method_10084();
      var8 ^= ((long)this.IIIllIIliIIl(feet) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(!this.IIIllIIliIIl(var4) && !var4.equals(anchorCell) ? 0 : 1) ^ var8) & -1L >>> 32;
      if ((int)(var8 >>> 32) != 0 && (int)var8 != 0) {
         return false;
      } else if ((int)(var8 >>> 32) == 0 && !this.IlIlllIlilIl(feet, anchorCell, centre)) {
         return false;
      } else if ((int)var8 == 0 && !this.IlIlllIlilIl(var4, anchorCell, centre)) {
         return false;
      } else {
         class_2338 var7 = feet.method_10074();
         return !this.iilliiliil.method_8320(var7).method_26206(this.iilliiliil, var7, class_2350.field_11036)
            ? false
            : !this.IlIlllIlilIl(var7, anchorCell, centre);
      }
   }

   private iIIIiIlIlIIiIl Iilllilliill(class_2338 steady, boolean place, int charges, class_2338 first, class_3965 cover, boolean cell) {
      long var32 = -6007015834674792321L;
      long var34 = -8053291098110727852L;
      long var36 = -3627705643510835870L;
      long var38 = 4888626397768733595L;
      long var40 = 7421956507920593264L;
      var32 ^= ((long)((place ? 1 : 0) + (first != null ? 1 : 0) + (charges <= 0 ? 1 : 0) + 1) << 32 ^ var32) & -1L << 32;
      class_243 var8 = class_243.method_24953(steady);
      double var9 = this.Iilliiliil.liiiIIllIl().IliIlllilIi().method_1022(var8);
      var32 ^= (
            (long)(
                  place
                        && Math.abs(steady.method_10263() - this.IiIiiiliil.method_10263()) <= 3
                        && Math.abs(steady.method_10260() - this.IiIiiiliil.method_10260()) <= 3
                        && steady.method_10264() <= this.IiIiiiliil.method_10264()
                        && steady.method_10264() >= this.IiIiiiliil.method_10264() - 1
                        && var9 <= 4.0
                     ? 1
                     : 0
               )
               ^ var32
         )
         & -1L >>> 32;
      if ((int)var32 != 0 && first != null) {
         return null;
      } else {
         var34 ^= ((long)((int)var32 != 0 && iliIiillIiiIiill.IIIilIIiiIIi(var9, this.Iiiliiliil.IliIlllilIi().method_1022(var8)) ? 1 : 0) << 32 ^ var34)
            & -1L << 32;
         float[] var13 = ilIiiIiIii.Ililllililil(this.lIiliiliil, cover.method_17784());
         double var14 = liiIIliliiiIIlil.Iilllilliill(this.Iilliiliil.IilliliilIIi(), this.Iilliiliil.lIiiIiIlilli(), var13[0], var13[1]);
         var34 ^= ((long)iliIiillIiiIiill.IIlilIliiIli(place, first != null, charges, var14) ^ var34) & -1L >>> 32;
         var36 ^= ((long)(iliIiillIiiIiill.IilliliilIIi((int)(var32 >>> 32)) + (int)var34) << 32 ^ var36) & -1L << 32;
         float var18 = IiliiIililiiIi.IliIlllilIi(this.IIiliiliil, this.Iilliiliil.liiiIIllIl(), steady, first);
         float var19 = this.iiiliiliil.iIIIlIlIIl()
            ? iiIiiliIIliili.iliIiiliiiii(var18, this.iIIiiiliil, this.IIIiiiliil, (int)(var36 >>> 32))
            : iiIiiliIIliili.IIIllIIliIIl(var18, this.iIIiiiliil, this.IIIiiiliil, (int)(var36 >>> 32));
         float var20 = this.iiiliiliil.iIIIlIlIIl() ? iiIiiliIIliili.iIlIlllllill(var18, this.iIIiiiliil, 5.0F) : 0.0F;
         if (var19 <= 0.0F && !this.iiiliiliil.Ililllililil(var19, var20, false)) {
            return null;
         } else {
            var36 ^= ((long)(var19 >= this.llIiiiliil ? 1 : 0) ^ var36) & -1L >>> 32;
            var38 ^= ((long)((int)var36 != 0 && !this.Iilliiliil.Illlllllilll() ? 1 : 0) << 32 ^ var38) & -1L << 32;
            float var23 = IiliiIililiiIi.liiiIIllIl(steady, first, null);
            if (this.Iilliiliil.iIlIlllllill() != null) {
               var23 = Math.max(var23, IiliiIililiiIi.liiiIIllIl(steady, first, this.Iilliiliil.iIlIlllllill()));
            }

            float var24 = iiIiiliIIliili.lIiiIiIlilli(var23, this.IlIiiiliil);
            float var25 = iiIiiliIIliili.iliIiiliiiii(var23, this.IlIiiiliil, this.lIIiiiliil, (int)(var36 >>> 32));
            if (this.iiiliiliil.iIIIlIlIIl()) {
               var20 = this.iiiliiliil.Iilililiiili(var20, iiIiiliIIliili.iIlIlllllill(var23, this.IlIiiiliil, 5.0F), this.IIillIiliIil(steady));
            }

            var38 ^= ((long)(var24 >= this.ilIiiiliil - 1.0F ? 1 : 0) ^ var38) & -1L >>> 32;
            float var27 = place ? var24 : this.iiiliiliil.IlIlllIlilIl(var24, var25);
            var40 ^= (
                  (long)(
                           this.iiiliiliil.iiIIlIIlIl()
                              ? this.iiiliiliil
                                 .lIiiIiIlilli(var27, this.ilIiiiliil, this.iiiliiliil.IIIllIIliIIl((boolean)((int)(var38 >>> 32)), (int)var36 != 0 && !place))
                              : (
                                 this.liiliiliil.iIlllIllll()
                                    ? (
                                       iiIiiliIIliili.IiIlliIliiIl(
                                                var19,
                                                var25,
                                                var24,
                                                (boolean)((int)var36),
                                                (boolean)((int)(var38 >>> 32)),
                                                this.Iilliiliil.IIIllIIliIIl(),
                                                this.liiliiliil.Iillllilll(),
                                                this.ilIiiiliil,
                                                this.liiliiliil.lllllillll()
                                             )
                                             && var25 <= this.Iilliiliil.iliIiiliiiii()
                                          ? 1
                                          : 0
                                    )
                                    : (
                                       ((int)var38 == 0 || this.Iilliiliil.IIIllIIliIIl() && (int)(var38 >>> 32) != 0)
                                             && var25 <= this.Iilliiliil.iliIiiliiiii()
                                          ? 1
                                          : 0
                                    )
                              )
                        )
                        << 32
                     ^ var40
               )
               & -1L << 32;
            if ((int)(var40 >>> 32) == 0 && this.iiiliiliil.IiIiliIiiiIi(var19, var20, (boolean)((int)var36), this.llIiiiliil, var24, var25, this.ilIiiiliil)) {
               var40 ^= (4294967296L ^ var40) & -1L << 32;
            }

            if ((int)(var40 >>> 32) != 0 && !this.iiiliiliil.IIlllIlliIll(var19, (boolean)((int)var36), var24, var27, false)) {
               var40 ^= (0L ^ var40) & -1L << 32;
            }

            if ((int)var32 != 0 && (int)var38 != 0) {
               var40 ^= (0L ^ var40) & -1L << 32;
            }

            double var29 = iliIiillIiiIiill.lIiiIiIlilli(
                  iiIiiliIIliili.Illlllllilll(var19, (boolean)((int)var36), (boolean)((int)(var38 >>> 32)), var25, var14, false, this.liiliiliil)
                     - (double)(1.0F * (float)((int)(var32 >>> 32) - 1)),
                  cell
               )
               + (double)this.iiiliiliil.Illillliilli(var20)
               - iliIiillIiiIiill.Illillliilli(place) * (double)((int)var34)
               - ((int)var32 == 0 || (int)(var34 >>> 32) != 0 && (int)var38 == 0 ? 0.0 : 1.0);
            Iiilllliilll var31 = new Iiilllliilll(
                  steady,
                  first,
                  place,
                  charges,
                  var19,
                  var25,
                  var24,
                  (boolean)((int)var38),
                  (boolean)((int)(var38 >>> 32)),
                  (int)(var32 >>> 32),
                  (int)(var36 >>> 32),
                  var29,
                  var14,
                  cell
               )
               .IliIlllilIi(var20);
            return new iIIIiIlIlIIiIl(var31, (boolean)((int)(var40 >>> 32)));
         }
      }
   }

   private boolean IlIlllIlilIl(class_2338 centre, class_2338 p, class_243 anchorCell) {
      return !this.iilliiliil.method_8320(centre).method_26227().method_15769()
         ? false
         : iliIiillIiiIiill.IiIlliIliiIl(this.IiIlliIliiIl(centre, p, anchorCell));
   }

   private boolean Illillliilli(class_2338 q, class_2338 anchorCell, boolean placeAnchor) {
      class_3965 var4 = this.IlIillIiilIi(q, anchorCell);
      if (var4 == null) {
         return false;
      } else if (!placeAnchor) {
         return true;
      } else {
         class_238 var5 = lllIliIlillIliIl.lIiiIiIlilli(anchorCell);
         return var5.method_992(this.lIiliiliil, var4.method_17784()).isEmpty() || this.Iilililiiili(q, anchorCell, var5);
      }
   }
}
