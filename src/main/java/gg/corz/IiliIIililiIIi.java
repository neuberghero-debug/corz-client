package gg.corz;

public final class IiliIIililiIIi {
   public static final int IIIlIIIiilIIlIIIii = 2;
   public static final int IilIIIIiililIIIIii = 2;
   public static final int iilIIIIiiIIiIIIIii = 3;
   public static final int iliIIIIiiIiiIIIIii = 6;
   public static final int IliIIIIiilliIIIIii = 5;
   public static final int lIiIIIIiiiIiIIIIii = 4;
   private static final long iIIlIIIiiIlIlIIIii = -3750763034362895579L;
   private static final long llIlIIIiiilIlIIIii = 1099511628211L;
   public static final int lllIIIIiiillIIIIii = 1;
   public static final int iIlIIIIiiIllIIIIii = 0;
   public static final int liiIIIIiiiiiIIIIii = 4;

   private IiliIIililiIIi() {
   }

   private static long IiIlliIliiIl(long h, int v) {
      h = (h ^ (long)v & 4294967295L) * 1099511628211L;
      return h ^ h >>> 29;
   }

   private static int IlIlllIlilIl(StringBuilder b, int sb, String written, String name, String a, boolean changed) {
      if (!changed) {
         return sb;
      } else {
         if (sb > 0) {
            b.append(Illlllllilll<"Illlllllilll","KQVJSjS0oMs1Gj5wwuKmC7MciSuWGw+XXjtsjaYF">());
         }

         b.append(written)
            .append(Illlllllilll<"Illlllllilll","888jCp1eo5sju2kEIO7g3CLUyzKCrnOZj3zv3BVu">())
            .append(name)
            .append(Illlllllilll<"Illlllllilll","0m9aOqHCcK8h/AzW8oXVqplBQrfI8nZexhtB7rCQ">())
            .append(a);
         return sb + 1;
      }
   }

