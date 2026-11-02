package gg.corz;

public record IlIllillIlli(int slot, int ticks, boolean pickaxe) {
   private final int lllliiIIlillliiIIl;
   private final boolean IilliiIIllilliiIIl;
   private final int iIlliiIIlIllliiIIl;
   public static final IlIllillIlli iilliiIIlIIiliiIIl = new IlIllillIlli(-1, Integer.MAX_VALUE, false);

   public int IilliliilIIi() {
      return this.lllliiIIlillliiIIl;
   }

   public boolean liiiIIllIl() {
      return this.iIlliiIIlIllliiIIl >= 0 && this.iIlliiIIlIllliiIIl < 9;
   }

   public IlIllillIlli(int slot, int ticks, boolean pickaxe) {
      this.iIlliiIIlIllliiIIl = slot;
      this.lllliiIIlillliiIIl = ticks;
      this.IilliiIIllilliiIIl = pickaxe;
   }

   public boolean lIiiIiIlilli() {
      return this.IilliiIIllilliiIIl;
   }

   public int iIlIlllllill() {
      return this.iIlliiIIlIllliiIIl;
   }

   public boolean IliIlllilIi() {
      return this.iIlliiIIlIllliiIIl == -1;
   }
}
