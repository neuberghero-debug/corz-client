package gg.corz;

public final class ilIlIIlIiIlIIl {
   private ilIlIIlIiIlIIl() {
   }

   public static IIllIiIllIllIiIl IliIlllilIi(IIllIiIllIllIiIl lastGrounded, boolean onGround, IIllIiIllIllIiIl gapOwned, boolean want) {
      long var8 = 7260506722823371771L;
      long var10 = -773278351942700888L;
      IIllIiIllIllIiIl var4 = gapOwned == null ? IIllIiIllIllIiIl.IlllIliIll : gapOwned;
      if (want) {
         return new IIllIiIllIllIiIl(lastGrounded.IliIlllilIi(), lastGrounded.liiiIIllIl(), lastGrounded.iIlIlllllill(), lastGrounded.IilliliilIIi());
      } else {
         var8 ^= ((long)(onGround ? lastGrounded.IilliliilIIi() : var4.IilliliilIIi()) << 32 ^ var8) & -1L << 32;
         var8 ^= ((long)(lastGrounded.liiiIIllIl() && onGround ? 1 : 0) ^ var8) & -1L >>> 32;
         var10 ^= ((long)(onGround ? lastGrounded.iIlIlllllill() : var4.iIlIlllllill()) << 32 ^ var10) & -1L << 32;
         if ((int)var8 != 0 && !var4.iIlIlllllill()) {
            var10 ^= (0L ^ var10) & -1L << 32;
         }

         return new IIllIiIllIllIiIl(lastGrounded.IliIlllilIi(), (boolean)((int)var8), (boolean)((int)(var10 >>> 32)), (boolean)((int)(var8 >>> 32)));
      }
   }

   public static boolean liiiIIllIl(IIllIiIllIllIiIl want, IIllIiIllIllIiIl got) {
      return want.liiiIIllIl() != got.liiiIIllIl() || want.iIlIlllllill() != got.iIlIlllllill() || want.IilliliilIIi() != got.IilliliilIIi();
   }
}
