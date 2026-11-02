package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;

public class IIIiIIlilIIiIIli {
   private static final int liIlilIlIi = 4;
   private final liIliIliiIliIl llllilIlIi;
   private final liIliIliiIliIl IillilIlIi;
   private final liIliIliiIliIl illlilIlIi;
   private static final int iiIlilIlIi = 4;
   private int iillilIlIi;
   private boolean IlililIlIi = false;
   private final Iiiliillliiliill IlllilIlIi;
   private boolean llililIlIi = false;
   private static final int iIllilIlIi = 9;
   private static final int lIllilIlIi = 9;
   private final liIliIliiIliIl lillilIlIi;
   private static final int IIllilIlIi = 4;
   private int IIililIlIi;
   private int iIililIlIi;
   private int lIililIlIi;

   private void iliIiiliiiii(double mouseX) {
      double var3 = this.lIiiIiIlilli(mouseX);
      this.IlllilIlIi.IIillIiliIil(var3);
   }

   private void IIIllIIliIIl(double mouseX) {
      double var3 = this.lIiiIiIlilli(mouseX);
      this.IlllilIlIi.Iiilliiliiil(var3);
   }

   public IIIiIIlilIIiIIli(Iiiliillliiliill height, int x, int y, int width, int setting) {
      this.IlllilIlIi = height;
      this.iillilIlIi = x;
      this.IIililIlIi = y;
      this.lIililIlIi = width;
      this.iIililIlIi = setting;
      this.llllilIlIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 250, height.Iilllilliill());
      this.illlilIlIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 250, height.Ililllililil());
      this.IillilIlIi = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, 0.0);
      this.lillilIlIi = new liIliIliiIliIl(llIIIliilIIIli.iIillliiiIlillliii, 200, 0.0);
   }

   public boolean IiIlliIliiIl(double mouseX, double mouseY) {
      return mouseX >= (double)this.iillilIlIi
         && mouseX <= (double)(this.iillilIlIi + this.lIililIlIi)
         && mouseY >= (double)this.IIililIlIi
         && mouseY <= (double)(this.IIililIlIi + this.iIililIlIi);
   }

   public void iIlIlllllill(double mouseY, double mouseX, int button) {
      if (this.IlililIlIi || this.llililIlIi) {
         double var6 = this.lIiiIiIlilli(mouseY);
         double var8 = this.IlllilIlIi.IiIiliIiiiIi();
         if (this.IlililIlIi) {
            if (var6 > this.IlllilIlIi.Ililllililil() + var8 * 0.5) {
               this.IlililIlIi = false;
               this.llililIlIi = true;
               this.IIIllIIliIIl(mouseY);
            } else {
               this.iliIiiliiiii(mouseY);
            }
         } else {
            if (this.llililIlIi) {
               if (var6 < this.IlllilIlIi.Iilllilliill() - var8 * 0.5) {
                  this.llililIlIi = false;
                  this.IlililIlIi = true;
                  this.iliIiiliiiii(mouseY);
               } else {
                  this.IIIllIIliIIl(mouseY);
               }
            }
         }
      }
   }

   public int IIlllIlliIll() {
      return this.iIililIlIi;
   }

   public void IliIlllilIi(class_332 mouseY, int ctx, int mouseX) {
      long var33 = -4618420212318287754L;
      long var35 = 3270951324135092745L;
      long var27 = 572986142808775084L;
      long var29 = -2651308615450135915L;
      long var31 = -6386449565521392502L;
      String var4 = String.format(
         Iilllilliill<"Iilllilliill","aEYZKfTX8ZRkEt9BumQYGXKMBGXrC2oXo2auOUhpwyZmytVHOVmjmuKvWA==">(),
         this.IlllilIlIi.IliIlllilIi(),
         this.IlllilIlIi.Iilllilliill(),
         this.IlllilIlIi.Ililllililil()
      );
      CorzClient.fontRenderer().IliIlllilIi(var4, (float)(this.iillilIlIi + 4), (float)(this.IIililIlIi + 4), new Color(-3947581));
      var27 ^= ((long)(this.iillilIlIi + 4) << 32 ^ var27) & -1L << 32;
      var27 ^= ((long)(this.IIililIlIi + 4 + 9 + 9) ^ var27) & -1L >>> 32;
      var29 ^= ((long)(this.lIililIlIi - 8) << 32 ^ var29) & -1L << 32;
      IIiIllIllIiIllIl.Iilllilliill(mouseY, (int)(var27 >>> 32), (int)var27, (int)(var29 >>> 32), 4);
      if (Math.abs(this.llllilIlIi.IiIlliIliiIl() - this.IlllilIlIi.Iilllilliill()) > 0.001) {
         this.llllilIlIi.lIiiIiIlilli(this.IlllilIlIi.Iilllilliill());
      }

      if (Math.abs(this.illlilIlIi.IiIlliIliiIl() - this.IlllilIlIi.Ililllililil()) > 0.001) {
         this.illlilIlIi.lIiiIiIlilli(this.IlllilIlIi.Ililllililil());
      }

      double var8 = this.llllilIlIi.iIlIlllllill();
      double var10 = this.illlilIlIi.iIlIlllllill();
      double var12 = (var8 - this.IlllilIlIi.IIIilIIiiIIi()) / (this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi());
      double var14 = (var10 - this.IlllilIlIi.IIIilIIiiIIi()) / (this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi());
      var29 ^= ((long)((int)(var27 >>> 32) + (int)(var12 * (double)((int)(var29 >>> 32)))) ^ var29) & -1L >>> 32;
      var31 ^= ((long)((int)(var27 >>> 32) + (int)(var14 * (double)((int)(var29 >>> 32)))) << 32 ^ var31) & -1L << 32;
      var31 ^= ((long)((int)var27 + 2) ^ var31) & -1L >>> 32;
      var33 ^= ((long)(Math.abs(ctx - (int)var29) < 8 && Math.abs(mouseX - (int)var31) < 8 ? 1 : 0) << 32 ^ var33) & -1L << 32;
      var33 ^= ((long)(Math.abs(ctx - (int)(var31 >>> 32)) < 8 && Math.abs(mouseX - (int)var31) < 8 ? 1 : 0) ^ var33) & -1L >>> 32;
      this.IillilIlIi.lIiiIiIlilli((int)(var33 >>> 32) == 0 && !this.IlililIlIi ? 0.0 : 1.0);
      this.lillilIlIi.lIiiIiIlilli((int)var33 == 0 && !this.llililIlIi ? 0.0 : 1.0);
      double var21 = this.IillilIlIi.iIlIlllllill();
      double var23 = this.lillilIlIi.iIlIlllllill();
      var35 ^= ((long)Math.min((int)var29, (int)(var31 >>> 32)) << 32 ^ var35) & -1L << 32;
      var35 ^= ((long)Math.abs((int)(var31 >>> 32) - (int)var29) ^ var35) & -1L >>> 32;
      IIiIllIllIiIllIl.IIillIiliIil(mouseY, (int)(var35 >>> 32), (int)var27, (int)var35, 4);
      IIiIllIllIiIllIl.Ililllililil(mouseY, (int)var29, (int)var31, 4, Math.max(var21, this.IlililIlIi ? 1.0 : 0.0));
      IIiIllIllIiIllIl.Ililllililil(mouseY, (int)(var31 >>> 32), (int)var31, 4, Math.max(var23, this.llililIlIi ? 1.0 : 0.0));
   }

   public boolean liiiIIllIl(double mouseY, double mouseX, int button) {
      long var19 = -9145470668593412588L;
      long var21 = -4433160032299419764L;
      long var23 = -3753283496680226945L;
      if (button != 0) {
         return false;
      } else {
         var19 ^= ((long)(this.iillilIlIi + 4) << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)(this.IIililIlIi + 4 + 9 + 9) ^ var19) & -1L >>> 32;
         var21 ^= ((long)(this.lIililIlIi - 8) << 32 ^ var21) & -1L << 32;
         if (mouseY >= (double)((int)(var19 >>> 32))
            && mouseY <= (double)((int)(var19 >>> 32) + (int)(var21 >>> 32))
            && mouseX >= (double)((int)var19 - 4)
            && mouseX <= (double)((int)var19 + 4 + 4)) {
            double var9 = (this.IlllilIlIi.Iilllilliill() - this.IlllilIlIi.IIIilIIiiIIi()) / (this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi());
            double var11 = (this.IlllilIlIi.Ililllililil() - this.IlllilIlIi.IIIilIIiiIIi())
               / (this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi());
            var21 ^= ((long)((int)(var19 >>> 32) + (int)(var9 * (double)((int)(var21 >>> 32)))) ^ var21) & -1L >>> 32;
            var23 ^= ((long)((int)(var19 >>> 32) + (int)(var11 * (double)((int)(var21 >>> 32)))) << 32 ^ var23) & -1L << 32;
            double var15 = Math.abs(mouseY - (double)((int)var21));
            double var17 = Math.abs(mouseY - (double)((int)(var23 >>> 32)));
            if (Math.abs(var15 - var17) < 1.0E-4) {
               if (mouseY < (double)((int)var21)) {
                  this.IlililIlIi = true;
                  this.iliIiiliiiii(mouseY);
               } else {
                  this.llililIlIi = true;
                  this.IIIllIIliIIl(mouseY);
               }

               return true;
            } else {
               if (var15 < var17) {
                  this.IlililIlIi = true;
                  this.iliIiiliiiii(mouseY);
               } else {
                  this.llililIlIi = true;
                  this.IIIllIIliIIl(mouseY);
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   public void IilliliilIIi(double mouseX, double mouseY, int button) {
      if (button == 0) {
         this.IlililIlIi = false;
         this.llililIlIi = false;
      }
   }

   public boolean Illlllllilll() {
      return this.IlililIlIi || this.llililIlIi;
   }

   private double lIiiIiIlilli(double mouseX) {
      long var13 = -6041969314109054915L;
      var13 ^= ((long)(this.iillilIlIi + 4) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(this.lIililIlIi - 8) ^ var13) & -1L >>> 32;
      double var5 = (mouseX - (double)((int)(var13 >>> 32))) / (double)((int)var13);
      var5 = Math.max(0.0, Math.min(1.0, var5));
      double var7 = this.IlllilIlIi.IlIillIiilIi() - this.IlllilIlIi.IIIilIIiiIIi();
      double var9 = this.IlllilIlIi.IIIilIIiiIIi() + var5 * var7;
      double var11 = this.IlllilIlIi.IiIiliIiiiIi();
      return (double)Math.round(var9 / var11) * var11;
   }

   public void IlIlllIlilIl(int y, int width, int x, int height) {
      this.iillilIlIi = y;
      this.IIililIlIi = width;
      this.lIililIlIi = x;
      this.iIililIlIi = height;
   }
}
