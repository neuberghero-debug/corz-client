package gg.corz;

public final class IIllllllIlllll {
   static final int Iliiiliillliiiliil = 9;
   static final double iliiiliilIiiiiliil = 50000.0;
   static final String[] IIIIIiiillIIIIiiil = new String[]{
      liiiIIllIl<"liiiIIllIl","jBUiAeuC5TETKJuLM4Oluq6NcELOTZzo98Oal2fjhn0=">(),
      liiiIIllIl<"liiiIIllIl","ChoMjDBK9xuZZZQJbHMOtjdJJQX06izsPzFJb2mXWGM=">(),
      liiiIIllIl<"liiiIIllIl","OVr//ucKQUCSWg0sY975YQVZEGy5IxuD53TV7iaLeds=">(),
      liiiIIllIl<"liiiIIllIl","IsblkcfhmGUwwfGlSNd6javEJOCfnh2F/jqQ7zN6KXU=">(),
      liiiIIllIl<"liiiIIllIl","vGy3AvoHt+qZGCL57QNFvugwIc2qUzVziDGiUGuGtdw=">(),
      liiiIIllIl<"liiiIIllIl","P9wffDBbgUySoK32HsfxNiZKO4qQHLcmmS7hV+bk7w==">()
   };
   static final int[][] iIIIIiiilIlIIIiiil = new int[][]{
      {82, 5},
      {100, 3},
      {101, 3},
      {102, 3},
      {103, 2},
      {104, 2},
      {105, 2},
      {106, 2},
      {91, 2},
      {83, 5},
      {44, 3},
      {75, 3},
      {42, 3},
      {41, 2},
      {40, 2},
      {39, 2},
      {38, 2},
      {92, 2},
      {84, 5},
      {45, 3},
      {14, 3},
      {13, 3},
      {12, 2},
      {11, 2},
      {10, 2},
      {37, 2},
      {93, 2},
      {85, 5},
      {46, 5},
      {74, 5},
      {3, 3},
      {2, 2},
      {1, 2},
      {25, 2},
      {36, 2},
      {94, 2},
      {86, 4},
      {47, 4},
      {72, 4},
      {71, 4},
      {5, 2},
      {4, 2},
      {24, 2},
      {35, 2},
      {95, 2},
      {87, 4},
      {51, 1},
      {17, 1},
      {9, 0},
      {8, 0},
      {7, 0},
      {23, 0},
      {34, 0},
      {96, 2},
      {88, 4},
      {54, 1},
      {18, 1},
      {61, 0},
      {62, 0},
      {21, 0},
      {22, 0},
      {33, 0},
      {97, 0},
      {89, 0},
      {26, 1},
      {27, 0},
      {28, 0},
      {29, 0},
      {30, 0},
      {59, 0},
      {32, 0},
      {98, 0},
      {90, 0},
      {107, 1},
      {108, 1},
      {109, 1},
      {110, 1},
      {111, 1},
      {112, 1},
      {113, 1},
      {99, 0}
   };
   static final double liiiiliiliiiiiliil = 225000.0;

   private IIllllllIlllll() {
   }

   public static String IliIlllilIi(double worldX, double worldZ) {
      long var7 = -4968586747559363673L;
      var7 ^= (
            (long)(
                     (int)Math.floor(
                        (worldX + Double.longBitsToDouble(5600466822805895632L ^ 915266082555869648L))
                           / Double.longBitsToDouble(-3999316489779184258L ^ -8604134958579483266L)
                     )
                  )
                  << 32
               ^ var7
         )
         & -1L << 32;
      var7 ^= (
            (long)(
                  (int)Math.floor(
                     (worldZ + Double.longBitsToDouble(4259934900366867033L ^ 8796976448774077017L))
                        / Double.longBitsToDouble(-3776922882057603771L ^ -8395335712623725243L)
                  )
               )
               ^ var7
         )
         & -1L >>> 32;
      if ((int)(var7 >>> 32) >= 0
         && (int)(var7 >>> 32)
            < (
               (
                     (-1978041127 * -1483715975 * 252645135 << 25 | -1978041127 * -1483715975 * 252645135 >>> 7) >>> 13
                        | (-1978041127 * -1483715975 * 252645135 << 25 | -1978041127 * -1483715975 * 252645135 >>> 7) << 19
                  )
                  ^ 1220017825
            )
         && (int)var7 >= 0
         && (int)var7 < ((726602275 + 79 >>> 19 | 726602275 + 79 << 13) - -97 ^ -498186813)) {
         int[] var6 = iIIIIiiilIlIIIiiil[(int)var7 * (-(438884453 - 115 + -25 >>> 23 | 438884453 - 115 + -25 << 9) ^ -1370468923) + (int)(var7 >>> 32)];
         return liiiIIllIl<"liiiIIllIl","DgvnUbk2cVcGeeAb2wRjTKhC4GBKaFFx6/d5Gcs3ExBzXYs=">()
            + var6[0]
            + liiiIIllIl<"liiiIIllIl","BMQiRYkHQI7vGUJerEa7icfC5eg5DzKdr3URs4Xx">()
            + IIIIIiiillIIIIiiil[Math.min(var6[1], IIIIIiiillIIIIiiil.length - 1)]
            + liiiIIllIl<"liiiIIllIl","CIWBfhdW8DHmnlpK7ELq/jaERfhdRw7qDrXTTU4=">();
      } else {
         return null;
      }
   }
}
