package gg.corz;

public final class lllIIiIiillIIiIi {
   public static final int iIIililIIi = 4;
   public static final int lIIililIIi = 3;
   public static final int IIIililIIi = 2;
   public static final int[][] llIililIIi = new int[][]{{0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}, {-1, 0, 0}, {1, 0, 0}};
   public static final int iiillilIIi = 1;
   public static final int liillilIIi = 0;
   public static final int IlIililIIi = 5;
   private static final int[][][] ilIililIIi = new int[][][]{
      {{0, 0, 0}, {1, 0, 0}, {1, 0, 1}, {0, 0, 1}},
      {{0, 1, 0}, {0, 1, 1}, {1, 1, 1}, {1, 1, 0}},
      {{0, 0, 0}, {0, 1, 0}, {1, 1, 0}, {1, 0, 0}},
      {{0, 0, 1}, {1, 0, 1}, {1, 1, 1}, {0, 1, 1}},
      {{0, 0, 0}, {0, 0, 1}, {0, 1, 1}, {0, 1, 0}},
      {{1, 0, 0}, {1, 1, 0}, {1, 1, 1}, {1, 0, 1}}
   };

   public static boolean IilliliilIIi(int box, float[] face) {
      return switch (box) {
         case 0 -> face[1] <= 0.0F;
         case 1 -> face[4] >= 1.0F;
         case 2 -> face[2] <= 0.0F;
         case 3 -> face[5] >= 1.0F;
         case 4 -> face[0] <= 0.0F;
         default -> face[3] >= 1.0F;
      };
   }

   public static boolean lIiiIiIlilli(float[] nz, float[] p2, float[] p1, float[] nx, float ny, float p3, float p0) {
      float var7 = p1[0] - nz[0];
      float var8 = p1[1] - nz[1];
      float var9 = p1[2] - nz[2];
      float var10 = nx[0] - p2[0];
      float var11 = nx[1] - p2[1];
      float var12 = nx[2] - p2[2];
      float var13 = var8 * var12 - var9 * var11;
      float var14 = var9 * var10 - var7 * var12;
      float var15 = var7 * var11 - var8 * var10;
      return var13 * ny + var14 * p3 + var15 * p0 >= 0.0F;
   }

   public static float liiiIIllIl(int y, float face, float x, float z) {
      return switch (y) {
         case 0, 1, 3 -> face;
         case 2 -> 1.0F - face;
         case 4 -> z;
         default -> 1.0F - z;
      };
   }

   public static float iIlIlllllill(int face, float y, float z, float x) {
      return switch (face) {
         case 0 -> 1.0F - x;
         case 1 -> x;
         default -> 1.0F - z;
      };
   }

   public static void IliIlllilIi(int face, int vertex, float[] box, float[] out) {
      int[] var4 = ilIililIIi[face][vertex];
      out[0] = var4[0] == 0 ? box[0] : box[3];
      out[1] = var4[1] == 0 ? box[1] : box[4];
      out[2] = var4[2] == 0 ? box[2] : box[5];
   }

   private lllIIiIiillIIiIi() {
   }
}
