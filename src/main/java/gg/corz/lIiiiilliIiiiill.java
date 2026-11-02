package gg.corz;

public final class lIiiiilliIiiiill {
   private boolean ilIiiiiill;
   public static final double iIIiiiiill = 0.84;
   private int llIiiiiill;
   public static final double IlIiiiiill = 0.6;
   public static final double lIIiiiiill = 0.62;

   private static double IilliliilIIi(iIIIIIilIlIIIIil surface) {
      return surface != iIIIIIilIlIIIIil.iliilIIIil && surface != iIIIIIilIlIIIIil.IiiilIIIil ? 0.15 : 0.26;
   }

   public static boolean iliIiiliiiii(illliIiIilliIi node, IiIiilllliIiilll pose) {
      long var3 = 5076975978217992708L;
      if (pose.IIIllIIliIIl() && lIiiIiIlilli(node, pose)) {
         return false;
      } else if (pose.IIIllIIliIIl() && pose.liiiIIllIl() >= (double)node.liiiIIllIl() && pose.liiiIIllIl() < (double)node.liiiIIllIl() + 1.3) {
         return false;
      } else {
         var3 ^= (
               (long)(
                        node.lIiiIiIlilli() != iiiIIiilIIIlIiil.iIIIiillil
                              && node.lIiiIiIlilli() != iiiIIiilIIIlIiil.IlIIiillil
                              && node.lIiiIiIlilli() != iiiIIiilIIIlIiil.iiIIiillil
                              && node.lIiiIiIlilli() != iiiIIiilIIIlIiil.iIlIiillil
                           ? 0
                           : 1
                     )
                     << 32
                  ^ var3
            )
            & -1L << 32;
         return (int)(var3 >>> 32) != 0 || (double)node.liiiIIllIl() - pose.liiiIIllIl() > 0.35;
      }
   }

   public void liiiIIllIl(int nextIndex) {
      if (nextIndex > this.llIiiiiill) {
         this.llIiiiiill = nextIndex;
      }

      this.ilIiiiiill = false;
   }

   public boolean IiIlliIliiIl() {
      return this.ilIiiiiill;
   }

   public int IlIlllIlilIl() {
      return this.llIiiiiill;
   }

