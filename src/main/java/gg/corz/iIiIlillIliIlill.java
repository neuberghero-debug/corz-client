package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class iIiIlillIliIlill extends ilIllIiIll {
   private float iIIlIIiill;
   private static volatile float iiiIIIiill;
   private final IilIIilllilIIill IiIlIIiill;
   private float lIIlIIiill;
   private boolean ilIlIIiill;
   private final iiIiiilIIliiil IliIIIiill;
   private final iiIiiilIIliiil IIiIIIiill;
   private final iiIiiilIIliiil iliIIIiill;
   private static volatile float liiIIIiill;
   private final IIIIlilllIIIlill IilIIIiill = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","UNgYNRDgQ9iVpY52o+btUxbWO3piplLcf2dbZqmUBF5i">(),
      IliIlllilIi<"IliIlllilIi","ONb4IOzDKTxe2iGTj4DLGf3WROhmOxCa4zMW1MGqf13VLosMb9k16yeOuEQWWl9MLH87qg==">(),
      4.5,
      2.0,
      6.0,
      0.1
   );
   private static volatile boolean IiiIIIiill;
   private static volatile class_1657 IIIlIIiill;
   private final IIIIlilllIIIlill lilIIIiill = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","AsA4uXKfSzvIFxS+uEpVzaAalj25ptrJ6uKOqjotFg==">(),
      IliIlllilIi<"IliIlllilIi","nb8JP7KXl+kWj8RrNiR/16Mm4lkRKdwHV9qCURs7UpySvv0dEQ3DexojP2Eb+stpMWRekbJixCzw0icTUBlY+RzxiKB4ekcSIjVjLX4=">(),
      90.0,
      10.0,
      180.0,
      1.0
   );
   private final lliliIIiililiIIi iIiIIIiill;
   private final lliliIIiililiIIi iilIIIiill = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","M4NPuT6zXKNzlRb+VBmY4uq+iFI7vnoHXcYD+w6p81qURVfqeg==">(),
      IliIlllilIi<"IliIlllilIi","D/Tmvb3Tv1UBY8lzYfYYuFi047Tbuc/D1UVmD+B776ARr4fcZ3HefcgxpUAPs3MCeF7X/ul5">(),
      IliIlllilIi<"IliIlllilIi","z4YJPadlRdfTNQF/+ji0GXCOGfAffEiUn9WX1J7kDL8=">(),
      IliIlllilIi<"IliIlllilIi","MzAyoFjbhwLDQVy6OXmC7a5BvDcGGI6bTMqU5ziAC/0=">(),
      IliIlllilIi<"IliIlllilIi","z4YJPadlRdfTNQF/+ji0GXCOGfAffEiUn9WX1J7kDL8=">(),
      IliIlllilIi<"IliIlllilIi","28jYpStX796hOC26hcwRBm3nmPm7qm5q8ww5Y/pAo4g=">()
   );
   private final lliliIIiililiIIi lIiIIIiill;
   private float llIlIIiill;
   private final iiIiiilIIliiil lliIIIiill;
   private float IlIlIIiill;

   public iIiIlillIliIlill() {
      super(IliIlllilIi<"IliIlllilIi","cgUhbkHlQhw+fhcLDI56yP+ueY0eKZKk30H5F0o3FI/zwzZMzvI=">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IIiIIIiill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","bpJ0LHHDMn8Pct9jB4Dcm8VqnA8vY/BtP4y/+XMwSHcG8F4u6ToRq1sKiFY=">(),
         IliIlllilIi<"IliIlllilIi","ifWQkiX0EN+FDzmvDxPrYIt76ZXTegIYBo7jKQZKSppO+SxMgn5ytdPgWUAJCllkKkr1m0+Ic1swJRM=">(),
         true
      );
      this.lIiIIIiill = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","/+n56l0J+zwnDdIJ6K0cgsKiiU+DcI2oZhfaJ89kw8Bbt/F63mg=">(),
         IliIlllilIi<"IliIlllilIi","tYrhxuDLnQ1FCS+/rPlFFqZRBDqr8sj33cDZ8ox7vGMXUFg1DNiS5H51NCOFAmFq">(),
         IliIlllilIi<"IliIlllilIi","YvaYTYB0eX7Wv0inbyWlagxbqoeLury8LnBau/4LQesilw==">(),
         IliIlllilIi<"IliIlllilIi","YvaYTYB0eX7Wv0inbyWlagxbqoeLury8LnBau/4LQesilw==">(),
         IliIlllilIi<"IliIlllilIi","FBsKi7qWRjxkKzcse6D/1d7DNnby8Kt2QbKCis8zHuTBZ5gj">()
      );
      this.iIiIIIiill = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","ezKLF9wpP1ZBIvhRTHNafYmBTkVuKcC+yBdG4qI/aNXf4AE2">(),
         IliIlllilIi<"IliIlllilIi","his0jQmS8zkWVbvrx3ysuRJ7sPafpQ3DyUwu+OaEfuGCukuBoI++kIcbmbdzxQlMXd0=">(),
         IliIlllilIi<"IliIlllilIi","rqIHarppT1FzfJjAX06A311cQEL4hP7fcxV9gbQoH9Sei8eA49nC">(),
         IliIlllilIi<"IliIlllilIi","rqIHarppT1FzfJjAX06A311cQEL4hP7fcxV9gbQoH9Sei8eA49nC">(),
         IliIlllilIi<"IliIlllilIi","28jYpStX796hOC26hcwRBm3nmPm7qm5q8ww5Y/pAo4g=">(),
         IliIlllilIi<"IliIlllilIi","pVMX+ycuqxQ4Wlo+5yAg4VXWtVhiKgfB99j5dSzHAbVkEw==">(),
         IliIlllilIi<"IliIlllilIi","zoTOLnOXTW0doZK7S3Vry6rL2hV9zD+bs4yODyH0vsjNMiVQ">()
      );
      this.IliIIIiill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","qMkOz8/Bkm+OBGMa3Kwb0PfknVL8JrBzoJQy2trelFBPtXL1">(),
         IliIlllilIi<"IliIlllilIi","CVw7Jd8iYiWrcK8wwzbzKkUxYs/HkQ/tPQL/srySvZi16xbmOQkRX/TbUwDeO/8s9/UKujvXHg/3ISra/za+ZXU3WojQPzvcxGcd1WVf6Jbi8aPPM4fIdyaF5a2itSNi7U/YsfhvkpMPX4bfIXtNF/5PM/sWzCU1kVUVIiH9XKyLoI96xUqDrRajSnzB42fbqdmIgIMxwKTWwIF4fEkgMhnPGyOtymEikEBG4fRYwcswzg==">(),
         true
      );
      this.lliIIIiill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","/+wDPrI/xx4yTrBxPiGx8K94j7JmtGhvZrKlRlKP9scgRNPil3yd">(),
         IliIlllilIi<"IliIlllilIi","KwaUpmvAS//BOiGfoWwDw8ljGHEUXHImLeCukNFdNXf2N4TEaUP9rn7NN5C6stxyBXJnsLPuvyKnQoOjOt9W2OZI7UROlOHZA8du7RyBAm9kid4fk2tebdSWHJa9RNVkwt9HlNsFE+5I8i8P/9BWeA+3zhyRv22zCu/oGrxntG39wobkECOM7IR5yMI=">(),
         true
      );
      this.iliIIIiill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","i4H6KKDh+KaIwwZHTnya415BC6uYVAMB4byVWSBfTSbW1GG0RwU=">(),
         IliIlllilIi<"IliIlllilIi","5Ts1GZmLz7BUwocM1FRvQdIW7kmFUlJT7LQh+DBybcQSg7HgsbTIOXk9W//Caplw5wvYqp/RQJww4BAW6KUKtbf9LLvayFPNHMIt8qC8P3QKA+sB9aJUBFGQgxIyb8dBp2yxWgmstWB2DSCnk47CiDtK3ACQaLG1GwwXfA==">(),
         true
      );
      this.IiIlIIiill = new IilIIilllilIIill();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IilIIIiill,
            this.lilIIIiill,
            this.iilIIIiill,
            this.IIiIIIiill,
            this.lIiIIIiill,
            this.iIiIIIiill,
            this.IliIIIiill,
            this.lliIIIiill,
            this.iliIIIiill
         }
      );
   }

   public static float Ilillllill() {
      return iiiIIIiill;
   }

   @Override
   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      if (this.ilIlIIiill) {
         float var2 = e.Illlllllilll();
         e.IlIlllIlilIl(class_3532.method_16439(var2, this.IlIlIIiill, this.lIIlIIiill));
         e.IIlllIlliIll(class_3532.method_16439(var2, this.llIlIIiill, this.iIIlIIiill));
         e.IIillIiliIil();
      }
   }

   private static boolean llIililIil(class_1297 target) {
      double var1 = Iiiilllliiilll.field_1724.method_55755();
      class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
      class_238 var4 = target.method_5829();
      double var5 = Math.max(var4.field_1323, Math.min(var3.field_1352, var4.field_1320));
      double var7 = Math.max(var4.field_1322, Math.min(var3.field_1351, var4.field_1325));
      double var9 = Math.max(var4.field_1321, Math.min(var3.field_1350, var4.field_1324));
      return var3.method_1028(var5, var7, var9) <= var1 * var1;
   }

   public static class_1657 IIIillIIil() {
      iIiIlillIliIlill var0 = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
      if (var0 != null && var0.IliIlllilIi() && var0.iliIIIiill.Iilllilliill()) {
         class_1657 var1 = IIIlIIiill;
         if (var1 == null || !var1.method_5805() || Iiiilllliiilll.field_1724 == null || Iiiilllliiilll.field_1761 == null) {
            return null;
         } else if (!llIililIil(var1)) {
            return null;
         } else if (Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() == class_240.field_1332) {
            return null;
         } else if (lIIIIIlliIIIIIll.lIiiIiIlilli()) {
            return null;
         } else {
            class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
            class_243 var3 = var2.method_1019(ilIiiIiIii.Iiilliiliiil(liiIIIiill, iiiIIIiill).method_1021(Iiiilllliiilll.field_1724.method_55755()));
            return var1.method_5829().method_992(var2, var3).isEmpty() ? null : var1;
         }
      } else {
         return null;
      }
   }

   private void IIllllIlll() {
      if (this.ilIlIIiill) {
         this.ilIlIIiill = false;
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724.method_36456(this.lIIlIIiill);
            Iiiilllliiilll.field_1724.method_36457(this.iIIlIIiill);
            Iiiilllliiilll.field_1724.field_5982 = this.lIIlIIiill;
            Iiiilllliiilll.field_1724.field_6004 = this.iIIlIIiill;
         }
      }
   }

   public static boolean iIIilIlIil(boolean humanPress) {
      class_1657 var1 = IIIillIIil();
      if (var1 == null) {
         return false;
      } else {
         if (humanPress) {
            lIIIIIlliIIIIIll.IilliliilIIi(var1);
         } else {
            if (!lIIIIIlliIIIIIll.liiiIIllIl(var1)) {
               return false;
            }

            if (!IIllIIlilIllIIli.Iilllilliill(llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class), var1)) {
               return true;
            }

            lIIIIIlliIIIIIll.iIlIlllllill();
         }

         Iiiilllliiilll.field_1761.method_2918(Iiiilllliiilll.field_1724, var1);
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         Iiiilllliiilll.field_1724.method_75203();
         return true;
      }
   }

   private class_243 ilIllIiIll(class_1657 p) {
      double var2 = p.method_23317();
      double var4 = p.method_23318();
      double var6 = p.method_23321();
      double var8 = (double)p.method_17682();
      String var10 = this.iilIIIiill.Iilllilliill();

      return switch (var10) {
         case IliIlllilIi<"IliIlllilIi","MzAyoFjbhwLDQVy6OXmC7a5BvDcGGI6bTMqU5ziAC/0=">() -> new class_243(var2, var4 + var8 - 0.1, var6);
         case IliIlllilIi<"IliIlllilIi","28jYpStX796hOC26hcwRBm3nmPm7qm5q8ww5Y/pAo4g=">() -> new class_243(var2, var4 + var8 * 0.5, var6);
         default -> new class_243(var2, var4 + var8 - 0.35, var6);
      };
   }

   @Override
   protected void Iilililiiili() {
      IiiIIIiill = false;
      IIIlIIiill = null;
      this.IiIlIIiill.IliIlllilIi();
      this.IIllllIlll();
   }

   public void lllllillll(double deltaPitch, double deltaYaw) {
      this.IlIlIIiill = this.lIIlIIiill;
      this.llIlIIiill = this.iIIlIIiill;
      this.lIIlIIiill += (float)(deltaPitch * 0.15);
      this.iIIlIIiill = class_3532.method_15363(this.iIIlIIiill + (float)(deltaYaw * 0.15), -90.0F, 90.0F);
   }

   private void liIlliiIll() {
      this.lIIlIIiill = this.IlIlIIiill = Iiiilllliiilll.field_1724.method_36454();
      this.iIIlIIiill = this.llIlIIiill = Iiiilllliiilll.field_1724.method_36455();
      this.ilIlIIiill = true;
   }

   public static boolean Iillllilll() {
      iIiIlillIliIlill var0 = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
      return var0 != null && var0.IliIlllilIi() && IiiIIIiill && var0.lliIIIiill.Iilllilliill();
   }

   public static float liilliiill() {
      iIiIlillIliIlill var0 = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
      if (var0 != null && var0.IliIlllilIi() && var0.ilIlIIiill) {
         return var0.iIIlIIiill;
      } else {
         return Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_36455() : 0.0F;
      }
   }

   private class_1657 IlIllllIll() {
      double var1 = this.lilIIIiill.Iilllilliill() / 2.0;
      class_1657 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (class_1657 var7 : iillIiIlIIilIiIl.IliIlllilIi(this.IilIIIiill.Iilllilliill())) {
         class_243 var8 = this.ilIllIiIll(var7);
         double var9 = iillIiIlIIilIiIl.lIiiIiIlilli(var8, this.lIIlIIiill, this.iIIlIIiill);
         if (!(var9 > var1) && (!this.IIiIIIiill.Iilllilliill() || iillIiIlIIilIiIl.iliIiiliiiii(var8)) && var9 < var4) {
            var4 = var9;
            var3 = var7;
         }
      }

      return var3;
   }

   private boolean lIIlliIIll() {
      return this.lIiIIIiill.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","YvaYTYB0eX7Wv0inbyWlagxbqoeLury8LnBau/4LQesilw==">())
         ? true
         : GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 0) == (1274144678 * -1 - 83 ^ -1274144762);
   }

   public boolean iIlllIllll() {
      return this.IliIlllilIi() && this.ilIlIIiill;
   }

   private boolean iiiIlIIIll() {
      if (IIllIIlilIllIIli.IIIilIIiiIIi()) {
         return true;
      } else {
         if (llilIllililIll.iliIiiliiiii(iIIliIiIlIliIi.class) instanceof iIIliIiIlIliIi var2 && var2.liIlliiIll()) {
            return true;
         }

         return false;
      }
   }

   public static boolean iilllIIill() {
      return IiiIIIiill;
   }

   @Override
   public void iIIIlIlIIl() {
      IiiIIIiill = false;
      IIIlIIiill = null;
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1755 == null) {
         if (!this.ilIlIIiill) {
            this.lIIlIIiill = Iiiilllliiilll.field_1724.method_36454();
            this.iIIlIIiill = Iiiilllliiilll.field_1724.method_36455();
         }

         if (this.iiiIlIIIll()) {
            this.IIllllIlll();
            this.IiIlIIiill.IliIlllilIi();
         } else if (!this.lIIlliIIll()) {
            this.IIllllIlll();
            this.IiIlIIiill.IliIlllilIi();
         } else {
            class_1657 var1 = this.IlIllllIll();
            if (var1 == null) {
               this.IIllllIlll();
               this.IiIlIIiill.IliIlllilIi();
            } else {
               IIIlIIiill = var1;
               class_243 var2 = this.ilIllIiIll(var1);
               float[] var3 = ilIiiIiIii.Ililllililil(Iiiilllliiilll.field_1724.method_33571(), var2);
               if (this.IliIIIiill.Iilllilliill()) {
                  var3 = this.IiIlIIiill.liiiIIllIl(var3[0], var3[1]);
               } else {
                  this.IiIlIIiill.IliIlllilIi();
               }

               liiIIIiill = var3[0];
               iiiIIIiill = var3[1];
               IiiIIIiill = true;
               String var4 = this.iIiIIIiill.Iilllilliill();
               if (var4.equals(IliIlllilIi<"IliIlllilIi","rqIHarppT1FzfJjAX06A311cQEL4hP7fcxV9gbQoH9Sei8eA49nC">())) {
                  if (!this.ilIlIIiill) {
                     this.liIlliiIll();
                  }

                  ilIiiIiIii.IliIlllilIi(this, liiIIIiill, iiiIIIiill, 50, false);
               } else {
                  this.IIllllIlll();
                  boolean var5 = !var4.equals(IliIlllilIi<"IliIlllilIi","28jYpStX796hOC26hcwRBm3nmPm7qm5q8ww5Y/pAo4g=">());
                  boolean var6 = var4.equals(IliIlllilIi<"IliIlllilIi","zoTOLnOXTW0doZK7S3Vry6rL2hV9zD+bs4yODyH0vsjNMiVQ">());
                  ilIiiIiIii.liiiIIllIl(this, liiIIIiill, iiiIIIiill, 50, var5, var6);
               }
            }
         }
      } else {
         this.IIllllIlll();
         this.IiIlIIiill.IliIlllilIi();
      }
   }

   public static float lIilliIill() {
      return liiIIIiill;
   }

   public static float ilillIiill() {
      iIiIlillIliIlill var0 = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
      if (var0 != null && var0.IliIlllilIi() && var0.ilIlIIiill) {
         return var0.lIIlIIiill;
      } else {
         return Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_36454() : 0.0F;
      }
   }
}
