package gg.corz;

import java.util.Locale;

public final class IIliilllIliill {
   private int IIIlIllIilIIlIllIi;
   private int iiIlIllIiIIllIllIi;
   private int lIllIllIiiIllIllIi;
   private long IliIIllIilliIIllIi = -1L;
   private int IlllIllIillllIllIi;
   public static final long IilIIllIililIIllIi = 500000000L;
   private long iiilIllIiIIIiIllIi;
   private int liIiIllIiiiIiIllIi;
   public static final long lllIIllIiillIIllIi = 250000000L;
   private boolean IlIiIllIillIiIllIi;
   private boolean iIIlIllIiIlIlIllIi;
   public static final long lIiIIllIiiIiIIllIi = 500000000L;
   private long liiIIllIiiiiIIllIi;
   private long iIilIllIiIlilIllIi;
   private long illlIllIiIillIllIi;
   private long IIilIllIilIilIllIi;
   private int IiIlIllIiliIlIllIi;
   private long IiilIllIiliilIllIi;
   public static final long iIlIIllIiIllIIllIi = 40000000L;
   public static final long iilIIllIiIIiIIllIi = 500000000L;
   private long llIlIllIiilIlIllIi;
   private long lIIiIllIiiIIiIllIi;
   private long iliIIllIiIiiIIllIi = -1L;
   private long llilIllIiililIllIi;
   private int ilIiIllIiIiIiIllIi;
   private long lillIllIiiillIllIi;

   public boolean lIiiIiIlilli(long minIntervalNanos, long nowNanos) {
      if (this.llilIllIiililIllIi >= 0L && minIntervalNanos - this.llilIllIiililIllIi < nowNanos) {
         return false;
      } else {
         this.llilIllIiililIllIi = minIntervalNanos;
         return true;
      }
   }

   public boolean IiIlliIliiIl() {
      return this.iIIlIllIiIlIlIllIi;
   }

   public int Illlllllilll() {
      return this.liIiIllIiiiIiIllIi;
   }

   public boolean IIlllIlliIll() {
      return this.llIlIllIiilIlIllIi >= 0L && (this.llIlIllIiilIlIllIi < 40000000L || this.iIIlIllIiIlIlIllIi);
   }

   public long IlIillIiilIi() {
      return this.liiIIllIiiiiIIllIi;
   }

   public IIliilllIliill() {
      this.liiIIllIiiiiIIllIi = -1L;
      this.iIilIllIiIlilIllIi = -1L;
      this.llilIllIiililIllIi = -1L;
      this.IiilIllIiliilIllIi = -1L;
      this.iiilIllIiIIIiIllIi = -1L;
      this.lIIiIllIiiIIiIllIi = -1L;
   }

   public void iIlIlllllill() {
      this.lIllIllIiiIllIllIi++;
      this.IlllIllIillllIllIi++;
   }

   public String IiIiliIiiiIi(int serverCorrectionAge, int serverCorrectionDistance, int clientMovePacketsThisTick, double autoMovePacketsThisTick) {
      return String.format(
         Locale.ROOT,
         IIiilIiiiIii<"IIiilIiiiIii","OUgasRA8l7DjBb5ceTB2yIaqk3QS0fadPqTUic9uRl6Vzu9Fc3P0O0ceJ670GVvnkTHanZHmrPirNp8kqOJL7VSEBfvnTNoRryM4Pz/yRsAGToEQAlIuF8InBo/PVtQEkJsVQzJJQlUx5RUxESxVi6PjBbsTqtWWx//V9Gs+Hkxx45IeLUN20C6gEHsSt6a/3fDR+LiTeknWewyAlIJCQgapibFLJmFvJdI+sEX1/4Vz/CnyHa0u2t+6B5QpOrQzHNDb8OzWv8AC7zZQR8nd5dPECuyXSvQS3pgnfgyrlRs=">(),
         this.IIIlIllIilIIlIllIi,
         this.Ililllililil(),
         serverCorrectionAge,
         serverCorrectionDistance,
         this.iIIlIllIiIlIlIllIi,
         this.IIlllIlliIll(),
         this.liIiIllIiiiIiIllIi,
         this.IIillIiliIil(),
         clientMovePacketsThisTick,
         autoMovePacketsThisTick
      );
   }

   public void IliIlllilIi(long framesSinceLastTick, int nowNanos) {
      this.IIIlIllIilIIlIllIi++;
      this.ilIiIllIiIiIiIllIi++;
      this.llIlIllIiilIlIllIi = this.IliIIllIilliIIllIi < 0L ? -1L : framesSinceLastTick - this.IliIIllIilliIIllIi;
      this.iIIlIllIiIlIlIllIi = this.IliIIllIilliIIllIi >= 0L && nowNanos == 0 && (this.llIlIllIiilIlIllIi < 40000000L || this.iIIlIllIiIlIlIllIi);
      if (this.iIIlIllIiIlIlIllIi) {
         this.IiIlIllIiliIlIllIi++;
         this.iiIlIllIiIIllIllIi++;
      }

      this.liIiIllIiiiIiIllIi = this.IIlllIlliIll() ? this.liIiIllIiiiIiIllIi + 1 : 0;
      this.IliIIllIilliIIllIi = this.iliIIllIiIiiIIllIi = framesSinceLastTick;
   }

   public int Iiilliiliiil() {
      return this.IiIlIllIiliIlIllIi;
   }

   public boolean IIIllIIliIIl(long nowNanos) {
      if (this.iiilIllIiIIIiIllIi >= 0L && nowNanos - this.iiilIllIiIIIiIllIi < 500000000L) {
         return false;
      } else {
         this.iiilIllIiIIIiIllIi = nowNanos;
         return true;
      }
   }

