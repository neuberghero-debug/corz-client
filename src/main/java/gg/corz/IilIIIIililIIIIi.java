package gg.corz;

import java.awt.Color;

public final class IilIIIIililIIIIi {
   public static final int iIIliiIiil = 2;
   public static final int IIIiiiIiil = -7630437;
   public static final int iiIiiiIiil = -6284512;
   public static final int iIlliiIiil = 36;
   public static final int lllliiIiil = 7;
   public static final int lIIiiiIiil = -5854026;
   public static final int iilliiIiil = -16184562;
   public static final int ilIiiiIiil = -1535700;
   public static final int lIiliiIiil = -15723751;
   public static final int iiiIiiIiil = 7;
   public static final int iiiliiIiil = -920587;
   public static final int IilliiIiil = 9;
   public static final int liIiiiIiil = -1750963;
   public static final int llIliiIiil = 10;
   public static final int IiiliiIiil = 234881023;
   public static final int liiIiiIiil = 12;
   public static final int illliiIiil = 16;
   public static final int IIlliiIiil = 4;
   public static final int lIIliiIiil = 6;
   public static final int lliliiIiil = -15262942;
   public static final int lIlliiIiil = 28;
   public static final int ililiiIiil = 352321535;
   public static final int iiIliiIiil = 4;
   public static final int llIiiiIiil = -10722709;
   public static final int IllliiIiil = 6;
   public static final int IliliiIiil = -16118769;
   public static final int IIiliiIiil = -15921132;
   public static final int IIIliiIiil = 7;
   public static final int liiliiIiil = 234881023;
   public static final int IiIiiiIiil = -8393375;
   public static final int IiIliiIiil = 8;
   public static final int IlIliiIiil = 8;
   public static final int liIliiIiil = 6;
   public static final int ilIliiIiil = 6;
   public static final int lilliiIiil = 120;
   public static final int IlIiiiIiil = -11117467;
   public static final int iIIiiiIiil = -8090988;
   public static final int iIiliiIiil = -15591908;

   public static int iIlIlllllill() {
      return liiiIIllIl() ? IliIlllilIi(-16184562, 140) : -16184562;
   }

   private static int IliIlllilIi(int argb, int alpha) {
      return (alpha & 0xFF) << 24 | argb & 16777215;
   }

   public static int IIillIiliIil() {
      return 452984831;
   }

   public static int IIIllIIliIIl() {
      return liiiIIllIl() ? IliIlllilIi(-15591908, 96) : -15591908;
   }

   public static boolean liiiIIllIl() {
      return Iiliililliliilil.IIlillllil;
   }

   public static int iliIiiliiiii() {
      return liiiIIllIl() ? IliIlllilIi(-15723751, 61) : -15723751;
   }

   public static int IIIilIIiiIIi() {
      return -1535700;
   }

   public static int IlIillIiilIi() {
      return -8393375;
   }

   public static int IlIlllIlilIl() {
      return liiiIIllIl() ? IliIlllilIi(-16118769, 77) : -16118769;
   }

   public static int IilliliilIIi() {
      return liiiIIllIl() ? 184549375 : -15921132;
   }

   public static int Illlllllilll(int c2, int c1, double t) {
      long var16 = 6079192472168793088L;
      long var18 = -6550555713109635726L;
      long var12 = -5572694172272580056L;
      long var14 = 3037596258638144751L;
      t = t < 0.0 ? 0.0 : (t > 1.0 ? 1.0 : t);
      var12 ^= ((long)(c2 >>> 24 & 0xFF) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(c2 >> 16 & 0xFF) ^ var12) & -1L >>> 32;
      var14 ^= ((long)(c2 >> 8 & 0xFF) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)(c2 & 0xFF) ^ var14) & -1L >>> 32;
      var16 ^= ((long)(c1 >>> 24 & 0xFF) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)(c1 >> 16 & 0xFF) ^ var16) & -1L >>> 32;
      var18 ^= ((long)(c1 >> 8 & 0xFF) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)(c1 & 0xFF) ^ var18) & -1L >>> 32;
      return (int)((double)((int)(var12 >>> 32)) + (double)((int)(var16 >>> 32) - (int)(var12 >>> 32)) * t) << 24
         | (int)((double)((int)var12) + (double)((int)var16 - (int)var12) * t) << 16
         | (int)((double)((int)(var14 >>> 32)) + (double)((int)(var18 >>> 32) - (int)(var14 >>> 32)) * t) << 8
         | (int)((double)((int)var14) + (double)((int)var18 - (int)var14) * t);
   }

   public static int IIlllIlliIll(double a) {
      long var3 = 1781884347320526421L;
      var3 ^= ((long)((int)Math.round(Math.max(0.0, Math.min(1.0, a)) * 255.0)) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << 24 | IlIIilIlllIIilIl.lliiIlliIl & 16777215;
   }

   public static int IiIlliIliiIl() {
      return liiiIIllIl() ? IliIlllilIi(-15262942, 110) : -15262942;
   }

   public static Color Iiilliiliiil(int argb) {
      return new Color(argb, true);
   }

   public static int Iilllilliill() {
      return IlIIilIlllIIilIl.lliiIlliIl;
   }

   private IilIIIIililIIIIi() {
   }

   public static int Ililllililil() {
      return 2013265920;
   }

   public static int lIiiIiIlilli() {
      return liiiIIllIl() ? 218103807 : Illlllllilll(-16184562, IlIIilIlllIIilIl.lliiIlliIl, 0.04);
   }
}
