package gg.corz;

public final class liiiilliiiiill {
   private int iilIillIiIIiIillIi;
   private int liiIillIiiiiIillIi;
   private IiIliIIiliIliIIi IlllillIillllillIi;
   private iiiIIiilIIIlIiil lIiIillIiiIiIillIi;
   private IIIlIlllIIlIll lIllillIiiIllillIi;
   private int IIIlillIilIIlillIi;
   public static final double lllIillIiillIillIi = 0.35;
   private int IliIillIilliIillIi;
   private boolean iiIlillIiIIllillIi;
   private int illlillIiIillillIi;
   private double llIlillIiilIlillIi;
   public static final double iIlIillIiIllIillIi = 0.06;
   private long IilIillIililIillIi = Long.MIN_VALUE;
   public static final int liIIillIiiiIIillIi = 60;
   private int iliIillIiIiiIillIi;
   public static final int IIlIillIilIlIillIi = 40;
   private double iIIlillIiIlIlillIi;
   private boolean IiIlillIiliIlillIi;

   public double IIlllIlliIll() {
      return this.llIlillIiilIlillIi;
   }

   public IIIlIlllIIlIll IilliliilIIi() {
      return this.lIllillIiiIllillIi;
   }

   public liiiilliiiiill() {
      this.iilIillIiIIiIillIi = -1;
      this.iIIlillIiIlIlillIi = Double.POSITIVE_INFINITY;
      this.llIlillIiilIlillIi = Double.POSITIVE_INFINITY;
      this.lIllillIiiIllillIi = IIIlIlllIIlIll.liiliIIiliiiliIIil;
      this.IlllillIillllillIi = IiIliIIiliIliIIi.Illilliiil;
   }

   public int lIiiIiIlilli() {
      return this.liiIillIiiiiIillIi;
   }

   public void liiiIIllIl() {
      this.IilIillIililIillIi = Long.MIN_VALUE;
      this.iilIillIiIIiIillIi = -1;
      this.lIiIillIiiIiIillIi = null;
      this.IlllillIillllillIi = IiIliIIiliIliIIi.Illilliiil;
      this.lIllillIiiIllillIi = IIIlIlllIIlIll.liiliIIiliiiliIIil;
   }

   public double IiIlliIliiIl() {
      return this.iIIlillIiIlIlillIi;
   }

   public int iliIiiliiiii(int tick) {
      return Math.max(0, tick - this.iliIillIiIiiIillIi);
   }

   public boolean Illlllllilll() {
      return this.iiIlillIiIIllillIi;
   }

   public IiIliIIiliIliIIi IliIlllilIi(
      long phaseProgress, int horizontalError, iiiIIiilIIIlIiil onGround, int tick, double index, double verticalError, boolean kind, boolean routeFingerprint
   ) {
      long var17 = 1820441785646264313L;
      long var15 = -793122093417726324L;
      if (phaseProgress == this.IilIillIililIillIi && horizontalError == this.iilIillIiIIiIillIi && onGround == this.lIiIillIiiIiIillIi) {
         this.liiIillIiiiiIillIi = tick - this.IliIillIilliIillIi;
         IIIlIlllIIlIll var12 = IIIlIlllIIlIll.liiliIIiliiiliIIil;
         var15 ^= ((long)(verticalError <= 0.35 ? 1 : 0) ^ var15) & -1L >>> 32;
         if (verticalError < this.llIlillIiilIlillIi - 0.06) {
            this.llIlillIiilIlillIi = verticalError;
            var12 = IIIlIlllIIlIll.iIIiiIIilIlIiiIIil;
         }

         if (index < this.iIIlillIiIlIlillIi - 0.06) {
            this.iIIlillIiIlIlillIi = index;
            if ((int)var15 != 0) {
               var12 = IIIlIlllIIlIll.llIiiIIililIiiIIil;
            }
         }

         if (kind && !this.IiIlillIiliIlillIi && (int)var15 != 0 && !this.iiIlillIiIIllillIi) {
            this.iiIlillIiIIllillIi = true;
            var12 = IIIlIlllIIlIll.IiIiiIIilliIiiIIil;
         }

         if (routeFingerprint) {
            var12 = IIIlIlllIIlIll.iiIiiIIilIIliiIIil;
         }

         this.IiIlillIiliIlillIi = kind;
         this.lIllillIiiIllillIi = var12;
         if (var12 != IIIlIlllIIlIll.liiliIIiliiiliIIil) {
            this.iliIillIiIiiIillIi = tick;
         }

         var17 ^= ((long)(onGround == iiiIIiilIIIlIiil.ilIIiillil ? 40 : 60) << 32 ^ var17) & -1L << 32;
         if (tick - this.iliIillIiIiiIillIi > (int)(var17 >>> 32) && this.IlllillIillllillIi == IiIliIIiliIliIIi.Illilliiil) {
            this.IlllillIillllillIi = IiIliIIiliIliIIi.lllilliiil;
            this.illlillIiIillillIi++;
         }

         return this.IlllillIillllillIi;
      } else {
         var15 ^= ((long)(phaseProgress == this.IilIillIililIillIi && horizontalError > this.iilIillIiIIiIillIi ? 1 : 0) << 32 ^ var15) & -1L << 32;
         if ((int)(var15 >>> 32) != 0) {
            this.IIIlillIilIIlillIi++;
         }

         this.IilIillIililIillIi = phaseProgress;
         this.iilIillIiIIiIillIi = horizontalError;
         this.lIiIillIiiIiIillIi = onGround;
         this.IliIillIilliIillIi = tick;
         this.iliIillIiIiiIillIi = tick;
         this.liiIillIiiiiIillIi = 0;
         this.iIIlillIiIlIlillIi = index;
         this.llIlillIiilIlillIi = verticalError;
         this.iiIlillIiIIllillIi = false;
         this.IiIlillIiliIlillIi = kind;
         this.IlllillIillllillIi = IiIliIIiliIliIIi.Illilliiil;
         this.lIllillIiiIllillIi = (int)(var15 >>> 32) != 0 ? IIIlIlllIIlIll.IIIiiIIillIIiiIIil : IIIlIlllIIlIll.liiliIIiliiiliIIil;
         return this.IlllillIillllillIi;
      }
   }

   public IiIliIIiliIliIIi iIlIlllllill() {
      return this.IlllillIillllillIi;
   }

   public int IIIllIIliIIl() {
      return this.IIIlillIilIIlillIi;
   }

   public int IlIlllIlilIl() {
      return this.illlillIiIillillIi;
   }
}
