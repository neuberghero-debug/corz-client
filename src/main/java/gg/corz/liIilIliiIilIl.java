package gg.corz;

public final class liIilIliiIilIl {
   public static float Ilillllill(illliIllIilliIll t) {
      return lIilliIill(iilllIIill(t));
   }

   public static illiiliIiliili iIlllIllll(int... colors) {
      float[] var1 = new float[colors.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = colors.length == 1 ? 0.0F : (float)var2 / (float)(colors.length - 1);
      }

      return new illiiliIiliili(var1, colors);
   }

   public static float lIiiIiIlilli(float x) {
      return x - (float)Math.floor((double)x);
   }

   public static int IIllllIlll(float[] lab, int alpha) {
      float var2 = lab[0] + 0.39633778F * lab[1] + 0.21580376F * lab[2];
      float var3 = lab[0] - 0.105561346F * lab[1] - 0.06385417F * lab[2];
      float var4 = lab[0] - 0.08948418F * lab[1] - 1.2914855F * lab[2];
      var2 = var2 * var2 * var2;
      var3 = var3 * var3 * var3;
      var4 = var4 * var4 * var4;
      float var5 = 4.0767417F * var2 - 3.3077116F * var3 + 0.23096994F * var4;
      float var6 = -1.268438F * var2 + 2.6097574F * var3 - 0.34131938F * var4;
      float var7 = -0.0041960864F * var2 - 0.7034186F * var3 + 1.7076147F * var4;
      return lIlIliIlIl(alpha) << 24 | iiiilIiIIIIiIi.lilIliilIl(var5) << 16 | iiiilIiIIIIiIi.lilIliilIl(var6) << 8 | iiiilIiIIIIiIi.lilIliilIl(var7);
   }

