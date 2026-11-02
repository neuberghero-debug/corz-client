package gg.corz;

public final class liiIlIliiiIlIl {
   public static final double lillllIlliillllIll = 0.08;
   public static final double illlllIllIillllIll = 0.98;
   public static final double llilllIllililllIll = 1.0E-4;
   private final IlilIIIlllilIIIl iiIlllIllIIllllIll;
   public static final double iIilllIllIlilllIll = 0.08;
   public static final double IIilllIlllIilllIll = -0.0784;
   private static final liiIlIliiiIlIl lIllllIlliIllllIll = new liiIlIliiiIlIl(IlilIIIlllilIIIl.llilIIllIl);
   public static final long IlllllIllllllllIll = Long.MIN_VALUE;

   public IlilIIIlllilIIIl IliIlllilIi() {
      return this.iiIlllIllIIllllIll;
   }

   public static boolean lIiiIiIlilli(boolean onGround, double verticalSpeed) {
      return onGround && verticalSpeed <= 0.08;
   }

   public static liiIlIliiiIlIl IilliliilIIi(long stand, long feetCell, boolean verticalSpeed, double routeRemaining, int onGround) {
      if (feetCell == Long.MIN_VALUE) {
         return new liiIlIliiiIlIl(IlilIIIlllilIIIl.iiilIIllIl);
      } else if (!lIiiIiIlilli(verticalSpeed, routeRemaining)) {
         return new liiIlIliiiIlIl(IlilIIIlllilIIIl.ililIIllIl);
      } else if (onGround > 0) {
         return new liiIlIliiiIlIl(IlilIIIlllilIIIl.liilIIllIl);
      } else {
         return stand != feetCell ? new liiIlIliiiIlIl(IlilIIIlllilIIIl.IiilIIllIl) : lIllllIlliIllllIll;
      }
   }

   @Override
   public String toString() {
      return IIIllIIliIIl<"IIIllIIliIIl","7gbPRdrjKPt+EAfSpwIl9eAu7HlW4jYnx3oBDXnVtCQ5t5bt">()
         + this.iiIlllIllIIllllIll
         + IIIllIIliIIl<"IIIllIIliIIl","fURXLbNRgvJT4YPMj2FJQ2RrwNIlyzKYVOKft2s=">();
   }

   public boolean iIlIlllllill() {
      return this.iiIlllIllIIllllIll == IlilIIIlllilIIIl.ililIIllIl || this.iiIlllIllIIllllIll == IlilIIIlllilIIIl.liilIIllIl;
   }

   private liiIlIliiiIlIl(IlilIIIlllilIIIl reason) {
      this.iiIlllIllIIllllIll = reason;
   }

   public boolean liiiIIllIl() {
      return this.iiIlllIllIIllllIll == IlilIIIlllilIIIl.llilIIllIl;
   }

   public static boolean iliIiiliiiii(double horizontalLengthSquared) {
      return horizontalLengthSquared <= 1.0E-4;
   }
}
