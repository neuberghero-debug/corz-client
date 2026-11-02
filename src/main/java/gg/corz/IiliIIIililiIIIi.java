package gg.corz;

import java.util.Map;
import net.minecraft.class_2680;

public final class IiliIIIililiIIIi {
   public final class_2680[] IIlIIlliil;
   public final int iIIIIlliil;
   public final int ilIIIlliil;
   public final int lIIIIlliil;
   private final int[] lIlIIlliil;
   public final int liIIIlliil;
   public final int llIIIlliil;
   public final int IlIIIlliil;
   public final int IiIIIlliil;
   public final int iiIIIlliil;
   public final Map<Integer, Integer> iIlIIlliil;
   public final int IIIIIlliil;

   public IiliIIIililiIIIi(
      int posX, int palette, int sizeX, int sizeZ, int indices, int crafterMasks, class_2680[] sizeY, int[] posZ, Map<Integer, Integer> posY
   ) {
      this.IIIIIlliil = posX;
      this.lIIIIlliil = palette;
      this.iIIIIlliil = sizeX;
      this.IlIIIlliil = sizeZ;
      this.llIIIlliil = indices;
      this.ilIIIlliil = crafterMasks;
      this.IiIIIlliil = Math.abs(sizeZ);
      this.liIIIlliil = Math.abs(indices);
      this.iiIIIlliil = Math.abs(crafterMasks);
      this.IIlIIlliil = sizeY;
      this.lIlIIlliil = posZ;
      this.iIlIIlliil = posY == null ? Map.of() : posY;
   }

   public int iliIiiliiiii(int x, int y, int z) {
      long var5 = -2664363284795180088L;
      var5 ^= ((long)((y * this.iiIIIlliil + z) * this.IiIIIlliil + x) << 32 ^ var5) & -1L << 32;
      return (int)(var5 >>> 32) >= 0 && (int)(var5 >>> 32) < this.lIlIIlliil.length ? this.lIlIIlliil[(int)(var5 >>> 32)] : -1;
   }

   public int lIiiIiIlilli() {
      return this.iIIIIlliil + (this.ilIIIlliil < 0 ? this.ilIIIlliil + 1 : 0);
   }

   public int iIlIlllllill() {
      return this.IIIIIlliil + (this.IlIIIlliil < 0 ? this.IlIIIlliil + 1 : 0);
   }

   public IiliIIIililiIIIi(int posZ, int indices, int sizeX, int posX, int sizeZ, int sizeY, class_2680[] posY, int[] palette) {
      this(posZ, indices, sizeX, posX, sizeZ, sizeY, posY, palette, Map.of());
   }

   public class_2680 IIIllIIliIIl(int x, int y, int z) {
      long var5 = -4013140873187620137L;
      var5 ^= ((long)this.iliIiiliiiii(x, y, z) << 32 ^ var5) & -1L << 32;
      return (int)(var5 >>> 32) >= 0 && (int)(var5 >>> 32) < this.IIlIIlliil.length ? this.IIlIIlliil[(int)(var5 >>> 32)] : null;
   }

   public int IliIlllilIi(int z, int y, int x) {
      return (y * this.iiIIIlliil + x) * this.IiIIIlliil + z;
   }

   public Integer liiiIIllIl(int z, int y, int x) {
      return this.iIlIIlliil.get(this.IliIlllilIi(z, y, x));
   }

   public int IilliliilIIi() {
      return this.lIIIIlliil + (this.llIIIlliil < 0 ? this.llIIIlliil + 1 : 0);
   }
}
