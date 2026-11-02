package gg.corz;

public final class illiiliIiliili {
   private static final int lIiIIllIIl = 1024;
   private final int[] iIiIIllIIl = new int[1025];

   public int IliIlllilIi(float t) {
      long var4 = 1500130344575886131L;
      if (!(t > 0.0F)) {
         return this.iIiIIllIIl[0];
      } else if (t >= 1.0F) {
         return this.iIiIIllIIl[(-(-1347820604 * 128207979) * 1062196213 >>> 25 | -(-1347820604 * 128207979) * 1062196213 << 7) ^ 711464544];
      } else {
         float var2 = t * 1024.0F;
         var4 ^= ((long)((int)var2) << 32 ^ var4) & -1L << 32;
         return liIilIliiIilIl.Iillllilll(this.iIiIIllIIl[(int)(var4 >>> 32)], this.iIiIIllIIl[(int)(var4 >>> 32) + 1], var2 - (float)((int)(var4 >>> 32)));
      }
   }

   illiiliIiliili(float[] pos, int[] colors) {
      if (pos.length == colors.length && pos.length != 0) {
         float[][] var3 = new float[colors.length][];

         for (int var4 = 0; var4 < colors.length; var4++) {
            var3[var4] = liIilIliiIilIl.liIlliiIll(colors[var4]);
         }

         for (int var10 = 0; var10 <= 1024; var10++) {
            float var5 = (float)var10 / 1024.0F;
            int var6 = 0;

            while (var6 < pos.length - 1 && var5 > pos[var6 + 1]) {
               var6++;
            }

            if (var5 <= pos[0]) {
               this.iIiIIllIIl[var10] = colors[0] | 0xFF000000;
            } else if (var6 >= pos.length - 1) {
               this.iIiIIllIIl[var10] = colors[pos.length - 1] | 0xFF000000;
            } else {
               float var7 = (var5 - pos[var6]) / Math.max(1.0E-6F, pos[var6 + 1] - pos[var6]);
               var7 = var7 * var7 * (3.0F - 2.0F * var7) * 0.35F + var7 * 0.65F;
               float[] var8 = var3[var6];
               float[] var9 = var3[var6 + 1];
               this.iIiIIllIIl[var10] = liIilIliiIilIl.IIllllIlll(
                  new float[]{
                     liIilIliiIilIl.iIlIlllllill(var8[0], var9[0], var7),
                     liIilIliiIilIl.iIlIlllllill(var8[1], var9[1], var7),
                     liIilIliiIilIl.iIlIlllllill(var8[2], var9[2], var7)
                  },
                  255
               );
            }
         }
      } else {
         throw new IllegalArgumentException(liiiIIllIl<"liiiIIllIl","OvZKAuxllMXjDps/YqLB1VaD82Shwxvur1FIn9SMUol9oZhTnp4=">());
      }
   }
}
