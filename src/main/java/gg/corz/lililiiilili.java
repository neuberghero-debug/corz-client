package gg.corz;

public record lililiiilili(boolean safe, boolean synced, boolean timedOut) {
   private final boolean lIliIllIliIliIllIl;
   private final boolean IiIiIllIlliIiIllIl;
   private final boolean iiIiIllIlIIliIllIl;

   public lililiiilili(boolean safe, boolean synced, boolean timedOut) {
      this.IiIiIllIlliIiIllIl = safe;
      this.iiIiIllIlIIliIllIl = synced;
      this.lIliIllIliIliIllIl = timedOut;
   }

   public boolean liiiIIllIl() {
      return this.iiIiIllIlIIliIllIl;
   }

   public boolean IliIlllilIi() {
      return this.IiIiIllIlliIiIllIl;
   }

   public boolean iIlIlllllill() {
      return this.lIliIllIliIliIllIl;
   }
}
