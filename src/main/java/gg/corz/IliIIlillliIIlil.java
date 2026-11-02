package gg.corz;

record IliIIlillliIIlil(float x, float y, float w, float h, Runnable act, iIliililIlliilil anims, String press) {
   private final String lliiiilIil;
   private final iIliililIlliilil IliiiilIil;
   private final Runnable iIiiiilIil;
   private final float IIiiiilIil;
   private final float lIiiiilIil;
   private final float liliiilIil;
   private final float iiliiilIil;

   public float iIlIlllllill() {
      return this.IIiiiilIil;
   }

   public float liiiIIllIl() {
      return this.iiliiilIil;
   }

   public iIliililIlliilil iliIiiliiiii() {
      return this.IliiiilIil;
   }

   public float IliIlllilIi() {
      return this.liliiilIil;
   }

   public Runnable lIiiIiIlilli() {
      return this.iIiiiilIil;
   }

   public float IilliliilIIi() {
      return this.lIiiiilIil;
   }

   public String IIIllIIliIIl() {
      return this.lliiiilIil;
   }

   private IliIIlillliIIlil(float x, float y, float w, float h, Runnable act, iIliililIlliilil anims, String press) {
      this.liliiilIil = x;
      this.iiliiilIil = y;
      this.IIiiiilIil = w;
      this.lIiiiilIil = h;
      this.iIiiiilIil = act;
      this.IliiiilIil = anims;
      this.lliiiilIil = press;
   }
}
