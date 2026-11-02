package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;

public class IillIIllillIIl {
   private final IIIIlilllIIIlill IiIilliIlliIilliIl;
   private int illilliIlIililliIl;
   private static final int IIIilliIllIIilliIl = 4;
   private final liIliIliiIliIl iiIilliIlIIlilliIl;
   private final liIliIliiIliIl lIlilliIliIlilliIl;
   private static final int liillliIliiillliIl = 4;
   private boolean iIiilliIlIliilliIl = false;
   private int IllilliIllllilliIl;
   private int lililliIliililliIl;
   private static final int iIIilliIlIlIilliIl = 9;
   private static final int ilillliIlIiillliIl = 4;
   private int IIiilliIllIiilliIl;
   private static final int llIilliIlilIilliIl = 9;

   public void IliIlllilIi(class_332 mouseY, int mouseX, int ctx) {
      long var20 = -4940200736875643194L;
      long var22 = -5657363511536180715L;
      long var24 = 1556838029142478412L;
      long var26 = -4332410399508176204L;
      String var4 = this.IiIilliIlliIilliIl.IliIlllilIi()
         + IIlllIlliIll<"IIlllIlliIll","huCK5FSqG/L3PpoRSpZpV6PQ4mOUsigdNAmOkpUE">()
         + String.format(IIlllIlliIll<"IIlllIlliIll","+rshkUxh7w3j0t07cQKw9na065npk6LyIeoIOGP1NCE=">(), this.IiIilliIlliIilliIl.Iilllilliill());
      CorzClient.fontRenderer().IliIlllilIi(var4, (float)(this.IllilliIllllilliIl + 4), (float)(this.illilliIlIililliIl + 4), new Color(-3947581));
      var20 ^= ((long)(this.IllilliIllllilliIl + 4) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)(this.illilliIlIililliIl + 4 + 9 + 9) ^ var20) & -1L >>> 32;
      var22 ^= ((long)(this.lililliIliililliIl - 8) << 32 ^ var22) & -1L << 32;
      var22 ^= (
            (long)(
                  mouseX >= (int)(var20 >>> 32) && mouseX <= (int)(var20 >>> 32) + (int)(var22 >>> 32) && ctx >= (int)var20 - 4 && ctx <= (int)var20 + 4 + 4
                     ? 1
                     : 0
               )
               ^ var22
         )
         & -1L >>> 32;
      this.lIlilliIliIlilliIl.lIiiIiIlilli((int)var22 == 0 && !this.iIiilliIlIliilliIl ? 0.0 : 1.0);
      double var9 = this.lIlilliIliIlilliIl.iIlIlllllill();
      IIiIllIllIiIllIl.Iilllilliill(mouseY, (int)(var20 >>> 32), (int)var20, (int)(var22 >>> 32), 4);
      double var11 = this.IiIilliIlliIilliIl.Iilllilliill();
      if (Math.abs(this.iiIilliIlIIlilliIl.IiIlliIliiIl() - var11) > 0.001) {
         this.iiIilliIlIIlilliIl.lIiiIiIlilli(var11);
      }

