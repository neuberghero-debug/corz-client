package gg.corz;

public final class iIIIilllIlIIilll {
   public static final double iiliiiIill = 0.12;
   private double IlIIIIlill;
   private final double[] IliiiiIill;
   public int IIlIIIlill = -(263302262 * -21 >>> 27 | 263302262 * -21 << 5) ^ -1302022742;
   public static final double llliiiIill = 80.0;
   private boolean iIIIIIlill;
   private final boolean[] liiiiiIill;
   private double llIIIIlill;
   public static final double illiiiIill = 0.25;
   private int IIIIIIlill;
   private final double[] lliiiiIill;
   private final float[] IiiiiiIill;
   private final double[] lIiiiiIill;
   private int iiiiiiIill;
   public static final double IiliiiIill = 0.1;
   private float liIIIIlill;
   private double ilIIIIlill;
   public long lIlIIIlill;
   private float iiIIIIlill;
   public static final int lIliiiIill = 384;
   private final double[] iliiiiIill;
   private final int IIiiiiIill;
   public static final double iIliiiIill = 0.05;
   private double IiIIIIlill;
   public static final double liliiiIill = 1.0E-4;
   public static final double IlliiiIill = 1.0;
   private boolean lIIIIIlill;
   private final double[] iIiiiiIill;

   public double Iliilliiilii() {
      return this.IlIIIIlill;
   }

   public boolean IIiilIiiiIii(int i) {
      return i == 0 || this.liiiiiIill[this.Iiilliiliiil(i)];
   }

   private void Ililllililil(double time, double px, double height, double py, float pz) {
      this.iIIIIIlill = true;
      this.IlIIIIlill = time;
      this.llIIIIlill = px;
      this.ilIIIIlill = height;
      this.IiIIIIlill = py;
      this.liIIIIlill = pz;
   }

   private int Iiilliiliiil(int i) {
      return (this.iiiiiiIill + i) % this.IIiiiiIill;
   }

   public iIIIilllIlIIilll() {
      this(((~464814537 ^ -63) << 25 | (~464814537 ^ -63) >>> 7) ^ -298358653);
   }

   public iIIIilllIlIIilll(int capacity) {
      this.IIiiiiIill = Math.max(-(-(1220352029 - 81)) ^ 1220351940, capacity);
      this.lIiiiiIill = new double[this.IIiiiiIill];
      this.iIiiiiIill = new double[this.IIiiiiIill];
      this.IliiiiIill = new double[this.IIiiiiIill];
      this.lliiiiIill = new double[this.IIiiiiIill];
      this.iliiiiIill = new double[this.IIiiiiIill];
      this.IiiiiiIill = new float[this.IIiiiiIill];
      this.liiiiiIill = new boolean[this.IIiiiiIill];
   }

   public double IIIilIIiiIIi(int i) {
      return this.lIiiiiIill[this.Iiilliiliiil(i)];
   }

   public float Iilililiiili(int i) {
      return this.IiiiiiIill[this.Iiilliiliiil(i)];
   }

   public double iIIIlIlIIl() {
      return this.IiIIIIlill;
   }

   public static float IlIlllIlilIl(float target, float current, double dt) {
      return !(dt > Double.longBitsToDouble(-7981978538219798391L ^ -7981978538219798391L))
         ? target
         : target + (float)((double)(current - target) * (1.0 - Math.exp(-dt / Double.longBitsToDouble(-5105460876170643256L ^ -8747263487904536976L))));
   }

   public void IiIlliIliiIl(double rawHeight, double lengthSeconds, double px, double py, float pz, double time) {
      if (!this.iIIIIIlill) {
         this.iiIIIIlill = pz;
         this.Ililllililil(rawHeight, lengthSeconds, px, py, pz);
         this.IIillIiliIil(rawHeight, lengthSeconds, px, py, pz, 0.0, true);
         this.lIIIIIlill = false;
      } else {
         double var12 = rawHeight - this.IlIIIIlill;
         double var14 = iiIIlIIlIl(lengthSeconds, px, py, this.llIIIIlill, this.ilIIIIlill, this.IiIIIIlill);
         if (IIIllIIliIIl(var14, var12)) {
            this.lIIIIIlill = true;
         }

         this.iiIIIIlill = IlIlllIlilIl(this.iiIIIIlill, pz, var12);
         float var16 = this.iiIIIIlill;
         this.Ililllililil(rawHeight, lengthSeconds, px, py, var16);
         if (!this.lIIIIIlill && this.IIIIIIlill != 0) {
            int var23 = this.Iiilliiliiil(this.IIIIIIlill - 1);
            double var18 = iiIIlIIlIl(lengthSeconds, px, py, this.iIiiiiIill[var23], this.IliiiiIill[var23], this.lliiiiIill[var23]);
            double var20 = rawHeight - this.lIiiiiIill[var23];
            boolean var22 = var18 > 1.0E-4 && var20 >= 0.1;
            if (!(var18 < 0.05) || var22) {
               if (!(var20 < iliIiiliiiii(time, this.IIiiiiIill))) {
                  this.IIillIiliIil(rawHeight, lengthSeconds, px, py, var16, this.iliiiiIill[var23] + var18, false);
               }
            }
         } else {
            double var17 = this.IIIIIIlill == 0 ? 0.0 : this.iliiiiIill[this.Iiilliiliiil(this.IIIIIIlill - 1)];
            this.IIillIiliIil(rawHeight, lengthSeconds, px, py, var16, var17, true);
            this.lIIIIIlill = false;
         }
      }
   }