   public static long IilliliilIIi(long... dependencyClocks) {
      long var8 = 3628422335240377984L;
      if (dependencyClocks != null && dependencyClocks.length != 0) {
         long var1 = 0L;
         long[] var3 = dependencyClocks;
         var8 ^= ((long)dependencyClocks.length << 32 ^ var8) & -1L << 32;

         for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            long var6 = var3[(int)var11];
            var1 += IIlllIlliIll(var6);
         }

         return IIlllIlliIll(var1 ^ (long)dependencyClocks.length * 1099511628211L);
      } else {
         return -3750763034362895579L;
      }
   }

   public static int iIlIlllllill(int y) {
      return Math.floorDiv(y, 2);
   }

   public static int lIiiIiIlilli(int dx, int dy, int dz) {
      long var6 = -8473877992345607952L;
      long var8 = -3556576962529964893L;
      var6 ^= ((long)Math.abs(dx) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)Math.abs(dy) ^ var6) & -1L >>> 32;
      var8 ^= ((long)Math.abs(dz) << 32 ^ var8) & -1L << 32;
      if ((int)(var6 >>> 32) == 0 && (int)var6 == 0 && (int)(var8 >>> 32) == 0) {
         return 6;
      } else if ((int)var6 > (int)(var6 >>> 32) && (int)var6 > (int)(var8 >>> 32)) {
         return dy > 0 ? 4 : 5;
      } else if ((int)(var6 >>> 32) >= (int)(var8 >>> 32)) {
         return dx > 0 ? 2 : 3;
      } else {
         return dz > 0 ? 1 : 0;
      }
   }

   private static long IIlllIlliIll(long z) {
      z += -7046029254386353131L;
      z = (z ^ z >>> 30) * -4658895280553007687L;
      z = (z ^ z >>> 27) * -7723592293110705685L;
      return z ^ z >>> 31;
   }

   public static String IIIllIIliIIl(int side) {
      return switch (side) {
         case 0 -> Illlllllilll<"Illlllllilll","BLCJT4hxkE153SUO1rNrHtoVdUWpGikTEAVc9NRGgbql">();
         case 1 -> Illlllllilll<"Illlllllilll","WVScTKwlM5yJDX1478/6u9SZYPEzy0I/W6JMbyRHpfWQ">();
         case 2 -> Illlllllilll<"Illlllllilll","ibXlfeGxEycdjkEs32Z1/EuqOtfxAIE3/slmCRZIDDA=">();
         case 3 -> Illlllllilll<"Illlllllilll","pA7jJIbvHSPIDyUG0pASTHjgtJgTME0AHU9HCz8Aw8c=">();
         case 4 -> Illlllllilll<"Illlllllilll","9UmAjxlNHjTrxdiqHudJcXpr9ISSsblK2AmNVxuBxHxx">();
         case 5 -> Illlllllilll<"Illlllllilll","COT0Ae8PTJML6qtNBYwJbzPpu61/DETDvQ+QdI2EzxOG">();
         case 6 -> Illlllllilll<"Illlllllilll","TF1GhLS78EseWGs5ZnnTXuOHb1REmWcaIUII7bZu3g==">();
         default -> Illlllllilll<"Illlllllilll","5mMjhhb9za3D44ipPqPp5Dwu6locbI6TU55A1HMCaVA=">() + side;
      };
   }

   public static long IliIlllilIi(int clusterY, int entrySide, int clusterZ, int clusterX, int kind, int heightBand) {
      long var6 = -3750763034362895579L;
      var6 = IiIlliIliiIl(var6, clusterY);
      var6 = IiIlliIliiIl(var6, entrySide);
      var6 = IiIlliIliiIl(var6, clusterZ);
      var6 = IiIlliIliiIl(var6, clusterX);
      var6 = IiIlliIliiIl(var6, kind);
      return IiIlliIliiIl(var6, heightBand);
   }

   public static int liiiIIllIl(int v) {
      return Math.floorDiv(v, 4);
   }

   public static String iliIiiliiiii(int cxA, int bandB, int sideA, int bandA, int kindB, int cxB, int cyA, int cyB, int czB, int sideB, int czA, int kindA) {
      long var14 = 5990095264304865007L;
      StringBuilder var12 = new StringBuilder(Illlllllilll<"Illlllllilll","WGWHm7TARztWttacW0PmDURHnAiAlOlcExUD1OxHQ2CCrU9HvpHpotXSjg==">());
      var14 ^= (0L ^ var14) & -1L << 32;
      var14 ^= (
            (long)IlIlllIlilIl(
                     var12,
                     (int)(var14 >>> 32),
                     Illlllllilll<"Illlllllilll","FfzZMT4zXolyyFAWQ5jBWE2F/nPZolo6u0uAnXKYKvQ=">(),
                     Integer.toString(cxA),
                     Integer.toString(cyA),
                     cxA != cyA
                  )
                  << 32
               ^ var14
         )
         & -1L << 32;
      var14 ^= (
            (long)IlIlllIlilIl(
                     var12,
                     (int)(var14 >>> 32),
                     Illlllllilll<"Illlllllilll","02QTlzkeniw+zGVIH+5KgEtg4HQ18BO+YgOk4XgTxySielMA">(),
                     Integer.toString(bandB),
                     Integer.toString(cyB),
                     bandB != cyB
                  )
                  << 32
               ^ var14
         )
         & -1L << 32;
      var14 ^= (
            (long)IlIlllIlilIl(
                     var12,
                     (int)(var14 >>> 32),
                     Illlllllilll<"Illlllllilll","sdgNDXHpCXogaP0238uJZNmfLoa8rfnY4jVtA7ztAc5ofb1J">(),
                     Integer.toString(sideA),
                     Integer.toString(czB),
                     sideA != czB
                  )
                  << 32
               ^ var14
         )
         & -1L << 32;
      var14 ^= (
            (long)IlIlllIlilIl(
                     var12,
                     (int)(var14 >>> 32),
                     Illlllllilll<"Illlllllilll","871lUtIql1I1UJLCWZkxNeluUJ0ohZwT6rLnYVeiPlJ+p4ES">(),
                     Integer.toString(bandA),
                     Integer.toString(sideB),
                     bandA != sideB
                  )
                  << 32
               ^ var14
         )
         & -1L << 32;
      var14 ^= (
            (long)IlIlllIlilIl(
                     var12,
                     (int)(var14 >>> 32),
                     Illlllllilll<"Illlllllilll","rvGxKBhvn7nKgnUJLS650QChM5eYXtK/5p60+WqL7nT/O6qkUT0=">(),
                     Integer.toString(kindB),
                     Integer.toString(czA),
                     kindB != czA
                  )
                  << 32
               ^ var14
         )
         & -1L << 32;
      IlIlllIlilIl(
         var12,
         (int)(var14 >>> 32),
         Illlllllilll<"Illlllllilll","ICqm2C2nXJIAAoWmG/ulVIF8JrExSJ3Ez/SrR/Ig4Vl9QFvcZg==">(),
         IIIllIIliIIl(cxB),
         IIIllIIliIIl(kindA),
         cxB != kindA
      );
      return var12.append('}').toString();
   }
}
