package gg.corz;

public record iiiiilIIIIIi(long target, long support, int face, boolean crouched, boolean sneak, int hitClass) {
   private final boolean iIiiIliiIliiIlii;
   private final long liliIliiiiliIlii;
   private final long illiIliiIiliIlii;
   private final int IIiiIliilIiiIlii;
   private final boolean lliiIliiiliiIlii;
   private final int IiiiIliiliiiIlii;

   public int iIlIlllllill() {
      return this.IIiiIliilIiiIlii;
   }

   public iiiiilIIIIIi(long target, long support, int face, boolean crouched, boolean sneak, int hitClass) {
      this.illiIliiIiliIlii = target;
      this.liliIliiiiliIlii = support;
      this.IIiiIliilIiiIlii = face;
      this.iIiiIliiIliiIlii = crouched;
      this.lliiIliiiliiIlii = sneak;
      this.IiiiIliiliiiIlii = hitClass;
   }

   public boolean IilliliilIIi() {
      return this.iIiiIliiIliiIlii;
   }

   public boolean lIiiIiIlilli() {
      return this.lliiIliiiliiIlii;
   }

   public long liiiIIllIl() {
      return this.liliIliiiiliIlii;
   }

   public long IliIlllilIi() {
      return this.illiIliiIiliIlii;
   }

   public int iliIiiliiiii() {
      return this.IiiiIliiliiiIlii;
   }
}