      double var13 = this.iiIilliIlIIlilliIl.iIlIlllllill();
      double var15 = (var13 - this.IiIilliIlliIilliIl.Ililllililil()) / (this.IiIilliIlliIilliIl.Iiilliiliiil() - this.IiIilliIlliIilliIl.Ililllililil());
      var24 ^= ((long)((int)(var15 * (double)((int)(var22 >>> 32)))) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)((int)(var20 >>> 32) + (int)(var24 >>> 32)) ^ var24) & -1L >>> 32;
      var26 ^= ((long)((int)var20 + 2) << 32 ^ var26) & -1L << 32;
      IIiIllIllIiIllIl.IIillIiliIil(mouseY, (int)(var20 >>> 32), (int)var20, (int)(var24 >>> 32), 4);
      IIiIllIllIiIllIl.Ililllililil(mouseY, (int)var24, (int)(var26 >>> 32), 4, Math.max(var9, this.iIiilliIlIliilliIl ? 1.0 : 0.0));
   }

   public void iliIiiliiiii(int width, int y, int height, int x) {
      this.IllilliIllllilliIl = width;
      this.illilliIlIililliIl = y;
      this.lililliIliililliIl = height;
      this.IIiilliIllIiilliIl = x;
   }

   public boolean IiIlliIliiIl() {
      return this.iIiilliIlIliilliIl;
   }

   public boolean liiiIIllIl(double button, double mouseY, int mouseX) {
      long var9 = 1194144106778434028L;
      long var11 = -6138636577052765823L;
      if (mouseX != 0) {
         return false;
      } else {
         var9 ^= ((long)(this.IllilliIllllilliIl + 4) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)(this.illilliIlIililliIl + 4 + 9 + 9) ^ var9) & -1L >>> 32;
         var11 ^= ((long)(this.lililliIliililliIl - 8) << 32 ^ var11) & -1L << 32;
         if (button >= (double)((int)(var9 >>> 32))
            && button <= (double)((int)(var9 >>> 32) + (int)(var11 >>> 32))
            && mouseY >= (double)((int)var9 - 4)
            && mouseY <= (double)((int)var9 + 4 + 4)) {
            this.iIiilliIlIliilliIl = true;
            this.lIiiIiIlilli(button);
            return true;
         } else {
            return false;
         }
      }
   }

   public int IlIlllIlilIl() {
      return this.IIiilliIllIiilliIl;
   }

   private void lIiiIiIlilli(double mouseX) {
      long var15 = 7191043613968933238L;
      var15 ^= ((long)(this.IllilliIllllilliIl + 4) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(this.lililliIliililliIl - 8) ^ var15) & -1L >>> 32;
      double var5 = (mouseX - (double)((int)(var15 >>> 32))) / (double)((int)var15);
      var5 = Math.max(0.0, Math.min(1.0, var5));
      double var7 = this.IiIilliIlliIilliIl.Iiilliiliiil() - this.IiIilliIlliIilliIl.Ililllililil();
      double var9 = this.IiIilliIlliIilliIl.Ililllililil() + var5 * var7;
      double var11 = this.IiIilliIlliIilliIl.IlIillIiilIi();
      double var13 = (double)Math.round(var9 / var11) * var11;
      var13 = Math.max(this.IiIilliIlliIilliIl.Ililllililil(), Math.min(this.IiIilliIlliIilliIl.Iiilliiliiil(), var13));
      this.IiIilliIlliIilliIl.IIillIiliIil(var13);
   }

   public void IilliliilIIi(double button, double mouseX, int mouseY) {
      if (mouseY == 0) {
         this.iIiilliIlIliilliIl = false;
      }
   }

   public boolean IIIllIIliIIl(double mouseY, double mouseX) {
      return mouseY >= (double)this.IllilliIllllilliIl
         && mouseY <= (double)(this.IllilliIllllilliIl + this.lililliIliililliIl)
         && mouseX >= (double)this.illilliIlIililliIl
         && mouseX <= (double)(this.illilliIlIililliIl + this.IIiilliIllIiilliIl);
   }

   public IillIIllillIIl(IIIIlilllIIIlill y, int height, int width, int setting, int x) {
      this.IiIilliIlliIilliIl = y;
      this.IllilliIllllilliIl = height;
      this.illilliIlIililliIl = width;
      this.lililliIliililliIl = setting;
      this.IIiilliIllIiilliIl = x;
      this.iiIilliIlIIlilliIl = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 250, y.Iilllilliill());
      this.lIlilliIliIlilliIl = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, 0.0);
   }

   public void iIlIlllllill(double mouseX, double mouseY, int button) {
      if (this.iIiilliIlIliilliIl) {
         this.lIiiIiIlilli(mouseX);
      }
   }
}
