package gg.corz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D.Float;
import java.util.Map;

final class iIlIlllllill {
   final float IIIllIIliIIl;
   final int lIiiIiIlilli;
   private static FontRenderContext IilliliilIIi;
   private Font IlIlllIlilIl;
   final float iliIiiliiiii;

   private iliIiiliiiii IliIlllilIi(String var1) {
      long var5 = -3088078564621396676L;
      iliIiiliiiii var2 = gg.corz.IilliliilIIi.IlIillIiilIi(this.lIiiIiIlilli);
      if (var2 == null) {
         return null;
      } else {
         var5 ^= (0L ^ var5) & -1L << 32;

         while ((int)(var5 >>> 32) < var1.length()) {
            var5 ^= ((long)gg.corz.iliIiiliiiii.IliIlllilIi(var1.charAt((int)(var5 >>> 32))) ^ var5) & -1L >>> 32;
            if ((int)var5 < 0 || var2.iiiliIIIii[(int)var5] < 0.0F) {
               return null;
            }

            var5 += 4294967296L;
         }

         return var2;
      }
   }

   void lIiiIiIlilli(Graphics2D var1, Color var2, String var3, double var4, double var6, double var8) {
      long var29 = 8541001935893274348L;
      double var10 = Math.abs(var1.getTransform().getScaleY());
      if (var10 <= 0.0) {
         var10 = 1.0;
      }

      iliIiiliiiii var12 = this.IliIlllilIi(var3);
      double var13 = var12 != null
         ? var12.lIIiiiIIii * (double)this.iliIiiliiiii / 1000.0
         : this.liiiIIllIl()
            .createGlyphVector(iIlIlllllill(), iliIiiliiiii<"iliIiiliiiii","q4tgonSRyzzRBAOTNBo0eiNXm3Xxsa2dWSKdc84=">())
            .getVisualBounds()
            .getHeight();
      double var15 = (double)Math.round((var6 + var13 * 0.5) * var10) / var10;
      double var17 = Math.floor((var4 - this.IilliliilIIi(var3) * var8) * var10 + 0.5) / var10;
      var1.setColor(var2);
      if (var12 == null) {
         var1.setFont(this.liiiIIllIl());
         var1.drawString(var3, (float)var17, (float)var15);
      } else {
         AffineTransform var19 = var1.getTransform();
         double var20 = (double)this.iliIiiliiiii / 1000.0;
         double var22 = (double)(this.iliIiiliiiii * this.IIIllIIliIIl);
         double var24 = var17;
         var29 ^= (0L ^ var29) & -1L << 32;

         while ((int)(var29 >>> 32) < var3.length()) {
            var29 ^= ((long)gg.corz.iliIiiliiiii.IliIlllilIi(var3.charAt((int)(var29 >>> 32))) ^ var29) & -1L >>> 32;
            Float var28 = var12.Iiililiili[(int)var29];
            if (var28 != null) {
               var1.translate(var24, var15);
               var1.scale(var20, var20);
               var1.fill(var28);
               var1.setTransform(var19);
            }

            var24 += (double)var12.iiiliIIIii[(int)var29] * var20 + var22;
            var29 += 4294967296L;
         }
      }
   }

   private Font liiiIIllIl() {
      if (this.IlIlllIlilIl == null) {
         Font var1 = gg.corz.IilliliilIIi.IIlilIliiIli(this.lIiiIiIlilli != 0, this.iliIiiliiiii);
         this.IlIlllIlilIl = this.IIIllIIliIIl == 0.0F ? var1 : var1.deriveFont(Map.of(TextAttribute.TRACKING, this.IIIllIIliIIl));
      }

      return this.IlIlllIlilIl;
   }

   double IilliliilIIi(String var1) {
      long var6 = 5049396983731081712L;
      iliIiiliiiii var2 = this.IliIlllilIi(var1);
      if (var2 == null) {
         return this.liiiIIllIl().getStringBounds(var1, iIlIlllllill()).getWidth();
      } else {
         double var3 = 0.0;

         for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < var1.length(); var8 += 4294967296L) {
            var3 += (double)var2.iiiliIIIii[gg.corz.iliIiiliiiii.IliIlllilIi(var1.charAt((int)(var8 >>> 32)))];
         }

         return var3 * (double)this.iliIiiliiiii / 1000.0 + (double)(this.iliIiiliiiii * this.IIIllIIliIIl * (float)Math.max(0, var1.length() - 1));
      }
   }

   iIlIlllllill(int var1, float var2, float var3) {
      this.lIiiIiIlilli = var1;
      this.iliIiiliiiii = var2;
      this.IIIllIIliIIl = var3;
   }

   private static FontRenderContext iIlIlllllill() {
      if (IilliliilIIi == null) {
         IilliliilIIi = new FontRenderContext(null, true, true);
      }

      return IilliliilIIi;
   }
}
