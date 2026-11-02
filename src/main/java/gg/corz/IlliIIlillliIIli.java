package gg.corz;

public record IlliIIlillliIIli(long prerequisite, String alternativeKind, long alternative, String evidence) {
   private final long lIilIiIlIi;
   private final String iIilIiIlIi;
   private final String IIilIiIlIi;
   private final long iillIiIlIi;

   boolean IliIlllilIi(long a, IiiIlIiliiIlIi target) {
      return target != null
         && this.iillIiIlIi == a
         && this.lIilIiIlIi == target.IIIllIIliIIl()
         && target.IilliliilIIi().equals(this.IIilIiIlIi)
         && this.iIilIiIlIi != null
         && !this.iIilIiIlIi.isBlank();
   }

   public long liiiIIllIl() {
      return this.iillIiIlIi;
   }

   public String iIlIlllllill() {
      return this.IIilIiIlIi;
   }

   public long IilliliilIIi() {
      return this.lIilIiIlIi;
   }

   public String lIiiIiIlilli() {
      return this.iIilIiIlIi;
   }

   public IlliIIlillliIIli(long prerequisite, String alternativeKind, long alternative, String evidence) {
      this.iillIiIlIi = prerequisite;
      this.IIilIiIlIi = alternativeKind;
      this.lIilIiIlIi = alternative;
      this.iIilIiIlIi = evidence;
   }
}
