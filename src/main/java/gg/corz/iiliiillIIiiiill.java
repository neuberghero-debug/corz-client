package gg.corz;

class iiliiillIIiiiill {
   int liiliiiill;
   int IIIiiiiill;
   static final int ililiiiill = 15;
   final String Iiiliiiill;
   int iiiliiiill;

   boolean liiiIIllIl(double my, double mx) {
      return my >= (double)this.liiliiiill
         && my <= (double)(this.liiliiiill + this.IIIiiiiill)
         && mx >= (double)this.iiiliiiill
         && mx <= (double)(this.iiiliiiill + 15);
   }

   iiliiillIIiiiill(String label) {
      this.Iiiliiiill = label;
   }

   void IliIlllilIi(int y, int x, int w) {
      this.liiliiiill = y;
      this.iiiliiiill = x;
      this.IIIiiiiill = w;
   }
}
