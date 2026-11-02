package gg.corz;

public final class iiiIlIIIll {
   public boolean lilillliililll;
   public float lIilllliIillll;
   public boolean iiIilllIIlilll;
   public int lliillliliilll;
   public boolean Illillllllilll;
   public float ilillllIiillll;
   public boolean IIiillllIiilll;
   public float Ilillllllillll;
   public static final float iilllllIIillll = (float) Math.PI;
   public float llIilllilIilll;
   public boolean IiIilllliIilll;
   public boolean illilllIililll;
   public boolean lIlillliIlilll;
   public boolean iIiilllIliilll;
   public float iIIilllIlIilll;
   public float liilllliiillll;
   public float IIIillllIIilll;

   public float iliIiiliiiii() {
      return this.iIIilllIlIilll <= 0.0F ? 0.0F : (float)Math.sin((double)this.iIIilllIlIilll * Math.PI);
   }

   public float IlIlllIlilIl(float degreesPerTick) {
      return (float)Math.toRadians((double)((this.lIilllliIillll + (float)(this.lliillliliilll & 0xFF)) * degreesPerTick % 360.0F));
   }

   public iiiIlIIIll liiiIIllIl(iiiIlIIIll o) {
      this.lIilllliIillll = o.lIilllliIillll;
      this.Ilillllllillll = o.Ilillllllillll;
      this.ilillllIiillll = o.ilillllIiillll;
      this.liilllliiillll = o.liilllliiillll;
      this.IIIillllIIilll = o.IIIillllIIilll;
      this.iIIilllIlIilll = o.iIIilllIlIilll;
      this.llIilllilIilll = o.llIilllilIilll;
      this.IiIilllliIilll = o.IiIilllliIilll;
      this.iiIilllIIlilll = o.iiIilllIIlilll;
      this.lIlillliIlilll = o.lIlillliIlilll;
      this.Illillllllilll = o.Illillllllilll;
      this.illilllIililll = o.illilllIililll;
      this.lilillliililll = o.lilillliililll;
      this.IIiillllIiilll = o.IIiillllIiilll;
      this.iIiilllIliilll = o.iIiilllIliilll;
      this.lliillliliilll = o.lliillliliilll;
      return this;
   }

   public iiiIlIIIll IliIlllilIi() {
      this.lIilllliIillll = 0.0F;
      this.Ilillllllillll = 0.0F;
      this.ilillllIiillll = 0.0F;
      this.liilllliiillll = 0.0F;
      this.IIIillllIIilll = 0.0F;
      this.iIIilllIlIilll = 0.0F;
      this.llIilllilIilll = 0.0F;
      this.IiIilllliIilll = false;
      this.iiIilllIIlilll = false;
      this.lIlillliIlilll = false;
      this.Illillllllilll = false;
      this.illilllIililll = false;
      this.lilillliililll = false;
      this.IIiillllIiilll = false;
      this.iIiilllIliilll = false;
      this.lliillliliilll = 0;
      return this;
   }

   public float lIiiIiIlilli() {
      return this.iIIilllIlIilll <= 0.0F ? 0.0F : (float)Math.sin(Math.sqrt((double)this.iIIilllIlIilll) * Math.PI);
   }

   public float IilliliilIIi(float offset) {
      return Math.max(0.0F, (float)Math.sin((double)(this.Ilillllllillll * 0.6662F + offset))) * this.ilillllIiillll;
   }

   public float IIIllIIliIIl(float phase, float period) {
      return (float)Math.sin((double)((this.lIilllliIillll + (float)(this.lliillliliilll & 0xFF)) / phase * 2.0F) * Math.PI + (double)period);
   }

   public float iIlIlllllill(float offset) {
      return (float)Math.cos((double)(this.Ilillllllillll * 0.6662F + offset)) * this.ilillllIiillll;
   }
}
