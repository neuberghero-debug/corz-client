package gg.corz;

public final class iiiilIIiIIIIiIIi {
   private float ilIliIiiil;
   public static final float iiiIiIiiil = 18.0F;
   private float llIliIiiil;
   public static final float iIIliIiiil = 14.0F;
   private float iiIliIiiil;
   private float liIliIiiil = 0.9F;
   public static final float IIIliIiiil = 0.9F;
   private float IiIliIiiil;
   public static final float lIIliIiiil = 6.0F;
   private float IlIliIiiil;

   public void lIiiIiIlilli(float offset) {
      this.IlIliIiiil = this.IIIilIIiiIIi(offset);
      this.liIliIiiil = 0.0F;
   }

   public float Iiilliiliiil(float bottom, float reach, float top, float viewTop) {
      if (viewTop <= 0.0F) {
         return 1.0F;
      } else {
         float var5 = Math.max(top - bottom, reach - (top + this.IiIliIiiil));
         if (var5 <= 0.0F) {
            return 1.0F;
         } else {
            float var6 = lliiiIliliiiIl.IliIlllilIi(var5 / viewTop);
            return 1.0F - var6 * var6 * (3.0F - 2.0F * var6);
         }
      }
   }

   public float Illlllllilll() {
      return this.iiIliIiiil;
   }

   public void IilliliilIIi(double amount, float step) {
      if (this.iIlIlllllill()) {
         this.IlIliIiiil = this.IIIilIIiiIIi(this.IlIliIiiil - (float)amount * step);
         this.liIliIiiil = 0.0F;
      }
   }

   public float IIillIiliIil(float track) {
      float var2 = this.liiiIIllIl();
      return var2 <= 0.0F ? 0.0F : (track - this.Iilllilliill(track)) * Math.max(0.0F, Math.min(1.0F, this.llIliIiiil / var2));
   }

   public float liiiIIllIl() {
      return Math.max(0.0F, this.ilIliIiiil - this.IiIliIiiil);
   }

   public float IiIlliIliiIl() {
      return this.llIliIiiil;
   }

   public void IIIllIIliIIl(float margin, float bottom, float top) {
      float var4 = margin - top;
      float var5 = bottom + top;
      if (var4 < this.IlIliIiiil) {
         this.lIiiIiIlilli(var4);
      } else if (var5 > this.IlIliIiiil + this.IiIliIiiil) {
         this.lIiiIiIlilli(var5 - this.IiIliIiiil);
      }
   }

   public void IlIlllIlilIl(float dt, boolean hovered) {
      this.llIliIiiil = lliiiIliliiiIl.IIIllIIliIIl(this.llIliIiiil, this.IlIliIiiil, 18.0F, dt, 0.05F);
      if (dt > 0.0F) {
         this.liIliIiiil += dt;
      }

      float var3 = !this.iIlIlllllill() || !hovered && !(this.liIliIiiil < 0.9F) && !(Math.abs(this.llIliIiiil - this.IlIliIiiil) > 0.05F) ? 0.0F : 1.0F;
      this.iiIliIiiil = lliiiIliliiiIl.IIIllIIliIIl(this.iiIliIiiil, var3, 6.0F, dt, 0.002F);
   }

   public void iliIiiliiiii(float offset) {
      this.IlIliIiiil = this.IIIilIIiiIIi(offset);
      this.llIliIiiil = this.IlIliIiiil;
   }

   private float IIIilIIiiIIi(float v) {
      return Math.max(0.0F, Math.min(v, this.liiiIIllIl()));
   }

   public void IliIlllilIi(float contentHeight, float viewHeight) {
      this.ilIliIiiil = Math.max(0.0F, contentHeight);
      this.IiIliIiiil = Math.max(0.0F, viewHeight);
      this.IlIliIiiil = this.IIIilIIiiIIi(this.IlIliIiiil);
      this.llIliIiiil = Math.max(0.0F, Math.min(this.llIliIiiil, this.liiiIIllIl()));
   }

   public float IIlllIlliIll() {
      return this.IlIliIiiil;
   }

   public float Ililllililil(float viewTop, float bottom, float fade, float top) {
      if (top <= 0.0F) {
         return 1.0F;
      } else {
         float var5 = (bottom - fade) / top;
         float var6 = (fade + this.IiIliIiiil - viewTop) / top;
         return lliiiIliliiiIl.IliIlllilIi(Math.min(var5, var6));
      }
   }

   public boolean iIlIlllllill() {
      return this.liiiIIllIl() > 0.5F;
   }

   public float Iilllilliill(float track) {
      return !(this.ilIliIiiil <= 0.0F) && !(this.IiIliIiiil >= this.ilIliIiiil)
         ? Math.max(Math.min(14.0F, track), track * this.IiIliIiiil / this.ilIliIiiil)
         : track;
   }
}
