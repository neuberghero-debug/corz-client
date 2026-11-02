package gg.corz;

public record IiilIillliilIill(IlIlliIillIlliIi stage, String teamCode, String hostName, int builders, String detail) {
   private final String illllilill;
   private final IlIlliIillIlliIi lIlllilill;
   private final int lllllilill;
   private final String iIlllilill;
   private final String Illllilill;

   public String iIlIlllllill() {
      return this.Illllilill;
   }

   public String liiiIIllIl() {
      return this.iIlllilill;
   }

   public int IilliliilIIi() {
      return this.lllllilill;
   }

   public String lIiiIiIlilli() {
      return this.illllilill;
   }

   public IlIlliIillIlliIi IliIlllilIi() {
      return this.lIlllilill;
   }

   public IiilIillliilIill(IlIlliIillIlliIi stage, String teamCode, String hostName, int builders, String detail) {
      teamCode = teamCode == null ? "" : teamCode;
      hostName = hostName == null ? "" : hostName;
      detail = detail == null ? "" : detail;
      this.lIlllilill = stage;
      this.iIlllilill = teamCode;
      this.Illllilill = hostName;
      this.lllllilill = builders;
      this.illllilill = detail;
   }
}
