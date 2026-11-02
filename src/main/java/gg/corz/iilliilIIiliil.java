package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;

public class iilliilIIiliil {
   private boolean IlIlIlllillIlIllli = false;
   private int IiiIIllliliiIIllli;
   private final liIliIliiIliIl IIiIIlllilIiIIllli;
   private static final int lIlIIllliiIlIIllli = 4;
   private static final int IiIIIllliliIIIllli = 4;
   private final liIliIliiIliIl iIiIIllliIliIIllli;
   private final iilliIlIIiliIl lilIIllliiilIIllli;
   private static final int iiIIIllliIIlIIllli = 4;
   private int iiiIIllliIIIlIllli;
   private int lliIIllliiliIIllli;
   private int lIIlIllliiIIlIllli;
   private static final int illIIllliIilIIllli = 9;
   private static final int IllIIlllilllIIllli = 9;

   public void IliIlllilIi(class_332 ctx, int mouseY, int mouseX) {
      long var20 = -5187270451293446134L;
      long var22 = -4071576448119847112L;
      long var24 = -4706013432221260266L;
      long var26 = -7865915406922425921L;
      String var4 = this.lilIIllliiilIIllli.IliIlllilIi()
         + IIlllIlliIll<"IIlllIlliIll","tj2HC9NzFI57PhTxJw0uuoPMwUUK22Eh2zNcA1y0">()
         + this.lilIIllliiilIIllli.Iilllilliill();
      CorzClient.fontRenderer().IliIlllilIi(var4, (float)(this.lliIIllliiliIIllli + 4), (float)(this.IiiIIllliliiIIllli + 4), new Color(-3947581));
      String var5 = this.lilIIllliiilIIllli.IIlilIliiIli();
      if (var5 != null) {
         var20 ^= ((long)((int)CorzClient.fontRenderer().iIlIlllllill(var4)) << 32 ^ var20) & -1L << 32;
         CorzClient.fontRenderer()
            .IliIlllilIi(var5, (float)(this.lliIIllliiliIIllli + 4 + (int)(var20 >>> 32) + 5), (float)(this.IiiIIllliliiIIllli + 4), new Color(235, 96, 92));
      }

      var20 ^= ((long)(this.lliIIllliiliIIllli + 4) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)(this.IiiIIllliliiIIllli + 4 + 9 + 9) ^ var20) & -1L >>> 32;
      var22 ^= ((long)(this.iiiIIllliIIIlIllli - 8) << 32 ^ var22) & -1L << 32;
      var22 ^= (
            (long)(
                  mouseY >= (int)(var20 >>> 32)
                        && mouseY <= (int)(var20 >>> 32) + (int)(var22 >>> 32)
                        && mouseX >= (int)var20 - 4
                        && mouseX <= (int)var20 + 4 + 4
                     ? 1
                     : 0
               )
               ^ var22
         )
         & -1L >>> 32;
      this.iIiIIllliIliIIllli.lIiiIiIlilli((int)var22 == 0 && !this.IlIlIlllillIlIllli ? 0.0 : 1.0);
      double var10 = this.iIiIIllliIliIIllli.iIlIlllllill();
      IIiIllIllIiIllIl.Iilllilliill(ctx, (int)(var20 >>> 32), (int)var20, (int)(var22 >>> 32), 4);
      double var12 = (double)this.lilIIllliiilIIllli.Iilllilliill();
      if (Math.abs(this.IIiIIlllilIiIIllli.IiIlliIliiIl() - var12) > 0.01) {
         this.IIiIIlllilIiIIllli.lIiiIiIlilli(var12);
      }

