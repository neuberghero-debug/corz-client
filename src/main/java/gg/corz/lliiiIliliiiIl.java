package gg.corz;

public final class lliiiIliliiiIl {
   public static final float IillIIIillillIIIil = 0.975F;
   public static final float liiiiiilliiiiiiill = 250.0F;
   public static final float IiIIIIIilliIIIIIil = 60.0F;
   public static final float IlIlIIIilllIlIIIil = 4.0F;
   public static final float IIIIIIIillIIIIIIil = 0.94F;
   public static final float iiIIIIIilIIlIIIIil = 0.5F;
   public static final float illIIIIilIilIIIIil = 26.0F;
   public static final float Iliiiiilllliiiiill = 260.0F;
   public static final float lIiiiiilliIiiiiill = 220.0F;
   public static final float iliiiiillIiiiiiill = 24.0F;
   public static final float iiliiiillIIiiiiill = 170.0F;
   public static final float ilIlIIIilIiIlIIIil = 220.0F;
   public static final float iIiIIIIilIliIIIIil = 16.0F;
   public static final float IIllIIIillIllIIIil = 0.15F;
   public static final float iIIIIIIilIlIIIIIil = 1.55F;
   public static final float iiiIIIIilIIIlIIIil = 150.0F;
   public static final float IIiIIIIillIiIIIIil = 3.0F;
   public static final float llIIIIIililIIIIIil = 8.0F;
   public static final float lIIlIIIiliIIlIIIil = 0.965F;
   public static final float lIlIIIIiliIlIIIIil = 150.0F;
   public static final float iIllIIIilIlllIIIil = 0.97F;
   public static final int lliIIIIililiIIIIil = 10;
   public static final float lilIIIIiliilIIIIil = 150.0F;
   public static final float Iiliiiillliliiiill = 300.0F;
   public static final float liIlIIIiliiIlIIIil = 0.7F;
   public static final float IllIIIIillllIIIIil = 70.0F;
   public static final float llllIIIililllIIIil = 1.015F;
   public static final float IiiIIIIilliiIIIIil = 110.0F;

   public static float Illlllllilll(float closing, boolean ms) {
      return ms ? 1.0F - iIlIlllllill(closing / 170.0F) : liiiIIllIl(closing / 220.0F);
   }

   public static float IIIllIIliIIl(float current, float target, float eps, float rate, float dt) {
      if (rate <= 0.0F) {
         return current;
      } else if (eps <= 0.0F) {
         return target;
      } else {
         float var5 = current + (target - current) * (1.0F - (float)Math.exp((double)(-eps * rate)));
         return Math.abs(target - var5) < dt ? target : var5;
      }
   }

   public static float iliIiiliiiii(float current, float target, float rate, float dt) {
      return IIIllIIliIIl(current, target, rate, dt, 0.001F);
   }

   public static float IiIlliIliiIl(float ms, boolean closing) {
      return closing ? 1.0F - 0.035000026F * liiiIIllIl(ms / 150.0F) : 0.94F + 0.060000002F * lIiiIiIlilli((ms - 24.0F) / 250.0F, 1.55F);
   }

   public static float Iliilliiilii(float t) {
      if (t <= 0.0F || t >= 1.0F) {
         return 0.0F;
      } else {
         return t < 0.3F ? liiiIIllIl(t / 0.3F) : 1.0F - lIiiIiIlilli((t - 0.3F) / 0.7F, 2.0F);
      }
   }

   public static float lIiiIiIlilli(float back, float t) {
      float var2 = IliIlllilIi(back) - 1.0F;
      return 1.0F + (t + 1.0F) * var2 * var2 * var2 + t * var2 * var2;
   }

   public static float IIlllIlliIll(float closing, boolean ms) {
      return ms ? 4.0F * liiiIIllIl(closing / 150.0F) : 8.0F * (1.0F - liiiIIllIl((closing - 24.0F) / 250.0F));
   }

   public static float IIillIiliIil(float closing, int row, int layer, boolean ms) {
      return ms ? Iilllilliill(closing, row, true) : Iilllilliill(closing - (float)Math.min(Math.max(layer, 0), 10) * 16.0F, row, false);
   }

   public static float IIiilIiiiIii(float ms) {
      return 0.975F + 0.024999976F * lIiiIiIlilli(ms / 260.0F, 1.2F);
   }

   public static float IlIillIiilIi(float ms) {
      return 1.0F - liiiIIllIl(ms / 154.0F);
   }

   public static float IlIlllIlilIl(float closing, boolean ms) {
      return ms ? 1.0F - liiiIIllIl(closing / 150.0F) : 0.5F * liiiIIllIl(closing / 60.0F) + 0.5F * liiiIIllIl((closing - 30.0F) / 150.0F);
   }

   public static float Ililllililil(float alpha) {
      return 3.0F * (1.0F - IliIlllilIi(alpha));
   }

   public static float IiIiliIiiiIi(float ms) {
      return liiiIIllIl((ms - 33.0F) / 187.0F);
   }

   private lliiiIliliiiIl() {
   }

   public static float liiiIIllIl(float t) {
      float var1 = 1.0F - IliIlllilIi(t);
      return 1.0F - var1 * var1 * var1;
   }

   public static float Illillliilli(float ms) {
      return 1.0F + 0.014999986F * liiiIIllIl(ms / 154.0F);
   }

   public static float iIlIlllllill(float t) {
      t = IliIlllilIi(t);
      if (t < 0.5F) {
         return 4.0F * t * t * t;
      } else {
         float var1 = 1.0F - t;
         return 1.0F - 4.0F * var1 * var1 * var1;
      }
   }

   public static float IilliliilIIi(float t) {
      t = IliIlllilIi(t);
      return t * t;
   }

   public static float Iiilliiliiil(int layers) {
      return 70.0F + (float)Math.max(0, layers - 1) * 26.0F + 160.0F + 150.0F;
   }

   public static float Iilllilliill(float ms, int layer, boolean closing) {
      return closing ? 1.0F - liiiIIllIl(ms / 110.0F) : liiiIIllIl((ms - 70.0F - (float)Math.max(0, layer) * 26.0F) / 150.0F);
   }

   public static float Iilililiiili(float ms) {
      return liiiIIllIl(ms / 182.0F);
   }

   public static float IliIlllilIi(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static float IIlilIliiIli(float ms) {
      return 0.97F + 0.029999971F * liiiIIllIl(ms / 220.0F);
   }

   public static boolean IIIilIIiiIIi(float ms) {
      return ms >= 170.0F;
   }
}
