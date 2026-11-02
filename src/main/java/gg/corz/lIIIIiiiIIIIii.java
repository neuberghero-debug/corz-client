package gg.corz;

public final class lIIIIiiiIIIIii {
   public float iliiIllIIl;
   public float liiiIllIIl;
   public float iiiiIllIIl;
   public float liIIlllIIl;
   public static final float llIiIllIIl = 10.0F;
   public static final float ilIiIllIIl = 220.0F;
   public float liliIllIIl;
   public float illiIllIIl;
   public float lIIIlllIIl;
   private float IllIlllIIl = -1.0F;
   public float ilIIlllIIl;
   private float iilIlllIIl;
   public float IIiiIllIIl;
   public float lliiIllIIl;
   public static final float iIilIllIIl = 12.0F;
   public float IiIIlllIIl;
   private float illIlllIIl;
   public float iIliIllIIl;
   public float IIIIlllIIl;
   private float lllIlllIIl;
   private float IilIlllIIl;
   public float IlliIllIIl;
   public static final float liilIllIIl = 10.0F;
   public float lIliIllIIl;
   public static final float IiilIllIIl = 2.0F;
   private boolean IIiIlllIIl;
   public static final float iIIiIllIIl = 18.0F;
   public float IliiIllIIl;
   public static final float lIIiIllIIl = 8.0F;
   public float iiliIllIIl;
   public float IiiiIllIIl;
   public static final float IlIiIllIIl = 18.0F;
   public float iIlIlllIIl;
   public static final float iiilIllIIl = 10.0F;
   public float lIiiIllIIl;
   private float lilIlllIIl;
   public static final float liIiIllIIl = 96.0F;
   public static final float IlilIllIIl = 12.0F;
   public static final float IIIiIllIIl = 8.0F;
   public float iIiiIllIIl;
   public float IlIIlllIIl;
   public float IiliIllIIl;
   public static final float IIliIllIIl = 64.0F;
   public float IIlIlllIIl;
   public float lIlIlllIIl;
   public float iiIIlllIIl;
   public float llliIllIIl;
   public static final float ililIllIIl = 14.0F;
   public float iIIIlllIIl;
   public static final float llilIllIIl = 12.0F;
   public static final float iiIiIllIIl = 0.42F;
   public float llIIlllIIl;
   public static final float IiIiIllIIl = 150.0F;
   private boolean lIiIlllIIl;

   public boolean iIlIlllllill() {
      return this.IiIIlllIIl > 0.0F;
   }

   public static int IIillIiliIil(int option, int unicode, int framebufferH, boolean framebufferW) {
      long var5 = -7834267185182656969L;
      var5 ^= (4294967296L ^ var5) & -1L << 32;

      while (
         (int)(var5 >>> 32) != option
            && (int)(var5 >>> 32) < unicode
            && (int)(var5 >>> 32) < framebufferH
            && unicode / ((int)(var5 >>> 32) + 1) >= 320
            && framebufferH / ((int)(var5 >>> 32) + 1) >= 240
      ) {
         var5 += 4294967296L;
      }

      if (framebufferW && (int)(var5 >>> 32) % 2 != 0) {
         var5 += 4294967296L;
      }

      return (int)(var5 >>> 32);
   }

   public boolean IIIllIIliIIl(double px, double py) {
      return px >= (double)this.IIIIlllIIl
         && px <= (double)(this.IIIIlllIIl + this.iIIIlllIIl)
         && py >= (double)this.lIIIlllIIl
         && py <= (double)(this.lIIIlllIIl + this.IlIIlllIIl);
   }

   public boolean IlIlllIlilIl(double px, double py) {
      return this.liiiIllIIl > 0.0F
         && px >= (double)this.iliiIllIIl
         && px <= (double)(this.iliiIllIIl + this.liiiIllIIl)
         && py >= (double)this.IiiiIllIIl
         && py <= (double)(this.IiiiIllIIl + this.iiiiIllIIl);
   }