      double var14 = this.IIiIIlllilIiIIllli.iIlIlllllill();
      float var16 = (float)(var14 - (double)this.lilIIllliiilIIllli.Ililllililil())
         / (float)(this.lilIIllliiilIIllli.Iiilliiliiil() - this.lilIIllliiilIIllli.Ililllililil());
      var24 ^= ((long)((int)(var16 * (float)((int)(var22 >>> 32)))) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)((int)(var20 >>> 32) + (int)(var24 >>> 32)) ^ var24) & -1L >>> 32;
      var26 ^= ((long)((int)var20 + 2) << 32 ^ var26) & -1L << 32;
      IIiIllIllIiIllIl.IIillIiliIil(ctx, (int)(var20 >>> 32), (int)var20, (int)(var24 >>> 32), 4);
      IIiIllIllIiIllIl.Ililllililil(ctx, (int)var24, (int)(var26 >>> 32), 4, Math.max(var10, this.IlIlIlllillIlIllli ? 1.0 : 0.0));
   }

   public void iliIiiliiiii(int height, int y, int x, int width) {
      this.lliIIllliiliIIllli = height;
      this.IiiIIllliliiIIllli = y;
      this.iiiIIllliIIIlIllli = x;
      this.lIIlIllliiIIlIllli = width;
   }

   public boolean liiiIIllIl(double mouseY, double mouseX, int button) {
      long var9 = 1035463562430288447L;
      long var11 = 1549470391263767396L;
      if (button != 0) {
         return false;
      } else {
         var9 ^= ((long)(this.lliIIllliiliIIllli + 4) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)(this.IiiIIllliliiIIllli + 4 + 9 + 9) ^ var9) & -1L >>> 32;
         var11 ^= ((long)(this.iiiIIllliIIIlIllli - 8) << 32 ^ var11) & -1L << 32;
         if (mouseY >= (double)((int)(var9 >>> 32))
            && mouseY <= (double)((int)(var9 >>> 32) + (int)(var11 >>> 32))
            && mouseX >= (double)((int)var9 - 4)
            && mouseX <= (double)((int)var9 + 4 + 4)) {
            this.IlIlIlllillIlIllli = true;
            this.lIiiIiIlilli(mouseY);
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean IiIlliIliiIl() {
      return this.IlIlIlllillIlIllli;
   }

   public void IilliliilIIi(double button, double mouseX, int mouseY) {
      if (mouseY == 0) {
         this.IlIlIlllillIlIllli = false;
      }
   }

   public int IlIlllIlilIl() {
      return this.lIIlIllliiIIlIllli;
   }

   public boolean IIIllIIliIIl(double mouseY, double mouseX) {
      return mouseY >= (double)this.lliIIllliiliIIllli
         && mouseY <= (double)(this.lliIIllliiliIIllli + this.iiiIIllliIIIlIllli)
         && mouseX >= (double)this.IiiIIllliliiIIllli
         && mouseX <= (double)(this.IiiIIllliliiIIllli + this.lIIlIllliiIIlIllli);
   }

   public void iIlIlllllill(double mouseX, double mouseY, int button) {
      if (this.IlIlIlllillIlIllli) {
         this.lIiiIiIlilli(mouseX);
      }
   }

   private void lIiiIiIlilli(double mouseX) {
      long var11 = 6027086713611552195L;
      long var13 = 4569012085518583677L;
      long var15 = -7306082613493363833L;
      var11 ^= ((long)(this.lliIIllliiliIIllli + 4) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(this.iiiIIllliIIIlIllli - 8) ^ var11) & -1L >>> 32;
      double var5 = (mouseX - (double)((int)(var11 >>> 32))) / (double)((int)var11);
      var5 = Math.max(0.0, Math.min(1.0, var5));
      var13 ^= ((long)(this.lilIIllliiilIIllli.Iiilliiliiil() - this.lilIIllliiilIIllli.Ililllililil()) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)((int)((double)this.lilIIllliiilIIllli.Ililllililil() + var5 * (double)((int)(var13 >>> 32)))) ^ var13) & -1L >>> 32;
      var15 ^= ((long)this.lilIIllliiilIIllli.IlIillIiilIi() << 32 ^ var15) & -1L << 32;
      var15 ^= (
            (long)(((int)var13 - this.lilIIllliiilIIllli.Ililllililil()) / (int)(var15 >>> 32) * (int)(var15 >>> 32) + this.lilIIllliiilIIllli.Ililllililil())
               ^ var15
         )
         & -1L >>> 32;
      this.lilIIllliiilIIllli.IIillIiliIil((int)var15);
   }

   public iilliilIIiliil(iilliIlIIiliIl x, int setting, int height, int y, int width) {
      this.lilIIllliiilIIllli = x;
      this.lliIIllliiliIIllli = setting;
      this.IiiIIllliliiIIllli = height;
      this.iiiIIllliIIIlIllli = y;
      this.lIIlIllliiIIlIllli = width;
      this.IIiIIlllilIiIIllli = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 250, (double)x.Iilllilliill());
      this.iIiIIllliIliIIllli = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, 0.0);
   }
}
