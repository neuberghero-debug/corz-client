package gg.corz;

import java.util.Arrays;

public final class iIIiliIlIili {
   public final int iliIiIlIlIiiIiIlIl;
   public final long IilIiIlIllilIiIlIl;
   public final int lIiIiIlIliIiIiIlIl;
   public final int IiIliIlIlliIliIlIl;
   public final int IIIliIlIllIIliIlIl;
   public final long[] iIiliIlIlIliliIlIl;
   public final int lIlliIlIliIlliIlIl;
   public final long lllIiIlIlillIiIlIl;
   public final int llIliIlIlilIliIlIl;
   public final float iiIliIlIlIIlliIlIl;
   public final float[] IIiliIlIllIiliIlIl;
   public final int illliIlIlIilliIlIl;
   public final int iIIliIlIlIlIliIlIl;
   public final float[] lilliIlIliilliIlIl;
   public final int IllliIlIllllliIlIl;
   public final long[] lliliIlIlililiIlIl;
   public final int IliIiIlIllliIiIlIl;
   public static final int IIlIiIlIllIlIiIlIl = 0;
   public final int liiIiIlIliiiIiIlIl;
   public final int iilIiIlIlIIiIiIlIl;
   public static final int iIlIiIlIlIllIiIlIl = 1;

   public boolean IilliliilIIi(long chunkKey) {
      long var8 = 8525683382591037559L;
      long[] var3 = this.iIiliIlIlIliliIlIl;
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         if (var6 == chunkKey) {
            return true;
         }
      }

      return false;
   }

   iIIiliIlIili(
      long cells,
      long maxZ,
      int maxX,
      int quads,
      int anchorY,
      int anchorZ,
      int length,
      int key,
      int score,
      int cellKeys,
      int maxY,
      float type,
      int signature,
      int minZ,
      int minX,
      float[] anchorX,
      float[] lines,
      long[] chunks,
      long[] minY
   ) {
      this.lllIiIlIlillIiIlIl = cells;
      this.IilIiIlIllilIiIlIl = maxZ;
      this.iilIiIlIlIIiIiIlIl = maxX;
      this.lIiIiIlIliIiIiIlIl = quads;
      this.IliIiIlIllliIiIlIl = anchorY;
      this.iliIiIlIlIiiIiIlIl = anchorZ;
      this.liiIiIlIliiiIiIlIl = length;
      this.IIIliIlIllIIliIlIl = key;
      this.iIIliIlIlIlIliIlIl = score;
      this.llIliIlIlilIliIlIl = cellKeys;
      this.IiIliIlIlliIliIlIl = maxY;
      this.iiIliIlIlIIlliIlIl = type;
      this.lIlliIlIliIlliIlIl = signature;
      this.IllliIlIllllliIlIl = minZ;
      this.illliIlIlIilliIlIl = minX;
      this.lilliIlIliilliIlIl = anchorX;
      this.IIiliIlIllIiliIlIl = lines;
      this.iIiliIlIlIliliIlIl = chunks;
      this.lliliIlIlililiIlIl = minY;
   }

   public int lIiiIiIlilli() {
      return this.lilliIlIliilliIlIl.length / 6;
   }

   public boolean liiiIIllIl(int x, int margin, int z, int y) {
      return x >= this.lIiIiIlIliIiIiIlIl - y
         && x <= this.liiIiIlIliiiIiIlIl + y
         && margin >= this.IliIiIlIllliIiIlIl - y
         && margin <= this.IIIliIlIllIIliIlIl + y
         && z >= this.iliIiIlIlIiiIiIlIl - y
         && z <= this.iIIliIlIlIlIliIlIl + y;
   }

   public boolean iIlIlllllill(iIIiliIlIili other) {
      long var6 = -45479980825025199L;
      if (other.lIiIiIlIliIiIiIlIl <= this.liiIiIlIliiiIiIlIl
         && other.liiIiIlIliiiIiIlIl >= this.lIiIiIlIliIiIiIlIl
         && other.IliIiIlIllliIiIlIl <= this.IIIliIlIllIIliIlIl
         && other.IIIliIlIllIIliIlIl >= this.IliIiIlIllliIiIlIl
         && other.iliIiIlIlIiiIiIlIl <= this.iIIliIlIlIlIliIlIl
         && other.iIIliIlIlIlIliIlIl >= this.iliIiIlIlIiiIiIlIl) {
         long[] var2 = this.lliliIlIlililiIlIl;
         long[] var3 = other.lliliIlIlililiIlIl;
         var6 ^= (0L ^ var6) & -1L << 32;
         var6 ^= (0L ^ var6) & -1L >>> 32;

         while ((int)(var6 >>> 32) < var2.length && (int)var6 < var3.length) {
            if (var2[(int)(var6 >>> 32)] == var3[(int)var6]) {
               return true;
            }

            if (var2[(int)(var6 >>> 32)] < var3[(int)var6]) {
               var6 += 4294967296L;
            } else {
               var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean IliIlllilIi(int y, int x, int z) {
      return y >= this.lIiIiIlIliIiIiIlIl
            && y <= this.liiIiIlIliiiIiIlIl
            && x >= this.IliIiIlIllliIiIlIl
            && x <= this.IIIliIlIllIIliIlIl
            && z >= this.iliIiIlIlIiiIiIlIl
            && z <= this.iIIliIlIlIlIliIlIl
         ? Arrays.binarySearch(this.lliliIlIlililiIlIl, iiIIIlllIIlIIlll.IiIlliIliiIl(y, x, z)) >= 0
         : false;
   }

   public int iliIiiliiiii() {
      return this.IIiliIlIllIiliIlIl.length / 12;
   }
}
