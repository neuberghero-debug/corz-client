package gg.corz;

public record lliIillliliIilll(boolean jump, boolean click, boolean brake, iliIllIiiIll phase, String note) {
   private final iliIllIiiIll illllIlill;
   private final boolean iIlllIlill;
   private final boolean lllllIlill;
   private final String IilllIlill;
   private final boolean IllllIlill;

   public boolean liiiIIllIl() {
      return this.IllllIlill;
   }

   public lliIillliliIilll(boolean jump, boolean click, boolean brake, iliIllIiiIll phase, String note) {
      this.iIlllIlill = jump;
      this.IllllIlill = click;
      this.lllllIlill = brake;
      this.illllIlill = phase;
      this.IilllIlill = note;
   }

   public boolean iIlIlllllill() {
      return this.lllllIlill;
   }

   public String lIiiIiIlilli() {
      return this.IilllIlill;
   }

   public boolean IliIlllilIi() {
      return this.iIlllIlill;
   }

   public iliIllIiiIll IilliliilIIi() {
      return this.illllIlill;
   }
}
