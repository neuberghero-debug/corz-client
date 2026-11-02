package gg.corz;

public final class lIllilIliIllilIl {
   public static final int IliiIilIll = 6;
   public static final float[] liliIilIll = new float[]{12.0F, 14.0F, 16.0F};
   public static final double IiliIilIll = 20.0;
   public static final double llliIilIll = 20.0;
   public static final int lliiIilIll = 400;
   public static final int iliiIilIll = 30;
   public static final float iiliIilIll = 2.0F;
   public static final double illiIilIll = 16.0;
   public static final int lIiiIilIll = 30;
   public static final int iIiiIilIll = 14;
   public static final float IIiiIilIll = 4.0F;

   public static boolean iIlIlllllill(IIllIIllIllIIl s) {
      if (s == null) {
         return false;
      } else {
         IlIillllIill var1 = s.Illlllllilll() == null ? IlIillllIill.IIIIilIilIIIilIi : s.Illlllllilll();
         return IilliliilIIi(s.IIiilIiiiIii(), s.Iliilliiilii(), var1.IliIlllilIi(), var1.Iilllilliill());
      }
   }

   public static boolean IilliliilIIi(double maxIncoming, boolean pearlIncoming, float lethal, boolean nearestEnemy) {
      return maxIncoming >= 16.0 && !pearlIncoming && lethal < 4.0F && !nearestEnemy;
   }

   public static boolean iliIiiliiiii(lliiilIiiliiilIi self) {
      return self == null ? false : self.Iiiiliiiiiii() <= 14 && (self.IIlilIliiIli() > 0 || self.IiIiliIiiiIi() > 0);
   }

   public static boolean liiiIIllIl(double comboEngaged, boolean lethal, float pearlIncoming, boolean nearestEnemy, int etaTicks, boolean maxIncoming) {
      return comboEngaged >= 20.0 && !lethal && pearlIncoming < 2.0F && !nearestEnemy && etaTicks >= 30 && !maxIncoming;
   }

   static boolean IiIlliIliiIl(iIliIiIiIlliIiIi state) {
      if (state == null) {
         return false;
      } else {
         return switch (state) {
            case illIiIiIIi, IilIiIiIIi, lilIiIiIIi, lIiIiIiIIi, IliIiIiIIi -> true;
            default -> false;
         };
      }
   }

   public static boolean IIIllIIliIIl(lliiilIiiliiilIi self) {
      return self != null && self.Iiiiliiiiiii() <= 6;
   }

   public static boolean IliIlllilIi(IIllIIllIllIIl s) {
      if (s == null) {
         return false;
      } else {
         IlIillllIill var1 = s.Illlllllilll() == null ? IlIillllIill.IIIIilIilIIIilIi : s.Illlllllilll();
         iiliiiIiIIiiiiIi var2 = s.IIIIllIIIl() == null ? iiliiiIiIIiiiiIi.iIiliIIlIi : s.IIIIllIIIl();
         return liiiIIllIl(s.IIiilIiiiIii(), s.Iliilliiilii(), var1.IliIlllilIi(), var1.Iilllilliill(), var1.Illlllllilll(), IiIlliIliiIl(var2.iIlIlllllill()));
      }
   }

   private lIllilIliIllilIl() {
   }

   public static long IIlllIlliIll(boolean useTicks, boolean finished, int gapple, long tick) {
      if (!finished) {
         return tick + 40L;
      } else {
         return useTicks && gapple >= 30 ? tick + 400L : tick;
      }
   }

   public static boolean IlIlllIlilIl(lliiilIiiliiilIi style, IlIIIlilllIIIlil self) {
      return lIiiIiIlilli(style, self) || iliIiiliiiii(style);
   }

   public static boolean lIiiIiIlilli(lliiilIiiliiilIi style, IlIIIlilllIIIlil self) {
      long var3 = 6319027510139525824L;
      if (style == null) {
         return false;
      } else {
         var3 ^= ((long)(self == null ? IlIIIlilllIIIlil.iliIiilIil : self).ordinal() << 32 ^ var3) & -1L << 32;
         return style.IiIiliIiiiIi() > 0
            && style.IlIlllIlilIl() < 4.0F
            && (style.IIIllIIliIIl() <= liliIilIll[(int)(var3 >>> 32)] || style.IliIlllilIi() <= liliIilIll[(int)(var3 >>> 32)] + 2.0F);
      }
   }
}
