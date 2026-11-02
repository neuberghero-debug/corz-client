package gg.corz;

record IIliilillIliilil(int shape, float cx, float cy, float halfW, float halfH, float radius, float angle, float inner, float arcHalf, float bboxHalf) {
   private final float lIIlllllil;
   private final float IIIlllllil;
   private final float lliIllllil;
   private final int IliIllllil;
   private final float iliIllllil;
   private final float IlIlllllil;
   private final float iIIlllllil;
   private final float IiiIllllil;
   private final float iiiIllllil;
   private final float liiIllllil;

   public float lIiiIiIlilli() {
      return this.liiIllllil;
   }

   public float liiiIIllIl() {
      return this.lliIllllil;
   }

   public int IliIlllilIi() {
      return this.IliIllllil;
   }

   private IIliilillIliilil(int shape, float cx, float cy, float halfW, float halfH, float radius, float angle, float inner, float arcHalf, float bboxHalf) {
      this.IliIllllil = shape;
      this.lliIllllil = cx;
      this.iliIllllil = cy;
      this.IiiIllllil = halfW;
      this.liiIllllil = halfH;
      this.iiiIllllil = radius;
      this.IIIlllllil = angle;
      this.lIIlllllil = inner;
      this.iIIlllllil = arcHalf;
      this.IlIlllllil = bboxHalf;
   }

   public float IilliliilIIi() {
      return this.IiiIllllil;
   }

   public float IIlllIlliIll() {
      return this.IlIlllllil;
   }

   public float IIIllIIliIIl() {
      return this.IIIlllllil;
   }

   public float IiIlliIliiIl() {
      return this.iIIlllllil;
   }

   public float iliIiiliiiii() {
      return this.iiiIllllil;
   }

   public float iIlIlllllill() {
      return this.iliIllllil;
   }

   public float IlIlllIlilIl() {
      return this.lIIlllllil;
   }
}
