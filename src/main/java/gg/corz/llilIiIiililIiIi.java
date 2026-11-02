package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4588;

public class llilIiIiililIiIi extends ilIllIiIll {
   private final iiIiiilIIliiil liIIlIiIIi;
   private static final int IliiIIiIIi = 9;
   private final float[] IliIlIiIIi;
   private static final int lllIlIiIIi = 3;
   private static final Color IlIIlIiIIi = new Color(15987704, false);
   private final iiIiiilIIliiil iiIIlIiIIi;
   private final float[] liiIlIiIIi;
   private final int[] iiiIlIiIIi;
   private final float[] IiiIlIiIIi;
   private static final int IilIlIiIIi = 12;
   private static final int IllIlIiIIi = 15;
   private static final String[] iIIIlIiIIi = new String[81];
   private static final int[][] iiiiIIiIIi = new int[][]{
      {82, 5},
      {100, 3},
      {101, 3},
      {102, 3},
      {103, 2},
      {104, 2},
      {105, 2},
      {106, 2},
      {91, 2},
      {83, 5},
      {44, 3},
      {75, 3},
      {42, 3},
      {41, 2},
      {40, 2},
      {39, 2},
      {38, 2},
      {92, 2},
      {84, 5},
      {45, 3},
      {14, 3},
      {13, 3},
      {12, 2},
      {11, 2},
      {10, 2},
      {37, 2},
      {93, 2},
      {85, 5},
      {46, 5},
      {74, 5},
      {3, 3},
      {2, 2},
      {1, 2},
      {25, 2},
      {36, 2},
      {94, 2},
      {86, 4},
      {47, 4},
      {72, 4},
      {71, 4},
      {5, 2},
      {4, 2},
      {24, 2},
      {35, 2},
      {95, 2},
      {87, 4},
      {51, 1},
      {17, 1},
      {9, 0},
      {8, 0},
      {7, 0},
      {23, 0},
      {34, 0},
      {96, 2},
      {88, 4},
      {54, 1},
      {18, 1},
      {61, 0},
      {62, 0},
      {21, 0},
      {22, 0},
      {33, 0},
      {97, 0},
      {89, 0},
      {26, 1},
      {27, 0},
      {28, 0},
      {29, 0},
      {30, 0},
      {59, 0},
      {32, 0},
      {98, 0},
      {90, 0},
      {107, 1},
      {108, 1},
      {109, 1},
      {110, 1},
      {111, 1},
      {112, 1},
      {113, 1},
      {99, 0}
   };
   private static final String[] IiiiIIiIIi = new String[]{
      IliIlllilIi<"IliIlllilIi","75Y2HuSrTkLQMZdNNp48uVPxQcHcE2VJlRVev35Km7U=">(),
      IliIlllilIi<"IliIlllilIi","9c4RFJNlPW6wqiQ0GUtS8NG8VxtQWkseaOlUPKNT+QU=">(),
      IliIlllilIi<"IliIlllilIi","CpjGYmW1OArdyxc6qBtn4VkzjkjR8vfh8WUPEPp1Wig=">(),
      IliIlllilIi<"IliIlllilIi","hEVZLJsKw0apzJaXGlRHsigigtl9k+32cfSPW9GAIxw=">(),
      IliIlllilIi<"IliIlllilIi","xGdOlNcgj93NjFOuF9eo5W5/tXNx0915decqpMbPHgY=">(),
      IliIlllilIi<"IliIlllilIi","545DBTIo+o4pWm31wp35jpRyh/Rq3a3+H5NC9h5p7w==">()
   };
   private static final int[] liiiIIiIIi = new int[]{
      iiiIlIIIll(159, 206, 99), iiiIlIIIll(0, 166, 99), iiiIlIIIll(79, 173, 234), iiiIlIIIll(47, 110, 186), iiiIlIIIll(245, 194, 66), iiiIlIIIll(252, 136, 3)
   };
   private static final int[] lIIIlIiIIi = new int[81];
   private iiIliiiIIlliii lilIlIiIIi;
   private float iilIlIiIIi;
   private static final int IIlIlIiIIi = 6;
   private final iilliIlIIiliIl ilIIlIiIIi;
   private static final int illIlIiIIi = 5;
   private static final int iIlIlIiIIi = 108;
   private final float[] lliIlIiIIi;
   private final lliliIIiililiIIi llIIlIiIIi = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","TRqKRFr+FF5bcUz2TObstYnPtS2gDQvoOjfebWzTPillGhvavw==">(),
      IliIlllilIi<"IliIlllilIi","gH5nMbWm5Fa9QH4V1xcyxQWLcsXwf2TILyze1x7O/hATYiIdiUiiSZPstx36YeKCkTlKGJUQPDE6d/YyD7R2oDkb0yHGSMvQ5G9Mht5WjXCsJCSoOUM7MS6C23NpPTeEtPfKV7VdBvY2S7yfxFK+RBttFeVxWz6RnIM=">(),
      IliIlllilIi<"IliIlllilIi","6zxpDfmCj/3KwMvmiAZ5WTcr8A7DrpKKKp5faUVRNmc=">(),
      IliIlllilIi<"IliIlllilIi","6zxpDfmCj/3KwMvmiAZ5WTcr8A7DrpKKKp5faUVRNmc=">(),
      IliIlllilIi<"IliIlllilIi","8jNNCop24HDLHZYsjcppoW8+13Ny8fkGWBYZmEd9wvNuTr0E">(),
      IliIlllilIi<"IliIlllilIi","RtBVLGK5v0cO75zPbWrD1dfA8JL+9VB8xZg1g2TTDgh3o8ujyA==">(),
      IliIlllilIi<"IliIlllilIi","H7cEv1CG4byZTYzGWz3hbGuBNfPtoEf2WbAui5ND+YPZKDqjw4lJ">(),
      IliIlllilIi<"IliIlllilIi","nltB1G1fxyfDj4b9JZtM+Qxve6Ma57zQwTaJx67e8ZBzHhjAZdh03g==">()
   );
   private final float[] IIiIlIiIIi;
   private static final double iliiIIiIIi = 225000.0;
   private static final double lliiIIiIIi = 50000.0;
   private IIliiIlllIliiIll lIiIlIiIIi;
   private final String[] iIiIlIiIIi;
   private final String[] iliIlIiIIi;
   private static final int lIlIlIiIIi = 12;
   private static final int[] IIIIlIiIIi = new int[81];
   private final iilliIlIIiliIl IiIIlIiIIi;

   private void Ilillllill(int lx, int factor, int ly, float currentType) {
      byte var5 = 54;
      iiIliiiIIlliii var6 = this.lilIlIiIIi;
      if (var6 != null) {
         var6.iliIiiliiiii(IIIiiIillIIiiIil.liiiIIllIl(), this.iilIlIiIIi);
      }

      class_4588 var7 = llIllIililIllIil.IilliliilIIi();

      for (int var8 = 0; var8 < IiiiIIiIIi.length; var8++) {
         int var9 = lx + var8 % 2 * var5;
         int var10 = factor + var8 / 2 * 12;
         IIIillIIil(var7, (float)var9, (float)var10 + 3.5F, 5.0F, 5.0F, 0xFF000000 | this.IlIllllIll(var8), currentType);
      }

      llIllIililIllIil.IIillIiliIil();
      if (var6 != null) {
         IIIiiIillIIiiIil.liiiIIllIl().method_22909();
      }

      IIlIiIlllIlIiIll var18 = IIlIiIlllIlIiIll.lIiiIiIlilli();
      IIlIiIlllIlIiIll var19 = IIlIiIlllIlIiIll.liiiIIllIl();
      IIlIiIlllIlIiIll var20 = var18.IIillIiliIil() ? var18 : (var19.IIillIiliIil() ? var19 : null);
      float var11 = 11.0F;

      for (int var12 = 0; var12 < IiiiIIiIIi.length; var12++) {
         int var13 = lx + var12 % 2 * var5;
         int var14 = factor + var12 / 2 * 12;
         int var15 = var12 == ly ? -1 : -8224116;
         String var16 = this.ilIllIiIll(var12);
         if (var20 != null) {
            this.iliIlIiIIi[var12] = var16;
            this.IiiIlIiIIi[var12] = (float)(var13 + 8);
            this.liiIlIiIIi[var12] = (float)var14 + (12.0F - var20.IlIillIiilIi(11.0F)) / 2.0F;
            this.iiiIlIiIIi[var12] = var15;
         } else {
            IIliiIlllIliiIll var17 = illlIiiIillIii.iIlIlllllill();
            var17.liiiIIllIl(var16, (float)(var13 + 8), (float)var17.IlIillIiilIi(var14, 12), new Color(var15, true));
         }
      }

      if (var20 != null) {
         var20.Iilililiiili(this.iliIlIiIIi, this.IiiIlIiIIi, this.liiIlIiIIi, this.iiiIlIiIIi, IiiiIIiIIi.length, 11.0F);
      }
   }

   private static int IiIilliIil(int a, float rgb) {
      long var3 = -3609999385320965205L;
      var3 ^= ((long)Math.round(iIIilIlIil((double)rgb) * 255.0F) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << (1193353292 * 954437177 ^ -83 ^ -2041469095) | a & (~(~120746551) ^ 49 ^ 130911737);
   }

   @Override
   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      this.lllllillll(event.IIiIilIIIl);
   }

   private void Iillllilll(class_332 sizeScale, int ctx, int sh, float factor, float sw) {
      int var6 = (int)Math.ceil((double)IiiiIIiIIi.length / 2.0);
      float var7 = 1.0F / Math.max(0.05F, sw);
      int var8 = 15;
      int var9 = 120;
      boolean var10 = IIililillIililil.liIlliiIll();
      if (var10) {
         var8 = Math.round(llliIlIlilliIlIl.IIlilIliiIli(var7));
         var9 = Math.max(
            var9,
            (int)Math.ceil((double)llliIlIlilliIlIl.Illillliilli(IliIlllilIi<"IliIlllilIi","k6KGAi71rZ/G2vQuyGFqh/4dOe9iWnbqb4Y04Qq7AvrEiJA3sds=">(), var7))
         );
      }

      int var11 = var8 + 3 + 108 + 6;
      if (this.iiIIlIiIIi.Iilllilliill()) {
         var11 += 5 + var6 * 12;
      }

      byte var12 = 4;
      String var15 = this.llIIlIiIIi.Iilllilliill();
      int var16 = -1;
      switch (var15.hashCode()) {
         case -960744398:
            if (var15.equals(IliIlllilIi<"IliIlllilIi","8jNNCop24HDLHZYsjcppoW8+13Ny8fkGWBYZmEd9wvNuTr0E">())) {
               var16 = 0;
            }
            break;
         case 287355729:
            if (var15.equals(IliIlllilIi<"IliIlllilIi","RtBVLGK5v0cO75zPbWrD1dfA8JL+9VB8xZg1g2TTDgh3o8ujyA==">())) {
               var16 = 3;
            }
            break;
         case 926500839:
            if (var15.equals(IliIlllilIi<"IliIlllilIi","nltB1G1fxyfDj4b9JZtM+Qxve6Ma57zQwTaJx67e8ZBzHhjAZdh03g==">())) {
               var16 = 2;
            }
            break;
         case 999535836:
            if (var15.equals(IliIlllilIi<"IliIlllilIi","H7cEv1CG4byZTYzGWz3hbGuBNfPtoEf2WbAui5ND+YPZKDqjw4lJ">())) {
               var16 = 1;
            }
      }

      int var13;
      int var14;

      var14 = switch (var16) {
         case 0 -> {
            var13 = var12;
            yield var12;
         }
         case 1 -> {
            var13 = var12;
            yield sh - var11 - var12;
         }
         case 2 -> {
            var13 = ctx - var9 - var12;
            yield sh - var11 - var12;
         }
         case 3 -> {
            var13 = ctx - var9 - var12;
            yield var12 + Math.round(IIililillIililil.IIllllIlll() / factor);
         }
         default -> {
            float var17 = 100.0F / (float)Math.max(1, this.ilIIlIiIIi.Iilllilliill());
            if (IIililillIililil.iIiiIlIliiIl()) {
               var13 = Math.round((float)IIililillIililil.lIliiiIlil * var17) - var12 - var9;
               yield Math.round((float)IIililillIililil.iIliiiIlil * var17);
            } else if (IIililillIililil.IIIiIllIIiIl()) {
               float var18 = 100.0F / (float)Math.max(1, this.ilIIlIiIIi.Iilllilliill());
               int var19 = Math.round((float)IIililillIililil.IliliiIlil * var18);
               int var20 = Math.round((float)IIililillIililil.lliliiIlil * var18);
               int var21 = Math.round((float)(IIililillIililil.IliliiIlil + IIililillIililil.ililiiIlil) * var18);
               int var22 = Math.round((float)(IIililillIililil.lliliiIlil + IIililillIililil.IiiliiIlil) * var18);
               var13 = var21 + var12;
               yield var20;
               if (var13 + var9 > ctx - var12) {
                  var13 = var19;
                  yield var22 + var12;
               }

               if (IIililillIililil.llIiIlilIiIl()) {
                  int var23 = Math.round((float)IIililillIililil.iiiliiIlil * var18);
                  int var24 = Math.round((float)IIililillIililil.IIIiiiIlil * var18);
                  int var25 = Math.round((float)(IIililillIililil.iiiliiIlil + IIililillIililil.lIIiiiIlil) * var18);
                  int var26 = Math.round((float)(IIililillIililil.IIIiiiIlil + IIililillIililil.iIIiiiIlil) * var18);
                  if (var13 < var25 && var13 + var9 > var23 && var14 < var26 && var14 + var11 > var24) {
                     if (var25 + var12 + var9 <= ctx - var12) {
                        var13 = var25 + var12;
                        yield var24;
                     } else {
                        if (var13 > var19) {
                           var13 = var23;
                        }

                        yield var26 + var12;
                     }
                  }
               }
            } else {
               var13 = ctx - var9 - var12;
               yield var12 + Math.round(IIililillIililil.IIllllIlll() / factor);
            }
         }
      };

      if (IIililillIililil.illiIlIiliIl()) {
         float var32 = 100.0F / (float)Math.max(1, this.ilIIlIiIIi.Iilllilliill());
         var16 = Math.round((float)IIililillIililil.ilIiiiIlil * var32);
         int var36 = Math.round((float)IIililillIililil.IiIiiiIlil * var32);
         int var38 = Math.round((float)(IIililillIililil.ilIiiiIlil + IIililillIililil.liIiiiIlil) * var32);
         int var40 = Math.round((float)(IIililillIililil.IiIiiiIlil + IIililillIililil.iiIiiiIlil) * var32);
         if (var13 < var38 && var13 + var9 > var16 && var14 < var40 && var14 + var11 > var36) {
            var14 = var40 + var12;
         }
      }

      int var28 = Math.max(var12, Math.min(var13, ctx - var9 - var12));
      int var30 = Math.max(var12, Math.min(var14, sh - var11 - var12));
      float var33 = IIililillIililil.IiiiIlliiiIl(IliIlllilIi<"IliIlllilIi","31wqnZBIs4nVABrsGF+uzPjOLaLqPkfnD15ynzjPqkm9mGcleA==">());
      float var35 = IIililillIililil.iiiiIlIIIIll(IliIlllilIi<"IliIlllilIi","31wqnZBIs4nVABrsGF+uzPjOLaLqPkfnD15ynzjPqkm9mGcleA==">());
      int var29 = var28 + Math.round(var33 / sw);
      int var31 = var30 + Math.round(var35 / sw);
      iiIliiiIIlliii var41 = IIililillIililil.ilIIllIiIIll(
         IliIlllilIi<"IliIlllilIi","31wqnZBIs4nVABrsGF+uzPjOLaLqPkfnD15ynzjPqkm9mGcleA==">(),
         (float)var28 * sw + var33,
         (float)var30 * sw + var35,
         (float)var9 * sw,
         (float)var11 * sw
      );
      class_4587 var42 = IIIiiIillIIiiIil.liiiIIllIl();
      this.lilIlIiIIi = var41;
      this.iilIlIiIIi = factor / sw;
      if (var41 != null) {
         var41.lIiiIiIlilli(var42, 1.0F / sw);
      }

      if (var10) {
         llliIlIlilliIlIl.Iilililiiili(
            (float)var29,
            (float)var31,
            (float)var9,
            (float)var11,
            lIlIIiliIlIIil.illIlIilIl(IliIlllilIi<"IliIlllilIi","61p0CuWDViB/cl0MFo5vwluNd9VM0ONLeLdUAgGt+A==">()),
            IliIlllilIi<"IliIlllilIi","k6KGAi71rZ/G2vQuyGFqh/4dOe9iWnbqb4Y04Qq7AvrEiJA3sds=">(),
            var7
         );
      } else {
         IIililillIililil.ilIlIlIiIlIl(
            sizeScale,
            (float)var29,
            (float)var31,
            (float)var9,
            (float)var11,
            IliIlllilIi<"IliIlllilIi","k6KGAi71rZ/G2vQuyGFqh/4dOe9iWnbqb4Y04Qq7AvrEiJA3sds=">()
         );
      }

      double var43 = IlIllllllIllll.lIIlliIIll(Iiiilllliiilll.field_1724.method_23317());
      double var44 = IlIllllllIllll.IlIllllIll(Iiiilllliiilll.field_1724.method_23321());
      int var45 = this.iIlllIllll(var43, var44);
      int var46 = var29 + (var9 - 108) / 2;
      int var27 = var31 + var8 + 3;
      this.iilllIIill(var46, var27, var43, var44, factor);
      if (this.liIIlIiIIi.Iilllilliill()) {
         this.lIilliIill(var46, var27);
      }

      if (this.iiIIlIiIIi.Iilllilliill()) {
         this.Ilillllill(var46, var27 + 108 + 5, var45, factor);
      }

      if (var41 != null) {
         var42.method_22909();
      }
   }

   public llilIiIiililIiIi() {
      super(IliIlllilIi<"IliIlllilIi","1/RS1W0TtMdI3qjOdn3M9ZLwQc4vAaMdli7ToOHKw0dsVb9JSg==">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.ilIIlIiIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","GBT4q3Fmc/+e8H5w0P/mglToAYqg8mst6YMIeP3/Qrw=">(),
         IliIlllilIi<"IliIlllilIi","ju0ZhTfXNcjpnXTI6izAlr6FcXCqOPoq/Y6B+qPSeBOlWkojCDNngi6w7UzQ+rgN36SZUdh/CkGa4JWbwVHnQI8OtN1dqV3yNvGh4kOiaybpeuhYf2yNb8Qr7eBUQnv0bDVdAoxlwoaviKMEHj9sJCvdDqjUXi44i/vLue/5DArdN8hm9VLEeHQsgHVmucBocSrOrEExME9wAj7t/rTcLbwnzxtYDWntHOHV3VEUkMgA90o0fmb2pWB3PlC66C1XL7xVtXI2Wx5Mp7CK0v/1pdv68ja8esuqjVc=">(),
         60,
         40,
         120,
         5
      );
      this.IiIIlIiIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","ulratioQsF/frhV0uJByRbfKTlSgUYIFACj4sQGUKNIIBWw=">(),
         IliIlllilIi<"IliIlllilIi","FqmpxF1b4Jth/iU1IIkcmbkbdwUegUaE0jhfQRtGbJN/aI4ixJmuA2IamDeGp4rxjqdOCcc=">(),
         90,
         10,
         100,
         5
      );
      this.liIIlIiIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","CkmJkYlCzbxrokFOcpH8ZXsBLalOfsE/1Jdoq4dIvPh7SRk4tMnqPA==">(),
         IliIlllilIi<"IliIlllilIi","x/bvfDs4bsE8PoOzfVzfmfZW7lRgmC7bqggD+J803GOKwfekQLsKW/8h5TCmIOEqYcthVRUNYOEk23OjOpWFZXADmrR+pbljsIeAKuO/N0KT95c7jDY=">(),
         false
      );
      this.iiIIlIiIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","vtjwv/P+L7kU9fGDK6dFjenSUelg9Cg9D7xP2fNYgokoPA==">(),
         IliIlllilIi<"IliIlllilIi","40eM1WDkKG1Y8aVXtsfRZDQeGwP+U+vmaLDKy3UNnyiy1btxdiDrh1fSF5fegj67G8ESU4x3Dg3MwEKMDzwOdS5BYaDzIhfdAj+dGUWn">(),
         true
      );
      this.iilIlIiIIi = 1.0F;
      this.IIiIlIiIIi = new float[81];
      this.iIiIlIiIIi = new String[81];
      this.IliIlIiIIi = new float[81];
      this.lliIlIiIIi = new float[81];
      this.iliIlIiIIi = new String[IiiiIIiIIi.length];
      this.IiiIlIiIIi = new float[IiiiIIiIIi.length];
      this.liiIlIiIIi = new float[IiiiIIiIIi.length];
      this.iiiIlIiIIi = new int[IiiiIIiIIi.length];
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIIlIiIIi, this.ilIIlIiIIi, this.IiIIlIiIIi, this.liIIlIiIIi, this.iiIIlIiIIi});
   }

   private int IlIllllIll(int type) {
      return type >= 0 && type < liiiIIiIIi.length ? liiiIIiIIi[type] : ~(~(~541227646 >>> 19 | ~541227646 << 13)) ^ -1336949752;
   }

   private int[] liIlliiIll(double worldX, double worldZ) {
      long var7 = 4889574367809398146L;
      var7 ^= (
            (long)(
                     (int)Math.floor(
                        (worldX + Double.longBitsToDouble(-6317924932514032989L ^ -1632185431566396765L))
                           / Double.longBitsToDouble(-162888210145599130L ^ -4803893805639261850L)
                     )
                  )
                  << 32
               ^ var7
         )
         & -1L << 32;
      var7 ^= (
            (long)(
                  (int)Math.floor(
                     (worldZ + Double.longBitsToDouble(-1727224284545663615L ^ -6265388984080646783L))
                        / Double.longBitsToDouble(5416726695493527184L ^ 847941421758703248L)
                  )
               )
               ^ var7
         )
         & -1L >>> 32;
      return new int[]{(int)(var7 >>> 32), (int)var7};
   }

   private static float llIililIil(float hi, float lo, float v) {
      return hi < lo ? lo : (hi > v ? v : hi);
   }

   private static void IIIillIIil(class_4588 factor, float x, float argb, float h, float vc, int w, float y) {
      llIllIililIllIil.iliIiiliiiii(factor, x * y, argb * y, (x + h) * y, (argb + vc) * y, IliiIilliiIi.IlIlllIlilIl(w));
   }

   static {
      for (int var0 = 0; var0 < iiiiIIiIIi.length && var0 < IIIIlIiIIi.length; var0++) {
         if (iiiiIIiIIi[var0].length >= 2) {
            IIIIlIiIIi[var0] = iiiiIIiIIi[var0][0];
            lIIIlIiIIi[var0] = Math.min(iiiiIIiIIi[var0][1], IiiiIIiIIi.length - 1);
         } else {
            lIIIlIiIIi[var0] = -1;
         }
      }

      for (int var1 = 0; var1 < iIIIlIiIIi.length; var1++) {
         iIIIlIiIIi[var1] = String.valueOf(IIIIlIiIIi[var1]);
      }
   }

   private int iIlllIllll(double worldZ, double worldX) {
      int[] var5 = this.liIlliiIll(worldZ, worldX);
      return var5[0] >= 0
            && var5[0] < ((-1911749010 - 87 - -15 << 7 | -1911749010 - 87 - -15 >>> 25) + -19 ^ 109253437)
            && var5[1] >= 0
            && var5[1] < (1557687521 * -96516119 * -87 * -654471207 ^ -174442752)
         ? this.lIIlliIIll(var5[1] * (-(1483244105 - 27) ^ -1483244069) + var5[0])
         : -1;
   }

   private void ilillIiill(class_4588 ay, float vc, float colorArgb, float factor, int yaw, float ax) {
      double var7 = Math.toRadians((double)factor + 180.0);
      float var9 = (float)Math.cos(var7);
      float var10 = (float)Math.sin(var7);
      this.liilliiill(ay, vc, colorArgb, var9, var10, 0.0F, -4.9F, 3.3F, 2.9F, -3.3F, 2.9F, IiIilliIil(0, 0.55F), ax);
      this.liilliiill(ay, vc, colorArgb, var9, var10, 0.0F, -4.0F, 2.6F, 2.2F, -2.6F, 2.2F, yaw, ax);
   }

   private static float iIIilIlIil(double v) {
      return (float)(
         v < Double.longBitsToDouble(1566760529313523549L ^ 1566760529313523549L)
            ? 0.0
            : (v > Double.longBitsToDouble(2500188814764004321L ^ 2108375647182771169L) ? 1.0 : v)
      );
   }

   private static int iiiIlIIIll(int b, int r, int g) {
      return b << ((2048626011 >>> 21 | 2048626011 << 11) * 49 ^ 812913344) | r << ((-(--588346463) << 27 | -(--588346463) >>> 5) ^ 250049621) | g;
   }

   private int lIIlliIIll(int index) {
      return index >= 0 && index < lIIIlIiIIi.length ? lIIIlIiIIi[index] : -1;
   }

   private double[] IIllllIlll(double worldZ, double worldX) {
      double var5 = (worldZ + 225000.0) % 50000.0 / 50000.0;
      double var7 = (worldX + 225000.0) % 50000.0 / 50000.0;
      if (var5 < 0.0) {
         var5++;
      }

      if (var7 < 0.0) {
         var7++;
      }

      return new double[]{(double)iIIilIlIil(var5), (double)iIIilIlIil(var7)};
   }

   public void lllllillll(class_332 ctx) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (ctx != null) {
            class_4587 var2 = new class_4587();
            CorzClient.fontManager.iIlIlllllill(var2);
            IIIiiIillIIiiIil.IliIlllilIi(var2);
            double var3 = (double)Iiiilllliiilll.method_22683().method_4495();
            int var5 = Iiiilllliiilll.method_22683().method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
            float var6 = (float)Math.max(1, this.ilIIlIiIIi.Iilllilliill()) / 100.0F;
            float var7 = (float)((double)var5 / var3) * var6;
            boolean var8 = Math.abs(var7 - 1.0F) > 1.0E-4F;
            int var9;
            int var10;
            if (var8) {
               var9 = Math.round((float)Iiiilllliiilll.method_22683().method_4486() / var7);
               var10 = Math.round((float)Iiiilllliiilll.method_22683().method_4502() / var7);
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var9;
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)var10;
            } else {
               var9 = Iiiilllliiilll.method_22683().method_4486();
               var10 = Iiiilllliiilll.method_22683().method_4502();
            }

            float var11 = IIililillIililil.ilIllIiIll();
            if (var11 < 0.004F) {
               if (var8) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }
            } else {
               float var12 = IliiIilliiIi.IilliliilIIi(var11);

               try {
                  this.Iillllilll(ctx, var9, var10, var7, var6);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var12);
                  if (var8) {
                     IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                     IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
                  }
               }
            }
         }
      }
   }

   private void lIilliIill(int gx, int gy) {
      IIliiIlllIliiIll var3 = illlIiiIillIii.iIlIlllllill();
      if (var3 != this.lIiIlIiIIi) {
         for (int var4 = 0; var4 < iIIIlIiIIi.length; var4++) {
            this.IIiIlIiIIi[var4] = var3.iIlIlllllill(iIIIlIiIIi[var4]);
         }

         this.lIiIlIiIIi = var3;
      }

      int var10 = 0;

      for (int var5 = 0; var5 < 9; var5++) {
         int var6 = var3.IlIillIiilIi(gy + var5 * 12, 12);

         for (int var7 = 0; var7 < 9; var7++) {
            int var8 = this.lIIlliIIll(var5 * 9 + var7);
            if (var8 >= 0) {
               float var9 = this.IIiIlIiIIi[var5 * 9 + var7];
               this.iIiIlIiIIi[var10] = iIIIlIiIIi[var5 * 9 + var7];
               this.IliIlIiIIi[var10] = (float)(gx + var7 * 12) + (12.0F - var9) / 2.0F - 1.5F;
               this.lliIlIiIIi[var10] = (float)var6;
               var10++;
            }
         }
      }

      var3.Illlllllilll(this.iIiIlIiIIi, this.IliIlIiIIi, this.lliIlIiIIi, var10, IlIIlIiIIi);
   }

   private void liilliiill(
      class_4588 x1, float argb, float ax, float y1, float x3, float sin, float factor, float y3, float cos, float y2, float vc, int ay, float x2
   ) {
      float var14 = (argb + (sin * y1 - factor * x3)) * x2;
      float var15 = (ax + sin * x3 + factor * y1) * x2;
      float var16 = (argb + (y3 * y1 - cos * x3)) * x2;
      float var17 = (ax + y3 * x3 + cos * y1) * x2;
      float var18 = (argb + (y2 * y1 - vc * x3)) * x2;
      float var19 = (ax + y2 * x3 + vc * y1) * x2;
      llIllIililIllIil.IIIllIIliIIl(x1, var14, var15, var16, var17, var18, var19, var18, var19, IliiIilliiIi.IlIlllIlilIl(ay));
   }

   private void iilllIIill(int factor, int gx, double pz, double gy, float px) {
      float var8 = iIIilIlIil((double)((float)this.IiIIlIiIIi.Iilllilliill() / 100.0F));
      int[] var9 = this.liIlliiIll(pz, gy);
      boolean var10 = var9[0] >= 0 && var9[0] < 9 && var9[1] >= 0 && var9[1] < 9;
      iiIliiiIIlliii var11 = this.lilIlIiIIi;
      if (var11 != null) {
         var11.iliIiiliiiii(IIIiiIillIIiiIil.liiiIIllIl(), this.iilIlIiIIi);
      }

      class_4588 var12 = llIllIililIllIil.IilliliilIIi();
      IIIillIIil(var12, (float)factor, (float)gx, 108.0F, 108.0F, IiIilliIil(0, 0.45F), px);

      for (int var13 = 0; var13 < 9; var13++) {
         for (int var14 = 0; var14 < 9; var14++) {
            int var15 = this.lIIlliIIll(var13 * 9 + var14);
            if (var15 >= 0) {
               IIIillIIil(var12, (float)(factor + var14 * 12 + 1), (float)(gx + var13 * 12 + 1), 10.0F, 10.0F, IiIilliIil(this.IlIllllIll(var15), var8), px);
            }
         }
      }

      if (var10) {
         int var16 = factor + var9[0] * 12;
         int var18 = gx + var9[1] * 12;
         IIIillIIil(var12, (float)(var16 + 1), (float)(var18 + 1), 10.0F, 10.0F, IiIilliIil(16777215, 0.34F), px);
      }

      if (var10) {
         double[] var17 = this.IIllllIlll(pz, gy);
         float var19 = llIililIil((float)factor + (float)(((double)var9[0] + var17[0]) * 12.0), (float)(factor + 5), (float)(factor + 108 - 5));
         float var20 = llIililIil((float)gx + (float)(((double)var9[1] + var17[1]) * 12.0), (float)(gx + 5), (float)(gx + 108 - 5));
         this.ilillIiill(var12, var19, var20, Iiiilllliiilll.field_1724.method_36454(), -1, px);
      }

      llIllIililIllIil.IIillIiliIil();
      if (var11 != null) {
         IIIiiIillIIiiIil.liiiIIllIl().method_22909();
      }
   }

   private String ilIllIiIll(int type) {
      return type >= 0 && type < IiiiIIiIIi.length ? IiiiIIiIIi[type] : "";
   }
}