   public void IIlllIlliIll(double now, double lengthSeconds) {
      double var5 = now - lengthSeconds;

      while (this.IIIIIIlill >= 2) {
         int var7 = this.Iiilliiliiil(0);
         int var8 = this.Iiilliiliiil(1);
         boolean var9 = this.lIiiiiIill[var8] <= var5;
         boolean var10 = this.liiiiiIill[var8] && this.lIiiiiIill[var7] <= var5;
         if (!var9 && !var10) {
            break;
         }

         this.Iilllilliill();
      }
   }

   public int IliIlllilIi() {
      return this.IIiiiiIill;
   }

   public double IiIiliIiiiIi(int i) {
      return this.IliiiiIill[this.Iiilliiliiil(i)];
   }

   public static boolean IIIllIIliIIl(double frameDt, double jump) {
      double var4 = Math.min(Math.max(jump, 0.0), Double.longBitsToDouble(-7645453234303736455L ^ -6181783355408325255L));
      return frameDt > Math.max(1.0, Double.longBitsToDouble(-1804343258996201745L ^ -6439673175467284753L) * var4);
   }

   public boolean Illlllllilll(double lengthSeconds, double now) {
      long var8 = -5552468607528570885L;
      if (!this.iIIIIIlill) {
         return true;
      } else {
         double var5 = lengthSeconds - now;
         if (this.IlIIIIlill > var5) {
            if (this.IIIIIIlill == 0) {
               return true;
            } else {
               var8 ^= ((long)this.Iiilliiliiil(this.IIIIIIlill - 1) << 32 ^ var8) & -1L << 32;
               return this.lIiiiiIill[(int)(var8 >>> 32)] > var5
                  ? false
                  : iiIIlIIlIl(
                        this.llIIIIlill,
                        this.ilIIIIlill,
                        this.IiIIIIlill,
                        this.iIiiiiIill[(int)(var8 >>> 32)],
                        this.IliiiiIill[(int)(var8 >>> 32)],
                        this.lliiiiIill[(int)(var8 >>> 32)]
                     )
                     < Double.longBitsToDouble(-6932231794905923121L ^ -6810844382455714750L);
            }
         } else {
            return true;
         }
      }
   }

   public float llIIlilIIl() {
      return this.liIIIIlill;
   }

   public double Iiiiliiiiiii() {
      return this.llIIIIlill;
   }

   public double Illillliilli(int i) {
      return this.iliiiiIill[this.Iiilliiliiil(i)];
   }

   public int IiIIlliIIl() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.IIIIIIlill; var2++) {
         if (this.IIiilIiiiIii(var2)) {
            var1++;
         }
      }

      return var1;
   }

   public int liiiIIllIl() {
      return this.IIIIIIlill;
   }

   public static double iliIiiliiiii(double lengthSeconds, int capacity) {
      return Math.max(0.0, lengthSeconds) / (double)Math.max(1, capacity - (~(-2142840031 ^ -125 ^ -31) ^ 2142839980));
   }

   public void IilliliilIIi() {
      this.iiiiiiIill = 0;
      this.IIIIIIlill = 0;
      this.lIIIIIlill = false;
      this.iIIIIIlill = false;
   }

   public boolean iIlIlllllill() {
      return this.iIIIIIlill;
   }

   public void lIiiIiIlilli() {
      this.lIIIIIlill = true;
   }

   private void Iilllilliill() {
      this.iiiiiiIill = (this.iiiiiiIill + 1) % this.IIiiiiIill;
      this.IIIIIIlill--;
      if (this.IIIIIIlill > 0) {
         this.liiiiiIill[this.iiiiiiIill] = true;
      }
   }

   public double IlIillIiilIi(int i) {
      return this.iIiiiiIill[this.Iiilliiliiil(i)];
   }

   static double iiIIlIIlIl(double by, double az, double bz, double ax, double ay, double bx) {
      double var12 = by - ax;
      double var14 = az - ay;
      double var16 = bz - bx;
      return Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
   }

   public double IIIIllIIIl() {
      return this.ilIIIIlill;
   }

   public double IIlilIliiIli(int i) {
      return this.lliiiiIill[this.Iiilliiliiil(i)];
   }

   private void IIillIiliIil(double pz, double height, double py, double odo, float start, double time, boolean px) {
      long var14 = 4633060901382525221L;
      if (this.IIIIIIlill == this.IIiiiiIill) {
         this.Iilllilliill();
      }

      var14 ^= ((long)this.Iiilliiliiil(this.IIIIIIlill) << 32 ^ var14) & -1L << 32;
      this.lIiiiiIill[(int)(var14 >>> 32)] = pz;
      this.iIiiiiIill[(int)(var14 >>> 32)] = height;
      this.IliiiiIill[(int)(var14 >>> 32)] = py;
      this.lliiiiIill[(int)(var14 >>> 32)] = odo;
      this.IiiiiiIill[(int)(var14 >>> 32)] = start;
      this.iliiiiIill[(int)(var14 >>> 32)] = time;
      this.liiiiiIill[(int)(var14 >>> 32)] = px || this.IIIIIIlill == 0;
      this.IIIIIIlill++;
   }
}
