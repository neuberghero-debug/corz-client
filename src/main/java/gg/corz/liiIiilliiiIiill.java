package gg.corz;

public final class liiIiilliiiIiill {
   public static final float iIIlIiiill = 0.08F;
   private float illlIiiill;
   public static final float ilIlIiiill = 1.2F;
   public static final float liiIIiiill = 12.0F;
   private float llllIiiill;
   public static final float IlIlIiiill = 0.35F;
   public static final float llIlIiiill = 0.55F;
   private boolean IillIiiill;
   public static final int iliIIiiill = -54742;
   public static final int IiiIIiiill = -12959668;
   private static final double iiIlIiiill = Math.PI * 2;
   public static final float IiIlIiiill = 0.35F;
   public static final float liIlIiiill = 2.4F;
   public static final float iiiIIiiill = 0.8F;
   public static final float IIIlIiiill = 0.9F;
   public static final float lIIlIiiill = 0.84F;
   private IililIIllililIIl IIllIiiill;
   private float iIllIiiill;
   private int lIllIiiill = -12959668;
   private float IlllIiiill;

   public void IIIllIIliIIl() {
      this.IillIiiill = true;
   }

   public IililIIllililIIl Illlllllilll() {
      return this.IIllIiiill == null ? IililIIllililIIl.IlIIIIilIl : this.IIllIiiill;
   }

   public void IiIlliIliiIl(IililIIllililIIl timeS, float m) {
      this.IIllIiiill = timeS == null ? IililIIllililIIl.IlIIIIilIl : timeS;
      this.llllIiiill = 1.0F;
      this.IillIiiill = false;
      this.IlllIiiill = this.iIllIiiill = liiiIIllIl(this.IIllIiiill, m);
      this.illlIiiill = this.IIllIiiill.IliIlllilIi() ? 1.0F : 0.0F;
      this.lIllIiiill = iIlIlllllill(-12959668, -54742, this.IlllIiiill);
   }

   public float Ililllililil() {
      return this.illlIiiill;
   }

   private static float IilliliilIIi(float hz, float timeS) {
      return (float)Math.sin((double)(hz * timeS) * (Math.PI * 2));
   }

   public void iliIiiliiiii() {
      if (this.IillIiiill) {
         this.IillIiiill = false;
         this.iIllIiiill = this.IlllIiiill;
         this.llllIiiill = 0.0F;
      }
   }

   public int Iilllilliill() {
      return this.lIllIiiill;
   }

   public static int iIlIlllllill(int t, int a, float b) {
      long var9 = -267666278027799440L;
      long var11 = -5196683760156118099L;
      long var13 = 738499040173793212L;
      b = b < 0.0F ? 0.0F : (b > 1.0F ? 1.0F : b);
      var9 ^= ((long)(t >> 16 & 0xFF) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)(t >> 8 & 0xFF) ^ var9) & -1L >>> 32;
      var11 ^= ((long)(t & 0xFF) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(a >> 16 & 0xFF) ^ var11) & -1L >>> 32;
      var13 ^= ((long)(a >> 8 & 0xFF) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(a & 0xFF) ^ var13) & -1L >>> 32;
      return 0xFF000000
         | Math.round((float)((int)(var9 >>> 32)) + (float)((int)var11 - (int)(var9 >>> 32)) * b) << 16
         | Math.round((float)((int)var9) + (float)((int)(var13 >>> 32) - (int)var9) * b) << 8
         | Math.round((float)((int)(var11 >>> 32)) + (float)((int)var13 - (int)(var11 >>> 32)) * b);
   }

   public liiIiilliiiIiill() {
      this.llllIiiill = 1.0F;
   }

   public boolean IlIlllIlilIl() {
      return this.IillIiiill;
   }

   public void IIlllIlliIll() {
      this.IIllIiiill = null;
      this.llllIiiill = 1.0F;
      this.IillIiiill = false;
      this.iIllIiiill = this.IlllIiiill = this.illlIiiill = 0.0F;
      this.lIllIiiill = -12959668;
   }

   public int Iiilliiliiil() {
      long var2 = 7435978883928618468L;
      var2 ^= ((long)Math.round(Math.max(0.0F, Math.min(1.0F, this.IlllIiiill)) * 255.0F) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) << 24 | 16722474;
   }

   public static float liiiIIllIl(IililIIllililIIl timeS, float m) {
      return switch (timeS) {
         case liIIIIilIl -> 0.0F;
         case IiIIIIilIl -> 0.8F;
         case ilIIIIilIl -> 0.84F + 0.08F * IilliliilIIi(m, 0.35F);
         case llIIIIilIl -> 0.9F;
         case iiIIIIilIl -> 0.55F + 0.45F * (0.5F + 0.5F * IilliliilIIi(m, 1.2F));
         case IlIIIIilIl -> 0.35F + 0.65F * (0.5F + 0.5F * IilliliilIIi(m, 2.4F));
      };
   }

   public float IIillIiliIil() {
      return this.IlllIiiill;
   }

   public int lIiiIiIlilli(IililIIllililIIl timeS, float dt, float m) {
      if (timeS == null) {
         timeS = IililIIllililIIl.IlIIIIilIl;
      }

      if (this.IIllIiiill == null) {
         this.IIllIiiill = timeS;
         this.llllIiiill = 1.0F;
      } else if (timeS != this.IIllIiiill) {
         this.iIllIiiill = this.IlllIiiill;
         this.IIllIiiill = timeS;
         this.llllIiiill = 0.0F;
      }

      float var4 = m <= 0.0F ? 0.0F : 1.0F - (float)Math.exp((double)(-12.0F * m));
      this.llllIiiill = this.llllIiiill + (1.0F - this.llllIiiill) * var4;
      this.illlIiiill = this.illlIiiill + ((timeS.IliIlllilIi() ? 1.0F : 0.0F) - this.illlIiiill) * var4;
      if (this.IillIiiill) {
         this.llllIiiill = 1.0F;
         this.IlllIiiill = this.iIllIiiill = 0.0F;
      } else {
         this.IlllIiiill = this.iIllIiiill + (liiiIIllIl(timeS, dt) - this.iIllIiiill) * this.llllIiiill;
      }

      this.lIllIiiill = iIlIlllllill(-12959668, -54742, this.IlllIiiill);
      return this.lIllIiiill;
   }

   public static IililIIllililIIl IliIlllilIi(boolean snap, IlillIIillillIIi enabled) {
      if (!snap) {
         return IililIIllililIIl.IlIIIIilIl;
      } else if (enabled == null) {
         return IililIIllililIIl.llIIIIilIl;
      } else {
         return switch (enabled.liiiIIllIl()) {
            case lIlIiliill -> IililIIllililIIl.ilIIIIilIl;
            case iIlIiliill -> IililIIllililIIl.iiIIIIilIl;
            case IIlIiliill -> enabled.IilliliilIIi() != null ? IililIIllililIIl.liIIIIilIl : IililIIllililIIl.IiIIIIilIl;
            default -> IililIIllililIIl.llIIIIilIl;
         };
      }
   }
}
