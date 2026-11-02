package gg.corz;

public record liiIllIiiiiIllIi(long target, long stand, int poseClass, int supportFace, String reason, long dependencyFingerprint, int tick) {
   private final long IiIiliIIIi;
   private final int IlliliIIIi;
   private final String lIliliIIIi;
   private final int IIliliIIIi;
   private final long liIiliIIIi;
   private final int iiIiliIIIi;
   private final long iIliliIIIi;

   public long liiiIIllIl() {
      return this.liIiliIIIi;
   }

   public liiIllIiiiiIllIi(long target, long stand, int poseClass, int supportFace, String reason, long dependencyFingerprint, int tick) {
      this.IiIiliIIIi = target;
      this.liIiliIIIi = stand;
      this.iiIiliIIIi = poseClass;
      this.IIliliIIIi = supportFace;
      this.lIliliIIIi = reason;
      this.iIliliIIIi = dependencyFingerprint;
      this.IlliliIIIi = tick;
   }

   public long iliIiiliiiii() {
      return this.iIliliIIIi;
   }

   public String lIiiIiIlilli() {
      return this.lIliliIIIi;
   }

   public int iIlIlllllill() {
      return this.iiIiliIIIi;
   }

   public int IilliliilIIi() {
      return this.IIliliIIIi;
   }

   public int IIIllIIliIIl() {
      return this.IlliliIIIi;
   }

   public long IliIlllilIi() {
      return this.IiIiliIIIi;
   }
}
