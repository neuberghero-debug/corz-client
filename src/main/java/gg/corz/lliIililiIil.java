package gg.corz;

public final class lliIililiIil {
   static final float iIlIIlliIllIIlli = 0.75F;
   public static final double ilIIIlliIiIIIlli = 8.0;
   public static final float IIlIIllilIlIIlli = (float)Math.toRadians(30.0);
   static final float lllIIlliillIIlli = 1.6F;
   private int IIIlIllilIIlIlli;
   private float illlIlliIillIlli;
   private float IlllIllillllIlli;
   public final IllIlIilllIlIi IliIIllilliIIlli;
   private int lillIlliiillIlli;
   private static final float iilIIlliIIiIIlli = (float) (Math.PI / 180.0);
   private final Illlllllllll iliIIlliIiiIIlli;
   private double iIIlIlliIlIlIlli;
   public static final int liIIIlliiiIIIlli = 5;
   private float iiIlIlliIIllIlli;
   static final float IilIIllililIIlli = 0.6F;
   private double llIlIlliilIlIlli;
   public final iiliIllIIiiIll lIiIIlliiIiIIlli = new iiliIllIIiiIll();
   private float lIllIlliiIllIlli;
   private boolean liiIIlliiiiIIlli;
   private double IiIlIlliliIlIlli;

   public void iIlIlllllill(int framePitch, double sleeping, double age, double y, float bodyYawDeg, float z, boolean x) {
      long var38 = -2873735168254708206L;
      if (Double.isFinite(sleeping) && Double.isFinite(age) && Double.isFinite(y) && Float.isFinite(bodyYawDeg) && Float.isFinite(z)) {
         if (x) {
            this.lIiIIlliiIiIIlli.IlIlllIlilIl();
            this.liiIIlliiiiIIlli = false;
         } else if (!this.liiIIlliiiiIIlli) {
            this.IlIlllIlilIl(framePitch, sleeping, age, y, bodyYawDeg, z);
         } else {
            var38 ^= ((long)(framePitch - this.IIIlIllilIIlIlli) << 32 ^ var38) & -1L << 32;
            if ((int)(var38 >>> 32) != 0) {
               if ((int)(var38 >>> 32) >= 0 && (int)(var38 >>> 32) <= 5) {
                  double var12 = sleeping - this.iIIlIlliIlIlIlli;
                  double var14 = age - this.llIlIlliilIlIlli;
                  double var16 = y - this.IiIlIlliliIlIlli;
                  double var18 = 8.0 * (double)((int)(var38 >>> 32));
                  if (var12 * var12 + var14 * var14 + var16 * var16 > var18 * var18) {
                     this.IlIlllIlilIl(framePitch, sleeping, age, y, bodyYawDeg, z);
                  } else {
                     float var20 = 1.0F / (float)((int)(var38 >>> 32));
                     float var21 = bodyYawDeg * (float) (Math.PI / 180.0);
                     float var22 = (float)(-Math.sin((double)var21));
                     float var23 = (float)Math.cos((double)var21);
                     float var24 = (float)(-Math.cos((double)var21));
                     float var25 = (float)(-Math.sin((double)var21));
                     float var26 = IIlllIlliIll((float)(var12 * (double)var22 + var16 * (double)var23) * var20, 4.0F);
                     float var27 = IIlllIlliIll((float)(var12 * (double)var24 + var16 * (double)var25) * var20, 4.0F);
                     float var28 = IIlllIlliIll((float)var14 * var20, 4.0F);
                     float var29 = IIlllIlliIll(IiIlliIliiIl(bodyYawDeg - this.iiIlIlliIIllIlli) * var20 * (float) (Math.PI / 180.0), IIlIIllilIlIIlli);
                     float var30 = this.lIllIlliiIllIlli;
                     float var31 = this.IlllIllillllIlli;
                     float var32 = this.illlIlliIillIlli;
                     this.lIllIlliiIllIlli = this.lIllIlliiIllIlli + (var26 - this.lIllIlliiIllIlli) * 0.6F;
                     this.IlllIllillllIlli = this.IlllIllillllIlli + (var27 - this.IlllIllillllIlli) * 0.6F;
                     this.illlIlliIillIlli = this.illlIlliIillIlli + (var28 - this.illlIlliIillIlli) * 0.6F;
                     float var33 = 9.375F;
                     float var34 = IIlllIlliIll(-(this.lIllIlliiIllIlli - var30) * var33, 1.6F);
                     float var35 = IIlllIlliIll(-(this.IlllIllillllIlli - var31) * var33, 1.6F);
                     float var36 = IIlllIlliIll(-(this.illlIlliIillIlli - var32) * var33, 1.6F);
                     this.IIIllIIliIIl(z, -this.lIllIlliiIllIlli, -this.IlllIllillllIlli, -this.illlIlliIillIlli, var34, var35, var36, var29);

                     for (long var41 = var38 ^ (0L ^ var38) & -1L >>> 32; (int)var41 < (int)(var41 >>> 32); var41 ^= (var41 ^ var41 + (long)1) & -1L >>> 32) {
                        this.lIiIIlliiIiIIlli.IIlllIlliIll(this.iliIIlliIiiIIlli, this.IliIIllilliIIlli);
                     }

                     this.IIIlIllilIIlIlli = framePitch;
                     this.iIIlIlliIlIlIlli = sleeping;
                     this.llIlIlliilIlIlli = age;
                     this.IiIlIlliliIlIlli = y;
                     this.iiIlIlliIIllIlli = bodyYawDeg;
                  }
               } else {
                  this.IlIlllIlilIl(framePitch, sleeping, age, y, bodyYawDeg, z);
               }
            }
         }
      }
   }

