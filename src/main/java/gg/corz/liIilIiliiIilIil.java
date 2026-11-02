package gg.corz;

final class liIilIiliiIilIil {
   float lliiiIlIil;
   String lIiiiIlIil = "";
   float IliiiIlIil = -1.0F;
   float IiiiiIlIil = 1.0F;
   String iIiiiIlIil;
   long iliiiIlIil;

   private liIilIiliiIilIil() {
   }

   void IliIlllilIi(String s, boolean animate) {
      String var3 = s == null ? "" : s;
      if (!var3.equals(this.lIiiiIlIil)) {
         this.iIiiiIlIil = animate && !this.lIiiiIlIil.isEmpty() ? this.lIiiiIlIil : null;
         this.lliiiIlIil = this.IliiiIlIil;
         this.lIiiiIlIil = var3;
         this.IliiiIlIil = -1.0F;
         this.iliiiIlIil = System.nanoTime();
      }
   }

   float liiiIIllIl(float sc) {
      if (this.IliiiIlIil < 0.0F || sc != this.IiiiiIlIil) {
         this.IiiiiIlIil = sc;
         this.IliiiIlIil = llilliilililliil.IiIIlliIIl(this.lIiiiIlIil, sc);
      }

      return this.IliiiIlIil;
   }
}
