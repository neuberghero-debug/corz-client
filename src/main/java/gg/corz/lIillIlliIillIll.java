package gg.corz;

public final class lIillIlliIillIll {
   public final float IllIIIilll;
   public final lIillIlliIillIll iIlIIIilll;
   public final float illIIIilll;
   public final float lllIIIilll;
   public final int IIlIIIilll;
   public final String lIlIIIilll;
   final liIllliliiIlllil IilIIIilll = new liIllliliiIlllil();

   public boolean IliIlllilIi(lIillIlliIillIll ancestor) {
      for (lIillIlliIillIll var2 = this; var2 != null; var2 = var2.iIlIIIilll) {
         if (var2 == ancestor) {
            return true;
         }
      }

      return false;
   }

   lIillIlliIillIll(int pz, String name, lIillIlliIillIll parent, float px, float index, float py) {
      this.IIlIIIilll = pz;
      this.lIlIIIilll = name;
      this.iIlIIIilll = parent;
      this.IllIIIilll = px;
      this.lllIIIilll = index;
      this.illIIIilll = py;
   }
}
