package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class lIIiiIiiIIiiIi {
   private static final int lliIlIiiiiliIlIiii = 5;
   private static final int lIIllIiiiiIIllIiii = -14411235;
   private final ililliIiIiilliIi ilIllIiiiIiIllIiii;
   private int lllllIiiiillllIiii;
   private static final int IIiIlIiiilIiIlIiii = 4;
   private static final int IlIllIiiillIllIiii = -1931130803;
   private final liIliIliiIliIl liIllIiiiiiIllIiii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 180, 0.0);
   private int iilllIiiiIIillIiii;
   private static final int iIiIlIiiiIliIlIiii = 18;
   private static final float IiiIlIiiiliiIlIiii = 0.82F;
   private int iIlllIiiiIllllIiii;
   private static final int iiiIlIiiiIIIllIiii = -1750963;
   private int IilllIiiililllIiii;
   private final liIliIliiIliIl IIlllIiiilIlllIiii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 260, 0.0);

   public void IIIllIIliIIl(int height, int x, int y, int width) {
      this.iIlllIiiiIllllIiii = height;
      this.lllllIiiiillllIiii = x;
      this.IilllIiiililllIiii = y;
      this.iilllIiiiIIillIiii = width;
   }

   public lIIiiIiiIIiiIi(ililliIiIiilliIi height, int width, int setting, int y, int x) {
      this.ilIllIiiiIiIllIiii = height;
      this.iIlllIiiiIllllIiii = width;
      this.lllllIiiiillllIiii = setting;
      this.IilllIiiililllIiii = y;
      this.iilllIiiiIIillIiii = x;
   }

   private int IlIlllIlilIl(int c1, int c2, double t) {
      long var17 = 6368456954624879129L;
      long var19 = 7175000120476129263L;
      long var13 = -5323563521169901072L;
      long var15 = 3211035133651850212L;
      t = Math.max(0.0, Math.min(1.0, t));
      var13 ^= ((long)(c1 >> 24 & 0xFF) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(c1 >> 16 & 0xFF) ^ var13) & -1L >>> 32;
      var15 ^= ((long)(c1 >> 8 & 0xFF) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(c1 & 0xFF) ^ var15) & -1L >>> 32;
      var17 ^= ((long)(c2 >> 24 & 0xFF) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)(c2 >> 16 & 0xFF) ^ var17) & -1L >>> 32;
      var19 ^= ((long)(c2 >> 8 & 0xFF) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)(c2 & 0xFF) ^ var19) & -1L >>> 32;
      return (int)((double)((int)(var13 >>> 32)) + (double)((int)(var17 >>> 32) - (int)(var13 >>> 32)) * t) << 24
         | (int)((double)((int)var13) + (double)((int)var17 - (int)var13) * t) << 16
         | (int)((double)((int)(var15 >>> 32)) + (double)((int)(var19 >>> 32) - (int)(var15 >>> 32)) * t) << 8
         | (int)((double)((int)var15) + (double)((int)var19 - (int)var15) * t);
   }

   private static int IilliliilIIi(IIliiIlllIliiIll font, String text, float maxWidth) {
      long var5 = -8701547405836442273L;
      var5 ^= (-4294967296L ^ var5) & -1L << 32;
      var5 ^= ((long)text.indexOf(32) ^ var5) & -1L >>> 32;

      while ((int)var5 > 0 && !(font.iIlIlllllill(text.substring(0, (int)var5)) > maxWidth)) {
         var5 ^= ((long)((int)var5) << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)text.indexOf(32, (int)var5 + 1) ^ var5) & -1L >>> 32;
      }

      if ((int)(var5 >>> 32) > 0) {
         return (int)(var5 >>> 32);
      } else {
         var5 ^= ((long)text.length() ^ var5) & -1L >>> 32;

         while ((int)var5 > 1 && font.iIlIlllllill(text.substring(0, (int)var5)) > maxWidth) {
            var5 ^= (var5 ^ var5 + (long)-1) & -1L >>> 32;
         }

         return (int)var5;
      }
   }

   private int[] IliIlllilIi() {
      long var6 = 7266719828726994903L;
      long var8 = 8620560668086205705L;
      IIliiIlllIliiIll var1 = CorzClient.fontRenderer();
      var6 ^= ((long)((int)var1.iIlIlllllill(this.ilIllIiiiIiIllIiii.Iilllilliill())) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)Math.min(this.IilllIiiililllIiii - 8, Math.max(56, (int)(var6 >>> 32) + 22)) ^ var6) & -1L >>> 32;
      var8 ^= ((long)(this.iIlllIiiiIllllIiii + this.IilllIiiililllIiii - 4 - (int)var6) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(this.lllllIiiiillllIiii + this.iilllIiiiIIillIiii / 2 - 9) ^ var8) & -1L >>> 32;
      return new int[]{(int)(var8 >>> 32), (int)var8, (int)var6, 18};
   }

   public boolean lIiiIiIlilli(double my, double button, int mx) {
      if (mx != 0) {
         return false;
      } else {
         int[] var6 = this.IliIlllilIi();
         if (my >= (double)var6[0] && my <= (double)(var6[0] + var6[2]) && button >= (double)var6[1] && button <= (double)(var6[1] + var6[3])) {
            this.ilIllIiiiIiIllIiii.IIlilIliiIli();
            this.IIlllIiiilIlllIiii.lIiiIiIlilli(1.0);
            return true;
         } else {
            return false;
         }
      }
   }

   private void iIlIlllllill(IIliiIlllIliiIll fh, String textX, int text, int room, int font) {
      long var13 = 1443519164288247132L;
      if (textX != null && !textX.isEmpty() && room > 0) {
         Color var6 = new Color(-3947581);
         if (fh.iIlIlllllill(textX) <= (float)room) {
            fh.IliIlllilIi(textX, (float)text, (float)fh.IlIillIiilIi(this.lllllIiiiillllIiii, this.iilllIiiiIIillIiii), var6);
         } else {
            float var7 = (float)room / 0.82F;
            String var8 = textX;
            String var9 = "";
            if (fh.iIlIlllllill(textX) > var7) {
               var13 ^= ((long)IilliliilIIi(fh, textX, var7) << 32 ^ var13) & -1L << 32;
               var8 = textX.substring(0, (int)(var13 >>> 32)).stripTrailing();
               var9 = fh.Iiilliiliiil(textX.substring((int)(var13 >>> 32)).stripLeading(), var7);
            }

            float var10 = fh.IilliliilIIi() * 0.82F;
            float var11 = var9.isEmpty()
               ? (float)this.lllllIiiiillllIiii + ((float)this.iilllIiiiIIillIiii - var10) / 2.0F - 1.0F
               : (float)this.lllllIiiiillllIiii + ((float)this.iilllIiiiIIillIiii - var10 * 2.0F - 1.0F) / 2.0F - 1.0F;
            class_4587 var12 = IIIiiIillIIiiIil.liiiIIllIl();
            var12.method_22903();
            var12.method_22905(0.82F, 0.82F, 1.0F);
            fh.IliIlllilIi(var8, (float)text / 0.82F, var11 / 0.82F, var6);
            if (!var9.isEmpty()) {
               fh.IliIlllilIi(var9, (float)text / 0.82F, (var11 + var10 + 1.0F) / 0.82F, var6);
            }

            var12.method_22909();
         }
      }
   }

   public int iliIiiliiiii() {
      return this.iilllIiiiIIillIiii;
   }

   public void liiiIIllIl(class_332 mouseY, int ctx, int mouseX) {
      long var33 = -7591355580782604198L;
      long var35 = -377811543372243664L;
      long var37 = 4926004966351604075L;
      long var25 = -7635769885246194219L;
      long var27 = -3109251904022654609L;
      long var29 = -3296879391499538408L;
      long var31 = -8962413585582130087L;
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      var25 ^= ((long)((int)var4.IilliliilIIi()) << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)(this.iIlllIiiiIllllIiii + 4) ^ var25) & -1L >>> 32;
      var27 ^= ((long)this.ilIllIiiiIiIllIiii.IiIiliIiiiIi() << 32 ^ var27) & -1L << 32;
      if ((int)(var27 >>> 32) != 0) {
         var27 ^= (2L ^ var27) & -1L >>> 32;
         long var43 = var29 ^ ((long)(this.iIlllIiiiIllllIiii + 4 + (int)var27) << 32 ^ var29) & -1L << 32;
         var29 = var43 ^ ((long)(this.lllllIiiiillllIiii + this.iilllIiiiIIillIiii / 2) ^ var43) & -1L >>> 32;
         IIIiiIillIIiiIil.iliIiiliiiii(
            mouseY, (int)(var29 >>> 32) - (int)var27, (int)var29 - (int)var27, (int)var27 * 2, (int)var27 * 2, (int)var27, (int)(var27 >>> 32), 4.5F, 0.5F
         );
         IIIiiIillIIiiIil.lIiiIiIlilli(
            mouseY, (int)(var29 >>> 32) - (int)var27, (int)var29 - (int)var27, (int)var27 * 2, (int)var27 * 2, (int)var27, (int)(var27 >>> 32)
         );
         var25 ^= ((long)((int)(var29 >>> 32) + (int)var27 + 6) ^ var25) & -1L >>> 32;
      }

      int[] var8 = this.IliIlllilIi();
      var29 ^= ((long)var8[0] << 32 ^ var29) & -1L << 32;
      var29 ^= ((long)var8[1] ^ var29) & -1L >>> 32;
      var31 ^= ((long)var8[2] << 32 ^ var31) & -1L << 32;
      var31 ^= ((long)var8[3] ^ var31) & -1L >>> 32;
      this.iIlIlllllill(var4, this.ilIllIiiiIiIllIiii.IlIillIiilIi(), (int)var25, (int)(var29 >>> 32) - 6 - (int)var25, (int)(var25 >>> 32));
      var33 ^= (
            (long)(
                     ctx >= (int)(var29 >>> 32)
                           && ctx <= (int)(var29 >>> 32) + (int)(var31 >>> 32)
                           && mouseX >= (int)var29
                           && mouseX <= (int)var29 + (int)var31
                        ? 1
                        : 0
                  )
                  << 32
               ^ var33
         )
         & -1L << 32;
      if (Math.abs(this.liIllIiiiiiIllIiii.IiIlliIliiIl() - (double)((int)(var33 >>> 32) != 0 ? 1 : 0)) > 0.01) {
         this.liIllIiiiiiIllIiii.lIiiIiIlilli((int)(var33 >>> 32) != 0 ? 1.0 : 0.0);
      }

      if (this.IIlllIiiilIlllIiii.iIlIlllllill() > 0.99 && this.IIlllIiiilIlllIiii.IiIlliIliiIl() == 1.0) {
         this.IIlllIiiilIlllIiii.lIiiIiIlilli(0.0);
      }

      double var14 = this.liIllIiiiiiIllIiii.iIlIlllllill();
      double var16 = this.IIlllIiiilIlllIiii.iIlIlllllill();
      double var18 = Math.max(var14, var16);
      var33 ^= ((long)this.ilIllIiiiIiIllIiii.Iiilliiliiil() ^ var33) & -1L >>> 32;
      var35 ^= ((long)this.IlIlllIlilIl(-15461350, (int)var33 != 0 ? -14411235 : -14737624, var14) << 32 ^ var35) & -1L << 32;
      var35 ^= ((long)this.IlIlllIlilIl((int)(var35 >>> 32), (int)var33 != 0 ? -14411235 : -16184564, var16 * 0.5) << 32 ^ var35) & -1L << 32;
      var35 ^= (
            (long)((int)var33 != 0 ? this.IlIlllIlilIl(IIIiiIillIIiiIil.IlIillIiilIi(0.0), -1931130803, var18) : IIIiiIillIIiiIil.IlIillIiilIi(var18)) ^ var35
         )
         & -1L >>> 32;
      IIIiiIillIIiiIil.IIillIiliIil(mouseY, (int)(var29 >>> 32), (int)var29, (int)(var31 >>> 32), (int)var31, 5, (int)(var35 >>> 32), (int)var35);
      var37 ^= ((long)this.IlIlllIlilIl(-1, (int)var33 != 0 ? -1750963 : IlIIilIlllIIilIl.lliiIlliIl, var18 * 0.8) << 32 ^ var37) & -1L << 32;
      var37 ^= ((long)((int)var4.iIlIlllllill(this.ilIllIiiiIiIllIiii.Iilllilliill())) ^ var37) & -1L >>> 32;
      var4.IliIlllilIi(
         this.ilIllIiiiIiIllIiii.Iilllilliill(),
         (float)((int)(var29 >>> 32) + ((int)(var31 >>> 32) - (int)var37) / 2),
         (float)var4.IlIillIiilIi((int)var29, (int)var31),
         new Color((int)(var37 >>> 32), true)
      );
   }
}
