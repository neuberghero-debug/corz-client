package gg.corz;

import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class iiIlIillIIllIill extends ilIllIiIll {
   private final IIIIlilllIIIlill IlllIilill;
   private final iliiliilIiiiliil IiIlIilill;
   private final IIIIlilllIIIlill iiIlIilill;
   private final IIIIlilllIIIlill lIllIilill;
   private final IIIIlilllIIIlill IIllIilill;
   private final lliliIIiililiIIi llIlIilill = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","bmhe2nyJ/AxTJ00Y9C6yY9CHwgCDgZjKt6IXGmp+PoI=">(),
      IliIlllilIi<"IliIlllilIi","ex76SfgGAwLFx93hCOLnuGJaUY53dcmKS2ehRM8OiBBVxV+JCko+IvpOyG+a/yHm">(),
      IliIlllilIi<"IliIlllilIi","NSuSYGieVgyYHjvEOV0+x0jH8JB43hK8p1fFLAMNZ4gFkS3mQBxpP2Yr">(),
      IliIlllilIi<"IliIlllilIi","KzO4Dy6PDRPZW/HjDqI+OGsXEYUB56oR3TKbamKdiA1iD6M=">(),
      IliIlllilIi<"IliIlllilIi","p5Kr80Rf+JQyZ2KCeCTC/4sSIUz5rBxnu4pjgZQR2Hc=">(),
      IliIlllilIi<"IliIlllilIi","NSuSYGieVgyYHjvEOV0+x0jH8JB43hK8p1fFLAMNZ4gFkS3mQBxpP2Yr">(),
      IliIlllilIi<"IliIlllilIi","vbDyYPJcKfl4KfDy6oMp81SKDZ8t/HslJspJ64NVNfM=">(),
      IliIlllilIi<"IliIlllilIi","IIFKUrhjX39cHmW4VsaBWv6lTk6HYLAJpw01M8dC/7F9jw==">()
   );
   private final lliliIIiililiIIi ilIlIilill = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","awGX8hsoLvONS+9aHNqBEu/Ret2L64mR07z2EbovnE+7">(),
      IliIlllilIi<"IliIlllilIi","34VpIC1vbcID/unDyZ3y6knaW2RhCvtnOyH03J4bFAVyH8yzr9/RNfc=">(),
      IliIlllilIi<"IliIlllilIi","NHUNYtrDPRMkK6I20m0N/0hZXebDaDFWSSOoeMiN4m9s">(),
      IliIlllilIi<"IliIlllilIi","N2K/HvjEbH67rzOeOcpx24130+4WgHTnVw/mumRM66/5zg==">(),
      IliIlllilIi<"IliIlllilIi","A44AI/cgQj6Nop1I3U+pa60kOjRkLmsGsq9h1K7+GAidWnlM">(),
      IliIlllilIi<"IliIlllilIi","fltJ3RxEmZRX256Akm18vFhwvhz3kHhaj2oyVT/rPRh2yB4=">(),
      IliIlllilIi<"IliIlllilIi","NHUNYtrDPRMkK6I20m0N/0hZXebDaDFWSSOoeMiN4m9s">()
   );
   private final iliiliilIiiiliil liIlIilill;
   private final IIIIlilllIIIlill iIllIilill;

   private int ilIllIiIll() {
      float var1 = (float)this.IlllIilill.Iilllilliill();
      String var2 = this.ilIlIilill.Iilllilliill();

      return switch (var2) {
         case IliIlllilIi<"IliIlllilIi","N2K/HvjEbH67rzOeOcpx24130+4WgHTnVw/mumRM66/5zg==">() -> this.IiIlIilill.Iilllilliill();
         case IliIlllilIi<"IliIlllilIi","A44AI/cgQj6Nop1I3U+pa60kOjRkLmsGsq9h1K7+GAidWnlM">() -> iIillliIlillli.Iiilliiliiil(
         this.IiIlIilill.Iilllilliill(), this.liIlIilill.Iilllilliill(), var1, 0.0F
      );
         case IliIlllilIi<"IliIlllilIi","fltJ3RxEmZRX256Akm18vFhwvhz3kHhaj2oyVT/rPRh2yB4=">() -> iIillliIlillli.lIiiIiIlilli(var1, 0.0F);
         default -> IlIIilIlllIIilIl.lliiIlliIl;
      };
   }

   private static float[] IlIllllIll(class_238 box) {
      class_243 var1 = Iiiilllliiilll.method_1561().field_4686.method_71156();
      float[] var10000 = new float[(-1193990058 * -1631000239 + 45) * 31 ^ 1990796027];
      var10000[0] = (float)(box.field_1323 - var1.method_10216());
      var10000[1] = (float)(box.field_1322 - var1.method_10214());
      var10000[2] = (float)(box.field_1321 - var1.method_10215());
      var10000[3] = (float)(box.field_1320 - var1.method_10216());
      var10000[4] = (float)(box.field_1325 - var1.method_10214());
      var10000[5] = (float)(box.field_1324 - var1.method_10215());
      return var10000;
   }

   public static void iiiIlIIIll(class_4587 c, class_238 box, int lineWidth, double stack) {
      float[] var5 = IlIllllIll(box);
      iIiiIIilIliiIIil.iIIIlIlIIl(c.method_23760().method_23761(), var5[0], var5[1], var5[2], var5[3], var5[4], var5[5], lineWidth, (float)stack);
   }

   public static void lIIlliIIll(class_4587 c, class_238 box, int stack) {
      float[] var3 = IlIllllIll(box);
      iIiiIIilIliiIIil.IIlilIliiIli(
         c.method_23760().method_23761(),
         var3[0],
         var3[1],
         var3[2],
         var3[3],
         var3[4],
         var3[5],
         iIillliIlillli.IiIiliIiiiIi(stack),
         iIillliIlillli.IIlilIliiIli(stack),
         iIillliIlillli.Illillliilli(stack),
         iIillliIlillli.Iilililiiili(stack)
      );
   }

   private void liIlliiIll(Matrix4f m, float[] b, int width, float argb, boolean shader) {
      if (shader) {
         this.IIllllIlll(m, b, argb, iIillliIlillli.Iilililiiili(width));
      } else {
         iIiiIIilIliiIIil.iIIIlIlIIl(m, b[0], b[1], b[2], b[3], b[4], b[5], width, argb);
      }
   }

   @Override
   public void IIiilIiiiIii(illlllIillll event) {
      if (!lilIliIiiilIliIi.iiiIlIIIll() && !iIIlIllIlIlIll.IIIllIIliIIl()) {
         if (Iiiilllliiilll.field_1765 instanceof class_3965 var2 && Iiiilllliiilll.field_1687 != null) {
            class_265 var16 = Iiiilllliiilll.field_1687.method_8320(var2.method_17777()).method_26218(Iiiilllliiilll.field_1687, var2.method_17777());
            if (var16.method_1110()) {
               return;
            }

            class_238 var4 = var16.method_1107().method_996(var2.method_17777());
            float[] var5 = IlIllllIll(var4);
            Matrix4f var6 = event.IliiiIIilliiiIIi.method_23760().method_23761();
            String var7 = this.llIlIilill.Iilllilliill();
            boolean var8 = var7.equals(IliIlllilIi<"IliIlllilIi","p5Kr80Rf+JQyZ2KCeCTC/4sSIUz5rBxnu4pjgZQR2Hc=">())
               || var7.equals(IliIlllilIi<"IliIlllilIi","NSuSYGieVgyYHjvEOV0+x0jH8JB43hK8p1fFLAMNZ4gFkS3mQBxpP2Yr">())
               || var7.equals(IliIlllilIi<"IliIlllilIi","vbDyYPJcKfl4KfDy6oMp81SKDZ8t/HslJspJ64NVNfM=">())
               || var7.equals(IliIlllilIi<"IliIlllilIi","IIFKUrhjX39cHmW4VsaBWv6lTk6HYLAJpw01M8dC/7F9jw==">());
            boolean var9 = !var7.equals(IliIlllilIi<"IliIlllilIi","p5Kr80Rf+JQyZ2KCeCTC/4sSIUz5rBxnu4pjgZQR2Hc=">());
            boolean var10 = var7.equals(IliIlllilIi<"IliIlllilIi","IIFKUrhjX39cHmW4VsaBWv6lTk6HYLAJpw01M8dC/7F9jw==">());
            boolean var11 = var7.equals(IliIlllilIi<"IliIlllilIi","vbDyYPJcKfl4KfDy6oMp81SKDZ8t/HslJspJ64NVNfM=">()) || var10;
            int var12 = this.ilIllIiIll();
            if (var8) {
               int var13 = iIillliIlillli.IIIilIIiiIIi(var12, (float)this.iiIlIilill.Iilllilliill());
               iIiiIIilIliiIIil.IIlilIliiIli(
                  var6,
                  var5[0],
                  var5[1],
                  var5[2],
                  var5[3],
                  var5[4],
                  var5[5],
                  iIillliIlillli.IiIiliIiiiIi(var13),
                  iIillliIlillli.IIlilIliiIli(var13),
                  iIillliIlillli.Illillliilli(var13),
                  iIillliIlillli.Iilililiiili(var13)
               );
            }

            if (var9) {
               float var17 = (float)this.lIllIilill.Iilllilliill();
               float var14 = (float)this.IIllIilill.Iilllilliill();
               if (var11 && this.iIllIilill.Iilllilliill() > 0.001) {
                  float var15 = (float)this.iIllIilill.Iilllilliill();
                  this.liIlliiIll(var6, var5, iIillliIlillli.IIIilIIiiIIi(var12, 0.1F * var15 * var14), var17 * 3.2F, var10);
                  this.liIlliiIll(var6, var5, iIillliIlillli.IIIilIIiiIIi(var12, 0.2F * var15 * var14), var17 * 1.9F, var10);
               }

               if (var10) {
                  this.IIllllIlll(var6, var5, var17, var14);
               } else {
                  iIiiIIilIliiIIil.iIIIlIlIIl(var6, var5[0], var5[1], var5[2], var5[3], var5[4], var5[5], iIillliIlillli.IIIilIIiiIIi(var12, var14), var17);
               }
            }

            iIiiIIilIliiIIil.IiIiliIiiiIi();
            return;
         }
      }
   }

   @Override
   public void Iilililiiili() {
   }

   private void IIllllIlll(Matrix4f m, float[] width, float alpha, float b) {
      float var5 = (float)this.IlllIilill.Iilllilliill();
      float var6 = width[0];
      float var7 = width[1];
      float var8 = width[2];
      float var9 = width[3];
      float var10 = width[4];
      float var11 = width[5];
      float[][] var12 = new float[][]{
         {var6, var7, var8, var9, var7, var8},
         {var9, var7, var8, var9, var7, var11},
         {var9, var7, var11, var6, var7, var11},
         {var6, var7, var11, var6, var7, var8},
         {var6, var10, var8, var9, var10, var8},
         {var9, var10, var8, var9, var10, var11},
         {var9, var10, var11, var6, var10, var11},
         {var6, var10, var11, var6, var10, var8},
         {var6, var7, var8, var6, var10, var8},
         {var9, var7, var8, var9, var10, var8},
         {var9, var7, var11, var9, var10, var11},
         {var6, var7, var11, var6, var10, var11}
      };

      for (int var13 = 0; var13 < var12.length; var13++) {
         int var14 = iIillliIlillli.IIIilIIiiIIi(iIillliIlillli.lIiiIiIlilli(var5, (float)var13 * 0.06F), b);
         int var15 = iIillliIlillli.IIIilIIiiIIi(iIillliIlillli.lIiiIiIlilli(var5, (float)(var13 + 1) * 0.06F), b);
         iIiiIIilIliiIIil.Iiiiliiiiiii(
            m, var12[var13][0], var12[var13][1], var12[var13][2], var12[var13][3], var12[var13][4], var12[var13][5], var14, var15, alpha
         );
      }
   }

   public iiIlIillIIllIill() {
      super(IliIlllilIi<"IliIlllilIi","+Elt3PvZ759gjFZxsD2SVXM6ETuvAuiKXQXWgMjIklnMH6OYsxPbHD4=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IiIlIilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","CIPTZ2UMmWmFepu4qRyARIFr9PWCiisllUXGBE7W4SPzoLEjIRUCBA4=">(),
         IliIlllilIi<"IliIlllilIi","k07vvmtRTYU/e05XQVFuk+A8TVJ69uOCJbLjRkVTjf4VnzPWWM7yfL5rXIauCy8QDg7GZZAv0YQN2zk=">(),
         -11884289
      );
      this.liIlIilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","dcYSt4KK3uKvOd8iYn80o6eOGcV2wNTDXBQbiZUVjoJkrEvWj9sD2lK1aQ==">(),
         IliIlllilIi<"IliIlllilIi","9DToir9aUj57kh/fDSPOJOQDBzy/yO/UR/tMICF32y2h8QFarIboTmI3pnoM9uR25xVEFQ==">(),
         -4961537
      );
      this.iiIlIilill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","AgP9Om07Yqr1oU5cktlJhqibBgvlIA/jmuxSxuGOyQBb0j+7vPU=">(),
         IliIlllilIi<"IliIlllilIi","ptfdZc8G5e9Ba9cAT9VmqfTVtK8aCdJBUo4/wekkyrtS2PYR06inrOSoDCyvS49HBRvnAw==">(),
         0.22,
         0.0,
         1.0,
         0.02
      );
      this.IIllIilill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","yn/8r4WHNOjjAGSBh6IbpDkTS/zkF0b1qTMnlMmwaFLzar+0jJpwC4A=">(),
         IliIlllilIi<"IliIlllilIi","4KhJ/OFRpoFTVOMWW+eLpL6pOkN7hloWGUYdznWBZ+GDzyOjhh2woHbS4g==">(),
         0.95,
         0.0,
         1.0,
         0.02
      );
      this.lIllIilill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","RGN6WuH+ZxVhXzypu4foO0oHXOYbMb12lNmD0zgNuBN/4wv2x40=">(),
         IliIlllilIi<"IliIlllilIi","cyZCVmDykPcEkBHMNio0eWeo+YMy9xu+a2pSskCt80b5UYVLSg3J1d1Zy1ZOhJgCAnc=">(),
         2.0,
         0.5,
         5.0,
         0.5
      );
      this.iIllIilill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","57QNUUPX9KWR36aLYxRF7voABDIGXH2qpxYuZYBk3E5IBe7QXlSRF14=">(),
         IliIlllilIi<"IliIlllilIi","ou51IOZU+cEi+4PcamazDVZ3oCRuLVQ093kIBEY6KTOJdlxalgKv8N+COdtnbJwAd+/Uu5STgn6Myzg=">(),
         0.5,
         0.0,
         1.0,
         0.05
      );
      this.IlllIilill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","N6P0lNu8BMWbCQr9zW2FcRdu9am9tz0veX5WRDlZkat5ceC7tF6JiN86PQ==">(),
         IliIlllilIi<"IliIlllilIi","QqjbEpx0ZHdzno6wul6brgHPthZFK4/UtbyLGZ8fnksHH5wc/G4J96pnKyh52DZEKD7KDw==">(),
         1.0,
         0.0,
         5.0,
         0.1
      );
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.llIlIilill,
            this.ilIlIilill,
            this.IiIlIilill,
            this.liIlIilill,
            this.iiIlIilill,
            this.IIllIilill,
            this.lIllIilill,
            this.iIllIilill,
            this.IlllIilill
         }
      );
   }

   @Override
   public void Illillliilli() {
   }
}
