package gg.corz;

public class iIiliiIlilii {
   public float lIiiiilIliIiiiilIl;
   public float liiiiilIliiiiiilIl;
   public float IliiiilIllliiiilIl;
   public boolean IIIIIIiIllIIIIIiIl;
   public float iliiiilIlIiiiiilIl;

   public void IliIlllilIi(float y) {
      this.lIiiiilIliIiiiilIl = y;
      this.IliiiilIllliiiilIl = y;
   }

   public boolean IilliliilIIi(float k) {
      this.lIiiiilIliIiiiilIl = this.lIiiiilIliIiiiilIl + (this.IliiiilIllliiiilIl - this.lIiiiilIliIiiiilIl) * k;
      if (Math.abs(this.IliiiilIllliiiilIl - this.lIiiiilIliIiiiilIl) < 0.01F) {
         this.lIiiiilIliIiiiilIl = this.IliiiilIllliiiilIl;
      }

      this.iliiiilIlIiiiiilIl = this.iliiiilIlIiiiiilIl + (this.liiiiilIliiiiiilIl - this.iliiiilIlIiiiiilIl) * k;
      if (Math.abs(this.liiiiilIliiiiiilIl - this.iliiiilIlIiiiiilIl) < 0.002F) {
         this.iliiiilIlIiiiiilIl = this.liiiiilIliiiiiilIl;
      }

      return this.IIIIIIiIllIIIIIiIl && this.iliiiilIlIiiiiilIl < 0.01F;
   }

   public void iIlIlllllill() {
      this.IIIIIIiIllIIIIIiIl = true;
      this.liiiiilIliiiiiilIl = 0.0F;
   }

   public void liiiIIllIl() {
      this.IIIIIIiIllIIIIIiIl = false;
      this.liiiiilIliiiiiilIl = 1.0F;
   }
}
