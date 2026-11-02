package gg.corz;

public enum IliilIillliilIil {
   llilIllIil,
   IIilIllIil,
   IlilIllIil,
   lIilIllIil,
   ililIllIil,
   iIilIllIil;
   // $VF: synthetic field
   private static final IliilIillliilIil[] IiilIllIil = iIlIlllllill();

   public static IliilIillliilIil liiiIIllIl(String name) {
      long var5 = -7751924150364634851L;
      if (name != null) {
         IliilIillliilIil[] var1 = values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            IliilIillliilIil var4 = var1[(int)var8];
            if (var4.name().equalsIgnoreCase(name)) {
               return var4;
            }
         }
      }

      return IIilIllIil;
   }

   public boolean IliIlllilIi() {
      return this == IIilIllIil || this == IlilIllIil || this == llilIllIil;
   }
}
