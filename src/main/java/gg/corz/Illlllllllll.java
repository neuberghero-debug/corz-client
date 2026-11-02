package gg.corz;

public final class Illlllllllll {
   public float iIliiIIiIlliiIIi;
   public float lIiiiIIiiIiiiIIi;
   public float IiliiIIililiiIIi;
   public float IlIiiIIillIiiIIi;
   public float IIliiIIilIliiIIi = 1.0F;
   public float llliiIIiilliiIIi;
   public float ilIiiIIiIiIiiIIi;
   public float iiliiIIiIIiiiIIi;
   public float liIiiIIiiiIiiIIi;

   boolean iIlIlllllill() {
      return Float.isFinite(this.IlIiiIIillIiiIIi)
         && Float.isFinite(this.ilIiiIIiIiIiiIIi)
         && Float.isFinite(this.liIiiIIiiiIiiIIi)
         && Float.isFinite(this.IIliiIIilIliiIIi)
         && Float.isFinite(this.iIliiIIiIlliiIIi)
         && Float.isFinite(this.llliiIIiilliiIIi)
         && Float.isFinite(this.IiliiIIililiiIIi)
         && Float.isFinite(this.iiliiIIiIIiiiIIi)
         && Float.isFinite(this.lIiiiIIiiIiiiIIi);
   }

   public float liiiIIllIl() {
      return (float)Math.sqrt(
         (double)(this.IlIiiIIillIiiIIi * this.IlIiiIIillIiiIIi + this.ilIiiIIiIiIiiIIi * this.ilIiiIIiIiIiiIIi + this.liIiiIIiiiIiiIIi * this.liIiiIIiiiIiiIIi)
      );
   }

   public Illlllllllll IliIlllilIi(float framePitch) {
      this.IlIiiIIillIiiIIi = this.ilIiiIIiIiIiiIIi = this.liIiiIIiiiIiiIIi = 0.0F;
      this.llliiIIiilliiIIi = this.IiliiIIililiiIIi = this.iiliiIIiIIiiiIIi = 0.0F;
      this.lIiiiIIiiIiiiIIi = 0.0F;
      this.IIliiIIilIliiIIi = (float)Math.cos((double)framePitch);
      this.iIliiIIiIlliiIIi = (float)(-Math.sin((double)framePitch));
      return this;
   }
}
