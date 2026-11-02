package gg.corz;

import java.util.Arrays;

public final class iIiilIllIliilIll {
   public final long[] illiIlilll;
   public final int lIliIlilll;
   public final int liIiIlilll;
   public final int iiIiIlilll;
   public final lilIlIiiilIlIi[] iIliIlilll;
   public final int IIliIlilll;
   public final lilIlIiiilIlIi[] llliIlilll;
   public final long[] IlliIlilll;

   public iIiilIllIliilIll(int sectionCount, int bottomSectionY, int chunkZ, int chunkX) {
      long var6 = 2536179001918432314L;
      super();
      this.liIiIlilll = sectionCount;
      this.iiIiIlilll = bottomSectionY;
      this.IIliIlilll = chunkZ;
      this.lIliIlilll = chunkX;
      var6 ^= ((long)(chunkZ + 2) << 32 ^ var6) & -1L << 32;
      this.iIliIlilll = new lilIlIiiilIlIi[(int)(var6 >>> 32)];
      this.IlliIlilll = new long[(int)(var6 >>> 32)];
      this.llliIlilll = new lilIlIiiilIlIi[(int)(var6 >>> 32)];
      this.illiIlilll = new long[(int)(var6 >>> 32)];
      Arrays.fill(this.iIliIlilll, lilIlIiiilIlIi.IIllIlIiilIllIlIii);
      Arrays.fill(this.llliIlilll, lilIlIiiilIlIi.IIllIlIiilIllIlIii);
   }
}
