package gg.corz;

import java.util.Locale;

public record iillilllIIililll(
   IIlIiiIilIlIiiIi eyeMode,
   boolean sneak,
   boolean guiSupport,
   double eyeHeight,
   int lookDirection,
   int supportFace,
   double bodyTolerance,
   double centreRadius,
   int nudgeTicks,
   int settleTicks
) {
   private final double iliIiIlill;
   private final int lIIliIlill;
   private final double iiiIiIlill;
   private final boolean IliIiIlill;
   private final int liiIiIlill;
   public static final double IlIliIlill = 0.02;
   private final IIlIiiIilIlIiiIi iIiIiIlill;
   private final boolean lliIiIlill;
   private final int IiiIiIlill;
   private final int iIIliIlill;
   private final double IIIliIlill;

   public int Illlllllilll() {
      return this.liiIiIlill;
   }

   public static iillilllIIililll liiiIIllIl(IIlIiiIilIlIiiIi supportFace, boolean mode, int guiSupport, int lookDirection) {
      long var5 = 1319264007726633586L;
      var5 ^= ((long)(supportFace == IIlIiiIilIlIiiIi.illIiiiIIi ? 1 : 0) << 32 ^ var5) & -1L << 32;
      return new iillilllIIililll(supportFace, (int)(var5 >>> 32) != 0 || mode, mode, IliIlllilIi(supportFace), guiSupport, lookDirection, 0.3, 0.07, 30, 6);
   }

   public int Iiilliiliiil() {
      return this.iIIliIlill;
   }

   public boolean IIIllIIliIIl() {
      return this.IliIiIlill;
   }

   public boolean IlIlllIlilIl() {
      return this.lliIiIlill;
   }

   public int IIlllIlliIll() {
      return this.IiiIiIlill;
   }

   public String lIiiIiIlilli() {
      return String.format(
         Locale.ROOT,
         IIIilIIiiIIi<"IIIilIIiiIIi","vhn/73aVzoZX1yQtKUeLq+0ZaJIZl2Ix1UgRQebhzPm3BxB0XogytkAHS78r7XAn4b+Mqi+2h/U9Sb52TfVcg2YFFtXd5V1m1fbuZbmaMY3xc9kAfRLn+5+tSvUNxOFY">(),
         this.iIiIiIlill,
         this.IliIiIlill,
         this.lliIiIlill,
         this.iliIiIlill,
         this.IiiIiIlill,
         this.liiIiIlill,
         this.lIIliIlill,
         this.iIIliIlill
      );
   }

   public double Iilllilliill() {
      return this.iiiIiIlill;
   }

   public boolean iIlIlllllill(double sneaking, boolean eyeAboveFeet) {
      return eyeAboveFeet == this.IliIiIlill && Math.abs(sneaking - this.iliIiIlill) <= 0.02;
   }

   public double IIillIiliIil() {
      return this.IIIliIlill;
   }

   public boolean IilliliilIIi() {
      return Math.abs(this.iliIiIlill - IliIlllilIi(this.iIiIiIlill)) <= 1.0E-9
         && this.IliIiIlill == (this.iIiIiIlill == IIlIiiIilIlIiiIi.illIiiiIIi || this.lliIiIlill)
         && (!this.lliIiIlill || this.iIiIiIlill == IIlIiiIilIlIiiIi.illIiiiIIi);
   }

   public IIlIiiIilIlIiiIi iliIiiliiiii() {
      return this.iIiIiIlill;
   }

   public int Ililllililil() {
      return this.lIIliIlill;
   }

   public static double IliIlllilIi(IIlIiiIilIlIiiIi mode) {
      return mode == IIlIiiIilIlIiiIi.illIiiiIIi ? 1.27 : 1.62;
   }

   public iillilllIIililll(
      IIlIiiIilIlIiiIi eyeMode,
      boolean sneak,
      boolean guiSupport,
      double eyeHeight,
      int lookDirection,
      int supportFace,
      double bodyTolerance,
      double centreRadius,
      int nudgeTicks,
      int settleTicks
   ) {
      this.iIiIiIlill = eyeMode;
      this.IliIiIlill = sneak;
      this.lliIiIlill = guiSupport;
      this.iliIiIlill = eyeHeight;
      this.IiiIiIlill = lookDirection;
      this.liiIiIlill = supportFace;
      this.iiiIiIlill = bodyTolerance;
      this.IIIliIlill = centreRadius;
      this.lIIliIlill = nudgeTicks;
      this.iIIliIlill = settleTicks;
   }

   public double IiIlliIliiIl() {
      return this.iliIiIlill;
   }
}
