package gg.corz;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_2828.class_2831;

public class Ilillllill extends ilIllIiIll {
   private final iiIiiilIIliiil illlIIiIillIIi;
   private final IIIIlilllIIIlill lIllIIiiIllIIi = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","0IOPJ0qrNEuE+iZs8q0+t/GllNlUO+Rt5Bgt+wX0cSwz">(),
      IliIlllilIi<"IliIlllilIi","ft7Jb/EIO5GZTKHPJjZyLcXsEgVtrGp3LFb0KsYhXxZs1K/Z4z5IOg/4jm0mFdsZhxp4i8UmBhyp">(),
      4.0,
      1.0,
      6.0,
      0.1
   );
   private final iiIiiilIIliiil IIilIIilIilIIi;
   private class_1657 llilIIiililIIi;
   private final iiIiiilIIliiil lillIIiiillIIi;
   private final IIIIlilllIIIlill iIilIIiIlilIIi;
   private final iilliIlIIiliIl IlllIIillllIIi = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","DgANfKXpw0FW+bvIlzd4DgX6jljvNNwqUYgq7Qec6v61B+VfSON0">(),
      IliIlllilIi<"IliIlllilIi","o7Z95L9wF5v7qi7xFPLH1mZXikhGrmyfO7G3ZNY096gpNqaKrZvOA4sG/LArKnYWX5pNkT4dyS6hUs2PbQ==">(),
      4,
      1,
      8
   );

   @Override
   protected void Iilililiiili() {
      this.llilIIiililIIi = null;
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.IIilIIilIilIIi.Iilllilliill()) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
            if (this.llilIIiililIIi != null && !this.llilIIiililIIi.method_29504() && !this.llilIIiililIIi.method_31481()) {
               List var2 = this.lIIlliIIll(this.llilIIiililIIi);
               if (!var2.isEmpty()) {
                  class_4184 var3 = Iiiilllliiilll.method_1561().field_4686;
                  if (var3 != null) {
                     class_243 var4 = var3.method_71156();
                     int var5 = IlIIilIlllIIilIl.lliiIlliIl;
                     int var6 = var5 >> 16 & 0xFF;
                     int var7 = var5 >> 8 & 0xFF;
                     int var8 = var5 & 0xFF;
                     Color var9 = new Color(var6, var7, var8, 220);

                     for (class_243 var11 : var2) {
                        float var12 = 0.12F;
                        llilllililll.Illillliilli(
                           event.IliiiIIilliiiIIi,
                           (float)(var11.field_1352 - (double)var12 - var4.field_1352),
                           (float)(var11.field_1351 - (double)var12 - var4.field_1351),
                           (float)(var11.field_1350 - (double)var12 - var4.field_1350),
                           (float)(var11.field_1352 + (double)var12 - var4.field_1352),
                           (float)(var11.field_1351 + (double)var12 - var4.field_1351),
                           (float)(var11.field_1350 + (double)var12 - var4.field_1350),
                           var9
                        );
                        float var13 = var12 + 0.01F;
                        class_238 var14 = new class_238(
                           var11.field_1352 - (double)var13,
                           var11.field_1351 - (double)var13,
                           var11.field_1350 - (double)var13,
                           var11.field_1352 + (double)var13,
                           var11.field_1351 + (double)var13,
                           var11.field_1350 + (double)var13
                        );
                        iiIlIillIIllIill.iiiIlIIIll(event.IliiiIIilliiiIIi, var14, -1, 2.0);
                     }

                     iIiiIIilIliiIIil.IiIiliIiiiIi();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.llilIIiililIIi = null;
   }

   private List<class_243> lIIlliIIll(class_1657 target) {
      ArrayList var2 = new ArrayList();
      float var3 = Iiiilllliiilll.method_61966().method_60637(true);
      double var4 = class_3532.method_16436((double)var3, target.field_6014, target.method_23317());
      double var6 = class_3532.method_16436((double)var3, target.field_6036, target.method_23318());
      double var8 = class_3532.method_16436((double)var3, target.field_5969, target.method_23321());
      class_2338 var10 = target.method_24515();
      double var11 = (double)target.method_17681() / 2.0;
      int[][] var13 = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}, {1, -1}, {-1, -1}, {1, 1}, {-1, 1}};

      for (int var14 = 0; var14 <= 1; var14++) {
         for (int[] var18 : var13) {
            class_2338 var19 = var10.method_10069(var18[0], var14, var18[1]);
            class_2680 var20 = Iiiilllliiilll.field_1687.method_8320(var19);
            if (var20.method_45474() || var20.method_26215()) {
               double var21 = var4 + (var18[0] != 0 ? (double)Math.signum((float)var18[0]) * var11 : 0.0);
               double var23 = var6 + (double)var14 + 0.5;
               double var25 = var8 + (var18[1] != 0 ? (double)Math.signum((float)var18[1]) * var11 : 0.0);
               var2.add(new class_243(var21, var23, var25));
            }
         }
      }

      class_2338 var27 = var10.method_10086(2);
      if (Iiiilllliiilll.field_1687.method_8320(var27).method_45474() || Iiiilllliiilll.field_1687.method_8320(var27).method_26215()) {
         var2.add(new class_243(var4, var6 + (double)target.method_17682(), var8));
      }

      return var2;
   }

   public double iiiIlIIIll() {
      return this.iIilIIiIlilIIi.Iilllilliill();
   }

   public Ilillllill() {
      super(IliIlllilIi<"IliIlllilIi","QKzs0HCO3NLmegX76pkGNuVgW0huBCPf1nEhkfYf/UyNavSb">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.illlIIiIillIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","pp2Y4iA/08h7FHBYdeM4KZC9p4OcOLnTEBm/uyIGijGcHrGtYw==">(),
         IliIlllilIi<"IliIlllilIi","TpKPh4k2xplDHqf9w1VZlw6sg7TNsgrDOk/BxudW2sBzDYnsRodNblvvM5uUb1h1MplhKIx0LUPxHIQ8g5u6urdx">(),
         true
      );
      this.lillIIiiillIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","YX8pfazxcXrFZ4jAFFd1m+dRAidg2OaUEeqxLn0Jh66Dqw==">(),
         IliIlllilIi<"IliIlllilIi","/foxr3C0VsIUeNQII6OHPNUYD54IBk0GMN3ni2JMg694R5uzTeeyGCNn6kZqvgp2y9eSVzim7cVcDvC/5w==">(),
         true
      );
      this.IIilIIilIilIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","+IAXL+FWEbQqCRAIZk4U/G7VjznzUgnroyuqDoDfRWbfv4jw3SQ=">(),
         IliIlllilIi<"IliIlllilIi","wfec/DIrOHpDHb2pXlhLntMHflvdIJx6u4dm1nGCnmphCcp+2QhKKIC99BzVj6zY15ipnw1ws4V2G8LsUqCwjBPGT/UlNis6soSZdQ==">(),
         true
      );
      this.iIilIIiIlilIIi = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","U6Cgc+CnK72Fptf4kSI+Hc6Vx0DMztNNYYoT/RWtIMmXkR700uHxAHI=">(),
         IliIlllilIi<"IliIlllilIi","QNkrqQR6YjxWl8TcQWA6N/RGCnzg9FhDVoyfj+V/3mOyOE5vTimRfg+QxX820yYIN4kPPFW1aC7dnh0bXhAF+QJDyTIF/DMqzYSBpiRzDD94">(),
         0.08,
         0.0,
         0.2,
         0.01
      );
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.lIllIIiiIllIIi, this.IlllIIillllIIi, this.illlIIiIillIIi, this.lillIIiiillIIi, this.IIilIIilIilIIi, this.iIilIIiIlilIIi}
      );
   }

   private int iIlllIllll() {
      for (int var1 = 0; var1 < 9; var1++) {
         class_1799 var2 = Iiiilllliiilll.field_1724.method_31548().method_5438(var1);
         if (var2.method_7909() instanceof class_1747 var3 && var3.method_7711() == class_2246.field_10540) {
            return var1;
         }
      }

      return -1;
   }

   private boolean liIlliiIll(class_2338 pos) {
      for (class_2350 var5 : class_2350.values()) {
         class_2338 var6 = pos.method_10093(var5);
         if (!Iiiilllliiilll.field_1687.method_8320(var6).method_26215() && !Iiiilllliiilll.field_1687.method_8320(var6).method_45474()) {
            class_2350 var7 = var5.method_10153();
            class_243 var8 = class_243.method_24953(var6)
               .method_1031((double)var7.method_10148() * 0.5, (double)var7.method_10164() * 0.5, (double)var7.method_10165() * 0.5);
            if (this.lillIIiiillIIi.Iilllilliill()) {
               float[] var9 = this.IIllllIlll(var8);
               Iiiilllliiilll.field_1724
                  .field_3944
                  .method_52787(new class_2831(var9[0], var9[1], Iiiilllliiilll.field_1724.method_24828(), Iiiilllliiilll.field_1724.field_5976));
            }

            class_3965 var10 = new class_3965(var8, var7, var6, false);
            Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var10);
            return true;
         }
      }

      return false;
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.llilIIiililIIi = this.IlIllllIll();
         if (this.llilIIiililIIi != null) {
            int var1 = this.iIlllIllll();
            if (var1 != -1) {
               List var2 = this.ilIllIiIll(this.llilIIiililIIi);
               var2.removeIf(pos -> !Iiiilllliiilll.field_1687.method_8320(pos).method_45474());
               int var3 = Iiiilllliiilll.field_1724.method_31548().method_67532();
               Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
               int var4 = 0;

               for (class_2338 var6 : var2) {
                  if (var4 >= this.IlllIIillllIIi.Iilllilliill()) {
                     break;
                  }

                  if (this.liIlliiIll(var6)) {
                     var4++;
                  }
               }

               Iiiilllliiilll.field_1724.method_31548().method_61496(var3);
            }
         }
      }
   }

   private float[] IIllllIlll(class_243 target) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      double var3 = target.field_1352 - var2.field_1352;
      double var5 = target.field_1351 - var2.field_1351;
      double var7 = target.field_1350 - var2.field_1350;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      return new float[]{var11, var12};
   }

   private class_1657 IlIllllIll() {
      double var1 = this.lIllIIiiIllIIi.Iilllilliill();
      class_1657 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (class_1657 var7 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var7 != Iiiilllliiilll.field_1724 && !var7.method_7325() && !var7.method_29504() && !iIIiIiIlIlIiIiIl.liiiIIllIl(var7)) {
            double var8 = (double)Iiiilllliiilll.field_1724.method_5739(var7);
            if (var8 <= var1 && var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   private List<class_2338> ilIllIiIll(class_1657 target) {
      class_2338 var2 = target.method_24515();
      ArrayList var3 = new ArrayList();
      var3.add(var2.method_10095());
      var3.add(var2.method_10072());
      var3.add(var2.method_10078());
      var3.add(var2.method_10067());
      class_2338 var4 = var2.method_10084();
      var3.add(var4.method_10095());
      var3.add(var4.method_10072());
      var3.add(var4.method_10078());
      var3.add(var4.method_10067());
      if (this.illlIIiIillIIi.Iilllilliill()) {
         var3.add(var2.method_10086(2).method_10095());
         var3.add(var2.method_10086(2));
      }

      return var3;
   }
}
