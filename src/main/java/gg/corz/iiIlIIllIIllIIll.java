package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class iiIlIIllIIllIIll {
   private final liIliIliiIliIl illIIIllll;
   private static final int IIlIIIllll = 4;
   private static final float iIlIIIllll = 7.0F;
   private double iliIIIllll;
   private int IIiIIIllll;
   private int iilIIIllll;
   private static final int lIlIIIllll = 8;
   private int lIiIIIllll;
   private String iIiIIIllll;
   private String IliIIIllll;
   private final liIliIliiIliIl IilIIIllll;
   private static final int liIIIIllll = 4;
   private double lliIIIllll = 1.0;
   private static final int iiIIIIllll = 18;
   private int lilIIIllll;
   private final lliliIIiililiIIi lllIIIllll;
   private static final int IllIIIllll = 8;

   public iiIlIIllIIllIIll(lliliIIiililiIIi y, int width, int height, int x, int setting) {
      this.iliIIIllll = 1.0;
      this.lllIIIllll = y;
      this.lilIIIllll = width;
      this.iilIIIllll = height;
      this.IIiIIIllll = x;
      this.lIiIIIllll = setting;
      this.illIIIllll = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200, 0.0);
      this.IilIIIllll = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 180, 1.0);
      this.iIiIIIllll = y.Iilllilliill();
      this.IliIIIllll = null;
   }

   private int Illlllllilll(int color1, int t, double color2) {
      long var17 = -2755233232793168172L;
      long var19 = -7059509978861894932L;
      long var13 = -8362238066078955912L;
      long var15 = -1594971108510379609L;
      color2 = Math.max(0.0, Math.min(1.0, color2));
      var13 ^= ((long)(color1 >> 24 & 0xFF) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(color1 >> 16 & 0xFF) ^ var13) & -1L >>> 32;
      var15 ^= ((long)(color1 >> 8 & 0xFF) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(color1 & 0xFF) ^ var15) & -1L >>> 32;
      var17 ^= ((long)(t >> 24 & 0xFF) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)(t >> 16 & 0xFF) ^ var17) & -1L >>> 32;
      var19 ^= ((long)(t >> 8 & 0xFF) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)(t & 0xFF) ^ var19) & -1L >>> 32;
      return (int)((double)((int)(var13 >>> 32)) + (double)((int)(var17 >>> 32) - (int)(var13 >>> 32)) * color2) << 24
         | (int)((double)((int)var13) + (double)((int)var17 - (int)var13) * color2) << 16
         | (int)((double)((int)(var15 >>> 32)) + (double)((int)(var19 >>> 32) - (int)(var15 >>> 32)) * color2) << 8
         | (int)((double)((int)var15) + (double)((int)var19 - (int)var15) * color2);
   }

   private static int IIlllIlliIll(int rgb, int a) {
      return a << 24 | rgb & 16777215;
   }

   public int IlIlllIlilIl() {
      return this.lIiIIIllll;
   }

   private void iIlIlllllill(class_332 ctx, int pw, int py, int ph, int px, int p, double fh) {
      long var16 = 4277505391886019771L;
      long var18 = -4254643054763190527L;
      long var20 = 5528745464422185006L;
      var16 ^= ((long)((int)Math.ceil(3.5)) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)(pw + 8 + (int)(var16 >>> 32) + 3) ^ var16) & -1L >>> 32;
      var18 ^= ((long)(pw + ph - 8 - (int)(var16 >>> 32) - 3) << 32 ^ var18) & -1L << 32;
      if ((int)(var18 >>> 32) <= (int)var16) {
         var16 ^= ((long)(pw + 2) ^ var16) & -1L >>> 32;
         var18 ^= ((long)(pw + ph - 2) << 32 ^ var18) & -1L << 32;
      }

      var18 ^= ((long)CorzClient.fontRenderer().IlIillIiilIi(py, px) ^ var18) & -1L >>> 32;
      ctx.method_44379((int)var16, py, (int)(var18 >>> 32), py + px);

      try {
         if (this.IliIIIllll != null && fh < 0.999) {
            float var13 = (float)(-this.lliIIIllll * 8.0 * fh);
            this.IilliliilIIi(ctx, this.IliIIIllll, pw, ph, (int)var18, var13, -1, 1.0 - fh);
         }

         float var24 = (float)(this.lliIIIllll * 8.0 * (1.0 - fh));
         var20 ^= ((long)this.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, fh) << 32 ^ var20) & -1L << 32;
         this.IilliliilIIi(ctx, this.iIiIIIllll, pw, ph, (int)var18, var24, (int)(var20 >>> 32), fh);
      } finally {
         ctx.method_44380();
      }
   }

   public void IiIlliIliiIl(int x, int y, int height, int width) {
      this.lilIIIllll = x;
      this.iilIIIllll = y;
      this.IIiIIIllll = height;
      this.lIiIIIllll = width;
   }

   private void IilliliilIIi(class_332 v, String px, int xOff, int vy, int rgb, float pw, int ctx, double alpha) {
      long var14 = 6858389112740409161L;
      IIliiIlllIliiIll var10 = CorzClient.fontRenderer();
      var14 ^= ((long)((int)var10.iIlIlllllill(px)) << 32 ^ var14) & -1L << 32;
      float var12 = (float)xOff + (float)(vy - (int)(var14 >>> 32)) / 2.0F + pw;
      var14 ^= ((long)Math.max(0, Math.min(255, (int)Math.round(alpha * 255.0))) ^ var14) & -1L >>> 32;
      var10.IliIlllilIi(px, var12, (float)rgb, new Color(ctx >> 16 & 0xFF, ctx >> 8 & 0xFF, ctx & 0xFF, (int)var14));
   }

   public boolean iliIiiliiiii(double mouseY, double mouseX, int button) {
      long var11 = 7950842034502645450L;
      long var13 = -5297972318127596060L;
      if (button != 0) {
         return false;
      } else {
         int[] var6 = this.IliIlllilIi();
         var11 ^= ((long)var6[0] << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)var6[1] ^ var11) & -1L >>> 32;
         var13 ^= ((long)var6[2] << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)var6[3] ^ var13) & -1L >>> 32;
         if (mouseY >= (double)((int)(var11 >>> 32))
            && mouseY <= (double)((int)(var11 >>> 32) + (int)(var13 >>> 32))
            && mouseX >= (double)((int)var11)
            && mouseX <= (double)((int)var11 + (int)var13)) {
            if (mouseY < (double)((int)(var11 >>> 32)) + (double)((int)(var13 >>> 32)) / 2.0) {
               this.iliIIIllll = -1.0;
               this.lllIIIllll.Illillliilli();
            } else {
               this.iliIIIllll = 1.0;
               this.lllIIIllll.IIlilIliiIli();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   private int[] IliIlllilIi() {
      long var7 = -3245074625218838106L;
      long var9 = -2338283848724944768L;
      long var11 = -6064826425938736865L;
      IIliiIlllIliiIll var1 = CorzClient.fontRenderer();
      var7 ^= (0L ^ var7) & -1L << 32;

      for (String var4 : this.lllIIIllll.IiIiliIiiiIi()) {
         var7 ^= ((long)Math.max((int)(var7 >>> 32), (int)var1.iIlIlllllill(var4)) << 32 ^ var7) & -1L << 32;
      }

      var7 ^= ((long)Math.min(this.IIiIIIllll - 8, Math.max(92, (int)(var7 >>> 32) + 46)) ^ var7) & -1L >>> 32;
      var9 ^= ((long)(this.IIiIIIllll - 8 - (int)Math.ceil((double)var1.iIlIlllllill(this.lllIIIllll.IliIlllilIi())) - 6) << 32 ^ var9) & -1L << 32;
      if ((int)var7 > (int)(var9 >>> 32)) {
         var7 ^= ((long)Math.max((int)(var9 >>> 32), Math.min((int)var7, (int)(var7 >>> 32) + 34)) ^ var7) & -1L >>> 32;
      }

      var9 ^= ((long)(this.lilIIIllll + this.IIiIIIllll - 4 - (int)var7) ^ var9) & -1L >>> 32;
      var11 ^= ((long)(this.iilIIIllll + this.lIiIIIllll / 2 - 9) << 32 ^ var11) & -1L << 32;
      return new int[]{(int)var9, (int)(var11 >>> 32), (int)var7, 18};
   }

   public void liiiIIllIl(class_332 mouseY, int ctx, int mouseX) {
      long var22 = -1892292285788778853L;
      long var24 = 8726413851828732644L;
      long var26 = 8514311765588018692L;
      long var28 = 3106534381047142378L;
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      var22 ^= ((long)((int)var4.IilliliilIIi()) << 32 ^ var22) & -1L << 32;
      var4.IliIlllilIi(
         this.lllIIIllll.IliIlllilIi(), (float)(this.lilIIIllll + 4), (float)var4.IlIillIiilIi(this.iilIIIllll, this.lIiIIIllll), new Color(-3947581)
      );
      int[] var6 = this.IliIlllilIi();
      var22 ^= ((long)var6[0] ^ var22) & -1L >>> 32;
      var24 ^= ((long)var6[1] << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)var6[2] ^ var24) & -1L >>> 32;
      var26 ^= ((long)var6[3] << 32 ^ var26) & -1L << 32;
      var26 ^= (
            (long)(
                  ctx >= (int)var22 && ctx <= (int)var22 + (int)var24 && mouseX >= (int)(var24 >>> 32) && mouseX <= (int)(var24 >>> 32) + (int)(var26 >>> 32)
                     ? 1
                     : 0
               )
               ^ var26
         )
         & -1L >>> 32;
      double var12 = (int)var26 != 0 ? 1.0 : 0.0;
      if (Math.abs(this.illIIIllll.IiIlliIliiIl() - var12) > 0.01) {
         this.illIIIllll.lIiiIiIlilli(var12);
      }

      double var14 = this.illIIIllll.iIlIlllllill();
      String var16 = this.lllIIIllll.Iilllilliill();
      if (!var16.equals(this.iIiIIIllll)) {
         this.IliIIIllll = this.iIiIIIllll;
         this.iIiIIIllll = var16;
         this.lliIIIllll = this.iliIIIllll;
         this.IilIIIllll.IilliliilIIi(0.0);
         this.IilIIIllll.lIiiIiIlilli(1.0);
      }

      double var17 = this.IilIIIllll.iIlIlllllill();
      if (var17 >= 0.999) {
         this.IliIIIllll = null;
      }

      var28 ^= ((long)this.Illlllllilll(IIlllIlliIll(16777215, 18), IIlllIlliIll(IlIIilIlllIIilIl.lliiIlliIl, 160), var14) << 32 ^ var28) & -1L << 32;
      IIIiiIillIIiiIil.IIillIiliIil(mouseY, (int)var22, (int)(var24 >>> 32), (int)var24, (int)(var26 >>> 32), 4, -16448249, (int)(var28 >>> 32));
      var28 ^= ((long)((int)var26 != 0 && (double)ctx < (double)((int)var22) + (double)((int)var24) / 2.0 ? 1 : 0) ^ var28) & -1L >>> 32;
      float var21 = (float)((int)(var24 >>> 32)) + (float)((int)(var26 >>> 32)) / 2.0F;
      this.lIiiIiIlilli(mouseY, (float)((int)var22 + 8), var21, false, this.Illlllllilll(-8421505, IlIIilIlllIIilIl.lliiIlliIl, (int)var28 != 0 ? var14 : 0.0));
      this.lIiiIiIlilli(
         mouseY,
         (float)((int)var22 + (int)var24 - 8),
         var21,
         true,
         this.Illlllllilll(-8421505, IlIIilIlllIIilIl.lliiIlliIl, (int)var26 != 0 && (int)var28 == 0 ? var14 : 0.0)
      );
      this.iIlIlllllill(mouseY, (int)var22, (int)(var24 >>> 32), (int)var24, (int)(var26 >>> 32), (int)(var22 >>> 32), var17);
   }

   public boolean IIIllIIliIIl(double mouseX, double mouseY) {
      return mouseX >= (double)this.lilIIIllll
         && mouseX <= (double)(this.lilIIIllll + this.IIiIIIllll)
         && mouseY >= (double)this.iilIIIllll
         && mouseY <= (double)(this.iilIIIllll + this.lIiIIIllll);
   }

   private void lIiiIiIlilli(class_332 cy, float pointRight, float argb, boolean cx, int ctx) {
      if ((ctx >>> 24 & 0xFF) == 0) {
         ctx |= -16777216;
      }

      float var6 = 7.0F;
      float var7 = pointRight - var6 / 2.0F;
      float var8 = argb - var6 / 2.0F;
      Color var9 = new Color(ctx, true);
      class_4587 var10 = IIIiiIillIIiiIil.liiiIIllIl();
      if (cx) {
         iiIlilIlIIllilIl.IliIlllilIi(var7, var8, var6, var6, lIlIIiliIlIIil.IliIlllilIi(), var9, var10);
      } else {
         iiIlilIlIIllilIl.iIlIlllllill(var7, var8, var6, var6, 1.0F, 0.0F, 0.0F, 1.0F, lIlIIiliIlIIil.IliIlllilIi(), var9, var10);
      }
   }
}