   static float IiIlliIliiIl(float deg) {
      float var1 = deg % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   private void IlIlllIlilIl(int age, double y, double x, double framePitch, float bodyYawDeg, float z) {
      this.liiIIlliiiiIIlli = true;
      this.IIIlIllilIIlIlli = age;
      this.iIIlIlliIlIlIlli = y;
      this.llIlIlliilIlIlli = x;
      this.IiIlIlliliIlIlli = framePitch;
      this.iiIlIlliIIllIlli = bodyYawDeg;
      this.lIllIlliiIllIlli = this.IlllIllillllIlli = this.illlIlliIillIlli = 0.0F;
      this.lIiIIlliiIiIIlli.IIIllIIliIIl(this.iliIIlliIiiIIlli.IliIlllilIi(z), this.IliIIllilliIIlli);
      this.lillIlliiillIlli++;
   }

   public lliIililiIil() {
      this.IliIIllilliIIlli = new IllIlIilllIlIi();
      this.iliIIlliIiiIIlli = new Illlllllllll();
      IllIlIilllIlIi.IlIlllIlilIl(this.IliIIllilliIIlli);
   }

   public void IilliliilIIi(float framePitch, float yawRate) {
      this.lIiiIiIlilli(framePitch, yawRate, 0.0F);
   }

   private void IIIllIIliIIl(float wR, float wU, float yawRate, float iF, float wF, float framePitch, float iR, float iU) {
      float var9 = (float)Math.cos((double)wR);
      float var10 = (float)Math.sin((double)wR);
      this.iliIIlliIiiIIlli.IlIiiIIillIiiIIi = -iF * var9 - wU * var10;
      this.iliIIlliIiiIIlli.ilIiiIIiIiIiiIIi = -wU * var9 + iF * var10;
      this.iliIIlliIiiIIlli.liIiiIIiiiIiiIIi = yawRate;
      this.iliIIlliIiiIIlli.IIliiIIilIliiIIi = var9;
      this.iliIIlliIiiIIlli.iIliiIIiIlliiIIi = -var10;
      this.iliIIlliIiiIIlli.llliiIIiilliiIIi = -iR * var9 - wF * var10;
      this.iliIIlliIiiIIlli.IiliiIIililiiIIi = -wF * var9 + iR * var10;
      this.iliIIlliIiiIIlli.iiliiIIiIIiiiIIi = framePitch;
      this.iliIIlliIiiIIlli.lIiiiIIiiIiiiIIi = iU;
   }

   public boolean liiiIIllIl() {
      return this.liiIIlliiiiIIlli;
   }

   public void lIiiIiIlilli(float yawRate, float framePitch, float breeze) {
      this.IIIllIIliIIl(
         Float.isFinite(yawRate) ? yawRate : 0.0F,
         -IIlllIlliIll(breeze, 1.0F),
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         IIlllIlliIll(Float.isFinite(framePitch) ? framePitch : 0.0F, IIlIIllilIlIIlli)
      );
      this.lIiIIlliiIiIIlli.IIlllIlliIll(this.iliIIlliIiiIIlli, this.IliIIllilliIIlli);
   }

   private static float IIlllIlliIll(float limit, float v) {
      if (!Float.isFinite(limit)) {
         return 0.0F;
      } else {
         return limit < -v ? -v : (limit > v ? v : limit);
      }
   }

   public void iliIiiliiiii() {
      this.lIiIIlliiIiIIlli.IIIllIIliIIl(this.iliIIlliIiiIIlli.IliIlllilIi(0.0F), this.IliIIllilliIIlli);
      this.liiIIlliiiiIIlli = false;
      this.lillIlliiillIlli++;
   }

   public int IliIlllilIi() {
      return this.lillIlliiillIlli;
   }
}
