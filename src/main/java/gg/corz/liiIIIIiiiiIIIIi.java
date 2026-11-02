package gg.corz;

final class liiIIIIiiiiIIIIi {
   private int liIIIIliil = -1;
   private int IIlIIIliil = -1;
   private boolean iiIIIIliil;

   int iIlIlllllill() {
      return this.iiIIIIliil ? this.liIIIIliil : -1;
   }

   void iliIiiliiiii(int selected) {
      if (!this.iiIIIIliil && selected >= 0) {
         this.liIIIIliil = selected;
         this.iiIIIIliil = true;
      }
   }

   void IliIlllilIi() {
      this.liIIIIliil = -1;
      this.iiIIIIliil = false;
      this.IIlIIIliil = -1;
   }

   int IlIlllIlilIl(int foreignBusy, boolean selected) {
      return this.iiIIIIliil && !lIlIiIIliIlIiIIl.Ililllililil(this.iiIIIIliil, this.IIlIIIliil, foreignBusy, selected) ? this.liIIIIliil : -1;
   }

   int lIiiIiIlilli(int selected) {
      if (!this.iiIIIIliil) {
         return -1;
      } else if (this.liIIIIliil >= 0 && this.liIIIIliil != selected) {
         return this.liIIIIliil;
      } else {
         this.IliIlllilIi();
         return -1;
      }
   }

   boolean liiiIIllIl() {
      return this.iiIIIIliil;
   }

   void IilliliilIIi(int selected, boolean foreignBusy) {
      if (lIlIiIIliIlIiIIl.Ililllililil(this.iiIIIIliil, this.IIlIIIliil, selected, foreignBusy)) {
         this.IliIlllilIi();
      }
   }

   void IIIllIIliIIl(int now, boolean restoring) {
      this.IIlIIIliil = now;
      if (restoring && this.iiIIIIliil && now == this.liIIIIliil) {
         this.IliIlllilIi();
      }
   }
}
