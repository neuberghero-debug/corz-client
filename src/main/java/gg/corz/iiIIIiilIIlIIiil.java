package gg.corz;

record iiIIIiilIIlIIiil(float time, float[] pre, float[] post, boolean spline) {
   private final float[] lIiiIillil;
   private final float IIiiIillil;
   private final boolean IliiIillil;
   private final float[] iIiiIillil;

   public float IliIlllilIi() {
      return this.IIiiIillil;
   }

   public float[] iIlIlllllill() {
      return this.iIiiIillil;
   }

   private iiIIIiilIIlIIiil(float time, float[] pre, float[] post, boolean spline) {
      this.IIiiIillil = time;
      this.lIiiIillil = pre;
      this.iIiiIillil = post;
      this.IliiIillil = spline;
   }

   public float[] liiiIIllIl() {
      return this.lIiiIillil;
   }

   public boolean IilliliilIIi() {
      return this.IliiIillil;
   }
}
