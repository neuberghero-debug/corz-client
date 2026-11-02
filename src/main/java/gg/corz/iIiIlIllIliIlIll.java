package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_239.class_240;
import org.joml.Matrix4f;

public class iIiIlIllIliIlIll extends ilIllIiIll {
   private long lilIiillll;
   private final iiIiiilIIliiil Iliilillll = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","e1zrshoX7UKJszStOJ/IH37ZV7HpNJpbM6tk7LNddjJQdzzWXpRExg==">(),
      IliIlllilIi<"IliIlllilIi","P+lT8LlviPI64rYNti9OiZUHSCDobDU5Qz+UkiawrW1IgEv3e4VSgPDF/ffqlUdHtiAke/+ZVKFQmgUwtbCujmHkKTSi2nvqVTeaE/8AVtvW">(),
      true
   );
   private double ilIIiillll;
   private class_2338 IilIiillll;
   private final lliliIIiililiIIi Iiiilillll;
   private double iIlIiillll;
   private double llIIiillll;
   private double iIIIiillll;
   private static final float iililillll = 0.006F;
   private static final float iIiilillll = 0.45F;
   private double iiIIiillll;
   private static final float IIiilillll = 0.1F;
   private class_265 iiiilillll;
   private final iliiliilIiiiliil iliilillll;
   private double lIlIiillll;
   private double IIlIiillll;
   private double IlIIiillll;
   private float illIiillll;
   private final iliiliilIiiiliil lliilillll = new iliiliilIiiiliil(
      IliIlllilIi<"IliIlllilIi","srij3RYGwfFi4ZFVmE5HLHSH7n13GduFyT3Nfogt1af9p1Y=">(),
      IliIlllilIi<"IliIlllilIi","TOGNV4H3+HK2hNXjeJXyxjvhHQyDsJJrlbv3GtsyIS6CSgsvS5E1uopjyV8EHWpSv4Kh2cF7zGCLTi/39tLxMu5pwB3y">(),
      -922746881
   );
   private double lIIIiillll;
   private boolean IllIiillll;
   private double liIIiillll;
   private double IIIIiillll;
   private static final float lIiilillll = 0.19F;
   private boolean lllIiillll;
   private final IIIIlilllIIIlill liiilillll;
   private double IiIIiillll;
   private static final float lililillll = 1.5F;
   private float iilIiillll;

   private void ilIllIiIll(
      class_4588 v2z,
      Matrix4f v3z,
      float v3x,
      float sweepX,
      float maxA,
      float halfW,
      float v2y,
      float v1x,
      float v4z,
      float v1z,
      float v4y,
      float sizeX,
      float v2x,
      float v4x,
      float mat,
      float minX,
      float v3y,
      float v1y,
      float buf
   ) {
      int var20 = this.IIllllIlll(v1x, sweepX, maxA, halfW, v2y);
      int var21 = this.IIllllIlll(v4y, sweepX, maxA, halfW, v2y);
      int var22 = this.IIllllIlll(v4x, sweepX, maxA, halfW, v2y);
      int var23 = this.IIllllIlll(v3y, sweepX, maxA, halfW, v2y);
      if (var20 != 0 || var21 != 0 || var22 != 0 || var23 != 0) {
         v2z.method_22918(v3z, v1x, v4z, v1z).method_1336(255, 253, 248, var20);
         v2z.method_22918(v3z, v4y, sizeX, v2x).method_1336(255, 253, 248, var21);
         v2z.method_22918(v3z, v4x, mat, minX).method_1336(255, 253, 248, var22);
         v2z.method_22918(v3z, v3y, v1y, buf).method_1336(255, 253, 248, var23);
      }
   }

   @Override
   public void IIiilIiiiIii(illlllIillll event) {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_2338 var2 = null;
         if (Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() == class_240.field_1332) {
            var2 = ((class_3965)Iiiilllliiilll.field_1765).method_17777();
         }

         if (var2 == null) {
            this.lllIiillll = false;
         } else {
            this.lllIiillll = true;
            if (this.IilIiillll == null || !this.IilIiillll.equals(var2)) {
               this.IilIiillll = var2;
               class_2680 var3 = Iiiilllliiilll.field_1687.method_8320(var2);
               this.iiiilillll = var3.method_26218(Iiiilllliiilll.field_1687, var2);
               if (!this.iiiilillll.method_1110()) {
                  this.iiiIlIIIll(this.iiiilillll.method_1107().method_996(var2));
               }
            }
         }

         this.lIIlliIIll(event);
      }
   }

   private void lIIlliIIll(illlllIillll event) {
      if (this.IllIiillll && this.iiiilillll != null && !this.iiiilillll.method_1110() && this.IilIiillll != null) {
         long var2 = System.currentTimeMillis();
         float var4 = Math.min((float)(var2 - this.lilIiillll) / 1000.0F, 0.05F);
         this.lilIiillll = var2;
         if (this.lllIiillll) {
            this.illIiillll = Math.min(1.0F, this.illIiillll + var4 * 4.0F);
         } else {
            this.illIiillll = Math.max(0.0F, this.illIiillll - var4 * 5.0F);
            if (this.illIiillll <= 0.01F) {
               this.illIiillll = 0.0F;
               this.IllIiillll = false;
               return;
            }
         }

         this.iilIiillll += var4 * 0.1F;
         if (this.iilIiillll > 1.0F) {
            this.iilIiillll--;
         }

         float var5 = (float)this.liiilillll.Iilllilliill();
         float var6 = (float)(1.0 - Math.pow(0.001, (double)(var4 * var5) * 0.1));
         this.IIIIiillll = this.IIIIiillll + (this.IiIIiillll - this.IIIIiillll) * (double)var6;
         this.lIIIiillll = this.lIIIiillll + (this.liIIiillll - this.lIIIiillll) * (double)var6;
         this.iIIIiillll = this.iIIIiillll + (this.iiIIiillll - this.iIIIiillll) * (double)var6;
         this.IlIIiillll = this.IlIIiillll + (this.IIlIiillll - this.IlIIiillll) * (double)var6;
         this.llIIiillll = this.llIIiillll + (this.lIlIiillll - this.llIIiillll) * (double)var6;
         this.ilIIiillll = this.ilIIiillll + (this.iIlIiillll - this.ilIIiillll) * (double)var6;
         float var7 = lllllillll(this.illIiillll);
         double var8;
         double var10;
         double var12;
         double var14;
         double var16;
         double var18;
         if (this.Iiiilillll.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","ye+OQDC7Q9i+H35aUGrjZzPhjCbP0YrCI1Qr2zI1d+M=">())) {
            double var20 = (this.IIIIiillll + this.IlIIiillll) / 2.0;
            double var22 = (this.lIIIiillll + this.llIIiillll) / 2.0;
            double var24 = (this.iIIIiillll + this.ilIIiillll) / 2.0;
            double var26 = (this.IlIIiillll - this.IIIIiillll) / 2.0 * (double)var7;
            double var28 = (this.llIIiillll - this.lIIIiillll) / 2.0 * (double)var7;
            double var30 = (this.ilIIiillll - this.iIIIiillll) / 2.0 * (double)var7;
            var8 = var20 - var26 - 0.006F;
            var10 = var22 - var28 - 0.006F;
            var12 = var24 - var30 - 0.006F;
            var14 = var20 + var26 + 0.006F;
            var16 = var22 + var28 + 0.006F;
            var18 = var24 + var30 + 0.006F;
         } else {
            var8 = this.IIIIiillll - 0.006F;
            var10 = this.lIIIiillll - 0.006F;
            var12 = this.iIIIiillll - 0.006F;
            var14 = this.IlIIiillll + 0.006F;
            var16 = this.llIIiillll + 0.006F;
            var18 = this.ilIIiillll + 0.006F;
         }

         float var47 = this.Iiiilillll.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","ye+OQDC7Q9i+H35aUGrjZzPhjCbP0YrCI1Qr2zI1d+M=">())
            ? var7
            : Math.min(1.0F, this.illIiillll * 2.0F);
         int var21;
         int var48;
         if (this.Iliilillll.Iilllilliill()) {
            int var23 = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
            var21 = iIlllIllll(var23, (int)(200.0F * var47));
            var48 = iIlllIllll(var23, (int)(40.0F * var47));
         } else {
            var21 = iIillliIlillli.IlIillIiilIi(this.lliilillll.Iilllilliill(), var47);
            var48 = iIillliIlillli.IlIillIiilIi(this.iliilillll.Iilllilliill(), var47);
         }

         class_243 var49 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         class_4587 var50 = event.IliiiIIilliiiIIi;
         var50.method_22903();
         var50.method_22904(-var49.field_1352, -var49.field_1351, -var49.field_1350);
         Matrix4f var25 = var50.method_23760().method_23761();
         double var51 = this.IIlIiillll - this.IiIIiillll;
         double var52 = this.lIlIiillll - this.liIIiillll;
         double var53 = this.iIlIiillll - this.iiIIiillll;
         double var32 = (var8 + var14) / 2.0;
         double var34 = (var10 + var16) / 2.0;
         double var36 = (var12 + var18) / 2.0;
         double var38 = var51 > 0.0 ? (var14 - var8) / var51 : 1.0;
         double var40 = var52 > 0.0 ? (var16 - var10) / var52 : 1.0;
         double var42 = var53 > 0.0 ? (var18 - var12) / var53 : 1.0;
         int var44 = var48;
         int var45 = var21;
         this.iiiilillll
            .method_1089(
               (oocArgb, aMul, scaleZ, maxY, minX, focArgb) -> {
                  double var29 = oocArgb + (double)this.IilIiillll.method_10263();
                  double var31 = aMul + (double)this.IilIiillll.method_10264();
                  double var33 = scaleZ + (double)this.IilIiillll.method_10260();
                  double var35 = maxY + (double)this.IilIiillll.method_10263();
                  double var37 = minX + (double)this.IilIiillll.method_10264();
                  double var39 = focArgb + (double)this.IilIiillll.method_10260();
                  double var41 = (var29 + var35) / 2.0;
                  double var43 = (var31 + var37) / 2.0;
                  double var45x = (var33 + var39) / 2.0;
                  double var47x = (var41 - (this.IiIIiillll + this.IIlIiillll) / 2.0) * var38;
                  double var49x = (var43 - (this.liIIiillll + this.lIlIiillll) / 2.0) * var40;
                  double var51x = (var45x - (this.iiIIiillll + this.iIlIiillll) / 2.0) * var42;
                  double var53x = (var35 - var29) * var38;
                  double var55 = (var37 - var31) * var40;
                  double var57 = (var39 - var33) * var42;
                  double var59 = var32 + var47x - var53x / 2.0;
                  double var61 = var34 + var49x - var55 / 2.0;
                  double var63 = var36 + var51x - var57 / 2.0;
                  double var65 = var32 + var47x + var53x / 2.0;
                  double var67 = var34 + var49x + var55 / 2.0;
                  double var69 = var36 + var51x + var57 / 2.0;
                  iIiiIIilIliiIIil.IIlilIliiIli(
                     var25,
                     (float)var59,
                     (float)var61,
                     (float)var63,
                     (float)var65,
                     (float)var67,
                     (float)var69,
                     iIillliIlillli.IiIiliIiiiIi(var44),
                     iIillliIlillli.IIlilIliiIli(var44),
                     iIillliIlillli.Illillliilli(var44),
                     iIillliIlillli.Iilililiiili(var44)
                  );
                  if (var47 > 0.01F) {
                     this.IlIllllIll(var25, var59, var61, var63, var65, var67, var69, var47);
                  }

                  iIiiIIilIliiIIil.iIIIlIlIIl(var25, (float)var59, (float)var61, (float)var63, (float)var65, (float)var67, (float)var69, var45, 1.5F);
               }
            );
         var50.method_22909();
         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   private void IlIllllIll(Matrix4f y2, double y1, double z1, double m, double x2, double z2, double x1, float alphaMul) {
      class_4588 var15 = iIiiIIilIliiIIil.IilliliilIIi();
      float var16 = (float)y1;
      float var17 = (float)z1;
      float var18 = (float)m;
      float var19 = (float)x2;
      float var20 = (float)z2;
      float var21 = (float)x1;
      float var22 = var19 - var16;
      if (!(var22 < 0.001F)) {
         float var23 = this.iilIiillll * 2.0F;
         float var24 = var23 <= 1.0F ? Iillllilll(var23) : Iillllilll(2.0F - var23);
         float var25 = 0.095F;
         float var26 = 0.45F * alphaMul;
         float var27 = var16 - var25 * var22 + (var22 + 0.19F * var22) * var24;
         this.ilIllIiIll(var15, y2, var16, var22, var27, var25, var26, var16, var17, var18, var16, var20, var18, var19, var20, var18, var19, var17, var18);
         this.ilIllIiIll(var15, y2, var16, var22, var27, var25, var26, var16, var17, var21, var19, var17, var21, var19, var20, var21, var16, var20, var21);
         this.liIlliiIll(var15, y2, var27, var16, var25, var22, var26, var16, var17, var18, var16, var17, var21, var16, var20, var21, var16, var20, var18);
         this.liIlliiIll(var15, y2, var27, var19, var25, var22, var26, var19, var17, var18, var19, var20, var18, var19, var20, var21, var19, var17, var21);
         this.ilIllIiIll(var15, y2, var16, var22, var27, var25, var26, var16, var20, var18, var16, var20, var21, var19, var20, var21, var19, var20, var18);
         this.ilIllIiIll(var15, y2, var16, var22, var27, var25, var26, var16, var17, var18, var19, var17, var18, var19, var17, var21, var16, var17, var21);
      }
   }

   private static int iIlllIllll(int alpha, int rgb) {
      return Math.max(
               1,
               Math.min(
                  ((-1728354361 << 29 | -1728354361 >>> 3) - -67 - 51 >>> 19 | (-1728354361 << 29 | -1728354361 >>> 3) - -67 - 51 << 13) ^ -308207972, rgb
               )
            )
            << (634217666 * -65 + 49 ^ 1725524727)
         | alpha & ((-1173271219 << 15 | -1173271219 >>> 17) - -117 ^ -1504107902);
   }

   private static float lllllillll(float x) {
      float var1 = 1.70158F;
      float var2 = var1 + 1.0F;
      return 1.0F
         + var2 * (float)Math.pow((double)(x - 1.0F), Double.longBitsToDouble(6516862012574157222L ^ 1907427793960454566L))
         + var1 * (float)Math.pow((double)(x - 1.0F), Double.longBitsToDouble(-6104859514774589595L ^ -1493173496347201691L));
   }

   private void iiiIlIIIll(class_238 box) {
      this.IiIIiillll = box.field_1323;
      this.liIIiillll = box.field_1322;
      this.iiIIiillll = box.field_1321;
      this.IIlIiillll = box.field_1320;
      this.lIlIiillll = box.field_1325;
      this.iIlIiillll = box.field_1324;
      if (!this.IllIiillll) {
         String var2 = this.Iiiilillll.Iilllilliill();
         switch (var2) {
            case IliIlllilIi<"IliIlllilIi","ye+OQDC7Q9i+H35aUGrjZzPhjCbP0YrCI1Qr2zI1d+M=">():
               double var4 = (this.IiIIiillll + this.IIlIiillll) / 2.0;
               double var6 = (this.liIIiillll + this.lIlIiillll) / 2.0;
               double var8 = (this.iiIIiillll + this.iIlIiillll) / 2.0;
               this.IIIIiillll = var4;
               this.lIIIiillll = var6;
               this.iIIIiillll = var8;
               this.IlIIiillll = var4;
               this.llIIiillll = var6;
               this.ilIIiillll = var8;
               break;
            case IliIlllilIi<"IliIlllilIi","7rny2yaQs4ItIwCJfbj+VWCiDz4Nwu3o5Nmfywpt9g2O">():
               this.IIIIiillll = this.IiIIiillll;
               this.lIIIiillll = this.liIIiillll + 1.0;
               this.iIIIiillll = this.iiIIiillll;
               this.IlIIiillll = this.IIlIiillll;
               this.llIIiillll = this.lIlIiillll + 1.0;
               this.ilIIiillll = this.iIlIiillll;
               break;
            default:
               this.IIIIiillll = this.IiIIiillll;
               this.lIIIiillll = this.liIIiillll;
               this.iIIIiillll = this.iiIIiillll;
               this.IlIIiillll = this.IIlIiillll;
               this.llIIiillll = this.lIlIiillll;
               this.ilIIiillll = this.iIlIiillll;
         }

         this.illIiillll = 0.0F;
         this.iilIiillll = 0.0F;
         this.IllIiillll = true;
      }
   }

   @Override
   public void Iilililiiili() {
      this.IllIiillll = false;
      this.lllIiillll = false;
      this.IilIiillll = null;
      this.illIiillll = 0.0F;
      this.iilIiillll = 0.0F;
   }

   public iIiIlIllIliIlIll() {
      super(IliIlllilIi<"IliIlllilIi","x2BSNWE2NKKmGmObGa2pHyERTSk8l03FFiUCNBbKwZej+3kfq3HHapd4">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iliilillll = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","qFF522LzcsABxlz3kP3+8viBGCmZf44bkq2JTwQB5hY=">(),
         IliIlllilIi<"IliIlllilIi","A7jjPDFWOWZyftCt3N+xcn5JYHCHvJsx3dUguLiMU+UkVpA9dHstCDP2KGNoEwYNPYwuONYMGg8O6EALb3zYkfvZ">(),
         687865855
      );
      this.Iiiilillll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","jY45X1Ok4QS57h1IkIq6Sg13A5CceyywOZuazHZ9bwk=">(),
         IliIlllilIi<"IliIlllilIi","1RF/wpihdye6YKp5mo0nbCtmxJqEjAt+/TLu5BgywB6Ds2SyUPGDIPLcOTY=">(),
         IliIlllilIi<"IliIlllilIi","QqyM4iUfiwq5MoAirlNgxd0sfu6PGQJkjMpk8a5OqbIEwIw=">(),
         IliIlllilIi<"IliIlllilIi","QqyM4iUfiwq5MoAirlNgxd0sfu6PGQJkjMpk8a5OqbIEwIw=">(),
         IliIlllilIi<"IliIlllilIi","ye+OQDC7Q9i+H35aUGrjZzPhjCbP0YrCI1Qr2zI1d+M=">(),
         IliIlllilIi<"IliIlllilIi","7rny2yaQs4ItIwCJfbj+VWCiDz4Nwu3o5Nmfywpt9g2O">()
      );
      this.liiilillll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","8tUIFdAl5lXt2Rw1yYQ56aKPcobtCY5J0CoWeoKphTJC">(),
         IliIlllilIi<"IliIlllilIi","sSBezTuvXcdL5diC5PHaJd3GZUvbQZTNlWaQoniN4SAypQFkC0Es5pOaWO6cdjo=">(),
         8.0,
         1.0,
         67.0,
         0.5
      );
      this.IllIiillll = false;
      this.lllIiillll = false;
      this.illIiillll = 0.0F;
      this.IilIiillll = null;
      this.lilIiillll = System.currentTimeMillis();
      this.iilIiillll = 0.0F;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.Iliilillll, this.lliilillll, this.iliilillll, this.Iiiilillll, this.liiilillll});
   }

   private static float Iillllilll(float x) {
      return x < 0.5F
         ? 4.0F * x * x * x
         : 1.0F - (float)Math.pow((double)(-2.0F * x + 2.0F), Double.longBitsToDouble(-4258030169983281542L ^ -8871967988224354694L)) / 2.0F;
   }

   private void liIlliiIll(
      class_4588 v2z,
      Matrix4f v3x,
      float v1z,
      float maxA,
      float v1x,
      float v2y,
      float v1y,
      float mat,
      float sweepX,
      float v3y,
      float sizeX,
      float faceX,
      float v2x,
      float v4y,
      float v3z,
      float v4x,
      float v4z,
      float halfW,
      float buf
   ) {
      float var20 = Math.abs(maxA - v1z);
      float var21 = v1x * v2y;
      if (!(var20 >= var21)) {
         float var22 = 1.0F - var20 / var21;
         float var23 = var22 * var22 * (3.0F - 2.0F * var22) * 0.5F;
         float var24 = var22 * var22 * var22 * var22 * 0.5F;
         int var25 = Math.max(0, Math.min(255, (int)((var23 + var24) * v1y * 255.0F)));
         if (var25 != 0) {
            v2z.method_22918(v3x, mat, sweepX, v3y).method_1336(255, 253, 248, var25);
            v2z.method_22918(v3x, sizeX, faceX, v2x).method_1336(255, 253, 248, var25);
            v2z.method_22918(v3x, v4y, v3z, v4x).method_1336(255, 253, 248, var25);
            v2z.method_22918(v3x, v4z, halfW, buf).method_1336(255, 253, 248, var25);
         }
      }
   }

   private int IIllllIlll(float maxA, float vx, float halfW, float sweepX, float sizeX) {
      float var6 = Math.abs(maxA - halfW);
      float var7 = sweepX * vx;
      if (var6 >= var7) {
         return 0;
      } else {
         float var8 = 1.0F - var6 / var7;
         float var9 = var8 * var8 * (3.0F - 2.0F * var8) * 0.5F;
         float var10 = var8 * var8 * var8 * var8 * 0.5F;
         return Math.max(0, Math.min(((~-1233524456 ^ 37) << 11 | (~-1233524456 ^ 37) >>> 21) + -49 ^ 817238756, (int)((var9 + var10) * sizeX * 255.0F)));
      }
   }
}
