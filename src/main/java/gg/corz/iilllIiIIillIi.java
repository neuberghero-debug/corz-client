package gg.corz;

import java.util.Random;

public final class iilllIiIIillIi {
   private long IIilIiIiilIilIiIii;
   private boolean iIIIliIiiIlIIliIii;
   private float IiilIiIiiliilIiIii;
   private static final int IIIlIiIiilIIlIiIii = 3;
   private double IIliIiIiilIliIiIii;
   private boolean illlIiIiiIillIiIii;
   private float llilIiIiiililIiIii;
   private final lIlllIIliIlllIIl lIllIiIiiiIllIiIii;
   private int lIIiIiIiiiIIiIiIii;
   private IiilIiIiliilIiIi IiliIiIiililiIiIii;
   private IIIliIilIIliIi IliiIiIiilliiIiIii;
   private boolean IlIiIiIiillIiIiIii;
   private static final float iIIlIiIiiIlIlIiIii = 0.25F;
   private int llliIiIiiilliIiIii;
   private static final float iiIlIiIiiIIllIiIii = 0.1F;
   private static final float IiIlIiIiiliIlIiIii = 1.0E-4F;
   private float iIilIiIiiIlilIiIii;
   private float liIiIiIiiiiIiIiIii;
   private float lIiiIiIiiiIiiIiIii;
   private static final int iliIIiIiiIiiIIiIii = 1;
   private boolean lillIiIiiiillIiIii;
   private float IiIIliIiiliIIliIii;
   public static final float iilIIiIiiIIiIIiIii = 8.0F;
   private static final float llIlIiIiiilIlIiIii = 2.0F;
   private float IlllIiIiillllIiIii = 1.0F;
   static final double lIiIIiIiiiIiIIiIii = 1.9;
   private float ilIiIiIiiIiIiIiIii;
   private int iliiIiIiiIiiiIiIii;
   private boolean IIIIliIiilIIIliIii;
   private static final int liiIIiIiiiiiIIiIii = 2;
   private float iiliIiIiiIIiiIiIii;
   private static final int IliIIiIiilliIIiIii = 0;
   private IIIIIlilIIIIli iIliIiIiiIlliIiIii;
   private boolean liiiIiIiiiiiiIiIii;
   private boolean iiilIiIiiIIIiIiIii;
   private float llIIliIiiilIIliIii;
   public static final int IilIIiIiililIIiIii = 95;

   public void Iiilliiliiil() {
      if (this.lillIiIiiiillIiIii && this.liiiIiIiiiiiiIiIii) {
         this.IIIIliIiilIIIliIii = true;
      }
   }

   public float[] IlIillIiilIi(float fromYaw, float fromPitch, float s, float toPitch, IIIliIilIIliIi toYaw) {
      IIIliIilIIliIi var6 = toYaw == null ? IIIliIilIIliIi.illIIiliiIilIIilii : toYaw;
      return this.lIllIiIiiiIllIiIii.lIiiIiIlilli(fromYaw, fromPitch, s, toPitch, this.IiilIiIiiliilIiIii, var6.iIiIIiliiIliIIilii * this.IlllIiIiillllIiIii);
   }

   private void Iilililiiili(int p, IiilIiIiliilIiIi s, float kind, float prio, IIIliIilIIliIi pitch, int yaw) {
      if (this.lillIiIiiiillIiIii && !this.liiiIiIiiiiiiIiIii) {
         if (this.llliIiIiiilliIiIii == 0 || yaw > this.iliiIiIiiIiiiIiIii) {
            this.llliIiIiiilliIiIii = p;
            this.IiliIiIiililiIiIii = s == null ? IiilIiIiliilIiIi.liIllIiIIi : s;
            this.iiliIiIiiIIiiIiIii = kind;
            this.lIiiIiIiiiIiiIiIii = prio;
            this.IliiIiIiilliiIiIii = pitch;
            this.iliiIiIiiIiiiIiIii = yaw;
         }
      }
   }

   public float lIiiIiIlilli() {
      return this.llilIiIiiililIiIii;
   }