   public static int IIIillIIil(illliIllIilliIll base, int grain, float gloss, float t) {
      long var8 = -7941666976260930487L;
      float var4 = Ilillllill(base);
      float var5 = ilillIiill(base);
      float var6 = 1.0F + t * 0.06F * IIIIllIIIl(base, 1.0F, base.lilIIiilll);
      var8 ^= ((long)IIiIllIiIl(grain, var6 * (0.9F + 0.62F * (var4 - 0.62F) * gloss)) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)lliIliliIl((int)(var8 >>> 32), iiiIlIIIll(grain, 0.55F), gloss * 0.6F * var5) << 32 ^ var8) & -1L << 32;
      return lliIliliIl((int)(var8 >>> 32), iiiIlIIIll(grain, 0.45F), 0.3F * liilliiill(base, 0.08F));
   }

   public static float iIlIlllllill(float t, float a, float b) {
      return t + (a - t) * b;
   }

   public static float IilliliilIIi(float e0, float e1, float x) {
      float var3 = IliIlllilIi((x - e0) / (e1 - e0));
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   public static int lIIlliIIll(int t, float c) {
      return lilIliilIl(
         t,
         -((565317117 ^ -123 ^ 65) >>> 5 | (565317117 ^ -123 ^ 65) << 27) ^ -837971857
            | t & ((-663738619 * 9 - -83 << 7 | -663738619 * 9 - -83 >>> 25) ^ 121 ^ 128958516),
         c
      );
   }

   public static float IlIillIiilIi(float seed, float octaves, int y, int x) {
      float var4 = 0.0F;
      float var5 = 1.0F;
      float var6 = 0.0F;
      float var7 = 1.0F;

      for (int var8 = 0; var8 < y; var8++) {
         float var9 = 1.0F - Math.abs(IIillIiliIil(seed, octaves, x + var8 * 733));
         var9 *= var9;
         var4 += var9 * var5 * var7;
         var6 += var5;
         var7 = IliIlllilIi(var9 * 1.6F);
         var5 *= 0.5F;
         float var10 = seed * 0.8F - octaves * 0.6F;
         float var11 = seed * 0.6F + octaves * 0.8F;
         seed = var10 * 2.07F + 5.2F;
         octaves = var11 * 2.07F + 1.3F;
      }

      return IliIlllilIi(var4 / var6);
   }

   public static float iIiilIliil(illliIllIilliIll t, float width) {
      return t.IIIlIiilll >= 1.0E19F ? 0.0F : 1.0F - IilliliilIIi(0.0F, width, Math.max(0.0F, t.IIIlIiilll));
   }

   public static float lliililiil(illliIllIilliIll t, float width) {
      return t.iIIlIiilll >= 1.0E9F ? 0.0F : 1.0F - IilliliilIIi(0.0F, width, t.iIIlIiilll);
   }

   public static float ilillIiill(illliIllIilliIll t) {
      float var1 = lIiiIiIlilli(iilllIIill(t));
      float var2 = 0.4F + 0.6F * IliIlllilIi(0.55F + 0.8F * IIillIiliIil(t.lIiIIiilll * 0.32F + 4.1F, t.iIiIIiilll * 0.2F, 4242));
      return var2 * (0.5F * IIIllIIliIIl(var1, 0.6F, 0.022F) + 0.45F * IIIllIIliIIl(var1, 0.6F, 0.045F)) + 0.4F * IIIllIIliIIl(var1, 0.205F, 0.05F);
   }

   public static float IIiilIiiiIii(float seed, float x, int y) {
      int var3 = (int)Math.floor((double)seed);
      int var4 = (int)Math.floor((double)x);
      float var5 = 9.0F;

      for (int var6 = -1; var6 <= 1; var6++) {
         for (int var7 = -1; var7 <= 1; var7++) {
            int var8 = var3 + var7;
            int var9 = var4 + var6;
            int var10 = IiIlliIliiIl(var8, var9, y);
            float var11 = (float)var8 + (float)(var10 & 65535) / 65536.0F;
            float var12 = (float)var9 + (float)(var10 >>> 16) / 65536.0F;
            float var13 = (var11 - seed) * (var11 - seed) + (var12 - x) * (var12 - x);
            if (var13 < var5) {
               var5 = var13;
            }
         }
      }

      return (float)Math.sqrt((double)var5);
   }

   public static int IlIllllIll(int s, float c) {
      float[] var2 = liIlliiIll(s);
      var2[1] *= c;
      var2[2] *= c;
      return IIllllIlll(var2, s >>> (-(-1924552738 * -438261969 << 29 | -1924552738 * -438261969 >>> 3) ^ -1319695472));
   }

   private static float Iilllilliill(int seed, int fy, float fx, float ix, int iy) {
      return switch (IiIlliIliiIl(seed, fy, iy) & 7) {
         case 0 -> fx + ix;
         case 1 -> fx - ix;
         case 2 -> -fx + ix;
         case 3 -> -fx - ix;
         case 4 -> 1.41421F * fx;
         case 5 -> -1.41421F * fx;
         case 6 -> 1.41421F * ix;
         default -> -1.41421F * ix;
      };
   }

   public static float IIillIiliIil(float x, float seed, int y) {
      long var13 = -2922572695437820734L;
      var13 ^= ((long)((int)Math.floor((double)x)) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)((int)Math.floor((double)seed)) ^ var13) & -1L >>> 32;
      float var5 = x - (float)((int)(var13 >>> 32));
      float var6 = seed - (float)((int)var13);
      float var7 = Illlllllilll(var5);
      float var8 = Illlllllilll(var6);
      float var9 = Iilllilliill((int)(var13 >>> 32), (int)var13, var5, var6, y);
      float var10 = Iilllilliill((int)(var13 >>> 32) + 1, (int)var13, var5 - 1.0F, var6, y);
      float var11 = Iilllilliill((int)(var13 >>> 32), (int)var13 + 1, var5, var6 - 1.0F, y);
      float var12 = Iilllilliill((int)(var13 >>> 32) + 1, (int)var13 + 1, var5 - 1.0F, var6 - 1.0F, y);
      return liiiIIllIl(iIlIlllllill(iIlIlllllill(var9, var10, var7), iIlIlllllill(var11, var12, var7), var8) * 1.06F, -1.0F, 1.0F);
   }

   public static int lilIliilIl(int a, int b, float t) {
      long var7 = -2372667737057403967L;
      t = IliIlllilIi(t);
      float var3 = iIlIlllllill(
         iiiilIiIIIIiIi.IIiIllIiIl(a >> (45930880 - -41 + 19 ^ 45930924)),
         iiiilIiIIIIiIi.IIiIllIiIl(b >> ((~1517858654 << 3 | ~1517858654 >>> 29) - -5 ^ 742032642)),
         t
      );
      float var4 = iIlIlllllill(
         iiiilIiIIIIiIi.IIiIllIiIl(a >> (--2070311851 * -11 ^ -1298593873)), iiiilIiIIIIiIi.IIiIllIiIl(b >> (~(867468846 * -654471207) ^ -376401655)), t
      );
      float var5 = iIlIlllllill(iiiilIiIIIIiIi.IIiIllIiIl(a), iiiilIiIIIIiIi.IIiIllIiIl(b), t);
      var7 ^= (
            (long)Math.round(
                     iIlIlllllill(
                        (float)(
                           a >>> (((~111815783 ^ -5) >>> 29 | (~111815783 ^ -5) << 3) ^ 894526208)
                              & ((1255410483 * -47 >>> 25 | 1255410483 * -47 << 7) ^ -1996959394)
                        ),
                        (float)(b >>> (-(56319428 << 1 | 56319428 >>> 31) ^ -65 ^ 112638943) & (~(-1201181218 * -1455319497) ^ 1409896882)),
                        t
                     )
                  )
                  << 32
               ^ var7
         )
         & -1L << 32;
      return (int)(var7 >>> 32) << (-(~(620311624 + 29)) + -11 ^ 620311619)
         | iiiilIiIIIIiIi.lilIliilIl(var3) << ((1407621464 >>> 29 | 1407621464 << 3) * 21 + -47 ^ 257204651)
         | iiiilIiIIIIiIi.lilIliilIl(var4) << (((-603176218 * -87 << 13 | -603176218 * -87 >>> 19) ^ 51) + 5 ^ -1468348730)
         | iiiilIiIIIIiIi.lilIliilIl(var5);
   }

   public static float IIIllIIliIIl(float center, float x, float width) {
      float var3 = (center - x) / width;
      return (float)Math.exp((double)(-var3 * var3));
   }

   private static float Illlllllilll(float t) {
      return t * t * t * (t * (t * 6.0F - 15.0F) + 10.0F);
   }

   public static float IliIlllilIi(float x) {
      return x < 0.0F ? 0.0F : (x > 1.0F ? 1.0F : x);
   }

   public static int IiIIlliIIl(int rgb) {
      return -((-1567194243 * 286331153 << 1 | -1567194243 * 286331153 >>> 31) ^ 71) ^ -1494094044 | rgb;
   }

   public static illiiliIiliili lllllillll(float[] positions, int[] colors) {
      return new illiiliIiliili(positions, colors);
   }

   public static int lliIliliIl(int d, int k, float c) {
      float var3 = iiiilIiIIIIiIi.IIiIllIiIl(d >> 16);
      float var4 = iiiilIiIIIIiIi.IIiIllIiIl(d >> 8);
      float var5 = iiiilIiIIIIiIi.IIiIllIiIl(d);
      float var6 = iiiilIiIIIIiIi.IIiIllIiIl(k >> 16) * c;
      float var7 = iiiilIiIIIIiIi.IIiIllIiIl(k >> 8) * c;
      float var8 = iiiilIiIIIIiIi.IIiIllIiIl(k) * c;
      return d & 0xFF000000
         | iiiilIiIIIIiIi.lilIliilIl(1.0F - (1.0F - var3) * (1.0F - var6)) << 16
         | iiiilIiIIIIiIi.lilIliilIl(1.0F - (1.0F - var4) * (1.0F - var7)) << 8
         | iiiilIiIIIIiIi.lilIliilIl(1.0F - (1.0F - var5) * (1.0F - var8));
   }

   public static float IIIIllIIIl(illliIllIilliIll t, float seed, int scale) {
      float var3 = IIillIiliIil(t.lIiIIiilll * 46.0F * seed, t.iIiIIiilll * 1.3F * seed, scale + 7) * 0.6F;
      var3 += IIillIiliIil(t.lIiIIiilll * 131.0F * seed, t.iIiIIiilll * 2.9F * seed, scale + 8) * 0.3F;
      var3 += (IIlllIlliIll((int)Math.floor((double)(t.lIiIIiilll * 260.0F * seed)), (int)Math.floor((double)(t.iIiIIiilll * 9.0F * seed)), scale + 9) - 0.5F)
         * 0.35F;
      return liiiIIllIl(var3, -1.0F, 1.0F);
   }

   public static int IiIilliIil(illliIllIilliIll t, int base, float clear, int gloss, int sheen) {
      long var9 = -4934665963018054554L;
      float var5 = Ilillllill(t);
      float var6 = ilillIiill(t);
      float var7 = 1.0F + 0.03F * IIIIllIIIl(t, 1.0F, t.lilIIiilll);
      var9 ^= ((long)IIiIllIiIl(base, var7 * (0.86F + 0.78F * (var5 - 0.62F) * clear)) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)lliIliliIl((int)(var9 >>> 32), gloss, clear * 0.45F * var6) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)lliIliliIl((int)(var9 >>> 32), sheen, clear * 0.12F * var6 * var6) << 32 ^ var9) & -1L << 32;
      return lliIliliIl((int)(var9 >>> 32), iiiIlIIIll(base, 0.5F), 0.3F * liilliiill(t, 0.08F));
   }

   public static float liiiIIllIl(float lo, float x, float hi) {
      return lo < x ? x : (lo > hi ? hi : lo);
   }

   public static float[] liIlliiIll(int c) {
      float var1 = iiiilIiIIIIiIi.IIiIllIiIl(c >> 16);
      float var2 = iiiilIiIIIIiIi.IIiIllIiIl(c >> 8);
      float var3 = iiiilIiIIIIiIi.IIiIllIiIl(c);
      float var4 = (float)Math.cbrt((double)(0.41222146F * var1 + 0.53633255F * var2 + 0.051445995F * var3));
      float var5 = (float)Math.cbrt((double)(0.2119035F * var1 + 0.6806995F * var2 + 0.10739696F * var3));
      float var6 = (float)Math.cbrt((double)(0.08830246F * var1 + 0.28171885F * var2 + 0.6299787F * var3));
      return new float[]{
         0.21045426F * var4 + 0.7936178F * var5 - 0.004072047F * var6,
         1.9779985F * var4 - 2.4285922F * var5 + 0.4505937F * var6,
         0.025904037F * var4 + 0.78277177F * var5 - 0.80867577F * var6
      };
   }

   public static int IiiIlliiIl(int c, int d) {
      return c & (~(~(-715678741 >>> 17 | -715678741 << 15)) ^ 854977195)
         | iiiilIiIIIIiIi.lilIliilIl(
               iiiilIiIIIIiIi.IIiIllIiIl(c >> ((-2078488765 << 29 | -2078488765 >>> 3) * -85 ^ -1538376984))
                  * iiiilIiIIIIiIi.IIiIllIiIl(d >> (-(1043791511 ^ -107) + -113 ^ 1043791517))
            )
            << ((1498695704 >>> 17 | 1498695704 << 15) - 49 ^ 604777577)
         | iiiilIiIIIIiIi.lilIliilIl(
               iiiilIiIIIIiIi.IIiIllIiIl(c >> ((1098394826 - -1) * -1736263375 ^ -1485486637))
                  * iiiilIiIIIIiIi.IIiIllIiIl(d >> (~(-532815031 * 49) ^ 338132750))
            )
            << ((200642649 * -1857283155 * -15 >>> 3 | 200642649 * -1857283155 * -15 << 29) + -91 ^ -1432150217)
         | iiiilIiIIIIiIi.lilIliilIl(iiiilIiIIIIiIi.IIiIllIiIl(c) * iiiilIiIIIIiIi.IIiIllIiIl(d));
   }

   public static int IiIlliIliiIl(int x, int seed, int y) {
      long var4 = -3310225081398824254L;
      var4 ^= (
            (long)(
                     x * (-((124364613 >>> 29 | 124364613 << 3) ^ 99) * 119 ^ 1221397518)
                        ^ seed * (~(--1629537067) ^ -2004264091)
                        ^ y
                           * (
                              (
                                    ((-466520876 << 25 | -466520876 >>> 7) * 1205604855 ^ 79) >>> 19
                                       | ((-466520876 << 25 | -466520876 >>> 7) * 1205604855 ^ 79) << 13
                                 )
                                 ^ 46624381
                           )
                  )
                  << 32
               ^ var4
         )
         & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> ((-366907380 + 109 - 25 >>> 11 | -366907380 + 109 - 25 << 21) ^ 203244577)) << 32 ^ var4)
         & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) * ((~(1157138938 - -37) << 5 | ~(1157138938 - -37) >>> 27) ^ -452626820)) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> (-53364703 ^ 89 ^ -53364619)) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) * (-(-(-1444402816 * 1062196213) << 15 | -(-1444402816 * 1062196213) >>> 17) ^ -653455418)) << 32 ^ var4) & -1L << 32;
      var4 ^= (
            (long)(
                     (int)(var4 >>> 32)
                        ^ (int)(var4 >>> 32) >>> ((~(-136922298 << 13 | -136922298 >>> 19) << 9 | ~(-136922298 << 13 | -136922298 >>> 19) >>> 23) ^ 776079937)
                  )
                  << 32
               ^ var4
         )
         & -1L << 32;
      return (int)(var4 >>> 32);
   }

   public static float IIiillIiil(illliIllIilliIll t, float width) {
      return t.iiiIIiilll >= 1.0E19F ? 0.0F : 1.0F - IilliliilIIi(0.0F, width, Math.max(0.0F, t.iiiIIiilll));
   }

   public static float IIlilIliiIli(float x, float seed, float amount, int octaves, int y) {
      float var5 = Iiilliiliiil(x, seed, octaves, y + (-249529145 ^ -5 ^ 91 ^ 249529196));
      float var6 = Iiilliiliiil(x + 5.2F, seed + 1.3F, octaves, y + ((-337767669 * -678152731 ^ -33) * 85 * -91 ^ 1876704863));
      float var7 = Iiilliiliiil(
         x + amount * var5 + 1.7F,
         seed + amount * var6 + 9.2F,
         octaves,
         y
            + (
               (((174252557 ^ -49) - -83 >>> 9 | (174252557 ^ -49) - -83 << 23) >>> 31 | ((174252557 ^ -49) - -83 >>> 9 | (174252557 ^ -49) - -83 << 23) << 1)
                  ^ 368418107
            )
      );
      float var8 = Iiilliiliiil(x + amount * var5 + 8.3F, seed + amount * var6 + 2.8F, octaves, y + (1362898782 * -954437177 ^ 123 ^ -151433152));
      return Iiilliiliiil(x + amount * var7, seed + amount * var8, octaves, y);
   }

   public static float iliIiiliiiii(float b1, float a0, float x, float b0, float a1) {
      return b0 + (a1 - b0) * IliIlllilIi((b1 - a0) / (x - a0));
   }

   public static float IlIlllIlilIl(float x, float hi, float lo, float soft) {
      return IilliliilIIi(hi - soft, hi + soft, x) * (1.0F - IilliliilIIi(lo - soft, lo + soft, x));
   }

   public static float iIIIlIlIIl(illliIllIilliIll scale, float seed, int t) {
      return IIlllIlliIll((int)Math.floor((double)(scale.lIiIIiilll * 64.0F * seed)), (int)Math.floor((double)(scale.iIiIIiilll * 64.0F * seed)), t) * 2.0F
         - 1.0F;
   }

   public static float IiIiliIiiiIi(float seed, float y, int x, int octaves) {
      float var4 = 0.0F;
      float var5 = 1.0F;
      float var6 = 0.0F;

      for (int var7 = 0; var7 < x; var7++) {
         var4 += var5 * Math.abs(IIillIiliIil(seed, y, octaves + var7 * 311));
         var6 += var5;
         var5 *= 0.5F;
         seed = seed * 2.01F + 3.7F;
         y = y * 2.01F - 2.9F;
      }

      return var4 / var6;
   }

   private static int lIlIliIlIl(int v) {
      return v < 0 ? 0 : (v > (-1063314169 * 266059921 * 89 + -89 + 43 ^ 1937147214) ? -39089906 * -11 + -53 ^ 111 ^ 93 ^ 429989116 : v);
   }

   public static int IIiIllIiIl(int k, float c) {
      return k & (~(1291606471 * -73) ^ 217422270)
         | iiiilIiIIIIiIi.lilIliilIl(
               iiiilIiIIIIiIi.IIiIllIiIl(
                     k >> (((-738507471 << 17 | -738507471 >>> 15) >>> 25 | (-738507471 << 17 | -738507471 >>> 15) << 7) * -35 ^ 35 ^ 805610914)
                  )
                  * c
            )
            << (~(287633076 ^ -25) ^ 287633084)
         | iiiilIiIIIIiIi.lilIliilIl(
               iiiilIiIIIIiIi.IIiIllIiIl(
                     k
                        >> (
                           (
                                    (1307813231 * -1227133513 >>> 7 | 1307813231 * -1227133513 << 25) << 13
                                       | (1307813231 * -1227133513 >>> 7 | 1307813231 * -1227133513 << 25) >>> 19
                                 )
                                 + -57
                              ^ -1541319096
                        )
                  )
                  * c
            )
            << ((-479335019 >>> 29 | -479335019 << 3) * -755159085 * -1775253149 ^ 1490877343)
         | iiiilIiIIIIiIi.lilIliilIl(iiiilIiIIIIiIi.IIiIllIiIl(k) * c);
   }

   public static float Illillllil(illliIllIilliIll t, float width, float seed, int scale) {
      if (t.lIIlIiilll <= -1.0E9F) {
         return 0.0F;
      } else {
         float var4 = 0.55F + 0.45F * Iiilliiliiil(t.lIiIIiilll * 6.0F * seed, t.iIiIIiilll * 6.0F * seed, 4, scale);
         float var5 = IilliliilIIi(0.62F, 0.7F, Iiilliiliiil(t.lIiIIiilll * 22.0F * seed, t.iIiIIiilll * 22.0F * seed, 3, scale + 3))
            * IilliliilIIi(width * 2.5F, 0.0F, t.lIIlIiilll);
         return IliIlllilIi(Math.max(IilliliilIIi(width * var4, width * var4 * 0.4F, t.lIIlIiilll), var5));
      }
   }

   public static float Iiiiliiiiiii(float y, float seed, int x) {
      int var3 = (int)Math.floor((double)y);
      int var4 = (int)Math.floor((double)seed);
      int var5 = var3;
      int var6 = var4;
      float var7 = 9.0F;

      for (int var8 = -1; var8 <= 1; var8++) {
         for (int var9 = -1; var9 <= 1; var9++) {
            int var10 = var3 + var9;
            int var11 = var4 + var8;
            int var12 = IiIlliIliiIl(var10, var11, x);
            float var13 = (float)var10 + (float)(var12 & 65535) / 65536.0F;
            float var14 = (float)var11 + (float)(var12 >>> 16) / 65536.0F;
            float var15 = (var13 - y) * (var13 - y) + (var14 - seed) * (var14 - seed);
            if (var15 < var7) {
               var7 = var15;
               var5 = var10;
               var6 = var11;
            }
         }
      }

      return IIlllIlliIll(var5, var6, x ^ 1540483477);
   }

   public static int iIIilIlIil(illliIllIilliIll t, int gloss, float base) {
      return llIililIil(t, gloss, base, iiiIlIIIll(gloss, 0.6F));
   }

   public static float illIlIilIl(int c) {
      return 0.2126F * iiiilIiIIIIiIi.IIiIllIiIl(c >> (~(-514685475 << 23 | -514685475 >>> 9) ^ 286217901))
         + 0.7152F * iiiilIiIIIIiIi.IIiIllIiIl(c >> (((495754878 * -79 << 7 | 495754878 * -79 >>> 25) ^ -53) * -23 ^ 2005524283))
         + 0.0722F * iiiilIiIIIIiIi.IIiIllIiIl(c);
   }

   public static float Ililllililil(float seed, float x, int y) {
      long var9 = 287396918695895012L;
      var9 ^= ((long)((int)Math.floor((double)seed)) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)((int)Math.floor((double)x)) ^ var9) & -1L >>> 32;
      float var5 = seed - (float)((int)(var9 >>> 32));
      float var6 = x - (float)((int)var9);
      float var7 = Illlllllilll(var5);
      float var8 = Illlllllilll(var6);
      return iIlIlllllill(
         iIlIlllllill(IIlllIlliIll((int)(var9 >>> 32), (int)var9, y), IIlllIlliIll((int)(var9 >>> 32) + 1, (int)var9, y), var7),
         iIlIlllllill(IIlllIlliIll((int)(var9 >>> 32), (int)var9 + 1, y), IIlllIlliIll((int)(var9 >>> 32) + 1, (int)var9 + 1, y), var7),
         var8
      );
   }

   public static float Illillliilli(float octaves, float amount, float y, int seed, int x) {
      return octaves + y * Iiilliiliiil(octaves, amount, seed, x + (~(-760622748) ^ 760622846));
   }

   public static float iilllIIill(illliIllIilliIll t) {
      float var1 = 0.15F * (0.86F * t.iIiIIiilll - 0.5F * t.lIiIIiilll) + 0.62F * t.IlIlIiilll + 0.28F * t.llIlIiilll;
      return var1 + 0.018F * IIillIiliIil(t.lIiIIiilll * 0.8F, t.iIiIIiilll * 0.3F, 991) + 0.16F * (IIlllIlliIll(17, 29, t.lilIIiilll) - 0.5F);
   }

   public static float IIlllIlliIll(int x, int seed, int y) {
      return (float)(IiIlliIliiIl(x, seed, y) >>> (~(909736162 + -83 >>> 3 | 909736162 + -83 << 29) * 128207979 ^ -1019348110)) / 1.6777216E7F;
   }

   public static int iiiIlIIIll(int t, float c) {
      return lilIliilIl(t, -1 | t & (~(~-1399473760) - 59 ^ -37 ^ -1402321218), c);
   }

   public static int llIIlilIIl(int g, int r, int b) {
      return ~(~-764822465) - 79 ^ 761904112
         | lIlIliIlIl(g) << (~838343409 * -755159085 ^ 509959322)
         | lIlIliIlIl(r) << (-(~(~-154880508) * 17) ^ -1661998668)
         | lIlIliIlIl(b);
   }

   private liIilIliiIilIl() {
   }

   public static int iIiIlIliIl(int d, int c, float k) {
      return d & ((-705909306 >>> 27 | -705909306 << 5) * 630453915 * -652835029 ^ -846304854)
         | iiiilIiIIIIiIi.lilIliilIl(
               iiiilIiIIIIiIi.IIiIllIiIl(d >> (((708191198 >>> 19 | 708191198 << 13) << 25 | (708191198 >>> 19 | 708191198 << 13) >>> 7) - 61 ^ -1920403619))
                  + iiiilIiIIIIiIi.IIiIllIiIl(c >> ((890439593 << 27 | 890439593 >>> 5) * 41 ^ -872390187)) * k
            )
            << ((~554163796 << 23 | ~554163796 >>> 9) ^ -705725440)
         | iiiilIiIIIIiIi.lilIliilIl(
               iiiilIiIIIIiIi.IIiIllIiIl(d >> ((-437491800 * 27 >>> 21 | -437491800 * 27 << 11) ^ -123 ^ -2004205966))
                  + iiiilIiIIIIiIi.IIiIllIiIl(c >> (153759460 - 103 ^ -97 ^ -153759254)) * k
            )
            << ((631276801 ^ 55) * -11 * 755159085 ^ -1150825314)
         | iiiilIiIIIIiIi.lilIliilIl(iiiilIiIIIIiIi.IIiIllIiIl(d) + iiiilIiIIIIiIi.IIiIllIiIl(c) * k);
   }

   private static int Iillllilll(int b, int t, float a) {
      int var3 = Math.round(iIlIlllllill((float)(b >> 16 & 0xFF), (float)(t >> 16 & 0xFF), a));
      int var4 = Math.round(iIlIlllllill((float)(b >> 8 & 0xFF), (float)(t >> 8 & 0xFF), a));
      int var5 = Math.round(iIlIlllllill((float)(b & 0xFF), (float)(t & 0xFF), a));
      return 0xFF000000 | var3 << 16 | var4 << 8 | var5;
   }

   public static float illilIilil(illliIllIilliIll density, float t, int seed) {
      float var3 = 0.0F;

      for (int var4 = 0; var4 < 3; var4++) {
         float var5 = 0.3F + (float)var4 * 1.1F;
         float var6 = (float)Math.cos((double)var5);
         float var7 = (float)Math.sin((double)var5);
         float var8 = density.lIiIIiilll * var6 + density.iIiIIiilll * var7;
         float var9 = -density.lIiIIiilll * var7 + density.iIiIIiilll * var6;
         float var10 = 1.0F
            - IilliliilIIi(0.0F, 0.012F, Math.abs(lIiiIiIlilli(var8 * 9.0F + IIillIiliIil(var9 * 0.7F, (float)var4, seed) * 0.4F) - 0.5F) / 9.0F);
         var3 = Math.max(var3, var10 * IilliliilIIi(1.0F - t, 1.0F, Ililllililil(var8 * 3.0F, var9 * 0.6F, seed + var4)));
      }

      return var3;
   }

   public static int iiIIlIIlIl(float v) {
      long var2 = -5717847461729715260L;
      var2 ^= ((long)lIlIliIlIl(Math.round(IliIlllilIi(v) * 255.0F)) << 32 ^ var2) & -1L << 32;
      return (~(-1434676418 - 123) + 121) * -941362695 ^ 513546765
         | (int)(var2 >>> 32)
            << (
               (
                     ((279948355 << 21 | 279948355 >>> 11) + -101 >>> 29 | (279948355 << 21 | 279948355 >>> 11) + -101 << 3) >>> 9
                        | ((279948355 << 21 | 279948355 >>> 11) + -101 >>> 29 | (279948355 << 21 | 279948355 >>> 11) + -101 << 3) << 23
                  )
                  ^ 1109493830
            )
         | (int)(var2 >>> 32) << (((-60499677 >>> 27 | -60499677 << 5) ^ -49) * -654471207 ^ -1004173256)
         | (int)(var2 >>> 32);
   }

   public static int ilIllIiIll(int degrees, float c) {
      float[] var2 = liIlliiIll(degrees);
      double var3 = Math.toRadians((double)c);
      double var5 = Math.cos(var3);
      double var7 = Math.sin(var3);
      float var9 = (float)((double)var2[1] * var5 - (double)var2[2] * var7);
      float var10 = (float)((double)var2[1] * var7 + (double)var2[2] * var5);
      var2[1] = var9;
      var2[2] = var10;
      return IIllllIlll(var2, degrees >>> (55778327 * -67 * -75 ^ 1113218927));
   }

   public static float lililiilil(illliIllIilliIll width, float t, float inset) {
      if (width.lIIlIiilll <= -1.0E9F) {
         return 0.0F;
      } else {
         float var3 = Math.abs(width.lIIlIiilll - t);
         return 1.0F - IilliliilIIi(inset * 0.35F, inset, var3);
      }
   }

   public static float IIIilIIiiIIi(float octaves, float x, int lacunarity, float seed, float gain, int y) {
      float var6 = 0.0F;
      float var7 = 1.0F;
      float var8 = 0.0F;

      for (int var9 = 0; var9 < lacunarity; var9++) {
         var6 += var7 * IIillIiliIil(octaves, x, y + var9 * 1013);
         var8 += var7;
         var7 *= gain;
         float var10 = octaves * 0.8F - x * 0.6F;
         float var11 = octaves * 0.6F + x * 0.8F;
         octaves = var10 * seed + 17.3F;
         x = var11 * seed - 9.1F;
      }

      return var6 / var8;
   }

   public static float Iilililiiili(float x, float amount, float y, int octaves, int seed) {
      return amount + y * Iiilliiliiil(x + 3.1F, amount - 7.7F, octaves, seed + (218657008 - -111 ^ 55 ^ 218657186));
   }

   public static float Iliilliiilii(float y, float x, int seed) {
      int var3 = (int)Math.floor((double)y);
      int var4 = (int)Math.floor((double)x);
      float var5 = 9.0F;
      float var6 = 9.0F;

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            int var9 = var3 + var8;
            int var10 = var4 + var7;
            int var11 = IiIlliIliiIl(var9, var10, seed);
            float var12 = (float)var9 + (float)(var11 & 65535) / 65536.0F;
            float var13 = (float)var10 + (float)(var11 >>> 16) / 65536.0F;
            float var14 = (var12 - y) * (var12 - y) + (var13 - x) * (var13 - x);
            if (var14 < var5) {
               var6 = var5;
               var5 = var14;
            } else if (var14 < var6) {
               var6 = var14;
            }
         }
      }

      return (float)(Math.sqrt((double)var6) - Math.sqrt((double)var5));
   }

   public static float lIilliIill(float d) {
      d = lIiiIiIlilli(d);
      float var1 = IIIllIIliIIl(d, 0.22F, 0.13F) + IIIllIIliIIl(d, 1.22F, 0.13F);
      float var2 = IIIllIIliIIl(d, 0.6F, 0.03F);
      float var3 = IIIllIIliIIl(d, 0.43F, 0.07F) + IIIllIIliIIl(d, 0.86F, 0.09F) + IIIllIIliIIl(d, -0.14F, 0.09F);
      return liiiIIllIl(0.5F + 0.5F * var1 + 0.42F * var2 - 0.28F * var3, 0.0F, 1.3F);
   }

   public static float Iiilliiliiil(float y, float octaves, int x, int seed) {
      return IIIilIIiiIIi(y, octaves, x, 2.03F, 0.5F, seed);
   }

   public static int llIililIil(illliIllIilliIll gloss, int sheen, float t, int base) {
      return IiIilliIil(gloss, sheen, t, base, -1);
   }

   public static int IllIllllIl(int c, float a) {
      return lIlIliIlIl(Math.round(IliIlllilIi(a) * 255.0F)) << (((-933619610 ^ -63) >>> 13 | (-933619610 ^ -63) << 19) ^ 1027194167)
         | c & (1585611749 * 50529027 * 123 ^ -1934766614);
   }

   public static int iiIilIIlil(illliIllIilliIll t, int rough, float base) {
      long var6 = 7946675190388785912L;
      float var3 = Ilillllill(t);
      float var4 = 1.0F + 0.035F * iIIIlIlIIl(t, 1.6F, t.lilIIiilll + 5);
      var6 ^= ((long)IIiIllIiIl(rough, var4 * (0.95F + 0.3F * (var3 - 0.62F) * (1.0F - base))) << 32 ^ var6) & -1L << 32;
      return lliIliliIl((int)(var6 >>> 32), iiiIlIIIll(rough, 0.35F), (1.0F - base) * 0.18F * ilillIiill(t));
   }

   public static float liilliiill(illliIllIilliIll t, float width) {
      return !(t.lIIlIiilll <= -1.0E9F) && !(t.lIIlIiilll < 0.0F) ? IIIllIIliIIl(t.lIIlIiilll, width * 0.5F, width * 0.32F) : 0.0F;
   }

   public static int lIliliIlil(illliIllIilliIll t, int base, float strength) {
      return IllIllllIl(iiiIlIIIll(base, 0.55F), IliIlllilIi(strength * ilillIiill(t)));
   }
}
