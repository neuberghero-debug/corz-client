package gg.corz;

public record IllIIIIllllIIIIl(IIiIiillIiIiil kind, long waitMs) {
   public static final IllIIIIllllIIIIl llIIliIlIl = new IllIIIIllllIIIIl(IIiIiillIiIiil.IlIiliIlillIiliIli, -1L);
   private final IIiIiillIiIiil iIIIliIlIl;
   private final long IlIIliIlIl;

   public IIiIiillIiIiil liiiIIllIl() {
      return this.iIIIliIlIl;
   }

   public IllIIIIllllIIIIl(IIiIiillIiIiil kind, long waitMs) {
      this.iIIIliIlIl = kind;
      this.IlIIliIlIl = waitMs;
   }

   public long iIlIlllllill() {
      return this.IlIIliIlIl;
   }

   static IllIIIIllllIIIIl IliIlllilIi(IIiIiillIiIiil kind) {
      return new IllIIIIllllIIIIl(kind, -1L);
   }
}
