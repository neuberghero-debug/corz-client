package gg.corz;

public record lIiIiIiiIiIiIi(IIIIiillIIIiil kind, String text, boolean close) {
   public static final lIiIiIiiIiIiIi Illlilliillllillii = new lIiIiIiiIiIiIi(IIIIiillIIIiil.IlIlIiIlillIlIiIli, null, false);
   private final String iiIlilliiIIllillii;
   private final IIIIiillIIIiil IiIlilliiliIlillii;
   private final boolean lIllilliiiIllillii;

   public String iIlIlllllill() {
      return this.iiIlilliiIIllillii;
   }

   public lIiIiIiiIiIiIi(IIIIiillIIIiil kind, String text, boolean close) {
      this.IiIlilliiliIlillii = kind;
      this.iiIlilliiIIllillii = text;
      this.lIllilliiiIllillii = close;
   }

   static lIiIiIiiIiIiIi IliIlllilIi(IIIIiillIIIiil kind) {
      return new lIiIiIiiIiIiIi(kind, null, false);
   }

   public boolean IilliliilIIi() {
      return this.lIllilliiiIllillii;
   }

   public IIIIiillIIIiil liiiIIllIl() {
      return this.IiIlilliiliIlillii;
   }
}
