package gg.corz;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2605;
import net.minecraft.class_2611;
import net.minecraft.class_2627;
import net.minecraft.class_2636;
import net.minecraft.class_2646;
import net.minecraft.class_2669;
import net.minecraft.class_2818;
import net.minecraft.class_3719;
import net.minecraft.class_3866;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class iiiilIllIIIIiIll extends ilIllIiIll {
   private final ByteArrayList lIllllilll;
   private final iiIiiilIIliiil IlIlllilll;
   private final iiIiiilIIliiil liiIllilll;
   private static final int[] iiIlllilll = new int[]{
      ilIllIiIll(200, 91, 0),
      ilIllIiIll(156, 91, 0),
      ilIllIiIll(117, 0, 255),
      ilIllIiIll(138, 126, 166),
      ilIllIiIll(134, 0, 158),
      ilIllIiIll(125, 125, 125),
      ilIllIiIll(255, 140, 140),
      ilIllIiIll(80, 80, 255),
      ilIllIiIll(35, 226, 0)
   };
   private final iiIiiilIIliiil lIIlllilll;
   private final iiIiiilIIliiil IIIlllilll;
   private final List<class_2586> IIllllilll;
   private boolean llllllilll;
   private final iiIiiilIIliiil iIIlllilll;
   private final iiIiiilIIliiil llIlllilll;
   private final iiIiiilIIliiil iiiIllilll;
   private int iIllllilll;
   private int Illlllilll;
   private final iilliIlIIiliIl IiiIllilll = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","2yMpO9SLKhmnL40xbLh70el2dXKYs/262NaFQkXfyf/f">(),
      IliIlllilIi<"IliIlllilIi","BkeZ226RAbVtn0oFzqfOHm6aCXkQkL+nlqJydz+suzEsGRPIx1js8H9oM7xm7d1EfV/YmlyK912N">(),
      125,
      1,
      255
   );
   private static final int liIlllilll = 4;
   private final iiIiiilIIliiil IiIlllilll;
   private final iiIiiilIIliiil ilIlllilll;

   private static int ilIllIiIll(int g, int b, int r) {
      return g << (((899258277 - -77) * -1875962727 + -57) * -1857283155 ^ 238552293)
         | b << ((1530398003 * 1205604855 << 19 | 1530398003 * 1205604855 >>> 13) - -19 ^ 967492054)
         | r;
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && this.iIllllilll != 0) {
         class_4184 var2 = llilllililll.liiiIIllIl();
         if (var2 != null) {
            class_243 var3 = llilllililll.IliIlllilIi();
            class_4587 var4 = event.IliiiIIilliiiIIi;
            var4.method_22903();
            var4.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
            Matrix4f var5 = var4.method_23760().method_23761();
            float var6 = (float)this.IiiIllilll.Iilllilliill() / 255.0F;
            boolean var7 = this.liiIllilll.Iilllilliill();
            boolean var8 = this.llllllilll;
            double var9 = Math.max(Math.abs(var3.field_1352), Math.max(Math.abs(var3.field_1351), Math.abs(var3.field_1350)));
            int var11 = 0;
            int var12 = 0;

            for (int var13 = this.IIllllilll.size(); var12 < var13; var12++) {
               class_2586 var14 = this.IIllllilll.get(var12);
               byte var15 = this.lIllllilll.getByte(var12);
               if (!var14.method_11015() && this.lIIlliIIll(var15)) {
                  var11++;
                  class_2338 var16 = var14.method_11016();
                  int var17 = var16.method_10263();
                  int var18 = var16.method_10264();
                  int var19 = var16.method_10260();
                  int var20 = iiIlllilll[var15];
                  if (!var8 || !iiiIlIIIll(var17, var18, var19, var3, var9)) {
                     iIiiIIilIliiIIil.IIlilIliiIli(
                        var5,
                        (float)var17 + 0.1F,
                        (float)var18 + 0.05F,
                        (float)var19 + 0.1F,
                        (float)var17 + 0.9F,
                        (float)var18 + 0.85F,
                        (float)var19 + 0.9F,
                        (float)(var20 >> 16 & 0xFF) / 255.0F,
                        (float)(var20 >> 8 & 0xFF) / 255.0F,
                        (float)(var20 & 0xFF) / 255.0F,
                        var6
                     );
                  }

                  if (var7) {
                     Iillllilll.IIlllIlliIll((double)var17 + 0.5, (double)var18 + 0.5, (double)var19 + 0.5, 0xFF000000 | var20, 1.0F);
                  }
               }
            }

            var4.method_22909();
            iIiiIIilIliiIIil.IiIiliIiiiIi();
            if (!this.llllllilll) {
               this.llllllilll = true;
            }
         }
      }
   }

   public iiiilIllIIIIiIll() {
      super(IliIlllilIi<"IliIlllilIi","00bjoZnNn0+yNXmbRuK1wH8E5i4W9loB4nGfE2aMLVUM5Kebk1U=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.liiIllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","qKJtlRkb4yVHhdjG0NKsohf5jeUQTOR1VQgJZkpUKiH7tP0=">(),
         IliIlllilIi<"IliIlllilIi","bbsUY/nIGpqjilWygOcq8p/PSiuY1pponUXtHORtgPxVgoDF2Zr3cBYcyFtYl66qdsgmqQPxwVMFbGvGcbYuwPIuTYngEL0y1O2tbwHQcf5v">(),
         false
      );
      this.iiiIllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","E/WFs6wrIxcXHB9QRVQdGUFy93yxFpAu0VtavXh40ALctA==">(),
         IliIlllilIi<"IliIlllilIi","HxRoPLaU2AyOYiKUcxB+F8y/sIrsr97Xo/pkoiNpgRG9hTbY2N7V9s7kEwiZ2zHdtrz4Pen+N2AdzA==">(),
         true
      );
      this.IIIlllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","3OLBGdbyd7dCqMlfe88LtfSgIGSpaX/IlGg+fn1ihBWDVxmIdVvU0A==">(),
         IliIlllilIi<"IliIlllilIi","08UZ4/mvBIR6zN+BBMbF8oF/7PcjmnVaIAumud6xbYh1nk/wFBaJJCmWmUe8">(),
         true
      );
      this.lIIlllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Aeo8q3JSgSlFVmdMscvEFTZPNOm91jM5YxbQbRKAyCeqN7/j">(),
         IliIlllilIi<"IliIlllilIi","xyU76R0Nu6eZWQswfo09lUY+7vrOotgQFRyF3Xc31wkTgrlsi5NS4LUOixCw">(),
         true
      );
      this.iIIlllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","gcgZmXbpgdoT/cDpDZmePdTP5bm5Ecy83k/riw8lbrZPzCz8No8tuG0=">(),
         IliIlllilIi<"IliIlllilIi","MhCxHomsiRZAPh0ZoMaMZGCfkdRwt/4u7Xx2Hj/y5XQsKH/7CZbkn2xwEGUUzg==">(),
         true
      );
      this.IlIlllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","maVtXCs7KmYjOIPadfsLxYOqS5mn5uqm8FqaP3llFFJ2V6RL">(),
         IliIlllilIi<"IliIlllilIi","uUGNIzGUtGAEgSKN8I2H80Wib4wzW/CLXO0x2LiPijqRqXnWfI8o6/I=">(),
         true
      );
      this.llIlllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","NXWi+xiwM/ATtPDtu606M5/8yMGu2MPnHieOhWpruvPDLwA=">(),
         IliIlllilIi<"IliIlllilIi","tNDYV+JJ6eAkhYjKVxN2ij0omzP+GUivs+xcrNcatTg1sdhRRTN6ow==">(),
         true
      );
      this.ilIlllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","UziIGboXbVOhnWvlw2ZVltjwOrPNvPGp/olC80XSYsdQMnPDvJVofZsD7f8p">(),
         IliIlllilIi<"IliIlllilIi","cF4PTufEn65wOcweSfrlEDZon0xaKwJ/BdBEmOsJkvEC7Wra8TsTBHxrd3BFakAPEw8=">(),
         true
      );
      this.IiIlllilll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","jIJ+8l5MeDtf8cTsFtQUwFO03JsVrEhZOXSXz3EGfIN/v2o=">(),
         IliIlllilIi<"IliIlllilIi","Ghs+a+6gldgaKiyKNFiCtl+FeN2L5qk2zqC3n3S2VSJGTsWLfu2/Xw==">(),
         true
      );
      this.IIllllilll = new ArrayList<>();
      this.lIllllilll = new ByteArrayList();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IiiIllilll,
            this.liiIllilll,
            this.iiiIllilll,
            this.IIIlllilll,
            this.lIIlllilll,
            this.iIIlllilll,
            this.IlIlllilll,
            this.llIlllilll,
            this.ilIlllilll,
            this.IiIlllilll
         }
      );
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (this.Illlllilll > 0) {
            this.Illlllilll--;
         } else {
            this.Illlllilll = 4;
            this.IIllllilll.clear();
            this.lIllllilll.clear();
            this.iIllllilll = 0;

            for (class_2818 var2 : lIIiilliIIiill.IliIlllilIi().toList()) {
               Collection var3 = var2.method_12214().values();
               this.iIllllilll = this.iIllllilll + var3.size();

               for (class_2586 var5 : var3) {
                  int var6 = IlIllllIll(var5);
                  if (var6 >= 0) {
                     this.IIllllilll.add(var5);
                     this.lIllllilll.add((byte)var6);
                  }
               }
            }
         }
      }
   }

   private static boolean iiiIlIIIll(int y, int cameraMax, int z, class_243 cameraPos, double x) {
      double var6 = (double)y + Double.longBitsToDouble(1093055511064080973L ^ 3515992110589407821L);
      double var8 = (double)cameraMax + Double.longBitsToDouble(1200918740409780694L ^ 3420002294437037339L);
      double var10 = (double)z + Double.longBitsToDouble(887075083346354003L ^ 3724342848589766483L);
      double var12 = var6 - cameraPos.field_1352;
      double var14 = var8 - cameraPos.field_1351;
      double var16 = var10 - cameraPos.field_1350;
      float var18 = (float)Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
      double var19 = Math.max(x, Math.max(Math.abs(var6), Math.max(Math.abs(var8), Math.abs(var10))) + 1.0);
      float var21 = 0.7F + 0.52F * (var18 + 0.7F) + 0.05F + 4.0F * Math.ulp((float)var19);
      return iIiiIIilIliiIIil.IlIillIiilIi(var6, var8, var10, var21);
   }

   @Override
   protected void Iilililiiili() {
      this.IIllllilll.clear();
      this.lIllllilll.clear();
      this.iIllllilll = 0;
      this.Illlllilll = 0;
   }

   private boolean lIIlliIIll(int type) {
      return switch (type) {
         case 0, 1 -> this.iiiIllilll.Iilllilliill();
         case 2 -> this.IIIlllilll.Iilllilliill();
         case 3 -> this.lIIlllilll.Iilllilliill();
         case 4 -> this.iIIlllilll.Iilllilliill();
         case 5 -> this.IlIlllilll.Iilllilliill();
         case 6 -> this.llIlllilll.Iilllilliill();
         case 7 -> this.ilIlllilll.Iilllilliill();
         case 8 -> this.IiIlllilll.Iilllilliill();
         default -> false;
      };
   }

   private static int IlIllllIll(class_2586 blockEntity) {
      if (blockEntity instanceof class_2646) {
         return 0;
      } else if (blockEntity instanceof class_2595) {
         return 1;
      } else if (blockEntity instanceof class_2611) {
         return 2;
      } else if (blockEntity instanceof class_2636) {
         return 3;
      } else if (blockEntity instanceof class_2627) {
         return 4;
      } else if (blockEntity instanceof class_3866) {
         return 5;
      } else if (blockEntity instanceof class_3719) {
         return (
               ((1824260093 >>> 29 | 1824260093 << 3) >>> 1 | (1824260093 >>> 29 | 1824260093 << 3) << 31) << 11
                  | ((1824260093 >>> 29 | 1824260093 << 3) >>> 1 | (1824260093 >>> 29 | 1824260093 << 3) << 31) >>> 21
            )
            ^ -53
            ^ -2147462566;
      } else if (blockEntity instanceof class_2605) {
         return ((1531225327 ^ 51) - -29 - -97 >>> 13 | (1531225327 ^ 51) - -29 - -97 << 19) ^ 718461474;
      } else {
         return blockEntity instanceof class_2669 ? ~(((1848824481 >>> 25 | 1848824481 << 7) + -55) * -2083697005) ^ 1535100535 : -1;
      }
   }
}