   public IIIIIlilIIIIli IIlilIliiIli(boolean acted) {
      if (!this.lillIiIiiiillIiIii) {
         return null;
      } else {
         this.lillIiIiiiillIiIii = false;
         IIIIIlilIIIIli var2;
         if (acted) {
            var2 = this.IIIIliIiilIIIliIii && this.liiiIiIiiiiiiIiIii
               ? new IIIIIlilIIIIli(this.IIilIiIiilIilIiIii, this.llIIliIiiilIIliIii, this.IiIIliIiiliIIliIii, this.IiliIiIiililiIiIii, false)
               : new IIIIIlilIIIIli(this.IIilIiIiilIilIiIii, this.iIilIiIiiIlilIiIii, this.llilIiIiiililIiIii, IiilIiIiliilIiIi.IIlllIiIIi, true);
         } else if (this.llliIiIiiilliIiIii == 0) {
            var2 = null;
         } else if (this.llliIiIiiilliIiIii == 2) {
            float var3 = (float)iIIIlIlIIl((double)this.iiliIiIiiIIiiIiIii - (double)this.iIilIiIiiIlilIiIii);
            float var4 = Iiiiliiiiiii(this.lIiiIiIiiiIiiIiIii) - this.llilIiIiiililIiIii;
            float var5 = IIIIllIIIl(lIlllIIliIlllIIl.liiiIIllIl(), this.IiilIiIiiliilIiIii);
            if (Math.abs(var3) > var5) {
               var3 = Math.copySign(var5, var3);
            }

            if (Math.abs(var4) > var5) {
               var4 = Math.copySign(var5, var4);
            }

            var2 = new IIIIIlilIIIIli(
               this.IIilIiIiilIilIiIii, this.iIilIiIiiIlilIiIii + var3, Iiiiliiiiiii(this.llilIiIiiililIiIii + var4), this.IiliIiIiililiIiIii, false
            );
         } else if (this.llliIiIiiilliIiIii == 1) {
            float[] var6 = this.lIllIiIiiiIllIiIii
               .lIiiIiIlilli(
                  this.iIilIiIiiIlilIiIii,
                  this.llilIiIiiililIiIii,
                  this.iiliIiIiiIIiiIiIii,
                  this.lIiiIiIiiiIiiIiIii,
                  this.IiilIiIiiliilIiIii,
                  this.IliiIiIiilliiIiIii.iIiIIiliiIliIIilii * this.IlllIiIiillllIiIii
               );
            var2 = new IIIIIlilIIIIli(this.IIilIiIiilIilIiIii, var6[0], Iiiiliiiiiii(var6[1]), this.IiliIiIiililiIiIii, false);
         } else {
            var2 = new IIIIIlilIIIIli(this.IIilIiIiilIilIiIii, this.iIilIiIiiIlilIiIii, this.llilIiIiiililIiIii, this.IiliIiIiililiIiIii, true);
         }

         this.iIIIliIiiIlIIliIii = acted && this.IIIIliIiilIIIliIii && this.liiiIiIiiiiiiIiIii && var2 != null;
         this.IIiilIiiiIii();
         if (var2 != null) {
            this.iIliIiIiiIlliIiIii = var2;
         }

         return var2;
      }
   }

   public void Iilllilliill(IiilIiIiliilIiIi p, float yaw, float pitch, int prio) {
      if (Float.isFinite(yaw) && Float.isFinite(pitch)) {
         this.Iilililiiili(2, p, yaw, pitch, IIIliIilIIliIi.illIIiliiIilIIilii, prio);
      }
   }

   public float[] Ililllililil(IiilIiIiliilIiIi s, float finish, float goalYaw, IIIliIilIIliIi p, int goalPitch, float prio) {
      if (!this.lillIiIiiiillIiIii) {
         return null;
      } else if (this.liiiIiIiiiiiiIiIii) {
         return new float[]{this.llIIliIiiilIIliIii, this.IiIIliIiiliIIliIii};
      } else if (!Float.isFinite(finish) || !Float.isFinite(goalYaw)) {
         return null;
      } else if (this.llliIiIiiilliIiIii != 0 && this.iliiIiIiiIiiiIiIii > goalPitch) {
         return null;
      } else {
         IIIliIilIIliIi var7 = p == null ? IIIliIilIIliIi.illIIiliiIilIIilii : p;
         float[] var8 = this.lIllIiIiiiIllIiIii
            .lIiiIiIlilli(
               this.iIilIiIiiIlilIiIii, this.llilIiIiiililIiIii, finish, goalYaw, this.IiilIiIiiliilIiIii, var7.iIiIIiliiIliIIilii * this.IlllIiIiillllIiIii
            );
         if (prio > 0.0F) {
            this.Iliilliiilii(var8, finish, goalYaw, prio);
         }

         this.llIIliIiiilIIliIii = var8[0];
         this.IiIIliIiiliIIliIii = Iiiiliiiiiii(var8[1]);
         this.liiiIiIiiiiiiIiIii = true;
         this.IIIIliIiilIIIliIii = false;
         this.llliIiIiiilliIiIii = 2;
         this.IiliIiIiililiIiIii = s == null ? IiilIiIiliilIiIi.liIllIiIIi : s;
         this.iiliIiIiiIIiiIiIii = this.llIIliIiiilIIliIii;
         this.lIiiIiIiiiIiiIiIii = this.IiIIliIiiliIIliIii;
         this.IliiIiIiilliiIiIii = var7;
         this.iliiIiIiiIiiiIiIii = goalPitch;
         return new float[]{this.llIIliIiiilIIliIii, this.IiIIliIiiliIIliIii};
      }
   }

