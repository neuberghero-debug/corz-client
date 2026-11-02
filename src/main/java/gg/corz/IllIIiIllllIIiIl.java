package gg.corz;

public final class IllIIiIllllIIiIl {
   private long liiIlIiIll = System.currentTimeMillis();

   public long liiiIIllIl() {
      return System.currentTimeMillis() - this.liiIlIiIll;
   }

   public boolean iIlIlllllill(long ms) {
      return this.liiiIIllIl() >= ms;
   }

   public void IliIlllilIi() {
      this.liiIlIiIll = System.currentTimeMillis();
   }
}
