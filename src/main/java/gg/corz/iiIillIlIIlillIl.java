package gg.corz;

public record iiIillIlIIlillIl(Iiiiilllliiiilll reject, int deckY, Iiilliiliiil deck, iIlillIllill probe, String detail) {
   private final Iiilliiliiil lliIIlliIl;
   private final iIlillIllill iliIIlliIl;
   private final int IliIIlliIl;
   private final String IiiIIlliIl;
   private final Iiiiilllliiiilll iIiIIlliIl;

   public Iiilliiliiil IilliliilIIi() {
      return this.lliIIlliIl;
   }

   public String iliIiiliiiii() {
      return this.IiiIIlliIl;
   }

   public boolean IliIlllilIi() {
      return this.iIiIIlliIl == Iiiiilllliiiilll.liiIlllill && this.lliIIlliIl != null;
   }

   public Iiiiilllliiiilll liiiIIllIl() {
      return this.iIiIIlliIl;
   }

   public iiIillIlIIlillIl(Iiiiilllliiiilll reject, int deckY, Iiilliiliiil deck, iIlillIllill probe, String detail) {
      this.iIiIIlliIl = reject;
      this.IliIIlliIl = deckY;
      this.lliIIlliIl = deck;
      this.iliIIlliIl = probe;
      this.IiiIIlliIl = detail;
   }

   public iIlillIllill lIiiIiIlilli() {
      return this.iliIIlliIl;
   }

   public int iIlIlllllill() {
      return this.IliIIlliIl;
   }
}
