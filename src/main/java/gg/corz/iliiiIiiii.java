package gg.corz;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class iliiiIiiii {
   private final liilIIIliiilIIIl[] IlllliIlllllliIl = new liilIIIliiilIIIl[~(551649457 * 1736263375 + -81) ^ -1291089120];
   public static final int IIIlliIllIIlliIl = 15;
   public static final int iIIlliIlIlIlliIl = 16;
   public static final int lIiIliIliIiIliIl = 11;
   public static final int ilIIliIlIiIIliIl = 4;
   public static final int lIIIliIliIIIliIl = 2;
   public static final int liiIliIliiiIliIl = 14;
   public static final int IIlIliIllIlIliIl = 6;
   static final int[] iiIlliIlIIllliIl = new int[]{0, 1, 2, 8, 9, 10};
   public static final int iliIliIlIiiIliIl = 13;
   public static final int IliIliIllliIliIl = 12;
   public static final int IlIIliIlllIIliIl = 3;
   float illlliIlIillliIl = 0.0F;
   public static final int iiiiIiIlIIIIliIl = 1;
   public static final int iIlIliIlIllIliIl = 7;
   public static final int llIlliIlilIlliIl = 17;
   private static final Map<llIiIiIlilIiIiIl, iliiiIiiii> lIllliIliIllliIl = new ConcurrentHashMap<>();
   public static final int lllIliIlillIliIl = 8;
   public static final int iilIliIlIIiIliIl = 10;
   public static final int IilIliIllilIliIl = 9;
   public static final int liIIliIliiIIliIl = 5;
   public static final int IiiiIiIlliiiIiIl = 0;
   static final int[] IiIlliIlliIlliIl = new int[]{3, 4, 5, 6, 7, 11, 12, 13, 14, 15, 16};

   static float[] IilliliilIIi(List<Float> l) {
      float[] var1 = new float[l.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Float)l.get(var2);
      }

      return var1;
   }

   private static iliiiIiiii IlIlllIlilIl(String style, float n, float a, int o) {
      iliiiIiiii var4 = new iliiiIiiii();
      switch (style) {
         case IiIlliIliiIl<"IiIlliIliiIl","Et1D/nvpI7ZMiEa+kX6uXtiPJqwDQM0fnrbmzW04yjTGePOF5bs=">():
            IIillillIillil.IliIlllilIi(var4, n, a, o);
            break;
         case IiIlliIliiIl<"IiIlliIliiIl","+S5rrHLDqCK6EcDbZxgsE1Qr/+Y+hm6/B1SB86myDvJ9Rd5a">():
            lIIIliliIIIlil.iIlIlllllill(var4, n, a, o);
            break;
         case IiIlliIliiIl<"IiIlliIliiIl","5RXIY35KziVAkM/xL1uvGnXA8MXHmTFe5/YJ9y74xVuHXYTpvg==">():
            iiIlllIiIIllllIi.IliIlllilIi(var4, n, a, o);
            break;
         default:
            return null;
      }

      return var4;
   }

   public static float iliIiiliiiii(String spins, int style) {
      if (style <= ((-1413698984 ^ -51) + -37 ^ 1413698929)) {
         return 1.0F;
      } else {
         iliiiIiiii var2 = IIIllIIliIIl(spins, 0.0F, 0.0F, 1);
         iliiiIiiii var3 = IIIllIIliIIl(spins, 0.0F, 0.0F, style);
         return var2 != null && var3 != null && var2.illlliIlIillliIl > 0.0F && var3.illlliIlIillliIl > 0.0F
            ? var3.illlliIlIillliIl / var2.illlliIlIillliIl
            : 1.0F;
      }
   }

   iliiiIiiii iIlIlllllill(int channel, float... tv) {
      this.IlllliIlllllliIl[channel] = new liilIIIliiilIIIl(tv);
      return this;
   }

   liilIIIliiilIIIl liiiIIllIl(int channel) {
      return this.IlllliIlllllliIl[channel];
   }

   public static iliiiIiiii IIIllIIliIIl(String style, float antic, float over, int spins) {
      long var11 = 4024290820483101166L;
      var11 ^= ((long)Math.max(1, spins) << 32 ^ var11) & -1L << 32;
      float var5 = Math.max(0.0F, antic);
      float var6 = Math.max(0.0F, over);
      llIiIiIlilIiIiIl var7 = new llIiIiIlilIiIiIl(style, Float.floatToIntBits(var5), Float.floatToIntBits(var6), (int)(var11 >>> 32));
      iliiiIiiii var8 = lIllliIliIllliIl.get(var7);
      if (var8 != null) {
         return var8;
      } else {
         iliiiIiiii var9 = IlIlllIlilIl(style, var5, var6, (int)(var11 >>> 32));
         if (var9 == null) {
            return null;
         } else {
            if (lIllliIliIllliIl.size() > ((-1414247215 - 125 << 21 | -1414247215 - 125 >>> 11) - 35 - 121 ^ -1969916499)) {
               lIllliIliIllliIl.clear();
            }

            iliiiIiiii var10 = lIllliIliIllliIl.putIfAbsent(var7, var9);
            return var10 != null ? var10 : var9;
         }
      }
   }

   public float IliIlllilIi(int channel, float p) {
      liilIIIliiilIIIl var3 = this.IlllliIlllllliIl[channel];
      return var3 == null ? 0.0F : var3.IliIlllilIi(p);
   }

   public static boolean lIiiIiIlilli(String style) {
      return IiIlliIliiIl<"IiIlliIliiIl","Et1D/nvpI7ZMiEa+kX6uXtiPJqwDQM0fnrbmzW04yjTGePOF5bs=">().equals(style)
         || IiIlliIliiIl<"IiIlliIliiIl","+S5rrHLDqCK6EcDbZxgsE1Qr/+Y+hm6/B1SB86myDvJ9Rd5a">().equals(style)
         || IiIlliIliiIl<"IiIlliIliiIl","5RXIY35KziVAkM/xL1uvGnXA8MXHmTFe5/YJ9y74xVuHXYTpvg==">().equals(style);
   }

   private iliiiIiiii() {
   }
}