   public static boolean lIiiIiIlilli(illliIiIilliIi pose, IiIiilllliIiilll node) {
      long var9 = -4148500264665866420L;
      long var11 = 5320080092090107492L;
      long var13 = -6167795827812349070L;
      var9 ^= ((long)(node.IilliliilIIi() == pose.IliIlllilIi() && node.iliIiiliiiii() == pose.iIlIlllllill() ? 1 : 0) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)(pose.IilliliilIIi() != iIIIIIilIlIIIIil.iliilIIIil && pose.IilliliilIIi() != iIIIIIilIlIIIIil.IiiilIIIil ? 0 : 1) ^ var9) & -1L >>> 32;
      double var4 = IilliliilIIi(pose.IilliliilIIi());
      var11 ^= ((long)(node.liiiIIllIl() > (double)pose.liiiIIllIl() - var4 && node.liiiIIllIl() < (double)pose.liiiIIllIl() + 1.3 ? 1 : 0) << 32 ^ var11)
         & -1L << 32;
      var11 ^= ((long)(node.lIiiIiIlilli() == pose.liiiIIllIl() ? 1 : 0) ^ var11) & -1L >>> 32;
      var13 ^= (
            (long)(
                     (int)var9 != 0
                           && node.lIiiIiIlilli() == pose.liiiIIllIl() - 1
                           && node.liiiIIllIl() >= (double)pose.liiiIIllIl() - var4
                           && node.liiiIIllIl() < (double)pose.liiiIIllIl()
                        ? 1
                        : 0
                  )
                  << 32
               ^ var13
         )
         & -1L << 32;
      return (int)(var9 >>> 32) != 0 && (int)(var11 >>> 32) != 0 && ((int)var11 != 0 || (int)(var13 >>> 32) != 0);
   }

   public iilllIIill iIlIlllllill(int pose, illliIiIilliIi requestedIndex, IiIiilllliIiilll node) {
      long var22 = 5128952493169412748L;
      long var24 = -4553509416299455229L;
      long var26 = 7760418190246002755L;
      long var28 = -2796442158885722900L;
      if (pose > this.llIiiiiill) {
         this.liiiIIllIl(pose);
      }

      var22 ^= ((long)this.llIiiiiill << 32 ^ var22) & -1L << 32;
      double[] var5 = IIIllIIliIIl(requestedIndex);
      double var6 = var5[0] - node.IliIlllilIi();
      double var8 = var5[1] - node.iIlIlllllill();
      double var10 = Math.sqrt(var6 * var6 + var8 * var8);
      double var12 = Math.abs((double)requestedIndex.liiiIIllIl() - node.liiiIIllIl());
      if (this.ilIiiiiill) {
         if (var10 > 0.84) {
            this.ilIiiiiill = false;
         }
      } else if (var10 <= 0.62) {
         this.ilIiiiiill = true;
      }

      var22 ^= ((long)(node.IilliliilIIi() == requestedIndex.IliIlllilIi() && node.iliIiiliiiii() == requestedIndex.iIlIlllllill() ? 1 : 0) ^ var22)
         & -1L >>> 32;
      double var15 = IilliliilIIi(requestedIndex.IilliliilIIi());
      var24 ^= (
            (long)(node.liiiIIllIl() > (double)requestedIndex.liiiIIllIl() - var15 && node.liiiIIllIl() < (double)requestedIndex.liiiIIllIl() + 1.3 ? 1 : 0)
                  << 32
               ^ var24
         )
         & -1L << 32;
      var24 ^= ((long)lIiiIiIlilli(requestedIndex, node) ^ var24) & -1L >>> 32;
      var26 ^= ((long)((int)var24 != 0 && node.IIIllIIliIIl() ? 1 : 0) << 32 ^ var26) & -1L << 32;
      var26 ^= (
            (long)(
                  requestedIndex.lIiiIiIlilli() != iiiIIiilIIIlIiil.iIIIiillil
                        && requestedIndex.lIiiIiIlilli() != iiiIIiilIIIlIiil.IlIIiillil
                        && requestedIndex.lIiiIiIlilli() != iiiIIiilIIIlIiil.iiIIiillil
                        && requestedIndex.lIiiIiIlilli() != iiiIIiilIIIlIiil.iIlIiillil
                        && requestedIndex.lIiiIiIlilli() != iiiIIiilIIIlIiil.llIIiillil
                        && requestedIndex.lIiiIiIlilli() != iiiIIiilIIIlIiil.ilIIiillil
                     ? 0
                     : 1
               )
               ^ var26
         )
         & -1L >>> 32;
      var28 ^= ((long)((int)var26 != 0 && ((int)(var26 >>> 32) == 0 || !(node.liiiIIllIl() < (double)requestedIndex.liiiIIllIl() + 0.6)) ? 0 : 1) << 32 ^ var28)
         & -1L << 32;
      return new iilllIIill(
         (int)(var22 >>> 32),
         this.ilIiiiiill && (int)var22 != 0 && (int)(var24 >>> 32) != 0 && (int)(var28 >>> 32) != 0,
         var5[0],
         var5[1],
         var10,
         var12,
         (boolean)((int)var24),
         (boolean)((int)(var26 >>> 32))
      );
   }

   public void IliIlllilIi(int initialIndex) {
      this.llIiiiiill = Math.max(0, initialIndex);
      this.ilIiiiiill = false;
   }

   public static double[] IIIllIIliIIl(illliIiIilliIi node) {
      return new double[]{(double)node.IliIlllilIi() + 0.5, (double)node.iIlIlllllill() + 0.5};
   }
}
