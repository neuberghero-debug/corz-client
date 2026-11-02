package gg.corz;

public enum IlIiIlIlllIiIlIl {
   IIllIIIiIl,
   liilIIIiIl,
   IlilIIIiIl,
   lIilIIIiIl,
   lIllIIIiIl,
   IlllIIIiIl,
   iIllIIIiIl,
   llllIIIiIl,
   IIilIIIiIl,
   iillIIIiIl,
   IillIIIiIl,
   illlIIIiIl,
   ililIIIiIl,
   iIilIIIiIl,
   IiilIIIiIl,
   lillIIIiIl,
   llilIIIiIl;
   // $VF: synthetic field
   private static final IlIiIlIlllIiIlIl[] iiilIIIiIl = liiiIIllIl();

   public static IlIiIlIlllIiIlIl IliIlllilIi(String name) {
      long var5 = -2884909735137570680L;
      if (name != null) {
         IlIiIlIlllIiIlIl[] var1 = values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            IlIiIlIlllIiIlIl var4 = var1[(int)var8];
            if (var4.name().equalsIgnoreCase(name)) {
               return var4;
            }
         }
      }

      return null;
   }
}
