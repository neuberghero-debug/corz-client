package gg.corz;

public final class llIiIliilIiIli {
   public boolean llliIlIIIl;
   public float IiIiIlIIIl;
   public float lIliIlIIIl;
   public float iiIiIlIIIl;
   public final float IlIiIlIIIl;
   public int illiIlIIIl;
   public float IIliIlIIIl;
   public final float iIIiIlIIIl;
   public float iIliIlIIIl;
   public String llIiIlIIIl = "";
   public float liIiIlIIIl;
   public boolean IlliIlIIIl;
   public final String lIIiIlIIIl;
   public float ilIiIlIIIl;

   public void iIlIlllllill() {
      this.IlliIlIIIl = true;
      this.iIliIlIIIl = 0.0F;
   }

   public void liiiIIllIl() {
      this.IlliIlIIIl = false;
      this.iIliIlIIIl = 1.0F;
   }

   public float IilliliilIIi() {
      return this.IlIiIlIIIl * this.lIliIlIIIl;
   }

   public llIiIliilIiIli(String name, float nameW, float rowH) {
      this.iIliIlIIIl = 1.0F;
      this.illiIlIIIl = -(--2089675105 ^ 39) ^ 57808570;
      this.lIIiIlIIIl = name;
      this.iIIiIlIIIl = nameW;
      this.IlIiIlIIIl = rowH;
      this.liIiIlIIIl = (float)Math.ceil((double)nameW);
   }

   public void lIiiIiIlilli(float newY) {
      if (this.llliIlIIIl) {
         this.IIliIlIIIl = this.IIliIlIIIl + (this.iiIiIlIIIl - newY);
      }
   }

   public void IliIlllilIi(String labelW, float label) {
      this.llIiIlIIIl = labelW == null ? "" : labelW;
      this.ilIiIlIIIl = label;
      this.IiIiIlIIIl = this.llIiIlIIIl.isEmpty() ? 0.0F : llliIlIlilliIlIl.lilIliilIl(label);
      this.liIiIlIIIl = (float)Math.ceil((double)(this.iIIiIlIIIl + (this.IiIiIlIIIl > 0.0F ? 10.0F + this.IiIiIlIIIl : 0.0F)));
   }

   public boolean iliIiiliiiii(float tgtY, float k) {
      this.lIliIlIIIl = this.lIliIlIIIl + (this.iIliIlIIIl - this.lIliIlIIIl) * k;
      if (Math.abs(this.iIliIlIIIl - this.lIliIlIIIl) < 0.002F) {
         this.lIliIlIIIl = this.iIliIlIIIl;
      }

      if (this.IlliIlIIIl && this.lIliIlIIIl < 0.01F) {
         return true;
      } else {
         this.iiIiIlIIIl = tgtY;
         if (!this.llliIlIIIl) {
            this.llliIlIIIl = true;
            return false;
         } else {
            this.IIliIlIIIl *= 1.0F - k;
            if (Math.abs(this.IIliIlIIIl) < 0.01F) {
               this.IIliIlIIIl = 0.0F;
            }

            return false;
         }
      }
   }
}