   static float IIIIllIIIl(float cap, float gcd) {
      return gcd > 0.0F && Float.isFinite(gcd) ? (float)(Math.floor((double)(cap / gcd)) * (double)gcd) : cap;
   }

   public iilllIiIIillIi(Random rnd) {
      this.llliIiIiiilliIiIii = 0;
      this.lIllIiIiiiIllIiIii = new lIlllIIliIlllIIl(rnd == null ? new Random() : rnd);
   }

   public boolean IiIiliIiiiIi() {
      return this.llliIiIiiilliIiIii != 0;
   }

   public void IIlllIlliIll(IiilIiIiliilIiIi goalPitch, float goalYaw, float s, IIIliIilIIliIi p, int prio) {
      if (Float.isFinite(goalYaw) && Float.isFinite(s)) {
         this.Iilililiiili(1, goalPitch, goalYaw, s, p == null ? IIIliIilIIliIi.illIIiliiIilIIilii : p, prio);
      }
   }

   public boolean IIIilIIiiIIi() {
      return this.iIIIliIiiIlIIliIii || this.liiiIiIiiiiiiIiIii && this.IIIIliIiilIIIliIii;
   }

   public void IliIlllilIi(float scale) {
      this.IlllIiIiillllIiIii = Float.isFinite(scale) && scale > 0.0F ? Math.max(0.25F, Math.min(2.0F, scale)) : 1.0F;
   }

   public double IIIllIIliIIl() {
      return this.IIliIiIiilIliIiIii;
   }

   private static double iIIIlIlIIl(double x) {
      return (x % 360.0 + 540.0) % 360.0 - 180.0;
   }

   public boolean IlIlllIlilIl() {
      return this.IIliIiIiilIliIiIii <= 1.9;
   }

   private void IIiilIiiiIii() {
      this.llliIiIiiilliIiIii = 0;
      this.IiliIiIiililiIiIii = null;
      this.iiliIiIiiIIiiIiIii = 0.0F;
      this.lIiiIiIiiiIiiIiIii = 0.0F;
      this.IliiIiIiilliiIiIii = null;
      this.iliiIiIiiIiiiIiIii = Integer.MIN_VALUE;
      this.liiiIiIiiiiiiIiIii = false;
      this.IIIIliIiilIIIliIii = false;
      this.llIIliIiiilIIliIii = 0.0F;
      this.IiIIliIiiliIIliIii = 0.0F;
   }

   public void iIlIlllllill(long gcd, float prePitch, float preYaw, float tick) {
      long var12 = -7656121514016348488L;
      var12 ^= ((long)(this.illlIiIiiIillIiIii && gcd == this.IIilIiIiilIilIiIii ? 1 : 0) << 32 ^ var12) & -1L << 32;
      this.IIilIiIiilIilIiIii = gcd;
      this.iIilIiIiiIlilIiIii = prePitch;
      this.llilIiIiiililIiIii = preYaw;
      this.IiilIiIiiliilIiIii = tick;
      this.illlIiIiiIillIiIii = true;
      this.lillIiIiiiillIiIii = true;
      this.iIIIliIiiIlIIliIii = false;
      this.IIiilIiiiIii();
      if ((int)(var12 >>> 32) == 0) {
         var12 ^= ((long)(this.iIliIiIiiIlliIiIii != null && this.iIliIiIiiIlliIiIii.IliIlllilIi() == gcd - 1L ? 1 : 0) ^ var12) & -1L >>> 32;
         this.iiilIiIiiIIIiIiIii = (int)var12 != 0
            && liiIIliliiiIIlil.IIillIiliIil(prePitch, preYaw, this.iIliIiIiiIlliIiIii.liiiIIllIl(), this.iIliIiIiiIlliIiIii.iIlIlllllill());
         if ((int)var12 != 0 && !this.iiilIiIiiIIIiIiIii) {
            this.lIIiIiIiiiIIiIiIii++;
            this.lIllIiIiiiIllIiIii.iIlIlllllill();
         } else {
            this.lIIiIiIiiiIIiIiIii = 0;
         }

         if (this.IlIiIiIiillIiIiIii) {
            double var8 = Math.abs(iIIIlIlIIl((double)prePitch - (double)this.ilIiIiIiiIiIiIiIii));
            double var10 = Math.abs((double)preYaw - (double)this.liIiIiIiiiiIiIiIii);
            if (var8 > 1.0E-4 || var10 > 1.0E-4) {
               this.IIliIiIiilIliIiIii = var8;
            }
         }

         this.ilIiIiIiiIiIiIiIii = prePitch;
         this.liIiIiIiiiiIiIiIii = preYaw;
         this.IlIiIiIiillIiIiIii = true;
      }
   }

