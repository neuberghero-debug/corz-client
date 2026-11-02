package gg.corz;

public enum IIlIiIilIlIiIi {
   IIiillliilIiilllii(iIlIlllllill<"iIlIlllllill","ChfOX9QA5CuPECjKEWzqwFxjQEkUTdhHN7vDKjF7FH59">()),
   lilillliiiililllii(iIlIlllllill<"iIlIlllllill","VhIYm5m3li/hZ5J9mAYK75D567ZPpk+gmI7DdAbtZhDIDw==">()),
   illillliiIililllii(iIlIlllllill<"iIlIlllllill","m8mNKVNxn34Dst6A1Qce43Sxsr2PmjXESSRR6f3h707ArM0=">()),
   iIiillliiIliilllii(iIlIlllllill<"iIlIlllllill","ARKUhnzS4cCMur381iSF+HYm/LRpCotzlgSGlKRclmLC0yk=">());

   // $VF: synthetic field
   private static final IIlIiIilIlIiIi[] Iiiillliiliiilllii = liiiIIllIl();
   public final String lliillliiiliilllii;

   private IIlIiIilIlIiIi(String label) {
      this.lliillliiiliilllii = label;
   }

   public static IIlIiIilIlIiIi IliIlllilIi(String label) {
      long var5 = 3376860774269829549L;
      if (label != null) {
         IIlIiIilIlIiIi[] var1 = values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            IIlIiIilIlIiIi var4 = var1[(int)var8];
            if (var4.lliillliiiliilllii.equalsIgnoreCase(label)) {
               return var4;
            }
         }
      }

      return illillliiIililllii;
   }
}
