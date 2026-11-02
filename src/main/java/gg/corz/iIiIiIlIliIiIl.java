package gg.corz;

public record iIiIiIlIliIiIl(long target, int x, int y, int z) {
   private final int iilllIillIIillIill;
   private final long iIlllIillIllllIill;
   private final int IilllIilllilllIill;
   private final int lllllIillillllIill;

   public iIiIiIlIliIiIl(long target, int x, int y, int z) {
      this.iIlllIillIllllIill = target;
      this.lllllIillillllIill = x;
      this.IilllIilllilllIill = y;
      this.iilllIillIIillIill = z;
   }

   public long IliIlllilIi() {
      return this.iIlllIillIllllIill;
   }

   public int IilliliilIIi() {
      return this.iilllIillIIillIill;
   }

   public int liiiIIllIl() {
      return this.lllllIillillllIill;
   }

   public int iIlIlllllill() {
      return this.IilllIilllilllIill;
   }
}
