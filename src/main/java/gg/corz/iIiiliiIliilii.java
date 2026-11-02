package gg.corz;

public record iIiiliiIliilii(long target, long stand, IIlIiiIilIlIiiIi eyeMode, long fingerprint, String reason, long certificateId, long[] cells) {
   private final long iIiIiliIIl;
   private final IIlIiiIilIlIiiIi lliIiliIIl;
   private final long iliIiliIIl;
   private final long IliIiliIIl;
   private final long[] iiiIiliIIl;
   private final String IiiIiliIIl;
   private final long liiIiliIIl;

   public long liiiIIllIl() {
      return this.IliIiliIIl;
   }

   public long IliIlllilIi() {
      return this.iIiIiliIIl;
   }

   public IIlIiiIilIlIiiIi iIlIlllllill() {
      return this.lliIiliIIl;
   }

   public iIiiliiIliilii(long target, long stand, IIlIiiIilIlIiiIi eyeMode, long fingerprint, String reason, long certificateId, long[] cells) {
      this.iIiIiliIIl = target;
      this.IliIiliIIl = stand;
      this.lliIiliIIl = eyeMode;
      this.iliIiliIIl = fingerprint;
      this.IiiIiliIIl = reason;
      this.liiIiliIIl = certificateId;
      this.iiiIiliIIl = cells;
   }

   public long IilliliilIIi() {
      return this.iliIiliIIl;
   }

   public String lIiiIiIlilli() {
      return this.IiiIiliIIl;
   }

   public iIiiliiIliilii(long reason, long stand, IIlIiiIilIlIiiIi eyeMode, long fingerprint, String target, long certificateId) {
      this(reason, stand, eyeMode, fingerprint, target, certificateId, null);
   }

   public long[] IIIllIIliIIl() {
      return this.iiiIiliIIl;
   }

   public long iliIiiliiiii() {
      return this.liiIiliIIl;
   }
}