   public void Illlllllilll(IiilIiIiliilIiIi p, int prio) {
      this.Iilililiiili(3, p, this.iIilIiIiiIlilIiIii, this.llilIiIiiililIiIii, IIIliIilIIliIi.illIIiliiIilIIilii, prio);
   }

   public boolean iliIiiliiiii() {
      return this.iiilIiIiiIIIiIiIii;
   }

   private void Iliilliiilii(float[] finish, float goalPitch, float goalYaw, float r) {
      float var5 = Float.isFinite(this.IiilIiIiiliilIiIii) ? Math.max(this.IiilIiIiiliilIiIii, 1.0E-4F) : 1.0E-4F;
      float var6 = (float)iIIIlIlIIl((double)goalPitch - (double)finish[0]);
      float var7 = Iiiiliiiiiii(goalYaw) - finish[1];
      if (Math.abs(var6) <= r && Math.abs(var7) <= r) {
         float var8 = (float)Math.round(var6 / var5) * var5;
         float var9 = (float)Math.round(var7 / var5) * var5;
         float var10 = finish[0] - this.iIilIiIiiIlilIiIii;
         float var11 = finish[1] - this.llilIiIiiililIiIii;
         if (!(Math.abs(var10 + var8) > lIlllIIliIlllIIl.liiiIIllIl()) && !(Math.abs(var11 + var9) > lIlllIIliIlllIIl.liiiIIllIl())) {
            if (var8 != 0.0F && llIliillilIliill.iliIiiliiiii(finish[0] + var8) >= 0.1F) {
               finish[0] += var8;
            }

            finish[1] += var9;
         }
      }
   }

   private static float Iiiiliiiiiii(float pitch) {
      return Math.max(-90.0F, Math.min(90.0F, pitch));
   }

   public int IiIlliIliiIl() {
      return this.lIIiIiIiiiIIiIiIii;
   }

   public void liiiIIllIl() {
      this.lIllIiIiiiIllIiIii.iIlIlllllill();
      this.illlIiIiiIillIiIii = false;
      this.lillIiIiiiillIiIii = false;
      this.IIilIiIiilIilIiIii = 0L;
      this.iIilIiIiiIlilIiIii = 0.0F;
      this.llilIiIiiililIiIii = 0.0F;
      this.IiilIiIiiliilIiIii = 0.0F;
      this.iiilIiIiiIIIiIiIii = false;
      this.lIIiIiIiiiIIiIiIii = 0;
      this.IlIiIiIiillIiIiIii = false;
      this.ilIiIiIiiIiIiIiIii = 0.0F;
      this.liIiIiIiiiiIiIiIii = 0.0F;
      this.IIliIiIiilIliIiIii = 0.0;
      this.iIliIiIiiIlliIiIii = null;
      this.iIIIliIiiIlIIliIii = false;
      this.IIiilIiiiIii();
   }

   public float IilliliilIIi() {
      return this.iIilIiIiiIlilIiIii;
   }

   public IIIIIlilIIIIli Illillliilli() {
      return this.iIliIiIiiIlliIiIii;
   }

   public float[] IIillIiliIil(IiilIiIiliilIiIi goalYaw, float s, float goalPitch, IIIliIilIIliIi prio, int p) {
      return this.Ililllililil(goalYaw, s, goalPitch, prio, p, 0.0F);
   }
}
