package gg.corz;

import java.util.Arrays;

final class IllIIiillllIIiil {
   final int[][] iiIIlillil;
   final int[][] IiIIlillil;
   final int[][] iIIIlillil;
   final float[][] lIlIlillil;
   final boolean[][] IIlIlillil;
   final illIIlllIilIIlll IIIIlillil;
   final boolean[] ilIIlillil;
   final float[][] llIIlillil;
   final float[][] liIIlillil;
   final float[] IlIIlillil = new float[]{Float.MAX_VALUE, Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};
   final lIillIiiIillIi[] lIIIlillil;

   float[] IliIlllilIi(int classes) {
      float[] var2 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};

      for (int var3 = 0; var3 < 8; var3++) {
         if ((classes & IlIliIlllIliIl.IliIlllilIi(var3)) != 0 && this.llIIlillil[var3] != null) {
            iiiilIiIIIIiIi.IliIlllilIi(var2, this.llIIlillil[var3][0], this.llIIlillil[var3][1]);
            iiiilIiIIIIiIi.IliIlllilIi(var2, this.llIIlillil[var3][2], this.llIIlillil[var3][3]);
         }
      }

      return var2[0] > var2[2] ? null : var2;
   }

   int liiiIIllIl(int classes) {
      int var2 = 0;

      for (int var3 = 0; var3 < 8; var3++) {
         if ((classes & IlIliIlllIliIl.IliIlllilIi(var3)) != 0 && this.ilIIlillil[var3]) {
            var2 |= IlIliIlllIliIl.IliIlllilIi(var3);
         }
      }

      return var2;
   }

   IllIIiillllIIiil(illIIlllIilIIlll rig, lIillIiiIillIi[] parts) {
      this.llIIlillil = new float[8][];
      this.ilIIlillil = new boolean[8];
      this.IIIIlillil = rig;
      this.lIIIlillil = parts;
      this.iIIIlillil = new int[parts.length][];
      this.IiIIlillil = new int[parts.length][];
      this.liIIlillil = new float[parts.length][];
      this.iiIIlillil = new int[parts.length][];
      this.IIlIlillil = new boolean[parts.length][];
      this.lIlIlillil = new float[parts.length][];

      for (int var3 = 0; var3 < parts.length; var3++) {
         lIillIiiIillIi var4 = parts[var3];
         int var5 = var4.iIlIlllllill();
         this.iIIIlillil[var3] = new int[var5];
         float[] var6 = new float[var5 * 20];
         float[] var7 = new float[var5];
         int[] var8 = new int[var5];
         int[] var9 = new int[var5];
         boolean[] var10 = new boolean[var5];
         int var11 = 0;

         for (int var12 = 0; var12 < var5; var12++) {
            float var13 = 0.0F;
            float var14 = 0.0F;
            float var15 = 0.0F;
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = 0.0F;

            for (int var19 = 0; var19 < 4; var19++) {
               int var20 = var4.lIIlliIiiiIIlliIii[var12 * 4 + var19];
               var13 += var4.IIiIliIiilIiIliIii[var20 * 3];
               var14 += var4.IIiIliIiilIiIliIii[var20 * 3 + 1];
               var15 += var4.IIiIliIiilIiIliIii[var20 * 3 + 2];
               var16 += var4.iIiIliIiiIliIliIii[var20 * 3];
               var17 += var4.iIiIliIiiIliIliIii[var20 * 3 + 1];
               var18 += var4.iIiIliIiiIliIliIii[var20 * 3 + 2];
            }

            float var33 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
            if (var33 > 1.0E-6F) {
               var16 /= var33;
               var17 /= var33;
               var18 /= var33;
            } else {
               var16 = 0.0F;
               var17 = 0.0F;
               var18 = 1.0F;
            }

            int var34 = var4.lIIlliIiiiIIlliIii[var12 * 4];
            int var21 = IlIliIlllIliIl.IlIlllIlilIl(var4.IiiIliIiiliiIliIii[var34], var4.lliIliIiiiliIliIii[var34 * 2], var4.lliIliIiiiliIliIii[var34 * 2 + 1]);
            int var22 = IlIliIlllIliIl.IiIlliIliiIl(rig, var3, var21, var13 / 4.0F, var14 / 4.0F, var15 / 4.0F, var16, var17, var18);
            this.iIIIlillil[var3][var12] = var22;
            int var23 = var22 & 0xFF;
            this.ilIIlillil[var23] = true;
            float[] var24 = this.llIIlillil[var23];
            if (var24 == null) {
               var24 = this.llIIlillil[var23] = new float[]{Float.MAX_VALUE, Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};
            }

            for (int var25 = 0; var25 < 4; var25++) {
               int var26 = var4.lIIlliIiiiIIlliIii[var12 * 4 + var25];
               float var27 = var4.IIiIliIiilIiIliIii[var26 * 3];
               float var28 = var4.IIiIliIiilIiIliIii[var26 * 3 + 1];
               iiiilIiIIIIiIi.IliIlllilIi(var24, var27, var28);
               iiiilIiIIIIiIi.IliIlllilIi(this.IlIIlillil, var27, var28);
               int var29 = var11 * 20 + var25 * 5;
               var6[var29] = var27;
               var6[var29 + 1] = var28;
               var6[var29 + 2] = var4.iIiIliIiiIliIliIii[var26 * 3];
               var6[var29 + 3] = var4.iIiIliIiiIliIliIii[var26 * 3 + 1];
               var6[var29 + 4] = Math.abs(var4.iIiIliIiiIliIliIii[var26 * 3 + 2]);
            }

            if (Math.abs(var18) > 0.02F) {
               var8[var11] = var21;
               var9[var11] = var23;
               var10[var11] = Math.abs(var18) > 0.3F;
               var7[var11] = Math.abs(var15 / 4.0F - 8.0F);
               var11++;
            }
         }

         this.liIIlillil[var3] = Arrays.copyOf(var6, var11 * 20);
         this.IiIIlillil[var3] = Arrays.copyOf(var8, var11);
         this.iiIIlillil[var3] = Arrays.copyOf(var9, var11);
         this.IIlIlillil[var3] = Arrays.copyOf(var10, var11);
         this.lIlIlillil[var3] = Arrays.copyOf(var7, var11);
      }
   }
}
