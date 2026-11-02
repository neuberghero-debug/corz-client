package gg.corz;

class lIiilIliIiilIl {
   boolean lllIIllllillIIllll;
   long iilIIllllIIiIIllll;
   long IilIIlllllilIIllll;

   boolean iIlIlllllill() {
      return this.lllIIllllillIIllll && this.iilIIllllIIiIIllll == 0L;
   }

   private lIiilIliIiilIl() {
   }

   void liiiIIllIl(long now) {
      if (this.lllIIllllillIIllll && this.iilIIllllIIiIIllll == 0L) {
         this.iilIIllllIIiIIllll = now;
      }
   }

   float IilliliilIIi(long out, long now, long in) {
      if (!this.lllIIllllillIIllll) {
         return 0.0F;
      } else {
         float var7 = iIillliIlillli.Ililllililil((float)(out - this.IilIIlllllilIIllll) / (float)now);
         if (this.iilIIllllIIiIIllll != 0L) {
            if (out - this.iilIIllllIIiIIllll >= in) {
               this.lllIIllllillIIllll = false;
               return 0.0F;
            }

            var7 *= 1.0F - iIillliIlillli.Ililllililil((float)(out - this.iilIIllllIIiIIllll) / (float)in);
         }

         return var7;
      }
   }

   void IliIlllilIi(long now) {
      this.lllIIllllillIIllll = true;
      this.IilIIlllllilIIllll = now;
      this.iilIIllllIIiIIllll = 0L;
   }
}
