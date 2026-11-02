package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_742;

public class IIilIIIilIilIIIi extends ilIllIiIll {
   private final IIIIlilllIIIlill illllIliil;
   private final IliiiIIilliiiIIi llillIliil;
   private static final double llIllIliil = 16.0;
   private static final double IlIllIliil = 9216.0;
   private long iiIilIliil;
   private final iiIilIIiIIlilIIi IlillIliil;
   private static final int liiIlIliil = 16;
   private class_1657 IlIilIliil;
   private double ilIilIliil;
   private final iIIIilllIlIIilll IIillIliil;
   private final iliiliilIiiiliil iIlllIliil;
   private boolean llIilIliil;
   private final IIIIlilllIIIlill IilllIliil;
   private static final int lIIllIliil = 1600;
   private final iiIiiilIIliiil iilllIliil;
   private final lliliIIiililiIIi lIlllIliil;
   private final lliliIIiililiIIi IIlllIliil = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","ck8lci28GQ8Z1gA39kmBRUVF+xcBXwiMH/fnWPr27uo=">(),
      IliIlllilIi<"IliIlllilIi","qEaNtE2+r+eAvDHOAu250ie4dACdzeKfQ7cS0vSLnCmusMspvkJKOmqirqb+oGTNcWnc1AFGN/AUMC58G+JOFhxEantXUeXcgbovqd+geYR/bnchfgm1tATSnyBFdlkRlATXOYW2T2YKXqTTLLU85vEnu3fj40or35kFb+tGXvyXQQFTxMzMy6luDB3J8ZD9O1mOkqdfHI6wpmLAkx0ni6CSo2tXep4=">(),
      IliIlllilIi<"IliIlllilIi","pOsBddyfg+2Ca8kc1mqmm8MRKSPkAcQDczwa1XzS3RougQ==">(),
      IliIlllilIi<"IliIlllilIi","pOsBddyfg+2Ca8kc1mqmm8MRKSPkAcQDczwa1XzS3RougQ==">(),
      IliIlllilIi<"IliIlllilIi","MJD7k3cSo1xv237D05zb1NCW5L+6y44Zt9v7mss3fSA=">(),
      IliIlllilIi<"IliIlllilIi","nImDaW4xdHgLuTwuIij9CoxapX1eCI+4VRH5sqBiobg=">()
   );
   private static final double iiIllIliil = 64.0;
   private static final int IIIllIliil = 3200;
   private final ArrayList<iIIIilllIlIIilll> lIillIliil;
   private static final int iIIllIliil = 24;
   private final ArrayDeque<iIIIilllIlIIilll> iIillIliil;
   private static final float ilIllIliil = 20.0F;
   private class_638 iIIilIliil;
   private double IiIilIliil;
   private final iIIIilllIlIIilll[] iiillIliil;
   private final IIIIlilllIIIlill lllllIliil;
   private int lIIilIliil;
   private final liilIIliiiilIIli ilillIliil;
   private final IIIIlilllIIIlill IllllIliil;
   private final class_742[] IiillIliil;
   private static final float liIllIliil = 4.0F;
   private final double[] liillIliil;
   private static final int iiiIlIliil = 20;
   private static final long IiiIlIliil = System.nanoTime();
   private final boolean[] IIIilIliil;
   private double liIilIliil;
   private static final float IiIllIliil = 28.0F;
   private final iiIiiilIIliiil lilllIliil;

   private void liIlliiIll() {
      for (int var1 = 0; var1 < this.lIIilIliil; var1++) {
         iIIIilllIlIIilll var2 = this.IIllllIlll(this.IiillIliil[var1].method_5628());
         this.iiillIliil[var1] = var2;
         this.IIIilIliil[var1] = false;
         if (var2 != null) {
            this.IIIilIliil[var1] = var2.lIlIIIlill != this.iiIilIliil - 1L;
            var2.lIlIIIlill = this.iiIilIliil;
         }
      }

      for (int var3 = 0; var3 < this.lIIilIliil; var3++) {
         if (this.iiillIliil[var3] == null) {
            iIIIilllIlIIilll var4 = this.iIlllIllll();
            if (var4 != null) {
               var4.IilliliilIIi();
               var4.IIlIIIlill = this.IiillIliil[var3].method_5628();
               var4.lIlIIIlill = this.iiIilIliil;
               this.iiillIliil[var3] = var4;
            }
         }
      }
   }

   private iIIIilllIlIIilll IIllllIlll(int id) {
      for (int var2 = 0; var2 < this.lIillIliil.size(); var2++) {
         iIIIilllIlIIilll var3 = this.lIillIliil.get(var2);
         if (var3.IIlIIIlill == id) {
            return var3;
         }
      }

      return null;
   }

   private iIIIilllIlIIilll iIlllIllll() {
      if (this.lIillIliil.size() < 20) {
         iIIIilllIlIIilll var4 = this.iIillIliil.isEmpty() ? new iIIIilllIlIIilll() : this.iIillIliil.pop();
         this.lIillIliil.add(var4);
         return var4;
      } else {
         iIIIilllIlIIilll var1 = null;

         for (int var2 = 0; var2 < this.lIillIliil.size(); var2++) {
            iIIIilllIlIIilll var3 = this.lIillIliil.get(var2);
            if (var3.lIlIIIlill != this.iiIilIliil && (var1 == null || var3.lIlIIIlill < var1.lIlIIIlill)) {
               var1 = var3;
            }
         }

         return var1;
      }
   }

   private static void lllllillll(iIIIilllIlIIilll b, class_1297 td, float now, double len, double e) {
      double var7 = class_3532.method_16436((double)now, td.field_6014, td.method_23317());
      double var9 = class_3532.method_16436((double)now, td.field_6036, td.method_23318());
      double var11 = class_3532.method_16436((double)now, td.field_5969, td.method_23321());
      b.IiIlliIliiIl(len, var7, var9, var11, td.method_17682(), e);
   }

   private void IlIllllIll() {
      if (Iiiilllliiilll.field_1687 != this.iIIilIliil) {
         this.IIillIliil.IilliliilIIi();
         this.lIIlliIIll();
         this.llIilIliil = false;
         this.iIIilIliil = Iiiilllliiilll.field_1687;
      }

      if (Iiiilllliiilll.field_1724 != this.IlIilIliil) {
         this.IIillIliil.IilliliilIIi();
         this.llIilIliil = false;
         this.IlIilIliil = Iiiilllliiilll.field_1724;
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 == null && this.iIIilIliil != null) {
         this.iiiIlIIIll();
      }

      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.IlIllllIll();
         double var1 = Iiiilllliiilll.field_1724.method_23317();
         double var3 = Iiiilllliiilll.field_1724.method_23318();
         double var5 = Iiiilllliiilll.field_1724.method_23321();
         if (this.llIilIliil) {
            double var7 = var1 - this.ilIilIliil;
            double var9 = var3 - this.IiIilIliil;
            double var11 = var5 - this.liIilIliil;
            if (var7 * var7 + var9 * var9 + var11 * var11 > 64.0) {
               this.IIillIliil.lIiiIiIlilli();
            }
         }

         this.ilIilIliil = var1;
         this.IiIilIliil = var3;
         this.liIilIliil = var5;
         this.llIilIliil = true;
      }
   }

   private void lIIlliIIll() {
      for (int var1 = 0; var1 < this.lIillIliil.size(); var1++) {
         iIIIilllIlIIilll var2 = this.lIillIliil.get(var1);
         var2.IilliliilIIi();
         var2.IIlIIIlill = Integer.MIN_VALUE;
         this.iIillIliil.push(var2);
      }

      this.lIillIliil.clear();
   }

   private void ilIllIiIll() {
      this.lIIilIliil = 0;
      List var1 = Iiiilllliiilll.field_1687.method_18456();
      int var2 = 0;

      for (int var3 = var1.size(); var2 < var3; var2++) {
         class_742 var4 = (class_742)var1.get(var2);
         if (var4 != Iiiilllliiilll.field_1724 && !var4.method_7325() && !var4.method_5756(Iiiilllliiilll.field_1724)) {
            double var5 = var4.method_5858(Iiiilllliiilll.field_1724);
            if (!(var5 > 9216.0)) {
               int var7;
               if (this.lIIilIliil < 16) {
                  var7 = this.lIIilIliil++;
               } else {
                  if (var5 >= this.liillIliil[15]) {
                     continue;
                  }

                  var7 = 15;
               }

               while (var7 > 0 && this.liillIliil[var7 - 1] > var5) {
                  this.IiillIliil[var7] = this.IiillIliil[var7 - 1];
                  this.liillIliil[var7] = this.liillIliil[var7 - 1];
                  var7--;
               }

               this.IiillIliil[var7] = var4;
               this.liillIliil[var7] = var5;
            }
         }
      }
   }

   private void iiiIlIIIll() {
      this.IIillIliil.IilliliilIIi();
      this.lIIlliIIll();
      this.iIIilIliil = null;
      this.IlIilIliil = null;
      this.llIilIliil = false;
   }

   private void Iillllilll(double now) {
      IliiiIIilliiiIIi var10000 = this.llillIliil;
      String var3 = this.IIlllIliil.Iilllilliill();

      var10000.iiilliiiil = switch (var3) {
         case IliIlllilIi<"IliIlllilIi","MJD7k3cSo1xv237D05zb1NCW5L+6y44Zt9v7mss3fSA=">() -> IIIliIIilIIliIIi.iIIilliiil;
         case IliIlllilIi<"IliIlllilIi","nImDaW4xdHgLuTwuIij9CoxapX1eCI+4VRH5sqBiobg=">() -> IIIliIIilIIliIIi.IlIilliiil;
         default -> IIIliIIilIIliIIi.lIIilliiil;
      };
      var3 = this.lIlllIliil.Iilllilliill();
      this.llillIliil.IIIiliiiil = var3.equals(IliIlllilIi<"IliIlllilIi","ds4cYDXhNuc67m8SSKMFJclxaQGtcDXsT1jbmFbxsoVgyCk=">());
      if (var3.equals(IliIlllilIi<"IliIlllilIi","WuLXxoNaHbg1PCOynx0hx9ujGuZFovW9MQ+jU/BwolRYCg==">())) {
         int var6 = this.iIlllIliil.Iilllilliill();
         this.llillIliil.lIIiliiiil = var6 & 16777215;
         this.llillIliil.iIIiliiiil = (float)(var6 >>> 24 & 0xFF) / 255.0F;
      } else {
         this.llillIliil.lIIiliiiil = (
               var3.equals(IliIlllilIi<"IliIlllilIi","OgJZNCPNE2KBBiAWNvOM8JV6gI3HWk2E1xiZ5qSRtos+">())
                  ? IlIIilIlllIIilIl.lliiIlliIl
                  : this.iIlllIliil.Iilllilliill()
            )
            & 16777215;
         this.llillIliil.iIIiliiiil = 1.0F;
      }

      this.llillIliil.IlIiliiiil = this.IllllIliil.Iilllilliill();
      this.llillIliil.llIiliiiil = (float)this.lllllIliil.Iilllilliill();
      this.llillIliil.ilIiliiiil = (float)this.illllIliil.Iilllilliill();
      this.llillIliil.IiIiliiiil = (float)this.IilllIliil.Iilllilliill();
      this.llillIliil.liIiliiiil = now;
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.IlIllllIll();
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         if (var2 != null) {
            class_243 var3 = var2.method_71156();
            double var4 = (double)(System.nanoTime() - IiiIlIliil) / 1.0E9;
            double var6 = this.IllllIliil.Iilllilliill();
            float var8 = event.liiiiIIiiiiiiIIi;
            this.iiIilIliil++;
            this.Iillllilll(var4);
            this.ilillIliil.iIlIlllllill(event.IliiiIIilliiiIIi.method_23760().method_23761());
            lllllillll(this.IIillIliil, Iiiilllliiilll.field_1724, var8, var4, var6);
            this.IIillIliil.IIlllIlliIll(var4, var6);
            boolean var9 = this.lilllIliil.Iilllilliill()
               && Iiiilllliiilll.field_1690.method_31044().method_31034()
               && !lilIliIiiilIliIi.iiiIlIIIll()
               && !iIIlIllIlIlIll.IIIllIIliIIl();
            this.llillIliil.IliIlllilIi();
            if (!var9) {
               this.IlillIliil.IIIilIIiiIIi(this.IIillIliil, var4, var3.field_1352, var3.field_1351, var3.field_1350, this.llillIliil, this.ilillIliil);
            }

            if (this.iilllIliil.Iilllilliill()) {
               this.ilIllIiIll();
               this.liIlliiIll();

               for (int var10 = 0; var10 < this.lIIilIliil; var10++) {
                  iIIIilllIlIIilll var11 = this.iiillIliil[var10];
                  if (var11 != null) {
                     if (this.IIIilIliil[var10] && var11.iIlIlllllill()) {
                        var11.lIiiIiIlilli();
                     }

                     lllllillll(var11, this.IiillIliil[var10], var8, var4, var6);
                  }

                  this.IiillIliil[var10] = null;
                  this.iiillIliil[var10] = null;
               }

               int var23 = Math.max(1, this.lIillIliil.size());
               int var24 = class_3532.method_15340(3200 / var23, 64, this.IlillIliil.IliIlllilIi());
               int var12 = class_3532.method_15340(1600 / var23, 24, 400);

               for (int var13 = this.lIillIliil.size() - 1; var13 >= 0; var13--) {
                  iIIIilllIlIIilll var14 = this.lIillIliil.get(var13);
                  var14.IIlllIlliIll(var4, var6);
                  if (var14.lIlIIIlill != this.iiIilIliil && var14.Illlllllilll(var4, var6)) {
                     int var25 = this.lIillIliil.size() - 1;
                     this.lIillIliil.set(var13, this.lIillIliil.get(var25));
                     this.lIillIliil.remove(var25);
                     var14.IilliliilIIi();
                     var14.IIlIIIlill = Integer.MIN_VALUE;
                     this.iIillIliil.push(var14);
                  } else {
                     double var15 = var14.Iiiiliiiiiii() - var3.field_1352;
                     double var17 = var14.IIIIllIIIl() - var3.field_1351;
                     double var19 = var14.iIIIlIlIIl() - var3.field_1350;
                     double var21 = Math.sqrt(var15 * var15 + var17 * var17 + var19 * var19);
                     this.llillIliil.iiIiliiiil = (float)class_3532.method_15350(var21 / 16.0, 1.0, 4.0);
                     this.llillIliil.IIliliiiil = iiIilIIiIIlilIIi.IIIillIIil(20.0F, 28.0F, (float)var21);
                     this.llillIliil.lIliliiiil = var24;
                     this.llillIliil.iIliliiiil = var12;
                     this.IlillIliil.IIIilIIiiIIi(var14, var4, var3.field_1352, var3.field_1351, var3.field_1350, this.llillIliil, this.ilillIliil);
                  }
               }

               this.llillIliil.IliIlllilIi();
            } else if (!this.lIillIliil.isEmpty()) {
               this.lIIlliIIll();
            }

            this.ilillIliil.IilliliilIIi();
         }
      }
   }

   @Override
   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   public IIilIIIilIilIIIi() {
      super(IliIlllilIi<"IliIlllilIi","1rhnbMC+yX2LGdaI/apIqDpSPrjj6sVtZpnVi/Z7UzWA7A==">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.lIlllIliil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","6wMpw0ApOYaRNpi01CMOOlcmYoKxERsDdcinAp9paIinRxL/GHo=">(),
         IliIlllilIi<"IliIlllilIi","a8RyPm+1QNTba5oaw3VHkeKP0CBGQsrYPTDUZJ1O3xPkf0bYHIo3gciSJLVuJA+2YVcLu18XQkZDyIpfjLUQCVYkOGaKEXnEct/6C1dDYWMrUurgXC4m4+Sn67ymleq22FVCJyI27p1exTnuRUAWYuNibZ8h8aQTJJFXiHvm0w==">(),
         IliIlllilIi<"IliIlllilIi","OgJZNCPNE2KBBiAWNvOM8JV6gI3HWk2E1xiZ5qSRtos+">(),
         IliIlllilIi<"IliIlllilIi","WuLXxoNaHbg1PCOynx0hx9ujGuZFovW9MQ+jU/BwolRYCg==">(),
         IliIlllilIi<"IliIlllilIi","ds4cYDXhNuc67m8SSKMFJclxaQGtcDXsT1jbmFbxsoVgyCk=">(),
         IliIlllilIi<"IliIlllilIi","OgJZNCPNE2KBBiAWNvOM8JV6gI3HWk2E1xiZ5qSRtos+">()
      );
      this.iIlllIliil = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","HlBW4OdWxkrz33PH71DOVNXG7a2gJyS50U8Jbb+0ZZoJ">(),
         IliIlllilIi<"IliIlllilIi","fe5uqWp8dWvffZIVMt7zqOxT3PF07xHDPWaQSnI5sTuqOiI6CMLUByHtAT5B6hXo4ARlRHJW0fjQecp0yIpB1hJupQQ1LBzIhWpKvfSVvLrL3EG5">(),
         -5204993
      );
      this.IllllIliil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","GqER5OFPzInIdHQUuO7KlGxYKXseWgiiIxRJ9vs0an7jmQ==">(),
         IliIlllilIi<"IliIlllilIi","EgvSco2t1bCY+sB8BuPr5wbrvEcz538sjztlfgMn39+xuzqew+dm5RpYO0icE3IpFPT5UKwS8Je57oe7trsL5hjjnrDPKm9luGD1">(),
         1.5,
         0.3,
         5.0,
         0.1
      );
      this.lllllIliil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","xC6CHr5P7vX24vF/cnBoRFgIHay5Ud4J6kfkqnCOhG0K">(),
         IliIlllilIi<"IliIlllilIi","WJOkj23jiV+OHdF0nqJBNZILRQIlsNMIfdpZn9HB0Cr/MnrqXEGXSkebvcu4RHIiyhSUd2kgw0GkPFjWpAhHDctdV3AAyjhtWMzehdzWOy8j3HQU3g22tSmF">(),
         0.3,
         0.05,
         1.0,
         0.01
      );
      this.illllIliil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","x3Bvw+zMqzixigBRJuM6IreCA/OEPf2XAnf6l0UwlPIpQg==">(),
         IliIlllilIi<"IliIlllilIi","z7Mks9/zB5f0KMSUr/SY1/w3g7kXCMpysjWqV3SkPecmLqa0BQ3+Qy3sjpaG0A/Mb9VEKw7mKZP1XL1cmYJo4cj97CacvY4Xy2Dpn4Nw1CtdUvln+GFrNAMoEHZoCFtPgRq7lRgkuU4nlwdnkI2CJbKQ5tFS1LTQ13Z0KsjUVIHI">(),
         1.0,
         0.0,
         1.0,
         0.05
      );
      this.IilllIliil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","oZV82nz8yIP30dKdBF0uHEzDf/LZeyl4HbsSk8t3Q48=">(),
         IliIlllilIi<"IliIlllilIi","Pa7vm/k+BuiQTICrjqW6EHtIP8hn2xYUsSDtY491zPSk0VMW6lfzCfZ5h15W4/GPlGCUQ+jyIg4sdBx6soqzfkX6z4e8ASlohrVtGKM=">(),
         1.0,
         0.0,
         1.0,
         0.05
      );
      this.lilllIliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","9J1VPI6+LVfrf7Dx17df6OTaq4yNZzX+HCY1VG2oT+mvkX8y+bS5mvBTjIbf51d4">(),
         IliIlllilIi<"IliIlllilIi","J62g/tBeEgM2Ot/eqiel13aMUa7SSzXt/b3Kj7A/+vDYoYT7w6q6WeYAsEm1qX7TiSOgx3GvPuU+XHJ2RSJ85Jr2UWC8oMx6oLB9O/HVkMM5X468ggtvIBeipTIDMsF5HNWdx7BYsDY0Pg==">(),
         true
      );
      this.iilllIliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","syH8s70DPpxhXtMQ25oOjG3vARkP+2i2JPy4ucG5/FeQ+Q==">(),
         IliIlllilIi<"IliIlllilIi","Ppk3gyLaqAE4zHDrRCL6A5OYttZvLfin2KiOrruuhBW3JN6lYbvZvbBHxtWt3Sp7Ere/LWSet+l0fCyzpdT64zU=">(),
         false
      );
      this.IIillIliil = new iIIIilllIlIIilll();
      this.lIillIliil = new ArrayList<>(16);
      this.iIillIliil = new ArrayDeque<>();
      this.IlillIliil = new iiIilIIiIIlilIIi();
      this.llillIliil = new IliiiIIilliiiIIi();
      this.ilillIliil = new liilIIliiiilIIli();
      this.IiillIliil = new class_742[16];
      this.liillIliil = new double[16];
      this.iiillIliil = new iIIIilllIlIIilll[16];
      this.IIIilIliil = new boolean[16];
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IIlllIliil,
            this.lIlllIliil,
            this.iIlllIliil,
            this.IllllIliil,
            this.lllllIliil,
            this.illllIliil,
            this.IilllIliil,
            this.lilllIliil,
            this.iilllIliil
         }
      );
   }

   @Override
   protected void Illillliilli() {
      this.iiiIlIIIll();
   }
}
