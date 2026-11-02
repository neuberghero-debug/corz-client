package gg.corz;

public final class iiiiiiilIIIIIIIi {
   static final int IiIlliIiil = -80;
   static final int llIlliIiil = 8;
   static final int IIIlliIiil = 50;
   static final int IlIlliIiil = 20;
   static final int liIlliIiil = 10;
   static final int ilIlliIiil = 60;
   static final int lIllliIiil = -3;
   static final int iIIlliIiil = 40;
   static final int IIllliIiil = -15;
   static final int iiIlliIiil = -25;
   static final int lIIlliIiil = -30;
   static final int iIllliIiil = -5;

   private iiiiiiilIIIIIIIi() {
   }

   public static double IliIlllilIi(Iiilllllliilllll c) {
      double var1 = 0.0;
      if (c.llliIiIill) {
         var1 += 50.0;
      }

      if (c.illiIiIill) {
         var1 += -30.0;
      }

      if (c.IiliIiIill) {
         var1 += 40.0;
      }

      if (c.liliIiIill) {
         var1 += 20.0;
      }

      var1 += (double)Math.max(0, c.iiliIiIill) * 8.0;
      if (c.IIiiIiIill) {
         var1 += 60.0;
      }

      if (c.lIiiIiIill) {
         var1 += -80.0;
      }

      if (c.iIiiIiIill) {
         var1 += 10.0;
      }

      if (c.IliiIiIill) {
         var1 += -25.0;
      }

      var1 += (double)Math.max(0, c.lliiIiIill) * -15.0;
      var1 += (double)Math.max(0, c.iliiIiIill) * -3.0;
      var1 += (double)Math.max(0, c.IiiiIiIill) * -5.0;
      return var1 - (double)Math.max(0, c.liiiIiIill);
   }
}
