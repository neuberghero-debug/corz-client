package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;

public class iilIIIiIIiIIIi {
   private boolean IililIililililIili = false;
   private static final int iiillIiliIIIilIili = 4;
   private int liIilIiliiiIilIili;
   private int lllilIiliillilIili;
   private final liIliIliiIliIl ilIilIiliIiIilIili;
   private static final int IiillIililiillIili = 4;
   private int IIlilIililIlilIili;
   private int iIlilIiliIllilIili;
   private final liIliIliiIliIl IlIilIilillIilIili;
   private final iiIiiilIIliiil lIIilIiliiIIilIili;

   public boolean iliIiiliiiii(double mouseY, double mouseX, int button) {
      if (button == 0 && this.IIIllIIliIIl(mouseY, mouseX)) {
         this.lIIilIiliiIIilIili.Ililllililil();
         return true;
      } else {
         return false;
      }
   }

   private void iIlIlllllill(class_332 cy, int ctx, int cx, int color, int r) {
      IIIiiIillIIiiIil.lIiiIiIlilli(cy, ctx - color, cx - color, color * 2, color * 2, color, r);
   }

   private void IilliliilIIi(class_332 hoverProgress, double toggleProgress, double ctx) {
      long var16 = -5918492431040374327L;
      long var18 = -6434007749153314052L;
      long var14 = 4770751944116628455L;
      double var6 = lIiiIiIlilli(toggleProgress);
      var14 ^= (21474836480L ^ var14) & -1L << 32;
      var14 ^= ((long)(this.liIilIiliiiIilIili + this.iIlilIiliIllilIili - 4 - (int)(var14 >>> 32)) ^ var14) & -1L >>> 32;
      var16 ^= ((long)(this.IIlilIililIlilIili + this.lllilIiliillilIili / 2) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-14012614, IilIIIIililIIIIi.IIlllIlliIll(0.55), var6) ^ var16) & -1L >>> 32;
      var18 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-9669504, IlIIilIlllIIilIl.lliiIlliIl, var6) << 32 ^ var18) & -1L << 32;
      if (ctx > 0.004) {
         var18 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)(var18 >>> 32), -1, 0.12 * ctx) << 32 ^ var18) & -1L << 32;
      }

      IIIiiIillIIiiIil.lIiiIiIlilli(
         hoverProgress,
         (int)var14 - (int)(var14 >>> 32),
         (int)(var16 >>> 32) - (int)(var14 >>> 32),
         (int)(var14 >>> 32) * 2,
         (int)(var14 >>> 32) * 2,
         (int)(var14 >>> 32),
         (int)var16
      );
      var18 ^= ((long)((int)(var14 >>> 32) - 2) ^ var18) & -1L >>> 32;
      IIIiiIillIIiiIil.lIiiIiIlilli(
         hoverProgress, (int)var14 - (int)var18, (int)(var16 >>> 32) - (int)var18, (int)var18 * 2, (int)var18 * 2, (int)var18, (int)(var18 >>> 32)
      );
   }

   public boolean IIIllIIliIIl(double mouseY, double mouseX) {
      long var6 = 8338606814284634985L;
      var6 ^= ((long)(this.liIilIiliiiIilIili + this.iIlilIiliIllilIili - 4 - iIiIIlIiIliIIlIi.IliIlllilIi() - 2) << 32 ^ var6) & -1L << 32;
      return mouseY >= (double)((int)(var6 >>> 32))
         && mouseY <= (double)(this.liIilIiliiiIilIili + this.iIlilIiliIllilIili)
         && mouseX >= (double)this.IIlilIililIlilIili
         && mouseX <= (double)(this.IIlilIililIlilIili + this.lllilIiliillilIili);
   }

   public void IliIlllilIi(class_332 mouseX, int mouseY, int ctx) {
      long var12 = 2081023935475935642L;
      CorzClient.fontRenderer()
         .IliIlllilIi(
            this.lIIilIiliiIIilIili.IliIlllilIi(),
            (float)(this.liIilIiliiiIilIili + 4),
            (float)CorzClient.fontRenderer().IlIillIiilIi(this.IIlilIililIlilIili, this.lllilIiliillilIili),
            new Color(-3947581)
         );
      var12 ^= ((long)this.lIIilIiliiIIilIili.Iilllilliill() << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)this.IIIllIIliIIl((double)mouseY, (double)ctx) ^ var12) & -1L >>> 32;
      double var6 = (int)(var12 >>> 32) != 0 ? 1.0 : 0.0;
      if (Math.abs(this.IlIilIilillIilIili.IiIlliIliiIl() - var6) > 0.01) {
         this.IlIilIilillIilIili.lIiiIiIlilli(var6);
      }

      double var8 = this.IlIilIilillIilIili.iIlIlllllill();
      if ((int)var12 != 0 && !this.IililIililililIili) {
         this.IililIililililIili = true;
         this.ilIilIiliIiIilIili.lIiiIiIlilli(1.0);
      } else if ((int)var12 == 0 && this.IililIililililIili) {
         this.IililIililililIili = false;
         this.ilIilIiliIiIilIili.lIiiIiIlilli(0.0);
      }

      double var10 = this.ilIilIiliIiIilIili.iIlIlllllill();
      if (Iiliililliliilil.iiIillllil) {
         this.liiiIIllIl(mouseX, var8, var10);
      } else {
         this.IilliliilIIi(mouseX, var8, var10);
      }
   }

   private static double lIiiIiIlilli(double v) {
      return v < 0.0 ? 0.0 : (v > 1.0 ? 1.0 : v);
   }

   public void IiIlliIliiIl(int y, int height, int width, int x) {
      this.liIilIiliiiIilIili = y;
      this.IIlilIililIlilIili = height;
      this.iIlilIiliIllilIili = width;
      this.lllilIiliillilIili = x;
   }

   public iilIIIiIIiIIIi(iiIiiilIIliiil y, int height, int x, int width, int setting) {
      this.lIIilIiliiIIilIili = y;
      this.liIilIiliiiIilIili = height;
      this.IIlilIililIlilIili = x;
      this.iIlilIiliIllilIili = width;
      this.lllilIiliillilIili = setting;
      this.IlIilIilillIilIili = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 300, y.Iilllilliill() ? 1.0 : 0.0);
      this.ilIilIiliIiIilIili = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, 0.0);
   }

   public int IlIlllIlilIl() {
      return this.lllilIiliillilIili;
   }

   private void liiiIIllIl(class_332 ctx, double toggleProgress, double hoverProgress) {
      iIiIIlIiIliIIlIi.iliIiiliiiii(
         ctx, this.liIilIiliiiIilIili + this.iIlilIiliIllilIili, this.IIlilIililIlilIili, this.lllilIiliillilIili, 4, toggleProgress, hoverProgress
      );
   }
}
