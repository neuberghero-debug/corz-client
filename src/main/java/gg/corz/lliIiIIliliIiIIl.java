package gg.corz;

public enum lliIiIIliliIiIIl {
   IIIllIilIl(iIlIlllllill<"iIlIlllllill","00Jkh0d4chXYHlshpqLGbIIqMpOuGSxtkiKPAQoL3pY=">()),
   ilIllIilIl(iIlIlllllill<"iIlIlllllill","uavjYylWVI3BjcBoVkepCiRJFzQ1GkzIrmm1AR9dRFDbrA==">()),
   iIIllIilIl(iIlIlllllill<"iIlIlllllill","2WWYdGP5z9WoG3/S9KBDdbLi6HXwVcf4PVkUcbUJdAbwMg==">()),
   lIIllIilIl(iIlIlllllill<"iIlIlllllill","o7CgHkU5dxI7cU133BcEGgSEbI19/bz1kBOPW5IVk8ohzyHa">()),
   IlIllIilIl(iIlIlllllill<"iIlIlllllill","fRJp7YPkboDaUfysNTrQnbPGx3cU7OvJfFE6RkjHbaSllEXCOA==">()),
   IiIllIilIl(iIlIlllllill<"iIlIlllllill","2tGgSTZ0nagbf5gggTb/6zvsxGNPC362x0ZHuOVH/+82A3U=">()),
   llIllIilIl(iIlIlllllill<"iIlIlllllill","6Dg6ileDPxgkPGhQZ/JFcfWiOjLenyYiFWd3lVkhXizWrA==">());

   // $VF: synthetic field
   private static final lliIiIIliliIiIIl[] iiIllIilIl = liiiIIllIl();
   public final String liIllIilIl;

   public static lliIiIIliliIiIIl IliIlllilIi(String name) {
      long var5 = -5842039592053430014L;
      if (name != null) {
         lliIiIIliliIiIIl[] var1 = values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            lliIiIIliliIiIIl var4 = var1[(int)var8];
            if (var4.name().equalsIgnoreCase(name)) {
               return var4;
            }
         }
      }

      return IIIllIilIl;
   }

   private lliIiIIliliIiIIl(String nullx) {
      this.liIllIilIl = nullx;
   }
}
