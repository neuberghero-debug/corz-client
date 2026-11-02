package gg.corz;

final class iIlIlilIllIlil {
   String lIlIliiIiiIlIliiIi;
   float lilIliiIiiilIliiIi;
   String IllIliiIilllIliiIi;
   String iiIIliiIiIIlIliiIi = "";
   float illIliiIiIilIliiIi;

   private iIlIlilIllIlil() {
      this.lIlIliiIiiIlIliiIi = "";
      this.IllIliiIilllIliiIi = "";
   }

   void IliIlllilIi(IIliiIlllIliiIll font, String to, String from) {
      long var6 = 1958124821733880L;
      var6 ^= (0L ^ var6) & -1L << 32;
      var6 ^= ((long)Math.min(to.length(), from.length()) ^ var6) & -1L >>> 32;

      while ((int)(var6 >>> 32) < (int)var6 && to.charAt((int)(var6 >>> 32)) == from.charAt((int)(var6 >>> 32))) {
         var6 += 4294967296L;
      }

      this.iiIIliiIiIIlIliiIi = from.substring(0, (int)(var6 >>> 32));
      this.lIlIliiIiiIlIliiIi = to.substring((int)(var6 >>> 32));
      this.IllIliiIilllIliiIi = from.substring((int)(var6 >>> 32));
      this.illIliiIiIilIliiIi = font.iIlIlllllill(to) - font.iIlIlllllill(this.lIlIliiIiiIlIliiIi);
      this.lilIliiIiiilIliiIi = font.iIlIlllllill(from) - font.iIlIlllllill(this.IllIliiIilllIliiIi);
   }
}