   public boolean liiiIIllIl(
      float screenWidth, float prefH, float subtitle, float screenHeight, boolean railWidth, float prefW, float footer, boolean sideWidth
   ) {
      if (screenWidth == this.IllIlllIIl
         && prefH == this.lllIlllIIl
         && subtitle == this.illIlllIIl
         && screenHeight == this.IilIlllIIl
         && railWidth == this.IIiIlllIIl
         && prefW == this.lilIlllIIl
         && footer == this.iilIlllIIl
         && sideWidth == this.lIiIlllIIl) {
         return false;
      } else {
         this.IllIlllIIl = screenWidth;
         this.lllIlllIIl = prefH;
         this.illIlllIIl = subtitle;
         this.IilIlllIIl = screenHeight;
         this.IIiIlllIIl = railWidth;
         this.lilIlllIIl = prefW;
         this.iilIlllIIl = footer;
         this.lIiIlllIIl = sideWidth;
         this.lIliIllIIl = screenWidth;
         this.iIliIllIIl = prefH;
         this.illiIllIIl = Iilllilliill(subtitle, 220.0F, screenWidth);
         this.IiliIllIIl = Iilllilliill(screenHeight, 150.0F, prefH);
         this.IlliIllIIl = (float)Math.floor((double)((screenWidth - this.illiIllIIl) / 2.0F));
         this.llliIllIIl = (float)Math.floor((double)((prefH - this.IiliIllIIl) / 2.0F));
         this.liliIllIIl = this.IlliIllIIl + 12.0F;
         this.iiliIllIIl = this.llliIllIIl + 12.0F;
         this.IIiiIllIIl = 14.0F;
         this.lIiiIllIIl = this.iiliIllIIl + 14.0F + 2.0F;
         float var9 = railWidth ? this.lIiiIllIIl + 10.0F : this.iiliIllIIl + 14.0F;
         this.lliiIllIIl = 18.0F;
         this.iIiiIllIIl = this.IlliIllIIl + this.illiIllIIl - 12.0F - 18.0F + 2.0F;
         this.IliiIllIIl = this.llliIllIIl + 10.0F;
         float var10 = var9 + 10.0F;
         this.iIlIlllIIl = sideWidth ? 18.0F : 0.0F;
         this.iiIIlllIIl = this.IlliIllIIl + 12.0F;
         this.lIlIlllIIl = this.illiIllIIl - 24.0F;
         this.IIlIlllIIl = this.llliIllIIl + this.IiliIllIIl - 12.0F - this.iIlIlllIIl;
         float var11 = sideWidth ? this.IIlIlllIIl - 8.0F : this.llliIllIIl + this.IiliIllIIl - 12.0F;
         float var12 = Math.max(0.0F, var11 - var10);
         float var13 = this.illiIllIIl - 24.0F;
         float var14 = 0.0F;
         if (prefW > 0.0F) {
            float var15 = Math.max(0.0F, Math.min(var13 * 0.42F, var13 - 8.0F - 96.0F));
            var14 = (float)Math.floor((double)Math.min(prefW, var15));
            if (var14 < 64.0F) {
               var14 = 0.0F;
            }
         }

         this.iliiIllIIl = this.IlliIllIIl + 12.0F;
         this.IiiiIllIIl = var10;
         this.liiiIllIIl = var14;
         this.iiiiIllIIl = var14 > 0.0F ? var12 : 0.0F;
         this.IIIIlllIIl = var14 > 0.0F ? this.iliiIllIIl + var14 + 8.0F : this.IlliIllIIl + 12.0F;
         this.lIIIlllIIl = var10;
         float var17 = 0.0F;
         if (footer > 0.0F) {
            float var16 = this.IlliIllIIl + this.illiIllIIl - 12.0F - this.IIIIlllIIl - 8.0F - 96.0F;
            var17 = (float)Math.floor((double)Math.min(footer, Math.max(0.0F, var16)));
            if (var17 < 64.0F) {
               var17 = 0.0F;
            }
         }

         this.IiIIlllIIl = var17;
         this.llIIlllIIl = this.IlliIllIIl + this.illiIllIIl - 12.0F - var17;
         this.ilIIlllIIl = var10;
         this.liIIlllIIl = var17 > 0.0F ? var12 : 0.0F;
         this.iIIIlllIIl = Math.max(0.0F, (var17 > 0.0F ? this.llIIlllIIl - 8.0F : this.IlliIllIIl + this.illiIllIIl - 12.0F) - this.IIIIlllIIl);
         this.IlIIlllIIl = var12;
         return true;
      }
   }

   public boolean IliIlllilIi(float subtitle, float screenHeight, float prefW, float screenWidth, boolean prefH, float footer, boolean railWidth) {
      return this.liiiIIllIl(subtitle, screenHeight, prefW, screenWidth, prefH, footer, 0.0F, railWidth);
   }

   public boolean IIlllIlliIll(double px, double py) {
      return px >= (double)(this.iIiiIllIIl - 2.0F)
         && px <= (double)(this.iIiiIllIIl + this.lliiIllIIl + 2.0F)
         && py >= (double)(this.IliiIllIIl - 2.0F)
         && py <= (double)(this.IliiIllIIl + this.lliiIllIIl + 2.0F);
   }

   static float Iilllilliill(float screen, float preferred, float min) {
      float var3 = Math.max(0.0F, min - 24.0F);
      float var4 = Math.min(Math.max(screen, preferred), var3);
      if (var4 < preferred) {
         var4 = Math.max(0.0F, min - 8.0F);
      }

      return (float)Math.floor((double)var4);
   }

   public boolean IiIlliIliiIl(double px, double py) {
      return this.iIlIlllIIl > 0.0F
         && px >= (double)this.iiIIlllIIl
         && px <= (double)(this.iiIIlllIIl + this.lIlIlllIIl)
         && py >= (double)(this.IIlIlllIIl - 1.0F)
         && py <= (double)(this.IIlIlllIIl + this.iIlIlllIIl + 1.0F);
   }

   public boolean iliIiiliiiii(double py, double px) {
      return py >= (double)this.IlliIllIIl
         && py <= (double)(this.IlliIllIIl + this.illiIllIIl)
         && px >= (double)this.llliIllIIl
         && px <= (double)(this.llliIllIIl + this.IiliIllIIl);
   }

   public void Illlllllilll() {
      this.IllIlllIIl = -1.0F;
   }

   public boolean IilliliilIIi(double px, double py) {
      return this.IiIIlllIIl > 0.0F
         && px >= (double)this.llIIlllIIl
         && px <= (double)(this.llIIlllIIl + this.IiIIlllIIl)
         && py >= (double)this.ilIIlllIIl
         && py <= (double)(this.ilIIlllIIl + this.liIIlllIIl);
   }

   public boolean lIiiIiIlilli() {
      return this.liiiIllIIl > 0.0F;
   }
}
