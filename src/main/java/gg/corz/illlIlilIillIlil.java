package gg.corz;

public record illlIlilIillIlil(int source, int target, boolean urgent) {
   private final int liliIIiIil;
   private final boolean iiliIIiIil;
   private final int IiliIIiIil;

   public illlIlilIillIlil(int source, int target, boolean urgent) {
      this.IiliIIiIil = source;
      this.liliIIiIil = target;
      this.iiliIIiIil = urgent;
   }

   public int liiiIIllIl() {
      return this.liliIIiIil;
   }

   public boolean iIlIlllllill() {
      return this.iiliIIiIil;
   }

   public int IliIlllilIi() {
      return this.IiliIIiIil;
   }
}
