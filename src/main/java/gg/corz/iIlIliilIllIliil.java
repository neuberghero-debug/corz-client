package gg.corz;

public final class iIlIliilIllIliil {
   public final int iIiilIilil;
   public final int IliilIilil;
   public final int IIiilIilil;
   public final int lIiilIilil;
   public final llIIliilIIli iililIilil;

   public float iIlIlllllill(float f) {
      f = f < 0.0F ? 0.0F : (f > 1.0F ? 1.0F : f);
      return ((float)this.lIiilIilil + 0.5F + f * (float)(this.IliilIilil - 1)) / (float)this.iililIilil.liIiilIIliiIiilIIl;
   }

   public ililiIilIiiliIil IliIlllilIi() {
      return new ililiIilIiiliIil(this);
   }

   public float liiiIIllIl(float f) {
      f = f < 0.0F ? 0.0F : (f > 1.0F ? 1.0F : f);
      return ((float)this.IIiilIilil + 0.5F + f * (float)(this.iIiilIilil - 1)) / (float)this.iililIilil.ilIiilIIlIiIiilIIl;
   }

   iIlIliilIllIliil(llIIliilIIli w, int y, int atlas, int x, int h) {
      this.iililIilil = w;
      this.IIiilIilil = y;
      this.lIiilIilil = atlas;
      this.iIiilIilil = x;
      this.IliilIilil = h;
   }
}
