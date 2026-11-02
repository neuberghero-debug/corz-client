package gg.corz;

public record iiIllIIlIIlllIIl(IIiiilIilIiiilIi action, String status) {
   private final String illilillIl;
   private final IIiiilIilIiiilIi lllilillIl;

   public String liiiIIllIl() {
      return this.illilillIl;
   }

   public iiIllIIlIIlllIIl(IIiiilIilIiiilIi action, String status) {
      this.lllilillIl = action;
      this.illilillIl = status;
   }

   public IIiiilIilIiiilIi IliIlllilIi() {
      return this.lllilillIl;
   }
}
