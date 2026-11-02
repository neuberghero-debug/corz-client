package gg.corz;

public final class ilIlIIilIiIlIIil {
   public final int IlIiIlIIil;
   public static final int iiiIIlIIil = 3;
   public static final int lIilIlIIil = 13;
   public static final int liilIlIIil = 16;
   public static final int IlIlIlIIil = 0;
   public static final int llilIlIIil = 2;
   public static final int IlilIlIIil = 1;
   public static final int lIIiIlIIil = 128;
   public static final int IIilIlIIil = 12;
   public static final int ilIlIlIIil = 2;
   public final lIlliIIiiIlliIIi IiIiIlIIil;
   public static final int liIlIlIIil = 1;
   public static final int iIllIlIIil = 5;
   public static final int lIIlIlIIil = 5;
   public static final int iillIlIIil = 11;
   public static final int llIlIlIIil = 1;
   public static final int IIllIlIIil = 3;
   public final int IIliIlIIil;
   public static final int liiIIlIIil = 2;
   public static final int iiIlIlIIil = 2;
   public static final int IlllIlIIil = 6;
   public static final int iIIlIlIIil = -1;
   public static final int IIIlIlIIil = 4;
   public final int iIliIlIIil;
   public static final int llllIlIIil = 7;
   public final int llIiIlIIil;
   public final int IlliIlIIil;
   public static final int iliIIlIIil = 0;
   public static final int illlIlIIil = 8;
   public static final int lIllIlIIil = 4;
   public static final int iIIiIlIIil = 256;
   public static final int iIilIlIIil = 14;
   public static final int ililIlIIil = 4;
   public static final int IIIiIlIIil = 64;
   public final int illiIlIIil;
   public final int llliIlIIil;
   public final int lIliIlIIil;
   public static final int lillIlIIil = 10;
   public static final int IiilIlIIil = 8;
   public final int liIiIlIIil;
   public static final int lliIIlIIil = -1;
   public static final int iiilIlIIil = 32;
   public static final int IiiIIlIIil = 1;
   public final int ilIiIlIIil;
   public static final int IillIlIIil = 9;
   public final int iiIiIlIIil;
   public static final int IiIlIlIIil = 0;

   public ilIlIIilIiIlIIil(int shape, int z, int x, lIlliIIiiIlliIIi y, int facing, int axis, int kind, int weight) {
      this(shape, z, x, y, facing, axis, kind, weight, 0);
   }

   public boolean iliIiiliiiii(int flag) {
      return (this.llliIlIIil & flag) != 0;
   }

   public ilIlIIilIiIlIIil(int y, int kind, int beType, lIlliIIiiIlliIIi axis, int shape, int facing, int weight, int z, int x) {
      this(y, kind, beType, axis, shape, facing, weight, z, x, 0, 0);
   }

   public static ilIlIIilIiIlIIil liiiIIllIl(int flags, int y, int z, lIlliIIiiIlliIIi x, int family, int biome, int kind, int weight) {
      return new ilIlIIilIiIlIIil(flags, y, z, x, family, -1, -1, 0, 0, biome, kind, weight);
   }

   public static ilIlIIilIiIlIIil iIlIlllllill(int kind, int weight, int z, lIlliIIiiIlliIIi shape, int x, int y, int beType) {
      return new ilIlIIilIiIlIIil(kind, weight, z, shape, x, -1, -1, beType, y);
   }

   public ilIlIIilIiIlIIil(int shape, int x, int axis, lIlliIIiiIlliIIi facing, int weight, int y, int family, int beType, int flags, int kind, int z) {
      this(shape, x, axis, facing, weight, y, family, beType, flags, kind, z, 0);
   }

   public int IIIllIIliIIl(ilIlIIilIiIlIIil o) {
      long var5 = 2743930709343486905L;
      long var7 = 400257191265909771L;
      var5 ^= ((long)Math.abs(this.IlIiIlIIil - o.IlIiIlIIil) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)Math.abs(this.llIiIlIIil - o.llIiIlIIil) ^ var5) & -1L >>> 32;
      var7 ^= ((long)Math.abs(this.ilIiIlIIil - o.ilIiIlIIil) << 32 ^ var7) & -1L << 32;
      return Math.max((int)(var5 >>> 32), Math.max((int)var5, (int)(var7 >>> 32)));
   }

   public ilIlIIilIiIlIIil(
      int kind, int weight, int facing, lIlliIIiiIlliIIi x, int beType, int biome, int flags, int axis, int family, int y, int z, int shape
   ) {
      this.IlIiIlIIil = kind;
      this.llIiIlIIil = weight;
      this.ilIiIlIIil = facing;
      this.IiIiIlIIil = x;
      this.liIiIlIIil = beType;
      this.iiIiIlIIil = biome;
      this.IIliIlIIil = flags;
      this.lIliIlIIil = axis;
      this.iIliIlIIil = family;
      this.IlliIlIIil = y;
      this.llliIlIIil = z;
      this.illiIlIIil = shape;
   }

   public static ilIlIIilIiIlIIil IliIlllilIi(int kind, int x, int family, lIlliIIiiIlliIIi flags, int weight, int z, int y) {
      return new ilIlIIilIiIlIIil(kind, x, family, flags, weight, -1, -1, 0, 0, z, y);
   }

   public static ilIlIIilIiIlIIil lIiiIiIlilli(int shape, int biome, int kind, lIlliIIiiIlliIIi z, int beType, int family, int y, int x, int flags, int weight) {
      return new ilIlIIilIiIlIIil(shape, biome, kind, z, beType, -1, -1, y, family, x, flags, weight);
   }

   public static ilIlIIilIiIlIIil IilliliilIIi(int z, int x, int beType, lIlliIIiiIlliIIi flags, int y, int shape, int kind, int family, int weight) {
      return new ilIlIIilIiIlIIil(z, x, beType, flags, y, -1, -1, kind, shape, family, weight);
   }

   public ilIlIIilIiIlIIil(int weight, int x, int z, lIlliIIiiIlliIIi kind, int y) {
      this(weight, x, z, kind, y, -1, -1, 0, 0);
   }
}
