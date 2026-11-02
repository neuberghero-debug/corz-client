package gg.corz;

public class IIilIIilIilIIi {
   private long lliiIiiliiliiIiili = System.currentTimeMillis();

   public boolean iIlIlllllill(double ms) {
      return (double)this.liiiIIllIl() >= ms;
   }

   public void IliIlllilIi() {
      this.lliiIiiliiliiIiili = System.currentTimeMillis();
   }

   public long liiiIIllIl() {
      return System.currentTimeMillis() - this.lliiIiiliiliiIiili;
   }
}