   public void Iilililiiili() {
      this.IliIIllIilliIIllIi = this.iliIIllIiIiiIIllIi = this.liiIIllIiiiiIIllIi = -1L;
      this.IIIlIllIilIIlIllIi = 0;
      this.iIIlIllIiIlIlIllIi = false;
      this.llIlIllIiilIlIllIi = -1L;
      this.IiIlIllIiliIlIllIi = this.iiIlIllIiIIllIllIi = this.lIllIllIiiIllIllIi = this.IlllIllIillllIllIi = this.ilIiIllIiIiIiIllIi = this.liIiIllIiiiIiIllIi = 0;
      this.illlIllIiIillIllIi = this.lillIllIiiillIllIi = this.IIilIllIilIilIllIi = 0L;
      this.iIilIllIiIlilIllIi = this.llilIllIiililIllIi = this.IiilIllIiliilIllIi = this.iiilIllIiIIIiIllIi = this.lIIiIllIiiIIiIllIi = -1L;
      this.IlIiIllIillIiIllIi = false;
   }

   public String IIlilIliiIli(int movementStepsThisTick, int routeState, int autoMovementPacketsThisTick, String clientMovePacketsThisTick) {
      return String.format(
         Locale.ROOT,
         IIiilIiiiIii<"IIiilIiiiIii","0YJu1/+OR0gj8BzQqY9lIRZI/4xIPVPNEX2wYWxP9fu+Ak8RE+RaOe3hTE4n0rc7L6T0mQk6fkRssinqnYyHa3dhvhcnHu/vFReZaz8M6OuVPV1NkjCTZhqZqlXwp8K7Mh6otXXG5kkkYiJCWDdK20Av8ztrF6kNobzdrygzgiR2w3a77Jl693kuS9Zwg+HsHMUhjBC+U6xcPER8hZCQ6gFt7gtOno7wjlblbVJdeekJU3C8AyXLQfSXlkN0xbBmaA==">(),
         this.IIIlIllIilIIlIllIi,
         this.IIillIiliIil(),
         movementStepsThisTick,
         routeState,
         autoMovementPacketsThisTick,
         clientMovePacketsThisTick,
         this.IiIlIllIiliIlIllIi,
         this.iIIlIllIiIlIlIllIi,
         this.Ililllililil()
      );
   }

   public boolean iliIiiliiiii(long nowNanos) {
      if (this.IiilIllIiliilIllIi >= 0L && nowNanos - this.IiilIllIiliilIllIi < 500000000L) {
         return false;
      } else {
         this.IiilIllIiliilIllIi = nowNanos;
         return true;
      }
   }

   public int IIIilIIiiIIi() {
      return this.lIllIllIiiIllIllIi;
   }

   public boolean IlIlllIlilIl(long nowNanos) {
      if (this.lIIiIllIiiIIiIllIi >= 0L && nowNanos - this.lIIiIllIiiIIiIllIi < 500000000L) {
         return false;
      } else {
         this.lIIiIllIiiIIiIllIi = nowNanos;
         return true;
      }
   }

   public void liiiIIllIl(long nowNanos) {
      this.illlIllIiIillIllIi = Math.max(0L, nowNanos - this.iliIIllIiIiiIIllIi);
      this.lillIllIiiillIllIi = this.lillIllIiiillIllIi + this.illlIllIiIillIllIi;
      this.IIilIllIilIilIllIi = Math.max(this.IIilIllIilIilIllIi, this.illlIllIiIillIllIi);
      this.liiIIllIiiiiIIllIi = nowNanos;
      if (this.IlIiIllIillIiIllIi) {
         this.iIilIllIiIlilIllIi = nowNanos;
         this.IlIiIllIillIiIllIi = false;
      }
   }

   public long IIillIiliIil() {
      return this.illlIllIiIillIllIi / 1000000L;
   }

   public String Illillliilli() {
      String var1 = String.format(
         Locale.ROOT,
         IIiilIiiiIii<"IIiilIiiiIii","9JCW41uHir5DE0YpPdfxbYoQpXZh6SfMnL15tygSN6UgBPDBcrgnYVA+nENhPVAkhhulXcIIsUEyzxC8iqm77kdtjgl0fi5GgN2GZnqGZqrQUOEsfPPtthveO4PALYJiC2JM1ut+vPAsKs/avLCPQOypUw9HIKf5/81W3i40q2ViJhZpVMpYzot8yQXskcrkTzag">(),
         this.ilIiIllIiIiIiIllIi,
         this.iiIlIllIiIIllIllIi,
         this.IlllIllIillllIllIi,
         this.ilIiIllIiIiIiIllIi == 0 ? 0.0 : (double)this.lillIllIiiillIllIi / 1000000.0 / (double)this.ilIiIllIiIiIiIllIi,
         this.IIilIllIilIilIllIi / 1000000L,
         this.IiIlIllIiliIlIllIi,
         this.lIllIllIiiIllIllIi
      );
      this.ilIiIllIiIiIiIllIi = this.iiIlIllIiIIllIllIi = this.IlllIllIillllIllIi = 0;
      this.lillIllIiiillIllIi = this.IIilIllIilIilIllIi = 0L;
      return var1;
   }

   public long Ililllililil() {
      return this.llIlIllIiilIlIllIi < 0L ? -1L : this.llIlIllIiilIlIllIi / 1000000L;
   }

   public boolean IilliliilIIi(long nowNanos) {
      if (this.IlIiIllIillIiIllIi) {
         return false;
      } else if (this.iIilIllIiIlilIllIi >= 0L && nowNanos - this.iIilIllIiIlilIllIi < 250000000L) {
         return false;
      } else {
         this.IlIiIllIillIiIllIi = true;
         return true;
      }
   }

   public int Iilllilliill() {
      return this.IIIlIllIilIIlIllIi;
   }
}
