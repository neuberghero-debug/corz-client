package gg.corz;

import java.util.Locale;

public record lIliIiliIliIil(
   int teleportId,
   boolean absolute,
   int relativeFlags,
   double beforeX,
   double beforeY,
   double beforeZ,
   float beforeYaw,
   float beforePitch,
   double afterX,
   double afterY,
   double afterZ,
   float afterYaw,
   float afterPitch
) {
   private final double IiiiIliIiliiiIliIi;
   private final boolean IiIiIliIiliIiIliIi;
   private final int llIiIliIiilIiIliIi;
   public static final double IlIIlliIillIIlliIi = 0.05;
   private final float lIIIlliIiiIIIlliIi;
   private final float IIiiIliIilIiiIliIi;
   private final double lIliIliIiiIliIliIi;
   public static final double ilIIlliIiIiIIlliIi = 0.5;
   private final float iiiiIliIiIIIIlliIi;
   private final double IlliIliIillliIliIi;
   private final double illiIliIiIiliIliIi;
   private final int iiIiIliIiIIliIliIi;
   private final double iIiiIliIiIliiIliIi;
   private final float liliIliIiiiliIliIi;
   private final double lliiIliIiiliiIliIi;

   public double iIlIlllllill() {
      return this.IiiiIliIiliiiIliIi - this.illiIliIiIiliIliIi;
   }

   public double liiiIIllIl() {
      return this.lliiIliIiiliiIliIi - this.IlliIliIillliIliIi;
   }

   public double IIlilIliiIli() {
      return this.iIiiIliIiIliiIliIi;
   }

   public boolean IlIlllIlilIl() {
      return this.IilliliilIIi() >= 0.05 || Math.abs(this.lIiiIiIlilli()) >= 0.5 || Math.abs(this.iliIiiliiiii()) >= 0.5;
   }

   public float Iliilliiilii() {
      return this.lIIIlliIiiIIIlliIi;
   }

   public double IilliliilIIi() {
      return Math.sqrt(this.IliIlllilIi() * this.IliIlllilIi() + this.liiiIIllIl() * this.liiiIIllIl() + this.iIlIlllllill() * this.iIlIlllllill());
   }

   public double Ililllililil() {
      return this.lIliIliIiiIliIliIi;
   }

   public double IliIlllilIi() {
      return this.iIiiIliIiIliiIliIi - this.lIliIliIiiIliIliIi;
   }

   public float IiIiliIiiiIi() {
      return this.IIiiIliIilIiiIliIi;
   }

   public double IIIilIIiiIIi() {
      return this.illiIliIiIiliIliIi;
   }

   public float IIiilIiiiIii() {
      return this.iiiiIliIiIIIIlliIi;
   }

   static double IIIllIIliIIl(double deg) {
      deg %= 360.0;
      if (deg >= 180.0) {
         deg -= 360.0;
      }

      if (deg < -180.0) {
         deg += 360.0;
      }

      return deg;
   }

   public double lIiiIiIlilli() {
      return IIIllIIliIIl((double)(this.iiiiIliIiIIIIlliIi - this.liliIliIiiiliIliIi));
   }

   public double Illillliilli() {
      return this.lliiIliIiiliiIliIi;
   }

   public boolean Iilllilliill() {
      return this.IiIiIliIiliIiIliIi;
   }

   public double Iiilliiliiil() {
      return this.IlliIliIillliIliIi;
   }

   public static lIlliiIiiIlliiIi IIlllIlliIll(lIliIiliIliIil c, boolean preciseActionActive) {
      return c != null && c.IlIlllIlilIl() && preciseActionActive ? lIlliiIiiIlliiIi.lilIlIIlIi : lIlliiIiiIlliiIi.IilIlIIlIi;
   }

   public String IiIlliIliiIl() {
      return String.format(
         Locale.ROOT,
         Iiiiliiiiiii<"Iiiiliiiiiii","1xrHbGuMr45CiP4+vNERLua+HQyoDFWZ2VZhEnY6fjyhP8vy3LMOpSeS/52/mdelm1bpsxOq9W1FlrhdHTxoYOEjZp3kdg7H9FCVwco/DEDxo2ZEcVMYRuiXdPk5l4HUq2Pkz0+OrkSqM9M3AXGrT/VIsa2hWEs1SAEgyH/uSGb3oao0RgV5I0LhRZDAnhx9EPPUkdt1meXUZWuWRQWikOqfGgSNbn6a1f54oujPIwRi6CRdZvwpPwmh/gFmkHUqw5Pzo+q+rGQ0/uV3Gppw888=">(),
         this.llIiIliIiilIiIliIi,
         this.IiIiIliIiliIiIliIi,
         this.iiIiIliIiIIliIliIi,
         this.lIliIliIiiIliIliIi,
         this.IlliIliIillliIliIi,
         this.illiIliIiIiliIliIi,
         this.iIiiIliIiIliiIliIi,
         this.lliiIliIiiliiIliIi,
         this.IiiiIliIiliiiIliIi,
         this.IliIlllilIi(),
         this.liiiIIllIl(),
         this.iIlIlllllill(),
         this.IilliliilIIi(),
         this.liliIliIiiiliIliIi,
         this.IIiiIliIilIiiIliIi,
         this.iiiiIliIiIIIIlliIi,
         this.lIIIlliIiiIIIlliIi,
         this.IlIlllIlilIl()
      );
   }

   public double Iilililiiili() {
      return this.IiiiIliIiliiiIliIi;
   }

   public int Illlllllilll() {
      return this.llIiIliIiilIiIliIi;
   }

   public lIliIiliIliIil(
      int teleportId,
      boolean absolute,
      int relativeFlags,
      double beforeX,
      double beforeY,
      double beforeZ,
      float beforeYaw,
      float beforePitch,
      double afterX,
      double afterY,
      double afterZ,
      float afterYaw,
      float afterPitch
   ) {
      this.llIiIliIiilIiIliIi = teleportId;
      this.IiIiIliIiliIiIliIi = absolute;
      this.iiIiIliIiIIliIliIi = relativeFlags;
      this.lIliIliIiiIliIliIi = beforeX;
      this.IlliIliIillliIliIi = beforeY;
      this.illiIliIiIiliIliIi = beforeZ;
      this.liliIliIiiiliIliIi = beforeYaw;
      this.IIiiIliIilIiiIliIi = beforePitch;
      this.iIiiIliIiIliiIliIi = afterX;
      this.lliiIliIiiliiIliIi = afterY;
      this.IiiiIliIiliiiIliIi = afterZ;
      this.iiiiIliIiIIIIlliIi = afterYaw;
      this.lIIIlliIiiIIIlliIi = afterPitch;
   }

   public int IIillIiliIil() {
      return this.iiIiIliIiIIliIliIi;
   }

   public double iliIiiliiiii() {
      return (double)(this.lIIIlliIiiIIIlliIi - this.IIiiIliIilIiiIliIi);
   }

   public float IlIillIiilIi() {
      return this.liliIliIiiiliIliIi;
   }
}
